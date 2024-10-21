package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.ComponentName;
import com.google.android.apps.gsa.nga.engine.education.pie.b.ak;
import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.shared.u.d.a.a;
import com.google.android.apps.gsa.nga.shared.u.d.a.ab;
import com.google.android.apps.gsa.nga.shared.u.d.a.at;
import com.google.android.apps.gsa.nga.shared.u.d.a.x;
import com.google.common.b.er;
import com.google.common.b.gl;
import com.google.common.v.f;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/h.class */
public final class h extends ae implements com.google.android.apps.gsa.nga.engine.ae.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f601a = com.google.common.f.a.d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public final f c;
    public final Map d;
    private final AtomicBoolean e;
    private String f;

    public h(y yVar, ak akVar, com.google.android.libraries.gsa.h.h hVar, f fVar) {
        super(yVar, akVar);
        this.d = new HashMap();
        this.e = new AtomicBoolean(false);
        this.f = "";
        this.b = hVar;
        this.c = fVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.c
    public final void c(x xVar) {
        com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar = (xVar.b == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
        com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar2 = acVar;
        if (acVar == null) {
            acVar2 = com.google.android.apps.gsa.nga.shared.u.d.a.ac.a;
        }
        if (acVar2.c == 2) {
            int i = xVar.b;
            com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar3 = (i == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
            com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar4 = acVar3;
            if (acVar3 == null) {
                acVar4 = com.google.android.apps.gsa.nga.shared.u.d.a.ac.a;
            }
            at a2 = at.a((i == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).c);
            at atVar = a2;
            if (a2 == null) {
                atVar = at.a;
            }
            if (d(acVar4, atVar)) {
                return;
            }
            com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar5 = (xVar.b == 6 ? (com.google.android.apps.gsa.nga.shared.u.d.a.ad) xVar.c : com.google.android.apps.gsa.nga.shared.u.d.a.ad.a).d;
        }
    }

    public final boolean d(com.google.android.apps.gsa.nga.shared.u.d.a.ac acVar, at atVar) {
        synchronized (this) {
            if ((acVar.c == 2 ? (a) acVar.d : a.a).b.isEmpty()) {
                com.google.common.f.a.a e = f601a.e();
                e.ak(3088);
                e.p("Empty app package name.");
                return false;
            }
            ad adVar = (ad) Map._EL.getOrDefault(this.d, (acVar.c == 2 ? (a) acVar.d : a.a).b, ad.a().a());
            er erVar = new er(adVar.b);
            erVar.x(atVar, acVar);
            ac acVar2 = new ac(adVar);
            acVar2.b = gl.t(erVar);
            this.d.put((acVar.c == 2 ? (a) acVar.d : a.a).b, acVar2.a());
            ab.a(acVar.c).name();
            atVar.name();
            return true;
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.b
    public final void j(Optional optional) {
        synchronized (this) {
            if (!this.d.isEmpty() && !optional.isEmpty()) {
                if (this.e.get() && !this.f.isEmpty()) {
                    this.e.set(false);
                    String str = this.f;
                    this.f = "";
                    ad adVar = (ad) this.d.get(str);
                    if (adVar != null) {
                        if (adVar.f593a.isEmpty()) {
                            com.google.common.f.a.a e = f601a.e();
                            e.ak(3081);
                            e.s("App Enter timestamp not found. App package: %s", str);
                            return;
                        }
                        Collection._EL.stream(adVar.b.p()).filter(new n(this, adVar, 1)).forEach(new g(this, adVar, str));
                    }
                }
                String packageName = ((ComponentName) optional.get()).getPackageName();
                ad adVar2 = (ad) this.d.get(packageName);
                if (adVar2 != null) {
                    ac acVar = new ac(adVar2);
                    acVar.f592a = Optional.of(this.c.a());
                    this.d.put(packageName, acVar.a());
                    this.f = packageName;
                    this.e.set(true);
                }
            }
        }
    }
}
