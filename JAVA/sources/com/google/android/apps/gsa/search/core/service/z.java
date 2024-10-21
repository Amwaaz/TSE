package com.google.android.apps.gsa.search.core.service;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.service.a.a;
import com.google.android.apps.gsa.search.core.state.ah;
import com.google.android.apps.gsa.search.core.state.d.ag;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.search.core.state.d.r;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/z.class */
public final /* synthetic */ class z implements f {

    /* renamed from: a, reason: collision with root package name */
    public final af f1225a;
    private final int b;

    public /* synthetic */ z(af afVar, int i) {
        this.b = i;
        this.f1225a = afVar;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        int i = this.b;
        if (i == 0) {
            SharedPreferences sharedPreferences = this.f1225a.c.getSharedPreferences("consecutive_crash_stats", 4);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!sharedPreferences.getBoolean("gsa_crashed_last_time", false)) {
                edit.putInt("consecutive_crash_count", 0);
            }
            edit.putBoolean("gsa_crashed_last_time", false);
            edit.apply();
            return;
        }
        if (i != 1) {
            af afVar = this.f1225a;
            if (afVar.w) {
                return;
            }
            com.google.android.apps.gsa.search.core.state.d.x xVar = (com.google.android.apps.gsa.search.core.state.d.x) afVar.m.a();
            int i2 = afVar.v;
            if (xVar.f1297a != i2) {
                xVar.f1297a = i2;
                xVar.an();
                return;
            }
            return;
        }
        af afVar2 = this.f1225a;
        x xVar2 = (x) afVar2.i.a();
        r rVar = xVar2.b;
        ah ahVar = xVar2.c;
        i.c(a.class);
        if (!rVar.d.c(ahVar)) {
            rVar.d.b(ahVar);
        }
        xVar2.b.m(xVar2);
        ai aiVar = (ai) afVar2.k.a();
        ag agVar = (ag) aiVar.c.a();
        agVar.c((ai) agVar.f1277a.a());
        aiVar.l();
        ((ao) afVar2.l.a()).a();
    }
}
