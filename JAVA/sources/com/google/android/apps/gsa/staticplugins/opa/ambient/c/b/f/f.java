package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.f;

import com.google.android.apps.gsa.opa.smartspace.p;
import com.google.android.apps.gsa.s.a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.util.concurrent.cq;
import com.google.g.y.t;
import com.google.protos.o.b.v;
import j$.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/f/f.class */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final fu f1752a;
    public static final fu b;
    public final cq c;
    public final p d;
    public final e e;
    private final fu f;

    static {
        fq fqVar = new fq(4);
        fqVar.i(t.b, "HP_SHOPPING_LOCATION_PROFILE");
        fqVar.i(t.c, "HP_TRANSIT_STATION_PROFILE");
        fqVar.i(t.d, "HP_RESTAURANT_PROFILE");
        fqVar.i(t.g, "HP_GAS_STATION_PROFILE");
        fqVar.i(t.h, "HP_PARKING_PROFILE");
        fqVar.i(t.i, "HP_CAFE_PROFILE");
        fqVar.i(t.j, "HP_SHOPPING_CENTER_PROFILE");
        fqVar.i(t.e, "HP_HOME");
        fqVar.i(t.f, "HP_WORK");
        f1752a = fqVar.h(false);
        fq fqVar2 = new fq(4);
        fqVar2.i(t.b, a.SMARTSPACE_HABITS_LOCATION_STORE_PROFILE_PRESENT);
        fqVar2.i(t.c, a.SMARTSPACE_HABITS_LOCATION_TRANSIT_STATION_PROFILE_PRESENT);
        fqVar2.i(t.d, a.SMARTSPACE_HABITS_LOCATION_RESTAURANT_PROFILE_PRESENT);
        fqVar2.i(t.g, a.SMARTSPACE_HABITS_LOCATION_GAS_STATION_PROFILE_PRESENT);
        fqVar2.i(t.h, a.SMARTSPACE_HABITS_LOCATION_PARKING_PROFILE_PRESENT);
        fqVar2.i(t.i, a.SMARTSPACE_HABITS_LOCATION_CAFE_PROFILE_PRESENT);
        fqVar2.i(t.j, a.SMARTSPACE_HABITS_LOCATION_SHOPPING_CENTER_PROFILE_PRESENT);
        b = fqVar2.h(false);
    }

    public f(e eVar, cq cqVar, p pVar) {
        this.e = eVar;
        this.c = cqVar;
        this.d = pVar;
        fq fqVar = new fq(4);
        fqVar.i(t.b, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.c, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.d, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.g, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.h, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.i, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.j, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.e, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        fqVar.i(t.f, new com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.a());
        this.f = fqVar.h(false);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g.c
    public final void b(v vVar) {
        if (vVar == v.ar) {
            Map._EL.forEach(this.f, new e(this));
        }
    }
}
