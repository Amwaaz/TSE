package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import a.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.education.pie.b.ak;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.nga.shared.u.d.a.o;
import com.google.common.b.er;
import com.google.common.b.gl;
import com.google.common.v.f;
import j$.time.Duration;
import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/q.class */
public final class q extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f604a = com.google.common.f.a.d.j();
    public static final Duration b = Duration.ofSeconds(5);
    public final Context c;
    public final com.google.android.libraries.gsa.h.h d;
    public final f e;
    public final AtomicBoolean f;
    public BroadcastReceiver g;
    public ad h;
    public final x i;

    public q(Context context, y yVar, ak akVar, com.google.android.libraries.gsa.h.h hVar, f fVar, x xVar) {
        super(yVar, akVar);
        this.f = new AtomicBoolean(false);
        this.h = ad.a().a();
        this.c = context;
        this.d = hVar;
        this.e = fVar;
        this.i = xVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(com.google.android.apps.gsa.nga.shared.u.d.a.x xVar) {
        com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar = (xVar.b == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
        com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar2 = acVar;
        if (acVar == null) {
            acVar2 = com.google.android.apps.gsa.nga.shared.u.d.a.ac.a;
        }
        if (acVar2.c == 5) {
            com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar3 = (xVar.b == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
            com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar4 = acVar3;
            if (acVar3 == null) {
                acVar4 = com.google.android.apps.gsa.nga.shared.u.d.a.ac.a;
            }
            int cJ = a.cJ((acVar4.c == 5 ? (o) acVar4.d : o.a).c);
            if (cJ != 0 && cJ == 2) {
                int i = xVar.b;
                com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar5 = (i == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
                com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar6 = acVar5;
                if (acVar5 == null) {
                    acVar6 = com.google.android.apps.gsa.nga.shared.u.d.a.ac.a;
                }
                at a2 = at.a((i == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).c);
                at atVar = a2;
                if (a2 == null) {
                    atVar = at.a;
                }
                d(acVar6, atVar);
            }
        }
    }

    public final void d(com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar, at atVar) {
        synchronized (this) {
            ad adVar = this.h;
            er erVar = new er(adVar.b);
            Set h = erVar.h(atVar);
            if (h != null) {
                Collection._EL.stream(h).filter(new aa(acVar)).findFirst().ifPresent(new ab(erVar, atVar));
            }
            erVar.x(atVar, acVar);
            ac acVar2 = new ac(adVar);
            acVar2.b = gl.t(erVar);
            this.h = acVar2.a();
            atVar.name();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.gmm.NAVIGATION_STATE");
            if (this.g != null) {
                return;
            }
            p pVar = new p(this);
            this.g = pVar;
            androidx.core.content.a.f(this.c, pVar, intentFilter, null, 2);
        }
    }
}
