package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.shared.ad.b;
import com.google.android.apps.gsa.shared.ad.c;
import com.google.common.base.aw;
import com.google.common.base.cl;
import com.google.common.l.x;
import com.google.protobuf.v;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/preferences/n.class */
public class n implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1144a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.preferences.n");
    public final File b;
    public final File c;
    public final Executor d;
    public final Object e;
    public final Object f;
    public final aw g;
    public Map h;
    public boolean i;
    public final Set j;
    public l k;
    private final Executor l;
    private final AtomicInteger m;

    public n(Executor executor, Executor executor2, File file) {
        Object obj = new Object();
        this.e = obj;
        this.f = obj;
        this.m = new AtomicInteger(0);
        this.g = new h(this);
        this.l = executor;
        this.d = executor2;
        this.b = file;
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
        this.j = new HashSet();
        this.h = new HashMap();
        this.k = new l();
    }

    private final void g() {
        this.m.incrementAndGet();
        cl.u(!this.i);
        boolean z = false;
        while (!this.i) {
            try {
                this.e.wait();
            } catch (InterruptedException e) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final b a(String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            Object b = b(str);
            if (b != null) {
                hashMap.put(str, b);
            }
        }
        return c.a(hashMap);
    }

    public final Object b(String str) {
        synchronized (this.e) {
            if (this.i) {
                return this.h.get(str);
            }
            if (!this.h.containsKey(str)) {
                g();
                return this.h.get(str);
            }
            Object obj = this.h.get(str);
            Object obj2 = obj;
            if (obj == this.f) {
                obj2 = null;
            }
            return obj2;
        }
    }

    public final void c(final Collection collection, final Set set) {
        f.e(!collection.isEmpty());
        f.e(!set.isEmpty());
        if (!com.google.android.libraries.gsa.h.i.d(androidx.annotation.b.class)) {
            this.l.execute(new Runnable(this, collection, set) { // from class: com.google.android.apps.gsa.search.core.preferences.g

                /* renamed from: a, reason: collision with root package name */
                public final n f1137a;
                public final Collection b;
                public final Set c;

                {
                    this.f1137a = this;
                    this.b = collection;
                    this.c = set;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1137a.c(this.b, this.c);
                }
            });
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return b(str) != null;
    }

    public final void d() {
        l lVar;
        Map map;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        l lVar2 = null;
        Map map2 = null;
        while (true) {
            Map map3 = map2;
            boolean z = false;
            while (true) {
                synchronized (this.e) {
                    if (lVar2 != null) {
                        f.e(lVar2.b == map3);
                        lVar2.b = null;
                        lVar2.c = z;
                        lVar2.f1142a.countDown();
                        if (lVar2 == this.k) {
                            this.k = null;
                            return;
                        }
                    }
                    l lVar3 = this.k;
                    lVar3.getClass();
                    f.e(lVar3.b == null);
                    lVar = this.k;
                    map = this.h;
                    lVar.b = map;
                }
                if (this.b.exists()) {
                    if (!this.c.exists()) {
                        if (!this.b.renameTo(this.c)) {
                            com.google.common.f.h e = f1144a.e();
                            e.ak(7203);
                            e.s("Failed to rename to backup file %s", this.c);
                            lVar2 = lVar;
                            map2 = map;
                            break;
                        }
                    } else {
                        this.b.delete();
                    }
                    b a2 = c.a(map);
                    try {
                        fileOutputStream2 = new FileOutputStream(this.b);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileOutputStream2 = null;
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream2 = null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                    try {
                        try {
                            a2.writeTo(fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.getFD().sync();
                            fileOutputStream2.close();
                            this.c.delete();
                            x.a(fileOutputStream2);
                            z = true;
                            lVar2 = lVar;
                            map3 = map;
                        } catch (FileNotFoundException e4) {
                            e = e4;
                            com.google.common.f.h g = f1144a.e().g(e);
                            FileOutputStream fileOutputStream3 = fileOutputStream2;
                            g.ak(7200);
                            FileOutputStream fileOutputStream4 = fileOutputStream2;
                            g.p("exception while writing to file");
                            x.a(fileOutputStream2);
                            lVar2 = lVar;
                            map2 = map;
                        } catch (IOException e5) {
                            e = e5;
                            com.google.common.f.h g2 = f1144a.e().g(e);
                            FileOutputStream fileOutputStream5 = fileOutputStream2;
                            g2.ak(7201);
                            FileOutputStream fileOutputStream6 = fileOutputStream2;
                            g2.p("exception while writing to file");
                            x.a(fileOutputStream2);
                            lVar2 = lVar;
                            map2 = map;
                        }
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream2;
                        th = th2;
                        x.a(fileOutputStream);
                        throw th;
                    }
                } else {
                    File parentFile = this.b.getParentFile();
                    parentFile.getClass();
                    if (!parentFile.exists() && !parentFile.mkdir()) {
                        com.google.common.f.h e6 = f1144a.e();
                        e6.ak(7202);
                        e6.s("Failed to create shared preferences directory %s", parentFile);
                        lVar2 = lVar;
                        map2 = map;
                        break;
                    }
                    b a22 = c.a(map);
                    fileOutputStream2 = new FileOutputStream(this.b);
                    a22.writeTo(fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.getFD().sync();
                    fileOutputStream2.close();
                    this.c.delete();
                    x.a(fileOutputStream2);
                    z = true;
                    lVar2 = lVar;
                    map3 = map;
                }
            }
        }
    }

    public final byte[] e(String str, byte[] bArr) {
        Object b = b(str);
        return b != null ? ((v) b).E() : bArr;
    }

    @Override // android.content.SharedPreferences
    public final /* synthetic */ SharedPreferences.Editor edit() {
        return new i(this);
    }

    public final /* synthetic */ i f() {
        return new i(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map unmodifiableMap;
        synchronized (this.e) {
            if (!this.i) {
                g();
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap(this.h));
        }
        return unmodifiableMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object b = b(str);
        return b != null ? ((Boolean) b).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object b = b(str);
        return b != null ? ((Float) b).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object b = b(str);
        return b != null ? ((Integer) b).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object b = b(str);
        return b != null ? ((Long) b).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object b = b(str);
        return b != null ? (String) b : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object b = b(str);
        return b != null ? DesugarCollections.unmodifiableSet((Set) b) : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.e) {
            this.j.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.e) {
            this.j.remove(onSharedPreferenceChangeListener);
        }
    }
}
