package com.google.android.apps.gsa.search.core.ab;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.g.b.a;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.tasks.ar;
import com.google.android.apps.gsa.tasks.m;
import com.google.android.apps.gsa.tasks.s;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.o.hb;
import com.google.protobuf.ba;
import com.google.protobuf.bc;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ab/c.class */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1047a = j.i("com.google.android.apps.gsa.search.core.ab.c");
    private final int b;
    private final SharedPreferences c;
    private final e.a d;

    public c(int i, SharedPreferences sharedPreferences, e.a aVar) {
        this.b = i;
        this.c = sharedPreferences;
        this.d = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, com.google.android.libraries.search.b.b] */
    public final void a() {
        int i;
        int i2;
        synchronized (c.class) {
            try {
                try {
                    i = this.c.getInt("last_run_version", -1);
                } catch (ClassCastException e) {
                    Object obj = this.c.getAll().get("last_run_version");
                    obj.getClass();
                    h g = f1047a.f().g(e);
                    g.ak(8108);
                    g.N("Unexpected type of %s startup preference, expected int, actual %s with value %s", "last_run_version", obj.getClass().getName(), obj);
                    this.c.edit().remove("last_run_version").apply();
                    i = -1;
                }
                if (i != this.b) {
                    this.c.edit().putInt("last_run_version", this.b).apply();
                    h d = f1047a.d();
                    d.ak(8107);
                    d.w("Velvet upgraded from %d to %d: running upgrade tasks.", i, this.b);
                    b bVar = (b) this.d.a();
                    synchronized (b.class) {
                        try {
                            m mVar = bVar.i;
                            ar arVar = ar.FETCH_OPT_IN_STATUSES;
                            ba createBuilder = s.a.createBuilder();
                            createBuilder.copyOnWrite();
                            s sVar = createBuilder.instance;
                            sVar.e = 1;
                            sVar.b |= 4;
                            mVar.f(arVar, (s) createBuilder.build());
                            bVar.e.a(0L);
                            bVar.i.c(ar.SEND_GSA_HOME_REQUEST);
                            bVar.c.b();
                            ((com.google.android.apps.gsa.tasks.c) bVar.d.a()).a(ar.REFRESH_AUTH_TOKENS);
                            ((com.google.android.apps.gsa.shared.logger.b.h) bVar.g.a()).b(w.SILENT_ENROLLMENT_START_APP_UPGRADE);
                            bVar.i.f(ar.SPEAKERID_SILENT_ENROLLMENT, s.a);
                            bVar.h.a.a(com.google.android.libraries.search.b.a.j.a.c);
                            ((com.google.android.apps.gsa.hotword.b.j) bVar.f.a).a(true);
                            SharedPreferences.Editor edit = ((SharedPreferences) bVar.b.a()).edit();
                            Object systemService = bVar.a.getSystemService("activity");
                            if (systemService instanceof ActivityManager) {
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                                long j = memoryInfo.totalMem / 1048576;
                                i2 = -1;
                                if (j > 0) {
                                    i2 = j > 2147483647L ? -1 : (int) j;
                                }
                            } else {
                                i2 = -1;
                            }
                            edit.putInt("ram_mb", i2).apply();
                            bVar.j.d(new a(bVar));
                        } finally {
                        }
                    }
                    bc createBuilder2 = hb.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    hb hbVar = createBuilder2.instance;
                    hbVar.b |= 2;
                    hbVar.n = 927;
                    createBuilder2.copyOnWrite();
                    hb hbVar2 = createBuilder2.instance;
                    hbVar2.h |= 33554432;
                    hbVar2.aM = i;
                    int i3 = this.b;
                    createBuilder2.copyOnWrite();
                    hb hbVar3 = createBuilder2.instance;
                    hbVar3.h |= 67108864;
                    hbVar3.aN = i3;
                    k.g(createBuilder2.build(), null, null, null);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.apps.gsa.search.core.g.b.a
    public final void b(boolean z, boolean z2) {
        if (z || z2) {
            a();
        }
    }
}
