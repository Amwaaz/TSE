package com.google.android.apps.gsa.binaries.velvet.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.nga.api.a.o;
import com.google.android.apps.gsa.staticplugins.opa.dm;
import com.google.android.apps.search.assistant.platform.appintegration.performers.communication.PermissionsRequesterImpl;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.aj;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.bs;
import com.google.android.apps.search.assistant.surfaces.dictation.service.a.bq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.a.bt;
import com.google.android.apps.search.assistant.surfaces.dictation.service.j.g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.l.s;
import com.google.android.apps.search.assistant.surfaces.dictation.service.m.b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.n.c.a.a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.ai;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p.be;
import com.google.android.apps.search.assistant.surfaces.dictation.service.x.y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.ad;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.ao;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.z;
import com.google.android.apps.search.assistant.surfaces.e.d.f.bb;
import com.google.android.apps.search.assistant.surfaces.voice.h.a.e.k;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.c.bn;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.ae;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.ap;
import com.google.android.apps.search.assistant.surfaces.voice.o.p;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am;
import com.google.android.apps.search.googleapp.search.srp.l.az;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.aq;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server.u;
import com.google.android.apps.search.googleapp.search.voicesearch.b.c.r;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ah;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa;
import com.google.android.libraries.assistant.c.d.b.f;
import com.google.android.libraries.assistant.q.ar;
import com.google.android.libraries.search.ah.b.e.an;
import com.google.android.libraries.search.ah.i.b.bl;
import com.google.android.libraries.search.ah.i.b.cn;
import com.google.android.libraries.search.assistant.ai.c.a.t;
import com.google.android.libraries.search.assistant.ao.d.q;
import com.google.android.libraries.search.assistant.invocation.a.e.l;
import com.google.android.libraries.search.assistant.invocation.h.a.b.ay;
import com.google.android.libraries.search.assistant.invocation.k.e.a.x;
import com.google.android.libraries.search.assistant.performer.communication.ci;
import com.google.android.libraries.search.assistant.z.c.a.w;
import com.google.android.libraries.search.t.c.ak;
import com.google.android.libraries.speech.transcription.g.c.i;
import com.google.android.libraries.storage.a.j;
import com.google.android.libraries.storage.protostore.af;
import com.google.android.libraries.storage.protostore.bz;
import com.google.android.libraries.storage.protostore.cg;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.e;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.op;
import com.google.common.base.at;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.g.e.i.ei;
import com.google.g.e.i.fe;
import com.google.g.e.i.gl;
import com.google.g.e.i.gm;
import com.google.g.e.i.hk;
import com.google.g.e.i.ix;
import com.google.g.e.i.lk;
import com.google.g.e.i.mq;
import com.google.g.e.i.mz;
import com.google.g.e.i.nq;
import com.google.g.e.i.nr;
import com.google.g.e.i.qf;
import com.google.g.e.i.qy;
import com.google.g.e.i.rz;
import com.google.g.e.i.si;
import com.google.g.e.i.sn;
import com.google.protobuf.ba;
import e.c.c;
import e.c.h;
import e.c.m;
import e.d.a.v;
import e.d.d;
import io.grpc.cb;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/ji.class */
public final class ji {
    public final h A;
    public final h B;
    public final h C;
    public final h D;
    public final h E;
    public final h F;
    public final h G;
    public final h H;
    public final h I;
    public final h J;
    public final h K;
    public final h L;
    public final h M;
    public final h N;
    public final h O;
    public final h P;
    public final h Q;
    public final h R;
    public final h S;
    public final h T;
    public final h U;
    public final h V;
    public final h W;
    public final h X;
    public final h Y;
    public final h Z;

    /* renamed from: a */
    public final jo f315a;
    public final h aA;
    public final h aB;
    public final h aC;
    public final h aD;
    public final h aE;
    public final h aF;
    public final h aG;
    public final h aH;
    public final h aI;
    public final h aJ;
    public final h aK;
    public final h aL;
    public final h aM;
    public final h aN;
    public final h aO;
    public final h aP;
    public final h aQ;
    public final h aR;
    public final h aS;
    public final h aT;
    public final h aU;
    public final h aV;
    public final h aW;
    public final h aX;
    public final h aY;
    public final h aZ;
    public final h aa;
    public final h ab;
    public final h ac;
    public final h ad;
    public final h ae;
    public final h af;
    public final h ag;
    public final h ah;
    public final h ai;
    public final h aj;
    public final h ak;
    public final h al;
    public final h am;
    public final h an;
    public final h ao;
    public final h ap;
    public final h aq;
    public final h ar;
    public final h as;
    public final h at;
    public final h au;
    public final h av;
    public final h aw;
    public final h ax;
    public final h ay;
    public final h az;
    public final ik b;
    public h bA;
    public h bB;
    public h bC;
    public h bD;
    public h bE;
    public h bF;
    public h bG;
    public h bH;
    public h bI;
    public h bJ;
    public h bK;
    public h bL;
    public h bM;
    public h bN;
    public h bO;
    public h bP;
    public h bQ;
    public h bR;
    public h bS;
    public h bT;
    public h bU;
    public h bV;
    public h bW;
    public h bX;
    public h bY;
    public h bZ;
    public final h ba;
    public final h bb;
    public final h bc;
    public final h bd;
    public final h be;
    public final h bf;
    public final h bg;
    public final h bh;
    public final h bi;
    public final h bj;
    public final h bk;
    public final h bl;
    public final h bm;
    public final h bn;
    public final h bo;
    public final h bp;
    public final h bq;
    public final h br;
    public final h bs;
    public final h bt;
    public final h bu;
    public final h bv;
    public final h bw;
    public final h bx;
    public final h by;
    public h bz;
    public h c;
    public d cA;
    public d cB;
    public h cC;
    public h cD;
    public h cE;
    public h cF;
    public h cG;
    public h cH;
    public h cI;
    public h cJ;
    public h cK;
    public h cL;
    public h cM;
    public h cN;
    public h cO;
    public h cP;
    public h cQ;
    public h cR;
    public h cS;
    public h cT;
    public h cU;
    public h cV;
    public h cW;
    public h cX;
    public h cY;
    public h cZ;
    public h ca;
    public d cb;
    public d cc;
    public d cd;
    public d ce;
    public h cf;
    public h cg;
    public d ch;
    public d ci;
    public h cj;
    public h ck;
    public d cl;
    public d cm;
    public d cn;
    public h co;
    public h cp;
    public h cq;
    public h cr;
    public d cs;
    public h ct;
    public h cu;
    public d cv;
    public d cw;
    public h cx;
    public h cy;
    public h cz;
    public h d;
    private h dA;
    private h dB;
    private h dC;
    private h dD;
    private h dE;
    private h dF;
    private h dG;
    private final h dH;
    private final h dI;
    private final h dJ;
    private final h dK;
    private final h dL;
    private final h dM;
    private final h dN;
    private final h dO;
    private final h dP;
    private final h dQ;
    private final h dR;
    private final h dS;
    private final h dT;
    private final h dU;
    private final h dV;
    private final h dW;
    private final h dX;
    private final h dY;
    private final h dZ;
    public h da;
    public h db;
    public h dc;
    public h dd;
    public h de;
    public h df;
    public h dg;
    public h dh;
    public final h di;
    public final h dj;
    public final h dk;
    public final h dl;
    public final h dm;
    public final h dn;

    /* renamed from: do */
    public final h f6do;
    public final h dp;
    public final h dq;
    public final h dr;
    public final h ds;
    public final h dt;
    private h du;
    private h dv;
    private h dw;
    private h dx;
    private h dy;
    private h dz;
    public h e;
    private final h eA;
    private final h eB;
    private final h eC;
    private final h eD;
    private final h eE;
    private final h eF;
    private final h eG;
    private final h eH;
    private final h eI;
    private final h eJ;
    private final h eK;
    private final h eL;
    private final h eM;
    private final h eN;
    private final h eO;
    private final h eP;
    private final h eQ;
    private final h eR;
    private final h eS;
    private final h eT;
    private final h eU;
    private final h eV;
    private final h eW;
    private final h eX;
    private final h eY;
    private final h eZ;
    private final h ea;
    private final h eb;
    private final h ec;
    private final h ed;
    private final h ee;
    private final h ef;
    private final h eg;
    private final h eh;
    private final h ei;
    private final h ej;
    private final h ek;
    private final h el;
    private final h em;
    private final h en;
    private final h eo;
    private final h ep;
    private final h eq;
    private final h er;
    private final h es;
    private final h et;
    private final h eu;
    private final h ev;
    private final h ew;
    private final h ex;
    private final h ey;
    private final h ez;
    public h f;
    private h fA;
    private final h fB;
    private final h fa;
    private final h fb;
    private final h fc;
    private final h fd;
    private final h fe;
    private final h ff;
    private final h fg;
    private final h fh;
    private final h fi;
    private final h fj;
    private final h fk;
    private final h fl;
    private final h fm;
    private final h fn;
    private h fo;
    private h fp;
    private h fq;
    private h fr;
    private h fs;
    private h ft;
    private h fu;
    private h fv;
    private h fw;
    private h fx;
    private h fy;
    private h fz;
    public h g;
    public h h;
    public h i;
    public h j;
    public h k;
    public h l;
    public h m;
    public h n;
    public final h o;
    public final h p;
    public final h q;
    public final h r;
    public final h s;
    public final h t;
    public final h u;
    public final h v;
    public final h w;
    public final h x;
    public final h y;
    public final h z;

    public ji(jo joVar, ik ikVar) {
        this.f315a = joVar;
        this.b = ikVar;
        eR();
        this.dH = c.c(new jh(joVar, ikVar, 27));
        this.dI = c.c(new jh(joVar, ikVar, 28));
        this.dJ = new jh(joVar, ikVar, 26);
        this.dK = new jh(joVar, ikVar, 29);
        this.dL = new jh(joVar, ikVar, 30);
        this.dM = new jh(joVar, ikVar, 31);
        this.o = new jh(joVar, ikVar, 25);
        this.p = new jh(joVar, ikVar, 32);
        this.q = new jh(joVar, ikVar, 33);
        this.dN = c.c(new jh(joVar, ikVar, 35));
        this.r = new jh(joVar, ikVar, 36);
        this.s = c.c(new jh(joVar, ikVar, 37));
        this.t = new jh(joVar, ikVar, 34);
        this.dO = c.c(new jh(joVar, ikVar, 40));
        this.dP = c.c(new jh(joVar, ikVar, 39));
        this.dQ = m.b(new jh(joVar, ikVar, 41));
        this.u = new jh(joVar, ikVar, 38);
        this.dR = c.c(new jh(joVar, ikVar, 43));
        this.v = new jh(joVar, ikVar, 42);
        this.dS = m.b(new jh(joVar, ikVar, 47));
        this.dT = c.c(new jh(joVar, ikVar, 46));
        this.dU = c.c(new jh(joVar, ikVar, 45));
        this.w = new jh(joVar, ikVar, 44);
        this.dV = c.c(new jh(joVar, ikVar, 49));
        this.x = new jh(joVar, ikVar, 48);
        this.y = c.c(new jh(joVar, ikVar, 54));
        this.dW = new jh(joVar, ikVar, 55);
        this.z = c.c(new jh(joVar, ikVar, 56));
        this.dX = new jh(joVar, ikVar, 57);
        this.A = c.c(new jh(joVar, ikVar, 58));
        this.B = new jh(joVar, ikVar, 53);
        this.C = new jh(joVar, ikVar, 59);
        this.D = c.c(new jh(joVar, ikVar, 60));
        this.dY = m.b(new jh(joVar, ikVar, 62));
        this.E = new jh(joVar, ikVar, 61);
        jh jhVar = new jh(joVar, ikVar, 63);
        this.dZ = jhVar;
        this.F = m.b(jhVar);
        this.ea = m.b(new jh(joVar, ikVar, 52));
        this.eb = m.b(new jh(joVar, ikVar, 65));
        this.ec = m.b(new jh(joVar, ikVar, 66));
        this.ed = m.b(new jh(joVar, ikVar, 67));
        this.ee = m.b(new jh(joVar, ikVar, 68));
        this.ef = m.b(new jh(joVar, ikVar, 69));
        this.eg = m.b(new jh(joVar, ikVar, 70));
        this.eh = m.b(new jh(joVar, ikVar, 64));
        this.ei = c.c(new jh(joVar, ikVar, 51));
        this.G = new jh(joVar, ikVar, 50);
        this.H = new jh(joVar, ikVar, 71);
        this.ej = c.c(new jh(joVar, ikVar, 74));
        this.ek = c.c(new jh(joVar, ikVar, 73));
        this.I = new jh(joVar, ikVar, 72);
        this.J = new jh(joVar, ikVar, 75);
        this.el = m.b(new jh(joVar, ikVar, 77));
        this.K = new jh(joVar, ikVar, 76);
        this.L = new jh(joVar, ikVar, 78);
        this.M = new jh(joVar, ikVar, 79);
        this.em = m.b(new jh(joVar, ikVar, 82));
        this.en = new jh(joVar, ikVar, 81);
        this.N = m.b(new jh(joVar, ikVar, 85));
        this.O = m.b(new jh(joVar, ikVar, 86));
        this.P = m.b(new jh(joVar, ikVar, 88));
        this.Q = new jh(joVar, ikVar, 90);
        this.R = m.b(new jh(joVar, ikVar, 89));
        this.eo = new jh(joVar, ikVar, 91);
        this.S = m.b(new jh(joVar, ikVar, 87));
        this.T = m.b(new jh(joVar, ikVar, 92));
        this.U = m.b(new jh(joVar, ikVar, 93));
        this.ep = m.b(new jh(joVar, ikVar, 84));
        this.V = c.c(new jh(joVar, ikVar, 83));
        this.W = new jh(joVar, ikVar, 80);
        this.eq = c.c(new jh(joVar, ikVar, 98));
        this.er = m.b(new jh(joVar, ikVar, 99));
        this.X = new jh(joVar, ikVar, 100);
        this.Y = new jh(joVar, ikVar, 101);
        this.Z = new jh(joVar, ikVar, 102);
        this.es = c.c(new jh(joVar, ikVar, 97));
        this.et = new jh(joVar, ikVar, 96);
        this.eu = new jh(joVar, ikVar, 103);
        this.ev = new jh(joVar, ikVar, 104);
        this.ew = c.c(new jh(joVar, ikVar, 95));
        this.aa = new jh(joVar, ikVar, 94);
        this.ab = m.b(new jh(joVar, ikVar, 108));
        this.ac = m.b(new jh(joVar, ikVar, 107));
        this.ex = m.b(new jh(joVar, ikVar, 106));
        this.ad = new jh(joVar, ikVar, 105);
        this.ae = new jh(joVar, ikVar, 109);
        this.af = c.c(new jh(joVar, ikVar, 110));
        this.ag = new jh(joVar, ikVar, 111);
        this.ah = new jh(joVar, ikVar, 112);
        this.ai = c.c(new jh(joVar, ikVar, 113));
        this.aj = new jh(joVar, ikVar, 114);
        this.ey = new jh(joVar, ikVar, 116);
        this.ez = nx.b;
        this.ak = new jh(joVar, ikVar, 115);
        this.eA = new jh(joVar, ikVar, 118);
        this.al = c.c(new jh(joVar, ikVar, 117));
        this.am = new jh(joVar, ikVar, 119);
        this.eB = c.c(new jh(joVar, ikVar, 121));
        this.eC = c.c(new jh(joVar, ikVar, 122));
        this.an = new jh(joVar, ikVar, 120);
        this.ao = c.c(new jh(joVar, ikVar, 123));
        this.ap = c.c(new jh(joVar, ikVar, 124));
        this.eD = c.c(new jh(joVar, ikVar, 126));
        this.eE = m.b(new jh(joVar, ikVar, 128));
        this.eF = c.c(new jh(joVar, ikVar, 127));
        this.aq = c.c(new jh(joVar, ikVar, 125));
        this.ar = c.c(new jh(joVar, ikVar, 129));
        this.eG = new jh(joVar, ikVar, 131);
        this.eH = new jh(joVar, ikVar, 132);
        this.eI = new jh(joVar, ikVar, 133);
        this.eJ = new jh(joVar, ikVar, 134);
        this.eK = new jh(joVar, ikVar, 135);
        this.as = new jh(joVar, ikVar, 130);
        this.at = c.c(new jh(joVar, ikVar, 136));
        this.eL = new jh(joVar, ikVar, 138);
        this.eM = new jh(joVar, ikVar, 139);
        this.eN = new jh(joVar, ikVar, 140);
        this.eO = new jh(joVar, ikVar, 141);
        this.eP = new jh(joVar, ikVar, 142);
        this.au = new jh(joVar, ikVar, 137);
        this.eQ = new jh(joVar, ikVar, 144);
        this.av = new jh(joVar, ikVar, 143);
        this.eR = new jh(joVar, ikVar, 146);
        this.aw = c.c(new jh(joVar, ikVar, 145));
        this.ax = new jh(joVar, ikVar, 147);
        this.ay = c.c(new jh(joVar, ikVar, 149));
        this.eS = c.c(new jh(joVar, ikVar, 151));
        this.az = c.c(new jh(joVar, ikVar, 150));
        this.aA = c.c(new jh(joVar, ikVar, 154));
        this.aB = c.c(new jh(joVar, ikVar, 155));
        this.eT = c.c(new jh(joVar, ikVar, 158));
        this.aC = c.c(new jh(joVar, ikVar, 157));
        this.aD = c.c(new jh(joVar, ikVar, 156));
        this.aE = c.c(new jh(joVar, ikVar, 161));
        this.aF = c.c(new jh(joVar, ikVar, 162));
        this.aG = c.c(new jh(joVar, ikVar, 164));
        this.eU = c.c(new jh(joVar, ikVar, 165));
        this.aH = c.c(new jh(joVar, ikVar, 166));
        this.aI = c.c(new jh(joVar, ikVar, 163));
        this.aJ = m.b(new jh(joVar, ikVar, 160));
        this.aK = c.c(new jh(joVar, ikVar, 159));
        this.aL = m.b(new jh(joVar, ikVar, 167));
        this.aM = m.b(new jh(joVar, ikVar, 169));
        this.eV = m.b(new jh(joVar, ikVar, 170));
        this.aN = c.c(new jh(joVar, ikVar, 168));
        this.aO = m.b(new jh(joVar, ikVar, 171));
        this.eW = c.c(new jh(joVar, ikVar, 175));
        this.eX = c.c(new jh(joVar, ikVar, 174));
        this.eY = c.c(new jh(joVar, ikVar, 173));
        this.aP = c.c(new jh(joVar, ikVar, 172));
        this.aQ = c.c(new jh(joVar, ikVar, 176));
        this.aR = c.c(new jh(joVar, ikVar, 178));
        this.aS = m.b(new jh(joVar, ikVar, 179));
        this.eZ = m.b(new jh(joVar, ikVar, 177));
        this.fa = c.c(new jh(joVar, ikVar, 181));
        this.aT = c.c(new jh(joVar, ikVar, 182));
        this.aU = c.c(new jh(joVar, ikVar, 180));
        this.fb = c.c(new jh(joVar, ikVar, 184));
        this.aV = c.c(new jh(joVar, ikVar, 183));
        this.aW = m.b(new jh(joVar, ikVar, 153));
        this.aX = m.b(new jh(joVar, ikVar, 152));
        this.aY = m.b(new jh(joVar, ikVar, 185));
        this.aZ = new jh(joVar, ikVar, 148);
        this.fc = c.c(new jh(joVar, ikVar, 187));
        this.ba = new jh(joVar, ikVar, 186);
        this.fd = c.c(new jh(joVar, ikVar, 190));
        this.fe = m.b(new jh(joVar, ikVar, 189));
        this.bb = m.b(new jh(joVar, ikVar, 194));
        this.ff = m.b(new jh(joVar, ikVar, 193));
        this.bc = m.b(new jh(joVar, ikVar, 195));
        this.bd = m.b(new jh(joVar, ikVar, 192));
        this.fg = m.b(new jh(joVar, ikVar, 191));
        this.be = new jh(joVar, ikVar, 188);
        this.bf = new jh(joVar, ikVar, 196);
        this.bg = new jh(joVar, ikVar, 197);
        this.bh = new jh(joVar, ikVar, 198);
        this.bi = new jh(joVar, ikVar, 199);
        this.fh = new jh(joVar, ikVar, 201);
        this.fi = new jh(joVar, ikVar, 202);
        this.fj = new jh(joVar, ikVar, 203);
        this.bj = m.b(new jh(joVar, ikVar, 206));
        this.bk = m.b(new jh(joVar, ikVar, 205));
        this.bl = m.b(new jh(joVar, ikVar, 204));
        this.bm = c.c(new jh(joVar, ikVar, 200));
        this.bn = c.c(new jh(joVar, ikVar, 207));
        this.bo = c.c(new jh(joVar, ikVar, 209));
        this.bp = new jh(joVar, ikVar, 208);
        this.bq = c.c(new jh(joVar, ikVar, 211));
        this.br = new jh(joVar, ikVar, 210);
        this.fk = new jh(joVar, ikVar, 213);
        this.fl = new jh(joVar, ikVar, 214);
        this.bs = c.c(new jh(joVar, ikVar, 212));
        this.bt = c.c(new jh(joVar, ikVar, 216));
        this.bu = new jh(joVar, ikVar, 215);
        this.bv = new jh(joVar, ikVar, 217);
        this.fm = c.c(new jh(joVar, ikVar, 219));
        this.bw = new jh(joVar, ikVar, 218);
        this.bx = c.c(new jh(joVar, ikVar, 220));
        this.fn = new jh(joVar, ikVar, 224);
        this.by = m.b(new jh(joVar, ikVar, 223));
        eS();
        eT();
        eU();
        eV();
        this.di = c.c(new jh(joVar, ikVar, 309));
        this.fB = m.b(new jh(joVar, ikVar, 311));
        this.dj = c.c(new jh(joVar, ikVar, 310));
        this.dk = m.b(new jh(joVar, ikVar, 308));
        this.dl = m.b(new jh(joVar, ikVar, 313));
        this.dm = m.b(new jh(joVar, ikVar, 314));
        this.dn = m.b(new jh(joVar, ikVar, 312));
        this.f6do = c.c(new jh(joVar, ikVar, 316));
        this.dp = c.c(new jh(joVar, ikVar, 317));
        this.dq = m.b(new jh(joVar, ikVar, 315));
        this.dr = c.c(new jh(joVar, ikVar, 318));
        this.ds = c.c(new jh(joVar, ikVar, 319));
        this.dt = new jh(joVar, ikVar, 320);
    }

    private final void eR() {
        jo joVar = this.f315a;
        ik ikVar = this.b;
        this.c = new jh(joVar, ikVar, 0);
        this.du = m.b(new jh(joVar, ikVar, 2));
        jo joVar2 = this.f315a;
        ik ikVar2 = this.b;
        this.d = new jh(joVar2, ikVar2, 1);
        this.e = m.b(new jh(joVar2, ikVar2, 4));
        this.dv = m.b(new jh(this.f315a, this.b, 5));
        jo joVar3 = this.f315a;
        ik ikVar3 = this.b;
        this.f = new jh(joVar3, ikVar3, 3);
        this.g = new jh(joVar3, ikVar3, 6);
        this.dw = c.c(new jh(joVar3, ikVar3, 8));
        this.h = c.c(new jh(this.f315a, this.b, 7));
        jo joVar4 = this.f315a;
        ik ikVar4 = this.b;
        this.i = new jh(joVar4, ikVar4, 9);
        this.dx = c.c(new jh(joVar4, ikVar4, 11));
        jo joVar5 = this.f315a;
        ik ikVar5 = this.b;
        this.j = new jh(joVar5, ikVar5, 10);
        this.k = new jh(joVar5, ikVar5, 12);
        this.dy = c.c(new jh(joVar5, ikVar5, 15));
        this.dz = c.c(new jh(this.f315a, this.b, 14));
        jo joVar6 = this.f315a;
        ik ikVar6 = this.b;
        this.l = new jh(joVar6, ikVar6, 13);
        this.dA = new jh(joVar6, ikVar6, 18);
        this.dB = new jh(joVar6, ikVar6, 19);
        this.dC = new jh(joVar6, ikVar6, 20);
        this.dD = new jh(joVar6, ikVar6, 21);
        this.dE = c.c(new jh(joVar6, ikVar6, 22));
        this.dF = c.c(new jh(this.f315a, this.b, 17));
        jo joVar7 = this.f315a;
        ik ikVar7 = this.b;
        this.m = new jh(joVar7, ikVar7, 16);
        this.dG = c.c(new jh(joVar7, ikVar7, 24));
        this.n = new jh(this.f315a, this.b, 23);
    }

    private final void eS() {
        jo joVar = this.f315a;
        ik ikVar = this.b;
        this.bz = new jh(joVar, ikVar, 225);
        this.bA = m.b(new jh(joVar, ikVar, 226));
        this.bB = m.b(new jh(this.f315a, this.b, 227));
        jo joVar2 = this.f315a;
        ik ikVar2 = this.b;
        this.bC = new jh(joVar2, ikVar2, 228);
        this.bD = m.b(new jh(joVar2, ikVar2, 229));
        this.bE = m.b(new jh(this.f315a, this.b, 222));
        this.bF = c.c(new jh(this.f315a, this.b, 221));
        jo joVar3 = this.f315a;
        ik ikVar3 = this.b;
        this.bG = new jh(joVar3, ikVar3, 230);
        this.bH = new jh(joVar3, ikVar3, 231);
        this.bI = new jh(joVar3, ikVar3, 232);
        this.bJ = new jh(joVar3, ikVar3, 233);
        this.bK = c.c(new jh(joVar3, ikVar3, 234));
        this.bL = c.c(new jh(this.f315a, this.b, 240));
        this.bM = m.b(new jh(this.f315a, this.b, 239));
        this.bN = m.b(new jh(this.f315a, this.b, 244));
        this.bO = m.b(new jh(this.f315a, this.b, 246));
        this.bP = m.b(new jh(this.f315a, this.b, 245));
        this.bQ = c.c(new jh(this.f315a, this.b, 243));
        this.bR = m.b(new jh(this.f315a, this.b, 242));
        this.bS = m.b(new jh(this.f315a, this.b, 241));
        this.bT = m.b(new jh(this.f315a, this.b, 238));
        this.bU = c.c(new jh(this.f315a, this.b, 237));
        this.bV = m.b(new jh(this.f315a, this.b, 236));
        this.bW = c.c(new jh(this.f315a, this.b, 235));
        this.bX = new jh(this.f315a, this.b, 247);
    }

    private final void eT() {
        jo joVar = this.f315a;
        ik ikVar = this.b;
        this.fo = new jh(joVar, ikVar, 248);
        this.bY = m.b(new jh(joVar, ikVar, 249));
        this.bZ = c.c(new jh(this.f315a, this.b, 250));
        jo joVar2 = this.f315a;
        ik ikVar2 = this.b;
        this.ca = new jh(joVar2, ikVar2, 251);
        jh jhVar = new jh(joVar2, ikVar2, 252);
        this.fp = jhVar;
        this.cb = v.d(jhVar);
        jh jhVar2 = new jh(this.f315a, this.b, 253);
        this.fq = jhVar2;
        this.cc = v.d(jhVar2);
        jh jhVar3 = new jh(this.f315a, this.b, 254);
        this.fr = jhVar3;
        this.cd = v.d(jhVar3);
        jh jhVar4 = new jh(this.f315a, this.b, 255);
        this.fs = jhVar4;
        this.ce = v.d(jhVar4);
        jo joVar3 = this.f315a;
        ik ikVar3 = this.b;
        this.cf = new jh(joVar3, ikVar3, 256);
        this.cg = new jh(joVar3, ikVar3, 257);
        jh jhVar5 = new jh(joVar3, ikVar3, 258);
        this.ft = jhVar5;
        this.ch = v.d(jhVar5);
        jh jhVar6 = new jh(this.f315a, this.b, 259);
        this.fu = jhVar6;
        this.ci = v.d(jhVar6);
        jo joVar4 = this.f315a;
        ik ikVar4 = this.b;
        this.cj = new jh(joVar4, ikVar4, 260);
        this.ck = new jh(joVar4, ikVar4, 261);
        this.cl = v.d(this.cg);
        jh jhVar7 = new jh(this.f315a, this.b, 262);
        this.fv = jhVar7;
        this.cm = v.d(jhVar7);
        jh jhVar8 = new jh(this.f315a, this.b, 263);
        this.fw = jhVar8;
        this.cn = v.d(jhVar8);
    }

    private final void eU() {
        jo joVar = this.f315a;
        ik ikVar = this.b;
        this.co = new jh(joVar, ikVar, 264);
        this.cp = new jh(joVar, ikVar, 265);
        this.cq = m.b(new jh(joVar, ikVar, 266));
        jo joVar2 = this.f315a;
        ik ikVar2 = this.b;
        this.cr = new jh(joVar2, ikVar2, 267);
        jh jhVar = new jh(joVar2, ikVar2, 268);
        this.fx = jhVar;
        this.cs = v.d(jhVar);
        jo joVar3 = this.f315a;
        ik ikVar3 = this.b;
        this.ct = new jh(joVar3, ikVar3, 270);
        this.cu = new jh(joVar3, ikVar3, 271);
        h c = c.c(new jh(joVar3, ikVar3, 269));
        this.fy = c;
        this.cv = v.d(c);
        h b = m.b(new jh(this.f315a, this.b, 272));
        this.fz = b;
        this.cw = v.d(b);
        jo joVar4 = this.f315a;
        ik ikVar4 = this.b;
        this.cx = new jh(joVar4, ikVar4, 273);
        this.cy = new jh(joVar4, ikVar4, 274);
        this.cz = c.c(new jh(joVar4, ikVar4, 275));
        this.cA = v.d(this.ck);
        jh jhVar2 = new jh(this.f315a, this.b, 276);
        this.fA = jhVar2;
        this.cB = v.d(jhVar2);
        this.cC = c.c(new jh(this.f315a, this.b, 277));
        this.cD = nx.b;
        jo joVar5 = this.f315a;
        ik ikVar5 = this.b;
        this.cE = new jh(joVar5, ikVar5, 278);
        this.cF = new jh(joVar5, ikVar5, 279);
        this.cG = c.c(new jh(joVar5, ikVar5, 280));
        this.cH = c.c(new jh(this.f315a, this.b, 281));
        this.cI = c.c(new jh(this.f315a, this.b, 283));
    }

    private final void eV() {
        this.cJ = c.c(new jh(this.f315a, this.b, 282));
        this.cK = c.c(new jh(this.f315a, this.b, 284));
        this.cL = c.c(new jh(this.f315a, this.b, 285));
        this.cM = c.c(new jh(this.f315a, this.b, 286));
        jo joVar = this.f315a;
        ik ikVar = this.b;
        this.cN = new jh(joVar, ikVar, 287);
        this.cO = new jh(joVar, ikVar, 288);
        this.cP = new jh(joVar, ikVar, 289);
        this.cQ = new jh(joVar, ikVar, 290);
        this.cR = new jh(joVar, ikVar, 291);
        this.cS = new jh(joVar, ikVar, 292);
        this.cT = new jh(joVar, ikVar, 293);
        this.cU = new jh(joVar, ikVar, 294);
        this.cV = c.c(new jh(joVar, ikVar, 295));
        this.cW = c.c(new jh(this.f315a, this.b, 297));
        this.cX = m.b(new jh(this.f315a, this.b, 296));
        this.cY = m.b(new jh(this.f315a, this.b, 298));
        this.cZ = m.b(new jh(this.f315a, this.b, 299));
        this.da = m.b(new jh(this.f315a, this.b, 300));
        this.db = m.b(new jh(this.f315a, this.b, 301));
        this.dc = m.b(new jh(this.f315a, this.b, 302));
        this.dd = m.b(new jh(this.f315a, this.b, 303));
        this.de = m.b(new jh(this.f315a, this.b, 304));
        this.df = c.c(new jh(this.f315a, this.b, 305));
        this.dg = m.b(new jh(this.f315a, this.b, 306));
        this.dh = m.b(new jh(this.f315a, this.b, 307));
    }

    public final s A() {
        return new s((g) this.ay.a());
    }

    final b B() {
        return new b((f) this.f315a.jg.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.n.d C() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.n.d(this.f315a.c.dQ());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.b D() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a.b(K(), new com.google.android.apps.search.assistant.surfaces.dictation.service.n.c.c((ContentResolver) this.f315a.mj.a(), (InputMethodManager) this.f315a.c.al.a(), C(), (n) this.f315a.R.a()), (a) this.az.a());
    }

    public final ai E() {
        return new ai((PackageManager) this.f315a.h.a());
    }

    public final be F() {
        Context context = (Context) this.f315a.f.a();
        nz nzVar = (nz) this.aX.a();
        ls lsVar = (ls) this.aY.a();
        context.getClass();
        nzVar.getClass();
        lsVar.getClass();
        ac acVar = ac.a;
        ba createBuilder = o.a.createBuilder();
        createBuilder.getClass();
        o build = createBuilder.build();
        build.getClass();
        return new be(context, nzVar.g(ab.a(build)));
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.q.m G() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.q.m(r(), (ConnectivityManager) this.f315a.wN.a(), eM(), H(), new op(new com.google.android.apps.search.assistant.surfaces.dictation.service.j.ab((g) this.ay.a())), Q(), new y((Context) this.f315a.f.a(), (i) this.aT.a()), L(), (ag) this.f315a.Q.a(), (ag) this.f315a.bo.a(), (n) this.f315a.R.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.q.y H() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.q.y((com.google.common.v.f) this.f315a.ez.a(), (cg) this.fa.a(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45408803").d(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45428608").d());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.r.a I() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.a((com.google.android.apps.search.assistant.verticals.a.a.a.a) this.b.dC.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) this.aA.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.r.b J() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.b((com.google.android.libraries.search.b.b) this.b.ba.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) this.aA.a());
    }

    final com.google.android.apps.search.assistant.surfaces.dictation.service.u.b K() {
        io.grpc.i iVar = (io.grpc.i) this.fd.a();
        iVar.getClass();
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.u.b(iVar);
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.z.b L() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.z.b((Context) this.f315a.f.a(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45351971").b(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45639534").b());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.z.e M() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.z.e((Executor) this.f315a.H.a(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45416002").f());
    }

    public final z N() {
        return new z(((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45400661").f());
    }

    public final ad O() {
        return new ad((com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) this.aA.a());
    }

    public final ao P() {
        return new ao(((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45429346").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.aa.ab Q() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.aa.ab(Optional.of(this.b.f308a.fp()), (cr) this.f315a.H.a());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.dictation.service.f.a] */
    public final com.google.android.apps.search.assistant.surfaces.dictation.service.ab.f R() {
        jx jxVar = this.f315a.c;
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.ab.f((com.google.android.apps.search.assistant.surfaces.dictation.service.f.a) dp(), new com.google.android.libraries.storage.a.b((cq) jxVar.f325a.v.a(), (j) jxVar.f325a.as.a()), (Executor) this.f315a.v.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.a.a.a.b S() {
        return new com.google.android.apps.search.assistant.surfaces.voice.a.a.a.b((n) this.f315a.P.a(), (com.google.android.apps.search.assistant.verticals.a.b.c) this.b.b.i.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.d T() {
        return new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.d(c.b(this.b.b.j), c.b(this.b.b.k), c.b(this.b.b.l), c.b(this.b.b.m), c.b(this.b.b.n), c.b(this.b.b.o), c.b(this.b.b.p), c.b(this.b.b.q), c.b(this.b.b.r), c.b(this.f315a.b.gb), (n) this.f315a.P.a());
    }

    public final k U() {
        n nVar = (n) this.f315a.P.a();
        h hVar = this.dH;
        h hVar2 = this.dM;
        h hVar3 = this.dL;
        return new k(nVar, c.b(this.dJ), c.b(this.dK), c.b(hVar3), c.b(hVar2), (com.google.android.apps.search.assistant.surfaces.voice.h.c.a.e) hVar.a(), (com.google.android.libraries.g.a) this.f315a.g.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.h.b.a V() {
        return new com.google.android.apps.search.assistant.surfaces.voice.h.b.a(this.f315a.b.M());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.h.c.b.e W() {
        return new com.google.android.apps.search.assistant.surfaces.voice.h.c.b.e((am) this.b.z.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.as.a(), ((e) this.b.b.ob().a.a()).a("com.google.android.apps.search.assistant.user 45429777").f(), this.b.aY());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.i.c.c X() {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.c.c((com.google.android.apps.search.assistant.surfaces.voice.c.b) this.dG.a(), (Executor) this.f315a.b.gp.a(), (n) this.f315a.P.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.h.v Y() {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.g.h.v((bn) this.b.f308a.fs.a(), (ap) this.b.ai.a(), Optional.of((com.google.android.apps.search.assistant.surfaces.voice.e.i.b) this.b.cV.a()), (n) this.f315a.P.a(), (ae) this.b.cF.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.h Z() {
        com.google.android.libraries.phenotype.client.a.i iVar = (com.google.android.libraries.phenotype.client.a.i) this.f315a.x.a();
        ag agVar = (ag) this.f315a.Q.a();
        boolean ed = ed();
        String str = (String) this.f315a.Y.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f315a.g.a();
        p pVar = (p) this.f315a.b.o.a();
        com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) this.b.ba.a();
        am amVar = (am) this.b.z.a();
        jj jjVar = this.b.f308a;
        com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.b hI = this.f315a.b.hI();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.d.s ap = jjVar.ap();
        boolean ep = ep();
        boolean f = ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45630103").f();
        ag agVar2 = (ag) this.f315a.Q.a();
        jj jjVar2 = this.b.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.h(iVar, agVar, ed, str, aVar, pVar, bVar, amVar, hI, ap, ep, f, agVar2, jjVar2.qg(), eC(), dF(), jjVar2.mP());
    }

    public final long a() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45623336").b();
    }

    public final com.google.android.libraries.assistant.soda.s3client.h aA() {
        return new com.google.android.libraries.assistant.soda.s3client.h((Context) this.f315a.f.a(), (Optional) this.f315a.km.a, this.fn, (dj) this.b.q.a());
    }

    public final com.google.android.libraries.search.b.b aB() {
        com.google.android.libraries.search.t.a.a aVar = (com.google.android.libraries.search.t.a.a) this.b.J.a();
        aVar.getClass();
        com.google.android.libraries.search.b.b a2 = aVar.a(com.google.android.libraries.search.t.c.ASSISTANT);
        a2.getClass();
        return a2;
    }

    public final com.google.android.libraries.search.assistant.n.a.a.b aC() {
        return aT().a("asst.communication.call");
    }

    public final com.google.android.libraries.search.assistant.n.a.a.b aD() {
        return aT().a("asst.dialog.state.params");
    }

    public final com.google.android.libraries.search.assistant.n.a.a.b aE() {
        return aT().a("asst.communication.message");
    }

    public final com.google.android.libraries.search.assistant.n.a.a.b aF() {
        return aT().a("asst.query.context.params");
    }

    public final com.google.android.libraries.search.assistant.n.a.a.b aG() {
        return aT().a("asst.request.logging.params");
    }

    public final com.google.android.libraries.search.assistant.p.d.a.a.d aH() {
        return new com.google.android.libraries.search.assistant.p.d.a.a.d(this.ey, this.ez);
    }

    public final com.google.android.libraries.search.assistant.invocation.a.e.d aI() {
        return new com.google.android.libraries.search.assistant.invocation.a.e.d(new l((com.google.android.libraries.search.assistant.invocation.a.e.a.o) this.du.a()), (com.google.android.libraries.search.assistant.invocation.h.a.b.k) this.f315a.fO.a(), (n) this.f315a.R.a());
    }

    public final com.google.android.libraries.search.assistant.invocation.k.e.g aJ() {
        ag agVar = (ag) this.f315a.Q.a();
        x xVar = (x) this.dv.a();
        jx jxVar = this.f315a.c;
        return new com.google.android.libraries.search.assistant.invocation.k.e.g(agVar, xVar, new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.b((ay) jxVar.f325a.fS.a(), (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.j.b.a) jxVar.f325a.b.bp.a()));
    }

    public final com.google.android.libraries.search.assistant.invocation.o.d.j aK() {
        return new com.google.android.libraries.search.assistant.invocation.o.d.j((ay) this.f315a.fS.a(), (n) this.f315a.R.a());
    }

    public final com.google.android.libraries.search.assistant.invocation.t.d.f aL() {
        return new com.google.android.libraries.search.assistant.invocation.t.d.f((n) this.f315a.R.a(), (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.f) this.el.a());
    }

    public final com.google.android.libraries.search.assistant.ah.c.f aM() {
        return new com.google.android.libraries.search.assistant.ah.c.f((com.google.android.libraries.search.l.p) this.b.P.a(), (com.google.frameworks.client.data.android.a.d) this.f315a.ma.a(), (com.google.apps.tiktok.account.data.a.d) this.f315a.bq.a());
    }

    public final com.google.android.libraries.search.assistant.ai.a.a.s aN() {
        Context context = (Context) this.f315a.f.a();
        jo joVar = this.f315a;
        com.google.android.libraries.search.assistant.ai.a.a.f fVar = new com.google.android.libraries.search.assistant.ai.a.a.f(joVar.f319a.Q(), (Context) joVar.f.a(), (cr) this.f315a.H.a());
        com.google.android.libraries.search.assistant.ai.a.a.j jVar = (com.google.android.libraries.search.assistant.ai.a.a.j) this.dN.a();
        com.google.android.libraries.search.assistant.ai.b.d.g gVar = (com.google.android.libraries.search.assistant.ai.b.d.g) this.r.a();
        com.google.android.libraries.search.assistant.ai.b.g.g gVar2 = (com.google.android.libraries.search.assistant.ai.b.g.g) this.b.bn.a();
        h hVar = this.s;
        return new com.google.android.libraries.search.assistant.ai.a.a.s(context, fVar, jVar, gVar, gVar2, aO(), this.f315a.f319a.Q(), (com.google.android.libraries.search.assistant.ai.d.a.d) hVar.a(), (n) this.f315a.P.a());
    }

    public final com.google.android.libraries.search.assistant.ai.b.a.c aO() {
        return new com.google.android.libraries.search.assistant.ai.b.a.c((Context) this.f315a.f.a(), (com.google.apps.tiktok.concurrent.ao) this.f315a.bz.a());
    }

    public final t aP() {
        return new t((com.google.android.libraries.search.assistant.ai.c.a.d) this.ew.a(), (n) this.f315a.P.a());
    }

    public final q aQ() {
        w wVar = (w) this.b.cS.a();
        ik ikVar = this.b;
        je jeVar = ikVar.c;
        return new q(wVar, (an) ikVar.qF(), jeVar.cg(), ikVar.iF());
    }

    public final com.google.android.libraries.search.assistant.ap.c.c.b.f aR() {
        return new com.google.android.libraries.search.assistant.ap.c.c.b.f(bi());
    }

    public final com.google.android.libraries.search.assistant.ap.c.h.a aS() {
        return new com.google.android.libraries.search.assistant.ap.c.h.a((Context) this.f315a.f.a());
    }

    final com.google.android.libraries.search.assistant.ap.d.a.a aT() {
        return new com.google.android.libraries.search.assistant.ap.d.a.a((com.google.android.libraries.search.assistant.ap.d.a.c) this.y.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.a.c aU() {
        com.google.android.libraries.search.assistant.aq.g.a bj = bj();
        ag agVar = (ag) this.f315a.Q.a();
        ik ikVar = this.b;
        jo joVar = this.f315a;
        return new com.google.android.libraries.search.assistant.ap.d.b.a.c(bj, agVar, joVar.f319a.gY, joVar.b.h(), h.a.a.f.b.a.n.p(ikVar.l), this.f315a.b.hq());
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.b.c aV() {
        return new com.google.android.libraries.search.assistant.ap.d.b.b.c((ag) this.f315a.Q.a(), this.b.b.cU().c(com.google.android.libraries.search.x.b.b.TAG_ASSISTANT_MOBILE_ASSISTANT));
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.c.c aW() {
        return new com.google.android.libraries.search.assistant.ap.d.b.c.c((ag) this.f315a.Q.a(), c.b(this.dW), (com.google.android.apps.search.assistant.platform.g.k.a.d) this.b.Z.a(), (com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.d.b aX() {
        return new com.google.android.libraries.search.assistant.ap.d.b.d.b((ag) this.f315a.bo.a(), new com.google.android.libraries.search.assistant.aq.p.d(this.dX, this.f315a.bo, (byte[]) null));
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.e.b aY() {
        return new com.google.android.libraries.search.assistant.ap.d.b.e.b((ag) this.f315a.Q.a(), (com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.f.b aZ() {
        return new com.google.android.libraries.search.assistant.ap.d.b.f.b((ag) this.f315a.bo.a(), new com.google.android.libraries.search.assistant.aq.p.d(this.dX, this.f315a.bo));
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.a.a.g aa() {
        return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.a.a.g((ag) this.f315a.Q.a(), (cq) this.f315a.H.a(), (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.c.a.b) this.er.a(), (com.google.android.libraries.search.assistant.invocation.m.a.f) this.f315a.fR.a(), (com.google.android.libraries.search.assistant.invocation.l.h) this.f315a.fQ.a(), (com.google.android.libraries.search.assistant.spokennotifications.autoread.a.b.e) this.b.f308a.fz.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.notification.a.a.a.c ab() {
        ag agVar = (ag) this.f315a.Q.a();
        Context context = (Context) this.f315a.f.a();
        com.google.android.apps.search.assistant.platform.g.q.a aVar = (com.google.android.apps.search.assistant.platform.g.q.a) this.b.f308a.fB.a();
        ik ikVar = this.b;
        return new com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.notification.a.a.a.c(agVar, context, aVar, ikVar.iA(), ((e) new h.a.a.f.b.a.k(ikVar.l).a.a()).a("com.google.android.apps.search.assistant.user 45646256").f(), ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45646257").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.m.b.a.b.i ac() {
        return new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.b.i(((e) this.f315a.c.f325a.b.iJ().a.a()).a("com.google.android.apps.search.assistant.device 45358810").f(), ((e) this.f315a.c.f325a.b.iJ().a.a()).a("com.google.android.apps.search.assistant.device 45358708").b(), ((e) this.f315a.c.f325a.b.iJ().a.a()).a("com.google.android.apps.search.assistant.device 45358694").b(), ((e) this.f315a.c.f325a.b.iJ().a.a()).a("com.google.android.apps.search.assistant.device 45362475").b(), ((e) this.f315a.c.f325a.b.iJ().a.a()).a("com.google.android.apps.search.assistant.device 45358707").b(), (cg) this.fm.a(), androidx.compose.ui.l.f.aC((Context) this.f315a.f.a(), bw()), new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.b.d((cg) this.fm.a(), (com.google.common.v.f) this.f315a.ez.a(), (cq) this.f315a.H.a()), (com.google.common.v.f) this.f315a.ez.a(), (cr) this.f315a.H.a(), (Context) this.f315a.f.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ah.n ad() {
        n nVar = (n) this.f315a.P.a();
        ik ikVar = this.b;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ah.n(nVar, ikVar.b.cl(), ikVar.c.al());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.am.m ae() {
        com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.ai.a();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.as.a();
        this.b.cD();
        n nVar = (n) this.f315a.P.a();
        am amVar = (am) this.b.z.a();
        ik ikVar = this.b;
        boolean nV = ikVar.f308a.nV();
        boolean f = ((e) ikVar.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45616927").f();
        boolean f2 = ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45616928").f();
        com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.b.aO.a();
        com.google.android.apps.search.assistant.surfaces.voice.robin.c.g gVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.c.g) this.b.bB.a();
        Context context = (Context) this.f315a.f.a();
        h hVar = this.f315a.ta;
        boolean dU = dU();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i iVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i) hVar.a();
        com.google.android.apps.search.assistant.surfaces.voice.robin.ao.e eVar3 = (com.google.android.apps.search.assistant.surfaces.voice.robin.ao.e) this.b.f308a.ak.a();
        ik ikVar2 = this.b;
        jj jjVar = ikVar2.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.am.m(eVar, eVar2, nVar, amVar, nV, f, f2, kVar, gVar, context, dU, iVar, eVar3, ikVar2.b.gL(), jjVar.aT(), jjVar.sm().J(), (Executor) this.f315a.B.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.c af() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.a.c((com.google.android.libraries.search.b.b) this.b.aV.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.i ag() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.c.i((ag) this.f315a.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.query.b.k) this.b.f308a.I.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d) this.b.f308a.ah.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.t.ad ah() {
        return new com.google.android.apps.search.assistant.surfaces.voice.t.ad(((e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45461847").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.e.a.h ai() {
        return new com.google.android.apps.search.assistant.surfaces.e.a.h(((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45365043").f(), (com.google.android.libraries.search.d.e.a.c) this.f315a.fx.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.e.c.f aj() {
        return new com.google.android.apps.search.assistant.surfaces.e.c.f(this.b.ba);
    }

    public final com.google.android.apps.search.assistant.surfaces.e.d.d.g ak() {
        return new com.google.android.apps.search.assistant.surfaces.e.d.d.g((Context) this.f315a.f.a(), dW());
    }

    public final com.google.android.apps.search.assistant.surfaces.e.d.e.b al() {
        return new com.google.android.apps.search.assistant.surfaces.e.d.e.b((Context) this.f315a.f.a(), (ag) this.f315a.Q.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.e.d.e.t am() {
        return new com.google.android.apps.search.assistant.surfaces.e.d.e.t(this.eo);
    }

    public final bb an() {
        jx jxVar = this.f315a.c;
        Executor executor = (Executor) jxVar.f325a.H.a();
        jo joVar = jxVar.f325a;
        return new bb(new com.google.android.libraries.search.assistant.aw.a.a.a.h(executor, new com.google.android.libraries.search.assistant.aw.a.a.a.p(joVar.n, joVar.bz), new com.google.android.libraries.search.assistant.aw.a.a.a.f((Context) jxVar.f325a.f.a(), (com.google.apps.tiktok.concurrent.ao) jxVar.f325a.bz.a())), this.f315a.b.aN(), ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45368292").f(), dW(), (com.google.android.libraries.search.assistant.aw.b.a.b) this.b.dJ.a());
    }

    public final com.google.android.apps.search.assistant.verticals.automation.routines.e.a.a ao() {
        return new com.google.android.apps.search.assistant.verticals.automation.routines.e.a.a(this.b.jl());
    }

    public final com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l ap() {
        je jeVar = this.b.c;
        h hVar = jeVar.V;
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.q bc = jeVar.bc();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.o oVar = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.o) hVar.a();
        com.google.android.libraries.search.ac.b.c.o oVar2 = (com.google.android.libraries.search.ac.b.c.o) this.b.c.ac.a();
        com.google.android.apps.search.googleapp.search.suggest.c.a aVar = (com.google.android.apps.search.googleapp.search.suggest.c.a) this.b.c.ad.a();
        com.google.android.libraries.search.ac.b.c.e eVar = (com.google.android.libraries.search.ac.b.c.e) this.b.c.Z.a();
        jo joVar = this.f315a;
        return new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l(bc, oVar, oVar2, aVar, eVar, this.b.f308a.ff(), (com.google.android.libraries.g.a) joVar.g.a(), (Executor) this.f315a.B.a(), (n) this.f315a.qN.a(), this.b.c.hp(), (com.google.android.libraries.search.t.h.b) this.f315a.b.gH.a());
    }

    final aq aq() {
        return new aq((Context) this.f315a.f.a(), this.b.c.aZ());
    }

    public final u ar() {
        int i = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j.a;
        ik ikVar = this.b;
        je jeVar = ikVar.c;
        jj jjVar = ikVar.f308a;
        com.google.android.libraries.search.ac.b.g.ac ff = jjVar.ff();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.q bc = jeVar.bc();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.i iVar = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.i) jjVar.ee.a();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.e eVar = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.e) this.dP.a();
        aq aq = aq();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l ap = ap();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f315a.g.a();
        boolean f = ((e) this.f315a.c.f325a.b.iY().a.a()).a("com.google.android.libraries.search.googleapp.device 45626779").f();
        com.google.android.apps.search.googleapp.search.h.l lVar = (com.google.android.apps.search.googleapp.search.h.l) this.b.c.ak.a();
        Context context = (Context) this.f315a.f.a();
        ag agVar = (ag) this.f315a.Q.a();
        com.google.android.apps.search.googleapp.search.j.c cVar = (com.google.android.apps.search.googleapp.search.j.c) this.b.c.ao.a();
        com.google.android.apps.search.googleapp.search.srp.l.u uVar = (com.google.android.apps.search.googleapp.search.srp.l.u) this.b.c.ar.a();
        je jeVar2 = this.b.c;
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.an anVar = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.an(ff, bc, iVar, eVar, aq, ap, aVar, f, lVar, context, agVar, cVar, uVar, jeVar2.aW(), ((Boolean) jeVar2.au.a()).booleanValue());
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.d dVar = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.d((com.google.apps.tiktok.media.j) this.f315a.ne.a(), (Executor) this.f315a.v.a(), (com.google.android.libraries.g.a) this.f315a.g.a());
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.e eVar2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.e) this.dP.a();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.ai aiVar = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.ai) this.dQ.a();
        com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.l ap2 = ap();
        Context context2 = (Context) this.f315a.f.a();
        ik ikVar2 = this.b;
        return new u(anVar, dVar, eVar2, aiVar, ap2, new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.f(context2, ikVar2.f308a.ff(), (AccountId) ikVar2.g.a(), this.b.c.bc()), aq(), (n) this.f315a.P.a(), this.b.f308a.sx().S());
    }

    public final com.google.android.apps.search.googleapp.search.voicesearch.b.p as() {
        jo joVar = this.f315a;
        com.google.android.libraries.search.ad.e.n lt = joVar.lt();
        n nVar = (n) joVar.P.a();
        ag agVar = (ag) this.f315a.Q.a();
        ag agVar2 = (ag) this.f315a.Q.a();
        com.google.android.libraries.web.webview.i.a.a.i iVar = (com.google.android.libraries.web.webview.i.a.a.i) this.b.t.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f315a.bN.a();
        AccountId accountId = (AccountId) this.b.g.a();
        je jeVar = this.b.c;
        com.google.android.libraries.search.h.d aJ = this.f315a.b.aJ();
        com.google.android.libraries.search.ad.d.d co = jeVar.co();
        Context context = (Context) this.f315a.f.a();
        AccountId accountId2 = (AccountId) this.b.g.a();
        jo joVar2 = this.f315a;
        com.google.android.apps.search.googleapp.y.a.b cr = this.b.f308a.cr();
        n nVar2 = (n) joVar2.R.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f315a.bq.a();
        h hVar = this.eB;
        com.google.android.apps.search.googleapp.search.i.d aT = this.b.c.aT();
        AtomicReference atomicReference = (AtomicReference) hVar.a();
        ik ikVar = this.b;
        je jeVar2 = ikVar.c;
        com.google.android.apps.search.googleapp.search.voicesearch.b.c.h hVar2 = new com.google.android.apps.search.googleapp.search.voicesearch.b.c.h(context, accountId2, cr, nVar2, dVar, aT, atomicReference, ikVar.ka(), ikVar.f308a.bx(), jeVar2.fI());
        com.google.android.apps.search.googleapp.customtabs.b.j jVar = (com.google.android.apps.search.googleapp.customtabs.b.j) this.b.f308a.f7do.a();
        boolean f = ((e) this.f315a.c.f325a.b.jG().a.a()).a("com.google.android.libraries.search.googleapp.device 45614766").f();
        h hVar3 = this.b.f308a.aC;
        com.google.android.libraries.search.a.c.f av = this.f315a.b.av();
        com.google.android.libraries.search.ap.b.b bVar2 = (com.google.android.libraries.search.ap.b.b) hVar3.a();
        ik ikVar2 = this.b;
        r rVar = new r(agVar2, iVar, bVar, accountId, aJ, co, hVar2, jVar, f, av, bVar2, ikVar2.c.aT(), (com.google.android.libraries.search.account.e.b) ikVar2.u.a(), (AtomicReference) this.eC.a(), this.b.f308a.fo(), this.f315a.gu());
        az azVar = (az) this.b.c.aq.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f315a.g.a();
        ik ikVar3 = this.b;
        com.google.android.apps.search.googleapp.search.voicesearch.b.c.k kVar = new com.google.android.apps.search.googleapp.search.voicesearch.b.c.k(nVar, agVar, rVar, azVar, aVar, ikVar3.f308a.cB(), (com.google.android.libraries.search.a.b.q) ikVar3.dg.a());
        com.google.android.apps.search.googleapp.d.f fVar = (com.google.android.apps.search.googleapp.d.f) this.b.f308a.aF.a();
        com.google.android.apps.search.googleapp.search.voicesearch.b.a aVar2 = new com.google.android.apps.search.googleapp.search.voicesearch.b.a((ContentResolver) this.f315a.mj.a());
        com.google.android.apps.search.googleapp.search.j.c cVar = (com.google.android.apps.search.googleapp.search.j.c) this.b.c.ao.a();
        ik ikVar4 = this.b;
        je jeVar3 = ikVar4.c;
        return new com.google.android.apps.search.googleapp.search.voicesearch.b.p(lt, kVar, fVar, aVar2, cVar, ikVar4.f308a.bB(), jeVar3.bg(), jeVar3.lF().m(), this.b.c.lF().h());
    }

    public final com.google.android.libraries.assistant.c.b.g.ag at() {
        return new com.google.android.libraries.assistant.c.b.g.ag((cq) this.f315a.v.a());
    }

    public final com.google.android.libraries.assistant.auto.jumpboost.b.a.g au() {
        return new com.google.android.libraries.assistant.auto.jumpboost.b.a.g((com.google.android.apps.gsa.search.shared.service.t) this.f315a.c.l.a(), (com.google.android.libraries.assistant.auto.jumpboost.b.a.d) this.f315a.c.n.a(), (com.google.android.libraries.gsa.h.h) this.f315a.gv.a());
    }

    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ac av() {
        jj jjVar = this.b.f308a;
        jo joVar = this.f315a;
        jx jxVar = joVar.c;
        h hVar = joVar.b.gc;
        h hVar2 = jxVar.q;
        cg fY = jxVar.fY();
        com.google.android.apps.search.assistant.surfaces.b.b.a.c cVar = (com.google.android.apps.search.assistant.surfaces.b.b.a.c) jjVar.j.a();
        com.google.android.apps.search.assistant.surfaces.b.b.a.e eVar = (com.google.android.apps.search.assistant.surfaces.b.b.a.e) this.f315a.ea.a();
        com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) this.b.ax.a();
        jx jxVar2 = this.f315a.c;
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.c dA = this.b.f308a.dA();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.a aVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.a) jxVar2.r.a();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n nVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.n) this.f315a.f319a.bT.a();
        Optional optional = (Optional) this.b.f308a.m.a();
        jo joVar2 = this.f315a;
        jx jxVar3 = joVar2.c;
        com.google.android.libraries.assistant.auto.tng.media.d.a.a xT = this.b.xT();
        h hVar3 = jxVar3.s;
        Executor executor = (Executor) joVar2.v.a();
        com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.b bVar = (com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.b) this.b.ec.a();
        com.google.android.libraries.assistant.auto.jumpboost.e.d dVar = (com.google.android.libraries.assistant.auto.jumpboost.e.d) this.b.f308a.l.a();
        cb cbVar = (cb) this.f315a.dm.a();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l lVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l) this.f315a.f9do.a();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ad adVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ad) this.f315a.c.t.a();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j jVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j) this.f315a.f319a.bQ.a();
        jo joVar3 = this.f315a;
        h hVar4 = joVar3.c.u;
        com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) joVar3.W.a();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f315a.g.a();
        jo joVar4 = this.f315a;
        h hVar5 = joVar4.c.v;
        aa aaVar = (aa) joVar4.dp.a();
        Context context = (Context) this.f315a.f.a();
        h hVar6 = this.f315a.c.w;
        Optional empty = Optional.empty();
        jo joVar5 = this.f315a;
        ik ikVar = this.b;
        jx jxVar4 = joVar5.c;
        h hVar7 = joVar5.f319a.bO;
        h hVar8 = ikVar.es;
        h hVar9 = jxVar4.x;
        jr jrVar = joVar5.b;
        h hVar10 = jrVar.dv;
        h hVar11 = jrVar.dw;
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ae aw = aw();
        ak eQ = this.b.f308a.eQ();
        com.google.android.libraries.assistant.auto.jumpboost.b.a.g au = au();
        ik ikVar2 = this.b;
        jy jyVar = this.f315a.f319a;
        com.google.android.libraries.assistant.auto.jumpboost.o.c dB = ikVar2.f308a.dB();
        e.a b = c.b(jyVar.bM);
        Executor executor2 = (Executor) this.f315a.H.a();
        ag agVar = (ag) this.f315a.Q.a();
        jo joVar6 = this.f315a;
        jy jyVar2 = joVar6.f319a;
        jx jxVar5 = joVar6.c;
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ak gj = jxVar5.gj();
        h hVar12 = jxVar5.p;
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s sVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.s) jyVar2.cP.a();
        je jeVar = this.b.c;
        com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.a aVar3 = (com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.a) jeVar.U.a();
        com.google.android.libraries.assistant.auto.tng.j.c.c.c.e eVar2 = (com.google.android.libraries.assistant.auto.tng.j.c.c.c.e) this.b.f308a.k.a();
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b bVar2 = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.d.b) this.f315a.f319a.bN.a();
        fu m = fu.m(com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ag.a, new com.google.android.libraries.assistant.auto.tng.suggestions.j.a((com.google.android.libraries.assistant.auto.tng.suggestions.j.s) this.b.f308a.ff.a()));
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.u uVar = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.u(this.b.b.cI());
        jo joVar7 = this.f315a;
        dj djVar = (dj) this.b.q.a();
        jo joVar8 = this.f315a;
        jy jyVar3 = joVar8.f319a;
        jx jxVar6 = joVar8.c;
        com.google.android.libraries.assistant.auto.jumpboost.i.b hr = joVar8.hr();
        com.google.android.libraries.assistant.auto.tng.z.a.b.e eVar3 = new com.google.android.libraries.assistant.auto.tng.z.a.b.e(jxVar6.ak(), (com.google.android.libraries.search.assistant.b.a) jyVar3.bK.a(), this.b.q, (cq) this.f315a.H.a());
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.f fVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.f) this.f315a.b.fv.a();
        jx jxVar7 = joVar7.c;
        h hVar13 = jxVar7.B;
        h hVar14 = jxVar7.C;
        h hVar15 = jeVar.S;
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ac(hVar, hVar2, fY, cVar, eVar, gVar, dA, aVar, nVar, optional, xT, hVar3, executor, bVar, dVar, cbVar, lVar, adVar, jVar, hVar4, yVar, aVar2, hVar5, aaVar, context, hVar6, ikVar.aw, empty, hVar7, hVar8, jrVar.co, hVar9, hVar10, hVar11, aw, eQ, au, dB, b, executor2, agVar, gj, hVar12, sVar, hVar15, aVar3, eVar2, bVar2, m, uVar, hVar13, hVar14, djVar, hr, eVar3, fVar);
    }

    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ae aw() {
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ae(this.b.f308a.eQ());
    }

    public final ah ax() {
        AccountId accountId = (AccountId) this.b.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f315a.bq.a();
        h hVar = this.b.aG;
        com.google.android.libraries.assistant.auto.jumpboost.b.a.g au = au();
        com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar.a();
        Executor executor = (Executor) this.f315a.H.a();
        jo joVar = this.f315a;
        jx jxVar = joVar.c;
        h hVar2 = jxVar.o;
        h hVar3 = jxVar.p;
        Executor executor2 = (Executor) joVar.H.a();
        AccountId accountId2 = (AccountId) this.b.g.a();
        com.google.apps.tiktok.account.data.a.d dVar2 = (com.google.apps.tiktok.account.data.a.d) this.f315a.bq.a();
        com.google.android.apps.gsa.search.core.h.p pVar = (com.google.android.apps.gsa.search.core.h.p) this.f315a.gq.a();
        at atVar = (at) this.f315a.f319a.by.a();
        return new ah(accountId, dVar, au, gVar, executor, hVar2, hVar3, joVar.b.bY, !atVar.h() ? new com.google.android.apps.gsa.u.c.a.a() : new com.google.android.apps.gsa.u.c.a.b(dVar2, accountId2, pVar, atVar, executor2), (com.google.android.libraries.search.t.i.y) this.f315a.W.a());
    }

    public final com.google.android.libraries.assistant.auto.tng.f.e.b.a.k ay() {
        com.google.android.libraries.search.assistant.az.a.b.a.e eVar = (com.google.android.libraries.search.assistant.az.a.b.a.e) this.b.ex.a();
        com.google.android.libraries.assistant.auto.tng.f.e.b.a.l lVar = (com.google.android.libraries.assistant.auto.tng.f.e.b.a.l) this.b.eB.a();
        com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) this.b.aG.a();
        com.google.android.libraries.search.assistant.az.a.b.b.d dVar = (com.google.android.libraries.search.assistant.az.a.b.b.d) this.b.eC.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f315a.g.a();
        Executor executor = (Executor) this.f315a.H.a();
        ik ikVar = this.b;
        com.google.android.libraries.search.assistant.az.a.b.a.c.i iV = ikVar.iV();
        jo joVar = this.f315a;
        return new com.google.android.libraries.assistant.auto.tng.f.e.b.a.k(eVar, lVar, gVar, dVar, aVar, executor, iV, joVar.c.F, ikVar.eD, ikVar.eE, this.dA, this.dB, this.dC, this.dD, joVar.b.gg);
    }

    public final com.google.android.libraries.assistant.auto.tng.suggestions.j.d az() {
        com.google.android.libraries.search.assistant.b.a aVar = (com.google.android.libraries.search.assistant.b.a) this.f315a.f319a.bK.a();
        com.google.android.libraries.assistant.auto.tng.suggestions.e.a.d dVar = (com.google.android.libraries.assistant.auto.tng.suggestions.e.a.d) this.b.f308a.c.a();
        com.google.android.libraries.assistant.pcp.q.a aVar2 = (com.google.android.libraries.assistant.pcp.q.a) this.f315a.oP.a();
        com.google.android.libraries.assistant.auto.tng.suggestions.j.a.b bVar = (com.google.android.libraries.assistant.auto.tng.suggestions.j.a.b) this.b.f308a.fe.a();
        jo joVar = this.f315a;
        return new com.google.android.libraries.assistant.auto.tng.suggestions.j.d(aVar, dVar, aVar2, bVar, joVar.iw(), (com.google.android.libraries.g.a) joVar.g.a(), (Context) this.f315a.f.a(), (Executor) this.f315a.v.a(), (Executor) this.f315a.H.a(), (com.google.android.libraries.search.b.b) this.b.ax.a(), this.f315a.b.fx);
    }

    public final long b() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45623365").b();
    }

    public final com.google.protobuf.ao bA() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45477502").d();
    }

    final com.google.protobuf.ao bB() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45419596").d();
    }

    final com.google.protobuf.ao bC() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45417206").d();
    }

    public final com.google.protobuf.ao bD() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45621202").d();
    }

    public final com.google.protobuf.ao bE() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45461787").d();
    }

    public final com.google.protobuf.ao bF() {
        return ((e) this.b.f308a.rZ().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45408126").d();
    }

    public final com.google.protobuf.ao bG() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45616473").d();
    }

    final com.google.protobuf.ao bH() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45381321").d();
    }

    final com.google.protobuf.ao bI() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45377822").d();
    }

    public final com.google.protos.l.a.b bJ() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45354782").d();
    }

    public final com.google.protos.l.a.b bK() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45358146").d();
    }

    public final com.google.protos.l.a.e bL() {
        com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a aVar = (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.b.b.af.a();
        com.google.protos.l.a.e d = ((e) this.b.f308a.sm().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45462861").d();
        boolean k = h.a.a.d.b.a.ae.k(this.b.l);
        aVar.getClass();
        com.google.protos.l.a.d createBuilder = com.google.protos.l.a.e.a.createBuilder();
        createBuilder.getClass();
        com.google.protos.l.a.a.b(createBuilder);
        createBuilder.q("and.opa.deeplink");
        com.google.protos.l.a.a.b(createBuilder);
        createBuilder.q("and.opa.conversation.deeplink");
        com.google.protos.l.a.a.b(createBuilder);
        createBuilder.q("and.opa.launcher.shortcut");
        return (com.google.protos.l.a.e) aVar.a(com.google.protos.l.a.a.a(createBuilder), d, k).a();
    }

    public final com.google.speech.g.bn bM() {
        com.google.speech.g.bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.b.V, (com.google.apps.tiktok.p.m) this.f315a.f319a.hU.a(), (com.google.apps.tiktok.p.u) this.f315a.mh.a(), (com.google.frameworks.client.data.android.d) this.f315a.mb.a(), com.google.common.base.a.a);
        q.getClass();
        return q;
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.g.a ba() {
        return new com.google.android.libraries.search.assistant.ap.d.b.g.a((com.google.android.libraries.search.assistant.ap.d.d.a) this.A.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.h.c bb() {
        com.google.android.libraries.search.assistant.aq.g.a bj = bj();
        ag agVar = (ag) this.f315a.Q.a();
        ik ikVar = this.b;
        jo joVar = this.f315a;
        return new com.google.android.libraries.search.assistant.ap.d.b.h.c(bj, agVar, joVar.f319a.gY, joVar.b.h(), h.a.a.f.b.a.n.p(ikVar.l));
    }

    public final com.google.android.libraries.search.assistant.ap.d.b.i.c bc() {
        com.google.android.libraries.search.assistant.aq.g.a bj = bj();
        ag agVar = (ag) this.f315a.Q.a();
        ik ikVar = this.b;
        jo joVar = this.f315a;
        return new com.google.android.libraries.search.assistant.ap.d.b.i.c(bj, agVar, joVar.f319a.gY, joVar.b.h(), h.a.a.f.b.a.n.p(ikVar.l));
    }

    public final com.google.android.libraries.search.assistant.ap.d.e.a.a.c bd() {
        jo joVar = this.f315a;
        return new com.google.android.libraries.search.assistant.ap.d.e.a.a.c(this.b.b.fP(), (ag) joVar.Q.a(), this.b.iK(), (com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a(), (com.google.android.apps.search.assistant.platform.g.k.a.d) this.b.Z.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.e.a.b.c be() {
        return new com.google.android.libraries.search.assistant.ap.d.e.a.b.c((ag) this.f315a.Q.a(), (com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.e.a.c.c bf() {
        return new com.google.android.libraries.search.assistant.ap.d.e.a.c.c((ag) this.f315a.Q.a(), (com.google.android.libraries.search.assistant.performer.h.d.i) this.b.f308a.fM.a(), (com.google.android.libraries.search.assistant.aq.o.e) this.b.f308a.fR.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.e.a.d.c bg() {
        return new com.google.android.libraries.search.assistant.ap.d.e.a.d.c((com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a(), (ag) this.f315a.Q.a());
    }

    public final com.google.android.libraries.search.assistant.ap.d.e.a.e.c bh() {
        return new com.google.android.libraries.search.assistant.ap.d.e.a.e.c((com.google.android.libraries.search.assistant.ap.d.c.d) this.z.a(), (Context) this.f315a.f.a(), (String) this.f315a.Y.a(), (ag) this.f315a.Q.a());
    }

    public final com.google.android.libraries.search.assistant.ap.f.a bi() {
        return new com.google.android.libraries.search.assistant.ap.f.a(aB());
    }

    final com.google.android.libraries.search.assistant.aq.g.a bj() {
        com.google.android.libraries.search.assistant.aq.g.a.g gVar = new com.google.android.libraries.search.assistant.aq.g.a.g(this.f315a.f319a.ea());
        com.google.android.libraries.search.assistant.aq.i.b.d dVar = (com.google.android.libraries.search.assistant.aq.i.b.d) this.f315a.kw.a();
        com.google.android.gms.search.queries.d cO = this.f315a.f319a.cO();
        aB();
        dVar.getClass();
        return gVar.f4066a.a(dVar, cO);
    }

    public final com.google.android.libraries.search.assistant.av.c.b bk() {
        return new com.google.android.libraries.search.assistant.av.c.b(this.b.hz());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.o bl() {
        return new com.google.android.libraries.search.assistant.av.d.a.o(bm(), (com.google.android.libraries.search.assistant.av.c.a.d) this.b.dm.a(), bH());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.u bm() {
        return new com.google.android.libraries.search.assistant.av.d.a.u((ag) this.f315a.Q.a(), bk(), this.b.sc());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.aa bn() {
        return new com.google.android.libraries.search.assistant.av.d.a.aa((com.google.android.libraries.search.ah.at) this.dS.a(), bk());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.a.f bo() {
        return new com.google.android.libraries.search.assistant.av.d.a.a.f(((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45378205").d(), ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45378206").d(), ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45378207").d(), (com.google.speech.context.a.b) this.f315a.b.gO.a(), new com.google.android.libraries.search.assistant.av.d.a.a.b(ha.w(new com.google.android.libraries.search.assistant.av.d.a.a.a.a(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.d(((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45387647").f()), new com.google.android.libraries.search.assistant.av.d.a.a.a.b(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.c(), new com.google.android.libraries.search.assistant.av.d.a.a.a.g(), new com.google.android.libraries.search.assistant.av.d.a.a.a.h(), new com.google.android.libraries.search.assistant.av.d.a.a.a[]{new com.google.android.libraries.search.assistant.av.d.a.a.a.i(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.j(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.n(null, 1, null), new com.google.android.libraries.search.assistant.av.d.a.a.a.n(1, (byte[]) null), new com.google.android.libraries.search.assistant.av.d.a.a.a.k(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.l(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((int[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((float[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((short[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((byte[][][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((char[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((boolean[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((char[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((boolean[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n(0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((byte[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((int[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((short[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((float[]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.n((byte[][]) null, 0), new com.google.android.libraries.search.assistant.av.d.a.a.a.p(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.q(bp()), new com.google.android.libraries.search.assistant.av.d.a.a.a.r(bp())})));
    }

    final com.google.android.libraries.search.assistant.av.d.a.a.b.b bp() {
        return new com.google.android.libraries.search.assistant.av.d.a.a.b.b(bk());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.c.d bq() {
        ik ikVar = this.b;
        return new com.google.android.libraries.search.assistant.av.d.a.c.d(ikVar.cS, (an) ikVar.qF());
    }

    public final com.google.android.libraries.search.assistant.av.d.a.d.c br() {
        return new com.google.android.libraries.search.assistant.av.d.a.d.c(bm(), bH());
    }

    public final com.google.android.libraries.search.assistant.spokennotifications.a.e.a bs() {
        return new com.google.android.libraries.search.assistant.spokennotifications.a.e.a((com.google.android.libraries.search.assistant.invocation.u.e.a.z) this.f315a.fV.a(), this.f315a.c.gm().e(), (com.google.android.libraries.g.a) this.f315a.g.a());
    }

    public final com.google.android.libraries.search.ah.b.b.b bt() {
        return new com.google.android.libraries.search.ah.b.b.b(((e) new h.a.a.f.a.a.s(this.f315a.c.f325a.V).a.a()).a("com.google.android.apps.search.assistant.device 45625378").f(), ((e) new h.a.a.f.a.a.s(this.f315a.c.f325a.V).a.a()).a("com.google.android.apps.search.assistant.device 45626642").f());
    }

    public final com.google.android.libraries.search.ah.b.b.c bu() {
        return new com.google.android.libraries.search.ah.b.b.c(((e) new h.a.a.f.a.a.s(this.f315a.c.f325a.V).a.a()).a("com.google.android.apps.search.assistant.device 45430551").f(), this.f315a.c.fV());
    }

    public final cn bv() {
        cq cqVar = (cq) this.f315a.v.a();
        Optional of = Optional.of((com.google.android.libraries.speech.c.b.ae) this.b.dc.a());
        Optional of2 = Optional.of((com.google.android.libraries.speech.c.b.i) this.b.db.a());
        jo joVar = this.f315a;
        h hVar = joVar.tU;
        com.google.android.libraries.search.ah.i.f.c lH = joVar.lH();
        com.google.android.libraries.search.ah.i.f.m lI = joVar.lI();
        com.google.android.libraries.search.ah.i.f.g gVar = (com.google.android.libraries.search.ah.i.f.g) hVar.a();
        Optional of3 = Optional.of((com.google.android.libraries.assistant.speakerid.a.r) this.f315a.mk.a());
        boolean d = h.a.a.f.a.a.x.d(this.f315a.V);
        boolean a2 = h.a.a.a.a.a.e.a.a.b.a(this.f315a.V);
        boolean c = h.a.a.f.a.a.x.c(this.f315a.V);
        Optional of4 = Optional.of(new com.google.android.apps.gsa.speech.o.a((com.google.android.apps.gsa.speech.o.b) this.f315a.c.f325a.wk.a()));
        Optional of5 = Optional.of(this.f315a.lJ());
        com.google.android.libraries.search.f.e eVar = (com.google.android.libraries.search.f.e) this.b.el.a();
        n nVar = (n) this.f315a.P.a();
        eVar.getClass();
        nVar.getClass();
        Optional of6 = Optional.of(new com.google.android.libraries.search.ah.i.f.a.a.b(eVar));
        Optional empty = Optional.empty();
        Optional of7 = Optional.of(this.f315a.adZ());
        boolean c2 = new h.a.a.f.a.a.s(this.f315a.V).c();
        boolean a3 = new h.a.a.f.a.a.s(this.f315a.V).a();
        boolean b = new h.a.a.f.a.a.s(this.f315a.V).b();
        com.google.android.libraries.search.ah.i.e.f jG = this.b.jG();
        jo joVar2 = this.f315a;
        joVar2.lD();
        bl blVar = new bl(of, of2, lH, lI, gVar, of3, d, a2, c, of4, of5, of6, empty, of7, c2, a3, b, jG, (Optional) joVar2.hQ.a(), (String) this.f315a.Y.a(), (cq) this.f315a.H.a(), (ag) this.f315a.Q.a(), (n) this.f315a.P.a());
        jo joVar3 = this.f315a;
        return new cn(cqVar, blVar, new com.google.android.libraries.search.ah.i.b.l(joVar3.g, joVar3.mp, this.b.dd, joVar3.hQ, joVar3.Y, joVar3.Q), (com.google.common.v.f) this.f315a.ez.a(), this.b.jG(), (String) this.f315a.Y.a(), (Optional) this.f315a.hQ.a(), (cq) this.f315a.H.a());
    }

    final af bw() {
        cq cqVar = (cq) this.f315a.v.a();
        j jVar = (j) this.f315a.as.a();
        com.google.android.libraries.storage.protostore.c.h hVar = com.google.android.libraries.storage.protostore.c.h.f5590a;
        HashMap hashMap = new HashMap();
        bz.c(com.google.android.libraries.storage.protostore.bb.i(), hashMap);
        return new af(cqVar, jVar, hVar, hashMap, null);
    }

    public final com.google.apps.tiktok.q.b.h bx() {
        com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a.c cVar = new com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a.c((com.google.common.v.f) this.f315a.ez.a(), Optional.of(this.f315a.c.Y()));
        com.google.apps.tiktok.q.b.g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "CorrectionsDataProtoStore";
        a2.c(com.google.speech.m.d.a);
        a2.b().h(cVar);
        return a2.a();
    }

    public final com.google.g.v.a.b by() {
        com.google.g.v.a.b I = com.google.g.v.a.c.a(com.google.apps.tiktok.p.y.b(this.b.V, (com.google.apps.tiktok.p.m) this.f315a.c.P.a(), (com.google.frameworks.client.data.android.d) this.f315a.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f315a.mh.a()});
        I.getClass();
        com.google.g.v.a.b a2 = com.google.android.apps.search.assistant.platform.ondevice.b.a.b.a.a(I, (nz) this.ex.a(), this.f315a.c.gC().t());
        a2.getClass();
        return a2;
    }

    public final com.google.g.v.a.a.b bz() {
        com.google.g.v.a.a.b I = io.grpc.j.a.d(new com.google.g.v.a.a.a(), com.google.apps.tiktok.p.y.b(this.b.V, (com.google.apps.tiktok.p.m) this.f315a.c.X.a(), (com.google.frameworks.client.data.android.d) this.f315a.mb.a(), com.google.common.base.a.a), io.grpc.h.a).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f315a.mh.a()});
        I.getClass();
        com.google.g.v.a.a.b a2 = com.google.android.apps.search.assistant.platform.ondevice.b.a.b.a.a(I, (nz) this.ex.a(), this.f315a.c.gC().t());
        a2.getClass();
        return a2;
    }

    public final long c() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45374843").b();
    }

    public final long d() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45374654").b();
    }

    public final Set dA() {
        Set set;
        if (h.a.a.f.b.a.n.h(this.b.l)) {
            Object a2 = this.fl.a();
            a2.getClass();
            set = (Set) a2;
        } else {
            set = m.a.aa.a;
        }
        return set;
    }

    public final Set dB() {
        gy l = ha.l(29);
        com.google.android.libraries.search.assistant.performer.deviceactions.b bVar = (com.google.android.libraries.search.assistant.performer.deviceactions.b) this.b.f308a.fH.a();
        bVar.getClass();
        ba createBuilder = com.google.g.e.i.be.a.createBuilder();
        createBuilder.getClass();
        createBuilder.copyOnWrite();
        com.google.g.e.i.be beVar = createBuilder.instance;
        beVar.b |= 1;
        beVar.c = "battery.LEVEL_LOOKUP";
        createBuilder.copyOnWrite();
        com.google.g.e.i.be beVar2 = createBuilder.instance;
        beVar2.b |= 2;
        beVar2.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder), new com.google.android.libraries.search.assistant.ap.c.b.b(bVar, 1)));
        lt ltVar = (lt) this.eb.a();
        com.google.android.libraries.search.assistant.ap.c.h.a aS = aS();
        ltVar.getClass();
        ba createBuilder2 = com.google.g.e.i.be.a.createBuilder();
        createBuilder2.getClass();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.be beVar3 = createBuilder2.instance;
        beVar3.b |= 1;
        beVar3.c = "chat_message.SEND";
        createBuilder2.copyOnWrite();
        com.google.g.e.i.be beVar4 = createBuilder2.instance;
        beVar4.b |= 2;
        beVar4.d = 1;
        com.google.g.e.i.be o = sn.o(createBuilder2);
        com.google.android.libraries.search.assistant.ap.c.a.c cVar = new com.google.android.libraries.search.assistant.ap.c.a.c(ltVar, aS);
        com.google.common.f.h d = com.google.android.libraries.search.assistant.ap.c.a.d.a.d();
        d.aj(com.google.common.f.a.e.a, "RSP.Performer");
        d.ak(56664);
        d.p("chat_message.SEND");
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(o, cVar));
        ci yc = this.b.yc();
        com.google.android.libraries.search.assistant.ap.c.h.a aS2 = aS();
        com.google.android.libraries.search.b.b aB = aB();
        ba createBuilder3 = com.google.g.e.i.be.a.createBuilder();
        createBuilder3.getClass();
        createBuilder3.copyOnWrite();
        com.google.g.e.i.be beVar5 = createBuilder3.instance;
        beVar5.b |= 1;
        beVar5.c = "data.VALIDATE";
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder3), new com.google.android.libraries.search.assistant.ap.c.a.e(yc, aS2, aB, 1)));
        com.google.android.libraries.search.assistant.ap.c.h.a aS3 = aS();
        ci rI = this.b.f308a.rI();
        com.google.android.libraries.search.b.b aB2 = aB();
        ba createBuilder4 = com.google.g.e.i.be.a.createBuilder();
        createBuilder4.getClass();
        createBuilder4.copyOnWrite();
        com.google.g.e.i.be beVar6 = createBuilder4.instance;
        beVar6.b |= 1;
        beVar6.c = "contact.LOOKUP";
        createBuilder4.copyOnWrite();
        com.google.g.e.i.be beVar7 = createBuilder4.instance;
        beVar7.b |= 2;
        beVar7.d = 15;
        com.google.g.e.i.be o2 = sn.o(createBuilder4);
        com.google.android.libraries.search.assistant.ap.c.a.e eVar = new com.google.android.libraries.search.assistant.ap.c.a.e(rI, aS3, aB2, 0);
        com.google.common.f.h d2 = com.google.android.libraries.search.assistant.ap.c.a.f.a.d();
        d2.aj(com.google.common.f.a.e.a, "RSP.Performer");
        d2.ak(56665);
        d2.p("contact.LOOKUP");
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(o2, eVar));
        com.google.android.libraries.search.assistant.performer.l.af yt = this.b.yt();
        com.google.android.libraries.search.assistant.ap.c.h.a aS4 = aS();
        Context context = (Context) this.f315a.f.a();
        context.getClass();
        ba createBuilder5 = com.google.g.e.i.be.a.createBuilder();
        createBuilder5.getClass();
        createBuilder5.copyOnWrite();
        com.google.g.e.i.be beVar8 = createBuilder5.instance;
        beVar8.b |= 1;
        beVar8.c = "alarm.CREATE_ALARM";
        createBuilder5.copyOnWrite();
        com.google.g.e.i.be beVar9 = createBuilder5.instance;
        beVar9.b |= 2;
        beVar9.d = 1;
        qy L = sn.L(ei.a.createBuilder());
        ba baVar = L.a;
        baVar.copyOnWrite();
        ei eiVar = baVar.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.properties.CreateAlarmClientOpProperty";
        ba createBuilder6 = gl.a.createBuilder();
        createBuilder6.getClass();
        boolean f = com.google.android.libraries.search.assistant.performer.l.q.f(context.getPackageManager(), true);
        createBuilder6.copyOnWrite();
        gl glVar = createBuilder6.instance;
        glVar.b |= 1;
        glVar.c = f;
        gl build = createBuilder6.build();
        build.getClass();
        L.r(build.toByteString());
        sn.p(L.q(), createBuilder5);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder5), new com.google.android.libraries.search.assistant.ap.c.e.a(yt, aS4, 1)));
        com.google.android.libraries.search.assistant.performer.l.ac yu = this.b.yu();
        com.google.android.libraries.search.assistant.ap.c.h.a aS5 = aS();
        Context context2 = (Context) this.f315a.f.a();
        context2.getClass();
        ba createBuilder7 = com.google.g.e.i.be.a.createBuilder();
        createBuilder7.getClass();
        createBuilder7.copyOnWrite();
        com.google.g.e.i.be beVar10 = createBuilder7.instance;
        beVar10.b |= 1;
        beVar10.c = "timer.CREATE_TIMER";
        createBuilder7.copyOnWrite();
        com.google.g.e.i.be beVar11 = createBuilder7.instance;
        beVar11.b |= 2;
        beVar11.d = 1;
        qy L2 = sn.L(ei.a.createBuilder());
        ba baVar2 = L2.a;
        baVar2.copyOnWrite();
        ei eiVar2 = baVar2.instance;
        eiVar2.b |= 1;
        eiVar2.c = "assistant.api.client_op.properties.CreateTimerClientOpProperty";
        ba createBuilder8 = gm.a.createBuilder();
        createBuilder8.getClass();
        boolean f2 = com.google.android.libraries.search.assistant.performer.l.q.f(context2.getPackageManager(), true);
        createBuilder8.copyOnWrite();
        gm gmVar = createBuilder8.instance;
        gmVar.b |= 1;
        gmVar.c = f2;
        gm build2 = createBuilder8.build();
        build2.getClass();
        L2.r(build2.toByteString());
        sn.p(L2.q(), createBuilder7);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder7), new com.google.android.libraries.search.assistant.ap.c.e.a(yu, aS5, 0)));
        lt ltVar2 = (lt) this.ec.a();
        com.google.android.libraries.search.assistant.ap.c.c.b.f fVar = (com.google.android.libraries.search.assistant.ap.c.c.b.f) this.dY.a();
        ltVar2.getClass();
        fVar.getClass();
        ba createBuilder9 = com.google.g.e.i.be.a.createBuilder();
        createBuilder9.getClass();
        createBuilder9.copyOnWrite();
        com.google.g.e.i.be beVar12 = createBuilder9.instance;
        beVar12.b |= 1;
        beVar12.c = "gacs_accessory.EXECUTE";
        createBuilder9.copyOnWrite();
        com.google.g.e.i.be beVar13 = createBuilder9.instance;
        beVar13.b |= 2;
        beVar13.d = 1;
        qy L3 = sn.L(ei.a.createBuilder());
        ba baVar3 = L3.a;
        baVar3.copyOnWrite();
        ei eiVar3 = baVar3.instance;
        eiVar3.b |= 1;
        eiVar3.c = "assistant.api.client_op.properties.GACSAccessoryExecuteProperties";
        ba createBuilder10 = ix.a.createBuilder();
        createBuilder10.getClass();
        createBuilder10.copyOnWrite();
        ix ixVar = createBuilder10.instance;
        ixVar.b |= 1;
        ixVar.c = true;
        ix build3 = createBuilder10.build();
        build3.getClass();
        L3.r(build3.toByteString());
        sn.p(L3.q(), createBuilder9);
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.c.b.b(ltVar2, fVar), sn.o(createBuilder9)));
        ik ikVar = this.b;
        jo joVar = this.f315a;
        com.google.android.libraries.search.assistant.p.a.b.f.a.a es = ikVar.f308a.es();
        ag agVar = (ag) joVar.Q.a();
        kotlinx.coroutines.b.cq cqVar = (kotlinx.coroutines.b.cq) this.D.a();
        lt ltVar3 = (lt) this.ed.a();
        com.google.android.libraries.search.assistant.ap.f.a bi = bi();
        agVar.getClass();
        cqVar.getClass();
        ltVar3.getClass();
        ba createBuilder11 = com.google.g.e.i.be.a.createBuilder();
        createBuilder11.getClass();
        createBuilder11.copyOnWrite();
        com.google.g.e.i.be beVar14 = createBuilder11.instance;
        beVar14.b |= 1;
        beVar14.c = "gacs_accessory.TTS_OUTPUT";
        createBuilder11.copyOnWrite();
        com.google.g.e.i.be beVar15 = createBuilder11.instance;
        beVar15.b |= 2;
        beVar15.d = 1;
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.c.d.a(new com.google.android.libraries.search.assistant.ap.c.c.d.g(agVar, ltVar3, es, cqVar, bi)), sn.o(createBuilder11)));
        com.google.android.libraries.search.assistant.performer.a.i iVar = (com.google.android.libraries.search.assistant.performer.a.i) this.ee.a();
        jo joVar2 = this.f315a;
        boolean gC = joVar2.b.gC();
        boolean gD = joVar2.b.gD();
        si createBuilder12 = mq.a.createBuilder();
        createBuilder12.z(3);
        createBuilder12.z(10);
        if (gC) {
            createBuilder12.y(com.google.g.e.i.jx.y);
        }
        if (gD) {
            createBuilder12.y(com.google.g.e.i.jx.z);
        }
        ba createBuilder13 = com.google.g.e.i.be.a.createBuilder();
        createBuilder13.copyOnWrite();
        com.google.g.e.i.be beVar16 = createBuilder13.instance;
        beVar16.b |= 1;
        beVar16.c = "media.PLAY_MEDIA";
        createBuilder13.copyOnWrite();
        com.google.g.e.i.be beVar17 = createBuilder13.instance;
        beVar17.b |= 2;
        beVar17.d = 2;
        ba createBuilder14 = ei.a.createBuilder();
        createBuilder14.copyOnWrite();
        ei eiVar4 = createBuilder14.instance;
        eiVar4.b |= 1;
        eiVar4.c = "assistant.api.client_op.PlayMediaProperties";
        com.google.protobuf.v byteString = createBuilder12.build().toByteString();
        createBuilder14.copyOnWrite();
        ei eiVar5 = createBuilder14.instance;
        byteString.getClass();
        eiVar5.b |= 2;
        eiVar5.d = byteString;
        createBuilder13.copyOnWrite();
        com.google.g.e.i.be beVar18 = createBuilder13.instance;
        ei build4 = createBuilder14.build();
        build4.getClass();
        beVar18.e = build4;
        beVar18.b |= 4;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(createBuilder13.build(), new com.google.android.libraries.search.assistant.ap.c.d.a(iVar, 1)));
        com.google.android.libraries.search.assistant.performer.a.i iVar2 = (com.google.android.libraries.search.assistant.performer.a.i) this.ee.a();
        ba createBuilder15 = com.google.g.e.i.be.a.createBuilder();
        createBuilder15.copyOnWrite();
        com.google.g.e.i.be beVar19 = createBuilder15.instance;
        beVar19.b |= 1;
        beVar19.c = "media.PREPARE_MEDIA";
        createBuilder15.copyOnWrite();
        com.google.g.e.i.be beVar20 = createBuilder15.instance;
        beVar20.b |= 2;
        beVar20.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(createBuilder15.build(), new com.google.android.libraries.search.assistant.ap.c.d.a(iVar2, 2)));
        lt ltVar4 = (lt) this.b.b.P.a();
        HashSet hashSet = new HashSet();
        ni A = fl.A("media.NEXT", "media.PREVIOUS", "media.PAUSE", "media.RESUME", "media.SEEK_RELATIVE", "media.SEEK_TO_POSITION", "media.SET_RATING", "media.STOP", "media.REPLAY_MEDIA_ITEM", "media.SHUFFLE", "media.SET_REPEAT", "media.SET_PLAYBACK_RATE", new String[0]);
        com.google.android.libraries.search.assistant.performer.h.j al = ltVar4.al(Optional.empty(), com.google.android.libraries.search.assistant.performer.h.ac.a().a());
        int i = A.d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) A.get(i2);
            ba createBuilder16 = com.google.g.e.i.be.a.createBuilder();
            createBuilder16.copyOnWrite();
            com.google.g.e.i.be beVar21 = createBuilder16.instance;
            str.getClass();
            beVar21.b |= 1;
            beVar21.c = str;
            createBuilder16.copyOnWrite();
            com.google.g.e.i.be beVar22 = createBuilder16.instance;
            beVar22.b |= 2;
            beVar22.d = 1;
            hashSet.add(com.google.android.libraries.search.assistant.p.a.a.c.b.a(createBuilder16.build(), new com.google.android.libraries.search.assistant.ap.c.d.a(al, 0)));
        }
        l.j(hashSet);
        com.google.android.libraries.search.assistant.ap.c.c.c.b bVar2 = new com.google.android.libraries.search.assistant.ap.c.c.c.b((ag) this.f315a.Q.a(), this.b.f308a.er(), (com.google.android.libraries.search.assistant.ap.e.a.a) this.F.a());
        ba createBuilder17 = com.google.g.e.i.be.a.createBuilder();
        createBuilder17.getClass();
        createBuilder17.copyOnWrite();
        com.google.g.e.i.be beVar23 = createBuilder17.instance;
        beVar23.b |= 1;
        beVar23.c = "mic.UPDATE";
        createBuilder17.copyOnWrite();
        com.google.g.e.i.be beVar24 = createBuilder17.instance;
        beVar24.b |= 2;
        beVar24.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder17), new com.google.android.libraries.search.assistant.ap.c.c.c.c(bVar2)));
        ik ikVar2 = this.b;
        jo joVar3 = this.f315a;
        com.google.android.libraries.search.assistant.performer.deviceactions.ah yd = ikVar2.yd();
        com.google.android.libraries.search.assistant.ap.c.h.d dVar = new com.google.android.libraries.search.assistant.ap.c.h.d((ag) joVar3.Q.a(), (lt) this.b.bT.a());
        ba createBuilder18 = com.google.g.e.i.be.a.createBuilder();
        createBuilder18.getClass();
        createBuilder18.copyOnWrite();
        com.google.g.e.i.be beVar25 = createBuilder18.instance;
        beVar25.b |= 1;
        beVar25.c = "device.MODIFY_SETTING";
        createBuilder18.copyOnWrite();
        com.google.g.e.i.be beVar26 = createBuilder18.instance;
        beVar26.b |= 2;
        beVar26.d = 2;
        qy L4 = sn.L(ei.a.createBuilder());
        ba baVar4 = L4.a;
        baVar4.copyOnWrite();
        ei eiVar6 = baVar4.instance;
        eiVar6.b |= 1;
        eiVar6.c = "assistant.api.client_op.properties.DeviceModifySettingClientOpProperty";
        ba createBuilder19 = hk.a.createBuilder();
        createBuilder19.getClass();
        createBuilder19.copyOnWrite();
        hk hkVar = createBuilder19.instance;
        hkVar.b |= 1;
        hkVar.c = true;
        createBuilder19.copyOnWrite();
        hk hkVar2 = createBuilder19.instance;
        hkVar2.b |= 2;
        hkVar2.d = true;
        hk build5 = createBuilder19.build();
        build5.getClass();
        L4.r(build5.toByteString());
        sn.p(L4.q(), createBuilder18);
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.b.b(new com.google.android.libraries.search.assistant.ap.c.b.a(yd, dVar), 0), sn.o(createBuilder18)));
        com.google.android.libraries.search.assistant.performer.l.ac yn = this.b.yn();
        com.google.android.libraries.search.assistant.ap.c.h.a aS6 = aS();
        Context context3 = (Context) this.f315a.f.a();
        context3.getClass();
        ba createBuilder20 = com.google.g.e.i.be.a.createBuilder();
        createBuilder20.getClass();
        createBuilder20.copyOnWrite();
        com.google.g.e.i.be beVar27 = createBuilder20.instance;
        beVar27.b |= 1;
        beVar27.c = "alarm.MUTATE_ALARM";
        createBuilder20.copyOnWrite();
        com.google.g.e.i.be beVar28 = createBuilder20.instance;
        beVar28.b |= 2;
        beVar28.d = 2;
        qy L5 = sn.L(ei.a.createBuilder());
        ba baVar5 = L5.a;
        baVar5.copyOnWrite();
        ei eiVar7 = baVar5.instance;
        eiVar7.b |= 1;
        eiVar7.c = "assistant.api.client_op.properties.MutateAlarmClientOpProperty";
        ba createBuilder21 = lk.a.createBuilder();
        createBuilder21.getClass();
        boolean f3 = com.google.android.libraries.search.assistant.performer.l.q.f(context3.getPackageManager(), true);
        createBuilder21.copyOnWrite();
        lk lkVar = createBuilder21.instance;
        lkVar.b |= 1;
        lkVar.c = f3;
        lk build6 = createBuilder21.build();
        build6.getClass();
        L5.r(build6.toByteString());
        sn.p(L5.q(), createBuilder20);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder20), new com.google.android.libraries.search.assistant.ap.c.e.a(yn, aS6, 2)));
        com.google.android.libraries.search.assistant.performer.deviceactions.ah iq = this.b.iq();
        com.google.android.libraries.search.assistant.ap.c.h.a aS7 = aS();
        ba createBuilder22 = mz.a.createBuilder();
        createBuilder22.copyOnWrite();
        mz mzVar = createBuilder22.instance;
        mzVar.b |= 1;
        mzVar.c = true;
        mz build7 = createBuilder22.build();
        ba createBuilder23 = com.google.g.e.i.be.a.createBuilder();
        createBuilder23.copyOnWrite();
        com.google.g.e.i.be beVar29 = createBuilder23.instance;
        beVar29.b |= 1;
        beVar29.c = "provider.OPEN";
        createBuilder23.copyOnWrite();
        com.google.g.e.i.be beVar30 = createBuilder23.instance;
        beVar30.b |= 2;
        beVar30.d = 1;
        ba createBuilder24 = ei.a.createBuilder();
        createBuilder24.copyOnWrite();
        ei eiVar8 = createBuilder24.instance;
        eiVar8.b |= 1;
        eiVar8.c = "assistant.api.client_op.properties.ProviderOpenClientOpProperty";
        com.google.protobuf.v byteString2 = build7.toByteString();
        createBuilder24.copyOnWrite();
        ei eiVar9 = createBuilder24.instance;
        byteString2.getClass();
        eiVar9.b |= 2;
        eiVar9.d = byteString2;
        ei build8 = createBuilder24.build();
        createBuilder23.copyOnWrite();
        com.google.g.e.i.be beVar31 = createBuilder23.instance;
        build8.getClass();
        beVar31.e = build8;
        beVar31.b |= 4;
        com.google.g.e.i.be build9 = createBuilder23.build();
        com.google.android.libraries.search.assistant.performer.deviceactions.ag.a().a();
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(build9, new com.google.android.libraries.search.assistant.ap.c.f.a(iq.a(aS7), 0)));
        com.google.android.libraries.search.assistant.performer.deviceactions.at atVar = (com.google.android.libraries.search.assistant.performer.deviceactions.at) this.b.f308a.fI.a();
        ba createBuilder25 = com.google.g.e.i.be.a.createBuilder();
        createBuilder25.copyOnWrite();
        com.google.g.e.i.be beVar32 = createBuilder25.instance;
        beVar32.b |= 1;
        beVar32.c = "provider.VERIFY";
        createBuilder25.copyOnWrite();
        com.google.g.e.i.be beVar33 = createBuilder25.instance;
        beVar33.b |= 2;
        beVar33.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(createBuilder25.build(), new com.google.android.libraries.search.assistant.ap.c.f.a(atVar, 1)));
        com.google.android.libraries.search.assistant.performer.l.af yr = this.b.yr();
        com.google.android.libraries.search.assistant.ap.c.h.a aS8 = aS();
        Context context4 = (Context) this.f315a.f.a();
        context4.getClass();
        ba createBuilder26 = com.google.g.e.i.be.a.createBuilder();
        createBuilder26.getClass();
        createBuilder26.copyOnWrite();
        com.google.g.e.i.be beVar34 = createBuilder26.instance;
        beVar34.b |= 1;
        beVar34.c = "alarm.REMOVE_ALARM";
        createBuilder26.copyOnWrite();
        com.google.g.e.i.be beVar35 = createBuilder26.instance;
        beVar35.b |= 2;
        beVar35.d = 1;
        qy L6 = sn.L(ei.a.createBuilder());
        ba baVar6 = L6.a;
        baVar6.copyOnWrite();
        ei eiVar10 = baVar6.instance;
        eiVar10.b |= 1;
        eiVar10.c = "assistant.api.client_op.properties.RemoveAlarmClientOpProperty";
        ba createBuilder27 = nq.a.createBuilder();
        createBuilder27.getClass();
        boolean f4 = com.google.android.libraries.search.assistant.performer.l.q.f(context4.getPackageManager(), true);
        createBuilder27.copyOnWrite();
        nq nqVar = createBuilder27.instance;
        nqVar.b |= 1;
        nqVar.c = f4;
        nq build10 = createBuilder27.build();
        build10.getClass();
        L6.r(build10.toByteString());
        sn.p(L6.q(), createBuilder26);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder26), new com.google.android.libraries.search.assistant.ap.c.e.a(yr, aS8, 3)));
        com.google.android.libraries.search.assistant.performer.l.ac xW = this.b.xW();
        com.google.android.libraries.search.assistant.ap.c.h.a aS9 = aS();
        Context context5 = (Context) this.f315a.f.a();
        context5.getClass();
        ba createBuilder28 = com.google.g.e.i.be.a.createBuilder();
        createBuilder28.getClass();
        createBuilder28.copyOnWrite();
        com.google.g.e.i.be beVar36 = createBuilder28.instance;
        beVar36.b |= 1;
        beVar36.c = "timer.REMOVE_TIMER";
        createBuilder28.copyOnWrite();
        com.google.g.e.i.be beVar37 = createBuilder28.instance;
        beVar37.b |= 2;
        beVar37.d = 1;
        qy L7 = sn.L(ei.a.createBuilder());
        ba baVar7 = L7.a;
        baVar7.copyOnWrite();
        ei eiVar11 = baVar7.instance;
        eiVar11.b |= 1;
        eiVar11.c = "assistant.api.client_op.properties.RemoveTimerClientOpProperty";
        ba createBuilder29 = nr.a.createBuilder();
        createBuilder29.getClass();
        boolean f5 = com.google.android.libraries.search.assistant.performer.l.q.f(context5.getPackageManager(), true);
        createBuilder29.copyOnWrite();
        nr nrVar = createBuilder29.instance;
        nrVar.b |= 1;
        nrVar.c = f5;
        nr build11 = createBuilder29.build();
        build11.getClass();
        L7.r(build11.toByteString());
        sn.p(L7.q(), createBuilder28);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder28), new com.google.android.libraries.search.assistant.ap.c.e.a(xW, aS9, 4)));
        lt ltVar5 = (lt) this.ef.a();
        com.google.android.libraries.search.assistant.ap.c.h.a aS10 = aS();
        ltVar5.getClass();
        ba createBuilder30 = com.google.g.e.i.be.a.createBuilder();
        createBuilder30.getClass();
        createBuilder30.copyOnWrite();
        com.google.g.e.i.be beVar38 = createBuilder30.instance;
        beVar38.b |= 1;
        beVar38.c = "device.REQUEST_PERMISSION";
        createBuilder30.copyOnWrite();
        com.google.g.e.i.be beVar39 = createBuilder30.instance;
        beVar39.b |= 2;
        beVar39.d = 3;
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.c.a.b.f(ltVar5, aS10), sn.o(createBuilder30)));
        com.google.android.libraries.search.assistant.performer.l.af yo = this.b.yo();
        com.google.android.libraries.search.assistant.ap.c.h.a aS11 = aS();
        Context context6 = (Context) this.f315a.f.a();
        context6.getClass();
        ba createBuilder31 = com.google.g.e.i.be.a.createBuilder();
        createBuilder31.getClass();
        createBuilder31.copyOnWrite();
        com.google.g.e.i.be beVar40 = createBuilder31.instance;
        beVar40.b |= 1;
        beVar40.c = "alarm.SNOOZE_ALARM";
        createBuilder31.copyOnWrite();
        com.google.g.e.i.be beVar41 = createBuilder31.instance;
        beVar41.b |= 2;
        beVar41.d = 1;
        qy L8 = sn.L(ei.a.createBuilder());
        ba baVar8 = L8.a;
        baVar8.copyOnWrite();
        ei eiVar12 = baVar8.instance;
        eiVar12.b |= 1;
        eiVar12.c = "assistant.api.client_op.properties.SnoozeAlarmClientOpProperty";
        ba createBuilder32 = qf.a.createBuilder();
        createBuilder32.getClass();
        boolean f6 = com.google.android.libraries.search.assistant.performer.l.q.f(context6.getPackageManager(), true);
        createBuilder32.copyOnWrite();
        qf qfVar = createBuilder32.instance;
        qfVar.b |= 1;
        qfVar.c = f6;
        qf build12 = createBuilder32.build();
        build12.getClass();
        L8.r(build12.toByteString());
        sn.p(L8.q(), createBuilder31);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder31), new com.google.android.libraries.search.assistant.ap.c.e.a(yo, aS11, 5)));
        com.google.android.libraries.search.assistant.performer.l.af yl = this.b.yl();
        com.google.android.libraries.search.assistant.ap.c.h.a aS12 = aS();
        ba createBuilder33 = com.google.g.e.i.be.a.createBuilder();
        createBuilder33.getClass();
        createBuilder33.copyOnWrite();
        com.google.g.e.i.be beVar42 = createBuilder33.instance;
        beVar42.b |= 1;
        beVar42.c = "alarm.STOP_ALARM";
        createBuilder33.copyOnWrite();
        com.google.g.e.i.be beVar43 = createBuilder33.instance;
        beVar43.b |= 2;
        beVar43.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder33), new com.google.android.libraries.search.assistant.ap.c.e.a(yl, aS12, 6)));
        com.google.android.libraries.search.assistant.performer.l.ac iw = this.b.iw();
        com.google.android.libraries.search.assistant.ap.c.h.a aS13 = aS();
        ba createBuilder34 = com.google.g.e.i.be.a.createBuilder();
        createBuilder34.getClass();
        createBuilder34.copyOnWrite();
        com.google.g.e.i.be beVar44 = createBuilder34.instance;
        beVar44.b |= 1;
        beVar44.c = "stopwatch.START_STOPWATCH";
        createBuilder34.copyOnWrite();
        com.google.g.e.i.be beVar45 = createBuilder34.instance;
        beVar45.b |= 2;
        beVar45.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder34), new com.google.android.libraries.search.assistant.ap.c.e.a(iw, aS13, 10)));
        com.google.android.libraries.search.assistant.performer.l.ac iw2 = this.b.iw();
        com.google.android.libraries.search.assistant.ap.c.h.a aS14 = aS();
        ba createBuilder35 = com.google.g.e.i.be.a.createBuilder();
        createBuilder35.getClass();
        createBuilder35.copyOnWrite();
        com.google.g.e.i.be beVar46 = createBuilder35.instance;
        beVar46.b |= 1;
        beVar46.c = "stopwatch.SHOW_STOPWATCH";
        createBuilder35.copyOnWrite();
        com.google.g.e.i.be beVar47 = createBuilder35.instance;
        beVar47.b |= 2;
        beVar47.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder35), new com.google.android.libraries.search.assistant.ap.c.e.a(iw2, aS14, 8)));
        com.google.android.libraries.search.assistant.performer.l.ac iw3 = this.b.iw();
        com.google.android.libraries.search.assistant.ap.c.h.a aS15 = aS();
        ba createBuilder36 = com.google.g.e.i.be.a.createBuilder();
        createBuilder36.getClass();
        createBuilder36.copyOnWrite();
        com.google.g.e.i.be beVar48 = createBuilder36.instance;
        beVar48.b |= 1;
        beVar48.c = "stopwatch.PAUSE_STOPWATCH";
        createBuilder36.copyOnWrite();
        com.google.g.e.i.be beVar49 = createBuilder36.instance;
        beVar49.b |= 2;
        beVar49.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder36), new com.google.android.libraries.search.assistant.ap.c.e.a(iw3, aS15, 9)));
        com.google.android.libraries.search.assistant.performer.l.ac iw4 = this.b.iw();
        com.google.android.libraries.search.assistant.ap.c.h.a aS16 = aS();
        ba createBuilder37 = com.google.g.e.i.be.a.createBuilder();
        createBuilder37.getClass();
        createBuilder37.copyOnWrite();
        com.google.g.e.i.be beVar50 = createBuilder37.instance;
        beVar50.b |= 1;
        beVar50.c = "stopwatch.RESET_STOPWATCH";
        createBuilder37.copyOnWrite();
        com.google.g.e.i.be beVar51 = createBuilder37.instance;
        beVar51.b |= 2;
        beVar51.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder37), new com.google.android.libraries.search.assistant.ap.c.e.a(iw4, aS16, 7)));
        com.google.android.libraries.search.assistant.performer.l.af ix = this.b.ix();
        com.google.android.libraries.search.assistant.ap.c.h.a aS17 = aS();
        Context context7 = (Context) this.f315a.f.a();
        context7.getClass();
        ba createBuilder38 = com.google.g.e.i.be.a.createBuilder();
        createBuilder38.getClass();
        createBuilder38.copyOnWrite();
        com.google.g.e.i.be beVar52 = createBuilder38.instance;
        beVar52.b |= 1;
        beVar52.c = "timer.UPDATE_TIMER";
        createBuilder38.copyOnWrite();
        com.google.g.e.i.be beVar53 = createBuilder38.instance;
        beVar53.b |= 2;
        beVar53.d = 1;
        qy L9 = sn.L(ei.a.createBuilder());
        ba baVar9 = L9.a;
        baVar9.copyOnWrite();
        ei eiVar13 = baVar9.instance;
        eiVar13.b |= 1;
        eiVar13.c = "assistant.api.client_op.properties.UpdateTimerClientOpProperty";
        ba createBuilder39 = rz.a.createBuilder();
        createBuilder39.getClass();
        boolean f7 = com.google.android.libraries.search.assistant.performer.l.q.f(context7.getPackageManager(), true);
        createBuilder39.copyOnWrite();
        rz rzVar = createBuilder39.instance;
        rzVar.b |= 1;
        rzVar.c = f7;
        rz build13 = createBuilder39.build();
        build13.getClass();
        L9.r(build13.toByteString());
        sn.p(L9.q(), createBuilder38);
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder38), new com.google.android.libraries.search.assistant.ap.c.e.a(ix, aS17, 11)));
        lt ltVar6 = (lt) this.eg.a();
        ltVar6.getClass();
        ba createBuilder40 = com.google.g.e.i.be.a.createBuilder();
        createBuilder40.getClass();
        createBuilder40.copyOnWrite();
        com.google.g.e.i.be beVar54 = createBuilder40.instance;
        beVar54.b |= 1;
        beVar54.c = "device.WAIT_FOR_AUTHENTICATION";
        createBuilder40.copyOnWrite();
        com.google.g.e.i.be beVar55 = createBuilder40.instance;
        beVar55.b |= 2;
        beVar55.d = 1;
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.c.a.a.b(ltVar6), sn.o(createBuilder40)));
        com.google.android.libraries.search.assistant.performer.deviceactions.av avVar = (com.google.android.libraries.search.assistant.performer.deviceactions.av) this.b.f308a.fJ.a();
        avVar.getClass();
        ba createBuilder41 = com.google.g.e.i.be.a.createBuilder();
        createBuilder41.getClass();
        createBuilder41.copyOnWrite();
        com.google.g.e.i.be beVar56 = createBuilder41.instance;
        beVar56.b |= 1;
        beVar56.c = "execution.WAIT";
        createBuilder41.copyOnWrite();
        com.google.g.e.i.be beVar57 = createBuilder41.instance;
        beVar57.b |= 2;
        beVar57.d = 1;
        l.h(com.google.android.libraries.search.assistant.p.a.a.c.b.a(sn.o(createBuilder41), new com.google.android.libraries.search.assistant.ap.c.b.b(avVar, 2)));
        lt ltVar7 = (lt) this.b.f308a.gb.a();
        ltVar7.getClass();
        l.h(new com.google.android.libraries.search.assistant.p.a.a.c.c(new com.google.android.libraries.search.assistant.ap.c.g.b(new com.google.android.libraries.search.assistant.ap.c.g.a(ltVar7)), com.google.android.libraries.search.assistant.performer.n.l.b));
        return l.g();
    }

    public final Set dC() {
        return new op(new com.google.android.libraries.assistant.c.b.f.a.o(c.b(this.f315a.hP), (cr) this.f315a.H.a(), (com.google.android.libraries.assistant.c.b.f.a.d) this.b.f308a.mq()));
    }

    public final Set dD() {
        return ha.t((com.google.android.libraries.speech.a.a.a) this.f315a.c.an.a(), (com.google.android.libraries.speech.a.a.a) this.aV.a(), (com.google.android.libraries.speech.a.a.a) this.aH.a());
    }

    public final Set dE() {
        boolean f = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361991").f();
        boolean f2 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361992").f();
        boolean f3 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45373104").f();
        boolean f4 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45373105").f();
        boolean f5 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45373106").f();
        boolean f6 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45373107").f();
        boolean f7 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45353514").f();
        boolean f8 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45354206").f();
        boolean f9 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45398671").f();
        boolean f10 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45360699").f();
        boolean f11 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45398670").f();
        boolean f12 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361358").f();
        boolean f13 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45398669").f();
        boolean f14 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361359").f();
        boolean f15 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45408827").f();
        boolean f16 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45408828").f();
        boolean f17 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45611940").f();
        boolean f18 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45611941").f();
        boolean f19 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45611942").f();
        boolean f20 = ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45611943").f();
        m.a.a.r rVar = new m.a.a.r();
        rVar.add(new Locale("en", "US"));
        if (f) {
            rVar.add(new Locale("en", "SG"));
        }
        if (f2) {
            rVar.add(new Locale("en", "IN"));
        }
        if (f3) {
            rVar.add(new Locale("en", "AU"));
        }
        if (f4) {
            rVar.add(new Locale("en", "CA"));
        }
        if (f5) {
            rVar.add(new Locale("en", "GB"));
        }
        if (f6) {
            rVar.add(new Locale("en", "IE"));
        }
        if (f7) {
            rVar.add(new Locale("ja", "JP"));
        }
        if (f8) {
            rVar.add(new Locale("de", "DE"));
            if (f9) {
                rVar.add(new Locale("de", "AT"));
                rVar.add(new Locale("de", "BE"));
                rVar.add(new Locale("de", "CH"));
            }
        }
        if (f10) {
            rVar.add(new Locale("fr", "FR"));
            rVar.add(new Locale("fr", "CA"));
            if (f11) {
                rVar.add(new Locale("fr", "BE"));
                rVar.add(new Locale("fr", "CH"));
            }
        }
        if (f12) {
            rVar.add(new Locale("it", "IT"));
            if (f13) {
                rVar.add(new Locale("it", "CH"));
            }
        }
        if (f14) {
            rVar.add(new Locale("es", "ES"));
            rVar.add(new Locale("es", "US"));
        }
        if (f15) {
            rVar.add(new Locale("hi", "IN"));
        }
        if (f16) {
            rVar.add(new Locale("zh", "TW"));
        }
        if (f17) {
            rVar.add(new Locale("da", "DK"));
        }
        if (f18) {
            rVar.add(new Locale("nl", "NL"));
        }
        if (f19) {
            rVar.add(new Locale("nb", "NO"));
        }
        if (f20) {
            rVar.add(new Locale("sv", "SE"));
        }
        Set ah = m.a.an.ah(rVar);
        ah.getClass();
        return ha.o(ah);
    }

    public final boolean dF() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640478").f();
    }

    public final boolean dG() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45625373").f();
    }

    public final boolean dH() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45654098").f();
    }

    public final boolean dI() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45650548").f();
    }

    public final boolean dJ() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45649887").f();
    }

    public final boolean dK() {
        return ((e) this.b.f308a.rZ().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45408021").f();
    }

    public final boolean dL() {
        return ((e) this.b.f308a.sm().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45476091").f();
    }

    public final boolean dM() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45628780").f();
    }

    public final boolean dN() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45614711").f();
    }

    public final boolean dO() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639450").f();
    }

    public final boolean dP() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45460311").f();
    }

    public final boolean dQ() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45374680").f();
    }

    public final boolean dR() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641711").f();
    }

    public final boolean dS() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641710").f();
    }

    public final boolean dT() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45653714").f();
    }

    public final boolean dU() {
        return ((e) this.b.f308a.sm().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45635078").f();
    }

    public final boolean dV() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45648000").f();
    }

    public final boolean dW() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45644378").f();
    }

    public final boolean dX() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45531860").f();
    }

    public final boolean dY() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45643278").f();
    }

    public final boolean dZ() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45644372").f();
    }

    final h.a.a.g.a.a.a di() {
        return new h.a.a.g.a.a.a(this.b.l);
    }

    public final io.grpc.b.n dj() {
        return C().a((Context) this.f315a.f.a());
    }

    public final Optional dk() {
        ik ikVar = this.b;
        h hVar = ikVar.b.u;
        com.google.android.apps.search.assistant.surfaces.voice.robin.car.q bf = ikVar.bf();
        com.google.android.libraries.assistant.auto.jumpboost.n.y yVar = (com.google.android.libraries.assistant.auto.jumpboost.n.y) hVar.a();
        yVar.getClass();
        return bf.a ? Optional.of(yVar) : Optional.empty();
    }

    public final Object dl() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.b(new com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.a.i((com.google.common.v.f) this.f315a.ez.a(), (cg) this.fb.a(), Optional.of(this.f315a.c.Y()), (Executor) this.f315a.H.a()));
    }

    public final Object dm() {
        return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.u((cr) this.f315a.H.a(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.b) this.eL.a(), (com.google.common.v.f) this.f315a.ez.a(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.b.z) this.f315a.f319a.dz.a());
    }

    public final Object dn() {
        return new aj((com.google.android.libraries.mdi.download.aj) this.f315a.ay.a());
    }

    /* renamed from: do */
    public final Object m117do() {
        jo joVar = this.f315a;
        h hVar = this.eN;
        h hVar2 = joVar.H;
        h hVar3 = this.eL;
        h hVar4 = this.eM;
        h hVar5 = joVar.wN;
        h hVar6 = joVar.ez;
        jx jxVar = joVar.c;
        return new bs(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, jxVar.ah, this.eO, this.eQ, jxVar.ai, jxVar.af, jxVar.ag);
    }

    public final Object dp() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.k((com.google.android.libraries.assistant.c.b.c.v) this.b.em.a(), (com.google.android.libraries.assistant.c.b.c.d) this.b.f308a.bs.a(), (com.google.android.libraries.assistant.c.b.a.a.a) this.f315a.jl.a(), (com.google.android.libraries.assistant.c.b.a.a.a) this.f315a.f319a.dB.a(), (com.google.common.v.f) this.f315a.ez.a(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45420104").d(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45633865").f(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45635966").d(), (cq) this.f315a.H.a());
    }

    final Object dq() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.g.e((com.google.android.apps.search.assistant.surfaces.dictation.service.d.f.g) this.aV.a(), t());
    }

    public final String dr() {
        return ((e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45380133").e();
    }

    public final String ds() {
        return ((e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45462074").e();
    }

    public final Map dt() {
        jo joVar = this.f315a.c.f325a;
        return fu.p(com.google.android.apps.search.assistant.surfaces.dictation.service.d.b.d, new com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.b(((e) joVar.V.a()).a("com.google.android.apps.search.assistant.device 45612083").d()), com.google.android.apps.search.assistant.surfaces.dictation.service.d.b.a, ((lt) this.fB.a()).M("enhanced-voice-dictation"), com.google.android.apps.search.assistant.surfaces.dictation.service.d.b.c, new com.google.android.apps.search.assistant.surfaces.dictation.service.d.b.i((com.google.android.apps.search.assistant.surfaces.dictation.service.d.c.a) this.f315a.c.cm.a(), t(), Optional.of(dq()), (com.google.android.apps.search.assistant.surfaces.dictation.service.r.e) this.aH.a(), u()), com.google.android.apps.search.assistant.surfaces.dictation.service.d.b.b, new com.google.android.apps.search.assistant.surfaces.dictation.service.d.d.f((lt) this.fB.a(), t()));
    }

    public final Map du() {
        fq i = fu.i(11);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.o}), this.f315a.c.Y);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.h}), this.f315a.c.Z);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.k}), this.f315a.c.aa);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.g, com.google.android.libraries.search.assistant.o.o.f}), this.f315a.c.ab);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.m}), this.f315a.c.ac);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.d, com.google.android.libraries.search.assistant.o.o.e}), this.f315a.c.ad);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.a}), this.eG);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.r}), this.eH);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.l}), this.eI);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.p}), this.eJ);
        i.i(new com.google.android.libraries.search.assistant.o.f(new com.google.android.libraries.search.assistant.o.o[]{com.google.android.libraries.search.assistant.o.o.q}), this.eK);
        return i.h(true);
    }

    public final Map dv() {
        jx jxVar = this.f315a.c;
        jo joVar = jxVar.f325a;
        com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n nVar = com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n.d;
        com.google.android.apps.gsa.staticplugins.opa.ag.a dmVar = new dm((com.google.android.apps.gsa.staticplugins.ba.ag) joVar.nG.a(), (com.google.android.libraries.g.a) jxVar.f325a.g.a(), (com.google.android.libraries.gsa.h.h) jxVar.f325a.gp.a());
        if (((com.google.android.apps.gsa.search.core.aa.a.k) jxVar.f325a.hq.a()).n()) {
            dmVar = new com.google.android.apps.gsa.staticplugins.opa.ag.a();
        }
        jr jrVar = this.f315a.b;
        com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n nVar2 = com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n.c;
        boolean l = jrVar.iJ().l();
        com.google.android.apps.search.assistant.surfaces.voice.m.b.a.d.g nVar3 = new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.d.n(this.b.H(), (com.google.android.libraries.g.a) this.f315a.g.a(), (cr) this.f315a.H.a());
        if (!l) {
            nVar3 = new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.d.g();
        }
        jo joVar2 = this.f315a;
        return fu.p(nVar, dmVar, nVar2, nVar3, com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n.e, new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.d.f((Context) joVar2.f.a()), com.google.android.apps.search.assistant.surfaces.voice.m.b.a.c.n.b, new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.d.i(new com.google.android.apps.search.assistant.surfaces.voice.m.b.a.b.k(androidx.compose.ui.l.f.aB((Context) this.f315a.f.a(), bw()), (cr) this.f315a.H.a()), (com.google.android.libraries.g.a) this.f315a.g.a(), (cr) this.f315a.H.a()));
    }

    public final Map dw() {
        return fu.o(com.google.android.libraries.search.assistant.ai.c.i.d, this.fh, com.google.android.libraries.search.assistant.ai.c.i.c, this.fi, com.google.android.libraries.search.assistant.ai.c.i.b, this.fj);
    }

    public final Map dx() {
        return fu.o(com.google.android.libraries.search.assistant.ai.c.i.d, this.et, com.google.android.libraries.search.assistant.ai.c.i.c, this.eu, com.google.android.libraries.search.assistant.ai.c.i.b, this.ev);
    }

    public final Map dy() {
        jx jxVar = this.f315a.c;
        boolean dR = jxVar.dR();
        boolean dS = jxVar.dS();
        boolean dT = jxVar.dT();
        boolean dU = jxVar.dU();
        boolean dV = jxVar.dV();
        boolean dW = jxVar.dW();
        boolean dY = jxVar.dY();
        double a2 = jxVar.a();
        com.google.android.apps.search.assistant.surfaces.dictation.a.q V = jxVar.V();
        jxVar.gb();
        jxVar.gc();
        jxVar.gd();
        jxVar.ge();
        jxVar.gf();
        jxVar.gg();
        jxVar.gh();
        return fu.m("smart_dictation", new com.google.android.apps.search.assistant.surfaces.dictation.service.d.e.a(new com.google.android.apps.search.assistant.surfaces.dictation.service.d.h.a(dR, dS, dT, dU, dV, dW, dY, a2, V)));
    }

    public final Set dz() {
        Set set;
        jo joVar = this.f315a.c.f325a;
        gy l = ha.l(2);
        l.h(new com.google.android.libraries.search.assistant.n.a.e.a.a.b((ag) joVar.Q.a()));
        if (h.a.a.f.b.a.n.h(this.b.l)) {
            Object a2 = this.fk.a();
            a2.getClass();
            set = (Set) a2;
        } else {
            set = m.a.aa.a;
        }
        l.j(set);
        return l.g();
    }

    final long e() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45629188").b();
    }

    public final boolean eA() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45401665").f();
    }

    final boolean eB() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45368694").f();
    }

    public final boolean eC() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639343").f();
    }

    public final com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.f eD() {
        return new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.f(new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.b((com.google.frameworks.client.data.android.l) this.b.f308a.bk.a(), (cq) this.f315a.v.a(), (com.google.android.libraries.search.trust.c.t) this.f315a.wH.a()));
    }

    final com.google.android.libraries.search.assistant.p.a.a.c.c eE() {
        ci ciVar = (ci) this.b.f308a.fV.a();
        com.google.android.apps.search.assistant.platform.appintegration.performers.f.a aVar = (com.google.android.apps.search.assistant.platform.appintegration.performers.f.a) this.cE.a();
        h hVar = this.b.ba;
        PermissionsRequesterImpl k = k();
        com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) hVar.a();
        lt ltVar = (lt) this.b.f308a.fW.a();
        iz izVar = this.b.b;
        h hVar2 = izVar.H;
        boolean jP = izVar.jP();
        boolean booleanValue = ((Boolean) hVar2.a()).booleanValue();
        ba createBuilder = fe.a.createBuilder();
        createBuilder.copyOnWrite();
        fe feVar = createBuilder.instance;
        feVar.b |= 1;
        feVar.c = jP;
        fe build = createBuilder.build();
        ba createBuilder2 = com.google.g.e.i.be.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.be beVar = createBuilder2.instance;
        beVar.b |= 1;
        beVar.c = "call.CALL";
        ba createBuilder3 = ei.a.createBuilder();
        createBuilder3.copyOnWrite();
        ei eiVar = createBuilder3.instance;
        eiVar.b |= 1;
        eiVar.c = "assistant.api.client_op.properties.CallProperties";
        com.google.protobuf.v byteString = build.toByteString();
        createBuilder3.copyOnWrite();
        ei eiVar2 = createBuilder3.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        ei build2 = createBuilder3.build();
        createBuilder2.copyOnWrite();
        com.google.g.e.i.be beVar2 = createBuilder2.instance;
        build2.getClass();
        beVar2.e = build2;
        beVar2.b |= 4;
        com.google.g.e.i.be build3 = createBuilder2.build();
        com.google.android.libraries.search.assistant.performer.communication.h a2 = com.google.android.libraries.search.assistant.performer.communication.i.a();
        a2.c(booleanValue);
        return com.google.android.libraries.search.assistant.p.a.a.c.b.a(build3, new com.google.android.apps.search.assistant.platform.appintegration.performers.communication.c(ciVar, a2.a(), aVar, k, ltVar, bVar));
    }

    public final com.google.android.libraries.search.assistant.ap.c.c.b.f eF() {
        com.google.android.libraries.search.assistant.ap.c.c.b.f fVar = (com.google.android.libraries.search.assistant.ap.c.c.b.f) this.dY.a();
        fVar.getClass();
        return fVar;
    }

    public final com.google.android.libraries.search.assistant.ap.e.a.j eG() {
        lt ltVar = (lt) this.ea.a();
        com.google.android.libraries.search.assistant.p.a.a.b.e eVar = (com.google.android.libraries.search.assistant.p.a.a.b.e) this.eh.a();
        ltVar.getClass();
        eVar.getClass();
        com.google.android.libraries.search.assistant.p.a.c.j jVar = new com.google.android.libraries.search.assistant.p.a.c.j((com.google.android.libraries.search.assistant.p.a.c.u) ((jh) ltVar.a).b.f308a.me());
        ji jiVar = ((jh) ltVar.a).b.d;
        jo joVar = jiVar.f315a;
        h hVar = jiVar.C;
        com.google.android.libraries.search.assistant.ap.d.c.e eVar2 = new com.google.android.libraries.search.assistant.ap.d.c.e(jiVar.b.hQ(), c.b(jiVar.B), c.b(hVar), (ag) joVar.Q.a());
        ag agVar = (ag) ((jh) ltVar.a).f314a.Q.a();
        Executor executor = (Executor) ((jh) ltVar.a).f314a.H.a();
        ji jiVar2 = ((jh) ltVar.a).b.d;
        com.google.android.libraries.search.assistant.ap.b.a.k kVar = new com.google.android.libraries.search.assistant.ap.b.a.k((com.google.android.libraries.search.assistant.u.i) jiVar2.f315a.rq.a(), (Executor) jiVar2.f315a.v.a(), (ag) jiVar2.f315a.Q.a(), jiVar2.bi());
        com.google.android.libraries.search.assistant.ap.d.c.d dVar = (com.google.android.libraries.search.assistant.ap.d.c.d) ((jh) ltVar.a).b.d.z.a();
        kotlinx.coroutines.b.cq cqVar = (kotlinx.coroutines.b.cq) ((jh) ltVar.a).b.d.D.a();
        com.google.android.libraries.search.assistant.ap.a.a.a aVar = new com.google.android.libraries.search.assistant.ap.a.a.a(c.b(((jh) ltVar.a).b.d.E));
        com.google.android.libraries.search.assistant.ap.d.a.c cVar = (com.google.android.libraries.search.assistant.ap.d.a.c) ((jh) ltVar.a).b.d.y.a();
        com.google.android.libraries.search.assistant.ap.e.a.a aVar2 = (com.google.android.libraries.search.assistant.ap.e.a.a) ((jh) ltVar.a).b.d.F.a();
        ji jiVar3 = ((jh) ltVar.a).b.d;
        return new com.google.android.libraries.search.assistant.ap.e.a.j(jVar, eVar2, eVar, agVar, executor, kVar, dVar, cqVar, aVar, cVar, aVar2, jiVar3.bi(), (com.google.android.libraries.search.assistant.ap.d.d.a) jiVar3.A.a());
    }

    public final void eH() {
        jr jrVar = this.f315a.b;
        jrVar.D();
        jrVar.D();
        ik ikVar = this.b;
        ikVar.ag();
        ikVar.ah();
        jj jjVar = ikVar.f308a;
        jjVar.H();
        com.google.common.f.j jVar = com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.a.e.a;
    }

    public final com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.c eI() {
        return new com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.c(Optional.of(this.b.H()));
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.l.c eJ() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.l.c((g) this.ay.a(), D());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.l.ac eK() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.l.ac(eJ(), (com.google.android.apps.search.assistant.surfaces.dictation.service.o.s) this.aW.a(), (ag) this.f315a.Q.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac eL() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac((Context) this.f315a.f.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c) this.f315a.c.aj.a());
    }

    final com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac eM() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.r.ac(J(), eL());
    }

    public final as eN() {
        return new as((Context) this.f315a.f.a());
    }

    final h.a.a.f.b.a.k eO() {
        return new h.a.a.f.b.a.k(this.b.l);
    }

    public final h.a.a.f.b.a.k eP() {
        return new h.a.a.f.b.a.k(this.b.l);
    }

    public final h.a.a.f.b.a.m eQ() {
        return new h.a.a.f.b.a.m(this.b.l);
    }

    public final boolean ea() {
        return ((e) new h.a.a.d.b.a.ag(this.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45645547").f();
    }

    public final boolean eb() {
        return ((e) this.b.f308a.rY().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45383992").f();
    }

    public final boolean ec() {
        return ((e) this.b.f308a.rY().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45415994").f();
    }

    public final boolean ed() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45611882").f();
    }

    public final boolean ee() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45358129").f();
    }

    public final boolean ef() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45620429").f();
    }

    public final boolean eg() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45367857").f();
    }

    public final boolean eh() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45354639").f();
    }

    public final boolean ei() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45367855").f();
    }

    public final boolean ej() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45367856").f();
    }

    public final boolean ek() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45382813").f();
    }

    public final boolean el() {
        return ((e) this.b.c.lF().a.a()).a("com.google.android.libraries.search.googleapp.user 45461846").f();
    }

    final boolean em() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45420880").f();
    }

    final boolean en() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 483483172").f();
    }

    final boolean eo() {
        return new h.a.a.f.b.a.k(this.b.l).g();
    }

    public final boolean ep() {
        return ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45629852").f();
    }

    final boolean eq() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45410939").f();
    }

    final boolean er() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45642378").f();
    }

    final boolean es() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45531125").f();
    }

    final boolean et() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45387205").f();
    }

    final boolean eu() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45531124").f();
    }

    final boolean ev() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45461589").f();
    }

    final boolean ew() {
        return new h.a.a.f.b.a.k(this.b.l).f();
    }

    final boolean ex() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45390592").f();
    }

    public final boolean ey() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45357201").f();
    }

    final boolean ez() {
        return ((e) new h.a.a.f.b.a.k(this.b.l).a.a()).a("com.google.android.apps.search.assistant.user 45532209").f();
    }

    public final com.google.android.apps.gsa.search.shared.h.a.h f() {
        return new com.google.android.apps.gsa.search.shared.h.a.h(new com.google.android.apps.gsa.search.shared.h.a.a((com.google.android.apps.gsa.search.shared.h.b) this.f315a.c.f325a.ip.a()), (n) this.f315a.R.a());
    }

    public final com.google.android.apps.search.assistant.libraries.m.b g() {
        com.google.android.apps.search.assistant.platform.g.g.b.t ft = this.f315a.ft();
        boolean f = ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 10").f();
        boolean f2 = ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45363275").f();
        com.google.android.apps.search.assistant.platform.g.g.b.c cVar = (com.google.android.apps.search.assistant.platform.g.g.b.c) this.b.aj.a();
        AccountId accountId = (AccountId) this.b.g.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f315a.bN.a();
        com.google.android.apps.search.assistant.platform.g.k.a.d dVar = (com.google.android.apps.search.assistant.platform.g.k.a.d) this.b.Z.a();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.e eVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.b.as.a();
        ik ikVar = this.b;
        com.google.android.apps.search.assistant.surfaces.voice.t.m mVar = new com.google.android.apps.search.assistant.surfaces.voice.t.m(ft, f, f2, cVar, accountId, bVar, dVar, eVar, ikVar.aY(), ((e) ikVar.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651390").f(), ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45461793").f(), ((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45531369").f());
        io.grpc.i qh = this.b.qh();
        com.google.frameworks.client.data.android.server.tiktok.ac acVar = (com.google.frameworks.client.data.android.server.tiktok.ac) this.f315a.em.a();
        acVar.getClass();
        ar e = acVar.e(new ar(qh, io.grpc.h.a), "assistant-backend-binding");
        e.getClass();
        return new com.google.android.apps.search.assistant.libraries.m.b(e, mVar);
    }

    public final com.google.android.apps.search.assistant.libraries.m.b h() {
        com.google.android.apps.search.assistant.platform.i.c cVar = new com.google.android.apps.search.assistant.platform.i.c(((e) this.b.l.a()).a("com.google.android.apps.search.assistant.user 45357402").f());
        h hVar = this.em;
        hVar.getClass();
        Object a2 = hVar.a();
        a2.getClass();
        return new com.google.android.apps.search.assistant.libraries.m.b((ar) a2, cVar);
    }

    public final com.google.android.apps.search.assistant.libraries.m.b i() {
        ar e = ((com.google.frameworks.client.data.android.server.tiktok.ac) this.f315a.em.a()).e(new ar(this.b.qh()), "legacy-backend-binding");
        e.getClass();
        return new com.google.android.apps.search.assistant.libraries.m.b(e, new com.google.android.apps.search.assistant.libraries.m.a());
    }

    public final com.google.android.apps.search.assistant.platform.appintegration.mosaic.a.b.a.a j() {
        return new com.google.android.apps.search.assistant.platform.appintegration.mosaic.a.b.a.a(this.eA);
    }

    final PermissionsRequesterImpl k() {
        return new PermissionsRequesterImpl((Context) this.f315a.f.a(), (cr) this.f315a.H.a(), (com.google.apps.tiktok.concurrent.ao) this.f315a.bz.a());
    }

    public final com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.n l() {
        return new com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.n((com.google.android.libraries.search.b.b) this.eP.a(), (cr) this.f315a.H.a(), (com.google.android.apps.search.assistant.platform.ondevice.datadownload.c.a.u) this.f315a.c.ae.a(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45628173").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.a.g m() {
        Context context = (Context) this.f315a.ux.a();
        jo joVar = this.f315a;
        return new com.google.android.apps.search.assistant.surfaces.bisto.interactor.o.a.g(context, (com.google.android.apps.search.assistant.surfaces.bisto.a.f.l) this.b.f308a.mi(), (cq) joVar.v.a(), (com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p) this.b.f308a.by.a(), ((e) new h.a.a.a.a.a.b.a.a.c(this.f315a.c.f325a.V).a.a()).a("googledata.experiments.mobile.assistant.client_packages.component.assistant_tng_interactor.device 45656550").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.e.c.k n() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.e.c.k((com.google.android.libraries.search.trust.c.t) this.f315a.wH.a(), c.b(this.b.ei), (com.google.frameworks.client.data.android.l) this.f315a.f319a.aS.a(), this.f315a.f319a.sw().D());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.e.f.a.a.a o() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.e.f.a.a.a((com.google.speech.g.bn) this.eD.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.bisto.e.f.b.a p() {
        return new com.google.android.apps.search.assistant.surfaces.bisto.e.f.b.a((cr) this.f315a.H.a(), (AccountId) this.b.g.a(), (com.google.apps.tiktok.p.b) this.f315a.lR.a(), (com.google.apps.tiktok.account.data.b) this.f315a.bN.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.a.j q() {
        h hVar = this.f315a.c.ak;
        as eN = eN();
        com.google.android.apps.search.assistant.surfaces.dictation.service.z.ai aiVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.z.ai) hVar.a();
        bq bqVar = (bq) this.aB.a();
        N();
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.a.j(eN, aiVar, bqVar, (com.google.android.apps.search.assistant.surfaces.dictation.service.s.a) this.aD.a(), this.f315a.c.cK());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.a.x r() {
        bt s = s();
        Context context = (Context) this.f315a.f.a();
        jo joVar = this.f315a;
        jx jxVar = joVar.c;
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.a.x(s, context, jxVar.aF(), jxVar.en(), (cr) joVar.H.a());
    }

    final bt s() {
        return new bt((Executor) this.f315a.B.a());
    }

    final com.google.android.apps.search.assistant.surfaces.dictation.service.d.h.a t() {
        jx jxVar = this.f315a.c;
        boolean dR = jxVar.dR();
        boolean dS = jxVar.dS();
        boolean dT = jxVar.dT();
        boolean dU = jxVar.dU();
        boolean dV = jxVar.dV();
        boolean dW = jxVar.dW();
        boolean dY = jxVar.dY();
        double a2 = jxVar.a();
        com.google.android.apps.search.assistant.surfaces.dictation.a.q V = jxVar.V();
        jxVar.gb();
        this.f315a.c.gc();
        this.f315a.c.gd();
        this.f315a.c.ge();
        this.f315a.c.gf();
        this.f315a.c.gg();
        this.f315a.c.gh();
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.h.a(dR, dS, dT, dU, dV, dW, dY, a2, V);
    }

    final com.google.android.apps.search.assistant.surfaces.dictation.service.d.h.j u() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.d.h.j((Context) this.f315a.f.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.g.aw v() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.g.aw((com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.e) this.aA.a(), (cg) this.eU.a(), (Executor) this.f315a.H.a(), (com.google.common.v.f) this.f315a.ez.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.u w() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.u(((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45365347").f(), (com.google.android.libraries.search.assistant.invocation.k.b.b.b) this.b.f308a.bJ.a(), new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.r((com.google.android.enterprise.connectedapps.c) this.f315a.c.f325a.ky.a()), (com.google.android.enterprise.connectedapps.c) this.f315a.ky.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c) this.f315a.c.aj.a(), (Executor) this.f315a.H.a());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.dictation.service.f.a] */
    public final com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.z x() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.z((j) this.f315a.as.a(), (cr) this.f315a.v.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.f.a) dp(), B(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45365715").f(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45418697").f());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.apps.search.assistant.surfaces.dictation.service.f.a] */
    public final com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.l y() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.l((j) this.f315a.as.a(), (com.google.android.apps.search.assistant.surfaces.dictation.service.f.a) dp(), B(), ((e) this.f315a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45374064").b(), (cr) this.f315a.v.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.d z() {
        return new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.d((Context) this.f315a.f.a(), (n) this.f315a.R.a());
    }
}
