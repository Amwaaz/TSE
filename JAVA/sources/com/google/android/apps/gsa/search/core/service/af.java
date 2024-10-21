package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.service.c.b;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.search.shared.service.AttachClientResponse;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ba;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/af.class */
public class af implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1150a = j.i("com.google.android.apps.gsa.search.core.service.af");
    private final a A;
    private final com.google.android.apps.gsa.shared.o.a.a B;
    private o C;
    private final com.google.android.apps.gsa.shared.util.keepalive.d D;
    private final aw E;
    public final Context c;
    public final h d;
    public final h e;
    public final SharedPreferences f;
    public final com.google.android.apps.gsa.shared.util.debug.d g;
    public final b h;
    public final a i;
    public final a j;
    public final a k;
    public final a l;
    public final a m;
    public final a n;
    public final a o;
    public final a p;
    public final com.google.common.base.at q;
    public final com.google.common.base.at r;
    public final a s;
    public final a t;
    public final com.google.android.apps.gsa.w.a u;
    public volatile int v;
    public boolean w;
    public long y;
    private final a z;
    public final LongSparseArray b = new LongSparseArray();
    public cn x = ci.a;

    public af(Context context, h hVar, h hVar2, aw awVar, SharedPreferences sharedPreferences, com.google.android.apps.gsa.shared.util.debug.d dVar, b bVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, com.google.common.base.at atVar, com.google.common.base.at atVar2, com.google.android.apps.gsa.shared.util.keepalive.d dVar2, com.google.android.apps.gsa.shared.o.a.a aVar11, a aVar12, a aVar13, com.google.android.apps.gsa.w.a aVar14) {
        this.c = context;
        this.d = hVar;
        this.e = hVar2;
        this.E = awVar;
        this.f = sharedPreferences;
        this.g = dVar;
        this.h = bVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = aVar3;
        this.l = aVar4;
        this.m = aVar5;
        this.n = aVar6;
        this.z = aVar7;
        this.o = aVar8;
        this.p = aVar9;
        this.A = aVar10;
        this.q = atVar;
        this.r = atVar2;
        this.D = dVar2;
        this.B = aVar11;
        this.s = aVar12;
        this.t = aVar13;
        this.u = aVar14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x a() {
        return (x) this.i.a();
    }

    public final AttachClientResponse b(long j, com.google.android.apps.gsa.search.shared.service.n nVar, ClientConfig clientConfig, long j2) {
        ab abVar = e.a;
        o oVar = new o(j, this, nVar, clientConfig, this.d, this.E, this.z, j2, this.B);
        this.d.n("SearchServiceCore [attachClient]", new y(this, j, oVar));
        return new AttachClientResponse(oVar, new com.google.android.apps.gsa.search.shared.service.af(oVar.h, n(oVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(o oVar) {
        if (oVar.n) {
            if (n(oVar)) {
                ((r) this.s.a()).a(oVar, this.b);
                return;
            }
            if (oVar.o) {
                return;
            }
            if ((this.C != null && oVar.f.p()) || o(oVar)) {
                return;
            }
            o oVar2 = this.C;
            if (oVar2 != null) {
                com.google.common.f.h f = f1150a.f();
                f.aj(e.a, "SearchServiceCore");
                com.google.common.f.h hVar = f;
                hVar.ak(7270);
                hVar.H("Abort, client [%s] has too low priority against [%s].", oVar.f.d, oVar2.f.d);
            } else {
                com.google.common.f.h f2 = f1150a.f();
                f2.aj(e.a, "SearchServiceCore");
                com.google.common.f.h hVar2 = f2;
                hVar2.ak(7269);
                hVar2.s("Abort, client [%s] has too low priority.", oVar.f.d);
            }
            oVar.e.a(new ae(hf.CLIENT_NOT_ACTIVATED).a());
        }
    }

    public final void e(o oVar, boolean z, boolean z2) {
        ab abVar = e.a;
        if (oVar != null) {
            if (this.b.get(oVar.c) != oVar) {
                j jVar = f1150a;
                com.google.common.f.h d = jVar.d();
                d.aj(e.a, "SearchServiceCore");
                com.google.common.f.h hVar = d;
                hVar.ak(7279);
                hVar.p("Ignoring already detached client");
                if ((n(oVar) && oVar.i) || this.C == oVar) {
                    com.google.common.f.h f = jVar.f();
                    f.aj(e.a, "SearchServiceCore");
                    com.google.common.f.h hVar2 = f;
                    hVar2.ak(7280);
                    hVar2.N("Unexpected state on deactivation: client=%s, detach=%b, new=%b", oVar, Boolean.valueOf(z), Boolean.valueOf(z2));
                    int i = com.google.android.apps.gsa.shared.util.b.h.a;
                    return;
                }
                return;
            }
            boolean z3 = true;
            Long l = null;
            if ((n(oVar) && oVar.i) || oVar == this.C) {
                com.google.common.f.am.d.getClass();
                if (n(oVar)) {
                    r rVar = (r) this.s.a();
                    ((ay) rVar.b.a()).g(oVar);
                    a aVar = rVar.c;
                    if (rVar.a.get(Long.valueOf(oVar.k)) == oVar) {
                        rVar.a.remove(Long.valueOf(oVar.k));
                    }
                } else {
                    ((ay) this.o.a()).g(oVar);
                    if (oVar == this.C) {
                        ((x) this.i.a()).g(null);
                        this.C = null;
                    }
                }
                if (oVar.o) {
                    ((ai) this.k.a()).j = true;
                    this.d.n("beginKeepAliveForHandover", new ab(this, 0));
                    this.D.e();
                }
            }
            if (z) {
                ay ayVar = (ay) this.o.a();
                if (!oVar.m()) {
                    com.google.common.f.h f2 = ay.f1158a.f();
                    f2.aj(e.a, "SessionLifecycleManager");
                    com.google.common.f.h hVar3 = f2;
                    hVar3.ak(7331);
                    hVar3.s("Client : %s has no associated SessionController", oVar);
                } else if (ayVar.k(oVar)) {
                    ayVar.e(oVar, oVar.s);
                } else {
                    long j = oVar.c;
                    com.google.android.apps.gsa.search.core.service.d.e eVar = oVar.s;
                    if (eVar != null) {
                        l = (Long) ayVar.f.e().get(eVar);
                    }
                    if (l == null || j != l.longValue()) {
                        z3 = false;
                    }
                    if (!oVar.o && z3) {
                        ayVar.e(oVar, oVar.s);
                    }
                }
                this.b.delete(oVar.c);
                oVar.e.e();
            }
            l();
            if (z2) {
                if (n(oVar)) {
                    ((r) this.s.a()).b(this.b, com.google.common.base.at.k(Long.valueOf(oVar.k)));
                } else {
                    i();
                }
            }
        }
    }

    public final void f(long j, boolean z) {
        this.d.n("SearchServiceCore [detachClient]", new ap(this, j, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(ae aeVar) {
        aeVar.b(this, (x) this.i.a(), true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(ae aeVar) {
        aeVar.b(this, (x) this.i.a(), false, true);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("SearchServiceCore");
        fVar.b("Attached Clients").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.b.size()), false));
        f d = fVar.d((Object) null);
        for (int i = 0; i < this.b.size(); i++) {
            o oVar = (o) this.b.valueAt(i);
            if (oVar == this.C) {
                d.r(new com.google.android.apps.gsa.shared.util.b.d("Active:", false));
            }
            d.m(oVar);
        }
        fVar.m((g) this.s.a());
        fVar.m((g) this.i.a());
        fVar.m((g) this.o.a());
    }

    final void i() {
        ab abVar = e.a;
        if (this.C == null) {
            o oVar = null;
            int i = 0;
            while (i < this.b.size()) {
                o oVar2 = (o) this.b.valueAt(i);
                o oVar3 = oVar;
                if (!n(oVar2)) {
                    oVar3 = oVar;
                    if (oVar2.p) {
                        oVar3 = oVar;
                        if (!oVar2.o) {
                            if (oVar != null) {
                                oVar3 = oVar;
                                if (oVar2.q <= oVar.q) {
                                }
                            }
                            oVar3 = oVar2;
                        }
                    }
                }
                i++;
                oVar = oVar3;
            }
            int i2 = 0;
            if (oVar != null) {
                if (o(oVar)) {
                    return;
                } else {
                    i2 = 0;
                }
            }
            while (i2 < this.b.size()) {
                o oVar4 = (o) this.b.valueAt(i2);
                if (!n(oVar4) && !oVar4.o && o(oVar4)) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v113, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v121, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v142, types: [e.a, java.lang.Object] */
    public final void j(o oVar, boolean z) {
        com.google.common.base.at a2;
        ay ayVar = (ay) this.o.a();
        long j = oVar.k;
        ab abVar = e.a;
        ba baVar = ayVar.e;
        Long valueOf = Long.valueOf(j);
        com.google.android.apps.gsa.search.core.service.d.e eVar = (com.google.android.apps.gsa.search.core.service.d.e) baVar.get(valueOf);
        if (eVar == null) {
            String str = oVar.f.e;
            if (j != 0) {
                if (!z) {
                    com.google.common.f.h f = ay.f1158a.f();
                    f.aj(e.a, "SessionLifecycleManager");
                    com.google.common.f.h hVar = f;
                    hVar.ak(7335);
                    hVar.p("Handover failed. Creating new session controller.");
                }
                com.google.android.apps.gsa.search.core.service.d.e b = ayVar.b(j, str);
                com.google.android.apps.gsa.search.shared.service.d.b.u c = oVar.c();
                if (!"search".equals(str) && !z) {
                    if (((com.google.android.apps.gsa.search.core.service.d.b.a) ayVar.c.a.a()).d(j)) {
                        a2 = ((com.google.android.apps.gsa.search.core.service.d.b.a) ayVar.c.a.a()).a(j);
                    } else {
                        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                        a2 = ((com.google.android.apps.gsa.search.core.service.d.b.a) ayVar.c.a.a()).a(j);
                    }
                    if (a2.h()) {
                        com.google.android.apps.gsa.search.shared.service.d.b.v vVar = (com.google.android.apps.gsa.search.shared.service.d.b.v) a2.c();
                        if (!str.equals(vVar.e)) {
                            com.google.common.f.h f2 = ay.f1158a.f();
                            f2.aj(e.a, "SessionLifecycleManager");
                            com.google.common.f.h hVar2 = f2;
                            hVar2.ak(7323);
                            hVar2.N("readSessionData(): session types mismatch. Expected '%s' and found '%s'. [sessionId] = [%d]", str, vVar.e, valueOf);
                        }
                    }
                }
                ayVar.l(b, j, c, ayVar.k(oVar));
                eVar = b;
            } else {
                cl.u(!z);
                long a3 = ayVar.a();
                eVar = ayVar.b(a3, str);
                ayVar.l(eVar, a3, oVar.c(), ayVar.k(oVar));
                boolean z2 = true;
                if (oVar.k != 0) {
                    z2 = "search".equals(oVar.f.e);
                }
                cl.u(z2);
                oVar.k = a3;
            }
        } else {
            if (z && Math.abs(j - ayVar.a()) < 100) {
                ((com.google.android.apps.gsa.shared.logger.e) ayVar.d.a()).c(null, 140580984);
            }
            cl.v(!z, "Cannot reuse SessionContainer for newly generated Session ID.");
            cl.v(eVar.f.equals(oVar.f.e), "Cannot reuse SessionContainer with wrong session type");
        }
        com.google.android.apps.gsa.search.core.service.d.e eVar2 = oVar.s;
        if (eVar2 == null || eVar2 == eVar) {
            oVar.s = eVar;
        } else {
            String str2 = oVar.f.e;
            if (!str2.equals("search") && !str2.equals("opa") && !str2.equals("lens") && !str2.equals("monet") && !str2.equals("monet_multi_client") && !str2.equals("now_stream") && !str2.equals("quartz") && !str2.equals("voice_access") && !str2.equals("deeplink") && !str2.equals("customtabs") && !str2.equals("now_opt_in") && !str2.equals("car_assistant") && !str2.equals("rss_gmm_commute_update")) {
                com.google.common.f.h e = ay.f1158a.e();
                e.aj(e.a, "SessionLifecycleManager");
                com.google.common.f.h hVar3 = e;
                hVar3.ak(7336);
                hVar3.D("Trying to override already set SessionContainer (sessionId: %d, client: %s)", oVar.k, oVar);
                throw new IllegalStateException(a.a.dC(str2, "Trying to override already set SessionContainer for '", "' session"));
            }
            ayVar.e(oVar, eVar2);
            oVar.s = eVar;
        }
        if (ayVar.f.containsValue(eVar)) {
            return;
        }
        ayVar.i(oVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(ae aeVar) {
        aeVar.b(this, (x) this.i.a(), true, false);
    }

    final void l() {
        int i = 0;
        while (i < this.b.size()) {
            o oVar = (o) this.b.valueAt(i);
            if (oVar.e.f1216a.asBinder().pingBinder()) {
                i++;
            } else {
                oVar.e.e();
                this.b.removeAt(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (r8 == 100) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r6, long r8, android.os.Bundle r10, com.google.android.apps.gsa.search.shared.service.d.b.u r11) {
        /*
            r5 = this;
            r0 = r5
            android.util.LongSparseArray r0 = r0.b
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            com.google.android.apps.gsa.search.core.service.o r0 = (com.google.android.apps.gsa.search.core.service.o) r0
            r14 = r0
            r0 = r14
            r1 = r5
            com.google.android.apps.gsa.search.core.service.o r1 = r1.C
            if (r0 != r1) goto L45
            com.google.common.f.j r0 = com.google.android.apps.gsa.search.core.service.af.f1150a
            com.google.common.f.y r0 = r0.f()
            r15 = r0
            r0 = r15
            com.google.common.f.ab r1 = com.google.common.f.a.e.a
            java.lang.String r2 = "SearchServiceCore"
            r0.aj(r1, r2)
            r0 = r15
            com.google.common.f.h r0 = (com.google.common.f.h) r0
            r15 = r0
            r0 = r15
            r1 = 7291(0x1c7b, float:1.0217E-41)
            r0.ak(r1)
            r0 = r15
            java.lang.String r1 = "Attempting to re-start already active client."
            r0.p(r1)
        L45:
            r0 = r14
            if (r0 == 0) goto Lc9
            r0 = r11
            com.google.android.apps.gsa.search.shared.service.d.b.u r1 = com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a
            boolean r0 = r0.equals(r1)
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L76
            r0 = r8
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L76
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
            r0 = 1
            r12 = r0
            r0 = 0
            r8 = r0
            goto L79
        L70:
            r0 = 0
            r12 = r0
            goto L79
        L76:
            r0 = 1
            r12 = r0
        L79:
            r0 = r12
            java.lang.String r1 = "SessionContext can only be provided when you are starting a fresh session"
            com.google.common.base.cl.v(r0, r1)
            r0 = r14
            r1 = 1
            r0.n = r1
            r0 = r14
            r1 = r8
            r0.j = r1
            r0 = r14
            r1 = r10
            r0.l = r1
            r0 = r14
            r1 = r11
            r0.m = r1
            com.google.common.f.ab r0 = com.google.common.f.a.e.a
            r10 = r0
            r0 = r14
            long r0 = r0.k
            r6 = r0
            r0 = r8
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = r13
            r12 = r0
            r0 = r8
            r1 = 100
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbb
        Lb8:
            r0 = 1
            r12 = r0
        Lbb:
            r0 = r5
            r1 = r14
            r2 = r12
            r0.j(r1, r2)
            r0 = r5
            r1 = r14
            r0.c(r1)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.af.m(long, long, android.os.Bundle, com.google.android.apps.gsa.search.shared.service.d.b.u):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(o oVar) {
        return ((com.google.android.apps.gsa.search.core.service.d.j) this.A.a()).a(oVar.f.e);
    }

    final boolean o(o oVar) {
        ab abVar = e.a;
        if (!oVar.n || this.b.get(oVar.c) != oVar) {
            com.google.common.f.h f = f1150a.f();
            f.aj(e.a, "SearchServiceCore");
            com.google.common.f.h hVar = f;
            hVar.ak(7293);
            hVar.p("Abort, client detached.");
            return false;
        }
        o oVar2 = this.C;
        if (oVar == oVar2) {
            return true;
        }
        com.google.android.apps.gsa.search.core.service.d.e eVar = oVar2 != null ? oVar2.s : null;
        com.google.common.base.at k = (oVar2 == null || oVar == null || (this.q.h() && ((bg) this.q.c()).a().b())) ? com.google.common.base.a.a : (oVar2.f.m() && oVar.f.q() && oVar.f.v()) ? com.google.common.base.at.k(oVar) : (oVar.f.m() && oVar2.f.q() && oVar2.f.v()) ? com.google.common.base.at.k(oVar2) : com.google.common.base.a.a;
        if (k.h()) {
            com.google.common.f.h f2 = f1150a.f();
            f2.aj(e.a, "SearchServiceCore");
            com.google.common.f.h hVar2 = f2;
            hVar2.ak(7297);
            hVar2.p("Suppress Opa UI client, because bisto client has higher priority.");
            ((o) k.c()).e.a(new ae(hf.GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION).a());
            return !k.c().equals(oVar);
        }
        if (oVar2 != null && eVar != null) {
            if (!eVar.f1165a.i(oVar2.f, oVar.f)) {
                com.google.common.f.h f3 = f1150a.f();
                f3.aj(e.a, "SearchServiceCore");
                com.google.common.f.h hVar3 = f3;
                hVar3.ak(7296);
                hVar3.p("Abort, client has too low priority.");
                return false;
            }
        }
        if (!oVar.n) {
            com.google.common.f.h e = f1150a.e();
            e.aj(e.a, "SearchServiceCore");
            com.google.common.f.h hVar4 = e;
            hVar4.ak(7268);
            hVar4.s("Trying to activate client, %s and it is not started", oVar);
            return true;
        }
        o oVar3 = this.C;
        if (oVar3 != null) {
            ((ay) this.o.a()).g(oVar3);
        }
        this.C = oVar;
        ((ay) this.o.a()).f(oVar);
        ((x) this.i.a()).g(this.C);
        return true;
    }
}
