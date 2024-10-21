package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.b.v;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.v.a.aa;
import com.google.android.apps.gsa.nga.shared.android.a.c;
import com.google.android.apps.gsa.nga.shared.android.a.f;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.logging.k;
import com.google.common.o.co;
import com.google.common.o.ew;
import com.google.common.o.o.bd;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/w.class */
public final class w implements com.google.android.apps.gsa.nga.engine.education.pie.d.b, be {
    private static final com.google.common.f.a.d c = com.google.common.f.a.d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Context f607a;
    public final com.google.android.apps.gsa.nga.shared.p.b b;
    private final f d;
    private final com.google.android.apps.gsa.nga.engine.education.pie.d e;
    private final com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.b f;
    private final a g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final com.google.android.libraries.logging.j i;
    private final com.google.android.libraries.logging.j j;
    private final k k;
    private Optional l;
    private final com.google.android.apps.gsa.nga.engine.education.pie.b.j m;
    private final v n;
    private final y o;
    private final aa p;

    public w(Context context, f fVar, com.google.android.apps.gsa.nga.engine.education.pie.b.j jVar, v vVar, y yVar, com.google.android.apps.gsa.nga.shared.p.b bVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.b bVar2, a aVar, aa aaVar) {
        com.google.android.libraries.logging.j jVar2 = new com.google.android.libraries.logging.j(94154);
        jVar2.h(bd.v);
        jVar2.h(bd.e);
        this.i = jVar2;
        com.google.android.libraries.logging.j jVar3 = new com.google.android.libraries.logging.j(94155);
        jVar3.h(bd.e);
        this.j = jVar3;
        this.k = k.e(jVar2, k.e(jVar3, new k[0]));
        this.l = Optional.empty();
        this.f607a = context;
        this.d = fVar;
        this.m = jVar;
        this.n = vVar;
        this.o = yVar;
        this.b = bVar;
        this.e = dVar;
        this.f = bVar2;
        this.g = aVar;
        this.p = aaVar;
    }

    private final void f() {
        this.h.set(false);
        this.d.a(com.google.android.apps.gsa.shared.y.a.NGA_PIE_TRIGGER);
    }

    private final void g(ew ewVar) {
        if (ewVar != null) {
            this.p.p(ewVar, Optional.empty());
        }
    }

    private final void h() {
        Object obj = this.l.get();
        if (!this.d.b(c.b)) {
            com.google.android.apps.gsa.nga.shared.i.a.f fVar = (com.google.android.apps.gsa.nga.shared.i.a.f) obj;
            Bundle bundle = fVar.a;
            com.google.android.apps.gsa.nga.shared.i.a.j d = com.google.android.apps.gsa.nga.shared.i.a.k.d();
            d.c(g.a(bundle));
            d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.NOTIFICATIONS_DISABLED);
            d.d(fVar.i);
            throw d.a();
        }
        com.google.android.apps.gsa.nga.shared.i.a.f fVar2 = (com.google.android.apps.gsa.nga.shared.i.a.f) obj;
        if (!fVar2.f && this.h.getAndSet(true)) {
            Bundle bundle2 = fVar2.a;
            com.google.android.apps.gsa.nga.shared.i.a.j d2 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
            d2.c(g.a(bundle2));
            d2.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_ALREADY_DISPLAYED);
            d2.d(fVar2.i);
            throw d2.a();
        }
        Locale locale = this.o.c().d;
        if (!fVar2.f && !this.d.c(com.google.android.apps.gsa.shared.y.a.NGA_PIE_TRIGGER, c.b, new v(this, locale, fVar2))) {
            Bundle bundle3 = fVar2.a;
            com.google.android.apps.gsa.nga.shared.i.a.j d3 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
            d3.c(g.a(bundle3));
            d3.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_DISPLAY_FAILED);
            d3.d(fVar2.i);
            throw d3.a();
        }
        this.i.i(true != fVar2.f ? 1 : 3);
        ba createBuilder = co.a.createBuilder();
        l a2 = g.a(fVar2.a);
        createBuilder.copyOnWrite();
        co coVar = createBuilder.instance;
        coVar.d = a2.g;
        coVar.c = 1 | coVar.c;
        at b = g.b(fVar2.a);
        createBuilder.copyOnWrite();
        co coVar2 = createBuilder.instance;
        coVar2.e = b.g;
        coVar2.c |= 2;
        fVar2.g.ifPresent(new o(createBuilder, 2));
        this.i.f.w(co.b, createBuilder.build());
        aa aaVar = this.p;
        ew c2 = com.google.android.libraries.logging.c.c(this.k, 94154);
        c2.getClass();
        aaVar.p(c2, Optional.empty());
        if (fVar2.f) {
            this.l = Optional.empty();
            Bundle bundle4 = fVar2.a;
            com.google.android.apps.gsa.nga.shared.i.a.j d4 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
            d4.c(g.a(bundle4));
            d4.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_USER_IS_COUNTERFACTUAL);
            d4.d(fVar2.i);
            throw d4.a();
        }
    }

    private final void i() {
        if (((i) this.m.d).b.get() == com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBLE && this.l.isPresent()) {
            try {
                h();
                return;
            } catch (com.google.android.apps.gsa.nga.shared.i.a.k e) {
                this.e.b(e, false);
            }
        }
        f();
    }

    private final boolean j() {
        return this.g.i(eu.fZ);
    }

    private final com.google.android.apps.gsa.nga.engine.education.pie.f k(at atVar, Optional optional, int i) {
        Locale locale = this.o.c().d;
        com.google.android.apps.gsa.nga.engine.education.pie.e a2 = com.google.android.apps.gsa.nga.engine.education.pie.f.a(i);
        a2.b(atVar);
        a2.a = Optional.of((String) optional.map(new u(this, locale, 1)).orElse("UNKNOWN"));
        a2.b = Optional.of((String) optional.map(new u(this, locale, 0)).orElse("UNKNOWN"));
        return a2.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.m.d.d(this);
        this.f.f603a.set(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Intent intent) {
        boolean z;
        synchronized (this) {
            com.google.android.apps.gsa.d.e.i(102);
            intent.getAction();
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            l a2 = g.a(extras);
            at b = g.b(extras);
            try {
            } catch (com.google.android.apps.gsa.nga.shared.i.a.k e) {
                this.e.b(e, true);
            }
            if (action == null || extras == null) {
                com.google.android.apps.gsa.nga.shared.i.a.j d = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d.c(a2);
                d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_INVALID_DATA);
                throw d.a();
            }
            int hashCode = action.hashCode();
            if (hashCode == 18427832) {
                if (action.equals("com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_DISMISSED")) {
                    z = false;
                }
                z = -1;
            } else if (hashCode != 494642787) {
                if (hashCode == 991373757 && action.equals("com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_TAPPED")) {
                    z = true;
                }
                z = -1;
            } else {
                if (action.equals("com.google.android.apps.gsa.nga.engine.education.pie.triggering.notificationreceiver.PIE_NOTIFICATION_BUTTON")) {
                    z = 2;
                }
                z = -1;
            }
            if (!z) {
                g(com.google.android.libraries.logging.c.k(this.i, bd.v));
                com.google.android.apps.gsa.nga.shared.i.a.j d2 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d2.c(a2);
                d2.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_DISMISSED);
                throw d2.a();
            }
            if (z) {
                g(com.google.android.libraries.logging.c.k(this.i, bd.e));
                this.n.h(extras, k(b, this.l, 5));
            } else {
                if (z != 2) {
                    com.google.common.f.a.a e2 = c.e();
                    e2.ak(3102);
                    e2.s("Unknown action from intent: %s", intent.getAction());
                    com.google.android.apps.gsa.nga.shared.i.a.j d3 = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                    d3.c(a2);
                    d3.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_INVALID_DATA);
                    throw d3.a();
                }
                g(com.google.android.libraries.logging.c.k(this.j, bd.e));
                this.n.h(extras, k(b, this.l, 6));
            }
            this.l = Optional.empty();
            f();
        }
    }

    public final void d(com.google.android.apps.gsa.nga.shared.i.a.f fVar) {
        synchronized (this) {
            l a2 = g.a(fVar.a);
            if (this.l.isPresent()) {
                com.google.android.apps.gsa.nga.shared.i.a.j d = com.google.android.apps.gsa.nga.shared.i.a.k.d();
                d.c(a2);
                d.b(com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_ALREADY_ACTIVE);
                d.d(fVar.i);
                throw d.a();
            }
            this.l = Optional.of(fVar);
            if (j()) {
                i();
            } else {
                h();
            }
        }
    }

    public final void e() {
        synchronized (this) {
            if (j()) {
                i();
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.m.d.e(this);
        this.f.f603a.set(null);
    }

    @Override // com.google.android.apps.gsa.shared.util.c.be
    public final /* bridge */ /* synthetic */ void hf(Object obj) {
        e();
    }
}
