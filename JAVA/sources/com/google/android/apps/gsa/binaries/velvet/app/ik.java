package com.google.android.apps.gsa.binaries.velvet.app;

import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.provider.CalendarContract;
import androidx.core.d.e$;
import com.google.android.apps.search.assistant.libraries.b.b.b.u;
import com.google.android.apps.search.assistant.libraries.b.b.i;
import com.google.android.apps.search.assistant.libraries.b.b.j;
import com.google.android.apps.search.assistant.libraries.dictation.a.k;
import com.google.android.apps.search.assistant.libraries.dictation.b.a.e;
import com.google.android.apps.search.assistant.platform.g.c.a.y;
import com.google.android.apps.search.assistant.platform.g.j.b.f;
import com.google.android.apps.search.assistant.platform.pcp.api.l;
import com.google.android.apps.search.assistant.platform.pcp.b.q;
import com.google.android.apps.search.assistant.platform.pcp.b.t;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.ad;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o;
import com.google.android.apps.search.assistant.platform.pcp.j.ac;
import com.google.android.apps.search.assistant.platform.pcp.j.ah;
import com.google.android.apps.search.assistant.platform.pcp.j.aj;
import com.google.android.apps.search.assistant.platform.pcp.j.as;
import com.google.android.apps.search.assistant.platform.pcp.j.ba;
import com.google.android.apps.search.assistant.platform.pcp.j.bc;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bf;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bj;
import com.google.android.apps.search.assistant.surfaces.notification.ab;
import com.google.android.apps.search.assistant.surfaces.notification.w;
import com.google.android.apps.search.assistant.surfaces.voice.j.a.d.s;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.ap;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ae.af;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.am;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ao.ak;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ao.an;
import com.google.android.apps.search.assistant.surfaces.voice.robin.r.al;
import com.google.android.apps.search.assistant.surfaces.voice.robin.routing.aa;
import com.google.android.apps.search.assistant.surfaces.voice.robin.ui.l.bb;
import com.google.android.apps.search.assistant.surfaces.voice.robin.x.bd;
import com.google.android.apps.search.assistant.verticals.ambient.n.ar;
import com.google.android.apps.search.assistant.verticals.ambient.n.bh;
import com.google.android.apps.search.assistant.verticals.ambient.u.p.z;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.at;
import com.google.android.libraries.appintegration.jam.g.a.a.a.r;
import com.google.android.libraries.assistant.auto.tng.w.d.b.b.a;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.search.ah.i.b.Cdo;
import com.google.android.libraries.search.assistant.n.a.b.bo;
import com.google.android.libraries.search.assistant.n.a.b.bw;
import com.google.android.libraries.search.assistant.n.a.b.da;
import com.google.android.libraries.search.assistant.n.a.b.fv;
import com.google.android.libraries.search.assistant.proactive.bx;
import com.google.android.libraries.search.assistant.proactive.ce;
import com.google.android.libraries.search.d.aq;
import com.google.android.libraries.search.l.p;
import com.google.android.libraries.storage.c.ai;
import com.google.android.libraries.storage.protostore.cg;
import com.google.android.libraries.storage.protostore.x;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.phenotype.bv;
import com.google.apps.tiktok.g.ax;
import com.google.apps.tiktok.g.ay;
import com.google.apps.tiktok.q.b.g;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.b.nr;
import com.google.common.b.op;
import com.google.common.base.bu;
import com.google.common.base.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.g.ab.d.b.lt;
import com.google.g.af.c.cj;
import com.google.g.ar.lk;
import com.google.g.e.h.a.az;
import com.google.g.e.i.be;
import com.google.g.e.i.ei;
import com.google.g.e.i.gf;
import com.google.g.e.i.si;
import com.google.protobuf.ao;
import com.google.protobuf.cb;
import com.google.speech.g.bn;
import e.c.b;
import e.c.c;
import e.c.h;
import e.c.m;
import e.d.a.v;
import e.d.d;
import h.a.a.d.b.a.ae;
import io.grpc.cx;
import j$.time.Duration;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import kotlinx.coroutines.ag;
import m.c.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/ik.class */
public final class ik extends ou {
    public h A;
    public h B;
    public h C;
    public h D;
    public h E;
    public h F;
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

    /* renamed from: a, reason: collision with root package name */
    public final jj f308a;
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
    public final iz b;
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
    public h bq;
    public h br;
    public h bs;
    public h bt;
    public h bu;
    public h bv;
    public h bw;
    public h bx;
    public h by;
    public h bz;
    public final je c;
    public h cA;
    public h cB;
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
    public h cb;
    public h cc;
    public h cd;
    public h ce;
    public h cf;
    public h cg;
    public h ch;
    public h ci;
    public h cj;
    public h ck;
    public h cl;
    public h cm;
    public h cn;
    public h co;
    public h cp;
    public h cq;
    public h cr;
    public h cs;
    public h ct;
    public h cu;
    public h cv;
    public h cw;
    public h cx;
    public h cy;
    public h cz;
    public final ji d;
    public h dA;
    public h dB;
    public h dC;
    public h dD;
    public h dE;
    public h dF;
    public h dG;
    public h dH;
    public h dI;
    public h dJ;
    public h dK;
    public h dL;
    public h dM;
    public h dN;
    public h dO;
    public h dP;
    public h dQ;
    public h dR;
    public h dS;
    public h dT;
    public h dU;
    public h dV;
    public h dW;
    public h dX;
    public h dY;
    public h dZ;
    public h da;
    public h db;
    public h dc;
    public h dd;
    public h de;
    public h df;
    public h dg;
    public h dh;
    public h di;
    public h dj;
    public h dk;
    public h dl;
    public h dm;
    public h dn;

    /* renamed from: do, reason: not valid java name */
    public h f2do;
    public h dp;
    public h dq;
    public h dr;
    public h ds;
    public h dt;
    public h du;
    public h dv;
    public h dw;
    public h dx;
    public h dy;
    public h dz;
    public final AccountId e;
    public h eA;
    public h eB;
    public h eC;
    public h eD;
    public h eE;
    public h eF;
    public h eG;
    public h eH;
    public h eI;
    public h eJ;
    public h eK;
    public h eL;
    public d eM;
    public d eN;
    public d eO;
    public h eP;
    public d eQ;
    public h eR;
    public d eS;
    public d eT;
    public d eU;
    public d eV;
    public d eW;
    public h eX;
    public d eY;
    public h eZ;
    public h ea;
    public h eb;
    public h ec;
    public h ed;
    public h ee;
    public h ef;
    public h eg;
    public h eh;
    public h ei;
    public h ej;
    public h ek;
    public h el;
    public h em;
    public h en;
    public h eo;
    public h ep;
    public h eq;
    public h er;
    public h es;
    public h et;
    public h eu;
    public h ev;
    public h ew;
    public h ex;
    public h ey;
    public h ez;
    public final jo f;
    public h fA;
    public h fB;
    public h fC;
    public h fD;
    public final h fE;
    public final h fF;
    public final h fG;
    public final h fH;
    public final h fI;
    public final h fJ;
    public final h fK;
    public final h fL;
    public final h fM;
    public final h fN;
    public final h fO;
    public final h fP;
    public final h fQ;
    public final h fR;
    public final h fS;
    public final h fT;
    public final h fU;
    public final h fV;
    public final h fW;
    public final h fX;
    public final h fY;
    public final h fZ;
    public h fa;
    public h fb;
    public h fc;
    public h fd;
    public h fe;
    public d ff;
    public d fg;
    public h fh;
    public h fi;
    public d fj;
    public d fk;
    public d fl;
    public h fm;
    public h fn;
    public h fo;
    public h fp;
    public d fq;
    public d fr;
    public d fs;
    public d ft;
    public d fu;
    public h fv;
    public d fw;
    public h fx;
    public h fy;
    public h fz;
    public h g;
    public final d gA;
    public final d gB;
    public final h gC;
    public final d gD;
    private final ik gF = this;
    private h gG;
    private h gH;
    private h gI;
    private h gJ;
    private h gK;
    private h gL;
    private h gM;
    private h gN;
    private h gO;
    private h gP;
    private h gQ;
    private h gR;
    private h gS;
    private h gT;
    private h gU;
    private h gV;
    private h gW;
    private h gX;
    private h gY;
    private h gZ;
    public final h ga;
    public final h gb;
    public final h gc;
    public final h gd;
    public final h ge;
    public final h gf;
    public final h gg;
    public final d gh;
    public final h gi;
    public final h gj;
    public final d gk;
    public final h gl;
    public final d gm;
    public final d gn;
    public final d go;
    public final d gp;
    public final h gq;
    public final d gr;
    public final d gs;
    public final d gt;
    public final d gu;
    public final d gv;
    public final d gw;
    public final d gx;
    public final d gy;
    public final d gz;
    public h h;
    private final h hA;
    private final h hB;
    private final h hC;
    private final h hD;
    private final h hE;
    private final h hF;
    private final h hG;
    private final h hH;
    private final h hI;
    private final h hJ;
    private final h hK;
    private final h hL;
    private final h hM;
    private final h hN;
    private final h hO;
    private final h hP;
    private final h hQ;
    private final h hR;
    private final h hS;
    private final h hT;
    private final h hU;
    private final h hV;
    private final h hW;
    private final h hX;
    private final h hY;
    private final h hZ;
    private h ha;
    private h hb;
    private h hc;
    private h hd;
    private final h he;
    private final h hf;
    private final h hg;
    private final h hh;
    private final h hi;
    private final h hj;
    private final h hk;
    private final h hl;
    private final h hm;
    private final h hn;
    private final h ho;
    private final h hp;
    private final h hq;
    private final h hr;
    private final h hs;
    private final h ht;
    private final h hu;
    private final h hv;
    private final h hw;
    private final h hx;
    private final h hy;
    private final h hz;
    public h i;
    private final h iA;
    private final h iB;
    private final h iC;
    private final h iD;
    private final h iE;
    private final h iF;
    private final h iG;
    private final h iH;
    private final h iI;
    private final h iJ;
    private final h iK;
    private h iL;
    private h iM;
    private h iN;
    private h iO;
    private h iP;
    private h iQ;
    private h iR;
    private h iS;
    private h iT;
    private h iU;
    private h iV;
    private h iW;
    private h iX;
    private h iY;
    private h iZ;
    private final h ia;
    private final h ib;
    private final h ic;
    private final h id;
    private final h ie;

    /* renamed from: if, reason: not valid java name */
    private final h f3if;
    private final h ig;
    private final h ih;
    private final h ii;
    private final h ij;
    private final h ik;
    private final h il;
    private final h im;
    private final h in;
    private final h io;
    private final h ip;
    private final h iq;
    private final h ir;
    private final h is;
    private final h it;
    private final h iu;
    private final h iv;
    private final h iw;
    private final h ix;
    private final h iy;
    private final h iz;
    public h j;
    private h jA;
    private h jB;
    private h jC;
    private h jD;
    private h jE;
    private h jF;
    private h jG;
    private h jH;
    private h jI;
    private h jJ;
    private h jK;
    private h jL;
    private h jM;
    private h jN;
    private h jO;
    private h jP;
    private h jQ;
    private h jR;
    private h jS;
    private h jT;
    private h jU;
    private h jV;
    private h jW;
    private h jX;
    private h jY;
    private h jZ;
    private h ja;
    private h jb;
    private h jc;
    private h jd;
    private h je;
    private h jf;
    private h jg;
    private h jh;
    private h ji;
    private h jj;
    private h jk;
    private h jl;
    private h jm;
    private h jn;
    private h jo;
    private h jp;
    private h jq;
    private h jr;
    private h js;
    private h jt;
    private h ju;
    private h jv;
    private h jw;
    private h jx;
    private h jy;
    private h jz;
    public h k;
    private h kA;
    private h kB;
    private h kC;
    private h kD;
    private h kE;
    private h kF;
    private h kG;
    private h kH;
    private h kI;
    private h kJ;
    private h kK;
    private h kL;
    private h kM;
    private h kN;
    private h kO;
    private h kP;
    private h kQ;
    private h kR;
    private h kS;
    private h kT;
    private h kU;
    private h kV;
    private h kW;
    private h kX;
    private h kY;
    private h kZ;
    private h ka;
    private h kb;
    private h kc;
    private h kd;
    private h ke;
    private h kf;
    private h kg;
    private h kh;
    private h ki;
    private h kj;
    private h kk;
    private h kl;
    private h km;
    private h kn;
    private h ko;
    private h kp;
    private h kq;
    private h kr;
    private h ks;
    private h kt;
    private h ku;
    private h kv;
    private h kw;
    private h kx;
    private h ky;
    private h kz;
    public h l;
    private final h lA;
    private final h lB;
    private final h lC;
    private final h lD;
    private final h lE;
    private h la;
    private h lb;
    private h lc;
    private h ld;
    private h le;
    private h lf;
    private h lg;
    private h lh;
    private h li;
    private h lj;
    private h lk;
    private h ll;
    private h lm;
    private h ln;
    private h lo;
    private h lp;
    private h lq;
    private h lr;
    private h ls;
    private h lt;
    private h lu;
    private h lv;
    private h lw;
    private h lx;
    private final h ly;
    private final h lz;
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

    public ik(jo joVar, AccountId accountId) {
        this.f = joVar;
        this.e = accountId;
        yI();
        yT();
        this.G = new jd(joVar, this, 61, 1);
        this.H = c.c(new jd(joVar, this, 64, 1));
        this.I = c.c(new jd(joVar, this, 60, 1));
        this.he = new jd(joVar, this, 59, 1);
        this.J = c.c(new jd(joVar, this, 27, 1));
        this.K = m.b(new jd(joVar, this, 66, 1));
        this.L = m.b(new jd(joVar, this, 67, 1));
        this.M = m.b(new jd(joVar, this, 65, 1));
        this.hf = c.c(new jd(joVar, this, 68, 1));
        this.hg = c.c(new jd(joVar, this, 69, 1));
        this.hh = c.c(new jd(joVar, this, 70, 1));
        this.N = c.c(new jd(joVar, this, 23, 1));
        this.hi = new jd(joVar, this, 71, 1);
        this.O = new jd(joVar, this, 22, 1);
        this.hj = c.c(new jd(joVar, this, 73, 1));
        this.hk = c.c(new jd(joVar, this, 74, 1));
        b bVar = new b();
        this.P = bVar;
        this.Q = m.b(new jd(joVar, this, 76, 1));
        this.R = c.c(new jd(joVar, this, 75, 1));
        this.hl = new jd(joVar, this, 72, 1);
        this.hm = new jd(joVar, this, 77, 1);
        this.hn = c.c(new jd(joVar, this, 21, 1));
        this.ho = c.c(new jd(joVar, this, 20, 1));
        this.hp = new jd(joVar, this, 83, 1);
        this.hq = c.c(new jd(joVar, this, 84, 1));
        this.hr = c.c(new jd(joVar, this, 88, 1));
        this.hs = c.c(new jd(joVar, this, 89, 1));
        this.S = c.c(new jd(joVar, this, 90, 1));
        this.T = c.c(new jd(joVar, this, 91, 1));
        this.U = c.c(new jd(joVar, this, 92, 1));
        b bVar2 = new b();
        this.V = bVar2;
        this.W = new jd(joVar, this, 87, 1);
        this.ht = new jd(joVar, this, 86, 1);
        this.hu = c.c(new jd(joVar, this, 85, 1));
        b.b(bVar2, new jd(joVar, this, 82, 1));
        this.hv = new jd(joVar, this, 81, 1);
        this.X = c.c(new jd(joVar, this, 93, 1));
        this.hw = c.c(new jd(joVar, this, 80, 1));
        this.hx = c.c(new jd(joVar, this, 95, 1));
        h c = c.c(new jd(joVar, this, 96, 1));
        this.Y = c;
        this.Z = new b();
        this.hy = c.c(new jd(joVar, this, 94, 1));
        this.hz = c.c(new jd(joVar, this, 97, 1));
        this.aa = new jd(joVar, this, 98, 1);
        this.ab = c.c(new jd(joVar, this, 101, 1));
        this.ac = c.c(new jd(joVar, this, 103, 1));
        this.hA = c.c(new jd(joVar, this, 102, 1));
        this.ad = c.c(new jd(joVar, this, 100, 1));
        this.hB = m.b(new jd(joVar, this, 104, 1));
        this.hC = c.c(new jd(joVar, this, 105, 1));
        this.ae = c.c(new jd(joVar, this, 106, 1));
        this.af = c.c(new jd(joVar, this, 107, 1));
        this.hD = c.c(new jd(joVar, this, 110, 1));
        this.ag = new jd(joVar, this, 109, 1);
        this.ah = c.c(new jd(joVar, this, 113, 1));
        this.hE = c.c(new jd(joVar, this, 112, 1));
        this.ai = c.c(new jd(joVar, this, 111, 1));
        this.aj = new jd(joVar, this, 108, 1);
        this.ak = new b();
        this.al = new jd(joVar, this, 114, 1);
        b bVar3 = new b();
        this.hF = bVar3;
        b.b(bVar3, new jd(joVar, this, 99, 1));
        this.am = m.b(new jd(joVar, this, 115, 1));
        this.hG = new jd(joVar, this, 117, 1);
        this.hH = new jd(joVar, this, 116, 1);
        this.an = m.b(new jd(joVar, this, 118, 1));
        this.ao = new jd(joVar, this, 119, 1);
        this.hI = new jd(joVar, this, 120, 1);
        this.hJ = c.c(new jd(joVar, this, 79, 1));
        this.hK = c.c(new jd(joVar, this, 78, 1));
        this.hL = c.c(new jd(joVar, this, 122, 1));
        this.hM = c.c(new jd(joVar, this, 121, 1));
        this.hN = c.c(new jd(joVar, this, 123, 1));
        this.hO = c.c(new jd(joVar, this, 124, 1));
        this.hP = c.c(new jd(joVar, this, 126, 1));
        this.hQ = c.c(new jd(joVar, this, 127, 1));
        this.hR = c.c(new jd(joVar, this, 128, 1));
        this.hS = c.c(new jd(joVar, this, 129, 1));
        this.hT = c.c(new jd(joVar, this, 131, 1));
        this.hU = c.c(new jd(joVar, this, 130, 1));
        this.hV = c.c(new jd(joVar, this, 135, 1));
        this.hW = c.c(new jd(joVar, this, 134, 1));
        this.ap = c.c(new jd(joVar, this, 133, 1));
        this.aq = m.b(new jd(joVar, this, 139, 1));
        jd jdVar = new jd(joVar, this, 138, 1);
        this.hX = jdVar;
        this.ar = m.b(jdVar);
        this.hY = c.c(new jd(joVar, this, 137, 1));
        this.as = new b();
        this.hZ = c.c(new jd(joVar, this, 142, 1));
        this.ia = c.c(new jd(joVar, this, 143, 1));
        this.at = new jd(joVar, this, 141, 1);
        this.au = m.b(new jd(joVar, this, 144, 1));
        this.ib = c.c(new jd(joVar, this, 140, 1));
        this.ic = new jd(joVar, this, 145, 1);
        this.id = m.b(new jd(joVar, this, 146, 1));
        this.av = new jd(joVar, this, 147, 1);
        this.ie = c.c(new jd(joVar, this, 150, 1));
        this.f3if = new jd(joVar, this, 153, 1);
        this.ig = new jd(joVar, this, 152, 1);
        this.ih = m.b(new jd(joVar, this, 155, 1));
        this.aw = c.c(new jd(joVar, this, 154, 1));
        jd jdVar2 = new jd(joVar, this, 151, 1);
        this.ax = jdVar2;
        this.ay = new jd(joVar, this, 156, 1);
        h c2 = c.c(new jd(joVar, this, 149, 1));
        this.az = c2;
        this.ii = new jd(joVar, this, 157, 1);
        this.aA = new jd(joVar, this, 158, 1);
        this.aB = m.b(new jd(joVar, this, 159, 1));
        this.aC = new jd(joVar, this, 161, 1);
        this.aD = new jd(joVar, this, 160, 1);
        this.aE = new jd(joVar, this, 162, 1);
        this.ij = new jd(joVar, this, 163, 1);
        this.ik = c.c(new jd(joVar, this, 164, 1));
        this.il = new jd(joVar, this, 166, 1);
        this.aF = new jd(joVar, this, 167, 1);
        this.aG = new jd(joVar, this, 165, 1);
        this.im = c.c(new jd(joVar, this, 169, 1));
        this.in = c.c(new jd(joVar, this, 170, 1));
        this.aH = new jd(joVar, this, 172, 1);
        this.io = c.c(new jd(joVar, this, 171, 1));
        this.ip = c.c(new jd(joVar, this, 173, 1));
        this.iq = m.b(new jd(joVar, this, 175, 1));
        this.ir = c.c(new jd(joVar, this, 174, 1));
        this.is = c.c(new jd(joVar, this, 177, 1));
        this.aI = new jd(joVar, this, 176, 1);
        this.aJ = c.c(new jd(joVar, this, 168, 1));
        this.it = new jd(joVar, this, 178, 1);
        this.iu = new jd(joVar, this, 179, 1);
        this.aK = c.c(new jd(joVar, this, 181, 1));
        this.aL = new jd(joVar, this, 180, 1);
        this.aM = c.c(new jd(joVar, this, 183, 1));
        this.aN = m.b(new jd(joVar, this, 184, 1));
        this.aO = new jd(joVar, this, 182, 1);
        this.iv = m.b(new jd(joVar, this, 188, 1));
        this.iw = m.b(new jd(joVar, this, 189, 1));
        this.ix = c.c(new jd(joVar, this, 190, 1));
        this.aP = c.c(new jd(joVar, this, 187, 1));
        this.aQ = c.c(new jd(joVar, this, 191, 1));
        this.aR = c.c(new jd(joVar, this, 192, 1));
        this.aS = c.c(new jd(joVar, this, 193, 1));
        this.aT = m.b(new jd(joVar, this, 194, 1));
        this.aU = new jd(joVar, this, 195, 1);
        this.aV = new jd(joVar, this, 196, 1);
        this.aW = c.c(new jd(joVar, this, 197, 1));
        this.iy = c.c(new jd(joVar, this, 202, 1));
        this.aX = c.c(new jd(joVar, this, 203, 1));
        this.aY = c.c(new jd(joVar, this, 204, 1));
        jd jdVar3 = new jd(joVar, this, 201, 1);
        this.iz = jdVar3;
        this.aZ = c.c(jdVar3);
        jd jdVar4 = new jd(joVar, this, 205, 1);
        this.iA = jdVar4;
        this.iB = m.b(jdVar4);
        this.iC = m.b(new jd(joVar, this, 200, 1));
        this.ba = new jd(joVar, this, 199, 1);
        this.bb = c.c(new jd(joVar, this, 208, 1));
        this.iD = c.c(new jd(joVar, this, 207, 1));
        this.bc = m.b(new jd(joVar, this, 210, 1));
        jd jdVar5 = new jd(joVar, this, 209, 1);
        this.iE = jdVar5;
        this.bd = m.b(jdVar5);
        this.be = new jd(joVar, this, 206, 1);
        this.iF = new jd(joVar, this, 198, 1);
        this.iG = m.b(new jd(joVar, this, 211, 1));
        this.bf = c.c(new jd(joVar, this, 212, 1));
        this.bg = c.c(new jd(joVar, this, 213, 1));
        this.bh = m.b(new jd(joVar, this, 215, 1));
        this.bi = m.b(new jd(joVar, this, 218, 1));
        this.bj = m.b(new jd(joVar, this, 217, 1));
        this.bk = m.b(new jd(joVar, this, 216, 1));
        this.iH = m.b(new jd(joVar, this, 214, 1));
        this.iI = m.b(new jd(joVar, this, 219, 1));
        this.bl = m.b(new jd(joVar, this, 222, 1));
        this.bm = new jd(joVar, this, 221, 1);
        this.iJ = new jd(joVar, this, 224, 1);
        this.bn = new jd(joVar, this, 223, 1);
        this.iK = m.b(new jd(joVar, this, 220, 1));
        this.bo = c.c(new jd(joVar, this, 225, 1));
        this.bp = c.c(new jd(joVar, this, 226, 1));
        yJ();
        yK();
        yL();
        yM();
        yN();
        yO();
        yP();
        yQ();
        yR();
        yS();
        yU();
        yV();
        yW();
        yX();
        yY();
        this.fE = c.c(new jd(joVar, this, 549, 1));
        this.fF = new jd(joVar, this, 550, 1);
        this.fG = new jd(joVar, this, 551, 1);
        this.fH = new jd(joVar, this, 552, 1);
        this.fI = new jd(joVar, this, 553, 1);
        this.fJ = new jd(joVar, this, 554, 1);
        this.fK = new jd(joVar, this, 555, 1);
        this.fL = new jd(joVar, this, 556, 1);
        this.fM = new jd(joVar, this, 557, 1);
        this.fN = new jd(joVar, this, 558, 1);
        this.fO = new jd(joVar, this, 559, 1);
        this.fP = new jd(joVar, this, 560, 1);
        this.fQ = new jd(joVar, this, 561, 1);
        this.fR = new jd(joVar, this, 562, 1);
        this.fS = new jd(joVar, this, 563, 1);
        this.fT = new jd(joVar, this, 564, 1);
        this.fU = new jd(joVar, this, 565, 1);
        this.fV = new jd(joVar, this, 566, 1);
        this.fW = new jd(joVar, this, 567, 1);
        this.fX = new jd(joVar, this, 568, 1);
        this.fY = new jd(joVar, this, 569, 1);
        this.fZ = new jd(joVar, this, 570, 1);
        this.ga = new jd(joVar, this, 571, 1);
        this.gb = new jd(joVar, this, 572, 1);
        this.gc = new jd(joVar, this, 573, 1);
        this.gd = new jd(joVar, this, 574, 1);
        this.ge = new jd(joVar, this, 575, 1);
        this.gf = new jd(joVar, this, 576, 1);
        this.gg = new jd(joVar, this, 577, 1);
        jd jdVar6 = new jd(joVar, this, 578, 1);
        this.ly = jdVar6;
        this.gh = v.d(jdVar6);
        this.gi = new jd(joVar, this, 579, 1);
        this.gj = new jd(joVar, this, 580, 1);
        jd jdVar7 = new jd(joVar, this, 581, 1);
        this.lz = jdVar7;
        this.gk = v.d(jdVar7);
        h c3 = c.c(new jd(joVar, this, 582, 1));
        this.gl = c3;
        jd jdVar8 = new jd(joVar, this, 583, 1);
        this.lA = jdVar8;
        this.gm = v.d(jdVar8);
        this.gn = v.d(c2);
        this.go = v.d(jdVar2);
        jd jdVar9 = new jd(joVar, this, 584, 1);
        this.lB = jdVar9;
        this.gp = v.d(jdVar9);
        this.gq = new jd(joVar, this, 585, 1);
        this.gr = v.d(this.eh);
        jd jdVar10 = new jd(joVar, this, 586, 1);
        this.lC = jdVar10;
        this.gs = v.d(jdVar10);
        this.gt = v.d(this.dG);
        this.gu = v.d(bVar);
        this.gv = v.d(c);
        this.gw = v.d(c3);
        this.gx = v.d(this.cS);
        this.gy = v.d(jdVar2);
        jd jdVar11 = new jd(joVar, this, 587, 1);
        this.lD = jdVar11;
        this.gz = v.d(jdVar11);
        jd jdVar12 = new jd(joVar, this, 588, 1);
        this.lE = jdVar12;
        this.gA = v.d(jdVar12);
        this.gB = v.d(this.fd);
        this.gC = new jd(joVar, this, 589, 1);
        this.gD = v.d(this.ed);
        this.f308a = new jj(joVar, this);
        this.b = new iz(joVar, this);
        this.c = new je(joVar, this);
        this.d = new ji(joVar, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.apps.tiktok.q.b.h xu() {
        Optional empty = Optional.empty();
        final g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "AssistantOnLockscreenSettings";
        a2.c(f.f1888a);
        empty.ifPresent(new Consumer(a2) { // from class: com.google.android.apps.search.assistant.platform.g.j.a

            /* renamed from: a, reason: collision with root package name */
            public final g f1887a;

            {
                this.f1887a = a2;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f1887a.b().h((x) obj);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Set xw() {
        return new op(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Set xx() {
        return new op(new com.google.android.apps.gsa.shared.logger.a());
    }

    private final void yI() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.g = new jd(joVar, ikVar, 1, 1);
        this.gG = c.c(new jd(joVar, ikVar, 0, 1));
        this.h = c.c(new jd(this.f, this.gF, 3, 1));
        this.i = c.c(new jd(this.f, this.gF, 7, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.j = new jd(joVar2, ikVar2, 11, 1);
        this.gH = m.b(new jd(joVar2, ikVar2, 10, 1));
        this.k = c.c(new jd(this.f, this.gF, 9, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.l = new jd(joVar3, ikVar3, 8, 1);
        this.m = new jd(joVar3, ikVar3, 14, 1);
        this.gI = c.c(new jd(joVar3, ikVar3, 13, 1));
        this.n = c.c(new jd(this.f, this.gF, 16, 1));
        this.gJ = c.c(new jd(this.f, this.gF, 19, 1));
        this.o = c.c(new jd(this.f, this.gF, 18, 1));
        this.gK = c.c(new jd(this.f, this.gF, 26, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.p = new jd(joVar4, ikVar4, 25, 1);
        this.q = m.b(new jd(joVar4, ikVar4, 24, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.r = new jd(joVar5, ikVar5, 29, 1);
        this.gL = new jd(joVar5, ikVar5, 28, 1);
        this.s = c.c(new jd(joVar5, ikVar5, 33, 1));
        jo joVar6 = this.f;
        ik ikVar6 = this.gF;
        this.t = new jd(joVar6, ikVar6, 32, 1);
        this.gM = c.c(new jd(joVar6, ikVar6, 35, 1));
        this.u = c.c(new jd(this.f, this.gF, 34, 1));
        this.gN = c.c(new jd(this.f, this.gF, 31, 1));
        this.v = new jd(this.f, this.gF, 30, 1);
        this.gO = new b();
    }

    private final void yJ() {
        this.bq = m.b(new jd(this.f, this.gF, 229, 1));
        jd jdVar = new jd(this.f, this.gF, 228, 1);
        this.iL = jdVar;
        this.br = m.b(jdVar);
        jd jdVar2 = new jd(this.f, this.gF, 227, 1);
        this.iM = jdVar2;
        this.bs = m.b(jdVar2);
        this.bt = c.c(new jd(this.f, this.gF, 231, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.bu = new jd(joVar, ikVar, 230, 1);
        this.bv = new jd(joVar, ikVar, 235, 1);
        this.bw = m.b(new jd(joVar, ikVar, 236, 1));
        this.bx = c.c(new jd(this.f, this.gF, 234, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.iN = new jd(joVar2, ikVar2, 238, 1);
        this.iO = new jd(joVar2, ikVar2, 239, 1);
        this.by = new jd(joVar2, ikVar2, 237, 1);
        this.iP = m.b(new jd(joVar2, ikVar2, 240, 1));
        this.iQ = c.c(new jd(this.f, this.gF, 241, 1));
        this.bz = c.c(new jd(this.f, this.gF, 242, 1));
        this.bA = new b();
        this.bB = new b();
        this.bC = c.c(new jd(this.f, this.gF, 244, 1));
        this.iR = c.c(new jd(this.f, this.gF, 246, 1));
        this.iS = c.c(new jd(this.f, this.gF, 247, 1));
        this.iT = c.c(new jd(this.f, this.gF, 245, 1));
        this.bD = c.c(new jd(this.f, this.gF, 248, 1));
        this.bE = c.c(new jd(this.f, this.gF, 243, 1));
        this.bF = c.c(new jd(this.f, this.gF, 249, 1));
    }

    private final void yK() {
        this.bG = m.b(new jd(this.f, this.gF, 250, 1));
        this.bH = c.c(new jd(this.f, this.gF, 233, 1));
        this.bI = c.c(new jd(this.f, this.gF, 232, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.bJ = new jd(joVar, ikVar, 251, 1);
        this.bK = m.b(new jd(joVar, ikVar, 255, 1));
        this.iU = m.b(new jd(this.f, this.gF, 254, 1));
        this.iV = m.b(new jd(this.f, this.gF, 256, 1));
        this.bL = m.b(new jd(this.f, this.gF, 261, 1));
        this.bM = m.b(new jd(this.f, this.gF, 260, 1));
        this.bN = m.b(new jd(this.f, this.gF, 259, 1));
        this.bO = m.b(new jd(this.f, this.gF, 258, 1));
        this.iW = m.b(new jd(this.f, this.gF, 257, 1));
        this.bP = m.b(new jd(this.f, this.gF, 253, 1));
        this.bQ = m.b(new jd(this.f, this.gF, 263, 1));
        this.bR = m.b(new jd(this.f, this.gF, 264, 1));
        this.bS = m.b(new jd(this.f, this.gF, 262, 1));
        this.bT = m.b(new jd(this.f, this.gF, 252, 1));
        this.bU = c.c(new jd(this.f, this.gF, 265, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.bV = new jd(joVar2, ikVar2, 268, 1);
        this.bW = new jd(joVar2, ikVar2, 269, 1);
        this.bX = m.b(new jd(joVar2, ikVar2, 270, 1));
        this.bY = c.c(new jd(this.f, this.gF, 267, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.bZ = new jd(joVar3, ikVar3, 266, 1);
        this.iX = c.c(new jd(joVar3, ikVar3, 271, 1));
        this.ca = new jd(this.f, this.gF, 273, 1);
    }

    private final void yL() {
        this.iY = c.c(new jd(this.f, this.gF, 272, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.cb = new jd(joVar, ikVar, 274, 1);
        this.cc = c.c(new jd(joVar, ikVar, 275, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.cd = new jd(joVar2, ikVar2, 278, 1);
        this.ce = new jd(joVar2, ikVar2, 279, 1);
        this.cf = new jd(joVar2, ikVar2, 280, 1);
        this.cg = m.b(new jd(joVar2, ikVar2, 281, 1));
        this.ch = m.b(new jd(this.f, this.gF, 277, 1));
        this.ci = c.c(new jd(this.f, this.gF, 282, 1));
        this.iZ = m.b(new jd(this.f, this.gF, 276, 1));
        b.b(this.bA, new jd(this.f, this.gF, 186, 1));
        this.cj = c.c(new jd(this.f, this.gF, 284, 1));
        this.ja = c.c(new jd(this.f, this.gF, 283, 1));
        this.jb = c.c(new jd(this.f, this.gF, 285, 1));
        b.b(this.bB, c.c(new jd(this.f, this.gF, 185, 1)));
        this.jc = m.b(new jd(this.f, this.gF, 286, 1));
        this.ck = m.b(new jd(this.f, this.gF, 287, 1));
        this.jd = m.b(new jd(this.f, this.gF, 288, 1));
        this.je = m.b(new jd(this.f, this.gF, 289, 1));
        this.jf = m.b(new jd(this.f, this.gF, 290, 1));
        this.jg = m.b(new jd(this.f, this.gF, 291, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.jh = new jd(joVar3, ikVar3, 292, 1);
        this.cl = new jd(joVar3, ikVar3, 148, 1);
        this.cm = new b();
        this.ji = new jd(joVar3, ikVar3, 136, 1);
    }

    private final void yM() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.jj = new jd(joVar, ikVar, 293, 1);
        this.jk = c.c(new jd(joVar, ikVar, 294, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.jl = new jd(joVar2, ikVar2, 295, 1);
        this.cn = c.c(new jd(joVar2, ikVar2, 298, 1));
        this.co = c.c(new jd(this.f, this.gF, 297, 1));
        this.jm = c.c(new jd(this.f, this.gF, 296, 1));
        this.jn = c.c(new jd(this.f, this.gF, 299, 1));
        this.jo = c.c(new jd(this.f, this.gF, 300, 1));
        this.cp = m.b(new jd(this.f, this.gF, 301, 1));
        this.cq = c.c(new jd(this.f, this.gF, 302, 1));
        this.cr = c.c(new jd(this.f, this.gF, 303, 1));
        this.jp = c.c(new jd(this.f, this.gF, 304, 1));
        this.cs = c.c(new jd(this.f, this.gF, 305, 1));
        b.b(this.cm, c.c(new jd(this.f, this.gF, 132, 1)));
        this.jq = c.c(new jd(this.f, this.gF, 306, 1));
        this.jr = m.b(new jd(this.f, this.gF, 307, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.js = new jd(joVar3, ikVar3, 125, 1);
        this.ct = c.c(new jd(joVar3, ikVar3, 17, 1));
        this.cu = c.c(new jd(this.f, this.gF, 309, 1));
        this.cv = c.c(new jd(this.f, this.gF, 308, 1));
        jd jdVar = new jd(this.f, this.gF, 310, 1);
        this.jt = jdVar;
        this.cw = m.b(jdVar);
        this.cx = c.c(new jd(this.f, this.gF, 311, 1));
        this.cy = m.b(new jd(this.f, this.gF, 312, 1));
        this.cz = m.b(new jd(this.f, this.gF, 314, 1));
    }

    private final void yN() {
        this.ju = m.b(new jd(this.f, this.gF, 318, 1));
        this.cA = m.b(new jd(this.f, this.gF, 317, 1));
        this.cB = c.c(new jd(this.f, this.gF, 319, 1));
        this.cC = m.b(new jd(this.f, this.gF, 316, 1));
        this.jv = c.c(new jd(this.f, this.gF, 322, 1));
        this.jw = c.c(new jd(this.f, this.gF, 323, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.cD = new jd(joVar, ikVar, 324, 1);
        this.cE = new jd(joVar, ikVar, 325, 1);
        this.cF = c.c(new jd(joVar, ikVar, 321, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.cG = new jd(joVar2, ikVar2, 320, 1);
        this.cH = m.b(new jd(joVar2, ikVar2, 315, 1));
        this.jx = m.b(new jd(this.f, this.gF, 326, 1));
        this.cI = c.c(new jd(this.f, this.gF, 328, 1));
        this.jy = m.b(new jd(this.f, this.gF, 330, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.jz = new jd(joVar3, ikVar3, 329, 1);
        this.jA = new jd(joVar3, ikVar3, 331, 1);
        this.jB = new jd(joVar3, ikVar3, 332, 1);
        this.jC = m.b(new jd(joVar3, ikVar3, 333, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.jD = new jd(joVar4, ikVar4, 334, 1);
        this.jE = new jd(joVar4, ikVar4, 335, 1);
        this.jF = c.c(new jd(joVar4, ikVar4, 339, 1));
        this.cJ = m.b(new jd(this.f, this.gF, 338, 1));
        this.jG = m.b(new jd(this.f, this.gF, 337, 1));
        this.jH = m.b(new jd(this.f, this.gF, 340, 1));
        this.jI = new jd(this.f, this.gF, 336, 1);
    }

    private final void yO() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.cK = new jd(joVar, ikVar, 327, 1);
        this.cL = m.b(new jd(joVar, ikVar, 341, 1));
        this.cM = m.b(new jd(this.f, this.gF, 342, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.cN = new jd(joVar2, ikVar2, 343, 1);
        this.cO = m.b(new jd(joVar2, ikVar2, 346, 1));
        this.jJ = c.c(new jd(this.f, this.gF, 345, 1));
        this.cP = c.c(new jd(this.f, this.gF, 344, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.cQ = new jd(joVar3, ikVar3, 347, 1);
        this.cR = c.c(new jd(joVar3, ikVar3, 348, 1));
        jd jdVar = new jd(this.f, this.gF, 353, 1);
        this.jK = jdVar;
        this.jL = m.b(jdVar);
        this.cS = m.b(new jd(this.f, this.gF, 352, 1));
        this.jM = m.b(new jd(this.f, this.gF, 354, 1));
        this.jN = m.b(new jd(this.f, this.gF, 355, 1));
        this.jO = m.b(new jd(this.f, this.gF, 356, 1));
        this.cT = m.b(new jd(this.f, this.gF, 351, 1));
        this.jP = m.b(new jd(this.f, this.gF, 350, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.cU = new jd(joVar4, ikVar4, 349, 1);
        this.cV = c.c(new jd(joVar4, ikVar4, 313, 1));
        this.cW = c.c(new jd(this.f, this.gF, 357, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.jQ = new jd(joVar5, ikVar5, 15, 1);
        b.b(this.Z, new jd(joVar5, ikVar5, 12, 1));
        b.b(this.as, c.c(new jd(this.f, this.gF, 6, 1)));
        this.jR = c.c(new jd(this.f, this.gF, 359, 1));
        this.cX = m.b(new jd(this.f, this.gF, 358, 1));
    }

    private final void yP() {
        b.b(this.gO, m.b(new jd(this.f, this.gF, 5, 1)));
        this.jS = m.b(new jd(this.f, this.gF, 360, 1));
        b.b(this.P, new jd(this.f, this.gF, 4, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.jT = new jd(joVar, ikVar, 361, 1);
        b.b(this.ak, new jd(joVar, ikVar, 2, 1));
        this.jU = c.c(new jd(this.f, this.gF, 362, 1));
        jd jdVar = new jd(this.f, this.gF, 363, 1);
        this.jV = jdVar;
        this.jW = c.c(jdVar);
        this.cY = c.c(new jd(this.f, this.gF, 364, 1));
        this.jX = m.b(new jd(this.f, this.gF, 365, 1));
        this.jY = m.b(new jd(this.f, this.gF, 366, 1));
        this.cZ = c.c(new jd(this.f, this.gF, 368, 1));
        this.da = c.c(new jd(this.f, this.gF, 367, 1));
        this.jZ = m.b(new jd(this.f, this.gF, 370, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.ka = new jd(joVar2, ikVar2, 369, 1);
        this.kb = new jd(joVar2, ikVar2, 375, 1);
        this.kc = new jd(joVar2, ikVar2, 376, 1);
        this.kd = m.b(new jd(joVar2, ikVar2, 374, 1));
        this.db = m.b(new jd(this.f, this.gF, 373, 1));
        this.dc = m.b(new jd(this.f, this.gF, 372, 1));
        this.ke = c.c(new jd(this.f, this.gF, 379, 1));
        this.kf = m.b(new jd(this.f, this.gF, 378, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.dd = new jd(joVar3, ikVar3, 377, 1);
        this.kg = new jd(joVar3, ikVar3, 371, 1);
        this.kh = c.c(new jd(joVar3, ikVar3, 380, 1));
    }

    private final void yQ() {
        this.ki = c.c(new jd(this.f, this.gF, 381, 1));
        this.kj = c.c(new jd(this.f, this.gF, 383, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.de = new jd(joVar, ikVar, 382, 1);
        this.df = m.b(new jd(joVar, ikVar, 384, 1));
        this.kk = c.c(new jd(this.f, this.gF, 386, 1));
        this.dg = c.c(new jd(this.f, this.gF, 385, 1));
        this.kl = c.c(new jd(this.f, this.gF, 387, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.dh = new jd(joVar2, ikVar2, 388, 1);
        this.di = c.c(new jd(joVar2, ikVar2, 389, 1));
        this.dj = c.c(new jd(this.f, this.gF, 390, 1));
        this.dk = c.c(new jd(this.f, this.gF, 391, 1));
        this.dl = c.c(new jd(this.f, this.gF, 392, 1));
        this.km = c.c(new jd(this.f, this.gF, 395, 1));
        this.kn = c.c(new jd(this.f, this.gF, 394, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.ko = new jd(joVar3, ikVar3, 393, 1);
        this.dm = c.c(new jd(joVar3, ikVar3, 396, 1));
        this.dn = new b();
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.kp = new jd(joVar4, ikVar4, 399, 1);
        this.f2do = new jd(joVar4, ikVar4, 402, 1);
        this.dp = new jd(joVar4, ikVar4, 401, 1);
        this.kq = m.b(new jd(joVar4, ikVar4, 400, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.dq = new jd(joVar5, ikVar5, 406, 1);
        this.dr = new jd(joVar5, ikVar5, 407, 1);
        this.ds = new jd(joVar5, ikVar5, 405, 1);
        this.kr = new jd(joVar5, ikVar5, 404, 1);
    }

    private final void yR() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.ks = new jd(joVar, ikVar, 408, 1);
        this.kt = c.c(new jd(joVar, ikVar, 403, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.dt = new jd(joVar2, ikVar2, 409, 1);
        this.du = new jd(joVar2, ikVar2, 411, 1);
        this.dv = new jd(joVar2, ikVar2, 410, 1);
        this.ku = m.b(new jd(joVar2, ikVar2, 412, 1));
        this.dw = new b();
        b.b(this.dn, c.c(new jd(this.f, this.gF, 398, 1)));
        b.b(this.dw, c.c(new jd(this.f, this.gF, 397, 1)));
        this.dx = m.b(new jd(this.f, this.gF, 413, 1));
        this.dy = c.c(new jd(this.f, this.gF, 415, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.kv = new jd(joVar3, ikVar3, 414, 1);
        this.dz = new jd(joVar3, ikVar3, 416, 1);
        this.dA = new jd(joVar3, ikVar3, 417, 1);
        this.kw = c.c(new jd(joVar3, ikVar3, 418, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.dB = new jd(joVar4, ikVar4, 419, 1);
        this.dC = c.c(new jd(joVar4, ikVar4, 420, 1));
        this.kx = m.b(new jd(this.f, this.gF, 421, 1));
        this.ky = m.b(new jd(this.f, this.gF, 423, 1));
        this.kz = c.c(new jd(this.f, this.gF, 422, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.dD = new jd(joVar5, ikVar5, 424, 1);
        this.dE = new jd(joVar5, ikVar5, 425, 1);
        this.kA = new jd(joVar5, ikVar5, 426, 1);
        this.kB = new jd(joVar5, ikVar5, 427, 1);
        this.dF = c.c(new jd(joVar5, ikVar5, 429, 1));
    }

    private final void yS() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.dG = new jd(joVar, ikVar, 428, 1);
        this.kC = new jd(joVar, ikVar, 430, 1);
        this.kD = new jd(joVar, ikVar, 431, 1);
        this.dH = new jd(joVar, ikVar, 432, 1);
        this.kE = new jd(joVar, ikVar, 434, 1);
        this.dI = new jd(joVar, ikVar, 433, 1);
        this.kF = nx.b;
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.dJ = new jd(joVar2, ikVar2, 438, 1);
        this.dK = c.c(new jd(joVar2, ikVar2, 437, 1));
        this.dL = c.c(new jd(this.f, this.gF, 436, 1));
        this.dM = c.c(new jd(this.f, this.gF, 435, 1));
        this.kG = nx.b;
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.dN = new jd(joVar3, ikVar3, 439, 1);
        this.dO = c.c(new jd(joVar3, ikVar3, 442, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.dP = new jd(joVar4, ikVar4, 443, 1);
        this.dQ = new jd(joVar4, ikVar4, 444, 1);
        this.dR = new jd(joVar4, ikVar4, 445, 1);
        this.dS = c.c(new jd(joVar4, ikVar4, 446, 1));
        this.dT = c.c(new jd(this.f, this.gF, 441, 1));
        jd jdVar = new jd(this.f, this.gF, 440, 1);
        this.kH = jdVar;
        this.dU = c.c(jdVar);
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.dV = new jd(joVar5, ikVar5, 448, 1);
        this.dW = new jd(joVar5, ikVar5, 449, 1);
        this.dX = new jd(joVar5, ikVar5, 450, 1);
        this.dY = new jd(joVar5, ikVar5, 451, 1);
    }

    private final void yT() {
        this.gP = c.c(new jd(this.f, this.gF, 38, 1));
        this.w = c.c(new jd(this.f, this.gF, 39, 1));
        this.gQ = c.c(new jd(this.f, this.gF, 37, 1));
        this.gR = c.c(new jd(this.f, this.gF, 41, 1));
        this.x = c.c(new jd(this.f, this.gF, 40, 1));
        this.y = c.c(new jd(this.f, this.gF, 43, 1));
        this.gS = c.c(new jd(this.f, this.gF, 44, 1));
        this.gT = c.c(new jd(this.f, this.gF, 45, 1));
        this.gU = c.c(new jd(this.f, this.gF, 46, 1));
        this.gV = c.c(new jd(this.f, this.gF, 47, 1));
        this.gW = c.c(new jd(this.f, this.gF, 48, 1));
        this.gX = m.b(new jd(this.f, this.gF, 49, 1));
        this.gY = m.b(new jd(this.f, this.gF, 51, 1));
        this.gZ = c.c(new jd(this.f, this.gF, 50, 1));
        this.z = c.c(new jd(this.f, this.gF, 42, 1));
        this.ha = c.c(new jd(this.f, this.gF, 53, 1));
        this.A = c.c(new jd(this.f, this.gF, 52, 1));
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.B = new jd(joVar, ikVar, 36, 1);
        this.C = c.c(new jd(joVar, ikVar, 54, 1));
        this.D = m.b(new jd(this.f, this.gF, 57, 1));
        this.E = m.b(new jd(this.f, this.gF, 56, 1));
        this.hb = m.b(new jd(this.f, this.gF, 55, 1));
        this.hc = c.c(new jd(this.f, this.gF, 58, 1));
        this.hd = c.c(new jd(this.f, this.gF, 63, 1));
        this.F = c.c(new jd(this.f, this.gF, 62, 1));
    }

    private final void yU() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.dZ = new jd(joVar, ikVar, 452, 1);
        this.ea = c.c(new jd(joVar, ikVar, 447, 1));
        this.eb = nx.b;
        this.ec = c.c(new jd(this.f, this.gF, 454, 1));
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.ed = new jd(joVar2, ikVar2, 455, 1);
        this.ee = new jd(joVar2, ikVar2, 456, 1);
        this.ef = new jd(joVar2, ikVar2, 457, 1);
        this.eg = c.c(new jd(joVar2, ikVar2, 458, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.eh = new jd(joVar3, ikVar3, 453, 1);
        this.ei = new jd(joVar3, ikVar3, 460, 1);
        this.ej = new jd(joVar3, ikVar3, 459, 1);
        this.ek = new jd(joVar3, ikVar3, 461, 1);
        this.el = new jd(joVar3, ikVar3, 462, 1);
        this.kI = c.c(new jd(joVar3, ikVar3, 463, 1));
        this.em = m.b(new jd(this.f, this.gF, 464, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.kJ = new jd(joVar4, ikVar4, 465, 1);
        this.kK = new jd(joVar4, ikVar4, 466, 1);
        this.en = new jd(joVar4, ikVar4, 468, 1);
        this.kL = c.c(new jd(joVar4, ikVar4, 467, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.eo = new jd(joVar5, ikVar5, 469, 1);
        this.ep = c.c(new jd(joVar5, ikVar5, 471, 1));
        this.eq = c.c(new jd(this.f, this.gF, 470, 1));
        this.kM = c.c(new jd(this.f, this.gF, 472, 1));
        jo joVar6 = this.f;
        ik ikVar6 = this.gF;
        this.er = new jd(joVar6, ikVar6, 473, 1);
        this.kN = c.c(new jd(joVar6, ikVar6, 474, 1));
    }

    private final void yV() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.es = new jd(joVar, ikVar, 475, 1);
        jd jdVar = new jd(joVar, ikVar, 477, 1);
        this.kO = jdVar;
        this.et = c.c(jdVar);
        jd jdVar2 = new jd(this.f, this.gF, 478, 1);
        this.kP = jdVar2;
        this.eu = c.c(jdVar2);
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.ev = new jd(joVar2, ikVar2, 480, 1);
        jd jdVar3 = new jd(joVar2, ikVar2, 479, 1);
        this.kQ = jdVar3;
        this.ew = c.c(jdVar3);
        jd jdVar4 = new jd(this.f, this.gF, 476, 1);
        this.kR = jdVar4;
        this.ex = c.c(jdVar4);
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.ey = new jd(joVar3, ikVar3, 482, 1);
        this.ez = new jd(joVar3, ikVar3, 483, 1);
        this.eA = new jd(joVar3, ikVar3, 484, 1);
        this.eB = new jd(joVar3, ikVar3, 481, 1);
        this.eC = new jd(joVar3, ikVar3, 485, 1);
        this.eD = new jd(joVar3, ikVar3, 486, 1);
        this.eE = new jd(joVar3, ikVar3, 487, 1);
        this.eF = new jd(joVar3, ikVar3, 488, 1);
        this.eG = new jd(joVar3, ikVar3, 489, 1);
        this.eH = m.b(new jd(joVar3, ikVar3, 490, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.kS = new jd(joVar4, ikVar4, 491, 1);
        this.kT = new jd(joVar4, ikVar4, 492, 1);
        this.kU = new jd(joVar4, ikVar4, 493, 1);
        this.kV = new jd(joVar4, ikVar4, 494, 1);
        this.eI = new jd(joVar4, ikVar4, 495, 1);
    }

    private final void yW() {
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.kW = new jd(joVar, ikVar, 496, 1);
        this.eJ = new jd(joVar, ikVar, 497, 1);
        this.kX = new jd(joVar, ikVar, 498, 1);
        this.eK = new jd(joVar, ikVar, 499, 1);
        this.eL = new jd(joVar, ikVar, 500, 1);
        this.kY = new jd(joVar, ikVar, 501, 1);
        this.kZ = new jd(joVar, ikVar, 502, 1);
        jd jdVar = new jd(joVar, ikVar, 503, 1);
        this.la = jdVar;
        this.eM = v.d(jdVar);
        jd jdVar2 = new jd(this.f, this.gF, 504, 1);
        this.lb = jdVar2;
        this.eN = v.d(jdVar2);
        this.eO = v.d(this.u);
        this.eP = c.c(new jd(this.f, this.gF, 505, 1));
        this.eQ = v.d(this.aI);
        this.eR = new jd(this.f, this.gF, 506, 1);
        this.eS = v.d(this.g);
        jd jdVar3 = new jd(this.f, this.gF, 507, 1);
        this.lc = jdVar3;
        this.eT = v.d(jdVar3);
        this.eU = v.d(this.aG);
        h hVar = nx.b;
        this.ld = hVar;
        this.eV = v.d(hVar);
        jd jdVar4 = new jd(this.f, this.gF, 508, 1);
        this.le = jdVar4;
        this.eW = v.d(jdVar4);
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.eX = new jd(joVar2, ikVar2, 509, 1);
        this.lf = new jd(joVar2, ikVar2, 510, 1);
    }

    private final void yX() {
        this.eY = v.d(this.lf);
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.eZ = new jd(joVar, ikVar, 511, 1);
        this.fa = new jd(joVar, ikVar, 512, 1);
        this.fb = new jd(joVar, ikVar, 513, 1);
        this.fc = new jd(joVar, ikVar, 514, 1);
        this.fd = new jd(joVar, ikVar, 515, 1);
        this.fe = new jd(joVar, ikVar, 517, 1);
        jd jdVar = new jd(joVar, ikVar, 516, 1);
        this.lg = jdVar;
        this.ff = v.d(jdVar);
        jd jdVar2 = new jd(this.f, this.gF, 518, 1);
        this.lh = jdVar2;
        this.fg = v.d(jdVar2);
        this.fh = c.c(new jd(this.f, this.gF, 520, 1));
        h c = c.c(new jd(this.f, this.gF, 519, 1));
        this.fi = c;
        this.fj = v.d(c);
        this.fk = v.d(this.dH);
        jd jdVar3 = new jd(this.f, this.gF, 521, 1);
        this.li = jdVar3;
        this.fl = v.d(jdVar3);
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.fm = new jd(joVar2, ikVar2, 522, 1);
        this.fn = new jd(joVar2, ikVar2, 523, 1);
        this.fo = new jd(joVar2, ikVar2, 524, 1);
        this.fp = new jd(joVar2, ikVar2, 525, 1);
        this.fq = v.d(this.aA);
        jd jdVar4 = new jd(this.f, this.gF, 526, 1);
        this.lj = jdVar4;
        this.fr = v.d(jdVar4);
        this.fs = v.d(this.ea);
    }

    private final void yY() {
        jd jdVar = new jd(this.f, this.gF, 527, 1);
        this.lk = jdVar;
        this.ft = v.d(jdVar);
        this.fu = v.d(this.el);
        jo joVar = this.f;
        ik ikVar = this.gF;
        this.fv = new jd(joVar, ikVar, 529, 1);
        jd jdVar2 = new jd(joVar, ikVar, 528, 1);
        this.ll = jdVar2;
        this.fw = v.d(jdVar2);
        jo joVar2 = this.f;
        ik ikVar2 = this.gF;
        this.fx = new jd(joVar2, ikVar2, 530, 1);
        this.fy = c.c(new jd(joVar2, ikVar2, 531, 1));
        jo joVar3 = this.f;
        ik ikVar3 = this.gF;
        this.lm = new jd(joVar3, ikVar3, 533, 1);
        this.fz = new jd(joVar3, ikVar3, 534, 1);
        this.fA = c.c(new jd(joVar3, ikVar3, 537, 1));
        jo joVar4 = this.f;
        ik ikVar4 = this.gF;
        this.ln = new jd(joVar4, ikVar4, 538, 1);
        this.lo = new jd(joVar4, ikVar4, 539, 1);
        this.lp = new jd(joVar4, ikVar4, 540, 1);
        this.lq = new jd(joVar4, ikVar4, 541, 1);
        this.lr = new jd(joVar4, ikVar4, 542, 1);
        this.ls = new jd(joVar4, ikVar4, 543, 1);
        this.lt = new jd(joVar4, ikVar4, 544, 1);
        this.lu = new jd(joVar4, ikVar4, 545, 1);
        this.lv = new jd(joVar4, ikVar4, 536, 1);
        this.lw = c.c(new jd(joVar4, ikVar4, 535, 1));
        this.lx = c.c(new jd(this.f, this.gF, 546, 1));
        jo joVar5 = this.f;
        ik ikVar5 = this.gF;
        this.fB = new jd(joVar5, ikVar5, 532, 1);
        this.fC = new jd(joVar5, ikVar5, 547, 1);
        this.fD = new jd(joVar5, ikVar5, 548, 1);
    }

    @Override // com.google.android.apps.search.assistant.surfaces.dictation.service.eligibility.crossprofile.c
    public final k A() {
        return this.gF.f308a.A();
    }

    @Override // com.google.android.apps.search.assistant.libraries.dictation.b.a.h.a
    public final e B() {
        jj jjVar = this.gF.f308a;
        return new e((cg) jjVar.bo.a(), new op(new y((com.google.android.apps.search.assistant.platform.g.c.g) jjVar.b.ah.a(), (com.google.android.apps.search.assistant.platform.g.c.c.e) jjVar.b.cx.a(), (ag) jjVar.f316a.Q.a())), (ag) jjVar.f316a.Q.a());
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.b.a.b.a
    public final com.google.android.apps.search.assistant.libraries.b.b.f C() {
        jj jjVar = this.gF.f308a;
        Executor executor = (Executor) jjVar.f316a.v.a();
        jr jrVar = jjVar.f316a.b;
        com.google.android.apps.search.assistant.libraries.b.b.a aVar = new com.google.android.apps.search.assistant.libraries.b.b.a(((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369011").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369012").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369013").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369014").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45417019").f());
        com.google.android.libraries.geller.d.e eVar = new com.google.android.libraries.geller.d.e(aVar, (com.google.android.libraries.g.a) jrVar.f322a.g.a());
        com.google.android.apps.search.assistant.libraries.a.c cVar = (com.google.android.apps.search.assistant.libraries.a.c) jjVar.f316a.oJ.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) jjVar.f316a.bN.a();
        AccountId accountId = (AccountId) jjVar.b.g.a();
        p pVar = (p) jjVar.b.P.a();
        com.google.protos.o.b.v vVar = com.google.protos.o.b.v.ap;
        j jVar = new j();
        jo joVar = jjVar.f316a;
        fu o = fu.o(vVar, jVar, com.google.protos.o.b.v.cE, new i(jjVar.eC(), (Executor) joVar.v.a()), com.google.protos.o.b.v.bH, new com.google.android.apps.search.assistant.verticals.b.c((p) jjVar.b.P.a(), (com.google.android.apps.search.assistant.platform.g.g.b.c) jjVar.b.aj.a(), (Executor) jjVar.f316a.v.a()));
        jo joVar2 = jjVar.f316a;
        return new com.google.android.apps.search.assistant.libraries.b.b.f(executor, eVar, cVar, dVar, bVar, accountId, pVar, o, joVar2.adP(), ((com.google.apps.tiktok.experiments.e) joVar2.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369586").f());
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.b.a.h.a
    public final com.google.android.apps.search.assistant.libraries.b.b.b.y D() {
        jj jjVar = this.gF.f308a;
        AccountId accountId = (AccountId) jjVar.b.g.a();
        p pVar = (p) jjVar.b.P.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a();
        jr jrVar = jjVar.f316a.b;
        jo joVar = jrVar.f322a;
        com.google.protos.o.b.v vVar = com.google.protos.o.b.v.cH;
        com.google.android.apps.search.assistant.libraries.b.b.b.b bVar = new com.google.android.apps.search.assistant.libraries.b.b.b.b((com.google.apps.tiktok.media.j) joVar.ne.a(), (Executor) jrVar.f322a.H.a());
        jo joVar2 = jrVar.f322a;
        com.google.android.libraries.appintegration.jam.a.c.b.a af = jrVar.af();
        com.google.android.libraries.appintegration.jam.a.b.b.a ae = jrVar.ae();
        Executor executor = (Executor) joVar2.H.a();
        return new com.google.android.apps.search.assistant.libraries.b.b.b.y(accountId, pVar, dVar, fu.m(vVar, new u(bVar, new r(af, ae, executor, jrVar.ah()), new r(jrVar.af(), jrVar.ae(), (Executor) jrVar.f322a.H.a(), jrVar.ah()), (Executor) jrVar.f322a.H.a(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45427897").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416758").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45424789").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45424790").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416759").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416760").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416761").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416762").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416763").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416764").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45417717").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45419395").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45421725").b(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45424268").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45426639").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45423823").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45426803").f(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45460620").f())), (Executor) jjVar.f316a.v.a(), (Executor) jjVar.f316a.H.a());
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.g.b
    public final com.google.android.apps.search.assistant.libraries.b.f.a E() {
        return new com.google.android.apps.search.assistant.libraries.b.f.b(this.gF.f308a.b.iK());
    }

    final com.google.android.apps.search.assistant.libraries.f.a.j F() {
        jo joVar = this.f;
        h hVar = joVar.f;
        h hVar2 = this.g;
        h hVar3 = joVar.bN;
        h hVar4 = joVar.H;
        jr jrVar = joVar.b;
        return new com.google.android.apps.search.assistant.libraries.f.a.j(hVar, hVar2, hVar3, hVar4, this.aj, jrVar.x, this.ak, this.al, joVar.vx, joVar.mw, joVar.bq, jrVar.y, jrVar.z, joVar.wn, this.ag, jrVar.A);
    }

    @Override // com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.f
    public final com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.e G() {
        return this.gF.f308a.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l H() {
        h hVar = this.hx;
        com.google.android.apps.search.assistant.platform.pcp.h.f R = R();
        ac T = T();
        as asVar = (as) hVar.a();
        Optional of = Optional.of((com.google.android.apps.search.assistant.platform.pcp.crossprofile.p) this.f.xH.a());
        com.google.android.apps.search.assistant.platform.pcp.api.r rVar = (com.google.android.apps.search.assistant.platform.pcp.api.r) this.f.uM.a();
        jo joVar = this.f;
        jy jyVar = joVar.f319a;
        as fm = joVar.fm();
        com.google.android.apps.search.assistant.platform.pcp.featuredata.j J = J();
        jyVar.bd();
        Context context = (Context) this.f.f.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f.bN.a();
        com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac acVar = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac) this.ao.a();
        com.google.android.libraries.assistant.pcp.v.b.v hc = hc();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar2 = this.f;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.d.v vVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.d.v(hc, fVar, joVar2.fm(), (t) joVar2.ww.a(), (Executor) this.f.v.a(), h.a.a.y.a.a.b.d(this.f.V), h.a.a.y.a.a.b.e(this.f.V), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
        com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m mVar = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.m) this.hI.a();
        Executor executor = (Executor) this.f.v.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        cr crVar = (cr) this.f.v.a();
        jo joVar3 = this.f;
        new ah(context, bVar, acVar, vVar, mVar, executor, aVar, crVar, joVar3.f319a.ba(), joVar3.fm());
        return new l(R, T, asVar, of, rVar, fm, J);
    }

    @Override // com.google.android.apps.gsa.staticplugins.ba.q, com.google.android.apps.search.assistant.platform.pcp.b.b
    public final com.google.android.apps.search.assistant.platform.pcp.b.a I() {
        return new com.google.android.apps.search.assistant.platform.pcp.b.a((ai) this.kI.a(), (AccountId) this.g.a(), (q) this.f.Wq());
    }

    final com.google.android.apps.search.assistant.platform.pcp.featuredata.j J() {
        fu n = fu.n(100003, K(), 100008, M());
        return new com.google.android.apps.search.assistant.platform.pcp.featuredata.j(n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j K() {
        com.google.android.libraries.assistant.pcp.v.b.v hc = hc();
        Context context = (Context) this.f.f.a();
        Executor executor = (Executor) this.f.H.a();
        Executor executor2 = (Executor) this.f.v.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.platform.pcp.validity.m fn = joVar.fn();
        com.google.common.v.f fVar = (com.google.common.v.f) joVar.ez.a();
        long a2 = h.a.a.y.a.a.b.a(this.f.V);
        long b = h.a.a.y.a.a.b.b(this.f.V);
        ao d = h.a.a.y.a.a.b.d(this.f.V);
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j(hc, context, executor, executor2, fn, fVar, a2, b, d, joVar2.fm(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar2.nM.a());
    }

    final com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.h L() {
        jo joVar = this.f;
        jr jrVar = joVar.b;
        boolean hC = jrVar.hC();
        com.google.protos.l.a.e bl = jrVar.bl();
        com.google.protos.l.a.e bs = jrVar.bs();
        boolean af = h.a.a.f.a.a.x.af(joVar.V);
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        cq cqVar = (cq) this.f.v.a();
        com.google.android.apps.search.assistant.verticals.ambient.p.a.a.k kVar = (com.google.android.apps.search.assistant.verticals.ambient.p.a.a.k) this.hF.a();
        jo joVar2 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.p.a.a.e eVar = new com.google.android.apps.search.assistant.verticals.ambient.p.a.a.e(hC, bl, bs, af, aVar, cqVar, kVar, joVar2.b.S(), (com.google.common.v.f) joVar2.ez.a(), (com.google.android.libraries.assistant.pcp.q.a.k) this.f.om.a(), dJ());
        jo joVar3 = this.f;
        jy jyVar = joVar3.f319a;
        com.google.android.libraries.assistant.pcp.q.a.ag iu = joVar3.iu();
        com.google.android.libraries.assistant.pcp.q.a.ao cX = jyVar.cX();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) joVar3.g.a();
        n nVar = (n) this.f.R.a();
        ag agVar = (ag) this.f.bo.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar3 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        jo joVar4 = this.f;
        jr jrVar2 = joVar4.b;
        return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.h(eVar, iu, cX, aVar2, nVar, agVar, aVar3, jrVar2.B, jrVar2.C, joVar4.oR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o M() {
        Context context = (Context) this.f.f.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.au dE = dE();
        Executor executor = (Executor) this.f.v.a();
        Executor executor2 = (Executor) this.f.H.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        h hVar = this.am;
        h hVar2 = this.f.b.u;
        ar arVar = ar.a;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.h L = L();
        lt ltVar = (lt) hVar.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.ai aiVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.ai(L, ltVar, joVar.iq(), ee(), N(), (ag) joVar.bo.a(), ((Boolean) this.f.b.F.a()).booleanValue(), (lt) this.an.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.libraries.search.t.a.a) this.f.iH.a());
        h hVar3 = this.am;
        return new o(context, fVar, dE, executor, executor2, aVar, hVar2, fu.n(arVar, aiVar, ar.b, new ad(L(), (lt) hVar3.a(), this.f.iq(), ee(), O(), N(), (lt) this.an.a(), (ag) this.f.bo.a(), ((Boolean) this.f.b.F.a()).booleanValue(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.search.t.a.a) this.f.iH.a())), (com.google.android.libraries.search.t.a.a) this.f.iH.a());
    }

    final com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.y N() {
        return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.y(dM(), O(), (n) this.f.R.a());
    }

    final com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.ar O() {
        return new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.ar((Context) this.f.f.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f.b.f322a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45383233").b());
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.d.d
    public final com.google.android.apps.search.assistant.platform.pcp.d.c P() {
        return new com.google.android.apps.search.assistant.platform.pcp.d.c((com.google.android.libraries.search.location.y) this.O.a(), (Executor) this.f.v.a(), (Executor) this.f.H.a(), Q(), (com.google.android.libraries.af.b.a) this.f.pd.a());
    }

    final com.google.android.apps.search.assistant.platform.pcp.d.h Q() {
        return new com.google.android.apps.search.assistant.platform.pcp.d.h((Context) this.f.f.a(), (Executor) this.f.H.a(), this.f.fl(), kc(), (com.google.android.libraries.search.location.y) this.O.a());
    }

    final com.google.android.apps.search.assistant.platform.pcp.h.f R() {
        com.google.android.apps.search.assistant.platform.pcp.h.a aVar = (com.google.android.apps.search.assistant.platform.pcp.h.a) this.hw.a();
        Executor executor = (Executor) this.f.H.a();
        com.google.android.apps.search.assistant.platform.pcp.h.j jVar = (com.google.android.apps.search.assistant.platform.pcp.h.j) this.hy.a();
        com.google.android.apps.search.assistant.platform.pcp.h.o oVar = (com.google.android.apps.search.assistant.platform.pcp.h.o) this.hz.a();
        return new com.google.android.apps.search.assistant.platform.pcp.h.f(aVar, executor, jVar, oVar, (cr) this.f.v.a(), (com.google.common.v.f) this.f.ez.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 7").d(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 10").b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.pcp.j.n S() {
        return new com.google.android.apps.search.assistant.platform.pcp.j.n((cq) this.f.H.a(), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.libraries.search.integrations.c.a.c) this.Y.a(), (String) this.f.Y.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45350607").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45350722").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 44526973").f());
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.j.ac$a
    public final ac T() {
        return new ac((Context) this.f.f.a(), (AccountId) this.g.a(), (as) this.hx.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (cq) this.f.H.a(), J(), R(), (com.google.common.v.f) this.f.ez.a(), h.a.a.y.a.a.b.f(this.f.V), new com.google.android.apps.search.assistant.platform.pcp.j.au(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.gsa.pcp.device 45350389").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.gsa.pcp.device 45350710").b()));
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.j.aj$a
    public final aj U() {
        return (aj) this.gF.f308a.bu.a();
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.j.ba$a
    public final ba V() {
        jj jjVar = this.gF.f308a;
        jo joVar = jjVar.f316a;
        com.google.android.apps.search.assistant.platform.pcp.b.a I = jjVar.b.I();
        com.google.common.v.f fVar = (com.google.common.v.f) joVar.ez.a();
        AccountId accountId = (AccountId) jjVar.b.g.a();
        Context context = (Context) jjVar.f316a.f.a();
        ik ikVar = jjVar.b;
        jo joVar2 = jjVar.f316a;
        return new ba(I, fVar, accountId, context, joVar2.f319a.be(), joVar2.fm(), ikVar.W(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar2.nN.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jjVar.f316a.nM.a(), (Executor) jjVar.f316a.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bc W() {
        com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.b eA = eA();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        ao d = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45360115").d();
        jr jrVar = this.f.b;
        jo joVar = jrVar.f322a;
        boolean hu = jrVar.hu();
        boolean f = ((com.google.apps.tiktok.experiments.e) joVar.V.a()).a("com.google.android.apps.gsa.pcp.device 45370387").f();
        ao d2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.gsa.pcp.device 45370343").d();
        jr jrVar2 = this.f.b;
        return new bc(eA, aVar, d, hu, f, d2, jrVar2.hy(), jrVar2.it().a());
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.a.b$a
    public final com.google.android.apps.search.assistant.platform.g.a.a.f X() {
        return (com.google.android.apps.search.assistant.platform.g.a.a.f) this.de.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.c.a.e Y() {
        return new com.google.android.apps.search.assistant.platform.g.c.a.e((com.google.android.apps.search.assistant.platform.g.c.g) this.ah.a(), (com.google.android.apps.search.assistant.platform.g.c.c.e) this.cx.a(), (ag) this.f.Q.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.c.a.q Z() {
        return new com.google.android.apps.search.assistant.platform.g.c.a.q((com.google.android.apps.search.assistant.platform.g.c.g) this.ah.a(), (com.google.android.apps.search.assistant.platform.g.c.c.e) this.cx.a(), (ag) this.f.Q.a());
    }

    @Override // com.google.android.apps.gsa.assist.c.f
    public final com.google.android.apps.search.assistant.platform.g.p.d a() {
        return ak();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.worker.s$a, com.google.android.apps.search.assistant.surfaces.notification.s, com.google.android.apps.search.assistant.surfaces.notification.ag$a
    public final w aA() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        AccountId accountId = (AccountId) jjVar.b.g.a();
        e.a b = c.b(jjVar.f316a.f319a.gC);
        h hVar = jjVar.b.av;
        jo joVar = jjVar.f316a;
        jy jyVar = joVar.f319a;
        jr jrVar = joVar.b;
        ik ikVar = jjVar.b;
        return new ab(context, accountId, b, ikVar.ay(), jrVar.aB(), jyVar.dV(), ikVar.kJ(), c.b(jjVar.u), jjVar.f316a.ks(), jjVar.eB(), c.b(hVar), c.b(jjVar.v), (Executor) jjVar.f316a.B.a(), (com.google.android.libraries.search.assistant.proactive.h.c) jjVar.f316a.in.a(), (com.google.apps.tiktok.account.b.d) jjVar.f316a.f319a.dT.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ao.e) jjVar.ak.a(), c.b(jjVar.al), (com.google.android.libraries.g.a) jjVar.f316a.g.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.settings.shared.y aB() {
        return new com.google.android.apps.search.assistant.surfaces.settings.shared.y(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45382302").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45429301").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45429306").e(), (com.google.android.libraries.search.location.y) this.O.a(), (Context) this.f.f.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.settings.shared.e.j$a
    public final com.google.android.apps.search.assistant.surfaces.settings.shared.e.g aC() {
        return this.gF.f308a.V();
    }

    final com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.l aD() {
        return new com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.a.a.l((com.google.android.apps.search.assistant.surfaces.voice.shared.c.a) this.aQ.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.by.c.a
    public final com.google.android.apps.search.assistant.surfaces.voice.b.b.d aE() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.b.b.g((ag) jjVar.f316a.Q.a(), new com.google.android.apps.search.assistant.surfaces.voice.b.b.c((Executor) jjVar.f316a.H.a(), (cg) jjVar.bm.a()), (com.google.android.apps.search.assistant.surfaces.voice.b.a.h) jjVar.bn.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.e.e.a.c aF() {
        jo joVar = this.f;
        e.a b = c.b(this.iF);
        ag agVar = (ag) joVar.Q.a();
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.e.e.a.c(b, agVar, joVar2.f319a.gY, joVar2.b.h(), h.a.a.f.b.a.n.p(this.l), this.f.b.hq());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.e.e.g.b aG() {
        return new com.google.android.apps.search.assistant.surfaces.voice.e.e.g.b(c.b(this.jI), (ag) this.f.Q.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45625438").f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.e.e.x.c aH() {
        return new com.google.android.apps.search.assistant.surfaces.voice.e.e.x.c((ag) this.f.bo.a(), c.b(this.jD));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.e.e.z.a aI() {
        return new com.google.android.apps.search.assistant.surfaces.voice.e.e.z.a((ag) this.f.bo.a(), c.b(this.jz));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.e.e.af.c aJ() {
        jo joVar = this.f;
        e.a b = c.b(this.iF);
        ag agVar = (ag) joVar.Q.a();
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.e.e.af.c(b, agVar, joVar2.f319a.gY, joVar2.b.h(), h.a.a.f.b.a.n.p(this.l));
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.y.e$a
    public final com.google.android.apps.search.assistant.surfaces.voice.h.a.c aK() {
        return (com.google.android.apps.search.assistant.surfaces.voice.h.a.c) this.gF.f308a.s.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.i.e.d
    public final com.google.android.apps.search.assistant.surfaces.voice.i.e.c aL() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.i.e.c((cq) jjVar.f316a.v.a(), (com.google.android.libraries.search.assistant.ab.d) jjVar.bT.a(), (Context) jjVar.f316a.f.a(), (ag) jjVar.f316a.bo.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.b.b.b aM() {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.g.b.b.b((com.google.android.apps.search.assistant.surfaces.voice.i.g.a.k) this.cy.a(), (ag) this.f.Q.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.c.u aN() {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.g.c.u(aM(), (com.google.android.apps.search.assistant.surfaces.voice.e.i.b) this.cV.a(), (ag) this.f.Q.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.y.e$b, com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$e, com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.b.a.e$b, com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.l$b
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.h.x aO() {
        return (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.x) this.df.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.a.a.bs
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.h.x aP() {
        return (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.x) this.df.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.a.a.bs
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.h.y aQ() {
        return (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.y) this.gF.f308a.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d aR() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.a.a.d((com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) this.jv.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) this.jw.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.a.d.m aS() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.m((Context) this.f.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.a.d.r aT() {
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.r(joVar.u(), (ag) joVar.bo.a(), (ag) this.f.bu.a(), h.a.a.e.a.a.i.f(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45658392").f(), (AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s aU() {
        n nVar = (n) this.f.P.a();
        n nVar2 = (n) this.f.bt.a();
        Context context = (Context) this.f.f.a();
        ax axVar = (ax) this.f.iv.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f.bN.a();
        jo joVar = this.f;
        return new s(nVar, nVar2, context, axVar, bVar, joVar.u(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) joVar.b.w.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.c.q) this.hE.a(), h.a.a.e.a.a.i.f(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.a.d.ah aV() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.ah((n) this.f.P.a(), aS(), ((Boolean) this.f.tr.a()).booleanValue(), new com.google.android.apps.search.assistant.surfaces.voice.j.a.d.l(c.b(this.f.mj)), aU(), aT(), h.a.a.e.a.a.i.e(this.l));
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.e aW() {
        return (com.google.android.apps.search.assistant.surfaces.voice.j.b.e) this.as.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.b.a aX() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.b.b.a((ag) this.f.Q.a(), (com.google.android.apps.search.assistant.surfaces.voice.j.a.b.b) this.f.sZ.a(), h.a.a.d.b.a.y.x(this.l), new h.a.a.f.b.a.k(this.l).h(), (com.google.android.apps.search.assistant.surfaces.voice.j.d.b) this.i.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.b.a.e$a
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.d.e aY() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.e(c.b(this.as), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45622082").f(), c.b(this.z), (ag) this.f.Q.a(), c.b(this.bX), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45654101").f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.d.g aZ() {
        ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45616446").f();
        ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45615694").d();
        ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45615695").d();
        com.google.android.apps.search.assistant.platform.g.k.a.d dVar = (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.d.t tVar = new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.t(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45476097").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45598599").d());
        Context context = (Context) this.f.f.a();
        h.a.a.e.a.a.i.a(this.l);
        com.google.android.apps.search.assistant.surfaces.voice.j.a.b.a fG = this.f.fG();
        ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45615639").f();
        return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.g(dVar, tVar, context, fG, ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45627273").b(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45627654").b());
    }

    final com.google.android.apps.search.assistant.platform.g.g.b.o aa() {
        return new com.google.android.apps.search.assistant.platform.g.g.b.o(aT(), (Context) this.f.f.a(), (com.google.common.v.f) this.f.ez.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.g.b.w ab() {
        return new com.google.android.apps.search.assistant.platform.g.g.b.w((ag) this.f.Q.a(), (Context) this.f.f.a(), (ap) this.ai.a(), new com.google.android.apps.search.assistant.platform.g.g.b.q((com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a(), aB(), (com.google.common.v.f) this.f.ez.a()), aa(), (com.google.common.v.f) this.f.ez.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.ui.lockscreenblocker.notification.a$a
    public final com.google.android.apps.search.assistant.platform.g.j.c ac() {
        return (com.google.android.apps.search.assistant.platform.g.j.c) this.ak.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.j.m ad() {
        return new com.google.android.apps.search.assistant.platform.g.j.m((cq) this.f.H.a(), (cg) this.h.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.j.a.c ae() {
        return new com.google.android.apps.search.assistant.platform.g.j.a.c((ag) this.f.Q.a(), (Context) this.f.f.a(), (p) this.P.a(), (AccountId) this.g.a(), (com.google.android.libraries.search.l.b.f) this.f.vU.a(), (com.google.android.libraries.g.a) this.f.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.platform.g.k.a af() {
        h hVar = this.n;
        hVar.getClass();
        Object a2 = hVar.a();
        a2.getClass();
        return (com.google.android.apps.search.assistant.platform.g.k.a) a2;
    }

    public final com.google.android.apps.search.assistant.platform.g.m.b ag() {
        return new com.google.android.apps.search.assistant.platform.g.m.b((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.android.apps.gsa.assistant.settings.devices.d.b.l) this.f.nF.a(), (cq) this.f.H.a());
    }

    public final com.google.android.apps.search.assistant.platform.g.m.c ah() {
        return new com.google.android.apps.search.assistant.platform.g.m.c((cg) this.bg.a());
    }

    @Override // com.google.android.apps.search.assistant.platform.g.m.k, com.google.android.apps.search.assistant.platform.g.m.b.e.a
    public final com.google.android.apps.search.assistant.platform.g.m.m ai() {
        return this.gF.f308a.H();
    }

    public final com.google.android.apps.search.assistant.platform.g.n.n aj() {
        return new com.google.android.apps.search.assistant.platform.g.n.n((cg) this.f.iy.a(), (cg) this.cY.a(), (ay) this.f.iu.a(), (com.google.android.apps.search.assistant.surfaces.voice.u.a.b) this.jX.a(), (Executor) this.f.H.a(), (ag) this.f.Q.a(), this.f.b.z(), new op(new com.google.android.apps.search.assistant.platform.g.c.a.u((com.google.android.apps.search.assistant.platform.g.c.g) this.ah.a(), (com.google.android.apps.search.assistant.platform.g.c.c.e) this.cx.a(), (ag) this.f.Q.a())));
    }

    final com.google.android.apps.search.assistant.platform.g.p.d ak() {
        return new com.google.android.apps.search.assistant.platform.g.p.d((cq) this.f.H.a(), (cg) this.gG.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.b.e.a.b al() {
        return new com.google.android.apps.search.assistant.surfaces.b.e.a.b((com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.aI.a(), hO());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.appactions.service.i$a
    public final com.google.android.apps.search.assistant.surfaces.appactions.service.b am() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        Executor executor = (Executor) jjVar.f316a.H.a();
        jo joVar = jjVar.f316a;
        return new com.google.android.apps.search.assistant.surfaces.appactions.service.b(context, executor, new lm(joVar, jjVar.b), (com.google.cj.i.f) joVar.wr.a(), new com.google.android.apps.search.assistant.surfaces.appactions.b.a.a((Context) jjVar.f316a.b.f322a.f.a()));
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.c.a
    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.c an() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.d.c) this.gF.f308a.bB.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.f$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.e ao() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.e) this.gF.f308a.bD.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.broadcasts.a$a, com.google.android.apps.search.assistant.surfaces.bisto.interactor.broadcasts.c.a, com.google.android.apps.search.assistant.surfaces.bisto.interactor.broadcasts.h$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p ap() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.interactor.n.p) this.gF.f308a.by.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.e.h.k, com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ch$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.d.ar aq() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.d.ar) this.gF.f308a.bG.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ch$a
    public final bf ar() {
        return (bf) this.gF.f308a.bH.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.phoneswitch.AssistantWearableListenerService$a
    public final bj as() {
        return (bj) this.gF.f308a.bF.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.phoneswitch.AssistantWearableListenerService$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.h at() {
        return this.gF.f308a.Q();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ch$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.s au() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.u((bj) jjVar.bF.a(), (com.google.android.apps.search.assistant.surfaces.bisto.d.ar) jjVar.bG.a(), (cr) jjVar.f316a.H.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bu$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.a.a av() {
        return this.gF.f308a.S();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.b.d
    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.b.c aw() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.b.c(jjVar.R(), jjVar.f316a.b.hZ());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.phoneswitch.AssistantWearableListenerService$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.t ax() {
        return this.gF.f308a.T();
    }

    public final com.google.android.apps.search.assistant.surfaces.notification.j ay() {
        return new com.google.android.apps.search.assistant.surfaces.notification.j((com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p) this.as.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.s.bc) this.at.a(), (Executor) this.f.H.a(), this.f.kr(), (com.google.android.apps.search.assistant.surfaces.voice.robin.p.c) this.au.a(), (am) this.z.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final com.google.android.apps.search.assistant.surfaces.notification.l az() {
        return (com.google.android.apps.search.assistant.surfaces.notification.l) this.gF.f308a.bZ.a();
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.x.a.i
    public final com.google.android.apps.search.assistant.platform.g.j.c b() {
        return (com.google.android.apps.search.assistant.platform.g.j.c) this.ak.a();
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.d.d bA() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.d.d(new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.d.b((PackageManager) this.f.h.a(), xP(), new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.d.a(), ae.aX(this.l), ae.aR(this.l)));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.e.c bB() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.e.c((lt) this.iH.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.b.a bC() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.b.a(ae.aJ(this.l), ae.bs(this.l), ae.aU(this.l), vF(), ae.by(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.i bD() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.i((Context) this.f.f.a(), (com.google.android.libraries.search.assistant.ai.a.j) this.bm.a(), cy(), ae.aO(this.l), ck());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.s bE() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.s((Context) this.f.f.a(), (com.google.android.libraries.search.assistant.ai.a.j) this.bm.a(), cy(), ae.aO(this.l), ae.bf(this.l), ci(), ae.aq(this.l), bH(), ck());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.v bF() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.v((Context) this.f.f.a(), (com.google.android.libraries.search.assistant.ai.a.j) this.bm.a(), cy(), ae.aO(this.l), ae.bf(this.l), ci(), ae.aq(this.l), bH(), ck());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.a.e bG() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.a.e((Executor) this.f.v.a(), (com.google.apps.tiktok.g.p) this.aa.a(), ae.bL(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.a.i bH() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.a.i((Context) this.f.f.a(), (com.google.apps.tiktok.concurrent.ao) this.f.bz.a(), (com.google.android.libraries.search.assistant.ai.a.j) this.bm.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.b.b bI() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.b.b((com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45635064").f(), dd(), vv());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.g bJ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.g((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.i bK() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.i(Optional.of((com.google.android.libraries.search.assistant.invocation.t.a.c) this.bs.a()), (PackageManager) this.f.h.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622025").f(), ci(), ae.al(this.l), cy(), ck(), bJ());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.m bL() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.m((Context) this.f.f.a(), cl(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45620192").f(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (AccountId) this.g.a(), ci(), bM(), ae.al(this.l), cy(), ck(), bJ(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651156").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.q bM() {
        boolean aF = ae.aF(this.l);
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644687").f();
        af d = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644387").d();
        af d2 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644437").d();
        af d3 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644438").d();
        af d4 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644439").d();
        Context context = (Context) this.f.f.a();
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.q(aF, f, d, d2, d3, d4, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.j(context, joVar.f319a.n(), (PackageManager) joVar.h.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645748").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645750").f()));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.s bN() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.s((PackageManager) this.f.h.a(), (Context) this.f.f.a(), (lt) this.bT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619658").f(), ci(), ae.al(this.l), cj(), cy(), ck(), (KeyguardManager) this.f.nn.a(), bJ(), cl(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645770").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.x bO() {
        com.google.android.apps.search.assistant.surfaces.voice.robin.w.a.f fVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.w.a.f) this.bU.a();
        Context context = (Context) this.f.f.a();
        com.google.common.v.f fVar2 = (com.google.common.v.f) this.f.ez.a();
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.x(fVar, context, fVar2, joVar.f319a.rC(), (n) joVar.R.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619659").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45634749").f(), ci(), ae.al(this.l), cy(), ck(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641857").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641858").f(), bJ());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.ag bP() {
        ContentResolver contentResolver = (ContentResolver) this.f.mj.a();
        AudioManager audioManager = (AudioManager) this.f.cZ.a();
        BluetoothManager bluetoothManager = (BluetoothManager) this.f.va.a();
        jo joVar = this.f;
        jr jrVar = joVar.b;
        jy jyVar = joVar.f319a;
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.i cl = cl();
        CameraManager n = jyVar.n();
        WifiManager x = jrVar.x();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.a by = by();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.d dVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.d) this.iX.a();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.f fVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.f((lt) this.bT.a());
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619854").f();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a ci = ci();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.q bM = bM();
        com.google.protos.l.a.e al = ae.al(this.l);
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.l bQ = bQ();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.k kVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.k) this.iY.a();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.m mVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.m((Context) this.f.f.a(), (byte[]) null);
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.m mVar2 = new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.m((Context) this.f.f.a());
        ae.bo(this.l);
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.ag(contentResolver, audioManager, bluetoothManager, cl, n, x, by, dVar, fVar, f, ci, bM, al, bQ, kVar, mVar, mVar2, cy(), ck(), bJ());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.l bQ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.deviceactions.a.l(ae.bo(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642061").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.p bR() {
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.ad bS = bS();
        bT();
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.p(bS, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.r(kD(), (com.google.apps.tiktok.concurrent.ao) this.f.bz.a()), ae.ba(this.l), ae.ao(this.l), ae.ad(this.l), ae.ac(this.l), ae.bu(this.l), ae.bz(this.l), (com.google.android.libraries.g.a) this.f.g.a(), ci(), cy(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (ag) this.f.Q.a(), (n) this.f.P.a(), (String) this.f.Y.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.ad bS() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.ad((Context) this.f.f.a(), bT(), new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.a.a((Context) this.f.f.a()), (com.google.apps.tiktok.concurrent.ao) this.f.bz.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651859").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.af bT() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.af((Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.ba bU() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.ba((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.b bV() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.b(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45658426").f(), Optional.empty());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.d bW() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.d(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45658427").f(), Optional.empty());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.e bX() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.e((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.h bY() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.h(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45655568").f(), Optional.empty());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.j bZ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.j(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45657198").f(), Optional.empty());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.b.a.e$a, com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p ba() {
        return (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p) this.as.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.u bb() {
        return new com.google.android.apps.search.assistant.surfaces.voice.j.b.d.c.u(bl(), new h.a.a.d.b.a.ag(this.l).a(), h.a.a.e.a.a.i.d(this.l), dk(), aS(), new h.a.a.d.b.a.ag(this.l).b(), new h.a.a.d.b.a.ag(this.l).i(), h.a.a.d.b.a.y.j(this.l), h.a.a.d.b.a.y.g(this.l), h.a.a.d.b.a.y.f(this.l), (String) this.f.Y.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (com.google.android.libraries.g.a) this.f.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.h bc() {
        return new com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a.h(((com.google.apps.tiktok.experiments.e) this.f.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45370146").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45370147").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45370148").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.iE().a.a()).a("com.google.android.apps.search.assistant.device 45370149").d());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.o.b.g$a
    public final com.google.android.apps.search.assistant.surfaces.voice.o.a.h bd() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.o.a.h((Context) jjVar.f316a.f.a(), (String) jjVar.f316a.Y.a(), (ag) jjVar.f316a.Q.a(), (Executor) jjVar.f316a.H.a(), ((com.google.apps.tiktok.experiments.e) jjVar.b.l.a()).a("com.google.android.apps.search.assistant.user 45624437").f(), (cg) jjVar.bY.a(), (com.google.android.apps.search.assistant.platform.g.k.a.d) jjVar.b.Z.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) jjVar.f316a.b.o.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.h.f be() {
        lt ltVar = (lt) this.bG.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45640191").f();
        ltVar.getClass();
        return ltVar.aQ(f, 4, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.car.q bf() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.car.q(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45656081").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640076").f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.j.b.b bg() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.j.b.b((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), ((Boolean) this.f.tr.a()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.m bh() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.m((cg) this.aM.a(), (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a(), h.a.a.d.b.a.y.k(this.l), h.a.a.d.b.a.y.e(this.l), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.l) this.aN.a(), bi());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.n bi() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.storage.n((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.c bj() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.c((Context) this.f.f.a(), (ag) this.f.Q.a(), br(), new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.b((com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), bM(), vz(), vA(), ae.br(this.l), ae.aI(this.l), ae.aL(this.l), vB(), ae.aY(this.l), ae.aw(this.l), ae.aN(this.l), ae.be(this.l), ae.aQ(this.l), ae.bc(this.l), ae.aP(this.l), ae.bp(this.l), ae.aT(this.l), ae.au(this.l), ae.aj(this.l), ae.al(this.l), ae.ak(this.l), ae.ai(this.l), ae.an(this.l), ae.as(this.l), ae.aZ(this.l), ae.bq(this.l), ae.at(this.l), ae.aV(this.l), ae.am(this.l), vC(), ae.ax(this.l), ae.aK(this.l), ae.ah(this.l), ae.ay(this.l)), this.cb, ae.N(this.l), h.a.a.d.b.a.y.t(this.l), h.a.a.e.a.a.i.a(this.l), ae.bx(this.l), ae.bw(this.l), ae.T(this.l), h.a.a.d.b.a.y.c(this.l), (com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.c.f) this.cc.a(), ae.i(this.l), ae.a(this.l), cZ(), ae.n(this.l), ae.g(this.l), ae.h(this.l), ae.f(this.l), ae.d(this.l), ae.e(this.l), ae.H(this.l), ae.J(this.l), ae.K(this.l), h.a.a.d.b.a.y.v(this.l), vD(), ae.bt(this.l), ae.aS(this.l), ae.I(this.l), ae.s(this.l), ae.R(this.l), h.a.a.d.b.a.y.k(this.l), h.a.a.d.b.a.y.h(this.l), ae.b(this.l), ae.D(this.l), ae.bj(this.l), ae.E(this.l), new h.a.a.d.b.a.ag(this.l).f(), ae.F(this.l), ae.G(this.l), ae.t(this.l), ae.x(this.l), ae.S(this.l), ae.m(this.l), ae.bn(this.l), ae.bm(this.l), ae.O(this.l), (PackageManager) this.f.h.a(), this.f.b.iC().i(), ae.bk(this.l), ae.P(this.l), ae.Q(this.l), ae.M(this.l), ae.L(this.l), ae.bO(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.d bk() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.d(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45491478").b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h bl() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.common.g.h((Context) this.f.f.a(), (String) this.f.Y.a(), (ak) this.aP.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), bk(), bj(), (am) this.z.a(), h.a.a.d.b.a.y.w(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.d bm() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.d((cg) this.w.a(), h.a.a.d.b.a.y.q(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.a bn() {
        k.a.a aVar = this.gZ;
        Optional empty = Optional.empty();
        aVar.getClass();
        k.a.a aVar2 = (k.a.a) empty.orElse((Object) null);
        if (aVar2 != null) {
            aVar = aVar2;
        }
        Object a2 = aVar.a();
        a2.getClass();
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.a.a) a2;
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f, com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.p.i bo() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.p.i) this.bX.a();
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.q.g bp() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.q.g(new com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.y((com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.am) this.aq.a(), (ag) this.f.Q.a()), (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.ar.a(), (Context) this.f.f.a(), (AccountId) this.g.a());
    }

    public final al bq() {
        return new al(this.f.b.hI(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621691").f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.g br() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.g(rl(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.f bs() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.f((ag) this.f.bo.a(), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.b.a.g) this.aW.a(), xP());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.k bt() {
        fq i = fu.i(8);
        i.i(com.google.g.ab.d.b.a.d.c.b, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.a.b(new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.a.a.c(aF(), bx(), xP(), bw(), ae.bv(this.l)), ae.bB(this.l), Optional.empty()));
        i.i(com.google.g.ab.d.b.a.d.c.g, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.b.g((com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.b.c) this.iG.a()));
        i.i(com.google.g.ab.d.b.a.d.c.e, bz());
        i.i(com.google.g.ab.d.b.a.d.c.d, bA());
        i.i(com.google.g.ab.d.b.a.d.c.i, bB());
        i.i(com.google.g.ab.d.b.a.d.c.f, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.f.o((com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.f.h) this.iI.a()));
        i.i(com.google.g.ab.d.b.a.d.c.h, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.g.i((com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.g.c) this.iK.a()));
        i.i(com.google.g.ab.d.b.a.d.c.c, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.h.b(new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.h.a.b(aJ(), xP(), bw(), ae.bv(this.l)), ae.bD(this.l), Optional.empty()));
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.k(i.h(true), nn.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.ac bu() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.ac((ag) this.f.Q.a(), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.b.a.g) this.aW.a(), bt(), (com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.al) this.bo.a(), xP(), ae.aR(this.l), ae.by(this.l), ae.aG(this.l), bv());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.ad bv() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.ad((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.b bw() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.b((Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.a.a.a bx() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.a.a.a(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45633985").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.a by() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.a((ContentResolver) this.f.mj.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.i bz() {
        Context context = (Context) this.f.f.a();
        jo joVar = this.f;
        WifiManager x = joVar.b.x();
        BluetoothManager bluetoothManager = (BluetoothManager) joVar.va.a();
        AudioManager audioManager = (AudioManager) this.f.cZ.a();
        ContentResolver contentResolver = (ContentResolver) this.f.mj.a();
        jo joVar2 = this.f;
        DisplayManager G = joVar2.G();
        KeyguardManager keyguardManager = (KeyguardManager) joVar2.nn.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f.g.a();
        ad();
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.i(new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.b.a.a.c.g(context, x, bluetoothManager, audioManager, contentResolver, G, keyguardManager, aVar, ch(), (com.google.android.libraries.search.integrations.c.a.c) this.Y.a(), ah(), by(), xP(), ae.s(this.l), ae.t(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45650785").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45650788").f(), ae.y(this.l), ae.aR(this.l)));
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.y.a.o$a
    public final com.google.apps.tiktok.cache.o c() {
        return (com.google.apps.tiktok.cache.o) this.jU.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.y.n cA() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.y.n(cn(), ah(), h.a.a.d.b.a.y.p(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.e cB() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.y.a.e(kr(), this.f.mJ(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45459984").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45459985").d());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.e cC() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.e(cD(), (com.google.android.apps.search.assistant.surfaces.voice.robin.x.f.a) this.ci.a(), (com.google.common.v.f) this.f.ez.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.m cD() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.z.a.m((cg) this.gW.a(), (Executor) this.f.v.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.af.a$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.af.g cE() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.af.g(jjVar.b.iA(), (com.google.android.apps.search.assistant.surfaces.voice.robin.i.b.d) jjVar.Q.a(), ((com.google.apps.tiktok.experiments.e) jjVar.so().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45656653").f(), ((com.google.apps.tiktok.experiments.e) jjVar.so().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45656654").b());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.routing.m
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.routing.l cF() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.routing.l((AccountId) jjVar.b.g.a(), (com.google.apps.tiktok.p.b) jjVar.f316a.lR.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.service.a$a
    public final aa cG() {
        return (aa) this.bZ.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.routing.ad
    public final aa cH() {
        return (aa) this.bZ.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.a cI() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.a((com.google.android.apps.search.assistant.surfaces.voice.i.f.a.k) this.f.qT.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.c cJ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.c(c.b(this.gX));
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final am cK() {
        return (am) this.z.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.ao cL() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.ao(((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419696").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419695").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419698").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419697").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45419699").f(), dc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.b.d cM() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.b.d((cg) this.cW.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) this.bA.a(), bl(), (com.google.common.v.f) this.f.ez.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.p cN() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.p((cg) this.bz.a(), (Executor) this.f.H.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) this.bA.a(), bl(), (com.google.common.v.f) this.f.ez.a(), cO(), di(), h.a.a.d.b.a.y.b(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.s cO() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.a.e.s((com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), c.b(this.bE), vx(), h.a.a.d.b.a.y.a(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ak.b.b cP() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ak.b.b(cM(), (ag) this.f.Q.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.e cQ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.e(cR(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), new h.a.a.d.b.a.ah(this.l).j(), new h.a.a.d.b.a.ag(this.l).g(), new h.a.a.d.b.a.ah(this.l).i(), new h.a.a.d.b.a.ah(this.l).h(), new h.a.a.d.b.a.ah(this.l).o(), h.a.a.d.b.a.y.e(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.a.a cR() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45625593").f(), ae.Z(this.l)) ? new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.a.d((AccountId) this.g.a(), (com.google.apps.tiktok.p.b) this.f.lR.a()) : new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.transcription.e.a.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c, java.lang.Object] */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.c cS() {
        e.a b = c.b(this.by);
        jo joVar = this.f;
        Optional of = Optional.of(new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.a.a(joVar.b.hN(), (ag) joVar.Q.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645794").d(), new h.a.a.d.b.a.ah(this.l).n()));
        b.getClass();
        of.isPresent();
        com.google.common.f.h d = com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.b.a.a.d();
        d.aj(com.google.common.f.a.e.a, "Ma-Robin-Speech");
        d.ak(33677);
        d.p("using AudioLibrary for Playback");
        return of.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.a.t cT() {
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.speech.d.c.a.t(joVar.b.bi, joVar.f, joVar.bz, this.iN, this.iO);
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.an.c cU() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.an.c((com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.g) this.x.a(), (am) this.z.a(), new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c(com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.o.d, bm()));
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$d
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ao.e cV() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.ao.e) this.gF.f308a.ak.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final an cW() {
        Context context = (Context) this.f.f.a();
        boolean b = h.a.a.e.a.a.i.b(this.l);
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45620731").f();
        boolean c = h.a.a.e.a.a.i.c(this.l);
        boolean f2 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45430159").f();
        boolean f3 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45650753").f();
        boolean f4 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45461901").f();
        boolean f5 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45630499").f();
        boolean f6 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45630673").f();
        boolean f7 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45630934").f();
        com.google.android.apps.search.assistant.surfaces.voice.robin.ah.v vVar = (com.google.android.apps.search.assistant.surfaces.voice.robin.ah.v) this.iw.a();
        boolean a2 = h.a.a.e.a.a.b.a(this.l);
        boolean b2 = h.a.a.e.a.a.b.b(this.l);
        int i = com.google.android.apps.search.assistant.surfaces.voice.robin.ao.b.b.f2366a;
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        cg cgVar = (cg) this.ix.a();
        fVar.getClass();
        cgVar.getClass();
        return new an(context, b, f, c, f2, f3, f4, f5, f6, f7, vVar, a2, b2, (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.i) this.f.ta.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.a cX() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.a(com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639044").f(), ae.aD(this.l)));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.p cY() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.p(new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.r(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45653823").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45655388").f()), new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.actioncard.i.q(cX(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45653825").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45655386").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45657180").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45659162").f()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.d.c cZ() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.d.c(da(), ae.B(this.l), ae.C(this.l), ae.A(this.l), ae.z(this.l), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.l ca() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.l(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45643081").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.n cb() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.n(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.p cc() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.p(cl(), cy(), ae.aM(this.l), cj(), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45655567").f(), Optional.empty());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.r cd() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.e.r(cl(), cj(), cy(), ae.aM(this.l), ci(), ae.aj(this.l), ae.aH(this.l), ck(), bX(), ae.bC(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45657197").f(), Optional.empty());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.f.b ce() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.f.b((com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), dd(), com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622198").f(), ae.az(this.l)), vv());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.f.d cf() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.f.d(this.bI, vy(), new h.a.a.d.b.a.ah(this.l).k(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45654126").f(), ae.l(this.l), (com.google.common.v.f) this.f.ez.a(), (String) this.f.Y.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.g.b cg() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.g.b((com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), dd(), ci(), com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621278").f(), ae.aA(this.l)), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621451").d(), com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622379").f(), ae.aA(this.l)), vv(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644128").d(), ck());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.d.g ch() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.d.g(ad(), (cg) this.bf.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a ci() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a(ae.aY(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.d cj() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.d((Context) this.f.f.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.r.am) this.bp.a(), (ag) this.f.Q.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.e ck() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.e(cy());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.i cl() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.i(aD());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a.e cm() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a.e((Context) this.f.f.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), dd(), new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a.a.a.a((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a()), vv(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45659386").f());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.e cn() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.e((am) this.z.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.am) this.A.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.query.c.g) this.x.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644941").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45646036").f(), h.a.a.d.b.a.y.n(this.l));
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.a.h co() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.a.h(cC(), bh(), (am) this.z.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.s.a.k cp() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.s.a.k((cg) this.jb.a(), (com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.t.e cq() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.t.e) this.gF.f308a.ca.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.o.b.g$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.t.j cr() {
        return this.gF.f308a.aN();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.u.b.j cs() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.u.b.j((Context) this.f.f.a(), (ag) this.f.Q.a(), new com.google.android.apps.search.assistant.surfaces.voice.robin.u.b.k((com.google.android.libraries.search.assistant.bb.c.s) this.iP.a()), iX());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.googleone.e$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.x.ac ct() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.ac((com.google.android.libraries.search.b.b) this.aV.a(), (com.google.android.libraries.search.b.b) this.ba.a(), hC(), (ag) this.f.Q.a(), (com.google.android.libraries.g.a) this.f.g.a(), (KeyguardManager) this.f.nn.a(), ae.p(this.l), cs(), ae.r(this.l), ae.o(this.l), ae.q(this.l), (ak) this.aP.a(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$b
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.x.ad cu() {
        return this.gF.f308a.aQ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.x.af cv() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.af((com.google.android.apps.search.assistant.surfaces.voice.robin.x.an) this.gO.a(), (ag) this.f.Q.a());
    }

    public final bd cw() {
        return new bd((com.google.android.libraries.search.b.b) this.aV.a(), cs(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45657450").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.b cx() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.b((com.google.android.libraries.search.b.b) this.aV.a(), cy());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.c cy() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.c((com.google.android.libraries.search.b.b) this.aV.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.d cz() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.d((com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), (String) this.f.Y.a());
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.y.a.o$a
    public final com.google.apps.tiktok.g.an d() {
        return (com.google.apps.tiktok.g.an) this.jW.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.l.m dA() {
        return new com.google.android.apps.search.assistant.verticals.ambient.l.m((com.google.android.apps.search.assistant.verticals.ambient.r.d.d) this.hj.a(), (com.google.android.apps.search.assistant.verticals.ambient.r.b.e) this.hk.a(), new com.google.android.apps.search.assistant.verticals.ambient.r.a.a.d((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.verticals.ambient.i.d.f((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.i.c.b) this.R.a(), (ExecutorService) this.f.v.a()), (ExecutorService) this.f.H.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45353344").a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.m.a.b dB() {
        return new com.google.android.apps.search.assistant.verticals.ambient.m.a.b((com.google.android.libraries.search.location.y) this.O.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), (com.google.android.libraries.g.a) this.f.g.a(), (ExecutorService) this.f.H.a());
    }

    @Override // com.google.android.apps.gsa.smartspace.b.z, com.google.android.apps.search.assistant.verticals.ambient.crossprofile.f, com.google.android.apps.search.assistant.verticals.ambient.n.p.a
    public final com.google.android.apps.search.assistant.verticals.ambient.n.a dC() {
        return dD();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.n.m dD() {
        com.google.android.apps.search.assistant.verticals.ambient.s.g.c.b dT = dT();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.libraries.logging.ve.synthetic.f fVar2 = (com.google.android.libraries.logging.ve.synthetic.f) this.f.f319a.du.a();
        com.google.android.libraries.logging.ve.y yVar = (com.google.android.libraries.logging.ve.y) this.f.ql.a();
        com.google.android.libraries.logging.ve.j jVar = (com.google.android.libraries.logging.ve.j) this.f.qm.a();
        AccountId accountId = (AccountId) this.g.a();
        Executor executor = (Executor) this.f.v.a();
        com.google.android.libraries.search.t.c.ak akVar = (com.google.android.libraries.search.t.c.ak) this.ae.a();
        com.google.android.libraries.search.t.c.ak akVar2 = (com.google.android.libraries.search.t.c.ak) this.af.a();
        jo joVar = this.f;
        jy jyVar = joVar.f319a;
        jr jrVar = joVar.b;
        boolean fy = jrVar.fy();
        boolean fz = jrVar.fz();
        boolean fH = jrVar.fH();
        com.google.android.apps.search.assistant.verticals.ambient.settings.i dP = dP();
        com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar.fZ();
        cg cgVar = (cg) jyVar.ct.a();
        boolean at = h.a.a.f.a.a.x.at(this.f.V);
        jo joVar2 = this.f;
        jr jrVar2 = joVar2.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.n.m(dT, fVar, fVar2, yVar, jVar, accountId, executor, akVar, akVar2, fy, fz, fH, dP, fZ, cgVar, at, jrVar2.g(), jrVar2.j(), jrVar2.k(), (com.google.android.libraries.search.t.l.k) joVar2.qr.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.n.au dE() {
        return new com.google.android.apps.search.assistant.verticals.ambient.n.au((com.google.android.libraries.search.t.i.y) this.f.W.a(), (com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a(), (Executor) this.f.v.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.p.a.a.m dF() {
        return new com.google.android.apps.search.assistant.verticals.ambient.p.a.a.m((Executor) this.f.H.a(), (p) this.P.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.p.b.c dG() {
        lt ltVar = (lt) this.hB.a();
        jo joVar = ((jd) ltVar.a).f312a;
        com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ap dK = dK();
        com.google.android.apps.search.assistant.verticals.ambient.p.d.d dL = dL();
        com.google.android.apps.search.assistant.verticals.ambient.p.b.a.w fT = joVar.fT();
        ExecutorService executorService = (ExecutorService) joVar.v.a();
        jo joVar2 = ((jd) ltVar.a).f312a;
        com.google.android.apps.search.assistant.verticals.ambient.p.b.a.c fR = joVar2.fR();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar2.nM.a();
        return new com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ak(fT, executorService, fR, aVar, dL, dK, (Context) ((jd) ltVar.a).f312a.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.p.b.e dH() {
        return new com.google.android.apps.search.assistant.verticals.ambient.p.b.b.a(dI());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.p.b.a.t dI() {
        cr crVar = (cr) this.f.H.a();
        cq cqVar = (cq) this.f.v.a();
        com.google.android.apps.search.assistant.verticals.ambient.i.d.m mVar = (com.google.android.apps.search.assistant.verticals.ambient.i.d.m) this.ad.a();
        com.google.android.apps.search.assistant.verticals.ambient.p.b.c dG = dG();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        p pVar = (p) this.P.a();
        jr jrVar = this.f.b;
        com.google.protos.l.a.e bv = jrVar.bv();
        boolean hF = jrVar.hF();
        boolean fx = jrVar.fx();
        com.google.protos.l.a.e bs = jrVar.bs();
        com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ao dJ = dJ();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a();
        h hVar = this.hF;
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.p.b.a.t(crVar, cqVar, mVar, dG, aVar, pVar, bv, hF, fx, bs, dJ, fVar, rVar, joVar.fS(), dM(), joVar.fR(), dL(), joVar.fT(), new com.google.android.apps.search.assistant.verticals.ambient.p.b.a.j(joVar.b.aV(), dD(), c.b(hVar), (ExecutorService) joVar.v.a()), (com.google.android.libraries.search.t.a.a) this.f.iH.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ao dJ() {
        return new com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ao(dQ(), ag(), (ExecutorService) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ap dK() {
        return new com.google.android.apps.search.assistant.verticals.ambient.p.b.a.ap((com.google.android.apps.search.assistant.verticals.ambient.i.d.m) this.ad.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.p.d.d dL() {
        return new com.google.android.apps.search.assistant.verticals.ambient.p.d.d((p) this.P.a(), (com.google.common.v.f) this.f.ez.a(), (cq) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.p.d.g dM() {
        return ((lt) this.f.ol.a()).C(dL());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.r.b.m dN() {
        return new com.google.android.apps.search.assistant.verticals.ambient.r.b.m((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.libraries.storage.a.j) this.f.as.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.r.c.c dO() {
        return new com.google.android.apps.search.assistant.verticals.ambient.r.c.c((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (bz) this.f.hP.a(), (cq) this.f.v.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.settings.i dP() {
        jo joVar = this.f;
        com.google.android.apps.gsa.u.b.c A = joVar.b.A();
        cq cqVar = (cq) joVar.H.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.apps.search.assistant.verticals.ambient.settings.n dQ = dQ();
        PackageManager packageManager = (PackageManager) this.f.h.a();
        com.google.android.apps.search.assistant.platform.g.m.b ag = ag();
        com.google.android.apps.search.assistant.libraries.f.a.i a2 = F().a();
        Context context = (Context) this.f.f.a();
        jo joVar2 = this.f;
        boolean fJ = joVar2.b.fJ();
        joVar2.fZ();
        h.a.a.f.a.a.x.at(this.f.V);
        h.a.a.f.a.a.x.aC(this.f.V);
        return new com.google.android.apps.search.assistant.verticals.ambient.settings.i(A, cqVar, aVar, dQ, packageManager, ag, a2, context, fJ, this.f.b.fN(), dv());
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.settings.o$a
    public final com.google.android.apps.search.assistant.verticals.ambient.settings.n dQ() {
        return new com.google.android.apps.search.assistant.verticals.ambient.settings.n((com.google.android.libraries.search.udcdataservice.k) this.Q.a(), (cq) this.f.H.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.s.f.j dR() {
        return new com.google.android.apps.search.assistant.verticals.ambient.s.f.j((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.verticals.ambient.s.g.d.h((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (cg) this.hS.a(), (com.google.common.v.f) this.f.ez.a(), (cq) this.f.H.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350208").b(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350207").b(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350489").b(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45352374").b()), (cq) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.s.g.a.i dS() {
        return new com.google.android.apps.search.assistant.verticals.ambient.s.g.a.i((cg) this.hO.a(), (cq) this.f.H.a(), (com.google.common.v.f) this.f.ez.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.s.g.c.b dT() {
        return new com.google.android.apps.search.assistant.verticals.ambient.s.g.c.b((cg) this.hC.a(), (Executor) this.f.v.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.s.h.n dU() {
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.s.h.n(joVar.fZ(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar.nN.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), dn(), new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.a.d((ag) this.f.bo.a(), (Executor) this.f.H.a(), (cg) this.jq.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45619447").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45618865").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45620839").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45620840").b()), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45411826").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45418531").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45619436").f(), (cq) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.s.h.t dV() {
        return new com.google.android.apps.search.assistant.verticals.ambient.s.h.t((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (Executor) this.f.v.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.s.h.ag dW() {
        return new com.google.android.apps.search.assistant.verticals.ambient.s.h.ag((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.c dX() {
        ag agVar = (ag) this.f.bo.a();
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.c(agVar, joVar.ga(), (Context) joVar.f.a(), (com.google.common.v.f) this.f.ez.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.f dY() {
        ag agVar = (ag) this.f.Q.a();
        ZoneId zoneId = (ZoneId) this.f.b.bz.a();
        ao d = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45401068").d();
        ao d2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45408835").d();
        ao d3 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45408836").d();
        ao d4 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45401069").d();
        boolean aw = h.a.a.f.a.a.x.aw(this.f.V);
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45423841").f();
        boolean f2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45427217").f();
        boolean f3 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45461596").f();
        boolean f4 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45426828").f();
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.f(agVar, zoneId, d, d2, d3, d4, aw, f, f2, f3, f4, joVar.fZ(), (com.google.common.v.f) joVar.ez.a(), (Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.smartspace.o.f dZ() {
        ag agVar = (ag) this.f.bo.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.s.h.af ga = joVar.ga();
        Context context = (Context) joVar.f.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.o.f(agVar, ga, context, fVar, joVar2.fZ(), ((com.google.apps.tiktok.experiments.e) joVar2.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45651807").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.d.d da() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.bots.d.d(((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622905").e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.data.attachments.bz db() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.data.attachments.bz(Optional.of((com.google.common.v.f) this.f.ez.a()), (Context) this.f.f.a(), (n) this.f.R.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.input.f.c) this.f.f319a.cq.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.h.p dc() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.h.p(((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45618568").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45618567").f());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.y dd() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.y((com.google.android.apps.search.assistant.surfaces.voice.shared.c.a) this.aS.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.service.a$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d de() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.b.d) this.gF.f308a.ah.a();
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.aa df() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.aa((cg) this.iT.a(), (Executor) this.f.H.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639904").b(), (com.google.android.libraries.g.a) this.f.g.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.l.b dg() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.l.b((com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a) this.bu.a(), (ag) this.f.Q.a());
    }

    public final bb dh() {
        return new bb(h.a.a.d.b.a.y.u(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642046").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45656146").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640441").f(), ch(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45634131").d(), cD(), (com.google.common.v.f) this.f.ez.a());
    }

    final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.a.h di() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.settings.voiceselection.a.h((com.google.android.apps.search.assistant.surfaces.voice.robin.y.au) this.bA.a(), (com.google.apps.tiktok.cache.o) this.bF.a(), bl(), (com.google.common.v.f) this.f.ez.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.service.p$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.service.i dj() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.service.i) this.gF.f308a.cd.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ap.a dk() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ap.a((Context) this.f.f.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.ap.e dl() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.ap.e((Context) this.f.f.a(), (PackageManager) this.f.h.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.a.d dm() {
        return new com.google.android.apps.search.assistant.verticals.ambient.a.d((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (cq) this.f.H.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.a.a.g dn() {
        return new com.google.android.apps.search.assistant.verticals.ambient.a.a.g(dS(), (cq) this.f.H.a(), (com.google.common.v.f) this.f.ez.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45352361").b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: do, reason: not valid java name */
    public final com.google.android.apps.search.assistant.verticals.ambient.a.b.j m111do() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.apps.search.assistant.verticals.ambient.b.a.j jVar = new com.google.android.apps.search.assistant.verticals.ambient.b.a.j((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (cg) this.hP.a(), new op(new com.google.android.apps.search.assistant.verticals.ambient.c.d((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), fu.o(37, new com.google.android.apps.search.assistant.verticals.ambient.c.a.b(du(), (cq) this.f.H.a()), 18, new com.google.android.apps.search.assistant.verticals.ambient.c.d.b(ds(), (cq) this.f.v.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a()), 17, du()), ds(), dt(), (cq) this.f.H.a(), dP())), dw(), (ExecutorService) this.f.H.a());
        com.google.android.apps.search.assistant.verticals.ambient.a.a.g dn = dn();
        ExecutorService executorService = (ExecutorService) this.f.H.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context = (Context) this.f.f.a();
        com.google.android.apps.search.assistant.verticals.ambient.u.o.a eh = eh();
        Context context2 = (Context) this.f.f.a();
        com.google.android.gms.wallet.h hVar = new com.google.android.gms.wallet.h();
        hVar.a(1);
        return new com.google.android.apps.search.assistant.verticals.ambient.a.b.j(aVar, jVar, dn, executorService, ha.u(new com.google.android.apps.search.assistant.verticals.ambient.u.f.g(aVar2, context, eh, new com.google.android.apps.search.assistant.verticals.ambient.u.f.a.a(new com.google.android.gms.wallet.e(context2, new com.google.android.gms.wallet.i(hVar))), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351184").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 12").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 13").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 14").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350427").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350814").e(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350927").b(), this.f.fX(), dW(), (cr) this.f.H.a()), new com.google.android.apps.search.assistant.verticals.ambient.u.a.d((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (Context) this.f.f.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45376167").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45398904").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45413378").f(), Long.valueOf(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45377514").b()), (com.google.common.v.f) this.f.ez.a(), this.f.fZ()), new com.google.android.apps.search.assistant.verticals.ambient.u.n.c((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), eh(), (Context) this.f.f.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45353426").f()), new com.google.android.apps.search.assistant.verticals.ambient.u.u.g((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), H(), eh(), (cq) this.f.H.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350855").f())), new com.google.android.apps.search.assistant.verticals.ambient.u.b.h((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), dn(), (ExecutorService) this.f.H.a(), new com.google.android.apps.search.assistant.verticals.ambient.u.j.t((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.verticals.ambient.u.j.j((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.gms.pay.a.h) this.hQ.a(), (Context) this.f.f.a(), (cr) this.f.H.a(), e$.ExternalSyntheticApiModelOutline0.m(this.hR.a()), Optional.empty()), (cq) this.f.H.a(), (cq) this.f.v.a(), (Context) this.f.f.a(), ei(), eh(), dR(), dW(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351183").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351297").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350552").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350500").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45352457").b(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 15").e()), new z((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.verticals.ambient.u.p.r((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ha.s(new com.google.android.apps.search.assistant.verticals.ambient.u.p.k((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ej(), new com.google.android.apps.search.assistant.verticals.ambient.u.p.m((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (Context) this.f.f.a(), (androidx.slice.j) this.f.b.G.a(), (com.google.android.apps.search.assistant.verticals.ambient.trigger.h.a) this.hL.a()), h.a.a.f.b.a.i.g(this.l), (cq) this.f.H.a(), (cq) this.f.v.a(), (Context) this.f.f.a(), (com.google.android.gms.search.queries.d) this.hU.a()), new com.google.android.apps.search.assistant.verticals.ambient.u.p.o((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), H(), ej(), (cq) this.f.H.a())), (cq) this.f.H.a(), (com.google.common.v.f) this.f.ez.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45350010").b()), (cq) this.f.H.a(), eh(), (Context) this.f.f.a(), ei(), dR(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351182").f(), (com.google.android.apps.search.assistant.verticals.ambient.trigger.h.a) this.hL.a()), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45354033").f()), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45370910").f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.a.c.s dp() {
        return new com.google.android.apps.search.assistant.verticals.ambient.a.c.s((ag) this.f.bo.a(), new op(eg()), dt(), (com.google.android.apps.search.assistant.verticals.ambient.a.c.h) this.f.b.bK.a(), dL(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), (Executor) this.f.H.a(), (cg) this.f.b.bO.a(), ((Boolean) this.f.b.bP.a()).booleanValue(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.search.t.a.a) this.f.iH.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.a.d.q dq() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        l H = H();
        ik ikVar = ((jd) ((lt) this.jr.a()).a).b;
        com.google.android.apps.search.assistant.verticals.ambient.a.f.a aVar2 = new com.google.android.apps.search.assistant.verticals.ambient.a.f.a((com.google.android.libraries.assistant.pcp.b) ikVar.cm.a(), com.google.g.q.b.d.P);
        com.google.android.apps.search.assistant.verticals.ambient.c.c.f dt = dt();
        cq cqVar = (cq) this.f.H.a();
        Set rV = rV();
        Set rW = rW();
        op opVar = new op(new com.google.android.apps.search.assistant.verticals.ambient.u.e.a((com.google.common.v.f) this.f.ez.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a()));
        jo joVar = this.f;
        jo joVar2 = joVar.b.f322a;
        boolean qH = joVar.f319a.qH();
        com.google.protos.l.a.b d = ((com.google.apps.tiktok.experiments.e) joVar2.V.a()).a("com.google.android.apps.search.assistant.device 45428325").d();
        com.google.protos.l.a.b d2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45429201").d();
        p pVar = (p) this.P.a();
        com.google.android.apps.search.assistant.verticals.ambient.settings.i dP = dP();
        jo joVar3 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar3.fZ();
        com.google.android.apps.search.assistant.verticals.ambient.s.h.f fVar = new com.google.android.apps.search.assistant.verticals.ambient.s.h.f(joVar3.fX(), (ag) joVar3.Q.a());
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.h hVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.h(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45370275").d());
        h hVar2 = this.aK;
        com.google.android.apps.search.assistant.verticals.ambient.s.h.n dU = dU();
        com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v vVar = (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) hVar2.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a();
        com.google.common.v.f fVar2 = (com.google.common.v.f) this.f.ez.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar3 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        e.a b = c.b(this.f.gK);
        ag agVar = (ag) this.f.bo.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45390995").f();
        this.f.b.A();
        com.google.android.apps.search.assistant.verticals.ambient.settings.i dP2 = dP();
        com.google.android.libraries.search.assistant.b.a aVar4 = (com.google.android.libraries.search.assistant.b.a) this.f.f319a.bK.a();
        com.google.common.v.f fVar3 = (com.google.common.v.f) this.f.ez.a();
        ao d3 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45383411").d();
        jo joVar4 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.a.d.q(aVar, H, aVar2, dt, cqVar, rV, rW, opVar, qH, d, d2, pVar, dP, fZ, fVar, hVar, dU, vVar, rVar, fVar2, new op(new com.google.android.apps.search.assistant.verticals.ambient.u.v.ae(aVar3, b, agVar, f, dP2, aVar4, fVar3, d3, joVar4.f319a.cw(), ((com.google.apps.tiktok.experiments.e) joVar4.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45390218").d())), dm(), (Context) this.f.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.a.e.n dr() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        l H = H();
        com.google.android.libraries.assistant.pcp.b bVar = (com.google.android.libraries.assistant.pcp.b) this.cm.a();
        cq cqVar = (cq) this.f.H.a();
        Set rV = rV();
        Set rW = rW();
        boolean am = h.a.a.f.a.a.x.am(this.f.V);
        jo joVar = this.f;
        boolean qI = joVar.f319a.qI();
        boolean at = h.a.a.f.a.a.x.at(joVar.V);
        com.google.protos.l.a.b d = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416163").d();
        com.google.protos.l.a.b d2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45416164").d();
        com.google.protos.l.a.b d3 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45430625").d();
        com.google.protos.l.a.b d4 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45430626").d();
        jo joVar2 = this.f;
        jr jrVar = joVar2.b;
        jo joVar3 = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.settings.i dP = dP();
        com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar2.fZ();
        Context context = (Context) joVar3.f.a();
        com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) jrVar.f322a.ne.a();
        cq cqVar2 = (cq) jrVar.f322a.n.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar.f322a.nN.a();
        jo joVar4 = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.b.a W = jrVar.W();
        com.google.apps.tiktok.media.j jVar2 = (com.google.apps.tiktok.media.j) joVar4.ne.a();
        cq cqVar3 = (cq) jrVar.f322a.n.a();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) jrVar.f322a.g.a();
        jo joVar5 = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.b.a W2 = jrVar.W();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar3 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar5.nM.a();
        jo joVar6 = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.z zVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.z(context, jVar, cqVar2, rVar, W, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.o(jVar2, cqVar3, aVar2, W2, aVar3, joVar6.ga(), (cg) joVar6.f319a.ct.a(), (com.google.common.v.f) jrVar.f322a.ez.a()), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar.f322a.nM.a(), h.a.a.f.a.a.x.at(jrVar.f322a.V));
        jr jrVar2 = this.f.b;
        Context context2 = (Context) jrVar2.f322a.f.a();
        jo joVar7 = jrVar2.f322a;
        return new com.google.android.apps.search.assistant.verticals.ambient.a.e.n(aVar, H, bVar, cqVar, rV, rW, am, qI, at, d, d2, d3, d4, dP, fZ, zVar, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.m.a.h(context2, joVar7.f319a.cs(), (com.google.apps.tiktok.media.j) joVar7.ne.a(), (ExecutorService) jrVar2.f322a.H.a(), (cq) jrVar2.f322a.n.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar2.f322a.nN.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar2.f322a.nM.a(), ((com.google.apps.tiktok.experiments.e) jrVar2.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45428291").f()), dm(), new com.google.android.apps.search.assistant.verticals.ambient.s.h.u((com.google.common.v.f) this.f.ez.a()), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) this.aK.a(), dn(), (com.google.android.libraries.search.t.a.a) this.f.iH.a(), (p) this.P.a(), (com.google.common.v.f) this.f.ez.a(), dU(), (Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.c.b.k ds() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.apps.search.assistant.verticals.ambient.s.h.o fX = this.f.fX();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351293").f();
        com.google.g.c.ay ayVar = com.google.g.c.ay.s;
        ayVar.getClass();
        com.google.g.c.ay ayVar2 = com.google.g.c.ay.r;
        ayVar2.getClass();
        return new com.google.android.apps.search.assistant.verticals.ambient.c.b.k(aVar, fVar, fX, new com.google.android.apps.search.assistant.verticals.ambient.c.b.a(f, fu.n(35, ayVar, 34, ayVar2)), (cq) this.f.H.a(), (cq) this.f.v.a(), (Context) this.f.f.a(), this.f.fZ());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.c.c.f dt() {
        return new com.google.android.apps.search.assistant.verticals.ambient.c.c.f((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (Context) this.f.f.a(), (cr) this.f.v.a(), dD(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), (com.google.android.apps.search.assistant.libraries.a.c) this.f.oJ.a(), (com.google.android.apps.search.assistant.platform.g.g.b.c) this.aj.a(), h.a.a.f.a.a.x.aB(this.f.V));
    }

    final com.google.android.apps.search.assistant.verticals.ambient.c.e.b du() {
        return new com.google.android.apps.search.assistant.verticals.ambient.c.e.b((Context) this.f.f.a(), ds(), (cq) this.f.H.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.e.e dv() {
        return new com.google.android.apps.search.assistant.verticals.ambient.e.e((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.br.f.e.a.a.h) this.f.kF.a(), (ag) this.f.Q.a(), (n) this.f.P.a());
    }

    public final com.google.android.apps.search.assistant.verticals.ambient.feedback.a.c dw() {
        return new com.google.android.apps.search.assistant.verticals.ambient.feedback.a.c((com.google.android.libraries.g.a) this.f.g.a(), this.f.b.hJ());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.i.d.p dx() {
        return new com.google.android.apps.search.assistant.verticals.ambient.i.d.p((com.google.android.libraries.search.udcdataservice.k) this.Q.a(), ag(), (ExecutorService) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.j.i dy() {
        Context context = (Context) this.f.f.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.j.k kVar = new com.google.android.apps.search.assistant.verticals.ambient.j.k(context, joVar.f319a.qM(), ((com.google.apps.tiktok.experiments.e) joVar.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45380421").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45387569").f(), (com.google.common.v.f) this.f.ez.a(), (ZoneId) this.f.b.bz.a(), iB());
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.j.i(kVar, joVar2.f319a.cq(), (com.google.common.v.f) joVar2.ez.a(), gm(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45384154").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45379205").f(), (ZoneId) this.f.b.bz.a(), (com.google.android.libraries.search.t.a.a) this.J.a(), (ScheduledExecutorService) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.l.b dz() {
        jo joVar = this.f.b.f322a;
        h hVar = this.hm;
        e.a b = c.b(this.hl);
        e.a b2 = c.b(hVar);
        if (true != ((com.google.apps.tiktok.experiments.e) joVar.V.a()).a("com.google.android.apps.search.assistant.device 45351422").f()) {
            b = b2;
        }
        com.google.android.apps.search.assistant.verticals.ambient.l.b bVar = (com.google.android.apps.search.assistant.verticals.ambient.l.b) b.a();
        bVar.getClass();
        return bVar;
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.z.a.i$a
    public final com.google.android.apps.search.assistant.platform.g.n.n e() {
        return aj();
    }

    final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.b eA() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.b((com.google.android.libraries.search.t.i.y) this.f.W.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.d
    public final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c eB() {
        return (com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c) this.gF.f308a.cl.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.j eC() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.j(new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.e((com.google.android.libraries.assistant.pcp.b) this.cm.a(), (com.google.android.libraries.search.location.compliance.r) this.N.a(), ew(), (Context) this.f.f.a(), (ConnectivityManager) this.f.wN.a(), (Executor) this.f.H.a()), this.f.b.it().a(), (Executor) this.f.H.a(), gU());
    }

    @Override // com.google.android.apps.search.googleapp.bubbles.a.l$a
    public final com.google.android.apps.search.googleapp.bubbles.a.k eD() {
        return this.gF.f308a.bu();
    }

    @Override // com.google.android.apps.search.googleapp.bubbles.a.o
    public final com.google.android.apps.search.googleapp.bubbles.a.k eE() {
        return this.gF.f308a.bu();
    }

    @Override // com.google.android.apps.search.googleapp.bubbles.a.s
    public final com.google.android.apps.search.googleapp.bubbles.a.r eF() {
        return this.gF.f308a.bv();
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.buttons.share.j
    public final com.google.android.apps.search.googleapp.customtabs.features.buttons.share.i eG() {
        return new com.google.android.apps.search.googleapp.customtabs.features.buttons.share.i((com.google.android.libraries.search.b.b) this.gF.f308a.aJ.a());
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.i
    public final com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.h eH() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.h((Executor) jjVar.f316a.H.a(), jjVar.bA());
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.partialcct.e$a, com.google.android.apps.search.googleapp.customtabs.intent.trampoline.a$a
    public final com.google.android.apps.search.googleapp.customtabs.f.b eI() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.customtabs.f.b((com.google.android.apps.search.googleapp.urlhandler.b.a) jjVar.cJ.a(), jjVar.sQ().aB());
    }

    @Override // com.google.android.apps.search.googleapp.discover.r.b.c
    public final com.google.android.apps.search.googleapp.discover.r.b.b eJ() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.discover.r.b.b((com.google.android.apps.search.googleapp.discover.r.c.h) jjVar.du.a(), (ag) jjVar.f316a.Q.a(), jjVar.md(), jjVar.f316a.b.jn().y(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.jn().a.a()).a("com.google.android.libraries.search.googleapp.device 45374716").d(), (com.google.android.apps.search.googleapp.discover.r.a.b) jjVar.dt.a());
    }

    @Override // com.google.android.apps.search.googleapp.discover.expeditions.features.media.service.b$a
    public final com.google.android.apps.search.googleapp.discover.x.o eK() {
        return this.gF.f308a.bT();
    }

    @Override // com.google.android.apps.search.googleapp.discover.expeditions.features.media.service.b$a
    public final com.google.android.apps.search.googleapp.discover.x.ab eL() {
        return (com.google.android.apps.search.googleapp.discover.x.ab) this.gF.f308a.dp.a();
    }

    @Override // com.google.android.apps.search.googleapp.discover.ae.aq
    public final com.google.android.apps.search.googleapp.discover.ae.ap eM() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.discover.ae.ap((com.google.android.apps.search.googleapp.discover.ad.af) jjVar.dZ.a(), (com.google.android.apps.search.googleapp.discover.z.m) jjVar.dD.a(), (ay) jjVar.f316a.iu.a(), (com.google.common.v.f) jjVar.f316a.ez.a(), (ConnectivityManager) jjVar.f316a.wN.a(), (com.google.android.apps.search.googleapp.x.d.b) jjVar.f316a.b.em.a(), jjVar.bE(), jjVar.bD(), (com.google.android.apps.search.googleapp.discover.ae.x) jjVar.dE.a(), (com.google.android.apps.search.googleapp.discover.x.cg) jjVar.dI.a(), jjVar.ci(), new com.google.android.apps.search.googleapp.discover.e.t((com.google.android.libraries.search.b.b) jjVar.aJ.a(), (byte[]) null), (ag) jjVar.f316a.Q.a(), (Executor) jjVar.f316a.H.a(), (n) jjVar.f316a.P.a(), ((com.google.apps.tiktok.experiments.e) jjVar.sF().a.a()).a("com.google.android.libraries.search.googleapp.user 45364713").f(), ((com.google.apps.tiktok.experiments.e) jjVar.sF().a.a()).a("com.google.android.libraries.search.googleapp.user 45364714").b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.googleapp.t.ad eN() {
        return new com.google.android.apps.search.googleapp.t.ad((com.google.android.libraries.g.a) this.f.g.a(), new com.google.android.apps.search.googleapp.t.ag((ag) this.f.Q.a(), (com.google.common.v.f) this.f.ez.a()), (cq) this.f.v.a(), (Executor) this.f.H.a(), this.G, (cg) this.H.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45365683").d(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45647156").d());
    }

    @Override // com.google.android.apps.search.googleapp.discover.expeditions.features.media.service.b$a
    public final com.google.android.apps.search.googleapp.y.a.b eO() {
        return this.gF.f308a.cr();
    }

    @Override // com.google.android.apps.search.googleapp.notifications.s
    public final com.google.android.apps.search.googleapp.notifications.l eP() {
        jj jjVar = this.gF.f308a;
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) jjVar.f316a.g.a();
        com.google.android.apps.search.googleapp.notifications.e eVar = new com.google.android.apps.search.googleapp.notifications.e((com.google.android.libraries.search.location.y) jjVar.b.O.a(), (Executor) jjVar.f316a.H.a());
        Context context = (Context) jjVar.f316a.f.a();
        com.google.android.apps.search.googleapp.discover.t.j jVar = (com.google.android.apps.search.googleapp.discover.t.j) jjVar.dV.a();
        ik ikVar = jjVar.b;
        com.google.android.apps.search.googleapp.notifications.b.b.ac cI = jjVar.f316a.f319a.cI();
        AccountId accountId = (AccountId) ikVar.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a();
        com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a();
        jo joVar = jjVar.f316a;
        return new com.google.android.apps.search.googleapp.notifications.l(aVar, eVar, context, jVar, cI, accountId, dVar, yVar, joVar.f319a.cK(), (Executor) joVar.H.a(), jjVar.bx(), (com.google.android.libraries.notifications.j.d) jjVar.f316a.f319a.aU.a(), ((com.google.apps.tiktok.experiments.e) jjVar.sn().a.a()).a("com.google.android.libraries.search.googleapp.user 45651515").f(), (cr) jjVar.f316a.v.a());
    }

    @Override // com.google.android.apps.search.googleapp.notifications.p
    public final com.google.android.apps.search.googleapp.notifications.w eQ() {
        fq i = fu.i(6);
        com.google.bz.f.b.a.f fVar = com.google.bz.f.b.a.f.a;
        jj jjVar = this.gF.f308a;
        i.i(fVar, new com.google.android.apps.search.googleapp.notifications.a.b((Context) jjVar.f316a.f.a(), jjVar.f316a.b.jg().k(), (com.google.android.libraries.search.b.b) jjVar.aJ.a(), jjVar.cv()));
        i.i(com.google.bz.f.b.a.f.b, new com.google.android.apps.search.googleapp.notifications.a.d());
        i.i(com.google.bz.f.b.a.f.c, new com.google.android.apps.search.googleapp.notifications.a.d());
        i.i(com.google.bz.f.b.a.f.d, new com.google.android.apps.search.googleapp.notifications.a.d());
        i.i(com.google.bz.f.b.a.f.e, new com.google.android.apps.search.googleapp.notifications.a.d());
        i.i(com.google.bz.f.b.a.f.f, new com.google.android.apps.search.googleapp.notifications.a.c((com.google.android.libraries.search.b.b) jjVar.aJ.a(), jjVar.bC()));
        com.google.android.apps.search.googleapp.notifications.a aVar = new com.google.android.apps.search.googleapp.notifications.a(i.h(true));
        h hVar = jjVar.aF;
        com.google.android.apps.search.googleapp.notifications.b.a.d dVar = new com.google.android.apps.search.googleapp.notifications.b.a.d(jjVar.aD, jjVar.f316a.b.fh(), (com.google.android.apps.search.googleapp.d.f) hVar.a(), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a(), (com.google.android.libraries.search.trust.c.t) jjVar.f316a.wH.a());
        h hVar2 = jjVar.b.Y;
        com.google.android.apps.search.googleapp.notifications.b.a.f ct = jjVar.ct();
        com.google.android.apps.search.googleapp.notifications.b.b.p cu = jjVar.cu();
        com.google.android.apps.search.googleapp.notifications.d.e cx = jjVar.cx();
        com.google.android.libraries.search.integrations.c.a.c cVar = (com.google.android.libraries.search.integrations.c.a.c) hVar2.a();
        jo joVar = jjVar.f316a;
        com.google.android.apps.search.googleapp.y.a.b cr = jjVar.cr();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) joVar.g.a();
        jo joVar2 = jjVar.f316a;
        jr jrVar = joVar2.b;
        com.google.android.apps.search.googleapp.notifications.e.c cVar2 = new com.google.android.apps.search.googleapp.notifications.e.c(new com.google.android.apps.search.googleapp.notifications.e.g(new com.google.android.apps.search.googleapp.notifications.b.h(dVar, ct, cu, cx, cVar, cr, aVar2, jrVar.p(), jrVar.bd(), jrVar.ge(), jrVar.fj(), (ag) joVar2.Q.a(), (cr) jjVar.f316a.H.a(), (String) jjVar.f316a.Y.a(), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a()), (com.google.android.libraries.g.a) jjVar.f316a.g.a(), jjVar.cr(), (n) jjVar.f316a.P.a(), (ag) jjVar.f316a.Q.a()), jjVar.f316a.f319a.cI(), (AccountId) jjVar.b.g.a(), (com.google.android.libraries.g.a) jjVar.f316a.g.a(), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a());
        com.google.android.apps.search.googleapp.notifications.e.j jVar = new com.google.android.apps.search.googleapp.notifications.e.j((com.google.android.libraries.logging.ve.j) jjVar.f316a.qm.a(), (com.google.android.libraries.logging.ve.synthetic.f) jjVar.f316a.f319a.du.a(), (com.google.android.libraries.search.t.l.k) jjVar.f316a.qr.a(), (AccountId) jjVar.b.g.a());
        com.google.android.libraries.notifications.j.d dVar2 = (com.google.android.libraries.notifications.j.d) jjVar.f316a.f319a.aU.a();
        jo joVar3 = jjVar.f316a;
        return new com.google.android.apps.search.googleapp.notifications.w(aVar, cVar2, jVar, dVar2, joVar3.f319a.cK(), (cq) joVar3.v.a());
    }

    @Override // com.google.android.apps.search.googleapp.notifications.accountsettings.g.a, com.google.android.apps.search.googleapp.notifications.accountsettings.ab$a
    public final com.google.android.apps.search.googleapp.notifications.accountsettings.x eR() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        com.google.android.libraries.search.integrations.c.a.c cVar = (com.google.android.libraries.search.integrations.c.a.c) jjVar.b.Y.a();
        jr jrVar = jjVar.f316a.b;
        com.google.android.apps.search.googleapp.notifications.accountsettings.d cs = jjVar.cs();
        com.google.android.apps.search.googleapp.y.a.b cr = jjVar.cr();
        com.google.aw.k.d.d.a.g I = new com.google.aw.k.d.d.a.g(com.google.apps.tiktok.p.y.b(jjVar.b.V, (com.google.apps.tiktok.p.m) jrVar.eH.a(), (com.google.frameworks.client.data.android.d) jjVar.f316a.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) jjVar.f316a.mh.a()});
        I.getClass();
        n nVar = (n) jjVar.f316a.R.a();
        com.google.apps.tiktok.p.b.c cVar2 = (com.google.apps.tiktok.p.b.c) jjVar.b.X.a();
        com.google.android.libraries.search.location.y yVar = (com.google.android.libraries.search.location.y) jjVar.b.O.a();
        com.google.android.libraries.search.t.i.y yVar2 = (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a();
        jo joVar = jjVar.f316a;
        return new com.google.android.apps.search.googleapp.notifications.accountsettings.x(context, cVar, cs, cr, I, nVar, cVar2, yVar, yVar2, joVar.f319a.cK(), joVar.b.q(), jjVar.sn().F(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.f319a.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45644013").f(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.f319a.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45646558").f(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.f319a.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45645036").d());
    }

    @Override // com.google.android.apps.search.googleapp.notifications.accountsettings.g.a, com.google.android.apps.search.googleapp.notifications.accountsettings.ab$a, com.google.android.apps.search.googleapp.notifications.accountsettings.ae.a
    public final com.google.android.apps.search.googleapp.notifications.accountsettings.ak eS() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        Context context2 = (Context) jjVar.f316a.b.f322a.f.a();
        context2.getClass();
        Context a2 = com.google.android.libraries.search.x.d.a.a(context2, com.google.android.libraries.search.x.b.b.TAG_GOOGLE_APP_NOTIFICATIONS);
        int i = com.google.android.gms.location.r.f2688a;
        com.google.android.gms.location.internal.s sVar = new com.google.android.gms.location.internal.s(a2);
        jy jyVar = jjVar.f316a.b.f322a.f319a;
        com.google.android.apps.search.googleapp.notifications.accountsettings.d cs = jjVar.cs();
        boolean f = ((com.google.apps.tiktok.experiments.e) jyVar.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45409763").f();
        jr jrVar = jjVar.f316a.b;
        return new com.google.android.apps.search.googleapp.notifications.accountsettings.ak(context, sVar, cs, f, jrVar.q(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.f319a.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45409767").d(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.f319a.sz().a.a()).a("com.google.android.libraries.search.googleapp.device 45409766").b(), (com.google.android.libraries.search.location.y) jjVar.b.O.a());
    }

    @Override // com.google.android.apps.search.googleapp.notifications.b.b.aa
    public final com.google.android.apps.search.googleapp.notifications.b.b.z eT() {
        return (com.google.android.apps.search.googleapp.notifications.b.b.z) this.gF.f308a.eb.a();
    }

    @Override // com.google.android.apps.search.googleapp.notifications.settings.a.a$a, com.google.android.apps.search.googleapp.notifications.settings.receiver.b$a
    public final com.google.android.apps.search.googleapp.notifications.settings.a.j eU() {
        return this.gF.f308a.cy();
    }

    @Override // com.google.android.apps.search.googleapp.notifications.h.f$a
    public final com.google.android.apps.search.googleapp.notifications.h.e eV() {
        return (com.google.android.apps.search.googleapp.notifications.h.e) this.gF.f308a.ed.a();
    }

    @Override // com.google.android.apps.search.googleapp.notifications.webuisettings.c$a
    public final com.google.android.apps.search.googleapp.notifications.webuisettings.g eW() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.notifications.webuisettings.g(jjVar.bB(), (Context) jjVar.f316a.f.a(), (com.google.android.libraries.search.integrations.c.a.c) jjVar.b.Y.a());
    }

    @Override // com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.m
    public final com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.l eX() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.search.suggest.plugins.c.b.l((ag) jjVar.f316a.Q.a(), (AccountId) jjVar.b.g.a(), (com.google.apps.tiktok.contrib.work.a) jjVar.f316a.b.dH.a());
    }

    @Override // com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.a$a
    public final com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e eY() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        int i = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j.a;
        return new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e(context, (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.i) jjVar.ee.a(), (com.google.android.libraries.g.a) jjVar.f316a.g.a());
    }

    @Override // com.google.android.apps.search.googleapp.search.suggest.plugins.e.c
    public final com.google.android.apps.search.googleapp.search.suggest.plugins.e.b eZ() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.googleapp.search.suggest.plugins.e.b((ag) jjVar.f316a.Q.a(), (AccountId) jjVar.b.g.a(), (com.google.apps.tiktok.contrib.work.a) jjVar.f316a.b.dH.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.e ea() {
        Context context = (Context) this.f.f.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a();
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.e(context, aVar, fVar, rVar, joVar.gb(), joVar.ga(), (cq) joVar.v.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382430").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382431").b(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382435").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382434").a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382432").f(), this.f.b.aZ());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.j eb() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        boolean ao = h.a.a.f.a.a.x.ao(this.f.V);
        boolean ax = h.a.a.f.a.a.x.ax(this.f.V);
        jr jrVar = this.f.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.j(aVar, rVar, fVar, ao, ax, jrVar.hA(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381519").e(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381520").e(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45398634").e(), h.a.a.f.a.a.x.ae(this.f.V), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45398640").a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45398636").a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381521").b(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381522").b(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381605").b());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.c.g ec() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.a aVar2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.a(joVar.ga(), (com.google.android.libraries.g.a) joVar.g.a());
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.c.g(aVar, aVar2, joVar2.fZ(), (cq) joVar2.H.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.k.e ed() {
        return new com.google.android.apps.search.assistant.verticals.ambient.u.k.e((Context) this.f.f.a(), (Executor) this.f.v.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.apps.tiktok.media.j) this.f.ne.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f.b.f322a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45364935").d(), ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f.b.f322a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45365226").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45390718").d(), h.a.a.f.a.a.x.au(this.f.V));
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.k.t ee() {
        Executor executor = (Executor) this.f.v.a();
        com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) this.f.ne.a();
        h hVar = this.hH;
        com.google.android.apps.search.assistant.verticals.ambient.u.k.e ed = ed();
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e eVar = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e) hVar.a();
        jo joVar = this.f;
        h hVar2 = this.hH;
        h hVar3 = this.hG;
        h hVar4 = joVar.nM;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak akVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak(hVar2, hVar3, hVar4);
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.h hVar5 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.h(joVar.f, hVar3, hVar2, hVar4);
        com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.c cVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.c((com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e) hVar2.a(), (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p) this.hG.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
        com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) this.f.W.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        long b = ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(this.f.b.f322a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45364944").b();
        jr jrVar = this.f.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.k.t(executor, jVar, ed, eVar, akVar, hVar5, cVar, yVar, aVar, b, jrVar.D, jrVar.E);
    }

    public final com.google.android.apps.search.assistant.verticals.ambient.u.k.w ef() {
        cg cgVar = (cg) this.f.b.bG.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.libraries.search.t.a.a aVar2 = (com.google.android.libraries.search.t.a.a) this.f.iH.a();
        jr jrVar = this.f.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.k.w(cgVar, aVar, fVar, aVar2, jrVar.bH, jrVar.bI, jrVar.bJ);
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.k.ad eg() {
        Context context = (Context) this.f.f.a();
        ag agVar = (ag) this.f.Q.a();
        n nVar = (n) this.f.P.a();
        n nVar2 = (n) this.f.R.a();
        h hVar = this.f.b.bK;
        l H = H();
        com.google.android.apps.search.assistant.verticals.ambient.u.k.w ef = ef();
        com.google.android.apps.search.assistant.verticals.ambient.a.c.h hVar2 = (com.google.android.apps.search.assistant.verticals.ambient.a.c.h) hVar.a();
        com.google.android.apps.search.assistant.verticals.ambient.u.k.aj ajVar = new com.google.android.apps.search.assistant.verticals.ambient.u.k.aj(ed(), (ag) this.f.bo.a(), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), this.f.b.bL);
        bh bhVar = new bh((com.google.android.libraries.search.t.i.y) this.f.W.a());
        PackageManager packageManager = (PackageManager) this.f.h.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        jo joVar = this.f;
        jr jrVar = joVar.b;
        h hVar3 = joVar.op;
        h hVar4 = jrVar.F;
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar.nN.a();
        jo joVar2 = this.f;
        com.google.common.v.f fVar = (com.google.common.v.f) joVar2.ez.a();
        return new com.google.android.apps.search.assistant.verticals.ambient.u.k.ad(context, agVar, nVar, nVar2, H, ef, hVar2, ajVar, bhVar, packageManager, aVar, hVar3, hVar4, jrVar.bM, rVar, joVar2.b.bN, fVar);
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.o.a eh() {
        return new com.google.android.apps.search.assistant.verticals.ambient.u.o.a((com.google.common.v.f) this.f.ez.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.o.e ei() {
        return new com.google.android.apps.search.assistant.verticals.ambient.u.o.e((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.p.a.d ej() {
        return new com.google.android.apps.search.assistant.verticals.ambient.u.p.a.d((Context) this.f.f.a());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.u.t.h ek() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context = (Context) this.f.f.a();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f.g.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.o.c cVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.o.c(context, aVar2, joVar.fZ(), joVar.ga(), (cq) joVar.v.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45412656").f());
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.t.h(aVar, cVar, joVar2.fZ(), (cq) joVar2.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.trigger.b.c el() {
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.b.c(joVar.nM, joVar.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.trigger.c.h em() {
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.c.h(gm(), (ScheduledExecutorService) this.f.H.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45369416").f());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.trigger.d.b en() {
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.d.b(dy(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (ScheduledExecutorService) this.f.H.a(), (com.google.android.libraries.search.t.a.a) this.J.a(), this.f.fZ());
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.trigger.location.i
    public final com.google.android.apps.search.assistant.verticals.ambient.trigger.location.r eo() {
        jj jjVar = this.gF.f308a;
        AccountId accountId = (AccountId) jjVar.b.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a();
        jo joVar = jjVar.f316a;
        com.google.android.apps.search.assistant.verticals.ambient.trigger.location.j gh = joVar.gh();
        ExecutorService executorService = (ExecutorService) joVar.H.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) jjVar.f316a.g.a();
        cg cgVar = (cg) jjVar.f316a.uv.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) jjVar.f316a.nM.a();
        ik ikVar = jjVar.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.location.r(accountId, dVar, gh, executorService, aVar, cgVar, aVar2, ikVar.jm(), ikVar.dP(), ikVar.dB());
    }

    final com.google.android.apps.search.assistant.verticals.ambient.trigger.e.p ep() {
        h hVar = this.aK;
        jo joVar = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.e.p(joVar.fZ(), joVar.f319a.qI(), (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) hVar.a(), (com.google.android.libraries.search.account.b.b) this.f.gd.a(), (AccountId) this.g.a(), (ag) this.f.Q.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.j.j$a
    public final com.google.android.apps.search.assistant.verticals.a.a.a.a eq() {
        return (com.google.android.apps.search.assistant.verticals.a.a.a.a) this.dC.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.c.b.a, com.google.android.apps.search.assistant.verticals.automation.routines.g.s, com.google.android.apps.search.assistant.verticals.automation.routines.receiver.e$a
    public final com.google.android.apps.search.assistant.verticals.automation.routines.a.a.d er() {
        return this.gF.f308a.bs();
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.c.b.a, com.google.android.apps.search.assistant.verticals.automation.routines.receiver.e$a
    public final com.google.android.apps.search.assistant.verticals.automation.routines.e.n es() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.verticals.automation.routines.e.n((Context) jjVar.f316a.f.a(), c.b(jjVar.b.Y), (Executor) jjVar.f316a.v.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.familyshare.a.f$a
    public final com.google.android.apps.search.assistant.verticals.familyshare.a.c et() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.verticals.familyshare.a.c((Context) jjVar.f316a.f.a(), (com.google.apps.tiktok.account.data.b) jjVar.f316a.bN.a(), (AccountId) jjVar.b.g.a(), (com.google.android.apps.search.assistant.platform.g.g.b.c) jjVar.b.aj.a(), (Executor) jjVar.f316a.H.a(), ((com.google.apps.tiktok.experiments.e) jjVar.b.l.a()).a("com.google.android.apps.search.assistant.user 45353865").f());
    }

    @Override // com.google.android.apps.search.assistant.verticals.reminders.papinotification.g
    public final com.google.android.apps.search.assistant.verticals.reminders.papinotification.f eu() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.verticals.reminders.papinotification.f((AccountId) jjVar.b.g.a(), (Context) jjVar.f316a.f.a(), new com.google.android.apps.search.assistant.verticals.reminders.papinotification.b((com.google.android.apps.search.assistant.verticals.reminders.c.a) jjVar.cj.a(), (cq) jjVar.f316a.H.a()), (ConnectivityManager) jjVar.f316a.wN.a(), (Executor) jjVar.f316a.B.a(), (cq) jjVar.f316a.H.a(), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.h
    public final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.i ev() {
        jj jjVar = this.gF.f308a;
        jo joVar = jjVar.f316a;
        ik ikVar = jjVar.b;
        at ey = ikVar.ey();
        com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.b eA = ikVar.eA();
        cq cqVar = (cq) joVar.v.a();
        jr jrVar = jjVar.f316a.b;
        ik ikVar2 = jjVar.b;
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.i(ey, eA, cqVar, ikVar2.ez(), jrVar.hy(), ikVar2.H(), (com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c) jjVar.cl.a(), jjVar.b.eC(), jjVar.f316a.Vo());
    }

    final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.n ew() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.n(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45390564").f(), (cg) this.f.b.by.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.s
    public final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.u ex() {
        jj jjVar = this.gF.f308a;
        cq cqVar = (cq) jjVar.f316a.v.a();
        jr jrVar = jjVar.f316a.b;
        ik ikVar = jjVar.b;
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.u(cqVar, ikVar.ey(), ikVar.eA(), ikVar.ez(), jrVar.hy(), ikVar.H(), (com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.c) jjVar.cl.a(), jjVar.b.eC(), jjVar.f316a.Vo());
    }

    @Override // com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.r$a
    public final at ey() {
        com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) this.f.ne.a();
        com.google.android.libraries.search.location.y yVar = (com.google.android.libraries.search.location.y) this.O.a();
        com.google.android.apps.search.assistant.verticals.snapshot.a.a aVar = (com.google.android.apps.search.assistant.verticals.snapshot.a.a) this.kL.a();
        cq cqVar = (cq) this.f.n.a();
        cq cqVar2 = (cq) this.f.H.a();
        cg cgVar = (cg) this.f.b.by.a();
        com.google.android.libraries.g.a aVar2 = (com.google.android.libraries.g.a) this.f.g.a();
        Context context = (Context) this.f.f.a();
        Executor executor = (Executor) this.f.v.a();
        AccountId accountId = (AccountId) this.g.a();
        Optional of = Optional.of(this.f.fn());
        com.google.android.apps.search.assistant.platform.pcp.j.av be = this.f.f319a.be();
        com.google.android.apps.search.assistant.platform.pcp.b.a I = I();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jr jrVar = this.f.b;
        return new at(jVar, yVar, aVar, cqVar, cqVar2, cgVar, aVar2, new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.d.g(context, executor, accountId, of, be, I, fVar, jrVar.hu(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45360611").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45359812").f()), (AccountId) this.g.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), eA(), ez(), (ConnectivityManager) this.f.wN.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45359813").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45359814").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45360935").f(), jo(), (com.google.android.libraries.search.location.compliance.r) this.N.a(), eC(), new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ad(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45382151").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45620612").f(), this.f.Vo()), (LocationManager) this.f.b.ea.a(), ew());
    }

    final com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.aw ez() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.aw((cq) this.f.H.a(), (cg) this.f.b.by.a(), (com.google.android.libraries.g.a) this.f.g.a(), eA());
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.al.b.a
    public final com.google.android.libraries.search.assistant.appactions.d.r f() {
        return (com.google.android.libraries.search.assistant.appactions.d.r) this.be.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.common.t.a.a fA() {
        return new com.google.android.libraries.assistant.auto.tng.common.t.a.a(this.f.f319a.jA);
    }

    final com.google.android.libraries.assistant.auto.tng.f.d.a.a.l fB() {
        h hVar = this.dD;
        h hVar2 = this.dE;
        jr jrVar = this.f.b;
        com.google.android.libraries.assistant.auto.tng.common.o.a.a am = jrVar.am();
        h hVar3 = this.kA;
        h hVar4 = this.kB;
        jo joVar = this.f;
        ag agVar = (ag) joVar.Q.a();
        Context context = (Context) this.f.f.a();
        Optional empty = Optional.empty();
        com.google.android.libraries.assistant.auto.tng.f.d.a.c.a aVar = new com.google.android.libraries.assistant.auto.tng.f.d.a.c.a();
        com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) this.ax.a();
        com.google.android.libraries.assistant.auto.tng.f.d.a.c.h hVar5 = (com.google.android.libraries.assistant.auto.tng.f.d.a.c.h) this.dG.a();
        h hVar6 = this.f.b.bX;
        return new com.google.android.libraries.assistant.auto.tng.f.d.a.a.l(hVar, jrVar.bV, hVar2, am, hVar3, hVar4, joVar.b.bW, agVar, context, empty, aVar, hVar6, bVar, hVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.a.c.i fC() {
        h hVar = this.dF;
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.f.d.a.c.i(hVar, joVar.g, joVar.f, joVar.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.r fD() {
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.r(this.f.Q, this.lm, this.fz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.y fE() {
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.y(this.f.Q, this.kW, this.fz, e.c.l.a);
    }

    final com.google.android.libraries.assistant.auto.tng.f.d.c.b.t fF() {
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.b.t((Context) this.f.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.g.a.a.a.d fG() {
        return new com.google.android.libraries.assistant.auto.tng.g.a.a.a.d((Executor) this.f.H.a(), (cg) this.f.b.hr.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.g.a.a.a.f fH() {
        return new com.google.android.libraries.assistant.auto.tng.g.a.a.a.f((Executor) this.f.H.a(), fG(), rg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.h.b.b fI() {
        return new com.google.android.libraries.assistant.auto.tng.h.b.b((Executor) this.f.v.a(), (Context) this.f.f.a(), (com.google.apps.tiktok.g.p) this.aa.a());
    }

    @Override // com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.c$a
    public final com.google.android.libraries.assistant.auto.tng.j.c.c.c.e fJ() {
        return (com.google.android.libraries.assistant.auto.tng.j.c.c.c.e) this.gF.f308a.k.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.n.a.a.a.g fK() {
        return new com.google.android.libraries.assistant.auto.tng.n.a.a.a.g(fL(), (Context) this.f.f.a(), (com.google.frameworks.client.data.android.l) this.ei.a(), (Executor) this.f.H.a(), (com.google.android.libraries.search.trust.c.t) this.f.wH.a());
    }

    final com.google.android.libraries.assistant.auto.tng.n.a.a.b.c fL() {
        return new com.google.android.libraries.assistant.auto.tng.n.a.a.b.c((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (Context) this.f.f.a(), (cq) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.n.a.a.c.e fM() {
        return new com.google.android.libraries.assistant.auto.tng.n.a.a.c.e(fL(), (Context) this.f.f.a(), (com.google.frameworks.client.data.android.l) this.ei.a(), (Executor) this.f.H.a(), (com.google.android.libraries.search.trust.c.t) this.f.wH.a());
    }

    @Override // com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.b.c$a
    public final com.google.android.libraries.assistant.auto.tng.p.a.g fN() {
        return (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.projected.af$a, com.google.android.libraries.assistant.auto.jumpboost.caractivity.f$a, com.google.android.libraries.assistant.auto.jumpboost.caractivity.m$a
    public final com.google.android.libraries.assistant.auto.tng.p.a.g fO() {
        return (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.p.a.g fP() {
        return new com.google.android.libraries.assistant.auto.tng.p.b.b.a(hr(), new com.google.android.libraries.assistant.auto.tng.p.b.a.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.e
    public final com.google.android.libraries.assistant.auto.tng.p.a.g fQ() {
        return (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.p.a.m fR() {
        Map map = (Map) this.dH.a();
        Executor executor = (Executor) this.f.H.a();
        com.google.android.libraries.assistant.auto.tng.p.a.f fVar = (com.google.android.libraries.assistant.auto.tng.p.a.f) this.dI.a();
        jo joVar = this.f;
        h hVar = joVar.f319a.jR;
        return new com.google.android.libraries.assistant.auto.tng.p.a.m(map, executor, fVar, joVar.b.cc, this.kF, (com.google.android.libraries.assistant.auto.tng.p.a.b) hVar.a());
    }

    @Override // com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.e
    public final com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.f fS() {
        return (com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.f) this.gF.f308a.fh.a();
    }

    final com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.w fT() {
        cg cgVar = (cg) this.f.b.ba.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.w(cgVar, fVar, joVar.b.bb, (Executor) joVar.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.w.c.a.a.c fU() {
        jr jrVar = this.f.b;
        jrVar.aq();
        jrVar.hU();
        com.google.android.libraries.assistant.auto.tng.t.b.a.b aq = this.f.b.aq();
        com.google.android.apps.gsa.u.c.f x = x();
        Optional.empty();
        this.f.b.hU();
        return new com.google.android.libraries.assistant.auto.tng.w.c.a.a.c(aq, x, (cr) this.f.H.a());
    }

    @Override // com.google.android.libraries.assistant.auto.tng.w.e.a.a
    public final com.google.android.libraries.assistant.auto.tng.w.e.a.b fV() {
        return (com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.aI.a();
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.a.b fW() {
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.a.b(new lm(joVar, this.gF), (com.google.cj.i.f) joVar.wr.a(), (cr) this.f.H.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.b.c fX() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.b.c((com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.f) this.f.b.al.a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.b fY() {
        Executor executor = (Executor) this.f.H.a();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.b(executor, joVar.b.aA, (com.google.br.f.e.a.a.h) joVar.kF.a(), (com.google.android.libraries.assistant.auto.tng.common.a.f) this.aA.a(), (AccountId) this.g.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.e fZ() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.e((Executor) this.f.H.a(), fx(), fY(), 0);
    }

    @Override // com.google.android.apps.search.googleapp.search.suggest.sources.a.u
    public final com.google.android.apps.search.googleapp.search.suggest.sources.a.t fa() {
        return this.gF.f308a.cT();
    }

    @Override // com.google.android.apps.search.googleapp.searchwidget.y
    public final com.google.android.apps.search.googleapp.searchwidget.f.c fb() {
        return this.gF.f308a.dc();
    }

    @Override // com.google.android.apps.search.googleapp.searchwidget.y
    public final com.google.android.apps.search.googleapp.searchwidget.f.d fc() {
        return new com.google.android.apps.search.googleapp.searchwidget.f.d((com.google.android.libraries.search.t.c.ai) this.gF.f308a.b.G.a());
    }

    @Override // com.google.android.apps.search.googleapp.stampviewer.j.g$a
    public final com.google.android.apps.search.googleapp.urlhandler.d.b fd() {
        return this.gF.f308a.dd();
    }

    @Override // com.google.android.apps.search.omnient.accounttypechecking.b$a
    public final com.google.android.apps.search.omnient.b.a.k fe() {
        return (com.google.android.apps.search.omnient.b.a.k) this.gF.f308a.cW.a();
    }

    @Override // com.google.android.apps.search.omnient.host.invocation.ac
    public final com.google.android.apps.search.omnient.c.l ff() {
        return this.gF.f308a.dh();
    }

    @Override // com.google.android.apps.search.podcasts.player.receiver.d
    public final com.google.android.apps.search.podcasts.player.receiver.c fg() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.podcasts.player.receiver.c((com.google.android.apps.search.podcasts.player.impl.x) jjVar.eU.a(), jjVar.di(), (com.google.android.apps.search.podcasts.l.ae) jjVar.eL.a(), (AccountId) jjVar.b.g.a(), (com.google.android.apps.search.podcasts.l.f) jjVar.f316a.f319a.cI.a(), jjVar.f316a.f319a.oU().a());
    }

    @Override // com.google.android.apps.search.soundsearch.quicksettings.k
    public final com.google.android.apps.search.soundsearch.quicksettings.t fh() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.soundsearch.quicksettings.t((com.google.android.apps.search.soundsearch.h.h) jjVar.eH.a(), (aq) jjVar.f316a.f319a.cM.a(), (cq) jjVar.f316a.H.a());
    }

    @Override // com.google.android.apps.search.omnient.audiosearch.b$a, com.google.android.libraries.lens.view.audiosearch.b$a
    public final com.google.android.apps.search.soundsearch.j.a fi() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.soundsearch.j.c.b(jjVar.eH, jjVar.eI);
    }

    @Override // com.google.android.apps.search.speechenroll.pages.combinedconsent.m$a
    public final com.google.android.apps.search.speechenroll.pages.combinedconsent.k fj() {
        return (com.google.android.apps.search.speechenroll.pages.combinedconsent.k) this.gF.f308a.eZ.a();
    }

    @Override // com.google.android.apps.search.widgets.stocks.d
    public final com.google.android.apps.search.widgets.stocks.a.u fk() {
        return (com.google.android.apps.search.widgets.stocks.a.u) this.gF.f308a.fa.a();
    }

    @Override // com.google.android.apps.search.widgets.stocks.d
    public final com.google.android.apps.search.widgets.stocks.c.a fl() {
        return this.gF.f308a.dy();
    }

    @Override // com.google.android.apps.search.widgets.weather.d.f
    public final com.google.android.apps.search.widgets.weather.b.a.g fm() {
        return this.gF.f308a.dz();
    }

    @Override // com.google.android.apps.search.widgets.weather.d.f
    public final com.google.android.apps.search.widgets.weather.f.a fn() {
        com.google.android.libraries.search.t.c.u jt = this.gF.f308a.b.jt();
        com.google.android.libraries.search.t.c cVar = com.google.android.libraries.search.t.c.WEATHER;
        cVar.getClass();
        return new com.google.android.apps.search.widgets.weather.f.a(jt.a(cVar, null));
    }

    @Override // com.google.android.libraries.search.ah.i.f.b.j
    public final com.google.android.libraries.assistant.c.b.c.v fo() {
        return (com.google.android.libraries.assistant.c.b.c.v) this.em.a();
    }

    @Override // com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.e$a
    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.b fp() {
        return this.gF.f308a.dA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d fq() {
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d((Context) this.f.f.a(), (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) this.f.dp.a(), (ag) this.f.bo.a(), (Executor) this.f.v.a(), (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a(), Optional.empty(), this.f.b.fC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.d fr() {
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.d((ag) this.f.Q.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.a.a fs() {
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.jumpboost.gearhead.j.a.a(joVar.b.ft, (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) joVar.dp.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final com.google.android.libraries.assistant.auto.jumpboost.o.c ft() {
        return this.gF.f308a.dB();
    }

    @Override // com.google.android.libraries.assistant.auto.tng.actionscache.e.c
    public final com.google.android.libraries.assistant.auto.tng.actionscache.e.b fu() {
        return this.gF.f308a.dD();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.d.c fv() {
        return new com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.d.c(this.kG, this.f.H);
    }

    public final com.google.android.libraries.assistant.auto.tng.assistant.d.f.a.c fw() {
        jo joVar = this.f;
        jr jrVar = joVar.b;
        return new com.google.android.libraries.assistant.auto.tng.assistant.d.f.a.c(joVar.H, this.ec, joVar.g, jrVar.co, jrVar.cp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.common.b.a.c fx() {
        com.google.android.libraries.assistant.auto.tng.common.a.f fVar = (com.google.android.libraries.assistant.auto.tng.common.a.f) this.aA.a();
        AccountId accountId = (AccountId) this.g.a();
        return new com.google.android.libraries.assistant.auto.tng.common.b.a.c(fVar, accountId, (Context) this.f.f.a(), (Executor) this.f.v.a(), (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.common.f.a.a.i fy() {
        return new com.google.android.libraries.assistant.auto.tng.common.f.a.a.i((com.google.android.libraries.g.a) this.f.g.a(), (Context) this.f.f.a(), (com.google.apps.tiktok.g.p) this.aa.a(), (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.common.f.b.a.d fz() {
        return new com.google.android.libraries.assistant.auto.tng.common.f.b.a.d((Context) this.f.f.a(), (p) this.P.a(), (cr) this.f.H.a());
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.al.b.c, com.google.android.apps.search.assistant.verticals.automation.routines.e.n$a, com.google.android.apps.search.assistant.verticals.automation.routines.g.s
    public final com.google.android.apps.search.assistant.verticals.automation.routines.f.f g() {
        return (com.google.android.apps.search.assistant.verticals.automation.routines.f.f) this.jY.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.g.a.ac gA() {
        return new com.google.android.libraries.assistant.pcp.g.a.ac(new com.google.android.libraries.assistant.pcp.g.a.ad(rj()), new com.google.android.libraries.assistant.pcp.g.a.ad(ri(), (byte[]) null), (com.google.android.libraries.assistant.pcp.k.a.a.ah) this.cq.a(), gy(), (com.google.android.libraries.assistant.pcp.f.x) qB(), gQ(), (Executor) this.f.H.a(), (lt) this.aB.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), gt(), gP());
    }

    final com.google.android.libraries.assistant.pcp.h.a.b gB() {
        AccountId accountId = (AccountId) this.g.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.libraries.assistant.pcp.h.a.a eVar = new com.google.android.libraries.assistant.pcp.h.a.b.e((Context) this.f.f.a(), gD(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460764").a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
        com.google.android.libraries.assistant.pcp.h.a.a cVar = new com.google.android.libraries.assistant.pcp.h.a.a.c((Context) this.f.f.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460766").e(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460767").e());
        String str = (String) this.f.Y.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460765").f();
        str.getClass();
        bu buVar = com.google.android.libraries.assistant.pcp.w.b.a;
        if ((str.contains("dev") || str.contains("alpha")) && f) {
            eVar = cVar;
        }
        return new com.google.android.libraries.assistant.pcp.h.a.b(accountId, fVar, eVar, (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (ag) this.f.Q.a());
    }

    final com.google.android.libraries.assistant.pcp.h.a.e gC() {
        AccountId accountId = (AccountId) this.g.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        com.google.android.libraries.assistant.pcp.h.a.c hVar = new com.google.android.libraries.assistant.pcp.h.a.b.h(gD());
        com.google.android.libraries.assistant.pcp.h.a.c dVar = new com.google.android.libraries.assistant.pcp.h.a.a.d(((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460769").e(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460770").e());
        String str = (String) this.f.Y.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460768").f();
        str.getClass();
        bu buVar = com.google.android.libraries.assistant.pcp.w.b.a;
        if ((str.contains("dev") || str.contains("alpha")) && f) {
            hVar = dVar;
        }
        return new com.google.android.libraries.assistant.pcp.h.a.e(accountId, fVar, hVar, (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (ag) this.f.Q.a());
    }

    final com.google.android.libraries.assistant.pcp.h.a.b.l gD() {
        return new com.google.android.libraries.assistant.pcp.h.a.b.l((Context) this.f.f.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
    }

    final com.google.android.libraries.assistant.pcp.h.b.b gE() {
        return new com.google.android.libraries.assistant.pcp.h.b.b((com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.a.d) this.az.a(), (cr) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.h.b.f gF() {
        com.google.aw.l.a.b r = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.r(this.V, (com.google.apps.tiktok.p.m) this.f.b.aC.a(), (com.google.apps.tiktok.p.u) this.f.mh.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a);
        r.getClass();
        return new com.google.android.libraries.assistant.pcp.h.b.f(r, (com.google.frameworks.client.data.android.a.p) this.ik.a(), (cr) this.f.v.a());
    }

    final com.google.android.libraries.assistant.pcp.h.d.c gG() {
        return new com.google.android.libraries.assistant.pcp.h.d.c((Context) this.f.f.a(), (com.google.android.libraries.calendar.appsearch.clients.a.e) this.f.b.aZ.a());
    }

    final com.google.android.libraries.assistant.pcp.h.e.a.g gH() {
        com.google.android.libraries.assistant.pcp.q.a.ah ahVar = (com.google.android.libraries.assistant.pcp.q.a.ah) this.f.oQ.a();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.pcp.h.e.a.g(ahVar, joVar.iu(), joVar.iq(), (Executor) joVar.v.a(), this.f.b.aB, (lt) this.aB.a());
    }

    final com.google.android.libraries.assistant.pcp.h.e.a.m gI() {
        com.google.android.libraries.assistant.pcp.q.a.ah ahVar = (com.google.android.libraries.assistant.pcp.q.a.ah) this.f.oQ.a();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.pcp.h.e.a.m(ahVar, joVar.iq(), (com.google.android.libraries.g.a) joVar.g.a(), (Context) this.f.f.a(), (Executor) this.f.v.a(), this.f.b.aB, (lt) this.aB.a());
    }

    final com.google.android.libraries.assistant.pcp.h.e.a.q gJ() {
        Context context = (Context) this.f.f.a();
        Map rf = rf();
        jo joVar = this.f;
        com.google.android.libraries.assistant.pcp.q.a.ag iu = joVar.iu();
        com.google.android.libraries.assistant.pcp.q.a.k kVar = (com.google.android.libraries.assistant.pcp.q.a.k) joVar.om.a();
        jo joVar2 = this.f;
        return new com.google.android.libraries.assistant.pcp.h.e.a.q(context, rf, iu, kVar, joVar2.ir(), ((com.google.apps.tiktok.experiments.e) new h.a.a.y.a.a.l(joVar2.b.f322a.V).a.a()).a("com.google.android.apps.gsa.pcp.device 45381169").d(), (cq) this.f.v.a(), (cq) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.h.f.b gK() {
        return new com.google.android.libraries.assistant.pcp.h.f.b(iL().a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.h.f.h gL() {
        return new com.google.android.libraries.assistant.pcp.h.f.h((com.google.android.libraries.search.location.y) this.O.a(), (com.google.android.libraries.af.b.a) this.f.pd.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.h.f.m gM() {
        jo joVar = this.f;
        long w = joVar.b.w();
        String str = (String) joVar.Y.a();
        com.google.android.libraries.assistant.pcp.h.f.a.i iVar = new com.google.android.libraries.assistant.pcp.h.f.a.i(Optional.of(this.f.f319a.se()), jI(), (com.google.android.libraries.search.ai.i) this.f.vx.a(), gT(), Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a()), (am) this.z.a(), cD(), Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.c.g) this.bB.a()), Optional.of((com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.q) this.bE.a()), df(), (com.google.android.apps.search.assistant.surfaces.voice.robin.fasttrack.ui.am) this.A.a());
        jo joVar2 = this.f;
        return new com.google.android.libraries.assistant.pcp.h.f.m(2, w, str, iVar, joVar2.Vo(), joVar2.ip(), gT(), (ag) joVar2.Q.a());
    }

    final com.google.android.libraries.assistant.pcp.h.g.c gN() {
        return new com.google.android.libraries.assistant.pcp.h.g.c((ConnectivityManager) this.f.wN.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.h.g.f gO() {
        return new com.google.android.libraries.assistant.pcp.h.g.f((com.google.common.v.f) this.f.ez.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.j.a.d gP() {
        return new com.google.android.libraries.assistant.pcp.j.a.d((AccountId) this.g.a(), gm(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a());
    }

    public final com.google.android.libraries.assistant.pcp.datastore.a.a.g gQ() {
        return new com.google.android.libraries.assistant.pcp.datastore.a.a.g((com.google.android.libraries.assistant.pcp.datastore.room.l) this.jm.a(), (com.google.android.libraries.assistant.pcp.datastore.room.j) this.jn.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.v.a());
    }

    public final com.google.android.libraries.assistant.pcp.datastore.b.a.d gR() {
        return new com.google.android.libraries.assistant.pcp.datastore.b.a.d((cg) this.jp.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
    }

    public final com.google.android.libraries.assistant.pcp.datastore.b.d.j gS() {
        return new com.google.android.libraries.assistant.pcp.datastore.b.d.j((cg) this.jk.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
    }

    public final com.google.android.libraries.assistant.pcp.o.a.b gT() {
        jr jrVar = this.f.b;
        return new com.google.android.libraries.assistant.pcp.o.a.b(jrVar.Q, jrVar.R, jrVar.S, jrVar.T, jrVar.U, jrVar.V, jrVar.W, jrVar.X, jrVar.Y, jrVar.Z, jrVar.aa, jrVar.ab, jrVar.ac, jrVar.ad, jrVar.ae);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.logging.a gU() {
        return new com.google.android.libraries.assistant.pcp.logging.a((com.google.android.libraries.logging.ve.synthetic.f) this.f.f319a.du.a(), (com.google.android.libraries.logging.ve.y) this.f.ql.a(), (AccountId) this.g.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (com.google.android.libraries.logging.ve.j) this.f.qm.a(), (com.google.android.libraries.search.t.l.k) this.f.qr.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.logging.e gV() {
        return new com.google.android.libraries.assistant.pcp.logging.e((com.google.android.libraries.logging.ve.synthetic.f) this.f.f319a.du.a(), (com.google.android.libraries.logging.ve.y) this.f.ql.a(), (Executor) this.f.H.a(), (AccountId) this.g.a(), (com.google.android.libraries.search.t.l.k) this.f.qr.a());
    }

    final com.google.android.libraries.assistant.pcp.u.a.q gW() {
        return new com.google.android.libraries.assistant.pcp.u.a.q(this.jl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.b.f gX() {
        return new com.google.android.libraries.assistant.pcp.u.b.f(new com.google.android.libraries.assistant.pcp.u.a.q((Executor) this.f.H.a()), gW(), yj(), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.b gY() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.b((Executor) this.f.H.a(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.f gZ() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.f((Context) this.f.f.a(), this.f.b.it().a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.d.a ga() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.d.a(new mj(this.f));
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.e gb() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.e(new com.google.android.libraries.search.assistant.ay.c.c(new com.google.android.libraries.search.assistant.ay.b.a.b((p) this.P.a(), (Executor) this.f.H.a()), new com.google.android.libraries.search.assistant.ay.a.a.e((com.google.common.v.f) this.f.b.f322a.ez.a()), (Executor) this.f.H.a()), (cg) this.jo.a(), (com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a(), this.f.b.bD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.b.b gc() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.b.b((com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.b) this.ap.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.a.a.d gd() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.a.a.d((Executor) this.f.H.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.e.a.s) this.f.b.ax.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) this.f.b.au.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.c ge() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.c(new com.google.android.libraries.assistant.auto.tng.u.a.a.e(kr(), this.f.mJ(), re()), (cr) this.f.H.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.a.c.i gf() {
        jo joVar = this.f;
        h hVar = joVar.wr;
        Executor executor = (Executor) joVar.H.a();
        com.google.g.q.b.d dVar = com.google.g.q.b.d.w;
        dVar.getClass();
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.a.c.i(this.ij, hVar, executor, dVar);
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.a.d.c gg() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.a.d.c((com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.aI.a(), (cr) this.f.H.a(), 0);
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.a gh() {
        jr jrVar = this.f.b;
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.e.a.a(jrVar.bc, jrVar.bd, (com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.e) jrVar.au.a());
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.f.f gi() {
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f.g.a();
        Executor executor = (Executor) this.f.H.a();
        com.google.android.libraries.search.assistant.az.a.b.a.c.a.a.d iW = iW();
        Context context = (Context) this.f.f.a();
        jr jrVar = this.f.b;
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.f.f(aVar, executor, iW, context, jrVar.bE, jrVar.bF, this.ii);
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.f.s gj() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.f.s((com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aj
    public final com.google.android.libraries.assistant.auto.tng.suggestions.j.s gk() {
        return (com.google.android.libraries.assistant.auto.tng.suggestions.j.s) this.gF.f308a.ff.a();
    }

    final com.google.android.libraries.assistant.contexttrigger.e.s gl() {
        return new com.google.android.libraries.assistant.contexttrigger.e.s((Context) this.f.f.a(), (AudioManager) this.f.cZ.a(), (com.google.android.libraries.g.a) this.f.g.a(), (cr) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.contexttrigger.g.l gm() {
        return new com.google.android.libraries.assistant.contexttrigger.g.l(this.f.f319a.cV(), go(), ra(), (com.google.android.libraries.search.assistant.proactive.h.c) this.f.in.a(), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.contexttrigger.g.y gn() {
        com.google.android.libraries.assistant.contexttrigger.g.ad go = go();
        fq i = fu.i(6);
        i.i(com.google.g.af.b.a.b.b, new com.google.android.apps.search.assistant.verticals.ambient.trigger.c.e((Context) this.f.f.a(), (com.google.android.apps.search.assistant.verticals.ambient.q.a.l) this.ct.a(), gl(), dV(), M(), (ag) this.f.bo.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), this.f.b.bQ));
        i.i(com.google.g.af.b.a.b.d, qx());
        i.i(com.google.g.af.b.a.b.e, com.google.android.libraries.assistant.pcp.j.a.n.b(this.cv.a(), (com.google.android.libraries.assistant.pcp.k.a.a.ah) this.cq.a(), (com.google.android.libraries.assistant.pcp.h.e) this.cl.a(), gt(), (com.google.android.libraries.assistant.pcp.b.c) this.cu.a(), new com.google.android.libraries.assistant.pcp.d.a.x(this.aL), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a()));
        com.google.g.af.b.a.b bVar = com.google.g.af.b.a.b.g;
        Context context = (Context) this.f.f.a();
        com.google.android.libraries.search.assistant.proactive.b.b iB = iB();
        com.google.android.libraries.search.assistant.proactive.h.c cVar = (com.google.android.libraries.search.assistant.proactive.h.c) this.f.in.a();
        h hVar = this.as;
        Object qv = qv();
        com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p pVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.d.p) hVar.a();
        am amVar = (am) this.z.a();
        jo joVar = this.f;
        i.i(bVar, new com.google.android.apps.search.assistant.surfaces.notification.o(context, iB, cVar, (com.google.android.libraries.search.assistant.aj.d.b.e) qv, pVar, amVar, joVar.kr(), (Executor) joVar.H.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.p.c) this.au.a()));
        i.i(com.google.g.af.b.a.b.c, z());
        i.i(com.google.g.af.b.a.b.f, en());
        return new com.google.android.libraries.assistant.contexttrigger.g.y(go, i.h(true), ra(), (Executor) this.f.H.a(), gm(), (com.google.android.libraries.search.assistant.proactive.h.c) this.f.in.a(), (com.google.android.libraries.performance.primes.metrics.j.f) this.f.jd.a());
    }

    @Override // com.google.android.libraries.assistant.contexttrigger.g.f
    public final com.google.android.libraries.assistant.contexttrigger.g.ad go() {
        cg cgVar = (cg) this.kM.a();
        Executor executor = (Executor) this.f.H.a();
        com.google.android.libraries.assistant.contexttrigger.g.e eVar = new com.google.android.libraries.assistant.contexttrigger.g.e(this.f.ez);
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.contexttrigger.g.ad(cgVar, executor, eVar, joVar.ih(), (com.google.android.libraries.g.a) joVar.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.k.a.a.a.g gp() {
        return new com.google.android.libraries.assistant.k.a.a.a.g(gq(), (Context) this.f.f.a(), (com.google.frameworks.client.data.android.l) this.ei.a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.k.a.a.b.c gq() {
        return new com.google.android.libraries.assistant.k.a.a.b.c((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (Context) this.f.f.a(), (cq) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.k.a.a.c.j gr() {
        return new com.google.android.libraries.assistant.k.a.a.c.j(gq(), (Context) this.f.f.a(), (com.google.frameworks.client.data.android.l) this.ei.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.crossprofile.f, com.google.android.apps.search.assistant.verticals.ambient.trigger.e.l$a, com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.a
    public final com.google.android.libraries.assistant.pcp.b gs() {
        return (com.google.android.libraries.assistant.pcp.b) this.cm.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.b.a.r gt() {
        com.google.android.libraries.assistant.pcp.b.b bVar = (com.google.android.libraries.assistant.pcp.b.b) this.cr.a();
        Object qo = qo();
        Object qr = qr();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.pcp.b.a.r(bVar, (com.google.android.libraries.assistant.pcp.b.a.p) qo, (com.google.android.libraries.assistant.pcp.b.a.ar) qr, joVar.ip(), (com.google.common.v.f) joVar.ez.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), new Random(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.libraries.assistant.pcp.b.a.ae$a
    public final com.google.android.libraries.assistant.pcp.b.a.ac gu() {
        jj jjVar = this.gF.f308a;
        com.google.android.libraries.assistant.pcp.datastore.b.c.f io = jjVar.f316a.io();
        ik ikVar = jjVar.b;
        return new com.google.android.libraries.assistant.pcp.b.a.ac(io, new com.google.android.libraries.assistant.pcp.d.a.x(ikVar.aL), ikVar.gt(), (com.google.android.libraries.assistant.pcp.h.e) ikVar.cl.a(), (Executor) jjVar.f316a.H.a());
    }

    final com.google.android.libraries.assistant.pcp.b.c.f gv() {
        return new com.google.android.libraries.assistant.pcp.b.c.f(gR(), new com.google.android.libraries.assistant.pcp.b.c.p((com.google.android.libraries.assistant.pcp.f.x) qB(), (com.google.android.libraries.assistant.pcp.h.e) this.cl.a(), gW(), yj(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a()), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.b.c.t gw() {
        return new com.google.android.libraries.assistant.pcp.b.c.t(gv(), new com.google.android.libraries.assistant.pcp.b.c.y(rZ(), (com.google.common.v.f) this.f.ez.a(), gv(), gR(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a()), (com.google.android.libraries.assistant.pcp.h.e) this.cl.a(), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.c.a.h gx() {
        Context context = (Context) this.f.f.a();
        Context context2 = (Context) this.f.f.a();
        context2.getClass();
        return new com.google.android.libraries.assistant.pcp.c.a.h(context, com.google.android.gms.wearable.q.c(context2), (AccountId) this.g.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (ag) this.f.Q.a(), (com.google.common.v.f) this.f.ez.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45461491").d(), (com.google.android.libraries.assistant.pcp.b) this.cm.a(), gT());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.d.a.w gy() {
        Object qB = qB();
        e.a b = c.b(this.ji);
        e.a b2 = c.b(this.jj);
        h hVar = this.aB;
        return new com.google.android.libraries.assistant.pcp.d.a.w((com.google.android.libraries.assistant.pcp.f.x) qB, new com.google.android.libraries.assistant.pcp.d.a.j(b, b2, nr.a, (lt) hVar.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), gV(), (com.google.android.libraries.assistant.pcp.f.x) qB(), (Executor) this.f.H.a()), gS(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), gV(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (AccountId) this.g.a(), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.d.a.x gz() {
        return new com.google.android.libraries.assistant.pcp.d.a.x(this.aL);
    }

    @Override // com.google.android.apps.gsa.assistant.settings.features.al.b.l$a, com.google.android.apps.search.assistant.verticals.ambient.r.d.k.a, com.google.android.apps.search.assistant.verticals.automation.routines.c.b.a, com.google.android.apps.search.assistant.verticals.automation.routines.g.s
    public final com.google.android.libraries.search.location.y h() {
        return (com.google.android.libraries.search.location.y) this.O.a();
    }

    @Override // com.google.android.apps.search.googleapp.homescreen.a.c$a, com.google.android.apps.search.googleapp.search.b.c$a
    public final com.google.android.libraries.search.b.b hA() {
        return (com.google.android.libraries.search.b.b) this.gF.f308a.aJ.a();
    }

    public final com.google.android.libraries.search.b.b hB() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.LOCATION_AGSA);
        a2.getClass();
        return a2;
    }

    final com.google.android.libraries.search.b.b hC() {
        com.google.android.libraries.search.t.a.a aVar = (com.google.android.libraries.search.t.a.a) this.f.iH.a();
        aVar.getClass();
        com.google.android.libraries.search.b.b a2 = aVar.a(com.google.android.libraries.search.t.c.ROBIN_ANDROID);
        a2.getClass();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.b.b hD() {
        com.google.android.libraries.search.t.a.a aVar = (com.google.android.libraries.search.t.a.a) this.J.a();
        boolean booleanValue = ((Boolean) this.aY.a()).booleanValue();
        com.google.android.libraries.search.assistant.ae.a.a.b b = aVar.b(com.google.android.libraries.search.t.a.h.TTS_API);
        com.google.android.libraries.search.assistant.ae.a.a.b bVar = b;
        if (booleanValue) {
            bVar = ((com.google.android.libraries.search.assistant.ae.a.a) this.iC.a()).a(b);
        }
        bVar.getClass();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.b.l hE() {
        jo joVar = this.f;
        h hVar = joVar.g;
        h hVar2 = joVar.aL;
        h hVar3 = joVar.aM;
        h hVar4 = joVar.aN;
        h hVar5 = joVar.aO;
        return new com.google.android.libraries.search.b.l(hVar, hVar2, hVar3, hVar4, hVar5, joVar.aQ, this.gL, hVar5);
    }

    final com.google.android.libraries.search.assistant.appactions.b.f hF() {
        return new com.google.android.libraries.search.assistant.appactions.b.g((cg) this.iD.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.w hG() {
        return new com.google.android.libraries.search.assistant.appactions.d.w((com.google.android.libraries.search.t.i.y) this.f.W.a(), (com.google.android.libraries.g.a) this.f.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.a.p hH() {
        return new com.google.android.libraries.search.assistant.appactions.d.a.p(fu.p("builtin:Alarm", new com.google.android.libraries.search.assistant.appactions.d.a.a.a(), "builtin:Timer", new com.google.android.libraries.search.assistant.appactions.d.a.a.h((Context) this.f.f.a(), 0), "builtin:Stopwatch", new com.google.android.libraries.search.assistant.appactions.d.a.a.h((Context) this.f.f.a(), 1), "builtin:Person", new com.google.android.libraries.search.assistant.appactions.d.a.a.f()));
    }

    final com.google.android.libraries.search.assistant.appactions.d.b.j hI() {
        return new com.google.android.libraries.search.assistant.appactions.d.b.j((p) this.P.a(), (PackageManager) this.f.h.a(), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.b.o hJ() {
        return new com.google.android.libraries.search.assistant.appactions.d.b.o(new com.google.android.libraries.search.assistant.appactions.d.b.l((Context) this.f.f.a(), (AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (cq) this.f.H.a()), (Executor) this.f.v.a(), (cq) this.f.H.a(), hG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.c.r hK() {
        cr crVar = (cr) this.f.H.a();
        PackageManager packageManager = (PackageManager) this.f.h.a();
        jo joVar = this.f;
        Object eZ = joVar.b.eZ();
        return new com.google.android.libraries.search.assistant.appactions.d.c.r(crVar, packageManager, (com.google.android.libraries.search.assistant.appactions.d.c.j) eZ, new com.google.android.libraries.search.assistant.appactions.d.c.h((cq) joVar.H.a(), (com.google.apps.tiktok.g.p) this.aa.a(), hG(), h.a.a.f.b.a.n.o(this.l)), h.a.a.f.b.a.n.m(this.l), h.a.a.f.b.a.n.q(this.l), h.a.a.f.b.a.n.n(this.l), hF(), hG(), (com.google.android.libraries.search.integrations.c.a.c) this.Y.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.a.e.c.a
    public final com.google.android.libraries.search.assistant.appactions.d.d.b hL() {
        return this.gF.f308a.em();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.f.c hM() {
        return new com.google.android.libraries.search.assistant.appactions.d.f.c((LauncherApps) this.f.jB.a(), (cq) this.f.H.a(), (Executor) this.f.v.a(), hF());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.appactions.d.f.k hN() {
        return new com.google.android.libraries.search.assistant.appactions.d.f.k(hM(), hK(), hI(), (cq) this.f.H.a(), hG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.i.d.b hO() {
        return new com.google.android.libraries.search.assistant.i.d.b((com.google.apps.tiktok.account.data.b) this.f.bN.a(), (AccountId) this.g.a());
    }

    public final bo hP() {
        return new bo(h.a.a.f.b.a.n.i(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bw hQ() {
        return new bw((com.google.android.libraries.search.assistant.u.d) this.cz.a(), (nz) this.cH.a(), c.b(this.jx), h.a.a.f.b.a.n.j(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45426692").f(), (ci) this.f.ft.a(), hP());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final da hR() {
        return new da((com.google.android.libraries.search.assistant.u.i) this.f.rq.a(), (nz) this.jM.a(), (nz) this.jN.a(), (nz) this.jO.a(), (ci) this.f.ft.a());
    }

    public final fv hS() {
        return new fv((cr) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.q.a.b.a.c hT() {
        return new com.google.android.libraries.search.assistant.q.a.b.a.c((com.google.android.libraries.search.assistant.q.a.a.a.a.n) this.ky.a(), (ag) this.f.Q.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.d.g$a
    public final com.google.android.libraries.search.assistant.invocation.a.a.b hU() {
        lt ltVar = (lt) this.kx.a();
        io.grpc.i qg = qg();
        ltVar.getClass();
        return new com.google.android.apps.gsa.search.shared.h.a.g(new com.google.android.apps.gsa.search.shared.h.a.n(qg, io.grpc.h.a), (ag) ((jd) ltVar.a).f312a.Q.a());
    }

    @Override // com.google.android.libraries.search.assistant.invocation.g.a.i
    public final com.google.android.libraries.search.assistant.invocation.g.a.h hV() {
        return (com.google.android.libraries.search.assistant.invocation.g.a.h) this.gF.f308a.fn.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.invocation.g.a.a.d hW() {
        return new com.google.android.libraries.search.assistant.invocation.g.a.a.d((com.google.android.libraries.search.assistant.invocation.g.a.a.m) this.f.qS.a(), (ag) this.f.Q.a());
    }

    @Override // com.google.android.libraries.search.assistant.invocation.h.c.e.e.a
    public final com.google.android.libraries.search.assistant.invocation.h.c.e.a.b hX() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.libraries.search.assistant.invocation.h.c.e.a.b((ag) jjVar.f316a.Q.a(), jjVar.b.xZ());
    }

    @Override // com.google.android.libraries.search.assistant.invocation.h.c.e.e.a
    public final com.google.android.libraries.search.assistant.invocation.h.c.e.a.d hY() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.libraries.search.assistant.invocation.h.c.e.a.d((Context) jjVar.f316a.f.a(), jjVar.b.g, (com.google.apps.tiktok.account.data.b) jjVar.f316a.bN.a(), new com.google.android.libraries.search.assistant.invocation.h.c.e.a.f(jjVar.ez()));
    }

    @Override // com.google.android.libraries.search.assistant.invocation.h.c.e.e.a
    public final com.google.android.libraries.search.assistant.invocation.h.c.e.a.h hZ() {
        jj jjVar = this.gF.f308a;
        PackageManager packageManager = (PackageManager) jjVar.f316a.h.a();
        jo joVar = jjVar.f316a;
        ik ikVar = jjVar.b;
        return new com.google.android.libraries.search.assistant.invocation.h.c.e.a.h(packageManager, new com.google.android.libraries.search.assistant.invocation.h.c.e.a.k(ikVar.xd(), ikVar.g, (com.google.apps.tiktok.account.data.b) joVar.bN.a(), (PackageManager) jjVar.f316a.h.a(), (n) jjVar.f316a.R.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.h ha() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.h((Executor) this.f.H.a(), (com.google.common.v.f) this.f.ez.a(), 0);
    }

    final com.google.android.libraries.assistant.pcp.v.b hb() {
        return new com.google.android.libraries.assistant.pcp.v.f(he(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.v.b.v hc() {
        Context context = (Context) this.f.f.a();
        com.google.apps.tiktok.g.p pVar = (com.google.apps.tiktok.g.p) this.aa.a();
        Executor executor = (Executor) this.f.H.a();
        Uri uri = CalendarContract.Instances.CONTENT_URI;
        uri.getClass();
        return new com.google.android.libraries.assistant.pcp.v.b.v(context, pVar, executor, uri, Optional.of(CalendarContract.Calendars.CONTENT_URI), Optional.of(CalendarContract.Attendees.CONTENT_URI));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.v.b.a.c hd() {
        return new com.google.android.libraries.assistant.pcp.v.b.a.c((cg) this.f.b.P.a(), (com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a());
    }

    final com.google.android.libraries.assistant.pcp.v.c.g he() {
        jo joVar = this.f;
        jr jrVar = joVar.b;
        com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.aa aaVar = new com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.aa(jrVar.H, jrVar.I, jrVar.J);
        com.google.android.libraries.assistant.pcp.q.a.ah ahVar = (com.google.android.libraries.assistant.pcp.q.a.ah) joVar.oQ.a();
        com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.ag agVar = new com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.ag((com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.datastore.b) this.ap.a(), (Executor) this.f.v.a());
        jo joVar2 = this.f;
        com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.p pVar = new com.google.android.libraries.assistant.auto.tng.suggestions.mediahabits.a.p(aaVar, ahVar, agVar, joVar2.iq(), (com.google.android.libraries.g.a) joVar2.g.a(), (Context) this.f.f.a(), (Executor) this.f.v.a(), (Executor) this.f.H.a());
        jo joVar3 = this.f;
        com.google.android.libraries.assistant.pcp.q.a.ag iu = joVar3.iu();
        Executor executor = (Executor) joVar3.v.a();
        Executor executor2 = (Executor) this.f.H.a();
        jo joVar4 = this.f;
        jr jrVar2 = joVar4.b;
        return new com.google.android.libraries.assistant.pcp.v.c.g(pVar, iu, executor, executor2, jrVar2.K, jrVar2.L, jrVar2.M, jrVar2.N, joVar4.oS, new h.a.a.y.a.a.l(joVar4.V).c(), (Context) this.f.f.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.av$a, com.google.android.apps.gsa.staticplugins.g.ae$a
    public final com.google.android.libraries.assistant.q.q hf() {
        return (com.google.android.libraries.assistant.q.q) this.dx.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.p.a.al hg() {
        return com.google.android.libraries.p.a.a.b(qi());
    }

    @Override // com.google.android.libraries.p.a.b.c.s
    public final com.google.android.libraries.p.a.b.c.r hh() {
        jj jjVar = this.gF.f308a;
        ci ciVar = (ci) jjVar.f316a.ft.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) jjVar.f316a.g.a();
        Optional of = Optional.of(Boolean.valueOf(((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.V.a()).a("com.google.android.libraries.search.device 45531393").f()));
        com.google.android.libraries.p.a.b.c.y bVar = new com.google.android.libraries.p.a.b.c.b((Context) jjVar.f316a.f.a(), (com.google.android.gms.clearcut.a.b) jjVar.f316a.bl.a(), (AccountId) jjVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a());
        com.google.android.libraries.p.a.b.c.u uVar = new com.google.android.libraries.p.a.b.c.u((com.google.protos.az.a.c) jjVar.fj.a());
        Object orElse = of.orElse(false);
        orElse.getClass();
        if (((Boolean) orElse).booleanValue()) {
            bVar = new com.google.android.libraries.p.a.b.c.y(uVar);
        }
        return new com.google.android.libraries.p.a.b.c.r(ciVar, aVar, bVar, (com.google.apps.tiktok.account.data.b) jjVar.f316a.bN.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.p.a.d.h hi() {
        com.google.android.libraries.p.a.d.j jVar;
        Optional of = Optional.of(Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.libraries.search.device 45530943").f()));
        Optional of2 = Optional.of(Boolean.valueOf(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.libraries.search.device 45426322").f()));
        h hVar = this.kn;
        hVar.getClass();
        if (!((Boolean) m.h.c.a.a(of2, false)).booleanValue()) {
            jVar = com.google.android.libraries.p.a.d.j.b;
        } else if (((Boolean) m.h.c.a.a(of, false)).booleanValue()) {
            Object a2 = hVar.a();
            a2.getClass();
            jVar = (com.google.android.libraries.p.a.d.h) a2;
        } else {
            jVar = com.google.android.libraries.p.a.d.j.a;
        }
        return jVar;
    }

    @Override // com.google.android.libraries.search.l.z
    public final com.google.android.libraries.geller.portable.database.q hj() {
        final int i = 1;
        final int i2 = 0;
        return new com.google.android.libraries.geller.portable.database.q((fu) Collection._EL.stream(this.gF.b.gs().v()).collect(bs.e(new Function(i) { // from class: com.google.android.libraries.search.l.ag

            /* renamed from: a, reason: collision with root package name */
            private final int f5261a;

            {
                this.f5261a = i;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return this.f5261a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5261a != 0 ? ((com.google.protos.o.b.v) ((Map.Entry) obj).getKey()).name() : (cg) ((Map.Entry) obj).getValue();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.f5261a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        }, new java.util.function.Function(i2) { // from class: com.google.android.libraries.search.l.ag

            /* renamed from: a, reason: collision with root package name */
            private final int f5261a;

            {
                this.f5261a = i2;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return this.f5261a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5261a != 0 ? ((com.google.protos.o.b.v) ((Map.Entry) obj).getKey()).name() : (cg) ((Map.Entry) obj).getValue();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.f5261a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: com.google.android.libraries.search.l.ah
            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(java.util.function.Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (cg) obj2;
            }
        })));
    }

    @Override // com.google.android.apps.search.lens.service.j$a
    public final com.google.android.libraries.lens.sdk.b.f hk() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.libraries.lens.sdk.b.f((Executor) jjVar.f316a.vz.a(), (PackageManager) jjVar.f316a.h.a(), fu.m("SessionTypeAvs", new com.google.android.libraries.lens.sdk.avs.aw(jjVar.eF)));
    }

    @Override // com.google.android.libraries.lens.view.f.b
    public final com.google.android.libraries.lens.view.f.a hl() {
        return new com.google.android.libraries.lens.view.f.a();
    }

    @Override // com.google.android.libraries.assistant.auto.tng.z.a.b.d
    public final com.google.android.libraries.search.account.e.b hm() {
        return (com.google.android.libraries.search.account.e.b) this.u.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.w.a.d$a, com.google.android.libraries.search.integrations.p.a.a, com.google.android.libraries.search.t.g.r, com.google.android.libraries.search.t.l.h$a
    public final com.google.android.libraries.search.account.e.b hn() {
        return (com.google.android.libraries.search.account.e.b) this.u.a();
    }

    final com.google.android.libraries.search.account.e.l ho() {
        return new com.google.android.libraries.search.account.e.l((com.google.android.libraries.search.account.e.b) this.u.a(), h.a.a.as.b.a.d.b(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.b.b hp() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.APA);
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.apps.search.assistant.verticals.family.custodio.i$a, com.google.android.apps.search.assistant.verticals.familyshare.d$a, com.google.android.apps.search.assistant.verticals.newsplayer.h.aa$a, com.google.android.apps.search.assistant.verticals.newsplayer.h.ap$a
    public final com.google.android.libraries.search.b.b hq() {
        return (com.google.android.libraries.search.b.b) this.ba.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.b.b hr() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.MORRIS);
        a2.getClass();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.b.b hs() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.ASSISTANT_AUTO_TNG);
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.apps.search.assistant.surfaces.dictation.service.r.u
    public final com.google.android.libraries.search.b.b ht() {
        return (com.google.android.libraries.search.b.b) this.ba.a();
    }

    @Override // com.google.android.libraries.search.assistant.performer.h.f.a.a$a, com.google.android.libraries.search.ah.e.a.g.a.h.a, com.google.android.libraries.search.ah.g.c
    public final com.google.android.libraries.search.b.b hu() {
        return hz();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$a
    public final com.google.android.libraries.search.b.b hv() {
        return (com.google.android.libraries.search.b.b) this.ba.a();
    }

    @Override // com.google.android.libraries.search.l.z
    public final com.google.android.libraries.search.b.b hw() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.gF.b.b.J.a()).a(com.google.android.libraries.search.t.c.GELLER_AGSA);
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.libraries.lens.sdk.avs.a.e$a
    public final com.google.android.libraries.search.b.b hx() {
        return (com.google.android.libraries.search.b.b) this.gF.f308a.em.a();
    }

    @Override // com.google.android.apps.search.omnient.accounttypechecking.g$a
    public final com.google.android.libraries.search.b.b hy() {
        return this.gF.f308a.el();
    }

    @Override // com.google.android.libraries.search.assistant.invocation.n.a.a.a
    public final com.google.android.libraries.search.b.b hz() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.APA);
        a2.getClass();
        return a2;
    }

    @Override // com.google.android.apps.gsa.assistant.settings.d.m$a, com.google.android.apps.gsa.staticplugins.opa.br.am$a
    public final com.google.android.libraries.web.o.u i() {
        return (com.google.android.libraries.web.o.u) this.s.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bx iA() {
        cq cqVar = (cq) this.f.v.a();
        Executor executor = (Executor) this.f.H.a();
        h hVar = this.hY;
        ce ks = this.f.ks();
        com.google.android.libraries.search.assistant.proactive.k kVar = (com.google.android.libraries.search.assistant.proactive.k) hVar.a();
        h hVar2 = this.ib;
        com.google.android.libraries.search.assistant.proactive.y kq = this.f.kq();
        com.google.android.libraries.search.assistant.proactive.bh bhVar = (com.google.android.libraries.search.assistant.proactive.bh) hVar2.a();
        AccountId accountId = (AccountId) this.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f.bq.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f.bN.a();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.f.g.a();
        jy jyVar = this.f.f319a;
        h hVar3 = this.ic;
        com.google.android.libraries.search.assistant.proactive.ac iz = iz();
        e.a b = c.b(hVar3);
        e.a b2 = c.b(jyVar.gC);
        jo joVar = this.f;
        jr jrVar = joVar.b;
        h hVar4 = jrVar.ah;
        h hVar5 = this.av;
        jy jyVar2 = joVar.f319a;
        e.a b3 = c.b(this.id);
        com.google.android.libraries.search.assistant.proactive.aq dV = jyVar2.dV();
        e.a b4 = c.b(hVar5);
        e.a b5 = c.b(hVar4);
        com.google.android.libraries.search.assistant.proactive.ba aB = jrVar.aB();
        com.google.android.libraries.search.assistant.proactive.h.c cVar = (com.google.android.libraries.search.assistant.proactive.h.c) joVar.in.a();
        com.google.android.libraries.search.t.i.y yVar = (com.google.android.libraries.search.t.i.y) this.f.W.a();
        jr jrVar2 = this.f.b;
        Context context = (Context) jrVar2.f322a.f.a();
        Executor executor2 = (Executor) jrVar2.f322a.v.a();
        jo joVar2 = jrVar2.f322a;
        as fm = joVar2.fm();
        Optional of = Optional.of(joVar2.fn());
        com.google.common.v.f fVar = (com.google.common.v.f) jrVar2.f322a.ez.a();
        jy jyVar3 = jrVar2.f322a.f319a;
        boolean qW = jyVar3.qW();
        boolean a2 = jyVar3.oT().a();
        boolean b6 = jrVar2.f322a.f319a.oT().b();
        jo joVar3 = jrVar2.f322a;
        boolean qX = joVar3.f319a.qX();
        boolean at = h.a.a.f.a.a.x.at(joVar3.V);
        boolean qY = jrVar2.f322a.f319a.qY();
        jo joVar4 = jrVar2.f322a;
        boolean qZ = joVar4.f319a.qZ();
        com.google.android.apps.search.assistant.platform.pcp.api.r rVar = (com.google.android.apps.search.assistant.platform.pcp.api.r) joVar4.uM.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar2.f322a.nM.a();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar2 = (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar2.f322a.nN.a();
        jo joVar5 = jrVar2.f322a;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.e.r bb = joVar5.f319a.bb();
        Context context2 = (Context) joVar5.f.a();
        Executor executor3 = (Executor) jrVar2.f322a.v.a();
        cr crVar = (cr) jrVar2.f322a.H.a();
        jo joVar6 = jrVar2.f322a;
        jy jyVar4 = joVar6.f319a;
        boolean ra = jyVar4.ra();
        boolean rb = jyVar4.rb();
        boolean rc = jyVar4.rc();
        boolean aq = h.a.a.f.a.a.x.aq(joVar6.V);
        jo joVar7 = jrVar2.f322a;
        jy jyVar5 = joVar7.f319a;
        long d = jyVar5.d();
        boolean rd = jyVar5.rd();
        ao eS = jyVar5.eS();
        boolean at2 = h.a.a.f.a.a.x.at(joVar7.V);
        jo joVar8 = jrVar2.f322a;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.a.i iVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.a.i(context2, executor3, crVar, ra, rb, rc, aq, d, rd, eS, at2, joVar8.fm(), Optional.of(joVar8.fn()), (com.google.android.apps.search.assistant.platform.pcp.api.r) jrVar2.f322a.uM.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar2.f322a.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar2.f322a.nN.a(), (com.google.common.v.f) jrVar2.f322a.ez.a());
        Context context3 = (Context) jrVar2.f322a.f.a();
        Executor executor4 = (Executor) jrVar2.f322a.v.a();
        jo joVar9 = jrVar2.f322a;
        as fm2 = joVar9.fm();
        com.google.common.v.f fVar2 = (com.google.common.v.f) joVar9.ez.a();
        jo joVar10 = jrVar2.f322a;
        jo joVar11 = jrVar2.f322a;
        jy jyVar6 = joVar11.f319a;
        jy jyVar7 = joVar10.f319a;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.c.e eVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.c.e(context3, executor4, fm2, fVar2, jyVar7.rc(), jyVar7.e(), jyVar7.f(), joVar10.f319a.g(), jyVar6.h(), (com.google.android.apps.search.assistant.platform.pcp.api.r) joVar11.uM.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar2.f322a.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar2.f322a.nN.a());
        Context context4 = (Context) jrVar2.f322a.f.a();
        Executor executor5 = (Executor) jrVar2.f322a.v.a();
        jo joVar12 = jrVar2.f322a;
        as fm3 = joVar12.fm();
        Optional of2 = Optional.of(joVar12.fn());
        com.google.common.v.f fVar3 = (com.google.common.v.f) jrVar2.f322a.ez.a();
        jo joVar13 = jrVar2.f322a;
        jy jyVar8 = joVar13.f319a;
        com.google.android.apps.search.assistant.platform.pcp.featuredata.n nVar = new com.google.android.apps.search.assistant.platform.pcp.featuredata.n(context, executor2, fm, of, fVar, qW, a2, b6, qX, at, qY, qZ, rVar, aVar2, rVar2, bb, iVar, eVar, new com.google.android.apps.search.assistant.platform.pcp.featuredata.b.f(context4, executor5, fm3, of2, fVar3, jyVar8.re(), jyVar8.eT(), jyVar8.eU(), h.a.a.f.a.a.x.at(joVar13.V), (com.google.android.apps.search.assistant.verticals.ambient.g.a) jrVar2.f322a.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) jrVar2.f322a.nN.a(), jrVar2.f322a.f319a.aZ()));
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.f fVar4 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.f();
        jo joVar14 = this.f;
        return new bx(cqVar, executor, ks, kVar, kq, bhVar, accountId, dVar, bVar, aVar, iz, b, b2, b3, dV, b4, b5, aB, cVar, yVar, nVar, fVar4, joVar14.kr(), (com.google.apps.tiktok.contrib.work.b.p) joVar14.gK.a(), (Random) this.f.lr.a(), (com.google.android.libraries.search.d.x.e.d) this.f.vh.a(), com.google.common.base.at.k(ay()));
    }

    @Override // com.google.android.apps.search.assistant.verticals.reminders.e.t.a
    public final com.google.android.libraries.search.assistant.proactive.b.b iB() {
        return new com.google.android.libraries.search.assistant.proactive.b.b(c.b(this.kJ), c.b(this.kK));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.proactive.d.a iC() {
        return new com.google.android.libraries.search.assistant.proactive.d.a((com.google.android.libraries.g.a) this.f.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.proactive.f.h iD() {
        bx iA = iA();
        com.google.android.libraries.assistant.contexttrigger.g.l gm = gm();
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.proactive.f.h(iA, gm, joVar.kr(), joVar.kq(), (com.google.android.libraries.search.assistant.proactive.storage.y) joVar.im.a(), this.f.b.aB(), (com.google.android.libraries.assistant.pcp.h.e) this.cl.a(), gM(), kK(), (com.google.android.libraries.search.assistant.proactive.h.c) this.f.in.a(), (com.google.common.v.f) this.f.ez.a(), (ag) this.f.Q.a());
    }

    final com.google.android.libraries.search.assistant.proactive.f.k iE() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.proactive.f.k(joVar.kr(), (com.google.android.libraries.search.account.b.b) joVar.gd.a(), (AccountId) this.g.a(), (com.google.android.libraries.search.assistant.proactive.h.c) this.f.in.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.ao.c.l iF() {
        return new com.google.android.libraries.search.assistant.ao.c.l(hz());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.ao.d.e iG() {
        return new com.google.android.libraries.search.assistant.ao.d.e(hR());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.ao.e.a.m iH() {
        return new com.google.android.libraries.search.assistant.ao.e.a.m(qg(), io.grpc.h.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aq.b.a.f iI() {
        return new com.google.android.libraries.search.assistant.aq.b.a.f(this.P, this.f.H);
    }

    public final com.google.android.libraries.search.assistant.aq.h.b.v iJ() {
        jr jrVar = this.f.b;
        com.google.android.libraries.search.assistant.aq.h.b.p aD = jrVar.aD();
        com.google.android.libraries.search.assistant.aq.h.b.s ie = jrVar.ie();
        com.google.android.libraries.search.assistant.aq.h.b.s ij = jrVar.ij();
        com.google.android.libraries.search.assistant.aq.h.b.p id = jrVar.id();
        com.google.android.libraries.search.assistant.aq.h.b.p ia = jrVar.ia();
        com.google.android.libraries.search.assistant.aq.h.b.i iVar = new com.google.android.libraries.search.assistant.aq.h.b.i(this.aa, this.q, this.f.H);
        jr jrVar2 = this.f.b;
        return new com.google.android.libraries.search.assistant.aq.h.b.v(aD, ie, ij, id, ia, iVar, jrVar2.ii(), jrVar2.aE(), (com.google.android.libraries.search.assistant.aq.h.d.e) jrVar2.bR.a(), (cq) this.f.H.a(), this.f.b.aF());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aq.j.g iK() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.aq.j.g((k.a.a) joVar.Y, (k.a.a) this.Y, (k.a.a) this.jG, (k.a.a) this.jc, (k.a.a) this.ck, (k.a.a) this.jH, (k.a.a) joVar.bo, (k.a.a) joVar.R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aq.l.j iL() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.aq.l.j(joVar.f, this.Y, joVar.ez, this.jc, this.ck, this.jd, this.je, this.jf, this.jg, this.u, this.jh, joVar.bo, joVar.R, joVar.tr);
    }

    @Override // com.google.android.libraries.search.assistant.aq.q.c
    public final com.google.android.libraries.search.assistant.aq.q.b iM() {
        return (com.google.android.libraries.search.assistant.aq.q.b) this.jy.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aq.q.a.e iN() {
        return new com.google.android.libraries.search.assistant.aq.q.a.e(this.f.v, this.jy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aw.g.a.f iO() {
        return new com.google.android.libraries.search.assistant.aw.g.a.f(this.kr, this.f.b.bU, this.ks, this.dp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aw.h.a iP() {
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.iO().a.a()).a("com.google.android.apps.search.assistant.device 45618185").f();
        com.google.android.libraries.search.assistant.aw.h.a aVar = (ig) this.kq.a();
        com.google.android.libraries.search.assistant.aw.h.a jVar = new com.google.android.libraries.search.assistant.aw.h.a.j(this.kt, this.dp, this.f.H);
        if (true != f) {
            aVar = jVar;
        }
        aVar.getClass();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aw.k.a.e iQ() {
        h hVar = this.dn;
        h hVar2 = this.kp;
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.aw.k.a.e(hVar, hVar2, joVar.b.aE, joVar.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.aw.l.a.c iR() {
        return new com.google.android.libraries.search.assistant.aw.l.a.c(this.dp, this.f.H, this.dt, this.dv, this.ku);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.az.a.b.a.a.a.a.a iS() {
        return new com.google.android.libraries.search.assistant.az.a.b.a.a.a.a.a((Context) this.f.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.az.a.b.a.a.c.a iT() {
        return new com.google.android.libraries.search.assistant.az.a.b.a.a.c.a(this.f.b.gg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.b iU() {
        return new com.google.android.libraries.search.assistant.az.a.b.a.b.b.a.b((com.google.android.libraries.assistant.c.b.c.v) this.em.a(), (com.google.android.libraries.assistant.c.b.a.a.a) this.f.f319a.dD.a(), (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.az.a.b.a.c.i iV() {
        return new com.google.android.libraries.search.assistant.az.a.b.a.c.i((com.google.android.libraries.search.t.a.a) this.J.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.az.a.b.a.c.a.a.d iW() {
        Executor executor = (Executor) this.f.H.a();
        Context context = (Context) this.f.f.a();
        com.google.android.libraries.search.assistant.az.a.b.a.c.i iV = iV();
        AccountId accountId = (AccountId) this.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f.bq.a();
        return new com.google.android.libraries.search.assistant.az.a.b.a.c.a.a.d(executor, context, iV, new com.google.android.libraries.search.assistant.az.a.b.a.c.a.a.h(accountId, dVar, (Context) this.f.f.a(), (Executor) this.f.v.a(), (Executor) this.f.H.a()), (com.google.common.v.f) this.f.ez.a());
    }

    public final com.google.android.libraries.search.assistant.bb.d.a.g iX() {
        return new com.google.android.libraries.search.assistant.bb.d.a.g((Executor) this.f.H.a(), (ag) this.f.Q.a(), (cg) this.iQ.a(), (ay) this.f.iu.a());
    }

    @Override // com.google.android.apps.search.googleapp.discover.expeditions.features.media.service.b$a
    public final com.google.android.libraries.search.f.g iY() {
        return this.gF.f308a.eI();
    }

    @Override // com.google.android.libraries.search.l.c.i.a
    public final com.google.android.libraries.search.l.b iZ() {
        iz izVar = this.gF.b;
        com.google.android.libraries.search.l.aa aaVar = (com.google.android.libraries.search.l.aa) izVar.f311a.vL.a();
        AccountId accountId = (AccountId) izVar.b.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a();
        return new com.google.android.libraries.search.l.b(aaVar, accountId, dVar, (cq) izVar.f311a.v.a());
    }

    @Override // com.google.android.libraries.search.assistant.invocation.p.q
    public final com.google.android.libraries.search.assistant.invocation.p.bx ia() {
        return (com.google.android.libraries.search.assistant.invocation.p.bx) this.gF.f308a.fC.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.r.a.k
    public final com.google.android.libraries.search.assistant.invocation.t.a.c ib() {
        return (com.google.android.libraries.search.assistant.invocation.t.a.c) this.bs.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.invocation.u.b.c.w ic() {
        return new com.google.android.libraries.search.assistant.invocation.u.b.c.w(new com.google.android.libraries.search.assistant.invocation.u.b.a.t((lt) this.iU.a(), (com.google.android.libraries.search.assistant.invocation.u.a.g) this.iV.a(), (ag) this.f.Q.a(), (n) this.f.R.a()), (lt) this.iW.a());
    }

    @Override // com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.af
    public final com.google.android.libraries.search.assistant.ad.f id() {
        return (com.google.android.libraries.search.assistant.ad.f) this.ea.a();
    }

    final com.google.android.libraries.search.assistant.ae.a.a.o ie() {
        return new com.google.android.libraries.search.assistant.ae.a.a.o((com.google.android.libraries.search.assistant.ae.a.a.r) this.iB.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: if, reason: not valid java name */
    public final com.google.android.libraries.search.assistant.notification.a.a.k m112if() {
        Context context = (Context) this.f.f.a();
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.notification.a.a.k(context, new com.google.android.libraries.search.assistant.notification.b.h(joVar.f, this.iJ, joVar.H), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.notification.c.b ig() {
        return new com.google.android.libraries.search.assistant.notification.c.b((Context) this.f.f.a(), (com.google.apps.tiktok.g.p) this.aa.a(), (Executor) this.f.H.a());
    }

    public final com.google.android.libraries.search.assistant.ai.b.h.b ih() {
        return new com.google.android.libraries.search.assistant.ai.b.h.b(new com.google.android.libraries.search.assistant.ai.b.f.a(c.b(this.f.W)), (com.google.android.libraries.search.assistant.ai.b.c.c) this.f.b.aI.a(), (com.google.android.libraries.g.a) this.f.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.ai.c.l ii() {
        return new com.google.android.libraries.search.assistant.ai.c.l((Context) this.f.f.a(), (com.google.android.libraries.search.assistant.ai.c.a.a.f) this.iq.a(), ih(), (ag) this.f.Q.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.w$a
    public final com.google.android.libraries.search.assistant.aj.b.c ij() {
        return (com.google.android.libraries.search.assistant.aj.b.c) this.gF.f308a.bX.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.bn.c
    public final com.google.android.libraries.search.assistant.aj.e.a.a ik() {
        return (com.google.android.libraries.search.assistant.aj.e.a.a) this.gF.f308a.t.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.communication.a.a.m il() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.communication.a.a.m(joVar.f, joVar.v, this.aU, this.aa, joVar.g, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.communication.c.a.g im() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.communication.c.a.g(joVar.H, joVar.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.communication.c.b.c in() {
        return new com.google.android.libraries.search.assistant.performer.communication.c.b.c((Context) this.f.f.a(), (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.communication.c.b.g io() {
        return new com.google.android.libraries.search.assistant.performer.communication.c.b.g((com.google.android.libraries.search.assistant.ai.a.j) this.bm.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.d.e$a
    public final com.google.android.libraries.search.assistant.performer.deviceactions.i ip() {
        return (com.google.android.libraries.search.assistant.performer.deviceactions.i) this.dz.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.deviceactions.ah iq() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.deviceactions.ah(joVar.h, joVar.f, this.kY, joVar.H, this.eI);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.deviceactions.a.a.h ir() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.h(joVar.f, this.aa, joVar.v, joVar.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.deviceactions.a.a.al is() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.deviceactions.a.a.al(joVar.f, joVar.H, joVar.f319a.hu);
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.f.k$a
    public final com.google.android.libraries.search.assistant.performer.h.m it() {
        return (com.google.android.libraries.search.assistant.performer.h.m) this.dA.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.i.b$a
    public final com.google.android.libraries.search.assistant.performer.l.h iu() {
        return (com.google.android.libraries.search.assistant.performer.l.h) this.dB.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.i.f$a
    public final com.google.android.libraries.search.assistant.performer.l.n iv() {
        return new com.google.android.libraries.search.assistant.performer.l.n((com.google.android.libraries.search.assistant.performer.l.ac) this.f.b.fc(), (AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.android.libraries.search.t.i.y) this.f.W.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.ac iw() {
        return new com.google.android.libraries.search.assistant.performer.l.ac(this.kZ);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.af ix() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.l.af(joVar.h, joVar.f);
    }

    @Override // com.google.android.libraries.search.assistant.proactive.bb
    public final com.google.android.libraries.search.assistant.proactive.k iy() {
        return (com.google.android.libraries.search.assistant.proactive.k) this.hY.a();
    }

    final com.google.android.libraries.search.assistant.proactive.ac iz() {
        Context context = (Context) this.f.f.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f.bN.a();
        AccountId accountId = (AccountId) this.g.a();
        AlarmManager alarmManager = (AlarmManager) this.f.f319a.dV.a();
        com.google.android.libraries.search.assistant.proactive.storage.b bVar2 = (com.google.android.libraries.search.assistant.proactive.storage.b) this.f.b.ag.a();
        com.google.android.libraries.search.assistant.proactive.c cVar = new com.google.android.libraries.search.assistant.proactive.c((Context) this.f.f.a(), (Executor) this.f.v.a(), (com.google.android.libraries.search.location.b) qs(), this.f.kr());
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.proactive.ac(context, bVar, accountId, alarmManager, bVar2, cVar, joVar.f319a.dV(), (com.google.android.libraries.search.assistant.proactive.h.c) joVar.in.a(), (Executor) this.f.v.a(), (com.google.common.v.f) this.f.ez.a(), this.f.kr());
    }

    @Override // com.google.android.apps.gsa.assistant.settings.d.m$a, com.google.android.libraries.search.integrations.p.a.a
    public final com.google.android.libraries.web.contrib.account.internal.o j() {
        return (com.google.android.libraries.web.contrib.account.internal.o) this.da.a();
    }

    @Override // com.google.android.apps.search.googleapp.pixelsearchbox.receiver.b$a
    public final com.google.android.libraries.search.t.c.ak jA() {
        return (com.google.android.libraries.search.t.c.ak) this.gF.f308a.aQ.a();
    }

    @Override // com.google.android.apps.search.googleapp.bubbles.trampoline.a$a
    public final com.google.android.libraries.search.rendering.xuikit.bubbles.k jB() {
        return (com.google.android.libraries.search.rendering.xuikit.bubbles.k) this.gF.f308a.cr.a();
    }

    @Override // com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.a$a
    public final com.google.android.libraries.search.ac.b.g.b.d jC() {
        return this.gF.f308a.fh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.ah.b.e.f jD() {
        return new com.google.android.libraries.search.ah.b.e.f(Optional.of((com.google.android.libraries.speech.c.b.ae) this.dc.a()), Optional.of((com.google.android.libraries.speech.c.b.i) this.db.a()), Optional.empty(), (Cdo) this.f.mp.a(), (Optional) this.dd.a(), (com.google.android.libraries.search.ah.b.e.an) qF(), (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.ah.b.e.g jE() {
        return new com.google.android.libraries.search.ah.b.e.g((com.google.android.libraries.search.ah.b.e.an) qF());
    }

    @Override // com.google.android.libraries.search.ah.e.a.e.n.a
    public final com.google.android.libraries.search.ah.i.c jF() {
        return this.gF.b.de();
    }

    @Override // com.google.android.apps.gsa.languagepack.bj$a
    public final com.google.android.libraries.search.ah.i.e.f jG() {
        return new com.google.android.libraries.search.ah.i.e.f(this.ka, e.c.l.a, this.kg, (cr) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.ah.i.e.a.a jH() {
        return new com.google.android.libraries.search.ah.i.e.a.a(jG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.ai.x jI() {
        com.google.android.libraries.search.ai.d dVar = (com.google.android.libraries.search.ai.d) this.al.a();
        h hVar = this.Z;
        com.google.android.libraries.search.ai.d afZ = this.f.afZ();
        com.google.android.apps.search.assistant.platform.g.k.a.d dVar2 = (com.google.android.apps.search.assistant.platform.g.k.a.d) hVar.a();
        jo joVar = this.f;
        return new com.google.android.libraries.search.ai.x(dVar, afZ, dVar2, joVar.lC(), (Context) joVar.f.a());
    }

    @Override // com.google.android.libraries.search.trust.dma.a
    public final com.google.android.libraries.search.trust.dma.k jJ() {
        iz izVar = this.gF.b;
        return new com.google.android.libraries.search.trust.dma.k((com.google.br.f.e.a.a.h) izVar.f311a.kF.a(), (AccountId) izVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a(), izVar.b.f308a.fu(), (com.google.apps.tiktok.account.data.b) izVar.f311a.bN.a(), (n) izVar.f311a.P.a(), (ag) izVar.f311a.Q.a());
    }

    final com.google.android.libraries.search.trust.b.c jK() {
        return new com.google.android.libraries.search.trust.b.c((com.google.android.libraries.phenotype.client.a.i) this.f.x.a(), (cq) this.f.v.a());
    }

    @Override // com.google.android.libraries.search.trust.a.a$a
    public final com.google.android.libraries.search.trust.b.y jL() {
        return (com.google.android.libraries.search.trust.b.y) this.W.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.trust.b.aj jM() {
        return new com.google.android.libraries.search.trust.b.aj((cg) this.T.a(), (cg) this.U.a(), (Executor) this.f.H.a(), jO(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (AccountId) this.g.a(), (com.google.common.v.f) this.f.ez.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.trust.b.a.a jN() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.INFRASTRUCTURE);
        a2.getClass();
        return new com.google.android.libraries.search.trust.b.a.a(a2);
    }

    final com.google.android.libraries.search.trust.d.h jO() {
        return new com.google.android.libraries.search.trust.d.h((Executor) this.f.H.a(), com.google.android.libraries.search.trust.c.j.b((com.google.android.libraries.search.trust.c.m) this.M.a()), this.f.b.io().d(), jX(), (com.google.android.libraries.search.trust.c.t) this.f.wH.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.udcdataservice.facs.j jP() {
        return new com.google.android.libraries.search.udcdataservice.facs.j(c.b(this.f.kE), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (cq) this.f.v.a(), (AccountId) this.g.a(), (com.google.android.libraries.search.t.i.y) this.f.W.a(), this.f.f319a.ez());
    }

    @Override // com.google.android.libraries.search.udcdataservice.ulr.f$a
    public final com.google.android.libraries.search.udcdataservice.ulr.k jQ() {
        return new com.google.android.libraries.search.udcdataservice.ulr.k((com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (AccountId) this.g.a(), (cq) this.f.v.a(), (cq) this.f.H.a(), (cg) this.kN.a(), (com.google.android.gms.location.reporting.d) this.f.b.fW.a(), (com.google.android.libraries.search.t.i.y) this.f.W.a(), this.f.f319a.ez());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.speech.c.b.h.d jR() {
        return new com.google.android.libraries.speech.c.b.h.d(this.kb, this.kc, e.c.l.a, (cr) this.f.H.a());
    }

    @Override // com.google.android.libraries.web.a.a.c.a
    public final com.google.android.libraries.web.a.a.c jS() {
        return (com.google.android.libraries.web.a.a.c) this.hf.a();
    }

    @Override // com.google.android.libraries.web.contrib.h.a.p
    public final com.google.android.libraries.web.contrib.h.a.o jT() {
        return new com.google.android.libraries.web.contrib.h.a.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.web.o.j jU() {
        return new com.google.android.libraries.web.o.j((com.google.android.libraries.web.a.a.a) this.f.f319a.ga.a(), (com.google.android.libraries.web.a.a.c) this.hf.a(), new op(new com.google.android.libraries.search.account.e.o(Optional.of((com.google.android.libraries.search.account.e.b) this.u.a()), (ag) this.f.bo.a())), jY(), (com.google.android.libraries.web.o.u) this.s.a(), (ag) this.f.Q.a(), (n) this.f.wS.a(), (n) this.f.R.a(), (Context) this.f.f.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.w.p$a
    public final com.google.android.libraries.web.o.u jV() {
        return (com.google.android.libraries.web.o.u) this.s.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.w.f$a
    public final com.google.android.libraries.web.o.a.a.a jW() {
        return jX();
    }

    public final com.google.android.libraries.web.o.a.a.a.r jX() {
        return new com.google.android.libraries.web.o.a.a.a.r((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (Context) this.f.f.a(), (nz) this.K.a(), new com.google.android.libraries.web.o.a.a.a.c((AccountId) this.g.a(), (n) this.f.bt.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), this.f.f319a.rp()), (com.google.android.libraries.web.a.a.c) this.hf.a(), (n) this.f.P.a(), (ag) this.f.Q.a(), this.t, jY(), (kotlinx.coroutines.i.d) this.f.b.r.a());
    }

    final com.google.android.libraries.web.o.a.a.a.ac jY() {
        return new com.google.android.libraries.web.o.a.a.a.ac((AccountId) this.g.a(), (com.google.android.libraries.g.a) this.f.g.a(), (com.google.android.libraries.web.a.a.c) this.hf.a(), (com.google.android.libraries.web.o.u) this.s.a(), (n) this.f.P.a(), c.b(this.f.b.q), (cg) this.hg.a());
    }

    @Override // com.google.android.libraries.search.integrations.p.a.a
    public final com.google.android.libraries.web.o.a.b.a.c jZ() {
        return this.gF.b.df();
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.g.b, com.google.android.apps.search.assistant.surfaces.appactions.service.e, com.google.android.apps.search.assistant.surfaces.dictation.service.z.y, com.google.android.apps.search.assistant.verticals.automation.routines.c.m$a, com.google.android.apps.search.assistant.verticals.automation.routines.e.n$a, com.google.android.apps.search.assistant.verticals.automation.routines.g.s, com.google.android.apps.search.assistant.verticals.newsplayer.f.d$a, com.google.android.apps.search.assistant.verticals.reminders.e.a, com.google.android.libraries.search.assistant.serviceengine.discovery.c.h$a
    public final p ja() {
        return (p) this.P.a();
    }

    @Override // com.google.android.apps.search.googleapp.q.a
    public final p jb() {
        return this.gF.f308a.eJ();
    }

    @Override // com.google.android.libraries.lens.view.geller.d
    public final p jc() {
        return this.gF.f308a.eK();
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.b.a.h.a, com.google.android.apps.search.assistant.platform.g.m.b.e.a, com.google.android.apps.search.assistant.surfaces.voice.j.a.d.g.a, com.google.android.apps.search.assistant.surfaces.voice.j.a.d.v$a, com.google.android.apps.search.assistant.surfaces.voice.j.a.d.s.a
    public final p jd() {
        return (p) this.P.a();
    }

    @Override // com.google.android.libraries.search.ai.y.a, com.google.android.libraries.search.ai.ab
    public final com.google.android.libraries.search.l.q je() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.l.q(joVar.vL, this.g, joVar.bq, joVar.H, joVar.v);
    }

    @Override // com.google.android.libraries.search.l.e.c
    public final com.google.android.libraries.search.l.e.e jf() {
        return (com.google.android.libraries.search.l.e.e) this.gF.b.c.a();
    }

    @Override // com.google.android.libraries.search.l.e.k
    public final com.google.android.libraries.search.l.e.j jg() {
        iz izVar = this.gF.b;
        cq cqVar = (cq) izVar.f311a.H.a();
        jo joVar = izVar.f311a;
        Set Zi = joVar.Zi();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) joVar.bq.a();
        com.google.android.libraries.search.l.aa aaVar = (com.google.android.libraries.search.l.aa) izVar.f311a.vL.a();
        jo joVar2 = izVar.f311a;
        Map XO = joVar2.XO();
        Set Zi2 = joVar2.Zi();
        Map Xu = joVar2.Xu();
        cq cqVar2 = (cq) joVar2.H.a();
        cq cqVar3 = (cq) izVar.f311a.v.a();
        cq cqVar4 = (cq) izVar.f311a.n.a();
        jo joVar3 = izVar.f311a;
        Map XJ = joVar3.XJ();
        com.google.android.libraries.geller.portable.ae aeVar = (com.google.android.libraries.geller.portable.ae) joVar3.lK.a();
        jo joVar4 = izVar.f311a;
        return new com.google.android.libraries.search.l.e.j(cqVar, Zi, dVar, new com.google.android.libraries.search.l.ai(aaVar, XO, Zi2, Xu, cqVar2, cqVar3, cqVar4, XJ, aeVar, joVar4.adO(), h.a.a.as.a.a.h.d(joVar4.V)), (com.google.android.libraries.search.l.e.e) izVar.c.a(), izVar.f311a.iL(), (AccountId) izVar.b.g.a(), (com.google.android.gms.pseudonymous.f) izVar.f311a.bA.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.m.b jh() {
        cg cgVar = (cg) this.hc.a();
        com.google.protos.u.d d = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.omnient 45630651").d();
        com.google.protos.u.h d2 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.omnient 45630652").d();
        com.google.protos.l.a.e d3 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.omnient 45645411").d();
        cgVar.getClass();
        cb cbVar = d3.b;
        cbVar.getClass();
        return new com.google.android.libraries.search.m.b(cgVar, d, d2, cbVar);
    }

    @Override // com.google.android.libraries.search.p.a$a
    public final com.google.android.libraries.search.p.e ji() {
        return (com.google.android.libraries.search.p.e) this.gF.b.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.integrations.c.a.e jj() {
        return new com.google.android.libraries.search.integrations.c.a.e((Context) this.f.f.a(), (cq) this.f.v.a());
    }

    @Override // com.google.android.libraries.lens.sdk.avs.c
    public final com.google.android.libraries.search.lens.query.b.av jk() {
        return (com.google.android.libraries.search.lens.query.b.av) this.gF.f308a.ez.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.location.m jl() {
        return new com.google.android.libraries.search.location.m(this.f.f319a.sf(), (com.google.android.libraries.search.location.y) this.O.a(), (Context) this.f.f.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.location.ac jm() {
        return new com.google.android.libraries.search.location.ac((com.google.android.libraries.search.location.y) this.O.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.location.compliance.at jn() {
        cr crVar = (cr) this.f.H.a();
        cr crVar2 = (cr) this.f.v.a();
        com.google.android.gms.auth.k kVar = (com.google.android.gms.auth.k) this.f.bx.a();
        h hVar = this.hh;
        com.google.android.libraries.search.trust.d.h jO = jO();
        com.google.android.libraries.search.location.compliance.a.f fVar = new com.google.android.libraries.search.location.compliance.a.f((cg) hVar.a(), (com.google.android.libraries.g.a) this.f.g.a());
        AccountId accountId = (AccountId) this.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) this.f.bq.a();
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) this.f.bN.a();
        com.google.android.libraries.search.t.a.a aVar = (com.google.android.libraries.search.t.a.a) this.J.a();
        jo joVar = this.f;
        return new com.google.android.libraries.search.location.compliance.at(crVar, crVar2, kVar, jO, fVar, accountId, dVar, bVar, aVar, joVar.li(), (com.google.android.gms.common.e) joVar.b.s.a(), (Context) this.f.f.a());
    }

    public final com.google.android.libraries.search.location.compliance.c.a jo() {
        return new com.google.android.libraries.search.location.compliance.c.a((Context) this.f.f.a());
    }

    @Override // com.google.android.apps.search.googleapp.launcher.c.a.a$a
    public final com.google.android.libraries.search.t.a.a jp() {
        return (com.google.android.libraries.search.t.a.a) this.J.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.c.a, com.google.android.libraries.search.t.a.a.d.c$a
    public final com.google.android.libraries.search.t.a.a jq() {
        return (com.google.android.libraries.search.t.a.a) this.J.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.t.c.f jr() {
        return new com.google.android.libraries.search.t.c.f((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.b) this.f.bN.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), kc(), Optional.of((com.google.android.libraries.search.account.e.b) this.u.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.t.c.k js() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.t.c.k(joVar.Q, joVar.bl, joVar.f, joVar.bj, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.t.c.u jt() {
        return new com.google.android.libraries.search.t.c.u(jv(), (com.google.android.libraries.search.t.c.j) this.C.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.t.c.u ju() {
        return new com.google.android.libraries.search.t.c.u(jv(), (com.google.android.libraries.search.t.c.j) this.f.uX.a());
    }

    final com.google.android.libraries.search.t.c.aj jv() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.t.c.aj(joVar.f, joVar.Q, joVar.bc, this.v, this.r, joVar.be, joVar.bf, joVar.bh, this.B, joVar.bi, joVar.bj);
    }

    @Override // com.google.android.apps.search.assistant.surfaces.notification.ag$a
    public final com.google.android.libraries.search.t.c.ak jw() {
        com.google.android.libraries.search.t.c.u jt = this.gF.f308a.b.jt();
        com.google.android.libraries.search.t.c cVar = com.google.android.libraries.search.t.c.ROBIN_ANDROID;
        cVar.getClass();
        return jt.a(cVar, null);
    }

    @Override // com.google.android.apps.gsa.smartspace.b.z
    public final com.google.android.libraries.search.t.c.ak jx() {
        return (com.google.android.libraries.search.t.c.ak) this.ae.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.j.j
    public final com.google.android.libraries.search.t.c.ak jy() {
        com.google.android.libraries.search.t.c.u jt = this.gF.f308a.b.jt();
        com.google.android.libraries.search.t.c cVar = com.google.android.libraries.search.t.c.BISTO;
        cVar.getClass();
        return jt.a(cVar, null);
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.e.g.a
    public final com.google.android.libraries.search.t.c.ak jz() {
        com.google.android.libraries.search.t.c.u jt = this.gF.f308a.b.jt();
        com.google.android.libraries.search.t.c cVar = com.google.android.libraries.search.t.c.BISTO;
        cVar.getClass();
        return jt.a(cVar, null);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.a.f$a
    public final cg k() {
        return (cg) this.iD.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kA() {
        com.google.android.libraries.web.n.b bVar = (com.google.android.libraries.web.n.b) this.f.uF.a();
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "SignedOutUserPrefsDataStore";
        a2.c(com.google.android.libraries.search.trust.b.ak.a);
        a2.b = com.google.common.base.at.k(new com.google.android.libraries.search.trust.b.z(bVar, 3));
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kB() {
        com.google.android.libraries.web.n.b bVar = (com.google.android.libraries.web.n.b) this.f.uF.a();
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "UserSettings";
        a2.c(com.google.android.libraries.search.trust.b.ao.a);
        a2.b = com.google.common.base.at.k(new com.google.android.libraries.search.trust.b.z(bVar, 2));
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kC() {
        final com.google.android.libraries.web.n.b bVar = (com.google.android.libraries.web.n.b) this.f.uF.a();
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "ZwiebackIdentity";
        a2.c(com.google.android.libraries.search.account.e.a.a.f3624a);
        a2.b = com.google.common.base.at.k(new com.google.common.util.concurrent.q(bVar) { // from class: com.google.android.libraries.search.account.e.m

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.libraries.web.n.b f3628a;

            {
                this.f3628a = bVar;
            }

            public final cn a() {
                return dl.n(this.f3628a.a());
            }
        });
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.tracing.contrib.a.c.b.a.a.b kD() {
        return new com.google.apps.tiktok.tracing.contrib.a.c.b.a.a.b((dj) this.q.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.g.e.h.a.ay kE() {
        com.google.g.e.h.a.ay ayVar;
        try {
        } catch (RuntimeException e) {
            a.a.dB(com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.e.a.a.e(), "Keyguard manager throws exception while fetching keyguard secure status", (char) 48474, e);
        }
        if (((KeyguardManager) this.f.nn.a()).isKeyguardSecure()) {
            ayVar = com.google.g.e.h.a.ay.b;
            ayVar.getClass();
            return ayVar;
        }
        ayVar = com.google.g.e.h.a.ay.c;
        ayVar.getClass();
        return ayVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final az kF() {
        az azVar = ((Boolean) this.f.b.hb.a()).booleanValue() ? az.c : ((KeyguardManager) this.f.nn.a()).isDeviceLocked() ? az.b : az.c;
        azVar.getClass();
        return azVar;
    }

    final be kG() {
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45362388").f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        com.google.protobuf.ba createBuilder = be.a.createBuilder();
        createBuilder.copyOnWrite();
        be beVar = createBuilder.instance;
        beVar.b |= 1;
        beVar.c = "contact.LOOKUP";
        createBuilder.copyOnWrite();
        be beVar2 = createBuilder.instance;
        beVar2.b |= 2;
        beVar2.d = 1;
        if (f) {
            com.google.protobuf.ba createBuilder2 = ei.a.createBuilder();
            createBuilder2.copyOnWrite();
            ei eiVar = createBuilder2.instance;
            eiVar.b |= 1;
            eiVar.c = "assistant.api.client_op.properties.ContactLookupProperty";
            com.google.protobuf.ba createBuilder3 = gf.a.createBuilder();
            createBuilder3.copyOnWrite();
            gf gfVar = createBuilder3.instance;
            gfVar.b |= 1;
            gfVar.c = true;
            com.google.protobuf.v byteString = createBuilder3.build().toByteString();
            createBuilder2.copyOnWrite();
            ei eiVar2 = createBuilder2.instance;
            byteString.getClass();
            eiVar2.b |= 2;
            eiVar2.d = byteString;
            ei build = createBuilder2.build();
            createBuilder.copyOnWrite();
            be beVar3 = createBuilder.instance;
            build.getClass();
            beVar3.e = build;
            beVar3.b |= 4;
        }
        be build2 = createBuilder.build();
        build2.getClass();
        return build2;
    }

    final be kH() {
        boolean booleanValue = ((Boolean) this.f.b.hi.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        com.google.protobuf.ba createBuilder = be.a.createBuilder();
        createBuilder.copyOnWrite();
        be beVar = createBuilder.instance;
        int i2 = 1;
        beVar.b |= 1;
        beVar.c = "credential.UPDATE";
        if (true == booleanValue) {
            i2 = 2;
        }
        createBuilder.copyOnWrite();
        be beVar2 = createBuilder.instance;
        beVar2.b = 2 | beVar2.b;
        beVar2.d = i2;
        be build = createBuilder.build();
        build.getClass();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.g.ab.d.b.x kI() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45617759").d();
    }

    public final com.google.g.af.d.b kJ() {
        com.google.g.af.d.b I = io.grpc.j.c.g(new com.google.g.af.d.a(), com.google.apps.tiktok.p.y.b(this.V, (com.google.apps.tiktok.p.m) this.f.b.O.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a), io.grpc.h.a).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f.mh.a()});
        I.getClass();
        return I;
    }

    final com.google.g.af.d.e kK() {
        com.google.g.af.d.e I = new com.google.g.af.d.e(com.google.apps.tiktok.p.y.b(this.V, (com.google.apps.tiktok.p.m) this.f.b.O.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f.mh.a()});
        I.getClass();
        return I;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final com.google.common.base.at kL() {
        return com.google.common.base.at.k((com.google.android.libraries.assistant.auto.tng.a.b.s) this.aw.a());
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.g.b
    public final com.google.common.base.at kM() {
        return com.google.common.base.at.k((com.google.android.apps.search.assistant.libraries.dictation.e.g) this.gF.f308a.bp.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.notification.ag$a, com.google.android.libraries.search.assistant.proactive.ao
    public final com.google.common.base.at kN() {
        return com.google.common.base.at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.x.g) this.gF.f308a.y.a());
    }

    @Override // com.google.apps.tiktok.experiments.phenotype.cx
    public final com.google.common.base.at kO() {
        return com.google.common.base.a.a;
    }

    @Override // com.google.android.apps.search.assistant.surfaces.notification.ag$a, com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$c, com.google.android.libraries.search.assistant.proactive.ao, com.google.android.libraries.search.assistant.proactive.by
    public final com.google.common.base.at kP() {
        return com.google.common.base.at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.ar.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.notification.ag$a
    public final com.google.common.base.at kQ() {
        return (com.google.common.base.at) this.gF.f308a.v.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fl kR() {
        fl m = fl.m(((com.google.protos.l.a.e) this.fe.a()).b);
        m.getClass();
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.frameworks.client.data.android.a.p kS() {
        String str = (String) Optional.empty().orElse("AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
        str.getClass();
        return com.google.android.libraries.assistant.assistantactions.rendering.b.f.ap("https://www.googleapis.com/auth/assistant", str);
    }

    @Override // com.google.android.libraries.assistant.auto.tng.z.a.b.d
    public final com.google.frameworks.client.data.android.d.f kT() {
        return (com.google.frameworks.client.data.android.d.f) this.gF.f308a.fi.a();
    }

    @Override // com.google.android.libraries.assistant.auto.tng.z.a.b.d
    public final com.google.frameworks.a.a.a.a.b kU() {
        jj jjVar = this.gF.f308a;
        com.google.frameworks.a.a.a.a.b I = io.grpc.j.c.g(new com.google.frameworks.a.a.a.a.a(), com.google.apps.tiktok.p.y.b(jjVar.b.V, (com.google.apps.tiktok.p.m) jjVar.f316a.b.fB.a(), (com.google.frameworks.client.data.android.d) jjVar.f316a.mb.a(), com.google.common.base.a.a), io.grpc.h.a).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) jjVar.f316a.mh.a()});
        I.getClass();
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.frameworks.a.a.a.a.e kV() {
        com.google.frameworks.a.a.a.a.e I = new com.google.frameworks.a.a.a.a.e(com.google.apps.tiktok.p.y.b(this.V, (com.google.apps.tiktok.p.m) this.f.b.bS.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f.mh.a()});
        I.getClass();
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.at.f.a.i kW() {
        com.google.at.f.a.i I = io.grpc.j.c.g(new com.google.at.f.a.h(), com.google.apps.tiktok.p.y.b(this.V, (com.google.apps.tiktok.p.m) this.f.b.t.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a), io.grpc.h.a).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) this.f.mh.a()});
        I.getClass();
        return I;
    }

    @Override // com.google.android.libraries.user.profile.a.c.a.d
    public final com.google.aw.c.a.l kX() {
        iz izVar = this.gF.b;
        com.google.aw.c.a.l I = new com.google.aw.c.a.l(com.google.apps.tiktok.p.y.b(izVar.b.V, (com.google.apps.tiktok.p.m) izVar.f311a.b.fX.a(), (com.google.frameworks.client.data.android.d) izVar.f311a.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) izVar.f311a.mh.a()});
        I.getClass();
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao kY() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645564").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao kZ() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45624113").d();
    }

    public final com.google.android.libraries.web.webview.a.x ka() {
        return new com.google.android.libraries.web.webview.a.x((AccountId) this.g.a(), new com.google.android.libraries.web.webview.a.m((AccountId) this.g.a(), (com.google.android.libraries.web.a.a.c) this.hf.a(), (com.google.android.libraries.web.o.w) this.f.f319a.fW.a(), (cg) this.f.f319a.fY.a(), (kotlinx.coroutines.i.d) this.f.f319a.fZ.a(), (ag) this.f.Q.a()), jU(), (com.google.android.libraries.web.a.a.a) this.f.f319a.ga.a(), (com.google.android.libraries.web.a.a.c) this.hf.a(), (com.google.android.libraries.web.webview.a.f) this.f.f319a.gb.a(), (com.google.android.libraries.web.o.w) this.f.f319a.fW.a(), (cg) this.f.f319a.fY.a(), (kotlinx.coroutines.i.d) this.f.f319a.fZ.a(), (com.google.android.libraries.web.base.a.c.b) this.cZ.a(), (n) this.f.P.a(), (ag) this.f.Q.a());
    }

    public final com.google.apps.tiktok.account.data.b.c kc() {
        return new com.google.apps.tiktok.account.data.b.c((com.google.apps.tiktok.account.data.b) this.f.bN.a(), (AccountId) this.g.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.account.d.f kd() {
        return new com.google.apps.tiktok.account.d.f((com.google.apps.tiktok.q.a.a) this.f.am.a(), (AccountId) this.g.a(), (cq) this.f.v.a());
    }

    public final com.google.apps.tiktok.account.d.f ke() {
        return new com.google.apps.tiktok.account.d.f((com.google.apps.tiktok.q.a.a) this.f.am.a(), (AccountId) this.g.a(), (cq) this.f.n.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.account.d.b.f kf() {
        Context context = (Context) this.f.f.a();
        com.google.apps.tiktok.account.d.f kd = kd();
        jo joVar = this.f;
        return new com.google.apps.tiktok.account.d.b.f(context, kd, joVar.v, joVar.H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.account.d.b.a.b kg() {
        return new com.google.apps.tiktok.account.d.b.a.b((Context) this.f.f.a(), kd(), this.f.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.account.d.c.b kh() {
        return new com.google.apps.tiktok.account.d.c.b((Context) this.f.f.a(), (AccountId) this.g.a(), kd(), (cq) this.f.v.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.settings.features.main.a.f$a
    public final com.google.apps.tiktok.cache.o ki() {
        return (com.google.apps.tiktok.cache.o) this.gF.f308a.bS.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.cache.q kj() {
        com.google.android.apps.gsa.search.core.h.p pVar = (com.google.android.apps.gsa.search.core.h.p) this.f.gq.a();
        com.google.apps.tiktok.cache.p a2 = com.google.apps.tiktok.cache.q.a();
        a2.e(lk.a);
        a2.c(3);
        a2.d(0);
        a2.b(TimeUnit.SECONDS.toMillis(pVar.i(com.google.android.apps.gsa.shared.k.cl.bo)));
        return a2.a();
    }

    @Override // com.google.android.libraries.search.assistant.s.a
    public final com.google.apps.tiktok.concurrent.ai kk() {
        return (com.google.apps.tiktok.concurrent.ai) this.gF.f308a.fm.a();
    }

    @Override // com.google.android.libraries.search.l.e.c
    public final com.google.apps.tiktok.contrib.work.a kl() {
        return (com.google.apps.tiktok.contrib.work.a) this.f.b.dH.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ax km() {
        return new ax((ay) this.f.iu.a());
    }

    @Override // com.google.apps.tiktok.experiments.phenotype.dc.a
    public final com.google.apps.tiktok.experiments.phenotype.x kn() {
        return (com.google.apps.tiktok.experiments.phenotype.x) this.k.a();
    }

    @Override // com.google.apps.tiktok.experiments.phenotype.dc.a
    public final com.google.apps.tiktok.experiments.phenotype.x ko() {
        return (com.google.apps.tiktok.experiments.phenotype.x) this.di.a();
    }

    @Override // com.google.android.libraries.search.l.f.d.a
    public final bv kp() {
        return this.f.mJ();
    }

    @Override // com.google.android.libraries.search.l.f.d.a
    public final bv kq() {
        return kr();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final bv kr() {
        com.google.apps.tiktok.experiments.phenotype.x xVar = (com.google.apps.tiktok.experiments.phenotype.x) this.k.a();
        com.google.apps.tiktok.experiments.phenotype.x xVar2 = (com.google.apps.tiktok.experiments.phenotype.x) this.di.a();
        xVar.getClass();
        xVar2.getClass();
        return new com.google.apps.tiktok.experiments.phenotype.ce(xVar2, xVar);
    }

    @Override // com.google.apps.tiktok.experiments.phenotype.b
    public final com.google.apps.tiktok.experiments.phenotype.dj ks() {
        iz izVar = this.gF.b;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) izVar.f311a.H.a();
        Map map = (Map) izVar.f311a.ag.a();
        com.google.android.libraries.phenotype.client.a.i iVar = (com.google.android.libraries.phenotype.client.a.i) izVar.f311a.x.a();
        com.google.common.base.at atVar = (com.google.common.base.at) izVar.f311a.ac.a();
        com.google.apps.tiktok.experiments.phenotype.x xVar = (com.google.apps.tiktok.experiments.phenotype.x) izVar.b.di.a();
        com.google.apps.tiktok.experiments.phenotype.x xVar2 = (com.google.apps.tiktok.experiments.phenotype.x) izVar.b.k.a();
        jo joVar = izVar.f311a;
        return new com.google.apps.tiktok.experiments.phenotype.dj(scheduledExecutorService, map, iVar, atVar, xVar, xVar2, joVar.mI(), (com.google.apps.tiktok.experiments.phenotype.bf) joVar.y.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kt() {
        com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.ac acVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.ac((cg) this.iR.a(), (Executor) this.f.H.a(), (ag) this.f.Q.a());
        com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.af afVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.af((cg) this.iS.a(), (Executor) this.f.H.a(), (ag) this.f.Q.a());
        com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.b bVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.b((ag) this.f.Q.a(), ae.Y(this.l), (com.google.android.apps.search.assistant.surfaces.voice.robin.common.locale.k) this.aO.a(), com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.h.u.b(ae.aa(this.l)), (com.google.android.libraries.g.a) this.f.g.a());
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "ConversationModeDataStore";
        a2.c = com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.e.b(com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.c.d.a.createBuilder()).d();
        a2.b().h(acVar);
        a2.b().h(afVar);
        a2.b().h(bVar);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h ku() {
        com.google.android.apps.search.assistant.platform.g.n.b bVar = new com.google.android.apps.search.assistant.platform.g.n.b((ag) this.f.Q.a(), (com.google.android.apps.search.assistant.platform.g.o.c) this.f.iz.a());
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "QuickPhrasesSettings";
        com.google.protobuf.ba createBuilder = com.google.android.apps.search.assistant.platform.g.n.a.c.a.createBuilder();
        createBuilder.getClass();
        a2.c = com.google.android.apps.search.assistant.platform.g.n.a.d.a(createBuilder);
        a2.b().h(bVar);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kv() {
        com.google.android.libraries.web.d.b bVar = (com.google.android.libraries.web.d.b) this.f.f319a.fX.a();
        final com.google.android.libraries.web.n.b bVar2 = (com.google.android.libraries.web.n.b) this.f.uF.a();
        bVar.getClass();
        bVar2.getClass();
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "WebX_GaiaCookieManager_WebAccountSignInPersistentState_WebView";
        a2.c(com.google.android.libraries.web.o.a.a.a.ah.f5622a);
        a2.b = com.google.common.base.at.k(new com.google.common.util.concurrent.q(bVar2) { // from class: com.google.android.libraries.web.o.a.a.a.s

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.libraries.web.n.b f5626a;

            {
                this.f5626a = bVar2;
            }

            public final cn a() {
                return dl.n(this.f5626a.a());
            }
        });
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kw() {
        com.google.android.apps.search.assistant.platform.g.k.a.f fVar = new com.google.android.apps.search.assistant.platform.g.k.a.f(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45376280").f(), c.b(this.m), (cq) this.f.v.a());
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "MobileLocaleSettingsProtoStore";
        a2.c(com.google.android.apps.search.assistant.platform.g.k.b.a.f1893a);
        a2.b().h(fVar);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kx() {
        com.google.android.apps.search.assistant.platform.g.m.i iVar = new com.google.android.apps.search.assistant.platform.g.m.i((p) this.P.a(), (cq) this.f.H.a());
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "PersonalResponseProtoStore";
        a2.c(com.google.android.apps.search.assistant.platform.g.m.c.b.f1896a);
        a2.b().h(iVar);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h ky() {
        com.google.android.apps.search.assistant.platform.g.p.f fVar = new com.google.android.apps.search.assistant.platform.g.p.f((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), c.b(this.f.gh), (cq) this.f.v.a());
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "ScreenContextOptInSettingsData";
        a2.c(com.google.android.apps.search.assistant.platform.g.p.a.c.a);
        a2.b().h(fVar);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.q.b.h kz() {
        com.google.android.libraries.web.n.b bVar = (com.google.android.libraries.web.n.b) this.f.uF.a();
        g a2 = com.google.apps.tiktok.q.b.h.a();
        a2.f5883a = "SignedOutState";
        a2.c(com.google.android.libraries.search.trust.b.b.a);
        a2.b = com.google.common.base.at.k(new com.google.android.libraries.search.trust.b.z(bVar, 0));
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long l() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621643").b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lA() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45643986").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lB() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.e.a.a.j(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45545704").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lC() {
        return h.a.a.d.b.a.y.h(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final com.google.protos.o.b.ae lD() {
        return h.a.a.as.a.a.h.h(this.f.V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.u.d lE() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45365682").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bn lF() {
        bn q = com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b.a.q(this.V, (com.google.apps.tiktok.p.m) this.f.b.hs.a(), (com.google.apps.tiktok.p.u) this.f.mh.a(), (com.google.frameworks.client.data.android.d) this.f.mb.a(), com.google.common.base.a.a);
        q.getClass();
        return q;
    }

    @Override // com.google.android.apps.search.podcasts.autodownload.a$a
    public final e.a lG() {
        return c.b(this.gF.f308a.eW);
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.g.s
    public final e.a lH() {
        return c.b(this.Y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao la() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45430305").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lb() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45430306").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lc() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45424484").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao ld() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45619344").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao le() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45531208").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lf() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45631205").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lg() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644674").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lh() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45649655").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao li() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45614612").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lj() {
        return new h.a.a.d.b.a.ah(this.l).g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ao lk() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639905").d();
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a.af.a
    public final ao ll() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45385894").d();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final com.google.protos.l.a.b lm() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.iy().a.a()).a("com.google.android.apps.search.assistant.device 45410850").d();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final com.google.protos.l.a.b ln() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.iy().a.a()).a("com.google.android.apps.search.assistant.device 45410851").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.b lo() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45366998").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.b lp() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45620179").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.b lq() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45619232").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.b lr() {
        return new h.a.a.d.b.a.ag(this.l).a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final com.google.protos.l.a.b ls() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45384155").d();
    }

    @Override // com.google.android.apps.search.googleapp.homescreen.a.c$a, com.google.android.apps.search.googleapp.search.b.c$a
    public final com.google.protos.l.a.b lt() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.sw().a.a()).a("com.google.android.libraries.search.googleapp.user 45411890").d();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final com.google.protos.l.a.e lu() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45383885").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lv() {
        return ae.V(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lw() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641908").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lx() {
        return ae.U(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e ly() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651684").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.protos.l.a.e lz() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45643985").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long m() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45613599").b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long n() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45624112").b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long o() {
        return h.a.a.d.b.a.y.m(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long p() {
        return h.a.a.f.b.a.n.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g pS() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.d.b.a.ag pT() {
        return new h.a.a.d.b.a.ag(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.f.b.a.k pU() {
        return new h.a.a.f.b.a.k(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b pV() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 3").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b pW() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45362629").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b pX() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 11").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b pY() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 14").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b pZ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45354846").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long q() {
        return h.a.a.f.b.a.n.b(this.l);
    }

    final Object qA() {
        return new com.google.android.libraries.assistant.pcp.f.b((Context) this.f.f.a(), (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qB() {
        Object qA = qA();
        Executor executor = (Executor) this.f.H.a();
        com.google.android.libraries.assistant.pcp.o.a.b gT = gT();
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.pcp.f.x((com.google.android.libraries.assistant.pcp.f.b) qA, executor, gT, 2, joVar.b.as(), (com.google.android.libraries.assistant.pcp.r.b.i) joVar.we.a(), Optional.empty());
    }

    final Object qC() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.f fVar2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.f(aVar2, fVar, joVar.ga(), joVar.gb(), h.a.a.f.a.a.x.ad(joVar.V), h.a.a.f.a.a.x.ac(this.f.V));
        jo joVar2 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.v.j(aVar, fVar2, joVar2.fZ(), (cq) joVar2.H.a());
    }

    final Object qD() {
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context = (Context) this.f.f.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.u gb = joVar.gb();
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.j eb = eb();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar.nN.a();
        jo joVar2 = this.f;
        jr jrVar = joVar2.b;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.g gVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.g(context, aVar2, fVar, gb, eb, rVar, joVar2.fZ(), joVar2.ga(), jrVar.aZ(), ((com.google.apps.tiktok.experiments.e) jrVar.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45381607").b(), h.a.a.f.a.a.x.ap(this.f.V), h.a.a.f.a.a.x.ax(this.f.V), h.a.a.f.a.a.x.ao(this.f.V), h.a.a.f.a.a.x.aw(this.f.V), h.a.a.f.a.a.x.aA(this.f.V), h.a.a.f.a.a.x.Z(this.f.V), h.a.a.f.a.a.x.av(this.f.V), h.a.a.f.a.a.x.at(this.f.V));
        jo joVar3 = this.f;
        return new com.google.android.apps.search.assistant.verticals.ambient.u.v.o(aVar, gVar, joVar3.fZ(), (cq) joVar3.H.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qE() {
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.e.n((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.trigger.e.g) this.f.uL.a(), this.f.f319a.qI(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qF() {
        return new com.google.android.libraries.search.ah.b.e.an((com.google.android.libraries.search.ah.ao) this.jZ.a(), (cr) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qG() {
        return new com.google.android.libraries.assistant.pcp.p.a.l(gQ(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.googleone.e$a
    public final String qH() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.sq().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45640771").e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String qI() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45402107").e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String qJ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45402108").e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String qK() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45402109").e();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f
    public final String qL() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.mobile.device 45417975").e();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final String qM() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45358470").e();
    }

    @Override // com.google.android.libraries.assistant.auto.tng.common.h.g$a
    public final Map qN() {
        return (Map) this.gF.f308a.fg.a();
    }

    public final Map qO() {
        ji jiVar = this.gF.d;
        return fu.q("classic_direct_actions", fu.m("java.com.google.android.libraries.search.assistant.invocation.directactions.service.proto.ApaDirectActionsService", jiVar.bJ), "conversational-soda", fu.m("com.google.android.libraries.search.soda.SodaAsrFrontendService", jiVar.bK), "legacy-backend-binding", fu.m("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch", jiVar.V), "assistant-backend-binding", fu.m("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch", jiVar.bW), "disabled-voice-search-binding", fu.m("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch", jiVar.bX));
    }

    public final Map qP() {
        fq i = fu.i(72);
        ji jiVar = this.gF.d;
        i.i("assistant.mobile.robin.android.RobinStatusCheckerService", jiVar.c);
        i.i("java.com.google.android.libraries.search.assistant.invocation.activitystarter.service.proto.ApaActivityStarterService", jiVar.d);
        i.i("java.com.google.android.libraries.search.assistant.invocation.directactions.service.proto.ApaDirectActionsService", jiVar.f);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.appactions.api.AppActionsContextService", jiVar.g);
        i.i("com.google.android.apps.search.assistant.platform.settingsdata.changenotification.proto.ChangeNotificationListenerService", jiVar.h);
        i.i("java.com.google.android.apps.gsa.search.shared.voiceinteraction.activitystarter.ClassicActivityStarterService", jiVar.i);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.robin.growthcohorts.CohortService", jiVar.j);
        i.i("com.google.android.apps.search.assistant.surfaces.voice.controller.ui.data.service.ConversationDataStoreService", jiVar.k);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.robin.eligibility.EligibilityService", jiVar.l);
        i.i("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", jiVar.m);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.api.EntryPointComponentService", jiVar.n);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.entry.api.EntryPointService", jiVar.o);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerService", jiVar.p);
        i.i("java.com.google.android.libraries.search.assistant.invocation.mediacontext.service.ApaMediaContextService", jiVar.q);
        i.i("com.google.android.libraries.search.assistant.notificationlistener.access.grpc.proto.NotificationAccessorService", jiVar.t);
        i.i("com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.OneSearchSuggest", jiVar.u);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.fcf.robin.api.RobinServiceEligibility", jiVar.v);
        i.i("java.com.google.android.libraries.search.assistant.speechbiasingcontext.service.proto.SbcpInternalService", jiVar.w);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.api.LifecycleManagerSearchMonitoring", jiVar.x);
        i.i("java.com.google.android.libraries.search.assistant.remotesurfaceproxy.RemoteSurfaceProxyService", jiVar.G);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.context.speechbiasing.proto.SessionTokenService", jiVar.H);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.robin.datatransfer.SettingsBackupService", jiVar.I);
        i.i("com.google.android.libraries.search.soda.services.AccountScopedSodaResourceManagerService", jiVar.J);
        i.i("java.com.google.android.libraries.search.assistant.invocation.systemui.service.ApaSystemUiService", jiVar.K);
        i.i("com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.tngactivationstatus.TNGActivationStateService", jiVar.L);
        i.i("java_com_google_android_apps_search_assistant_surfaces_voice_robin_region.UserRegionService", jiVar.M);
        i.i("java.com.google.android.libraries.assistant.searchhandover.proto.VoiceSearch", jiVar.W);
        i.i("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationListenerEventProcessorService", jiVar.aa);
        i.i("assistant.frontend.v1.AssistantCloudExecutionProxyService", jiVar.ad);
        i.i("com.google.android.libraries.search.assistant.voiceplate.api.VoicePlateConnectionHandlerService", jiVar.b.b.bE);
        i.i("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoInteractorFlagService", jiVar.ae);
        i.i("com.google.android.libraries.assistant.auto.tng.report.proto.AssistantReporterService", jiVar.af);
        i.i("com.google.android.libraries.search.assistant.wearables.proto.QueryStatusService", jiVar.ag);
        i.i("com.google.android.libraries.search.assistant.wearables.proto.HeadphoneStateService", jiVar.ah);
        i.i("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoDeviceService", jiVar.ai);
        i.i("com.google.android.libraries.search.assistant.logging.api.proto.ApaCanonicalAppFlowService", jiVar.aj);
        i.i("com.google.android.libraries.search.assistant.conversation.api.proto.ApaClientController", jiVar.ak);
        i.i("java.com.google.android.apps.search.assistant.platform.appintegration.grpc.AssistantAppIntegrationService", jiVar.al);
        i.i("java.com.google.android.libraries.search.assistant.eligibility.AssistantEligibilityService", jiVar.am);
        i.i("java.com.google.android.libraries.assistant.searchhandover.proto.SearchApp", jiVar.an);
        i.i("com.google.android.libraries.search.assistant.spokennotifications.autoread.activity.AutoReadActivityChangeListenerService", jiVar.ao);
        i.i("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoDeviceStatusChangeNotificationService", jiVar.ap);
        i.i("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoSearchService", jiVar.aq);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.classicflags.service.ClassicFlagsService", jiVar.ar);
        i.i("java.com.google.android.libraries.search.assistant.contextdebug.ContextDebugDataFetcher", jiVar.as);
        i.i("java_com_google_android_libraries_search_assistant_spokennotifications_autoread_activity_tracker.CoolDownActivityService", jiVar.at);
        i.i("com.google.android.libraries.assistant.apa.datadownload.grpc.FileGroupStoreView", jiVar.au);
        i.i("com.google.android.libraries.assistant.apa.datadownload.grpc.DataDownloadRestrictedService", jiVar.av);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.initialdownload.service.proto.DataReadinessService", jiVar.aw);
        i.i("android.libraries.assistant.serviceengine.discovery.proto.DiscoveryService", jiVar.ax);
        i.i("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", jiVar.aZ);
        i.i("java.com.google.android.apps.search.assistant.libraries.dictation.proto.InteractorDictationService", jiVar.ba);
        i.i("java.com.google.android.apps.search.assistant.libraries.dictation.proto.DictationInvocationService", jiVar.be);
        i.i("speech.DataShareService", jiVar.bf);
        i.i("java.com.google.android.apps.gsa.nga.engine.fulfillment.grpc.fluidactions.FluidActionsService", jiVar.bg);
        i.i("assistant.mobile.robin.android.FlagSyncingService", jiVar.bh);
        i.i("assistant.mobile.robin.android.SettingsInteractorFlagService", jiVar.bi);
        i.i("java.com.google.android.libraries.search.assistant.performer.intentplate.grpc.IntentPlateClientOpService", jiVar.f315a.f319a.hw);
        i.i("com.google.android.libraries.search.assistant.notificationlistener.monitoring.grpc.NotificationEventObserverRegistryService", jiVar.bm);
        i.i("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService", jiVar.bn);
        i.i("com.google.android.libraries.search.assistant.readiness.service.proto.ReadinessAccessorService", jiVar.bp);
        i.i("com.google.android.libraries.search.assistant.readiness.service.proto.ReadinessConnectorService", jiVar.br);
        i.i("com.google.android.libraries.search.assistant.context.api.proto.RootParentSessionService", jiVar.bs);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.context.session.sbcp.SbcpContextSessionManagerService", jiVar.bu);
        i.i("geller.client.GellerInterprocessService", jiVar.bv);
        i.i("com.google.android.apps.search.assistant.surfaces.voice.input.fre.service.proto.FreSuggestionsService", jiVar.bw);
        i.i("assistant.routines.RoutinesService", jiVar.bx);
        i.i("com.google.android.libraries.search.soda.SodaAsrFrontendService", jiVar.bF);
        i.i("com.google.android.libraries.assistant.apa.datadownload.grpc.TemporaryModelPromptService", jiVar.bG);
        i.i("java_com_google_android_libraries_search_assistant_verticals_topcontacts.TopContactService", jiVar.bH);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.api.TriggeringClientService", jiVar.b.f308a.fw);
        i.i("java.com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.grpc.proto.SpokenNotificationsOobeSearchService", jiVar.bI);
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map qQ() {
        fq i = fu.i(18);
        i.i("googledata.experiments.mobile.assistant.client_packages.component.assistant_suw.user", this.f.f319a.jY);
        i.i("googledata.experiments.mobile.assistant.client_packages.component.nlu_ff.user", this.f.f319a.jZ);
        i.i("assistant_auto_tng_libraries_user", this.f.f319a.ka);
        i.i("com.google.android.apps.search.assistant.mobile.user", this.f.f319a.kb);
        i.i("com.google.android.apps.search.assistant.mobile.interactor.user", this.f.f319a.kc);
        i.i("com.google.android.apps.search.assistant.user", this.f.f319a.kd);
        i.i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user", this.f.b.c);
        i.i("com.google.android.libraries.search.googleapp.user", this.f.b.d);
        i.i("com.google.android.apps.search.lens.user", this.f.b.e);
        i.i("com.google.android.apps.search.omnient", this.f.b.f);
        i.i("com.google.android.apps.gsa.pcp.user", this.f.b.g);
        i.i("com.google.android.apps.podcasts_android.user", this.f.b.h);
        i.i("com.google.android.apps.search.pronunciationlearning", this.f.b.i);
        i.i("com.google.ar.sceneviewer.android.user", this.f.b.j);
        i.i("com.google.android.libraries.search.searchbox.user", this.f.b.k);
        i.i("com.google.android.apps.search.soundsearch.user", this.f.b.l);
        i.i("com.google.android.libraries.search.srp_library.user", this.f.b.m);
        i.i("com.google.android.libraries.search.user", this.f.b.n);
        return i.h(true);
    }

    @Override // com.google.android.libraries.search.feedback.bugreport.BugReportContentProvider.a
    public final Map qR() {
        fq i = fu.i(18);
        iz izVar = this.gF.b;
        i.i("apa_invocation", (com.google.apps.tiktok.h.a.h) izVar.f311a.uJ.a());
        i.i("AppCommAPI", (com.google.apps.tiktok.h.a.h) izVar.f311a.f319a.dx.a());
        i.i("generic_appflows", izVar.f311a.f319a.pd());
        i.i("generic_appflows_binary", izVar.f311a.f319a.pc());
        i.i("ContextAPI", (com.google.apps.tiktok.h.a.h) izVar.f311a.f319a.dy.a());
        i.i("apa_data_download", izVar.f311a.f319a.aW());
        i.i("search_notifications", izVar.f311a.f319a.cK());
        i.i("com.google.android.libraries.search.speech.debug.speech_state", izVar.f311a.f319a.ey());
        i.i("ConversationEngine", (com.google.apps.tiktok.h.a.h) izVar.b.dj.a());
        i.i("soda_resource_manager", izVar.b.f308a.fr());
        i.i("apa_asr", (com.google.apps.tiktok.h.a.h) izVar.b.dk.a());
        i.i("phenotype_flags", izVar.b.f308a.mt());
        i.i("phenotype_flags_binary", izVar.b.f308a.ms());
        i.i("apa_sbcp", (com.google.apps.tiktok.h.a.h) izVar.b.dm.a());
        jj jjVar = izVar.b.f308a;
        AccountId accountId = (AccountId) jjVar.b.g.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a();
        Executor executor = (Executor) jjVar.f316a.v.a();
        com.google.android.apps.gsa.u.e.a aVar = (com.google.android.apps.gsa.u.e.a) jjVar.f316a.b.x.a();
        com.google.android.apps.gsa.u.e.a aVar2 = (com.google.android.apps.gsa.u.e.a) jjVar.fD.a();
        com.google.android.apps.search.assistant.platform.g.e.g gVar = (com.google.android.apps.search.assistant.platform.g.e.g) jjVar.f316a.AI.a();
        com.google.android.apps.search.assistant.platform.g.g.b.f fVar = (com.google.android.apps.search.assistant.platform.g.g.b.f) jjVar.b.ag.a();
        jo joVar = jjVar.f316a;
        jr jrVar = joVar.b;
        Object VF = joVar.VF();
        com.google.android.apps.search.assistant.platform.g.g.b.k kVar = (com.google.android.apps.search.assistant.platform.g.g.b.k) VF;
        i.i("apa_settings_data", new com.google.android.apps.search.assistant.platform.g.f.e(accountId, dVar, executor, aVar, aVar2, gVar, fVar, kVar, (com.google.android.apps.search.assistant.platform.g.i.k) jrVar.fH.a(), (com.google.android.apps.search.assistant.platform.g.j.c) jjVar.b.ak.a(), (com.google.android.apps.search.assistant.platform.g.k.a.d) jjVar.b.Z.a(), jjVar.G(), jjVar.b.ah(), jjVar.I(), jjVar.b.ak(), jjVar.f316a.b.aN()));
        i.i("apa-tts", (com.google.apps.tiktok.h.a.h) izVar.b.dw.a());
        i.i("lockscreen_settings_debug_data", izVar.b.f308a.aU());
        jj jjVar2 = izVar.b.f308a;
        cq cqVar = (cq) jjVar2.f316a.H.a();
        p pVar = (p) jjVar2.b.P.a();
        h hVar = jjVar2.f316a.b.bz;
        com.google.android.apps.search.assistant.verticals.ambient.settings.i dP = jjVar2.b.dP();
        ZoneId zoneId = (ZoneId) hVar.a();
        com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac acVar = (com.google.android.apps.search.assistant.platform.pcp.featuredata.d.ac) jjVar2.b.ao.a();
        ik ikVar = jjVar2.b;
        i.i("smartspace_debug_data", new com.google.android.apps.search.assistant.verticals.ambient.smartspace.d(cqVar, pVar, dP, zoneId, acVar, ikVar.hc(), (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) ikVar.aK.a(), (com.google.common.v.f) jjVar2.f316a.ez.a()));
        return i.h(true);
    }

    @Override // com.google.android.apps.search.googleapp.notifications.c.a
    public final Map qS() {
        jj jjVar = this.gF.f308a;
        ik ikVar = jjVar.b;
        com.google.bz.f.b.a.f fVar = com.google.bz.f.b.a.f.f;
        com.google.android.apps.search.googleapp.notifications.c.h hVar = new com.google.android.apps.search.googleapp.notifications.c.h((AccountId) ikVar.g.a());
        jo joVar = jjVar.f316a;
        com.google.bz.f.b.a.f fVar2 = com.google.bz.f.b.a.f.d;
        com.google.android.apps.search.googleapp.notifications.c.m mVar = new com.google.android.apps.search.googleapp.notifications.c.m((Context) joVar.f.a(), (AccountId) jjVar.b.g.a(), 1);
        ik ikVar2 = jjVar.b;
        return fu.p(fVar, hVar, fVar2, mVar, com.google.bz.f.b.a.f.b, new com.google.android.apps.search.googleapp.notifications.c.m((AccountId) ikVar2.g.a(), jjVar.cw(), 0), com.google.bz.f.b.a.f.e, new com.google.android.apps.search.googleapp.notifications.c.j(jjVar.sn().D(), jjVar.cz(), (ag) jjVar.f316a.Q.a()));
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.h$a
    public final Map qT() {
        return (Map) this.dH.a();
    }

    @Override // com.google.android.libraries.search.assistant.invocation.n.a.a.a
    public final Map qU() {
        return fu.m(com.google.android.libraries.search.assistant.invocation.u.a.a.CLIENT_OMNI, new com.google.android.apps.search.omnient.host.c.a());
    }

    @Override // com.google.android.libraries.search.feedback.bugreport.InteractorBugReportContentProvider.a
    public final Map qV() {
        fq i = fu.i(7);
        iz izVar = this.gF.b;
        i.i("apa_invocation", (com.google.apps.tiktok.h.a.h) izVar.f311a.uJ.a());
        i.i("generic_appflows", izVar.f311a.f319a.pd());
        i.i("ContextAPI", (com.google.apps.tiktok.h.a.h) izVar.f311a.f319a.dy.a());
        i.i("hdm_hotword", (com.google.apps.tiktok.h.a.h) izVar.f311a.rE.a());
        i.i("Wearables", izVar.f311a.f319a.bh());
        i.i("apa_asr", (com.google.apps.tiktok.h.a.h) izVar.b.dk.a());
        i.i("apa_sbcp", (com.google.apps.tiktok.h.a.h) izVar.b.dm.a());
        return i.h(true);
    }

    @Override // com.google.android.apps.gsa.shared.as.e$a
    public final Map qW() {
        fq i = fu.i(9);
        i.i("apa_invocation", this.f.uJ);
        i.i("ContextAPI", this.f.f319a.dy);
        i.i("hdm_hotword", this.f.rE);
        i.i("ConversationEngine", this.dj);
        i.i("apa_asr", this.dk);
        i.i("conversational_apa_asr", this.dl);
        i.i("DebugServiceSherlogExport", this.ko);
        i.i("apa_sbcp", this.dm);
        i.i("apa-tts", this.dw);
        return i.h(true);
    }

    @Override // com.google.apps.tiktok.r.b.ab$a
    public final Map qX() {
        fq i = fu.i(33);
        je jeVar = this.gF.c;
        i.i("com.google.android.apps.search.assistant.surfaces.voice.initialdownload.service.module.DataReadinessModule_provideDataReadinessCache_ExpiredEntrySyncletModule", jeVar.c);
        i.i("assistant_deeplinks", jeVar.d);
        i.i("com.google.android.apps.search.podcasts.provider.FeedProviderModule_Companion_providesGetDiscoverFeedsResponseCacheConfig_ExpiredEntrySyncletModule", jeVar.e);
        i.i("com.google.android.apps.search.podcasts.provider.FeedProviderModule_Companion_providesGetDiscoverTabsResponseCacheConfig_ExpiredEntrySyncletModule", jeVar.f);
        i.i("com.google.android.apps.search.podcasts.provider.FeedProviderModule_Companion_providesGetHomeFeedResponseCacheConfig_ExpiredEntrySyncletModule", jeVar.g);
        i.i("AcetoneEventLogSynclet", jeVar.h);
        i.i("AdvertisingIdInfoSynclet", jeVar.i);
        i.i("aip_top_entities_periodic_refresh_sync_key", jeVar.j);
        i.i("com.google.android.apps.search.assistant.verticals.ambient.ondeviceapps.appusage.impl.OnDeviceAppSuggestionSynclet", jeVar.k);
        i.i("ContentCreatorShareReceiverSynclet", jeVar.l);
        i.i("PCPv2.DailySynclet", jeVar.m);
        i.i("DeviceChannelSynclet", jeVar.n);
        i.i("PCPv2.DiagSynclet", jeVar.o);
        i.i("facts_daily_data_logging_sync", jeVar.q);
        i.i("WebX_GoogleCookieRefreshSynclet", jeVar.r);
        i.i("OmnientGrowthTrackingDailyLoggingSynclet", jeVar.s);
        i.i("growthtracking_sync", jeVar.t);
        i.i("com.google.android.apps.search.assistant.verticals.ambient.holidayalarm.HolidayFetchingSynclet", jeVar.u);
        i.i("com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.MediaRecommendationsSynclet", jeVar.v);
        i.i("NewsMediaBrowserSynclet", jeVar.w);
        i.i("PCPv2.CleanupSynclet", jeVar.x);
        i.i("PromoManagerSynclet", jeVar.A);
        i.i("RobinEligibilityLoggingSynclet", jeVar.B);
        i.i("SearchWidgetDailySynclet", jeVar.C);
        i.i("ServerOobeStringsSynclet", jeVar.D);
        i.i("top_contact_refresh_sync_key", jeVar.F);
        i.i("UnicornStatusSynclet", jeVar.G);
        i.i("com.google.android.apps.search.googleapp.contentcreator.mediapicker.licensedmedia.LicensedMediaCacheModule_provideCache_ExpiredEntrySyncletModule", jeVar.I);
        i.i("OrphanCacheAccountSynclet", jeVar.J);
        i.i("com.google.android.apps.search.googleapp.saves.savedpagescache.cache.SavedPagesCacheBackingCacheModule_provideCacheConfig_ExpiredEntrySyncletModule", jeVar.K);
        i.i("com.google.android.apps.search.googleapp.search.searchcatalog.dataservice.SearchCatalogDataServiceModule_Companion_provideSearchCatalogCacheConfig_ExpiredEntrySyncletModule", jeVar.M);
        i.i("com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.StickerCacheModule_provideCache_ExpiredEntrySyncletModule", jeVar.O);
        i.i("com.google.android.apps.search.googleapp.contentcreator.compose.element.sticker.StickerCacheModule_provideFeaturedPostsCache_ExpiredEntrySyncletModule", jeVar.Q);
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map qY() {
        com.google.android.libraries.search.t.a.j jVar;
        com.google.android.libraries.search.t.c cVar = com.google.android.libraries.search.t.c.OMNI;
        nz nzVar = (nz) this.hb.a();
        com.google.android.libraries.search.m.b jh = jh();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.omnient 45638087").f();
        nzVar.getClass();
        if (f) {
            com.google.android.libraries.search.t.a.i iVar = new com.google.android.libraries.search.t.a.i(null);
            iVar.b().h(new com.google.android.libraries.search.m.a((lt) ((jd) nzVar.f329a).b.E.a(), jh));
            jVar = iVar.a();
        } else {
            jVar = com.google.android.libraries.search.t.a.j.f5340a;
            jVar.getClass();
        }
        jVar.getClass();
        h hVar = this.he;
        com.google.android.libraries.search.t.c cVar2 = com.google.android.libraries.search.t.c.GOOGLE_APP;
        com.google.android.libraries.search.t.a.i iVar2 = new com.google.android.libraries.search.t.a.i(null);
        iVar2.b().h((com.google.android.libraries.search.b.f.b) hVar.a());
        return fu.n(cVar, jVar, cVar2, iVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map qZ() {
        h hVar = this.aK;
        jo joVar = this.f;
        jy jyVar = joVar.f319a;
        fq i = fu.i(7);
        i.i(com.google.g.q.b.d.P, new com.google.android.apps.search.assistant.verticals.ambient.trigger.e.e(joVar.fZ(), dP(), jyVar.qH(), (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) hVar.a(), (ag) this.f.Q.a(), (com.google.android.libraries.search.account.b.b) this.f.gd.a(), (AccountId) this.g.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a()));
        i.i(com.google.g.q.b.d.Z, fT());
        i.i(com.google.g.q.b.d.W, iE());
        i.i(com.google.g.q.b.d.N, qz());
        i.i(com.google.g.q.b.d.B, ep());
        i.i(com.google.g.q.b.d.w, gh());
        i.i(com.google.g.q.b.d.ab, new com.google.android.libraries.assistant.pcp.c.a.i());
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b qa() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45357622").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b qb() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45377897").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b qc() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45355232").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b qd() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45360418").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.y.b.b qe() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45363479").d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final io.grpc.i qf() {
        return qg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final io.grpc.i qg() {
        return io.grpc.p.a((io.grpc.i) this.f.eA.a(), Arrays.asList(new io.grpc.j.q(qj())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final io.grpc.i qh() {
        return com.google.frameworks.client.data.android.server.tiktok.ae.a((io.grpc.i) this.f.kz.a(), qj());
    }

    final io.grpc.i qi() {
        return io.grpc.p.a((io.grpc.i) this.f.ex.a(), Arrays.asList(new io.grpc.j.q(qj())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cx qj() {
        AccountId accountId = (AccountId) this.g.a();
        cx cxVar = new cx();
        cxVar.g(com.google.frameworks.client.data.android.server.tiktok.o.b, accountId);
        return cxVar;
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.conversationmode.service.a$a
    public final Optional qk() {
        return Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional ql() {
        Optional empty;
        Optional optional = (Optional) this.iy.a();
        if (optional.isPresent()) {
            empty = Optional.of(new com.google.android.libraries.search.assistant.ae.a.a.o(io.grpc.j.a.d(new com.google.android.libraries.search.assistant.ae.a.c.a(), (io.grpc.i) optional.get(), io.grpc.h.a)));
        } else {
            empty = Optional.empty();
        }
        return empty;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.worker.e.g$a
    public final Optional qm() {
        return Optional.of(this.gF.f308a.mw());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qn() {
        com.google.android.libraries.search.assistant.appactions.d.a.i iVar = new com.google.android.libraries.search.assistant.appactions.d.a.i((Context) this.f.f.a(), (Executor) this.f.H.a());
        com.google.common.f.a.d dVar = com.google.android.libraries.search.assistant.appactions.d.a.n.f4051a;
        return new com.google.android.libraries.search.assistant.appactions.d.a.e(iVar, (cq) this.f.H.a(), hG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qo() {
        return new com.google.android.libraries.assistant.pcp.b.a.p(gR(), (com.google.android.libraries.assistant.pcp.f.x) qB(), gS(), gy(), gv(), new com.google.android.libraries.assistant.pcp.g.a.ad(ri(), (byte[]) null), (Executor) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qp() {
        return new com.google.android.libraries.assistant.pcp.p.a.c(gR(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qq() {
        return new com.google.android.apps.search.assistant.verticals.ambient.trigger.e.n((com.google.android.apps.search.assistant.verticals.ambient.trigger.e.g) this.f.uL.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), this.f.f319a.qH(), 1);
    }

    final Object qr() {
        return new com.google.android.libraries.assistant.pcp.b.a.ar(gQ(), gR(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), (com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a());
    }

    final Object qs() {
        jy jyVar = this.f.f319a;
        return new com.google.android.libraries.search.location.b(jyVar.sf(), Optional.of(new com.google.android.libraries.search.location.compliance.e.a.b(jyVar.sf())), (com.google.android.libraries.search.location.y) this.O.a());
    }

    final Object qt() {
        jr jrVar = this.f.b;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.b.a.j jVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.b.a.j(jrVar.V(), (com.google.common.v.f) jrVar.f322a.ez.a(), (Executor) jrVar.f322a.H.a(), (Context) jrVar.f322a.f.a());
        jr jrVar2 = this.f.b;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.b.a.g gVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.b.a.g(jrVar2.V(), (com.google.common.v.f) jrVar2.f322a.ez.a(), (Context) jrVar2.f322a.f.a(), (Executor) jrVar2.f322a.H.a());
        jr jrVar3 = this.f.b;
        return new com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.d(fu.o("TRAIN_STATUS", jVar, "TRAIN_SEAT", gVar, "TRAIN_DESTINATION_ALERT", new com.google.android.apps.search.assistant.verticals.ambient.smartspace.p.b.a.d(jrVar3.V(), (com.google.common.v.f) jrVar3.f322a.ez.a(), (Context) jrVar3.f322a.f.a(), (Executor) jrVar3.f322a.H.a())), (cq) this.f.H.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qu() {
        return new com.google.android.libraries.assistant.contexttrigger.a.c(gn());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qv() {
        return new com.google.android.libraries.search.assistant.aj.d.b.e((com.google.android.apps.gsa.u.d.h) this.f.wm.a(), (ax) this.f.iv.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (com.google.android.libraries.search.assistant.aj.d.a.g) this.f.wn.a(), (com.google.common.base.at) this.f.wo.a(), com.google.common.base.at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.y.aw) this.cw.a()), (com.google.apps.tiktok.cache.o) this.f.wp.a(), (cr) this.f.H.a());
    }

    final Object qw() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.a((com.google.common.v.f) this.f.ez.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45386148").d());
    }

    final Object qx() {
        return new com.google.android.apps.search.assistant.platform.pcp.i.g(gm(), (Executor) this.f.H.a(), I(), (com.google.android.apps.search.assistant.platform.pcp.api.r) this.f.uM.a(), (Executor) this.f.v.a(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.platform.pcp.j.ar((com.google.android.libraries.g.a) this.f.g.a(), I(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), Optional.of(this.f.fn()), (Executor) this.f.v.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.gsa.pcp.device 45364529").d()), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object qy() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.h((Context) this.f.f.a(), ey(), eC(), (com.google.android.libraries.search.location.compliance.r) this.N.a(), ew(), (ConnectivityManager) this.f.wN.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.it().a.a()).a("com.google.android.apps.search.assistant.device 45388646").f(), (Executor) this.f.H.a());
    }

    final Object qz() {
        return new com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.l((Context) this.f.f.a(), (com.google.android.libraries.search.account.b.b) this.f.gd.a(), (AccountId) this.g.a(), this.f.b.it().a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f, com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.j
    public final long r() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640429").b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rA() {
        com.google.android.apps.search.assistant.surfaces.voice.e.e.z.a aI = aI();
        e.a b = c.b(this.jA);
        Duration duration = com.google.android.apps.search.assistant.surfaces.voice.e.n.f2052a;
        b.getClass();
        ha<com.google.android.libraries.search.assistant.aq.q.a.a.b> haVar = com.google.android.libraries.search.assistant.aq.q.a.j.f4108a;
        haVar.getClass();
        ArrayList arrayList = new ArrayList(m.a.t.aX(haVar, 10));
        for (com.google.android.libraries.search.assistant.aq.q.a.a.b bVar : haVar) {
            bVar.getClass();
            arrayList.add(new com.google.android.apps.search.assistant.surfaces.voice.e.e.z.d(aI.f2040a, b, bVar));
        }
        return m.a.t.W(arrayList);
    }

    @Override // com.google.android.libraries.search.t.l.h$a
    public final Set rB() {
        return (Set) this.B.a();
    }

    final Set rC() {
        op opVar;
        boolean booleanValue = ((Boolean) this.f.b.hg.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "client.RECONNECT";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 2;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rD() {
        op opVar;
        boolean booleanValue = ((Boolean) this.f.b.hg.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "client.RECONNECT";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 2;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rE() {
        op opVar;
        boolean booleanValue = ((Boolean) this.f.b.hj.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "data.VALIDATE";
            com.google.protobuf.ba createBuilder2 = ei.a.createBuilder();
            createBuilder2.copyOnWrite();
            ei eiVar = createBuilder2.instance;
            eiVar.b |= 1;
            eiVar.c = "assistant.api.client_op.DataValidateProperties";
            com.google.protobuf.ba createBuilder3 = com.google.protos.e.b.a.a.c.a.createBuilder();
            com.google.protos.e.b.a.a.b bVar = com.google.protos.e.b.a.a.b.a;
            createBuilder3.copyOnWrite();
            com.google.protos.e.b.a.a.c cVar = createBuilder3.instance;
            bVar.getClass();
            cVar.c = bVar;
            cVar.b |= 1;
            com.google.protos.e.b.a.a.a aVar = com.google.protos.e.b.a.a.a.a;
            createBuilder3.copyOnWrite();
            com.google.protos.e.b.a.a.c cVar2 = createBuilder3.instance;
            aVar.getClass();
            cVar2.d = aVar;
            cVar2.b |= 2;
            com.google.protobuf.v byteString = createBuilder3.build().toByteString();
            createBuilder2.copyOnWrite();
            ei eiVar2 = createBuilder2.instance;
            byteString.getClass();
            eiVar2.b |= 2;
            eiVar2.d = byteString;
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            ei build = createBuilder2.build();
            build.getClass();
            beVar2.e = build;
            beVar2.b |= 4;
            createBuilder.copyOnWrite();
            be beVar3 = createBuilder.instance;
            beVar3.b |= 2;
            beVar3.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rF() {
        op opVar;
        boolean booleanValue = ((Boolean) this.fd.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "device.EXECUTE_APP_CONTROL";
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rG() {
        op opVar;
        boolean f = this.f.b.jv().f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "device.GET_SETTINGS";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rH() {
        op opVar;
        boolean f = this.f.b.jv().f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "device.GET_SETTINGS";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rI() {
        op opVar;
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45417939").f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "notification.SUMMARIZE";
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rJ() {
        op opVar;
        boolean booleanValue = ((Boolean) this.f.b.bY.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "notification.SUMMARIZE";
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rK() {
        op opVar;
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45366523").f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "device.MODIFY_SETTING";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rL() {
        op opVar;
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.jv().a.a()).a("assistant_auto_tng_libraries_device 45383845").f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "device.SPRINGBOARD_SETTING";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rM() {
        op opVar;
        boolean booleanValue = ((Boolean) this.fb.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "ui.SET_USER_QUERY";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rN() {
        op opVar;
        boolean booleanValue = ((Boolean) this.fb.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "ui.SET_USER_QUERY";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rO() {
        op opVar;
        boolean booleanValue = ((Boolean) this.fc.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "ui.SHOW_APP_WIDGET";
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rP() {
        op opVar;
        boolean booleanValue = ((Boolean) this.f.b.hk.a()).booleanValue();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.d.a;
        if (booleanValue) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "ui.SHOW_DISAMBIGUATION_CARDS";
            com.google.protobuf.ba createBuilder2 = ei.a.createBuilder();
            createBuilder2.copyOnWrite();
            ei eiVar = createBuilder2.instance;
            eiVar.b |= 1;
            eiVar.c = "assistant.api.client_op.properties.ShowDisambiguationCardsProperties";
            si createBuilder3 = com.google.g.e.i.oa.a.createBuilder();
            createBuilder3.v();
            com.google.protobuf.v byteString = createBuilder3.build().toByteString();
            createBuilder2.copyOnWrite();
            ei eiVar2 = createBuilder2.instance;
            byteString.getClass();
            eiVar2.b |= 2;
            eiVar2.d = byteString;
            ei build = createBuilder2.build();
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            build.getClass();
            beVar2.e = build;
            beVar2.b |= 4;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    final Set rQ() {
        Set a2 = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.f.a(((Boolean) this.dD.a()).booleanValue(), ((Boolean) this.f.b.hh.a()).booleanValue(), ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.l).a.a()).a("assistant_auto_tng_libraries_user 45354415").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.l).a.a()).a("assistant_auto_tng_libraries_user 45359841").f(), ((com.google.apps.tiktok.experiments.e) this.f.b.jb().a.a()).a("assistant_auto_tng_libraries_device 45354417").f(), this.f.b.jv().g(), ((Boolean) this.eo.a()).booleanValue());
        a2.getClass();
        return a2;
    }

    final Set rR() {
        Set a2 = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.f.a(((Boolean) this.dD.a()).booleanValue(), ((Boolean) this.f.b.hh.a()).booleanValue(), ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.l).a.a()).a("assistant_auto_tng_libraries_user 45379394").f(), ((com.google.apps.tiktok.experiments.e) new h.a.a.b.b.a.g(this.l).a.a()).a("assistant_auto_tng_libraries_user 45400919").f(), false, this.f.b.jv().g(), ((Boolean) this.eo.a()).booleanValue());
        a2.getClass();
        return a2;
    }

    final Set rS() {
        op opVar;
        boolean f = ((com.google.apps.tiktok.experiments.e) new h.a.a.b.a.a.r(this.f.b.f322a.V).a.a()).a("assistant_auto_tng_libraries_device 45418454").f();
        int i = com.google.android.libraries.assistant.auto.tng.assistant.d.b.b.e.c.a.a;
        if (f) {
            com.google.protobuf.ba createBuilder = be.a.createBuilder();
            createBuilder.copyOnWrite();
            be beVar = createBuilder.instance;
            beVar.b |= 1;
            beVar.c = "execution.WAIT";
            createBuilder.copyOnWrite();
            be beVar2 = createBuilder.instance;
            beVar2.b |= 2;
            beVar2.d = 1;
            opVar = new op(createBuilder.build());
        } else {
            opVar = nr.a;
        }
        opVar.getClass();
        return opVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rT() {
        com.google.android.apps.search.assistant.surfaces.voice.robin.x.al alVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.x.al((com.google.android.apps.search.assistant.surfaces.voice.robin.x.an) this.gO.a());
        com.google.android.apps.search.assistant.surfaces.voice.robin.x.as asVar = new com.google.android.apps.search.assistant.surfaces.voice.robin.x.as((com.google.android.apps.search.assistant.surfaces.voice.robin.x.x) this.gQ.a(), cU(), cn(), (am) this.z.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45644711").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45644712").f(), h.a.a.d.b.a.y.l(this.l));
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45476439").f();
        boolean f2 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45643302").f();
        m.a.a.r rVar = new m.a.a.r();
        if (f) {
            rVar.add(alVar);
        }
        if (f2) {
            rVar.add(asVar);
        }
        Set ah = m.a.an.ah(rVar);
        ah.getClass();
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rU() {
        gy l = ha.l(2);
        com.google.br.d.a.a.e eVar = (com.google.br.d.a.a.e) this.p.a();
        eVar.getClass();
        l.h(com.google.br.d.a.a.j.a(eVar));
        Set a2 = com.google.apps.tiktok.i.f.b.a.a(this.e);
        a2.getClass();
        l.j(a2);
        return l.g();
    }

    final Set rV() {
        jr jrVar = this.f.b;
        Context context = (Context) jrVar.f322a.f.a();
        jo joVar = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.oobe.o oVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.oobe.o(context, joVar.ga(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar.nM.a());
        com.google.apps.tiktok.contrib.work.b.p pVar = (com.google.apps.tiktok.contrib.work.b.p) jrVar.f322a.gK.a();
        jy jyVar = jrVar.f322a.f319a;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.f.c cs = jyVar.cs();
        cg cgVar = (cg) jyVar.cr.a();
        com.google.common.v.f fVar = (com.google.common.v.f) jrVar.f322a.ez.a();
        jo joVar2 = jrVar.f322a;
        com.google.android.apps.search.assistant.verticals.ambient.u.l.e eVar = new com.google.android.apps.search.assistant.verticals.ambient.u.l.e(oVar, pVar, cs, cgVar, fVar, joVar2.fZ(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar2.nM.a(), (cq) jrVar.f322a.H.a());
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context2 = (Context) this.f.f.a();
        Executor executor = (Executor) this.f.n.a();
        Executor executor2 = (Executor) this.f.H.a();
        com.google.apps.tiktok.media.j jVar = (com.google.apps.tiktok.media.j) this.f.ne.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) this.f.b.ik().a.a()).a("com.google.android.apps.gsa.pcp.device 45366374").f();
        long b = ((com.google.apps.tiktok.experiments.e) this.f.b.ik().a.a()).a("com.google.android.apps.gsa.pcp.device 45366376").b();
        boolean aw = h.a.a.f.a.a.x.aw(this.f.V);
        boolean f2 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45408299").f();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar2 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.libraries.g.a aVar3 = (com.google.android.libraries.g.a) this.f.g.a();
        jo joVar3 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.h.d dVar = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.h.d(context2, executor, executor2, jVar, Boolean.valueOf(f), b, aw, f2, aVar2, aVar3, joVar3.gb(), joVar3.ga(), joVar3.fZ(), (cq) joVar3.v.a());
        jo joVar4 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.d.i iVar = new com.google.android.apps.search.assistant.verticals.ambient.u.d.i(aVar, dVar, joVar4.fZ(), (cq) joVar4.H.a());
        jo joVar5 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.v.g gVar = new com.google.android.apps.search.assistant.verticals.ambient.u.v.g(joVar5.b.hw(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar5.nM.a(), ea(), (AccountId) this.g.a(), (cq) this.f.H.a());
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar4 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context3 = (Context) this.f.f.a();
        com.google.android.libraries.g.a aVar5 = (com.google.android.libraries.g.a) this.f.g.a();
        jo joVar6 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.u gb = joVar6.gb();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar6 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar6.nM.a();
        jo joVar7 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.b.a aVar7 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.b.a(context3, aVar5, gb, aVar6, joVar7.ga(), h.a.a.f.a.a.x.aw(joVar7.V), h.a.a.f.a.a.x.at(this.f.V), h.a.a.f.a.a.x.ag(this.f.V), h.a.a.f.a.a.x.ai(this.f.V));
        jo joVar8 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.q.i iVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.q.i(aVar4, aVar7, joVar8.fZ(), (cq) joVar8.H.a(), h.a.a.f.a.a.x.an(this.f.V), h.a.a.f.a.a.x.ab(this.f.V), (com.google.android.apps.search.assistant.verticals.ambient.crossprofile.v) this.aK.a(), (com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a(), (AccountId) this.g.a());
        com.google.android.apps.search.assistant.verticals.ambient.u.c.h hVar = new com.google.android.apps.search.assistant.verticals.ambient.u.c.h(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45379790").f(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ec(), (AccountId) this.g.a(), 0);
        com.google.android.apps.search.assistant.verticals.ambient.u.r.d dVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.r.d((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a());
        boolean aq = h.a.a.f.a.a.x.aq(this.f.V);
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar8 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        com.google.android.libraries.g.a aVar9 = (com.google.android.libraries.g.a) this.f.g.a();
        long X = h.a.a.f.a.a.x.X(this.f.V);
        jo joVar9 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a hVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.e.h(aq, aVar8, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.i.a(aVar9, X, joVar9.fZ(), joVar9.gb()), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a());
        boolean d = h.a.a.f.b.a.i.d(this.l);
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar10 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context4 = (Context) this.f.f.a();
        com.google.android.libraries.g.a aVar11 = (com.google.android.libraries.g.a) this.f.g.a();
        boolean aw2 = h.a.a.f.a.a.x.aw(this.f.V);
        jo joVar10 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar10.fZ();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar10.nN.a();
        jo joVar11 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a gVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.g.g(d, aVar10, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.j.a(context4, aVar11, aw2, fZ, rVar, joVar11.gb(), joVar11.ga()), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a());
        boolean e = h.a.a.f.b.a.i.e(this.l);
        boolean f3 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45381259").f();
        boolean f4 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45381260").f();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar12 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context5 = (Context) this.f.f.a();
        jr jrVar2 = this.f.b;
        boolean hx = jrVar2.hx();
        boolean hz = jrVar2.hz();
        boolean c = h.a.a.f.b.a.i.c(this.l);
        boolean f5 = h.a.a.f.b.a.i.f(this.l);
        com.google.android.libraries.g.a aVar13 = (com.google.android.libraries.g.a) this.f.g.a();
        jo joVar12 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a gVar3 = new com.google.android.apps.search.assistant.verticals.ambient.u.h.g(e, f3, f4, aVar12, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.k.d(context5, hx, hz, c, f5, aVar13, joVar12.fZ(), joVar12.ga(), (cq) joVar12.v.a()), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a());
        boolean e2 = h.a.a.f.b.a.i.e(this.l);
        boolean f6 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45381261").f();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar14 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context6 = (Context) this.f.f.a();
        jr jrVar3 = this.f.b;
        boolean hx2 = jrVar3.hx();
        boolean hz2 = jrVar3.hz();
        boolean c2 = h.a.a.f.b.a.i.c(this.l);
        boolean f7 = h.a.a.f.b.a.i.f(this.l);
        com.google.android.libraries.g.a aVar15 = (com.google.android.libraries.g.a) this.f.g.a();
        boolean az = h.a.a.f.a.a.x.az(this.f.V);
        jo joVar13 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a gVar4 = new com.google.android.apps.search.assistant.verticals.ambient.u.i.g(e2, f6, aVar14, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.l.d(context6, hx2, hz2, c2, f7, aVar15, az, joVar13.fZ(), joVar13.ga(), (cq) joVar13.v.a()), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a());
        boolean f8 = ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45372801").f();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar16 = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        Context context7 = (Context) this.f.f.a();
        com.google.android.libraries.g.a aVar17 = (com.google.android.libraries.g.a) this.f.g.a();
        jo joVar14 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a gVar5 = new com.google.android.apps.search.assistant.verticals.ambient.u.m.g(f8, aVar16, new com.google.android.apps.search.assistant.verticals.ambient.smartspace.n.d(context7, aVar17, joVar14.gb(), joVar14.ga(), joVar14.fZ(), (cq) joVar14.H.a(), h.a.a.f.a.a.x.aw(this.f.V)), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a());
        com.google.android.apps.search.assistant.verticals.ambient.u.a iVar3 = new com.google.android.apps.search.assistant.verticals.ambient.u.t.i(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45379791").f(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), ek(), (AccountId) this.g.a(), 0);
        com.google.android.apps.search.assistant.verticals.ambient.u.a fVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.s.f((com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), new com.google.android.apps.search.assistant.verticals.ambient.smartspace.tips.a((com.google.android.libraries.g.a) this.f.g.a(), this.f.ga()), this.f.fZ(), (AccountId) this.g.a(), (cq) this.f.H.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45377969").f());
        jo joVar15 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.a kVar = new com.google.android.apps.search.assistant.verticals.ambient.u.v.k(joVar15.b.hw(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar15.nM.a(), (AccountId) this.g.a(), (com.google.android.apps.search.assistant.verticals.ambient.u.v.j) qC(), 0);
        jo joVar16 = this.f;
        return ha.w(eVar, iVar, gVar, iVar2, hVar, dVar2, new com.google.android.apps.search.assistant.verticals.ambient.u.a[]{hVar2, gVar2, gVar3, gVar4, gVar5, iVar3, fVar2, kVar, new com.google.android.apps.search.assistant.verticals.ambient.u.v.k(joVar16.b.hw(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar16.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.u.v.o) qD(), (AccountId) this.g.a(), 3, (byte[]) null)});
    }

    final Set rW() {
        com.google.android.apps.search.assistant.verticals.ambient.u.v.b bVar = new com.google.android.apps.search.assistant.verticals.ambient.u.v.b(ea(), ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45391117").f(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (AccountId) this.g.a(), (cq) this.f.H.a());
        jo joVar = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.c.h hVar = new com.google.android.apps.search.assistant.verticals.ambient.u.c.h(joVar.f319a.qY(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar.nM.a(), ec(), (AccountId) this.g.a(), 1, (byte[]) null);
        com.google.android.apps.search.assistant.verticals.ambient.u.r.e eVar = new com.google.android.apps.search.assistant.verticals.ambient.u.r.e((com.google.android.apps.search.assistant.verticals.ambient.n.r) this.f.nN.a());
        jo joVar2 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.u.t.i iVar = new com.google.android.apps.search.assistant.verticals.ambient.u.t.i(joVar2.f319a.qZ(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar2.nM.a(), ek(), (AccountId) this.g.a(), 1, (byte[]) null);
        com.google.android.apps.search.assistant.verticals.ambient.u.v.k kVar = new com.google.android.apps.search.assistant.verticals.ambient.u.v.k(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45391116").f(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (AccountId) this.g.a(), (com.google.android.apps.search.assistant.verticals.ambient.u.v.j) qC(), 1, (byte[]) null);
        com.google.android.apps.search.assistant.verticals.ambient.u.v.k kVar2 = new com.google.android.apps.search.assistant.verticals.ambient.u.v.k(h.a.a.f.a.a.x.as(this.f.V), (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a(), (com.google.android.apps.search.assistant.verticals.ambient.u.v.o) qD(), (AccountId) this.g.a(), 2);
        jo joVar3 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.s.h.ae fZ = joVar3.fZ();
        com.google.android.apps.search.assistant.verticals.ambient.n.r rVar = (com.google.android.apps.search.assistant.verticals.ambient.n.r) joVar3.nN.a();
        com.google.android.apps.search.assistant.verticals.ambient.g.a aVar = (com.google.android.apps.search.assistant.verticals.ambient.g.a) this.f.nM.a();
        jo joVar4 = this.f;
        com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.h hVar2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.q.h(rVar, aVar, joVar4.gb(), (com.google.common.v.f) joVar4.ez.a(), eb());
        jo joVar5 = this.f;
        return ha.w(bVar, hVar, eVar, iVar, kVar, kVar2, new com.google.android.apps.search.assistant.verticals.ambient.u.a[]{new com.google.android.apps.search.assistant.verticals.ambient.u.v.r(fZ, hVar2, joVar5.b.hA(), (com.google.android.apps.search.assistant.verticals.ambient.g.a) joVar5.nM.a(), (AccountId) this.g.a(), (cq) this.f.H.a(), eb())});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rX() {
        return ha.w((com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.f.b.ai.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.in.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.io.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.ip.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.ir.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a) this.f.b.aN.a(), new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a[]{new com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.g((com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) this.aG.a(), (cq) this.f.H.a(), (com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.aI.a(), (com.google.android.libraries.assistant.auto.tng.suggestions.b.c.f.a.d) this.f.b.aD.a())});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rY() {
        h hVar = this.aG;
        return ha.v(fW(), xG(), ga(), fZ(), new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.e.c((com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) hVar.a(), this.f.b.am(), (com.google.android.libraries.assistant.auto.tng.common.a.f) this.aA.a(), (AccountId) this.g.a(), Optional.empty(), (Context) this.f.f.a(), (com.google.android.libraries.assistant.auto.tng.w.e.a.b) this.aI.a(), Optional.of(fU()), (Executor) this.f.H.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rZ() {
        h hVar = this.f.b.ai;
        gy l = ha.l(30);
        l.h((com.google.android.libraries.assistant.pcp.h.f) hVar.a());
        Set a2 = com.google.android.libraries.assistant.pcp.c.b.a.b.a();
        a2.getClass();
        l.j(a2);
        l.h(fX());
        l.h(gd());
        l.h(fW());
        l.h(xG());
        l.h(ga());
        l.h(fZ());
        l.h(fY());
        l.h(gH());
        l.h(gI());
        l.h(gJ());
        l.h(gf());
        l.h(gF());
        l.h(new com.google.android.libraries.assistant.pcp.h.g.e(this.aG, (cr) this.f.H.a()));
        l.h(xH());
        l.h(ge());
        l.h(gg());
        l.h(gE());
        l.h(new com.google.android.libraries.assistant.pcp.h.d.b((com.google.common.v.f) this.f.ez.a(), hc(), (ag) this.f.Q.a(), 0));
        l.h(xI());
        l.h(new com.google.android.libraries.assistant.pcp.h.f.i((com.google.android.libraries.assistant.pcp.f.x) qB()));
        h hVar2 = this.X;
        com.google.g.af.d.e kK = kK();
        com.google.apps.tiktok.p.b.c cVar = (com.google.apps.tiktok.p.b.c) hVar2.a();
        com.google.android.libraries.assistant.pcp.f.x xVar = new com.google.android.libraries.assistant.pcp.f.x((com.google.android.libraries.assistant.pcp.f.b) qA(), (Executor) this.f.H.a(), 2, this.f.b.as(), gy(), new com.google.android.libraries.assistant.pcp.d.a.x(this.aL), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a());
        jo joVar = this.f;
        com.google.android.libraries.assistant.pcp.h.f.m gM = gM();
        com.google.android.libraries.assistant.pcp.datastore.b.c.f io = this.f.io();
        com.google.android.libraries.assistant.pcp.r.b.i iVar = (com.google.android.libraries.assistant.pcp.r.b.i) joVar.we.a();
        com.google.common.v.f fVar = (com.google.common.v.f) this.f.ez.a();
        jo joVar2 = this.f;
        l.h(new com.google.android.libraries.assistant.pcp.h.f.r(kK, cVar, xVar, gM, io, iVar, fVar, joVar2.ip(), (ag) joVar2.Q.a()));
        l.h(gK());
        l.h(gB());
        l.h(gC());
        l.h(gL());
        l.h(gG());
        l.h(gO());
        l.h(gN());
        return l.g();
    }

    final Map ra() {
        jy jyVar = this.f.f319a;
        fq i = fu.i(9);
        i.i(com.google.g.af.b.a.n.g, jyVar.cS());
        i.i(com.google.g.af.b.a.n.d, this.f.ij());
        i.i(com.google.g.af.b.a.n.e, this.f.f319a.cU());
        i.i(com.google.g.af.b.a.n.c, this.f.f319a.cV());
        i.i(com.google.g.af.b.a.n.h, new com.google.android.libraries.assistant.contexttrigger.a.b());
        i.i(com.google.g.af.b.a.n.b, new com.google.android.libraries.assistant.contexttrigger.b.i((AccountId) this.g.a(), (com.google.apps.tiktok.account.data.a.d) this.f.bq.a(), (ScheduledExecutorService) this.f.H.a(), (com.google.android.libraries.search.location.b) qs(), (Context) this.f.f.a()));
        i.i(com.google.g.af.b.a.n.j, new com.google.android.libraries.assistant.contexttrigger.h.b());
        i.i(com.google.g.af.b.a.n.f, new com.google.android.libraries.assistant.contexttrigger.i.c((Context) this.f.f.a(), jl()));
        i.i(com.google.g.af.b.a.n.i, new com.google.android.libraries.assistant.contexttrigger.k.b(new com.google.android.libraries.assistant.contexttrigger.k.c((Context) this.f.f.a(), (ConnectivityManager) this.f.wN.a())));
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rb() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, this.lw, com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, this.lx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rc() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, e.c.l.a, com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, this.lv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rd() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, this.kE, com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, this.f3if);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map re() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, this.it, com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, this.iu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rf() {
        h hVar = this.aD;
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, (com.google.android.libraries.assistant.auto.tng.media.d.a) hVar.a(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, (com.google.android.libraries.assistant.auto.tng.media.d.a) this.aE.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rg() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, new com.google.android.libraries.assistant.auto.tng.g.a.a.a.b((com.google.android.libraries.assistant.auto.jumpboost.s.a) this.f.f319a.bU.a(), bf()), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, new com.google.android.libraries.assistant.auto.tng.g.a.a.a.a((String) this.f.Y.a(), this.f.nj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rh() {
        fq i = fu.i(7);
        i.i(com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.b, fB());
        i.i(com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.e, new com.google.android.libraries.assistant.auto.tng.f.d.a.a.e((ag) this.f.Q.a(), 1, (byte[]) null));
        com.google.android.libraries.assistant.auto.tng.assistant.e.c.g gVar = com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.g;
        h hVar = this.dD;
        h hVar2 = this.dE;
        jr jrVar = this.f.b;
        com.google.android.libraries.assistant.auto.tng.common.o.a.a am = jrVar.am();
        h hVar3 = this.kA;
        h hVar4 = this.kB;
        jo joVar = this.f;
        ag agVar = (ag) joVar.Q.a();
        Context context = (Context) this.f.f.a();
        h hVar5 = this.ax;
        Optional empty = Optional.empty();
        com.google.android.libraries.search.b.b bVar = (com.google.android.libraries.search.b.b) hVar5.a();
        com.google.android.libraries.assistant.auto.tng.f.d.a.c.h hVar6 = (com.google.android.libraries.assistant.auto.tng.f.d.a.c.h) this.dG.a();
        i.i(gVar, new com.google.android.libraries.assistant.auto.tng.f.d.a.a.c(hVar, jrVar.bV, hVar2, am, hVar3, hVar4, joVar.b.bW, agVar, context, empty, bVar, hVar6));
        com.google.android.libraries.assistant.auto.tng.assistant.e.c.g gVar2 = com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.d;
        h hVar7 = this.kC;
        h hVar8 = this.kD;
        jo joVar2 = this.f;
        jr jrVar2 = joVar2.b;
        com.google.android.libraries.assistant.auto.tng.common.o.a.a am2 = jrVar2.am();
        ag agVar2 = (ag) joVar2.Q.a();
        Context context2 = (Context) this.f.f.a();
        i.i(gVar2, new com.google.android.libraries.assistant.auto.tng.f.d.a.a.g(jrVar2.bV, hVar7, jrVar2.cb, hVar8, am2, agVar2, context2));
        i.i(com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.f, new com.google.android.libraries.assistant.auto.tng.f.d.a.a.e((ag) this.f.Q.a(), 0));
        i.i(com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.c, fB());
        i.i(com.google.android.libraries.assistant.auto.tng.assistant.e.c.g.a, fB());
        return i.h(true);
    }

    final Map ri() {
        fq i = fu.i(15);
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.w, cj.i), hb());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.P, cj.s), dX());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.B, cj.s), dX());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.W, cj.s), dX());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.P, cj.w), dY());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.P, cj.v), qt());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.N, cj.c), qw());
        com.google.android.libraries.assistant.pcp.v.e.a aVar = new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.w, cj.H);
        Executor executor = (Executor) this.f.H.a();
        com.google.apps.tiktok.g.p pVar = (com.google.apps.tiktok.g.p) this.aa.a();
        h hVar = this.ax;
        com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.e gb = gb();
        com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar.a();
        jr jrVar = this.f.b;
        i.i(aVar, new com.google.android.libraries.assistant.auto.tng.suggestions.h.f.q(executor, pVar, jrVar.bA, jrVar.bB, jrVar.bC, gb, gVar));
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.w, cj.o), gi());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.w, cj.q), gj());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.P, cj.r), (com.google.android.libraries.assistant.pcp.v.b) this.cp.a());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.B, cj.r), (com.google.android.libraries.assistant.pcp.v.b) this.cp.a());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.P, cj.t), dZ());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.B, cj.t), dZ());
        i.i(new com.google.android.libraries.assistant.pcp.v.e.a(com.google.g.q.b.d.W, cj.t), dZ());
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rj() {
        fq i = fu.i(8);
        i.i(com.google.android.libraries.assistant.pcp.s.t.c, new com.google.android.libraries.assistant.pcp.v.m(he(), (Executor) this.f.H.a()));
        com.google.android.libraries.assistant.pcp.s.t tVar = com.google.android.libraries.assistant.pcp.s.t.q;
        i.i(tVar, new com.google.android.libraries.assistant.pcp.v.e(tVar, com.google.android.libraries.assistant.pcp.e.e.a(cj.H)));
        com.google.android.libraries.assistant.pcp.s.t tVar2 = com.google.android.libraries.assistant.pcp.s.t.h;
        i.i(tVar2, new com.google.android.libraries.assistant.pcp.v.e(tVar2, com.google.android.libraries.assistant.pcp.e.e.a(cj.o)));
        com.google.android.libraries.assistant.pcp.s.t tVar3 = com.google.android.libraries.assistant.pcp.s.t.j;
        i.i(tVar3, new com.google.android.libraries.assistant.pcp.v.e(tVar3, com.google.android.libraries.assistant.pcp.e.e.a(cj.q)));
        com.google.android.libraries.assistant.pcp.s.t tVar4 = com.google.android.libraries.assistant.pcp.s.t.l;
        com.google.android.libraries.assistant.pcp.q.a.ah ahVar = (com.google.android.libraries.assistant.pcp.q.a.ah) this.f.oQ.a();
        jo joVar = this.f;
        i.i(tVar4, new com.google.android.libraries.assistant.pcp.v.c.k(ahVar, joVar.iu(), joVar.iq(), (com.google.android.libraries.assistant.pcp.q.a) joVar.oP.a(), (ag) this.f.bo.a()));
        i.i(com.google.android.libraries.assistant.pcp.s.t.p, new com.google.android.libraries.assistant.pcp.v.a.j(new com.google.android.libraries.assistant.pcp.v.a.m(((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45460763").d()), (ag) this.f.Q.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45428560").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45428561").d(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45428562").b(), (com.google.common.v.f) this.f.ez.a(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a(), ((com.google.apps.tiktok.experiments.e) this.f.b.iq().a.a()).a("com.google.android.apps.search.assistant.device 45440310").f(), kJ()));
        jo joVar2 = this.f;
        i.i(com.google.android.libraries.assistant.pcp.s.t.o, new com.google.android.libraries.assistant.pcp.v.d.i(joVar2.ip(), (com.google.android.libraries.assistant.pcp.r.b.i) joVar2.we.a(), (Executor) this.f.H.a()));
        i.i(com.google.android.libraries.assistant.pcp.s.t.n, new com.google.android.libraries.assistant.pcp.v.b.k((ag) this.f.Q.a(), hd(), (com.google.android.libraries.assistant.pcp.r.b.i) this.f.we.a()));
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rk() {
        com.google.android.libraries.search.assistant.n.a.a.a.b bVar = com.google.android.libraries.search.assistant.n.a.a.a.b.f;
        com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) this.cF.a();
        com.google.android.libraries.search.assistant.n.a.d.u uVar = com.google.android.apps.search.assistant.surfaces.voice.e.e.h.e.a;
        aeVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.google.android.apps.search.assistant.surfaces.voice.j.e.f b = aeVar.b();
        if (b.d == 1 && ((Boolean) b.e).booleanValue()) {
            com.google.android.libraries.search.assistant.n.a.a.m.a(com.google.android.apps.search.assistant.surfaces.voice.e.e.h.e.a, linkedHashMap);
        }
        com.google.android.libraries.search.assistant.n.a.a.o oVar = new com.google.android.libraries.search.assistant.n.a.a.o(linkedHashMap);
        com.google.android.libraries.search.assistant.n.a.a.a.b bVar2 = com.google.android.libraries.search.assistant.n.a.a.a.b.e;
        com.google.android.apps.search.assistant.surfaces.voice.j.b.ae aeVar2 = (com.google.android.apps.search.assistant.surfaces.voice.j.b.ae) this.cF.a();
        boolean f = h.a.a.f.b.a.n.f(this.l);
        com.google.android.libraries.search.assistant.n.a.d.u uVar2 = com.google.android.apps.search.assistant.surfaces.voice.e.e.p.q.a;
        aeVar2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.google.android.apps.search.assistant.surfaces.voice.j.e.f b2 = aeVar2.b();
        if (b2.d == 1 && ((Boolean) b2.e).booleanValue()) {
            com.google.android.libraries.search.assistant.n.a.a.m.a(com.google.android.apps.search.assistant.surfaces.voice.e.e.p.q.a, linkedHashMap2);
        }
        if (f) {
            com.google.android.libraries.search.assistant.n.a.d.x xVar = com.google.android.apps.search.assistant.surfaces.voice.e.e.p.q.b;
            xVar.getClass();
            com.google.android.libraries.search.assistant.n.a.d.u uVar3 = xVar.c;
            com.google.android.libraries.search.assistant.n.a.d.u uVar4 = uVar3;
            if (uVar3 == null) {
                uVar4 = com.google.android.libraries.search.assistant.n.a.d.u.f4874a;
            }
            uVar4.getClass();
            com.google.android.libraries.search.assistant.n.a.a.m.b(uVar4, new com.google.android.libraries.search.assistant.n.a.a.l(xVar, 0), linkedHashMap2);
        }
        return fu.n(bVar, oVar, bVar2, new com.google.android.libraries.search.assistant.n.a.a.o(linkedHashMap2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rl() {
        fq i = fu.i(39);
        i.i(lt.k, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.d((Context) this.f.f.a(), cl(), cm(), il(), cy(), ae.aO(this.l), ae.bl(this.l), ae.aP(this.l), ci(), ae.ar(this.l), ae.av(this.l), bG(), cx(), cz()));
        i.i(lt.r, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.g((Context) this.f.f.a(), cm(), bu(), ae.aO(this.l), ae.bl(this.l), ae.bd(this.l), ae.aP(this.l), ci(), ae.ak(this.l), cy(), ck()));
        i.i(lt.b, bV());
        i.i(lt.c, bW());
        i.i(lt.L, bK());
        i.i(lt.G, bD());
        i.i(lt.x, bR());
        i.i(lt.F, bR());
        i.i(lt.A, bR());
        i.i(lt.C, bR());
        i.i(lt.D, bR());
        i.i(lt.E, bR());
        i.i(lt.B, bR());
        i.i(lt.y, bR());
        i.i(lt.z, bR());
        i.i(lt.w, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.az((Context) this.f.f.a(), (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), cl(), bS(), cj(), ae.aw(this.l), vH(), vI(), ae.af(this.l), ae.ae(this.l), ci(), cy(), bU(), (String) this.f.Y.a(), cY(), dd(), vv(), ae.v(this.l), ae.aW(this.l), dg(), ae.ag(this.l), ae.bb(this.l), new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.c.bf(kD(), (com.google.apps.tiktok.concurrent.ao) this.f.bz.a())));
        jo joVar = this.f;
        lt ltVar = lt.s;
        Context context = (Context) joVar.f.a();
        cm();
        i.i(ltVar, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.l(context, bu(), ae.aO(this.l), ci(), ae.ak(this.l), ck()));
        jo joVar2 = this.f;
        lt ltVar2 = lt.I;
        Context context2 = (Context) joVar2.f.a();
        cm();
        i.i(ltVar2, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.p(context2, bu(), ae.aO(this.l), ae.bf(this.l), ci(), ae.aq(this.l), ck(), cy()));
        lt ltVar3 = lt.j;
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.i cl = cl();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.d cj = cj();
        PackageManager packageManager = (PackageManager) this.f.h.a();
        ci();
        i.i(ltVar3, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.d.g(cl, cj, packageManager, ae.bg(this.l), cy(), (com.google.android.apps.search.assistant.surfaces.voice.o.p) this.f.b.o.a(), dg(), ae.u(this.l), (String) this.f.Y.a()));
        i.i(lt.P, bI());
        i.i(lt.M, ce());
        i.i(lt.K, bE());
        i.i(lt.O, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.d.l((com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.i.r) this.aR.a(), dd(), ci(), ae.bh(this.l), ae.al(this.l), vv(), ck(), cy(), bJ(), dg(), ae.u(this.l)));
        i.i(lt.p, bL());
        i.i(lt.v, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.d.q(cl(), ae.bi(this.l), ae.aw(this.l), ci(), cy(), ck(), bJ(), dg(), ae.u(this.l)));
        i.i(lt.N, cf());
        i.i(lt.g, bY());
        i.i(lt.h, bZ());
        i.i(lt.H, bF());
        jo joVar3 = this.f;
        lt ltVar4 = lt.l;
        Context context3 = (Context) joVar3.f.a();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.i cl2 = cl();
        com.google.android.apps.search.assistant.surfaces.voice.robin.execution.e.a.e cm = cm();
        bG();
        i.i(ltVar4, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.features.a.aa(context3, cl2, cm, cy(), ae.aO(this.l), ae.bd(this.l), ae.aP(this.l), (com.google.android.libraries.search.assistant.performer.o.l) this.bJ.a(), ae.bM(this.l), ae.bN(this.l), ae.bK(this.l), ci(), ae.ap(this.l), ae.av(this.l), ae.bE(this.l), ck(), cz()));
        i.i(lt.J, cg());
        i.i(lt.f, ca());
        i.i(lt.n, cb());
        i.i(lt.u, bN());
        i.i(lt.t, bO());
        i.i(lt.q, new com.google.android.apps.search.assistant.surfaces.voice.robin.execution.d.l(cl(), (aa) this.bZ.a(), h.a.a.d.b.a.y.s(this.l), new h.a.a.d.b.a.ag(this.l).c(), (com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.a) this.bu.a(), dh(), (com.google.android.libraries.search.b.b) this.aV.a(), cy(), (KeyguardManager) this.f.nn.a(), cf(), ae.w(this.l)));
        i.i(lt.d, cc());
        i.i(lt.o, bP());
        i.i(lt.e, cd());
        return i.h(true);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.h$a
    public final Map rm() {
        jr jrVar = this.f.b;
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, (Map) jrVar.dB.a(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, (Map) this.f.b.dD.a());
    }

    @Override // com.google.android.libraries.search.l.z
    public final Map rn() {
        return this.gF.b.gs();
    }

    @Override // com.google.apps.tiktok.m.a.d$a
    public final Map ro() {
        fq i = fu.i(12);
        je jeVar = this.gF.c;
        i.i("remote_interactor_unknown_product", jeVar.f313a.b.aR());
        i.i("traces", (com.google.apps.tiktok.h.a.h) jeVar.f313a.cw.a());
        i.i("apa_invocation", (com.google.apps.tiktok.h.a.h) jeVar.f313a.uJ.a());
        i.i("generic_appflows", jeVar.f313a.f319a.pd());
        i.i("generic_appflows_binary_manual", jeVar.f313a.f319a.pc());
        i.i("DebugServiceExport", (com.google.apps.tiktok.h.a.h) jeVar.f313a.tK.a());
        i.i("search_notifications", jeVar.f313a.f319a.cK());
        ik ikVar = jeVar.b;
        i.i("DebugServiceSherlogExport", new com.google.android.libraries.p.a.b.c.ab(ikVar.hi(), (ag) ikVar.f.Q.a(), com.google.android.libraries.p.a.a.b(ikVar.qi())));
        ik ikVar2 = jeVar.b;
        jo joVar = jeVar.f313a;
        i.i("server_tokens", new com.google.android.libraries.search.feedback.b.g(joVar.mJ(), ikVar2.kr(), joVar.lq()));
        i.i("display_class", new com.google.android.libraries.search.feedback.b.a((Context) jeVar.f313a.f.a(), (cq) jeVar.f313a.H.a()));
        i.i("phenotype_flags", jeVar.b.f308a.mt());
        i.i("phenotype_flags_binary", jeVar.b.f308a.ms());
        return i.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rp() {
        gy l = ha.l(7);
        l.h(com.google.apps.tiktok.p.a.b.b.a(this.f.lZ));
        l.h(com.google.android.libraries.performance.a.c.a.b.a(this.f.mc));
        l.j(this.f.YI());
        l.j(com.google.android.libraries.search.trust.c.a.c.a(this.f.me));
        l.h(new AbstractMap.SimpleImmutableEntry(com.google.apps.tiktok.account.c.a.a, this.hp));
        l.h(new AbstractMap.SimpleImmutableEntry(com.google.apps.tiktok.p.w.a, new com.google.apps.tiktok.p.b.a((com.google.apps.tiktok.p.b.f) this.hq.a(), (AccountId) this.g.a())));
        l.h((AbstractMap.SimpleImmutableEntry) this.hu.a());
        return com.google.apps.tiktok.p.y.a(l.g());
    }

    @Override // com.google.android.libraries.search.l.z
    public final Map rq() {
        iz izVar = this.gF.b;
        jo joVar = izVar.f311a;
        com.google.protos.o.b.v vVar = com.google.protos.o.b.v.cC;
        com.google.android.libraries.search.assistant.am.a.c cVar = new com.google.android.libraries.search.assistant.am.a.c((Context) joVar.f.a(), (AccountId) izVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a(), (cq) izVar.f311a.H.a());
        jo joVar2 = izVar.f311a;
        return fu.o(vVar, cVar, com.google.protos.o.b.v.cE, izVar.b.f308a.eC(), com.google.protos.o.b.v.cD, new com.google.android.libraries.search.assistant.am.a.b.b((Context) joVar2.f.a(), (AccountId) izVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a(), (cq) izVar.f311a.H.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map rr() {
        return fu.n(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c, new com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.e.c(), com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.d, sg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rs() {
        h hVar = this.cI;
        boolean h = h.a.a.f.b.a.n.h(this.l);
        hVar.getClass();
        m.a.a.r rVar = new m.a.a.r();
        if (!h) {
            Object a2 = hVar.a();
            a2.getClass();
            rVar.add(a2);
        }
        Set ah = m.a.an.ah(rVar);
        ah.getClass();
        return ah;
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f, com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.j
    public final Set rt() {
        Set set;
        com.google.android.apps.search.assistant.surfaces.voice.feedback.a.c cVar = (com.google.android.apps.search.assistant.surfaces.voice.feedback.a.c) this.gF.f308a.bV.a();
        cVar.getClass();
        Bitmap bitmap = cVar.a;
        cVar.a = null;
        if (bitmap != null) {
            set = Collections.singleton(bitmap);
            set.getClass();
        } else {
            set = m.a.aa.a;
        }
        return ha.o(set);
    }

    @Override // com.google.android.libraries.search.integrations.j.a.b.d
    public final Set ru() {
        iz izVar = this.gF.b;
        com.google.android.apps.search.assistant.verticals.ambient.o.a.a.a aVar = new com.google.android.apps.search.assistant.verticals.ambient.o.a.a.a(izVar.f311a.fZ());
        jy jyVar = izVar.f311a.f319a;
        jj jjVar = izVar.b.f308a;
        com.google.android.apps.search.googleapp.notifications.f.a.a aVar2 = new com.google.android.apps.search.googleapp.notifications.f.a.a(jjVar.cr(), jyVar.cK(), jjVar.sn().F(), (cq) izVar.f311a.H.a());
        com.google.android.apps.search.googleapp.notifications.f.a.g gVar = new com.google.android.apps.search.googleapp.notifications.f.a.g(1);
        jj jjVar2 = izVar.b.f308a;
        jo joVar = izVar.f311a;
        com.google.android.apps.search.googleapp.notifications.f.a.f fVar = new com.google.android.apps.search.googleapp.notifications.f.a.f(joVar.b.X(), joVar.f319a.cK(), jjVar2.sn().F(), (cq) izVar.f311a.H.a(), 1);
        com.google.android.apps.search.googleapp.notifications.f.a.f fVar2 = new com.google.android.apps.search.googleapp.notifications.f.a.f((com.google.android.apps.search.googleapp.discover.t.j) izVar.b.f308a.dV.a(), izVar.f311a.f319a.cK(), izVar.b.f308a.sn().F(), (cq) izVar.f311a.H.a(), 0);
        com.google.android.apps.search.googleapp.notifications.f.a.g gVar2 = new com.google.android.apps.search.googleapp.notifications.f.a.g(0);
        com.google.apps.tiktok.account.data.b bVar = (com.google.apps.tiktok.account.data.b) izVar.f311a.bN.a();
        AccountId accountId = (AccountId) izVar.b.g.a();
        com.google.android.libraries.search.udcdataservice.k kVar = (com.google.android.libraries.search.udcdataservice.k) izVar.b.Q.a();
        com.google.android.apps.search.googleapp.discover.ae.m mVar = (com.google.android.apps.search.googleapp.discover.ae.m) izVar.b.f308a.dw.a();
        izVar.f311a.kY();
        Context context = (Context) izVar.f311a.f.a();
        ag agVar = (ag) izVar.f311a.Q.a();
        Context context2 = (Context) izVar.f311a.f.a();
        com.google.apps.tiktok.account.data.a.d dVar = (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a();
        ((com.google.apps.tiktok.experiments.e) izVar.f311a.b.jw().a.a()).a("com.google.android.libraries.search.googleapp.device 45655533").d();
        com.google.common.v.f fVar3 = (com.google.common.v.f) izVar.f311a.ez.a();
        jo joVar2 = izVar.f311a;
        jr jrVar = joVar2.b;
        com.google.android.libraries.search.j.a.p kY = joVar2.kY();
        ((com.google.apps.tiktok.experiments.e) jrVar.jw().a.a()).a("com.google.android.libraries.search.googleapp.device 45656821").d();
        ((com.google.apps.tiktok.experiments.e) izVar.f311a.b.jw().a.a()).a("com.google.android.libraries.search.googleapp.device 45656820").d();
        return ha.w(aVar, aVar2, gVar, fVar, fVar2, gVar2, new com.google.android.libraries.search.integrations.j.a.b.a[]{new com.google.android.apps.search.googleapp.notifications.f.a.e(new com.google.android.apps.search.googleapp.discover.expeditions.a.f(bVar, accountId, kVar, mVar, context, agVar, new com.google.android.apps.search.googleapp.discover.expeditions.a.a.a(context2, dVar, fVar3, kY, (cg) izVar.e.a()), ((com.google.apps.tiktok.experiments.e) izVar.f311a.b.jw().a.a()).a("com.google.android.libraries.search.googleapp.device 45648797").f()), izVar.f311a.f319a.cK(), izVar.b.f308a.sn().F(), (cq) izVar.f311a.H.a()), new com.google.android.libraries.search.integrations.j.a.b.h((AccountId) izVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a(), (cq) izVar.f311a.H.a(), 1), new com.google.android.libraries.search.integrations.j.a.b.c((com.google.android.libraries.search.integrations.c.a.c) izVar.b.Y.a(), (cq) izVar.f311a.H.a()), new com.google.android.libraries.search.integrations.j.a.b.f((Context) izVar.f311a.f.a(), 1), new com.google.android.libraries.search.integrations.j.a.b.f((Context) izVar.f311a.f.a(), 0), new com.google.android.libraries.search.integrations.j.a.b.f((PackageManager) izVar.f311a.h.a(), 2), new com.google.android.libraries.search.integrations.j.a.b.h((AccountId) izVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) izVar.f311a.bq.a(), (cq) izVar.f311a.H.a(), 0)});
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.i.c.a.e.a
    public final Set rv() {
        jj jjVar = this.gF.f308a;
        return ha.t((com.google.android.apps.search.assistant.verticals.ambient.i.c.a) jjVar.b.ab.a(), (com.google.android.apps.search.assistant.verticals.ambient.i.c.a) jjVar.b.ac.a(), (com.google.android.apps.search.assistant.verticals.ambient.i.c.a) jjVar.b.R.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f, com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.j
    public final Set rw() {
        m.a.aa singleton;
        int ordinal;
        com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b) this.gF.f308a.bU.a();
        bVar.getClass();
        com.google.android.libraries.search.assistant.p.a.d.bc bcVar = (com.google.android.libraries.search.assistant.p.a.d.bc) bVar.b.get();
        if (bcVar == null) {
            singleton = m.a.aa.a;
        } else {
            com.google.android.libraries.search.assistant.p.a.d.h hVar = (bcVar.c == 2 ? (com.google.android.libraries.search.assistant.p.a.d.bb) bcVar.d : com.google.android.libraries.search.assistant.p.a.d.bb.a).c;
            com.google.android.libraries.search.assistant.p.a.d.h hVar2 = hVar;
            if (hVar == null) {
                hVar2 = com.google.android.libraries.search.assistant.p.a.d.h.b;
            }
            com.google.android.libraries.search.assistant.p.a.d.g gVar = (com.google.android.libraries.search.assistant.p.a.d.g) m.a.t.n(new com.google.protobuf.bu(hVar2.d, com.google.android.libraries.search.assistant.p.a.d.h.a));
            String str = "L";
            if (gVar != null && (((ordinal = gVar.ordinal()) == 4 || ordinal == 5) && bVar.a)) {
                str = "S1";
            }
            singleton = Collections.singleton(new com.google.android.apps.search.assistant.surfaces.voice.feedback.b.a(str));
            singleton.getClass();
        }
        return ha.o(singleton);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rx() {
        return new op(eg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set ry() {
        Optional of = Optional.of(new com.google.android.apps.gsa.assistant.settings.shared.z((Context) this.f.f.a(), (Executor) this.f.H.a(), c.b(this.f.gq), c.b(this.f.lx), (com.google.android.apps.gsa.assistant.settings.shared.f) this.f.nE.a(), (com.google.android.apps.gsa.assistant.settings.shared.t) this.f.gW.a()));
        of.isPresent();
        return new op(of.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set rz() {
        com.google.android.apps.search.assistant.surfaces.voice.e.e.z.a aI = aI();
        Duration duration = com.google.android.apps.search.assistant.surfaces.voice.e.n.f2052a;
        m.a.a.r rVar = new m.a.a.r();
        for (com.google.android.libraries.search.assistant.aq.q.a.a.b bVar : com.google.android.libraries.search.assistant.aq.q.a.a.b.values()) {
            if (bVar != com.google.android.libraries.search.assistant.aq.q.a.a.b.PKG_UNSPECIFIED && !com.google.android.libraries.search.assistant.aq.q.a.j.f4108a.contains(bVar)) {
                bVar.getClass();
                rVar.add(new com.google.android.apps.search.assistant.surfaces.voice.e.e.z.d(aI.f2040a, aI.b, bVar));
            }
        }
        Set ah = m.a.an.ah(rVar);
        ah.getClass();
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.assistant.settings.features.x.a.l s() {
        return new com.google.android.apps.gsa.assistant.settings.features.x.a.l(new op((com.google.android.apps.gsa.staticplugins.nga.t.z) this.f.lv.a()), (AccountId) this.g.a(), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f.gT.a(), (Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sA() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45374660").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sB() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.iy().a.a()).a("com.google.android.apps.search.assistant.device 45410849").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f
    public final boolean sC() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.b.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45650773").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sD() {
        return ((Boolean) this.dh.a()).booleanValue();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sE() {
        return h.a.a.d.b.a.y.d(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sF() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45477050").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sG() {
        return h.a.a.f.b.a.i.a(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sH() {
        return h.a.a.f.b.a.n.c(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sI() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644721").f(), ae.k(this.l));
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sJ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45370016").f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sK() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45378875").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.ui.ag$a
    public final boolean sL() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.gF.f308a.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45641673").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.handsfree.headsets.oobe.ui.ag$a
    public final boolean sM() {
        return ((Boolean) this.dh.a()).booleanValue();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sN() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45383855").f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sO() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45372285").f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sP() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45388811").f();
    }

    @Override // com.google.android.libraries.lens.view.geller.d
    public final boolean sQ() {
        return ((Boolean) this.gF.f308a.fl.a()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sR() {
        return ae.by(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sS() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45656429").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sT() {
        return h.a.a.d.b.a.y.i(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sU() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45644072").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sV() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619018").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sW() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45653860").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sX() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45477786").f();
    }

    final boolean sY() {
        return ae.aF(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean sZ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45585501").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set sa() {
        return ha.u((com.google.android.libraries.search.trust.b.g) this.S.a(), ho(), jK(), new com.google.android.libraries.search.trust.b.an((com.google.apps.tiktok.account.data.b) this.f.bN.a(), (AccountId) this.g.a(), jM(), (ag) this.f.Q.a(), h.a.a.as.b.a.d.b(this.l)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set sb() {
        return ha.s((com.google.android.libraries.search.assistant.aw.d.h) this.dn.a(), (com.google.android.libraries.search.assistant.aw.d.h) this.kt.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set sc() {
        boolean f = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45370127").f();
        boolean f2 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45373364").f();
        boolean f3 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45372587").f();
        boolean f4 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45372205").f();
        boolean f5 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45374058").f();
        boolean f6 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45370128").f();
        boolean f7 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45370130").f();
        boolean f8 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45370129").f();
        boolean f9 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45372577").f();
        boolean f10 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45374611").f();
        boolean f11 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45383920").f();
        boolean f12 = ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45387843").f();
        m.a.a.r rVar = new m.a.a.r();
        com.google.android.libraries.search.assistant.n.a.d.u uVar = com.google.android.libraries.search.assistant.av.d.a.v.f4176a;
        rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.f4176a);
        rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.e);
        rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.i);
        rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.d);
        if (f) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.b);
        }
        if (f2) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.c);
        }
        if (f3) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.g);
        }
        if (f4) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.h);
        }
        if (f5) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.f);
        }
        if (f6) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.w);
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.x);
        }
        if (f7) {
            rVar.addAll(com.google.android.libraries.search.assistant.av.d.a.v.y);
        }
        if (f8) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.u);
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.v);
        }
        if (f9) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.j);
        }
        if (f10) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.z);
        }
        if (f11) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.A);
        }
        if (f12) {
            rVar.add(com.google.android.libraries.search.assistant.av.d.a.v.B);
        }
        Set ah = m.a.an.ah(rVar);
        com.google.common.f.h d = com.google.android.libraries.search.assistant.av.d.b.b.f4180a.d();
        d.aj(com.google.common.f.a.e.a, "Sbcp");
        d.ak(56989);
        com.google.common.f.h hVar = d;
        ArrayList arrayList = new ArrayList(m.a.t.aX(ah, 10));
        Iterator it = ah.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.libraries.search.assistant.n.a.a.k.a((com.google.android.libraries.search.assistant.n.a.d.u) it.next()));
        }
        hVar.s("Enabled context keys: %s.", arrayList);
        ah.getClass();
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set sd() {
        com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa aaVar = (com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.aa) this.f.dp.a();
        aaVar.getClass();
        return ha.s(new com.google.android.libraries.assistant.auto.jumpboost.m.a.a.a.a(aaVar), new com.google.android.libraries.assistant.auto.jumpboost.b.e.a.a.b((com.google.android.apps.gsa.search.core.preferences.n) this.f.gf.a(), (Executor) this.f.H.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set se() {
        com.google.android.libraries.search.b.b a2 = ((com.google.android.libraries.search.t.a.a) this.J.a()).a(com.google.android.libraries.search.t.c.ASSISTANT_AUTO_PROJECTED);
        com.google.android.libraries.assistant.auto.tng.p.c.a.e eVar = (com.google.android.libraries.assistant.auto.tng.p.c.a.e) this.f3if.a();
        eVar.getClass();
        a2.getClass();
        return new op(new com.google.android.libraries.assistant.auto.tng.p.c.a.d(eVar, this.f.b.ay, a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set sf() {
        boolean y = h.a.a.d.b.a.y.y(this.l);
        com.google.android.apps.search.assistant.surfaces.voice.e.e.ag.h hVar = new com.google.android.apps.search.assistant.surfaces.voice.e.e.ag.h(h.a.a.f.b.a.n.a(this.l), h.a.a.f.b.a.n.b(this.l), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45424644").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45618655").f(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45623005").f(), c.b(this.jB), new com.google.android.libraries.search.assistant.aq.v.a.c((p) this.P.a(), (ag) this.f.Q.a(), c.b(this.jC), (Context) this.f.f.a()), (ag) this.f.bo.a(), (n) this.f.R.a());
        m.a.a.r rVar = new m.a.a.r();
        if (y) {
            rVar.add(hVar);
        }
        Set ah = m.a.an.ah(rVar);
        ah.getClass();
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final java.util.function.Function sg() {
        return new com.google.android.libraries.assistant.auto.tng.v.b.a.a.a.d.a((com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.az) this.f.b.hl.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.p.q
    public final k.a.a sh() {
        return this.gF.f308a.j;
    }

    @Override // com.google.android.apps.gsa.staticplugins.p.q
    public final k.a.a si() {
        return this.f.ea;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final k.a.a sj() {
        return this.gF.f308a.m;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final k.a.a sk() {
        return this.ec;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final k.a.a sl() {
        return this.gF.f308a.l;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.ab$a
    public final k.a.a sm() {
        return this.f.b.dv;
    }

    @Override // com.google.android.libraries.lens.sdk.avs.c
    public final k.a.a sn() {
        return this.gF.f308a.eA;
    }

    @Override // com.google.android.apps.gsa.staticplugins.gearhead.projected.d
    public final k.a.a so() {
        return this.gF.f308a.k;
    }

    @Override // com.google.android.apps.search.omnient.host.invocation.ac, com.google.android.apps.search.omnient.host.invocation.c.d$a
    public final k.a.a sp() {
        return this.gF.f308a.eJ;
    }

    @Override // com.google.android.apps.gsa.staticplugins.p.q
    public final k.a.a sq() {
        return this.gF.f308a.k;
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a$a
    public final boolean sr() {
        return ((Boolean) this.gF.f308a.cR.a()).booleanValue();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean ss() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45619110").f();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z$a
    public final boolean st() {
        return h.a.a.f.b.a.i.b(this.l);
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.grpc.ae$a
    public final boolean su() {
        return this.gF.f308a.sm().J();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sv() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45383596").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sw() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45389059").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sx() {
        return uD();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean sy() {
        return uB();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean sz() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45375353").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tA() {
        return ae.j(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tB() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45423770").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tC() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45423771").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tD() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45476246").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tE() {
        return h.a.a.as.b.a.a.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tF() {
        return new h.a.a.d.b.a.ag(this.l).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tG() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45613260").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tH() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45619790").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tI() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45620740").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tJ() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45630245").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tK() {
        return new h.a.a.d.b.a.ah(this.l).s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tL() {
        return new h.a.a.d.b.a.ah(this.l).p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tM() {
        return new h.a.a.d.b.a.ah(this.l).r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tN() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45649013").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tO() {
        return new h.a.a.d.b.a.ah(this.l).q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tP() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45598586").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tQ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45646033").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tR() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45658228").f();
    }

    final boolean tS() {
        return new h.a.a.d.b.a.ag(this.l).c();
    }

    final boolean tT() {
        return ae.aT(this.l);
    }

    final boolean tU() {
        return ae.bj(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tV() {
        return h.a.a.as.b.a.d.b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tW() {
        return h.a.a.as.b.a.d.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tX() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45621660").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tY() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651692").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tZ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45627470").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ta() {
        return new h.a.a.d.b.a.ah(this.l).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tb() {
        return new h.a.a.d.b.a.ah(this.l).n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tc() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45643333").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean td() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45627894").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean te() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45628155").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tf() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45634473").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tg() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45641891").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean th() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639902").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ti() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45614295").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tj() {
        return ae.X(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tk() {
        return ae.W(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tl() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645556").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tm() {
        return ae.ab(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tn() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45650585").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean to() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651673").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tp() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45651674").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tq() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45658637").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tr() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45633853").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ts() {
        return new h.a.a.d.b.a.ah(this.l).l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tt() {
        return new h.a.a.d.b.a.ah(this.l).m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tu() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45640894").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tv() {
        return ae.l(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tw() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642533").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tx() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45613770").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ty() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45643100").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean tz() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45615953").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uA() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.user 45418192").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uB() {
        return ((com.google.apps.tiktok.experiments.e) ((h.a.a.f.b.a.k) this.aU.a()).a.a()).a("com.google.android.apps.search.assistant.user 45478400").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uC() {
        return h.a.a.e.a.a.i.e(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uD() {
        return ((com.google.apps.tiktok.experiments.e) ((h.a.a.f.b.a.k) this.aU.a()).a.a()).a("com.google.android.apps.search.assistant.user 45658440").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uE() {
        return h.a.a.r.b.a.p.b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uF() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45380977").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uG() {
        return h.a.a.f.b.a.i.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uH() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642060").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uI() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45351324").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uJ() {
        return h.a.a.f.b.a.i.b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uK() {
        return h.a.a.d.b.a.y.k(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uL() {
        return h.a.a.d.b.a.y.e(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uM() {
        return h.a.a.e.a.a.i.b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uN() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45461957").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uO() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45476178").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uP() {
        return h.a.a.e.a.a.i.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uQ() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45617113").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uR() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45620378").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uS() {
        return h.a.a.e.a.a.i.c(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uT() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45628778").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uU() {
        return h.a.a.e.a.a.b.a(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uV() {
        return h.a.a.e.a.a.b.b(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uW() {
        return h.a.a.f.b.a.n.q(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uX() {
        return h.a.a.f.b.a.n.n(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uY() {
        return h.a.a.f.b.a.n.p(this.l);
    }

    final boolean uZ() {
        return ae.t(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ua() {
        return h.a.a.d.b.a.y.q(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ub() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.user 45629206").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uc() {
        return h.a.a.d.b.a.y.j(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ud() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45638392").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ue() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45649489").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uf() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45377716").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ug() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45377717").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uh() {
        return h.a.a.f.b.a.n.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ui() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45462003").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uj() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.user 45477119").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uk() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.f.b.a.k(this.l).a.a()).a("com.google.android.apps.search.assistant.user 45613238").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ul() {
        return new h.a.a.d.b.a.ag(this.l).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean um() {
        return h.a.a.f.b.a.n.f(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean un() {
        return h.a.a.f.b.a.n.h(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uo() {
        return new h.a.a.f.b.a.k(this.l).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean up() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45403571").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uq() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45402106").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ur() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45416571").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean us() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45478273").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ut() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45476096").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uu() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45350605").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uv() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45626621").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uw() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.interactor.user 45650614").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ux() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640854").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uy() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45649105").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean uz() {
        return h.a.a.e.a.a.i.f(this.l);
    }

    public final boolean vA() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45618910").f(), ae.aC(this.l));
    }

    public final boolean vB() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619111").f(), ae.az(this.l));
    }

    final boolean vC() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45637344").f(), ae.aB(this.l));
    }

    public final boolean vD() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45632748").f(), ae.aA(this.l));
    }

    public final boolean vE() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622498").f(), ae.aD(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean vF() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619455").f(), ae.az(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean vG() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45625878").f(), ae.az(this.l));
    }

    final boolean vH() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640275").f(), ae.aD(this.l));
    }

    final boolean vI() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45645775").f(), ae.aD(this.l));
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a$a
    public final boolean vJ() {
        return this.gF.f308a.sQ().aA();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vK() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45643525").f(), ae.k(this.l));
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean vL() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45408629").f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean vM() {
        return ((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("com.google.android.apps.search.assistant.device 45415044").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vN() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45387367").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vO() {
        return this.f.b.iJ().l();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean vP() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.user 45353591").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.spokennotifications.service.p$a
    public final boolean vQ() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.gF.f308a.b.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45648053").f();
    }

    @Override // com.google.android.apps.search.assistant.libraries.b.g.b
    public final com.google.android.apps.search.assistant.libraries.b.f.c vR() {
        return new com.google.android.apps.search.assistant.libraries.b.f.c(this.gF.f308a.b.iL());
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.u.p.b.c.a
    public final l vS() {
        return H();
    }

    @Override // com.google.android.apps.gsa.staticplugins.ba.q, com.google.android.apps.search.assistant.verticals.ambient.u.v.s.a, com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.a.d
    public final l vT() {
        return H();
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.featuredata.k
    public final com.google.android.apps.search.assistant.platform.pcp.featuredata.j vU() {
        return J();
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.d.e
    public final com.google.android.apps.search.assistant.platform.pcp.d.h vV() {
        return Q();
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.h.g
    public final com.google.android.apps.search.assistant.platform.pcp.h.f vW() {
        return R();
    }

    @Override // com.google.android.apps.gsa.hotword.a.b$a
    public final com.google.android.apps.search.assistant.platform.g.g.b.c vX() {
        return (com.google.android.apps.search.assistant.platform.g.g.b.c) this.aj.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.r$a
    public final com.google.android.apps.search.assistant.platform.g.g.b.c vY() {
        return (com.google.android.apps.search.assistant.platform.g.g.b.c) this.aj.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.v.c
    public final com.google.android.apps.search.assistant.platform.g.g.b.f vZ() {
        return new com.google.android.apps.search.assistant.platform.g.g.b.f((cq) this.f.H.a(), (cg) this.hD.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean va() {
        return ae.aX(this.l);
    }

    @Override // com.google.android.apps.search.assistant.surfaces.appactions.service.i$a
    public final boolean vb() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.b.l.a()).a("com.google.android.apps.search.assistant.user 45350598").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.appactions.service.i$a
    public final boolean vc() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.b.l.a()).a("com.google.android.apps.search.assistant.user 18").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vd() {
        return h.a.a.f.b.a.n.d(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean ve() {
        return h.a.a.f.b.a.n.k(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vf() {
        return h.a.a.f.b.a.n.l(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vg() {
        return ((h.a.a.f.b.a.k) this.aU.a()).j();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vh() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.libraries.search.googleapp.user 45364480").f();
    }

    @Override // com.google.android.apps.gsa.nga.engine.at.e.e$a
    public final boolean vi() {
        return this.f.b.hD();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.googleone.e$a
    public final boolean vj() {
        jj jjVar = this.gF.f308a;
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) jjVar.b.aT.a(), jjVar.sq().M(), jjVar.sq().L());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.googleone.e$a
    public final boolean vk() {
        jj jjVar = this.gF.f308a;
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) jjVar.b.aT.a(), ((com.google.apps.tiktok.experiments.e) jjVar.sq().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45640772").f(), jjVar.sq().L());
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.grpc.ae$a
    public final boolean vl() {
        jj jjVar = this.gF.f308a;
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) jjVar.b.aT.a(), ((com.google.apps.tiktok.experiments.e) jjVar.b.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45640929").f(), ae.k(jjVar.b.l));
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vm() {
        return ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.gsa.pcp.user 45362357").f();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.feedback.activity.f
    public final boolean vn() {
        return ((com.google.apps.tiktok.experiments.e) this.gF.f308a.sr().a.a()).a("com.google.android.apps.search.assistant.mobile.user 45412005").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vo() {
        return h.a.a.r.b.a.p.b(this.l);
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a$a
    public final boolean vp() {
        return ((Boolean) this.gF.f308a.cU.a()).booleanValue();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vq() {
        return h.a.a.f.b.a.i.d(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vr() {
        return h.a.a.f.b.a.i.e(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vs() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.c((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642528").f(), ae.k(this.l));
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.j
    public final boolean vt() {
        return ((com.google.apps.tiktok.experiments.e) new h.a.a.r.b.a.s(this.l).a.a()).a("com.google.android.libraries.search.googleapp.user 45374035").f();
    }

    @Override // com.google.android.apps.gsa.search.core.aa.a.b
    public final boolean vu() {
        return h.a.a.as.b.a.a.a(this.l);
    }

    public final boolean vv() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45643254").f(), ae.az(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean vw() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45619497").f(), ae.Z(this.l));
    }

    final boolean vx() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45642643").f(), ae.Z(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean vy() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45622199").f(), ae.az(this.l));
    }

    public final boolean vz() {
        return com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.b.b((com.google.android.apps.search.assistant.surfaces.voice.j.a.b.f.a) this.aT.a(), ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45615305").f(), ae.aE(this.l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h wA() {
        return el().a((com.google.android.apps.search.assistant.verticals.ambient.trigger.f.b) this.hM.a(), com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.a.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.verticals.ambient.trigger.b.h wB() {
        return el().a((com.google.android.apps.search.assistant.verticals.ambient.trigger.h.a) this.hL.a(), com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.p.a.class);
    }

    @Override // com.google.android.apps.gsa.nga.engine.c.b.b.a
    public final com.google.android.apps.search.assistant.verticals.a.g.a.e wC() {
        return (com.google.android.apps.search.assistant.verticals.a.g.a.e) this.kh.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.g.s
    public final com.google.android.apps.search.assistant.verticals.automation.routines.b.a.e wD() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.verticals.automation.routines.b.a.e(new com.google.android.libraries.search.assistant.p.a.c.j((com.google.android.libraries.search.assistant.p.a.c.u) jjVar.me()), jjVar.bt(), (Executor) jjVar.f316a.H.a(), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a());
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.g.s
    public final com.google.android.apps.search.assistant.verticals.automation.routines.h.a.d wE() {
        return this.gF.f308a.bt();
    }

    @Override // com.google.android.apps.search.assistant.verticals.calendar.localcalendar.w$a
    public final com.google.android.apps.search.assistant.verticals.calendar.localcalendar.t wF() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.assistant.verticals.calendar.localcalendar.t((AccountId) jjVar.b.g.a(), (com.google.apps.tiktok.account.data.a.d) jjVar.f316a.bq.a(), (Executor) jjVar.f316a.H.a(), c.b(jjVar.cg), c.b(jjVar.ch), c.b(jjVar.ci), c.b(jjVar.f316a.b.dX), (com.google.android.libraries.search.t.i.y) jjVar.f316a.W.a(), (com.google.android.libraries.search.b.b) jjVar.b.ba.a());
    }

    @Override // com.google.android.apps.search.googleapp.discover.ae.r
    public final com.google.android.apps.search.googleapp.discover.ae.x wG() {
        return (com.google.android.apps.search.googleapp.discover.ae.x) this.gF.f308a.dE.a();
    }

    @Override // com.google.android.apps.search.podcasts.autodownload.j.a
    public final com.google.android.apps.search.podcasts.l.ae wH() {
        return (com.google.android.apps.search.podcasts.l.ae) this.gF.f308a.eL.a();
    }

    @Override // com.google.android.apps.search.soundsearch.g$a, com.google.android.apps.search.soundsearch.quicksettings.k
    public final com.google.android.apps.search.soundsearch.g.a.a.a wI() {
        return (com.google.android.apps.search.soundsearch.g.a.a.a) this.gF.f308a.eX.a();
    }

    @Override // com.google.android.apps.search.soundsearch.quicksettings.k
    public final com.google.android.apps.search.soundsearch.g.a.a.b wJ() {
        return (com.google.android.apps.search.soundsearch.g.a.a.b) this.gF.f308a.eY.a();
    }

    @Override // com.google.android.apps.search.widgets.weather.d.f
    public final com.google.android.apps.search.widgets.weather.b.m wK() {
        jj jjVar = this.gF.f308a;
        return new com.google.android.apps.search.widgets.weather.b.m((com.google.android.libraries.search.location.compliance.r) jjVar.b.N.a(), jjVar.b.jo(), (Context) jjVar.f316a.f.a());
    }

    @Override // com.google.android.apps.search.widgets.weather.d.f
    public final com.google.android.apps.search.widgets.weather.b.p wL() {
        jj jjVar = this.gF.f308a;
        com.google.android.apps.search.widgets.weather.b.c.f fVar = new com.google.android.apps.search.widgets.weather.b.c.f((com.google.android.libraries.search.location.y) jjVar.b.O.a(), (com.google.android.libraries.af.b.a) jjVar.f316a.pd.a(), (LocationManager) jjVar.f316a.b.ea.a());
        jo joVar = jjVar.f316a;
        com.google.android.apps.search.widgets.weather.b.b.a.g gVar = new com.google.android.apps.search.widgets.weather.b.b.a.g(jjVar.b.kr(), joVar.mJ(), joVar.lq());
        com.google.aw.h.f.b.p I = new com.google.aw.h.f.b.p(com.google.apps.tiktok.p.y.b(jjVar.b.V, (com.google.apps.tiktok.p.m) jjVar.f316a.b.eX.a(), (com.google.frameworks.client.data.android.d) jjVar.f316a.mb.a(), com.google.common.base.a.a)).I(new io.grpc.l[]{(com.google.apps.tiktok.p.u) jjVar.f316a.mh.a()});
        I.getClass();
        return new com.google.android.apps.search.widgets.weather.b.p(fVar, new com.google.android.apps.search.widgets.weather.b.b.e(gVar, I, (com.google.frameworks.client.data.android.d.f) jjVar.fb.a()), (com.google.common.v.f) jjVar.f316a.ez.a(), new com.google.android.apps.search.widgets.weather.b.b.a((ConnectivityManager) jjVar.f316a.wN.a()), jjVar.dz(), new com.google.android.apps.search.widgets.weather.b.w((Context) jjVar.f316a.f.a()));
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.h$a
    public final com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.ag wM() {
        return (com.google.android.libraries.assistant.auto.tng.assistant.d.d.a.ag) this.gF.f308a.o.a();
    }

    @Override // com.google.android.libraries.assistant.auto.tng.suggestions.j.d$a
    public final com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d wN() {
        return fq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.w.d.a.b.b wO() {
        return new com.google.android.libraries.assistant.auto.tng.w.d.a.b.b(this.aF, this.Z, (Executor) this.f.H.a());
    }

    @Override // com.google.android.libraries.assistant.contexttrigger.d
    public final com.google.android.libraries.assistant.contexttrigger.g.l wP() {
        return gm();
    }

    @Override // com.google.android.libraries.assistant.contexttrigger.g.f
    public final com.google.android.libraries.assistant.contexttrigger.g.y wQ() {
        return gn();
    }

    @Override // com.google.android.libraries.assistant.pcp.a.n$a
    public final com.google.android.libraries.assistant.pcp.d.a.w wR() {
        return gy();
    }

    @Override // com.google.android.libraries.assistant.pcp.a.n$a
    public final com.google.android.libraries.assistant.pcp.d.a.x wS() {
        return new com.google.android.libraries.assistant.pcp.d.a.x(this.aL);
    }

    @Override // com.google.android.libraries.assistant.pcp.k.b$a
    public final com.google.android.libraries.assistant.pcp.k.b.i wT() {
        jj jjVar = this.gF.f308a;
        ik ikVar = jjVar.b;
        com.google.android.libraries.assistant.pcp.g.a.ac gA = ikVar.gA();
        com.google.android.libraries.assistant.pcp.b.a.r gt = ikVar.gt();
        com.google.android.libraries.assistant.pcp.d.a.w gy = ikVar.gy();
        ik ikVar2 = jjVar.b;
        return new com.google.android.libraries.assistant.pcp.k.b.i(gA, gt, gy, new com.google.android.libraries.assistant.pcp.d.a.x(ikVar2.aL), (com.google.android.libraries.assistant.pcp.f.x) ikVar2.qB(), (com.google.android.libraries.assistant.pcp.h.e) ikVar2.cl.a(), (com.google.android.libraries.assistant.pcp.p.a.d) jjVar.b.cs.a(), (com.google.android.libraries.assistant.pcp.r.b.i) jjVar.f316a.we.a(), (lt) jjVar.b.aB.a(), (Executor) jjVar.f316a.H.a());
    }

    public final hm wU() {
        return new hm(this.f, this.gF);
    }

    @Override // com.google.android.libraries.lens.view.geller.d
    public final com.google.android.libraries.lens.view.geller.i wV() {
        return this.gF.f308a.ej();
    }

    @Override // com.google.android.apps.gsa.search.core.google.d
    public final com.google.android.libraries.search.a.b.q wW() {
        return (com.google.android.libraries.search.a.b.q) this.dg.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.i
    public final com.google.android.libraries.search.assistant.invocation.k.b.b.b wX() {
        return (com.google.android.libraries.search.assistant.invocation.k.b.b.b) this.gF.f308a.bJ.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.morris2.e.j$a
    public final com.google.android.libraries.search.assistant.ai.c.l wY() {
        return ii();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.t$a
    public final com.google.android.libraries.search.assistant.aj.d.b.r wZ() {
        jj jjVar = this.gF.f308a;
        Context context = (Context) jjVar.f316a.f.a();
        com.google.android.apps.gsa.u.d.h hVar = (com.google.android.apps.gsa.u.d.h) jjVar.f316a.wm.a();
        am amVar = (am) jjVar.b.z.a();
        ax axVar = (ax) jjVar.f316a.iv.a();
        cr crVar = (cr) jjVar.f316a.v.a();
        jo joVar = jjVar.f316a;
        return new com.google.android.libraries.search.assistant.aj.d.b.r(context, hVar, amVar, axVar, crVar, joVar.b.ib(), (com.google.apps.tiktok.account.data.a.d) joVar.bq.a(), (com.google.apps.tiktok.account.data.b) jjVar.f316a.bN.a(), com.google.common.base.at.k((com.google.android.libraries.search.assistant.at.a.a.h) jjVar.b.m.a()), (com.google.android.apps.search.assistant.platform.g.g.b.c) jjVar.b.aj.a(), (com.google.android.libraries.search.b.b) jjVar.b.ba.a(), com.google.common.base.at.k((com.google.android.apps.search.assistant.surfaces.voice.robin.y.aw) jjVar.b.cw.a()), (com.google.android.apps.search.assistant.surfaces.voice.o.p) jjVar.f316a.b.o.a(), jjVar.bK, jjVar.bL, jjVar.bM, jjVar.bN, jjVar.bO, jjVar.bP, jjVar.bQ, (String) jjVar.f316a.Y.a());
    }

    @Override // com.google.android.apps.search.assistant.platform.g.k.a.i, com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.w$a, com.google.android.libraries.assistant.c.b.b.g
    public final com.google.android.apps.search.assistant.platform.g.k.a.d wa() {
        return (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a();
    }

    @Override // com.google.android.apps.gsa.hotword.a.b$a
    public final com.google.android.apps.search.assistant.platform.g.k.a.d wb() {
        return (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a();
    }

    @Override // com.google.android.libraries.search.ai.p.a, com.google.android.libraries.search.ai.b.e.a
    public final com.google.android.apps.search.assistant.platform.g.k.a.d wc() {
        return (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.e.h.k
    public final com.google.android.apps.search.assistant.platform.g.k.a.d wd() {
        return (com.google.android.apps.search.assistant.platform.g.k.a.d) this.Z.a();
    }

    @Override // com.google.android.apps.search.assistant.platform.g.k.a.i
    public final com.google.android.apps.search.assistant.platform.g.k.a.d we() {
        return new com.google.android.apps.search.assistant.platform.g.k.a.d((cq) this.f.H.a(), (cg) this.gI.a(), c.b(this.jQ));
    }

    @Override // com.google.android.apps.search.assistant.platform.g.l.a.j
    public final com.google.android.apps.search.assistant.platform.g.l.a.o wf() {
        return this.gF.f308a.G();
    }

    @Override // com.google.android.apps.gsa.hotword.a.b$a
    public final com.google.android.apps.search.assistant.platform.g.m.b wg() {
        return ag();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.dictation.service.ac.g
    public final com.google.android.apps.search.assistant.platform.g.m.c wh() {
        return ah();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.p.a
    public final com.google.android.apps.search.assistant.surfaces.bisto.a.a.h wi() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.a.a.h) this.gF.f308a.bE.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.c.a
    public final com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.a.a.j wj() {
        return (com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.g.a.a.j) this.gF.f308a.bC.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.by$a
    public final com.google.android.apps.search.assistant.surfaces.bisto.e.b.e wk() {
        return this.gF.f308a.P();
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a.af.a
    public final com.google.android.apps.search.assistant.surfaces.voice.i.e.g wl() {
        return (com.google.android.apps.search.assistant.surfaces.voice.i.e.g) this.ki.a();
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.a.k.a
    public final com.google.android.apps.search.assistant.surfaces.voice.i.b.d wm() {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.b.d((com.google.common.v.f) this.f.ez.a(), (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.x) this.df.a());
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.l$b
    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.g.d.aa wn() {
        return this.gF.f308a.ac();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.robin.ui.googleone.e$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.c.g wo() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.c.g) this.bB.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c wp() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c(com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.o.c, bm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c wq() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c(com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.o.b, bm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c wr() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c(com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.m.a, bm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c ws() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.c(com.google.android.apps.search.assistant.surfaces.voice.robin.n.a.o.f2397a, bm());
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.a.z, com.google.android.apps.gsa.staticplugins.opa.appintegration.b.d$a, com.google.android.apps.search.assistant.platform.appintegration.grpc.ae$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w wt() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.ar.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.util.bl
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w wu() {
        return (com.google.android.apps.search.assistant.surfaces.voice.robin.q.a.w) this.ar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final al wv() {
        return bq();
    }

    @Override // com.google.android.apps.gsa.staticplugins.smartspace.ah$a, com.google.android.apps.search.assistant.verticals.ambient.grpc.impl.f$a, com.google.android.apps.search.assistant.verticals.ambient.settings.l$a, com.google.android.apps.search.assistant.verticals.ambient.s.c.e$a, com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.a$a, com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.e$a, com.google.android.apps.search.assistant.verticals.ambient.smartspace.widget.a.u, com.google.android.apps.search.assistant.verticals.ambient.trigger.e.g$a
    public final com.google.android.apps.search.assistant.verticals.ambient.q.a.l ww() {
        return (com.google.android.apps.search.assistant.verticals.ambient.q.a.l) this.ct.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.trigger.location.i
    public final com.google.android.apps.search.assistant.verticals.ambient.q.a.l wx() {
        return (com.google.android.apps.search.assistant.verticals.ambient.q.a.l) this.ct.a();
    }

    @Override // com.google.android.apps.gsa.staticplugins.ba.q
    public final com.google.android.apps.search.assistant.verticals.ambient.q.a.l wy() {
        return (com.google.android.apps.search.assistant.verticals.ambient.q.a.l) this.ct.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.ambient.trigger.location.i
    public final com.google.android.apps.search.assistant.verticals.ambient.r.b.e wz() {
        return (com.google.android.apps.search.assistant.verticals.ambient.r.b.e) this.hk.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.u.c.f x() {
        fu p = fu.p("primary-language", new com.google.android.apps.gsa.u.c.a.d(0), "oc:third_party_disclosures_acked", new com.google.android.apps.gsa.u.c.a.d(2), "assistant-preferred-languages", new com.google.android.apps.gsa.u.c.a.d(1), "pr_enabled_on_lockscreen", new com.google.android.apps.gsa.u.c.a.c(this.f.gV));
        jo joVar = this.f;
        jo joVar2 = joVar.b.f322a;
        h hVar = joVar.gf;
        h hVar2 = joVar.mU;
        ((com.google.android.apps.gsa.search.core.h.p) joVar2.gq.a()).m(com.google.android.apps.gsa.shared.k.dj.b).getClass();
        fl m = ((com.google.android.apps.gsa.search.core.h.p) this.f.b.f322a.gq.a()).m(com.google.android.apps.gsa.shared.k.dj.aL);
        m.getClass();
        List list = (List) Collection._EL.stream(((com.google.apps.tiktok.experiments.e) this.f.b.f322a.V.a()).a("assistant_auto_tng_libraries_device 45422569").d().b).map(new com.google.android.apps.gsa.search.core.carassistant.b.a()).collect(bs.a);
        list.getClass();
        Boolean bool = false;
        bool.getClass();
        boolean w = ((com.google.android.apps.gsa.search.core.h.p) this.f.b.f322a.gq.a()).w(com.google.android.apps.gsa.shared.k.dj.f);
        Boolean.valueOf(w).getClass();
        fu o = ((com.google.android.apps.gsa.search.core.h.p) this.f.b.f322a.gq.a()).o(com.google.android.apps.gsa.shared.k.dj.s);
        o.getClass();
        return new com.google.android.apps.gsa.u.c.f(p, hVar, hVar2, m, list, w, o, (Executor) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xA() {
        ((com.google.apps.tiktok.experiments.e) this.l.a()).a("com.google.android.apps.search.assistant.mobile.user 45639897").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xB() {
        ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ag(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45460101").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xC() {
        ((com.google.apps.tiktok.experiments.e) new h.a.a.d.b.a.ah(this.l).a.a()).a("com.google.android.apps.search.assistant.mobile.user 45618890").f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xD() {
        h.a.a.d.b.a.y.x(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xE() {
        h.a.a.d.b.a.y.p(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.p xF() {
        com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) this.fz.a();
        jo joVar = this.f;
        jr jrVar = joVar.b;
        h hVar = joVar.Q;
        h hVar2 = this.kS;
        h hVar3 = this.fz;
        h hVar4 = jrVar.gm;
        hVar.getClass();
        hVar2.getClass();
        hVar3.getClass();
        hVar4.getClass();
        h hVar5 = this.ax;
        Map rb = rb();
        com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) hVar5.a();
        com.google.android.libraries.search.assistant.performer.communication.c.b.i iVar = (com.google.android.libraries.search.assistant.performer.communication.c.b.i) this.f.b.dC.a();
        Optional of = Optional.of((com.google.android.libraries.search.assistant.notification.a.b) this.f.b.gd.a());
        com.google.android.libraries.search.assistant.notification.a.b bVar = (com.google.android.libraries.search.assistant.notification.a.b) this.f.nh.a();
        com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.f fVar = new com.google.android.libraries.assistant.auto.tng.f.d.c.a.a.f(lVar.a(gVar), iVar, 0);
        com.google.android.libraries.search.assistant.notification.a.b bVar2 = (com.google.android.libraries.search.assistant.notification.a.b) of.orElse(bVar);
        k.a.a aVar = (k.a.a) rb.get(com.google.android.libraries.assistant.auto.tng.assistant.e.a.a.c.c);
        aVar.getClass();
        com.google.android.libraries.search.assistant.performer.communication.c.a.f fVar2 = (com.google.android.libraries.search.assistant.performer.communication.c.a.f) aVar.a();
        ag agVar = (ag) hVar.a();
        agVar.getClass();
        com.google.android.libraries.search.assistant.performer.communication.c.g gVar2 = (com.google.android.libraries.search.assistant.performer.communication.c.g) hVar2.a();
        gVar2.getClass();
        com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l lVar2 = (com.google.android.libraries.assistant.auto.tng.assistant.d.b.c.a.b.k.l) hVar3.a();
        lVar2.getClass();
        gVar.getClass();
        bVar2.getClass();
        fVar2.getClass();
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.p(agVar, gVar2, lVar2, hVar4, gVar, bVar2, fVar2, fVar, com.google.common.base.a.a, 1);
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.e xG() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.b.d.c.e((Executor) this.f.H.a(), (com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.a.d) this.az.a(), this.ii, 1);
    }

    final com.google.android.libraries.assistant.auto.tng.suggestions.h.a.d.c xH() {
        return new com.google.android.libraries.assistant.auto.tng.suggestions.h.a.d.c((com.google.android.libraries.assistant.auto.tng.suggestions.b.b.a.f) this.aJ.a(), (cr) this.f.H.a(), 1);
    }

    final com.google.android.libraries.assistant.pcp.h.d.b xI() {
        return new com.google.android.libraries.assistant.pcp.h.d.b((ag) this.f.Q.a(), (com.google.common.v.f) this.f.ez.a(), new com.google.android.libraries.assistant.pcp.v.b.d((com.google.android.libraries.calendar.appsearch.clients.a.e) this.f.b.aZ.a(), (Context) this.f.f.a()), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.b xJ() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.b((Executor) this.f.H.a(), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.h xK() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.h((com.google.common.v.f) this.f.ez.a(), (Executor) this.f.H.a(), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.b xL() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.b((Executor) this.f.H.a(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.pcp.u.c.a.b xM() {
        return new com.google.android.libraries.assistant.pcp.u.c.a.b((Executor) this.f.H.a(), 3);
    }

    @Override // com.google.android.apps.search.assistant.platform.pcp.j.l
    public final as xN() {
        return (as) this.hx.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.h$a
    public final com.google.android.apps.search.assistant.surfaces.voice.robin.x.aj xO() {
        return this.gF.f308a.ry();
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.c xP() {
        return new com.google.android.apps.search.assistant.surfaces.voice.robin.x.e.c((com.google.android.libraries.search.b.b) this.aV.a(), (byte[]) null);
    }

    @Override // com.google.android.apps.search.omnient.audiosearch.b$a
    public final com.google.android.apps.search.omnient.k.l xQ() {
        return this.gF.f308a.rC();
    }

    @Override // com.google.android.apps.search.omnient.audiosearch.v
    public final com.google.android.apps.search.omnient.k.l xR() {
        return this.gF.f308a.rC();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.y xS() {
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.y(joVar.Q, this.kS, this.fz, joVar.b.gm, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.media.d.a.a xT() {
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.media.d.a.a(new com.google.android.apps.gsa.u.c.g(joVar.gf, (Executor) joVar.v.a()));
    }

    @Override // com.google.android.libraries.lens.view.audiosearch.b$a
    public final com.google.android.libraries.lens.view.ai.a.i xU() {
        return this.gF.f308a.rH();
    }

    @Override // com.google.android.libraries.lens.view.audiosearch.v
    public final com.google.android.libraries.lens.view.ai.a.i xV() {
        return this.gF.f308a.rH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.ac xW() {
        return new com.google.android.libraries.search.assistant.performer.l.ac(this.f.h, (byte[]) null);
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.r$a
    public final com.google.android.libraries.search.assistant.aq.j.g xX() {
        return this.gF.f308a.b.iK().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g xY() {
        return new h.a.a.b.b.a.g(this.l);
    }

    @Override // com.google.android.apps.gsa.search.core.google.a.ab$a
    public final com.google.android.libraries.search.assistant.aq.i.a.e xZ() {
        return new com.google.android.libraries.search.assistant.aq.i.a.e((cg) this.kl.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.e.b.a.a xa() {
        com.google.android.libraries.assistant.auto.tng.p.a.g gVar = (com.google.android.libraries.assistant.auto.tng.p.a.g) this.ax.a();
        h hVar = this.f.H;
        h hVar2 = this.fA;
        h hVar3 = this.eB;
        h hVar4 = this.eC;
        h hVar5 = this.dE;
        h hVar6 = this.ln;
        h hVar7 = this.lo;
        h hVar8 = this.lp;
        h hVar9 = this.lq;
        h hVar10 = this.lr;
        h hVar11 = this.ls;
        h hVar12 = this.eD;
        h hVar13 = this.eE;
        h hVar14 = this.lt;
        h hVar15 = this.lu;
        h hVar16 = this.kA;
        hVar.getClass();
        hVar2.getClass();
        hVar3.getClass();
        hVar4.getClass();
        hVar5.getClass();
        hVar6.getClass();
        hVar7.getClass();
        hVar8.getClass();
        hVar9.getClass();
        hVar10.getClass();
        hVar11.getClass();
        hVar12.getClass();
        hVar13.getClass();
        hVar14.getClass();
        hVar15.getClass();
        hVar16.getClass();
        gVar.getClass();
        com.google.android.libraries.assistant.auto.tng.w.d.a.a.g gVar2 = (com.google.android.libraries.assistant.auto.tng.w.d.a.a.g) this.aG.a();
        gVar2.getClass();
        Executor executor = (Executor) hVar.a();
        executor.getClass();
        return new com.google.android.libraries.assistant.auto.tng.f.e.b.a.a(gVar, gVar2, executor, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16);
    }

    @Override // com.google.android.libraries.search.assistant.proactive.bb
    public final com.google.android.libraries.search.assistant.proactive.ac xb() {
        return iz();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.notification.ag$a, com.google.android.libraries.search.assistant.proactive.bb, com.google.android.libraries.search.assistant.proactive.be$a
    public final bx xc() {
        return iA();
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.f.s$a
    public final com.google.android.libraries.search.assistant.aq.i.a.e xd() {
        return new com.google.android.libraries.search.assistant.aq.i.a.e((cg) this.kw.a());
    }

    @Override // com.google.android.apps.gsa.hotword.a.b$a, com.google.android.apps.search.assistant.surfaces.bisto.e.h.k
    public final com.google.android.libraries.search.assistant.at.a.a.h xe() {
        return (com.google.android.libraries.search.assistant.at.a.a.h) this.m.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.automation.routines.g.s, com.google.android.apps.search.speechenroll.a.g
    public final com.google.android.libraries.search.assistant.at.a.a.h xf() {
        return (com.google.android.libraries.search.assistant.at.a.a.h) this.m.a();
    }

    @Override // com.google.android.libraries.search.assistant.at.a.d
    public final com.google.android.libraries.search.assistant.at.a.a.h xg() {
        return (com.google.android.libraries.search.assistant.at.a.a.h) this.m.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.newsplayer.f.d$a
    public final com.google.android.libraries.search.l.b.f xh() {
        return (com.google.android.libraries.search.l.b.f) this.f.vU.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.settings.shared.h, com.google.android.libraries.search.l.f.k
    public final com.google.android.libraries.search.integrations.c.a.c xi() {
        return (com.google.android.libraries.search.integrations.c.a.c) this.Y.a();
    }

    @Override // com.google.android.apps.gsa.n.g, com.google.android.apps.gsa.n.a.b
    public final com.google.android.libraries.search.location.y xj() {
        return (com.google.android.libraries.search.location.y) this.O.a();
    }

    @Override // com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.ui.a$a
    public final com.google.android.libraries.search.t.c.ai xk() {
        return (com.google.android.libraries.search.t.c.ai) this.G.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.l$a, com.google.android.apps.search.assistant.surfaces.voice.o.b.g$a, com.google.android.apps.search.assistant.surfaces.voice.robin.x.d.e
    public final com.google.android.libraries.search.t.c.ai xl() {
        return com.google.android.apps.search.assistant.platform.c.a.a.a(this.gF.f308a.b.jt());
    }

    @Override // com.google.android.apps.search.googleapp.launcher.c.b.c$a
    public final com.google.android.libraries.search.t.c.u xm() {
        return jt();
    }

    @Override // com.google.android.apps.search.assistant.libraries.dictation.b.a.h.a
    public final com.google.android.libraries.search.ai.i xn() {
        return (com.google.android.libraries.search.ai.i) this.f.vx.a();
    }

    @Override // com.google.apps.tiktok.contrib.work.b.e, com.google.apps.tiktok.contrib.work.b.m$a
    public final com.google.apps.tiktok.contrib.work.b.ab xo() {
        iz izVar = this.gF.b;
        return new com.google.apps.tiktok.contrib.work.b.ab(izVar.f311a.ng(), izVar.f, izVar.g);
    }

    @Override // com.google.apps.tiktok.r.b.ab$b
    public final com.google.apps.tiktok.r.c.j xp() {
        je jeVar = this.gF.c;
        com.google.apps.tiktok.r.c.g ng = jeVar.f313a.ng();
        nr nrVar = nr.a;
        androidx.compose.ui.l.f.f(nrVar.isEmpty(), "Can't provide Sync SyncSystemMonitor to any account level. Only application scoped SyncSystemMonitors may be provided");
        return new com.google.apps.tiktok.r.c.j(ng, new com.google.apps.tiktok.r.c.k(nrVar), jeVar.R);
    }

    @Override // com.google.android.apps.search.googleapp.searchwidget.b.b
    public final cg xq() {
        return (cg) this.gF.f308a.ef.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.settings.features.main.t$a
    public final cg xr() {
        return (cg) this.gF.f308a.bR.a();
    }

    @Override // com.google.android.apps.search.assistant.verticals.reminders.e.a
    public final cg xs() {
        return (cg) this.gF.f308a.ck.a();
    }

    @Override // com.google.android.libraries.user.profile.a.c.a.d
    public final void xt() {
    }

    @Override // com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.s$a
    public final void xv() {
    }

    @Override // com.google.android.libraries.search.location.compliance.ay
    public final com.google.android.libraries.search.location.compliance.r xy() {
        return (com.google.android.libraries.search.location.compliance.r) this.N.a();
    }

    @Override // com.google.android.libraries.search.location.compliance.b.g
    public final com.google.android.libraries.search.location.compliance.r xz() {
        return (com.google.android.libraries.search.location.compliance.r) this.N.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.staticplugins.p.a.a.c.a.c y() {
        return new com.google.android.apps.gsa.staticplugins.p.a.a.c.a.c((com.google.android.apps.gsa.contacts.au) this.f.pL.a(), (cq) this.f.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yA() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yB() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.r.b.a.s yC() {
        return new h.a.a.r.b.a.s(this.l);
    }

    @Override // com.google.android.libraries.lens.view.audiosearch.b$a
    public final nz yD() {
        return (nz) this.gF.f308a.fk.a();
    }

    @Override // com.google.android.apps.search.omnient.audiosearch.b$a
    public final nz yE() {
        return (nz) this.gF.f308a.eG.a();
    }

    @Override // com.google.android.libraries.search.trust.c.a
    public final nz yF() {
        return (nz) this.K.a();
    }

    @Override // com.google.android.apps.search.googleapp.discover.expeditions.features.media.service.a.b$a
    public final lt yG() {
        return (lt) this.gF.f308a.dr.a();
    }

    @Override // com.google.android.apps.search.assistant.surfaces.bisto.interactor.c.a
    public final lt yH() {
        return (lt) this.bP.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.u.c.g ya() {
        jo joVar = this.f;
        return new com.google.android.apps.gsa.u.c.g(joVar.gf, (Executor) joVar.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.r yb() {
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.r(this.f.Q, this.kX, this.fz, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.communication.ci yc() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.communication.ci(joVar.f, joVar.H, this.eF, joVar.bz, this.eH, this.eG, (char[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.deviceactions.ah yd() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.deviceactions.ah(joVar.H, this.kT, this.kU, joVar.f319a.hv, this.kV, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.apps.tiktok.account.d.u ye() {
        return new com.google.apps.tiktok.account.d.u(kd(), this.f.md());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.e.a.a.j yf() {
        return new h.a.a.e.a.a.j(this.l);
    }

    @Override // com.google.apps.tiktok.i.a.a$a
    public final lm yg() {
        return new lm(this.f, this.gF);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.u.c.g yh() {
        jo joVar = this.f;
        return new com.google.android.apps.gsa.u.c.g(joVar.gf, (Executor) joVar.v.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.assistant.auto.tng.f.d.c.a.r yi() {
        jo joVar = this.f;
        return new com.google.android.libraries.assistant.auto.tng.f.d.c.a.r(joVar.Q, joVar.b.ht, this.fz, (byte[]) null, (byte[]) null);
    }

    final com.google.android.libraries.assistant.pcp.u.a.q yj() {
        return new com.google.android.libraries.assistant.pcp.u.a.q((Executor) this.f.H.a());
    }

    @Override // com.google.android.apps.gsa.staticplugins.accl.performers.d.b$a
    public final com.google.android.libraries.search.assistant.performer.deviceactions.ah yk() {
        jo joVar = this.f;
        return new com.google.android.libraries.search.assistant.performer.deviceactions.ah(joVar.h, joVar.nn, joVar.H, joVar.v, this.kv, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.af yl() {
        return new com.google.android.libraries.search.assistant.performer.l.af(this.kZ, this.f.h, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.d.b.a.ag ym() {
        return new h.a.a.d.b.a.ag(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.ac yn() {
        return new com.google.android.libraries.search.assistant.performer.l.ac(this.kZ, (char[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.af yo() {
        return new com.google.android.libraries.search.assistant.performer.l.af(this.kZ, this.f.h, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.f.b.a.k yp() {
        return new h.a.a.f.b.a.k(this.l);
    }

    final com.google.android.libraries.search.assistant.performer.l.ac yq() {
        return new com.google.android.libraries.search.assistant.performer.l.ac((Context) this.f.f.a(), (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.af yr() {
        return new com.google.android.libraries.search.assistant.performer.l.af(this.kZ, this.f.h, (char[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.d.b.a.ah ys() {
        return new h.a.a.d.b.a.ah(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.af yt() {
        return new com.google.android.libraries.search.assistant.performer.l.af(this.kZ, this.f.g, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.libraries.search.assistant.performer.l.ac yu() {
        return new com.google.android.libraries.search.assistant.performer.l.ac(this.f.f, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.d.b.a.ah yv() {
        return new h.a.a.d.b.a.ah(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yw() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yx() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yy() {
        return new h.a.a.b.b.a.g(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h.a.a.b.b.a.g yz() {
        return new h.a.a.b.b.a.g(this.l);
    }

    final com.google.android.apps.gsa.staticplugins.opa.at.d z() {
        return new com.google.android.apps.gsa.staticplugins.opa.at.d((com.google.android.apps.gsa.staticplugins.opa.at.l) this.f.f319a.gG.a(), (com.google.android.libraries.gsa.h.h) this.f.gp.a(), new com.google.android.apps.gsa.staticplugins.opa.at.b.f((com.google.android.libraries.g.a) this.f.g.a()), (Context) this.f.f.a(), (com.google.android.apps.gsa.search.core.google.gaia.b.a.c) this.f.gT.a(), this.f.f319a.aB());
    }
}
