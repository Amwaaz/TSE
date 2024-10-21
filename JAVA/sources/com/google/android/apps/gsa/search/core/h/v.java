package com.google.android.apps.gsa.search.core.h;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.ac.ae;
import com.google.android.apps.gsa.search.core.ac.af;
import com.google.android.apps.gsa.search.core.preferences.j;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.o.a.a;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/v.class */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ae f1128a;
    public final n b;
    private final Object c = new Object();
    private final Context d;
    private final j e;
    private ArrayList f;
    private n g;

    public v(Context context, j jVar, af afVar, Optional optional) {
        optional.isPresent();
        this.d = context;
        this.e = jVar;
        a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        this.b = jVar.a(new File(context.getDir("shared_prefs", 0), "StartupSettings.bin"));
        this.f1128a = afVar.a();
    }

    public static final boolean c(String str) {
        return "SearchSettings".equals(str);
    }

    public final void a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.c) {
            this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            n nVar = this.g;
            if (nVar != null) {
                nVar.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } else {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                this.f.add(onSharedPreferenceChangeListener);
            }
        }
    }

    public final void b(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.c) {
            this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            n nVar = this.g;
            if (nVar != null) {
                nVar.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } else {
                ArrayList arrayList = this.f;
                if (arrayList != null) {
                    arrayList.remove(onSharedPreferenceChangeListener);
                }
            }
        }
    }

    public final n d() {
        n nVar;
        synchronized (this.c) {
            if (this.g == null) {
                Context context = this.d;
                a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                this.g = this.e.a(new File(context.getDir("shared_prefs", 0), a.a.dW("SearchSettings", ".bin")));
                ArrayList arrayList = this.f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        this.g.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) arrayList.get(i));
                    }
                    this.f = null;
                }
            }
            nVar = this.g;
        }
        return nVar;
    }
}
