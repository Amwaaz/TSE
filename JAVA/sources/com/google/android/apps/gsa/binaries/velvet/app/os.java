package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.Service;
import android.content.Context;
import com.google.android.apps.gsa.staticplugins.bisto.b.b.p;
import com.google.android.apps.gsa.staticplugins.bisto.util.ac;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.service.w;
import com.google.android.apps.search.assistant.surfaces.bisto.a.j.k;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.a.cr;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.de;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.dz;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.ea;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.k.f;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.l;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.q;
import com.google.android.apps.search.googleapp.launcher.c.g;
import com.google.android.libraries.performance.primes.metrics.e.o;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.a.a.z;
import com.google.android.libraries.search.t.i.y;
import com.google.android.libraries.storage.protostore.af;
import com.google.apps.tiktok.tracing.dj;
import com.google.br.d.a.a.e;
import com.google.br.d.a.a.j;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.base.bd;
import e.b.b.a;
import e.c.b;
import e.c.c;
import e.c.h;
import e.c.i;
import e.c.m;
import e.d.a.v;
import e.d.d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/os.class */
public final class os implements com.google.apps.tiktok.tracing.dp, a {
    public h A;
    public h B;
    public h C;
    public h D;
    public h E;
    public h F;
    public h G;
    public h H;
    public h I;
    public h J;
    public h K;
    public h L;
    public h M;
    public h N;
    public h O;
    public h P;
    public h Q;
    public h R;
    public h S;
    public h T;
    public h U;
    public h V;
    public h W;
    public h X;
    public h Y;
    public h Z;

    /* renamed from: a, reason: collision with root package name */
    public final Service f331a;
    public h aA;
    public h aB;
    public h aC;
    public h aD;
    public h aE;
    public h aF;
    public h aG;
    public h aH;
    public h aI;
    public h aJ;
    public h aK;
    public h aL;
    public h aM;
    public h aN;
    public final os aO;
    private h aP;
    private h aQ;
    private h aR;
    private h aS;
    private h aT;
    private h aU;
    private h aV;
    private h aW;
    private h aX;
    private h aY;
    private h aZ;
    public h aa;
    public h ab;
    public h ac;
    public h ad;
    public h ae;
    public h af;
    public h ag;
    public h ah;
    public h ai;
    public h aj;
    public h ak;
    public h al;
    public h am;
    public h an;
    public h ao;
    public h ap;
    public h aq;
    public h ar;
    public h as;
    public h at;
    public h au;
    public h av;
    public h aw;
    public h ax;
    public h ay;
    public d az;
    public final jo b;
    private h ba;
    private h bb;
    private h bc;
    private h bd;
    private h be;
    private h bf;
    private h bg;
    private h bh;
    private h bi;
    private h bj;
    private h bk;
    private h bl;
    private h bm;
    private h bn;
    private h bo;
    private h bp;
    private h bq;
    private h br;
    private h bs;
    private h bt;
    private h bu;
    private h bv;
    private h bw;
    public h c;
    public h d;
    public h e;
    public h f;
    public h g;
    public h h;
    public h i;
    public h j;
    public h k;
    public h l;
    public h m;
    public h n;
    public h o;
    public h p;
    public h q;
    public h r;
    public h s;
    public h t;
    public h u;
    public h v;
    public h w;
    public h x;
    public h y;
    public h z;

    public os() {
        throw null;
    }

    public os(jo joVar, Service service) {
        this.aO = this;
        this.b = joVar;
        this.f331a = service;
        this.c = new hx(joVar, this, 1);
        this.aP = m.b(new hx(joVar, this, 3));
        this.d = m.b(new hx(joVar, this, 2));
        this.e = m.b(new hx(joVar, this, 4));
        this.f = new hx(joVar, this, 0);
        this.g = new hx(joVar, this, 5);
        this.h = new hx(joVar, this, 6);
        this.i = m.b(new hx(joVar, this, 7));
        this.aQ = new hx(joVar, this, 9);
        this.aR = m.b(new hx(joVar, this, 10));
        this.j = new hx(joVar, this, 8);
        this.k = new hx(joVar, this, 11);
        this.l = new hx(joVar, this, 12);
        this.m = new hx(joVar, this, 13);
        this.n = new hx(joVar, this, 14);
        this.o = new hx(joVar, this, 15);
        this.p = new hx(joVar, this, 16);
        this.q = new hx(joVar, this, 17);
        this.r = m.b(new hx(joVar, this, 19));
        this.s = m.b(new hx(joVar, this, 20));
        this.aS = m.b(new hx(joVar, this, 18));
        this.aT = c.c(new hx(joVar, this, 22));
        b bVar = new b();
        this.t = bVar;
        b.b(bVar, c.c(new hx(joVar, this, 21)));
        this.aU = m.b(new hx(joVar, this, 24));
        this.aV = c.c(new hx(joVar, this, 26));
        this.aW = new hx(joVar, this, 25);
        this.aX = m.b(new hx(joVar, this, 23));
        this.u = m.b(new hx(joVar, this, 27));
        this.v = c.c(new hx(joVar, this, 28));
        this.w = nx.f327a;
        this.x = new hx(joVar, this, 29);
        this.y = new hx(joVar, this, 30);
        this.z = new hx(joVar, this, 31);
        this.A = new hx(joVar, this, 32);
        this.B = new hx(joVar, this, 33);
        this.C = new hx(joVar, this, 34);
        this.D = c.c(new hx(joVar, this, 36));
        this.E = c.c(new hx(joVar, this, 37));
        hx hxVar = new hx(joVar, this, 38);
        this.aY = hxVar;
        this.F = m.b(hxVar);
        this.aZ = c.c(new hx(joVar, this, 40));
        this.G = c.c(new hx(joVar, this, 39));
        this.H = new hx(joVar, this, 44);
        this.I = c.c(new hx(joVar, this, 43));
        this.J = c.c(new hx(joVar, this, 45));
        this.K = new hx(joVar, this, 42);
        this.L = c.c(new hx(joVar, this, 41));
        this.M = new hx(joVar, this, 51);
        this.N = new hx(joVar, this, 50);
        this.O = new hx(joVar, this, 52);
        hx hxVar2 = new hx(joVar, this, 53);
        this.ba = hxVar2;
        this.P = m.b(hxVar2);
        this.Q = m.b(new hx(joVar, this, 49));
        this.R = m.b(new hx(joVar, this, 54));
        this.bb = m.b(new hx(joVar, this, 48));
        this.S = new hx(joVar, this, 57);
        this.T = new hx(joVar, this, 58);
        this.U = m.b(new hx(joVar, this, 56));
        this.V = new hx(joVar, this, 59);
        this.bc = m.b(new hx(joVar, this, 55));
        this.W = m.b(new hx(joVar, this, 62));
        this.X = new hx(joVar, this, 61);
        this.Y = new hx(joVar, this, 63);
        this.bd = m.b(new hx(joVar, this, 60));
        this.be = c.c(new hx(joVar, this, 64));
        this.bf = c.c(new hx(joVar, this, 66));
        this.bg = new hx(joVar, this, 65);
        this.Z = c.c(new hx(joVar, this, 47));
        this.aa = new b();
        hx hxVar3 = new hx(joVar, this, 67);
        this.bh = hxVar3;
        this.ab = m.b(hxVar3);
        this.bi = m.b(new hx(joVar, this, 68));
        this.bj = c.c(new hx(joVar, this, 46));
        this.ac = c.c(new hx(joVar, this, 70));
        this.ad = m.b(new hx(joVar, this, 72));
        this.bk = new hx(joVar, this, 73);
        this.bl = new hx(joVar, this, 74);
        this.ae = c.c(new hx(joVar, this, 75));
        this.bm = new hx(joVar, this, 76);
        this.bn = c.c(new hx(joVar, this, 71));
        this.af = c.c(new hx(joVar, this, 77));
        this.bo = c.c(new hx(joVar, this, 78));
        this.bp = c.c(new hx(joVar, this, 79));
        this.ag = c.c(new hx(joVar, this, 80));
        this.bq = c.c(new hx(joVar, this, 81));
        this.ah = c.c(new hx(joVar, this, 82));
        this.br = c.c(new hx(joVar, this, 69));
        this.bs = m.b(new hx(joVar, this, 85));
        this.ai = c.c(new hx(joVar, this, 86));
        this.aj = c.c(new hx(joVar, this, 84));
        this.ak = c.c(new hx(joVar, this, 87));
        this.bt = c.c(new hx(joVar, this, 83));
        this.bu = c.c(new hx(joVar, this, 89));
        this.bv = c.c(new hx(joVar, this, 88));
        this.bw = c.c(new hx(joVar, this, 90));
        this.al = new hx(joVar, this, 91);
        b.b(this.aa, c.c(new hx(joVar, this, 35)));
        this.am = c.c(new hx(joVar, this, 92));
        this.an = c.c(new hx(joVar, this, 93));
        this.ao = new hx(joVar, this, 94);
        this.ap = new hx(joVar, this, 96);
        this.aq = c.c(new hx(joVar, this, 95));
        this.ar = new hx(joVar, this, 97);
        this.as = new hx(joVar, this, 98);
        this.at = new hx(joVar, this, 100);
        this.au = new hx(joVar, this, 101);
        this.av = m.b(new hx(joVar, this, 102));
        this.aw = c.c(new hx(joVar, this, 104));
        this.ax = m.b(new hx(joVar, this, 103));
        this.ay = m.b(new hx(joVar, this, 99));
        this.az = v.d(this.ab);
        this.aA = c.c(new hx(joVar, this, 105));
        this.aB = c.c(new hx(joVar, this, 106));
        this.aC = c.c(new hx(joVar, this, 107));
        this.aD = c.c(new hx(joVar, this, 108));
        this.aE = c.c(new hx(joVar, this, 109));
        this.aF = c.c(new hx(joVar, this, 113));
        this.aG = c.c(new hx(joVar, this, 112));
        this.aH = new hx(joVar, this, 114);
        this.aI = c.c(new hx(joVar, this, 111));
        this.aJ = c.c(new hx(joVar, this, 117));
        this.aK = c.c(new hx(joVar, this, 116));
        this.aL = c.c(new hx(joVar, this, 115));
        this.aM = c.c(new hx(joVar, this, 110));
        this.aN = c.c(new hx(joVar, this, 118));
    }

    public final com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a a() {
        return new com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a((com.google.android.apps.gsa.staticplugins.nga.ui.b.a) this.b.f319a.av.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.d aA() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.d((com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.a) this.b.b.fO.a());
    }

    public final f az() {
        return new f(this.bm, (byte[]) null);
    }

    public final p b() {
        jo joVar = this.b;
        return new p(joVar.B, this.ap, joVar.py, joVar.f, joVar.bM);
    }

    public final com.google.android.apps.gsa.staticplugins.bisto.h.c c() {
        Context context = (Context) this.b.f.a();
        af afVar = (af) this.b.aA.a();
        e.a b = c.b(this.b.g);
        return new com.google.android.apps.gsa.staticplugins.bisto.h.c(context, afVar, b);
    }

    @Override // com.google.apps.tiktok.tracing.dr
    public final dj cX() {
        return (dj) this.e.a();
    }

    public final ac d() {
        jo joVar = this.b;
        jy jyVar = joVar.f319a;
        h hVar = joVar.f;
        h b = i.b(jyVar.hA);
        jo joVar2 = this.b;
        return new ac(hVar, b, joVar2.f319a.hB, joVar2.kg, joVar2.v, i.b(this.ab), i.b(this.b.W));
    }

    @Override // com.google.apps.tiktok.tracing.dr
    public final Set dP() {
        e eVar = (e) this.aW.a();
        eVar.getClass();
        return new op(j.a(eVar));
    }

    public final w e() {
        return new w(this.aT, this.t, this.b.gc);
    }

    public final cr f() {
        return new cr((com.google.android.libraries.g.a) this.b.g.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p g() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.a.p(h(), (ag) this.b.bo.a());
    }

    public final de h() {
        return new de((n) this.b.R.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.room.a) this.b.qM.a(), i(), (ea) this.b.qO.a(), (com.google.common.v.f) this.b.ez.a(), (y) this.b.W.a());
    }

    public final dz i() {
        return new dz((Context) this.b.f.a(), (ag) this.b.bo.a(), (n) this.b.qN.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.deviceinfo.room.a) this.b.qM.a(), (ea) this.b.qO.a(), (dj) this.e.a(), (y) this.b.W.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.h.a j() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.h.a(new md(this.b, this.aO));
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.e k() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.e((q) this.H.a());
    }

    public final l l() {
        Context context = (Context) this.b.ux.a();
        com.google.android.libraries.search.account.b.b bVar = (com.google.android.libraries.search.account.b.b) this.b.gd.a();
        jo joVar = this.b;
        return new l(context, bVar, joVar.f319a.pt(), (ag) joVar.Q.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.c m() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.c((com.google.android.apps.search.assistant.surfaces.bisto.interactor.q.c.a) this.b.b.fO.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.d n() {
        jo joVar = this.b;
        h hVar = joVar.ux;
        h hVar2 = this.bs;
        h hVar3 = joVar.v;
        h b = i.b(this.ab);
        h hVar4 = this.b.g;
        h b2 = i.b(this.ai);
        h b3 = i.b(this.W);
        jx jxVar = this.b.c;
        return new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.d(hVar, hVar2, hVar3, b, hVar4, b2, b3, jxVar.eP, jxVar.Q);
    }

    public final g o() {
        return new g((o) this.b.jc.a(), this.b.c.fu());
    }

    public final com.google.frameworks.client.data.android.server.m p() {
        return new com.google.frameworks.client.data.android.server.m(this.f331a, (ScheduledExecutorService) this.b.H.a(), (io.grpc.aw) this.b.eq.a(), at.k((List) this.aX.a()));
    }

    public final com.google.frameworks.client.data.android.server.m q() {
        return new com.google.frameworks.client.data.android.server.m(this.f331a, (ScheduledExecutorService) this.b.H.a(), (io.grpc.aw) this.b.eq.a(), at.k((List) this.aX.a()));
    }

    public final com.google.br.d.a.a.b.j r() {
        return new com.google.br.d.a.a.b.j(new com.google.br.d.a.a.e.a((com.google.br.d.a.a.g.c.b) this.b.aS.a(), this.b.nX(), c.b(this.aW)));
    }

    public final Object s() {
        jo joVar = this.b;
        k S = joVar.c.S();
        com.google.common.util.concurrent.cr crVar = (com.google.common.util.concurrent.cr) joVar.v.a();
        com.google.android.libraries.search.account.k kVar = (com.google.android.libraries.search.account.k) this.b.bM.a();
        com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.b.ti.a();
        com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.f fVar = (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.f) this.ah.a();
        jx jxVar = this.b.c;
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.d.d(S, crVar, kVar, cVar, fVar, jxVar.fE(), ((com.google.apps.tiktok.experiments.e) new h.a.a.a.a.a.b.a.a.c(jxVar.f325a.V).a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_tng_interactor.device 45619368").f());
    }

    public final Object t() {
        Context context = (Context) this.b.ux.a();
        jo joVar = this.b;
        return new com.google.android.apps.search.assistant.surfaces.bisto.a.f.l(context, joVar.f319a.bf(), (com.google.common.util.concurrent.cr) joVar.v.a(), (Executor) this.b.H.a(), this.b.f319a.l(), this.ab);
    }

    public final Object u() {
        return new com.google.android.apps.gsa.staticplugins.nga.vis.a.h((com.google.android.apps.gsa.nga.shared.q.g) this.b.iD.a(), (com.google.android.apps.gsa.shared.util.c.a.aw) this.b.jF.a(), (com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.k) this.b.f319a.dX.a());
    }

    public final Set v() {
        bd k = at.k(this.b.lQ());
        Service service = this.f331a;
        service.getClass();
        return ha.o(com.google.br.d.a.a.g.d.c.a(service, new com.google.br.d.a.a.g.d.j((com.google.br.d.a.a.g.d.b) k.a)));
    }

    public final z w() {
        lt ltVar = (lt) this.aS.a();
        ltVar.getClass();
        return new z(ltVar);
    }
}
