package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.education.pie.b.ak;
import com.google.android.apps.gsa.nga.shared.i.a.f;
import com.google.android.apps.gsa.nga.shared.i.a.g;
import com.google.android.apps.gsa.nga.shared.i.a.k;
import com.google.android.apps.gsa.nga.shared.u.d.a.y;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.au.a.a.c;
import com.google.au.a.a.l;
import com.google.common.b.ey;
import com.google.common.b.fl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.dl;
import com.google.g.e.i.lp;
import com.google.g.e.i.lq;
import com.google.g.e.i.lr;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/t.class */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f606a = com.google.common.f.a.d.j();
    private final Context b;
    private final w c;
    private final z d;
    private final com.google.android.apps.gsa.nga.engine.education.pie.d e;
    private final com.google.android.apps.gsa.search.core.ac.t f;
    private final com.google.android.apps.gsa.nga.shared.i.a.b.d g;
    private final a h;
    private f i = null;
    private final com.google.android.apps.gsa.nga.engine.education.pie.b.j j;

    public t(Context context, w wVar, z zVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, com.google.android.apps.gsa.search.core.ac.t tVar, com.google.android.apps.gsa.nga.shared.i.a.b.d dVar2, a aVar, com.google.android.apps.gsa.nga.engine.education.pie.b.j jVar) {
        this.b = context;
        this.c = wVar;
        this.d = zVar;
        this.e = dVar;
        this.f = tVar;
        this.g = dVar2;
        this.h = aVar;
        this.j = jVar;
    }

    private final void b(f fVar) {
        if (!fVar.h) {
            this.g.a(g.a(fVar.a), fVar.i, fVar.f, this.j);
        }
        if (!this.h.i(eu.kU)) {
            this.c.d(fVar);
            return;
        }
        z zVar = this.d;
        Locale locale = zVar.g.c().d;
        c createBuilder = l.a.createBuilder();
        int i = fVar.b;
        fl flVar = fVar.c;
        String string = zVar.c.a(locale).getString(i, flVar.toArray(ey.c));
        createBuilder.copyOnWrite();
        l lVar = createBuilder.instance;
        string.getClass();
        lVar.c = 1;
        lVar.d = string;
        int i2 = fVar.d;
        fl flVar2 = fVar.e;
        String string2 = zVar.c.a(locale).getString(i2, flVar2.toArray(ey.c));
        createBuilder.copyOnWrite();
        l lVar2 = createBuilder.instance;
        string2.getClass();
        lVar2.e = 7;
        lVar2.f = string2;
        ba createBuilder2 = com.google.au.a.a.d.a.createBuilder();
        String string3 = zVar.c.a(locale).getString(2132093047, new Object[0]);
        createBuilder2.copyOnWrite();
        com.google.au.a.a.d dVar = createBuilder2.instance;
        string3.getClass();
        dVar.c = 1;
        dVar.d = string3;
        com.google.au.a.a.a c = z.c("NGA_PIE.notification_button", fVar.a);
        createBuilder2.copyOnWrite();
        com.google.au.a.a.d dVar2 = createBuilder2.instance;
        c.getClass();
        dVar2.f = c;
        dVar2.b |= 1;
        createBuilder.s(createBuilder2);
        com.google.au.a.a.a c2 = z.c("NGA_PIE.notification_tap", fVar.a);
        createBuilder.copyOnWrite();
        l lVar3 = createBuilder.instance;
        c2.getClass();
        lVar3.i = c2;
        lVar3.b |= 1;
        l build = createBuilder.build();
        ba createBuilder3 = lr.a.createBuilder();
        createBuilder3.copyOnWrite();
        lr lrVar = createBuilder3.instance;
        build.getClass();
        lrVar.g = build;
        lrVar.c |= 2;
        createBuilder3.copyOnWrite();
        lr lrVar2 = createBuilder3.instance;
        lrVar2.c |= 8;
        lrVar2.i = 3;
        createBuilder3.copyOnWrite();
        lr lrVar3 = createBuilder3.instance;
        lrVar3.f = 1;
        lrVar3.c |= 1;
        createBuilder3.copyOnWrite();
        lr lrVar4 = createBuilder3.instance;
        lrVar4.h = 2;
        lrVar4.c |= 4;
        lr build2 = createBuilder3.build();
        bc createBuilder4 = lq.a.createBuilder();
        createBuilder4.copyOnWrite();
        lq lqVar = createBuilder4.instance;
        lqVar.c = 1;
        lqVar.b |= 1;
        createBuilder4.copyOnWrite();
        lq lqVar2 = createBuilder4.instance;
        lqVar2.b |= 256;
        lqVar2.i = "NGA_PIE_GROUP";
        long c3 = zVar.d.c() / 1000;
        createBuilder4.copyOnWrite();
        lq lqVar3 = createBuilder4.instance;
        lqVar3.b |= 65536;
        lqVar3.q = c3;
        boolean z = fVar.f;
        createBuilder4.copyOnWrite();
        lq lqVar4 = createBuilder4.instance;
        lqVar4.b |= 16384;
        lqVar4.p = z;
        createBuilder4.w(lr.b, build2);
        ba createBuilder5 = lp.a.createBuilder();
        createBuilder5.copyOnWrite();
        lp lpVar = createBuilder5.instance;
        lpVar.b = 1 | lpVar.b;
        lpVar.c = 98;
        int f = com.google.protos.e.w.h.f(268);
        createBuilder5.copyOnWrite();
        lp lpVar2 = createBuilder5.instance;
        lpVar2.b |= 4;
        lpVar2.e = f;
        lp build3 = createBuilder5.build();
        createBuilder4.copyOnWrite();
        lq lqVar5 = createBuilder4.instance;
        build3.getClass();
        lqVar5.o = build3;
        lqVar5.b |= 8192;
        lq build4 = createBuilder4.build();
        ak akVar = zVar.f;
        ba createBuilder6 = y.a.createBuilder();
        createBuilder6.copyOnWrite();
        y yVar = createBuilder6.instance;
        build4.getClass();
        yVar.c = build4;
        yVar.b = 2;
        dl.y(akVar.a((y) createBuilder6.build()), new y(zVar, fVar), ay.a);
    }

    private final void c() {
        synchronized (this) {
            f fVar = this.i;
            this.i = null;
            if (fVar == null) {
                com.google.common.f.a.a e = f606a.e();
                e.ak(3100);
                e.p("Failed to show notification - params are null");
            } else {
                this.b.unregisterReceiver(this);
                try {
                    b(fVar);
                } catch (k e2) {
                    this.e.b(e2, false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0013, code lost:
    
        if (r6.f.c() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.apps.gsa.nga.shared.i.a.f r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            monitor-enter(r0)
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L63
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L16
            r0 = r6
            com.google.android.apps.gsa.search.core.ac.t r0 = r0.f     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L63
        L16:
            r0 = r6
            com.google.android.apps.gsa.nga.shared.i.a.f r0 = r0.i     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L3e
            r0 = r6
            r1 = r7
            r0.i = r1     // Catch: java.lang.Throwable -> L6b
            r0 = r6
            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L6b
            r9 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L6b
            r7 = r0
            r0 = r7
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r9
            r1 = r6
            r2 = r7
            r3 = 0
            r4 = 2
            android.content.Intent r0 = androidx.core.content.a.f(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6b
            r0 = r6
            monitor-exit(r0)
            return
        L3e:
            r0 = r7
            int r0 = r0.i     // Catch: java.lang.Throwable -> L6b
            r8 = r0
            com.google.android.apps.gsa.nga.shared.i.a.j r0 = com.google.android.apps.gsa.nga.shared.i.a.k.d()     // Catch: java.lang.Throwable -> L6b
            r9 = r0
            r0 = r9
            r1 = r8
            r0.d(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r9
            r1 = r7
            android.os.Bundle r1 = r1.a     // Catch: java.lang.Throwable -> L6b
            com.google.android.apps.gsa.nga.shared.u.d.a.l r1 = com.google.android.apps.gsa.nga.shared.i.a.g.a(r1)     // Catch: java.lang.Throwable -> L6b
            r0.c(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r9
            com.google.android.apps.gsa.nga.shared.u.d.a.j r1 = com.google.android.apps.gsa.nga.shared.u.d.a.j.TRIGGER_NOTIFICATION_ALREADY_ACTIVE     // Catch: java.lang.Throwable -> L6b
            r0.b(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r9
            com.google.android.apps.gsa.nga.shared.i.a.k r0 = r0.a()     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L63:
            r0 = r6
            r1 = r7
            r0.b(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r6
            monitor-exit(r0)
            return
        L6b:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.triggering.t.a(com.google.android.apps.gsa.nga.shared.i.a.f, int):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(100);
        if (this.f.c()) {
            return;
        }
        c();
    }
}
