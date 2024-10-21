package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.ad.b;
import com.google.android.apps.gsa.shared.ad.c;
import com.google.common.b.oo;
import com.google.protobuf.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/preferences/i.class */
public final class i implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    final n f1139a;
    private final Object b = new Object();
    private Map c = new HashMap();
    private boolean d;

    public i(n nVar) {
        this.f1139a = nVar;
    }

    public final void a(String str, Object obj) {
        synchronized (this.b) {
            this.c.put(str, obj);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        b(false);
    }

    public final boolean b(boolean z) {
        HashSet hashSet;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        l lVar;
        boolean z4;
        synchronized (this.f1139a.e) {
            n nVar = this.f1139a;
            Map map = nVar.h;
            l lVar2 = nVar.k;
            Map map2 = map;
            if (lVar2 != null) {
                map2 = map;
                if (lVar2.b == map) {
                    map2 = new HashMap(map);
                }
            }
            synchronized (this.b) {
                if (this.d) {
                    oo.aL(this.c.values(), this.f1139a.g);
                    if (map2.isEmpty() && this.c.isEmpty() && this.f1139a.i) {
                        hashSet = null;
                        z2 = false;
                        this.d = false;
                    }
                    hashSet = new HashSet(this.c.keySet());
                    map2 = this.c;
                    this.c = new HashMap();
                    this.f1139a.i = true;
                    z2 = true;
                    this.d = false;
                } else {
                    hashSet = new HashSet();
                    for (Map.Entry entry : this.c.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        Object obj = map2.get(str);
                        n nVar2 = this.f1139a;
                        if (nVar2.i && value == nVar2.f) {
                            if (map2.containsKey(str)) {
                                map2.remove(str);
                                hashSet.add(str);
                            }
                        } else if (!map2.containsKey(str) || ((value == null && map2.get(str) != null) || (value != null && !value.equals(obj)))) {
                            map2.put(str, value);
                            hashSet.add(str);
                        }
                    }
                    this.c.clear();
                    z2 = !hashSet.isEmpty();
                }
            }
            arrayList = (hashSet == null || hashSet.isEmpty() || this.f1139a.j.isEmpty()) ? null : new ArrayList(this.f1139a.j);
            if (z2) {
                n nVar3 = this.f1139a;
                l lVar3 = nVar3.k;
                z3 = lVar3 == null;
                if (lVar3 == null || lVar3.b == nVar3.h) {
                    nVar3.k = new l();
                }
                this.f1139a.h = map2;
            } else {
                z3 = false;
            }
            lVar = z ? this.f1139a.k : null;
        }
        if (z3) {
            n nVar4 = this.f1139a;
            nVar4.d.execute(new m(nVar4));
        }
        if (arrayList != null) {
            this.f1139a.c(arrayList, hashSet);
        }
        if (lVar != null) {
            try {
                lVar.f1142a.await();
                z4 = lVar.c;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                z4 = false;
            }
        } else {
            z4 = true;
        }
        return z4;
    }

    public final void c(String str, byte[] bArr) {
        if (bArr == null) {
            h(str);
        } else {
            a(str, v.x(bArr, 0, bArr.length));
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.d = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return b(true);
    }

    public final void d(String str, int[] iArr) {
        if (iArr == null) {
            h(str);
        } else {
            a(str, com.google.common.r.k.r((int[]) iArr.clone()));
        }
    }

    public final void e(b bVar) {
        Object obj = this.b;
        Map b = c.b(bVar);
        synchronized (obj) {
            this.c.putAll(b);
        }
    }

    public final void f(String str, String str2) {
        if (str2 == null) {
            h(str);
        } else {
            a(str, str2);
        }
    }

    public final void g(String str, Set set) {
        if (set == null) {
            h(str);
        } else {
            a(str, new HashSet(set));
        }
    }

    public final void h(String str) {
        a(str, this.f1139a.f);
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        f(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        g(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        h(str);
        return this;
    }
}
