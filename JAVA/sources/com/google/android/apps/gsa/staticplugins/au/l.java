package com.google.android.apps.gsa.staticplugins.au;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.opa.q;
import com.google.android.apps.gsa.s.c;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.service.f.a;
import com.google.android.apps.gsa.search.core.service.k;
import com.google.android.apps.gsa.search.core.service.o;
import com.google.android.apps.gsa.search.core.service.x;
import com.google.android.apps.gsa.search.core.state.ai;
import com.google.android.apps.gsa.search.core.state.d.ae;
import com.google.android.apps.gsa.search.core.state.d.t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.cc;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.dj;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.a.i;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.speech.audio.n;
import com.google.android.libraries.assistant.auto.tng.m.d.d;
import com.google.android.libraries.assistant.auto.tng.morris.e.cb;
import com.google.android.libraries.assistant.auto.tng.morris.e.ek;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.ai.f;
import com.google.common.base.at;
import com.google.common.base.bd;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.o.m;
import com.google.common.o.or;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import com.google.protobuf.v;
import com.google.speech.i.el;
import com.google.speech.i.fa;
import j$.time.Duration;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/au/l.class */
public class l extends a implements com.google.android.apps.gsa.search.core.ae.am.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1628a = j.i("com.google.android.apps.gsa.staticplugins.au.l");
    private final z A;
    private final at B;
    private final at C;
    private final boolean D;
    private final e.a E;
    private final com.google.android.apps.gsa.speech.audio.e F;
    private final b G;
    private final at H;
    private final at I;
    private final e.a J;
    private final e.a K;
    private final e.a L;
    private final i M;
    private final e.a N;
    private TelephonyManager O;
    private long P;
    private long Q;
    private final e.a R;
    private cn S;
    private final com.google.android.libraries.assistant.auto.tng.j.a.a.a T;
    private final com.google.android.libraries.assistant.auto.jumpboost.b.g.a U;
    private boolean V;
    private final t W;
    private final ai X;
    private final n Y;
    private final com.google.android.apps.gsa.speech.o.g Z;
    private final an aa;
    public final Context b;
    public final h c;
    public final com.google.android.apps.gsa.search.core.ac.t f;
    final e.a g;
    boolean h;
    final ae i;
    public final com.google.android.apps.gsa.search.core.state.d.h j;
    private final at k;
    private final p l;
    private final AudioManager m;
    private final h n;
    private final h o;
    private final com.google.android.apps.gsa.search.core.j.a p;
    private final com.google.android.apps.gsa.search.core.ac.ai q;
    private final x r;
    private final e.a s;
    private final e.a t;
    private final e.a u;
    private final e.a v;
    private final e.a w;
    private final e.a x;
    private final SharedPreferences y;
    private final com.google.android.libraries.g.a z;

    public l(Context context, com.google.android.apps.gsa.search.core.state.d.h hVar, ae aeVar, t tVar, ai aiVar, h hVar2, h hVar3, h hVar4, p pVar, com.google.android.libraries.g.a aVar, com.google.android.apps.gsa.search.core.j.a aVar2, AudioManager audioManager, n nVar, com.google.android.apps.gsa.search.core.ac.t tVar2, com.google.android.apps.gsa.speech.o.g gVar, com.google.android.apps.gsa.search.core.ac.ai aiVar2, x xVar, an anVar, e.a aVar3, e.a aVar4, SharedPreferences sharedPreferences, e.a aVar5, e.a aVar6, e.a aVar7, e.a aVar8, z zVar, e.a aVar9, at atVar, e.a aVar10, at atVar2, boolean z, e.a aVar11, com.google.android.apps.gsa.speech.audio.e eVar, b bVar, at atVar3, at atVar4, e.a aVar12, e.a aVar13, e.a aVar14, i iVar, com.google.android.libraries.assistant.auto.jumpboost.b.g.a aVar15, com.google.android.libraries.assistant.auto.tng.j.a.a.a aVar16, e.a aVar17, at atVar5) {
        super(c.WORKER_MICRO_DETECTION, "microdetection");
        this.P = 0L;
        this.Q = 0L;
        this.S = ci.a;
        this.V = true;
        this.U = aVar15;
        this.T = aVar16;
        this.j = hVar;
        this.i = aeVar;
        this.W = tVar;
        this.X = aiVar;
        this.l = pVar;
        this.c = hVar2;
        this.n = hVar3;
        this.o = hVar4;
        this.b = context;
        this.z = aVar;
        this.p = aVar2;
        this.m = audioManager;
        this.Y = nVar;
        this.f = tVar2;
        this.Z = gVar;
        this.q = aiVar2;
        this.r = xVar;
        this.aa = anVar;
        this.s = aVar3;
        this.t = aVar4;
        this.y = sharedPreferences;
        this.G = bVar;
        this.x = aVar5;
        this.u = aVar6;
        this.v = aVar7;
        this.w = aVar8;
        this.A = zVar;
        this.R = aVar9;
        this.B = atVar;
        this.g = aVar10;
        this.C = atVar2;
        this.D = z;
        this.E = aVar11;
        this.H = atVar3;
        this.F = eVar;
        this.I = atVar4;
        this.J = aVar12;
        this.K = aVar13;
        this.L = aVar14;
        this.M = iVar;
        this.N = aVar17;
        this.k = atVar5;
    }

    private final String A() {
        String a2 = this.p.b.a();
        if (a2 == null) {
            return null;
        }
        return this.p.b.b(a2);
    }

    private final void B(boolean z, Query query) {
        if (this.l.w(cc.A) && query.cG()) {
            return;
        }
        com.google.android.apps.gsa.speech.audio.c.g gVar = (com.google.android.apps.gsa.speech.audio.c.g) this.K.a();
        long nextLong = new Random().nextLong();
        if (nextLong == 0) {
            return;
        }
        gVar.a.n("EarconSoundManager playVoiceRequestStartBeep", new com.google.android.apps.gsa.speech.audio.c.a(gVar, nextLong, z));
    }

    private final void C(Intent intent) {
        ab abVar = com.google.common.f.a.e.a;
        ((com.google.android.apps.gsa.shared.logger.b.h) this.g.a()).b(w.OPA_ANDROID_STARTUP_LOCKSCREEN);
        intent.removeExtra("audio_content_uri");
        v(this.x, intent);
        F(268435482);
    }

    private final void D() {
        if (this.l.w(df.bv)) {
            ab abVar = com.google.common.f.a.e.a;
            return;
        }
        if (this.A.s()) {
            this.i.s(true);
            return;
        }
        com.google.common.f.h e = f1628a.e();
        e.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
        com.google.common.f.h hVar = e;
        hVar.ak(14805);
        hVar.p("Stopping hotword detector since user is hotword OPA ineligible");
        this.Z.G(f.DECLINED, com.google.android.libraries.search.ai.c.c.d(31));
        this.i.s(false);
    }

    private final void E(String str, boolean z) {
        this.n.n("Hotword Debug Toast", new f(this, z, str));
    }

    private final void F(int i) {
        if (!this.h || this.f.a() == 0) {
            return;
        }
        this.f.e(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean G(Query query) {
        boolean z;
        String z2 = z(query);
        int hashCode = z2.hashCode();
        if (hashCode == -906336856) {
            if (z2.equals("search")) {
                z = true;
            }
            z = -1;
        } else if (hashCode != 110240) {
            if (hashCode == 1900885043 && z2.equals("car_assistant")) {
                z = 2;
            }
            z = -1;
        } else {
            if (z2.equals("opa")) {
                z = false;
            }
            z = -1;
        }
        if (z) {
            return true;
        }
        if (z != 2) {
            return false;
        }
        return this.l.w(dj.aO);
    }

    private static boolean H(Query query, ClientConfig clientConfig) {
        boolean z = true;
        if (!clientConfig.A()) {
            if (!query.bJ() || clientConfig.q()) {
                z = false;
            } else {
                if (clientConfig.l()) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    private final boolean I() {
        return this.W.f() || this.W.c() || this.i.r || this.I.a.q();
    }

    private final boolean J() {
        return this.Z.X() || this.Z.am();
    }

    private final boolean K(Query query, HotwordResult hotwordResult, Uri uri) {
        if (!query.cE() || !((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.N.a()).i() || !this.l.w(cc.A)) {
            return false;
        }
        j jVar = f1628a;
        com.google.common.f.h d = jVar.d();
        d.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(14830);
        hVar.p("Morris is active on SpeedRacer, handing over hotword");
        int e = hotwordResult != null ? hotwordResult.e() : (int) this.l.i(df.aU);
        com.google.android.libraries.assistant.auto.tng.m.d.b bVar = com.google.android.libraries.assistant.auto.tng.m.d.b.a;
        com.google.android.libraries.assistant.auto.tng.m.d.b bVar2 = bVar;
        if (hotwordResult.y() != null) {
            bVar2 = bVar;
            if (!hotwordResult.y().isEmpty()) {
                bVar2 = com.google.android.libraries.assistant.auto.tng.m.d.b.b;
            }
        }
        if (bVar2 == com.google.android.libraries.assistant.auto.tng.m.d.b.a) {
            com.google.common.f.h f = jVar.f();
            f.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
            com.google.common.f.h hVar2 = f;
            hVar2.ak(14831);
            hVar2.p("HotwordPhrase is UNKNOWN and shouldn't be");
        }
        String uri2 = uri != null ? uri.toString() : "";
        ba createBuilder = d.a.createBuilder();
        long j = query.E;
        createBuilder.copyOnWrite();
        d dVar = createBuilder.instance;
        dVar.b |= 8;
        dVar.f = j;
        long a2 = this.z.a();
        createBuilder.copyOnWrite();
        d dVar2 = createBuilder.instance;
        dVar2.b |= 16;
        dVar2.g = a2;
        createBuilder.copyOnWrite();
        d dVar3 = createBuilder.instance;
        dVar3.h = bVar2.c;
        dVar3.b |= 32;
        ba createBuilder2 = el.a.createBuilder();
        float d2 = hotwordResult.d();
        createBuilder2.copyOnWrite();
        el elVar = createBuilder2.instance;
        elVar.b |= 4;
        elVar.e = d2;
        String x = hotwordResult.x();
        createBuilder2.copyOnWrite();
        el elVar2 = createBuilder2.instance;
        x.getClass();
        elVar2.b |= 64;
        elVar2.h = x;
        boolean D = hotwordResult.D();
        createBuilder2.copyOnWrite();
        el elVar3 = createBuilder2.instance;
        elVar3.b |= 8;
        elVar3.f = D;
        createBuilder.copyOnWrite();
        d dVar4 = createBuilder.instance;
        el build = createBuilder2.build();
        build.getClass();
        dVar4.e = build;
        dVar4.b |= 4;
        ba createBuilder3 = com.google.android.libraries.assistant.auto.tng.m.d.c.a.createBuilder();
        createBuilder3.copyOnWrite();
        com.google.android.libraries.assistant.auto.tng.m.d.c cVar = createBuilder3.instance;
        cVar.b |= 1;
        cVar.e = e;
        createBuilder3.copyOnWrite();
        com.google.android.libraries.assistant.auto.tng.m.d.c cVar2 = createBuilder3.instance;
        uri2.getClass();
        cVar2.c = 4;
        cVar2.d = uri2;
        createBuilder.copyOnWrite();
        d dVar5 = createBuilder.instance;
        com.google.android.libraries.assistant.auto.tng.m.d.c build2 = createBuilder3.build();
        build2.getClass();
        dVar5.d = build2;
        dVar5.b |= 2;
        if (hotwordResult.p().h()) {
            ba createBuilder4 = fa.a.createBuilder();
            ba createBuilder5 = com.google.speech.i.h.a.createBuilder();
            ba createBuilder6 = com.google.speech.i.j.a.createBuilder();
            int dh = a.a.dh(hotwordResult.f());
            createBuilder6.copyOnWrite();
            com.google.speech.i.j jVar2 = createBuilder6.instance;
            if (dh == 0) {
                throw null;
            }
            jVar2.c = dh - 1;
            jVar2.b |= 1;
            createBuilder6.copyOnWrite();
            com.google.speech.i.j jVar3 = createBuilder6.instance;
            jVar3.b |= 4;
            jVar3.e = e;
            int j2 = hotwordResult.j();
            createBuilder6.copyOnWrite();
            com.google.speech.i.j jVar4 = createBuilder6.instance;
            jVar4.b |= 2;
            jVar4.d = j2;
            createBuilder5.copyOnWrite();
            com.google.speech.i.h hVar3 = createBuilder5.instance;
            com.google.speech.i.j build3 = createBuilder6.build();
            build3.getClass();
            hVar3.d = build3;
            hVar3.b |= 2;
            byte[] bArr = (byte[]) hotwordResult.p().c();
            v x2 = v.x(bArr, 0, bArr.length);
            createBuilder5.copyOnWrite();
            com.google.speech.i.h hVar4 = createBuilder5.instance;
            hVar4.b |= 1;
            hVar4.c = x2;
            createBuilder4.copyOnWrite();
            fa faVar = createBuilder4.instance;
            com.google.speech.i.h build4 = createBuilder5.build();
            build4.getClass();
            faVar.c = build4;
            faVar.b |= 1;
            int h = hotwordResult.h();
            createBuilder4.copyOnWrite();
            fa faVar2 = createBuilder4.instance;
            faVar2.b |= 4;
            faVar2.d = h;
            createBuilder.copyOnWrite();
            d dVar6 = createBuilder.instance;
            fa build5 = createBuilder4.build();
            build5.getClass();
            dVar6.c = build5;
            dVar6.b |= 1;
        }
        com.google.android.apps.gsa.staticplugins.opa.morris2.h.h hVar5 = (com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) this.N.a();
        d build6 = createBuilder.build();
        com.google.android.apps.gsa.staticplugins.opa.morris2.framework.e eVar = (com.google.android.apps.gsa.staticplugins.opa.morris2.framework.e) hVar5.d.a();
        Duration ofNanos = Duration.ofNanos(hVar5.b.b());
        ba createBuilder7 = ek.a.createBuilder();
        ba createBuilder8 = cb.a.createBuilder();
        createBuilder8.copyOnWrite();
        createBuilder8.instance.c = 26;
        createBuilder8.copyOnWrite();
        cb cbVar = createBuilder8.instance;
        build6.getClass();
        cbVar.l = build6;
        cbVar.b |= 2;
        long nanos = ofNanos.toNanos();
        createBuilder8.copyOnWrite();
        createBuilder8.instance.d = nanos;
        createBuilder7.copyOnWrite();
        ek ekVar = createBuilder7.instance;
        cb build7 = createBuilder8.build();
        build7.getClass();
        ekVar.e = build7;
        ekVar.d = 3;
        eVar.c((ek) createBuilder7.build());
        return true;
    }

    private final boolean L() {
        return this.y.getBoolean("speech_hotword_toast_debug", false);
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    private final Query M(HotwordResult hotwordResult, Uri uri, boolean z) {
        Query j;
        boolean B = hotwordResult.B();
        boolean isDeviceLocked = this.f.b.isDeviceLocked();
        ab abVar = com.google.common.f.a.e.a;
        if (isDeviceLocked) {
            com.google.android.apps.gsa.speech.k.a aVar = (com.google.android.apps.gsa.speech.k.a) this.u.a();
            boolean j2 = aVar.j();
            boolean k = aVar.k();
            if (!j2 && !k) {
                B = false;
            } else if (!this.A.s() || !this.l.w(az.dj)) {
                B = this.y.getBoolean("hotword_from_lock_screen", false);
            }
        } else {
            B = true;
        }
        boolean V = this.A.s() ? !o().q() || this.f.b.isDeviceLocked() : this.r.d.a().V();
        com.google.android.apps.gsa.search.core.ac.ai aiVar = this.q;
        t tVar = this.W;
        boolean f = tVar.f();
        boolean c = tVar.c();
        int j3 = hotwordResult.j();
        boolean i = this.W.i();
        boolean r = o().r();
        boolean g = com.google.android.apps.gsa.search.core.ac.ai.g(f, c);
        if (r) {
            j = Query.P(Query.b.j(), true, false, false, false, false, true).aC(QueryTriggerType.HOTWORD);
        } else if (g && !aiVar.d()) {
            Query x = Query.P(Query.b.j(), true, false, false, false, false, false).aC(QueryTriggerType.HOTWORD).x();
            j = x;
            if (aiVar.c.s()) {
                j = x;
                if (aiVar.f(i)) {
                    j = x.B();
                }
            }
        } else if (V) {
            if (z && !g && (!aiVar.c.s() || !aiVar.b.w(az.dj))) {
                Query aF = Query.b.T().aF(4);
                j = aF;
                if (!B) {
                    j = aF.O();
                }
            } else if (aiVar.c.s() || (aiVar.d.a.s() && aiVar.c.u() && aiVar.c.w())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.opa.extra.INITIAL_QUERY", true);
                Query aB = Query.b.A(1, true, null).aj((z ? com.google.android.libraries.search.t.h.j.aC : com.google.android.libraries.search.t.h.j.aT).a(), bundle).aC(QueryTriggerType.HOTWORD).aF(3).aB(com.google.android.apps.gsa.shared.ui.b.a.c(aiVar.f1051a, aiVar.b));
                if (g) {
                    j = aB.x().J(true).X("android.opa.extra.MINI_PLATE_ENABLED", true);
                } else {
                    j = aiVar.d.a.j(aB);
                    if (!B) {
                        j = j.O();
                    }
                    if (z) {
                        Query query = j;
                        if (aiVar.b.w(az.dj)) {
                            query = j.X("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
                        }
                        j = query;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                j = Query.b.T().aF(3);
            }
        } else if (((com.google.android.apps.gsa.staticplugins.opa.morris2.h.h) aiVar.f.a).i()) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.opa.extra.INITIAL_QUERY", true);
            Query J = Query.b.A(1, true, null).X("android.opa.extra.MINI_PLATE_ENABLED", true).aw("user-agent-suffix", "AssistantDrivingMode").aj(com.google.android.libraries.search.t.h.j.cm.a(), bundle2).aC(QueryTriggerType.OPA_MORRIS_HOTWORD).J(true);
            j = J;
            if (f) {
                j = J.x();
            }
        } else {
            j = Query.b.T();
        }
        Query query2 = j;
        if (uri != null) {
            query2 = j.U(uri, j3, false);
        }
        int e = hotwordResult.e();
        Query query3 = query2;
        if (e > 1) {
            query3 = query2.V(e);
        }
        Query ae = query3.ae(HotwordResultMetadata.r(this.b, hotwordResult, w(z, false), hotwordResult.l() > 0 ? hotwordResult.l() : this.z.a(), query3.cV()));
        Query query4 = ae;
        if (this.i.n.a()) {
            com.google.android.apps.gsa.shared.search.b j4 = ae.j();
            j4.d(0L, 2251799813685248L);
            query4 = j4.a();
        }
        return (hotwordResult.k() == 2 || hotwordResult.k() == 0) ? query4.ai() : query4;
    }

    private final void N(int i, Query query, HotwordResult hotwordResult, int i2) {
        this.G.a(o().d, A(), i, query, hotwordResult, i2, false, false, J());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    private static int O(com.google.android.apps.gsa.search.core.j.a aVar, at atVar) {
        String a2;
        int f = q.f(aVar);
        return (f != 0 || (a2 = aVar.b.a()) == null) ? f : ((bd) atVar).a.i(a2);
    }

    static Intent n(Context context, p pVar, com.google.android.apps.gsa.search.core.j.a aVar, at atVar, HotwordResult hotwordResult, boolean z, long j, Uri uri, boolean z2) {
        return q.a(O(aVar, atVar), hotwordResult == null ? null : HotwordResultMetadata.r(context, hotwordResult, z, j, z2), uri, 16000, hotwordResult != null ? hotwordResult.e() : (int) pVar.i(df.aU), 0);
    }

    public static void v(e.a aVar, Intent intent) {
        ab abVar = com.google.common.f.a.e.a;
        ((com.google.android.apps.gsa.shared.util.o.g) aVar.a()).ib(intent);
    }

    private final r y(HotwordResult hotwordResult) {
        boolean z = this.W.f() && this.W.i();
        qn createBuilder = r.a.createBuilder();
        String o = this.Z.o();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        o.getClass();
        rVar.c |= 4096;
        rVar.F = o;
        String str = Build.MANUFACTURER + "_" + Build.MODEL;
        createBuilder.copyOnWrite();
        r rVar2 = createBuilder.instance;
        rVar2.c |= 8388608;
        rVar2.O = str;
        createBuilder.copyOnWrite();
        r rVar3 = createBuilder.instance;
        rVar3.e |= 512;
        rVar3.as = z;
        int i = true != this.f.b() ? 3 : 2;
        createBuilder.copyOnWrite();
        r rVar4 = createBuilder.instance;
        rVar4.W = i - 1;
        rVar4.d |= 2;
        or orVar = o().d;
        createBuilder.copyOnWrite();
        r rVar5 = createBuilder.instance;
        rVar5.X = orVar.as;
        rVar5.d |= 4;
        boolean W = this.Z.W();
        ba createBuilder2 = m.a.createBuilder();
        int i2 = true != W ? 3 : 2;
        createBuilder2.copyOnWrite();
        m mVar = createBuilder2.instance;
        mVar.c = i2 - 1;
        mVar.b |= 32;
        createBuilder.ai(createBuilder2.build());
        qn builder = createBuilder.build().toBuilder();
        String x = hotwordResult.x();
        if (x != null && !x.isEmpty()) {
            builder.copyOnWrite();
            r rVar6 = builder.instance;
            rVar6.c |= 1048576;
            rVar6.L = x;
            float c = hotwordResult.c();
            builder.copyOnWrite();
            r rVar7 = builder.instance;
            rVar7.c |= 2097152;
            rVar7.M = c;
            float d = hotwordResult.d();
            builder.copyOnWrite();
            r rVar8 = builder.instance;
            rVar8.c |= 4194304;
            rVar8.N = d;
        }
        boolean W2 = this.Z.W();
        boolean z2 = false;
        if (hotwordResult.w() != com.google.speech.k.a.e.a) {
            z2 = true;
        }
        if (W2 != z2) {
            com.google.common.f.h f = f1628a.f();
            f.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
            com.google.common.f.h hVar = f;
            hVar.ak(14788);
            hVar.M("DSP availability and reported DSP detector type are inconsistent! Logs analysis may be skewed; please update checks for AlwaysOnHotwordDetectorType if detector types have been added. SpeechSettings reports DSP availability as %b, while detector type suggests %b", W2, z2);
        }
        ba createBuilder3 = m.a.createBuilder();
        boolean D = hotwordResult.D();
        createBuilder3.copyOnWrite();
        m mVar2 = createBuilder3.instance;
        mVar2.b |= 64;
        mVar2.d = D;
        boolean aa = this.Z.aa();
        createBuilder3.copyOnWrite();
        m mVar3 = createBuilder3.instance;
        mVar3.b |= 8388608;
        mVar3.f = aa;
        builder.ai(createBuilder3.build());
        return builder.build();
    }

    private static String z(Query query) {
        return query.bS() ? "car_assistant" : query.bJ() ? "opa" : "search";
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0448  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, com.google.android.apps.gsa.nga.shared.q.h] */
    /* JADX WARN: Type inference failed for: r0v216, types: [com.google.common.base.ca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v473, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v507, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v546, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.cn a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r12) {
        /*
            Method dump skipped, instructions count: 5047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.au.l.a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData):com.google.common.util.concurrent.cn");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r0.q() != false) goto L19;
     */
    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.cn c() {
        /*
            r12 = this;
            com.google.common.f.ab r0 = com.google.common.f.a.e.a
            r16 = r0
            r0 = r12
            com.google.android.apps.gsa.search.core.ac.t r0 = r0.f
            boolean r0 = r0.b()
            if (r0 != 0) goto L12
            goto Laa
        L12:
            r0 = r12
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.o()
            r16 = r0
            r0 = r12
            com.google.android.apps.gsa.assistant.shared.z r0 = r0.A
            boolean r0 = r0.u()
            r15 = r0
            r0 = 0
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L3a
            r0 = r14
            r13 = r0
            r0 = r12
            com.google.android.apps.gsa.assistant.shared.z r0 = r0.A
            boolean r0 = r0.n()
            if (r0 != 0) goto L3a
            r0 = 1
            r13 = r0
        L3a:
            r0 = r16
            boolean r0 = r0.A()
            if (r0 == 0) goto L6f
            r0 = r12
            com.google.android.apps.gsa.search.core.state.ai r0 = r0.X
            r17 = r0
            r0 = 1
            r1 = r13
            if (r0 == r1) goto L55
            java.lang.String r0 = "search"
            r16 = r0
            goto L5a
        L55:
            java.lang.String r0 = "opa"
            r16 = r0
        L5a:
            r0 = r17
            com.google.android.apps.gsa.search.shared.service.d.b r1 = new com.google.android.apps.gsa.search.shared.service.d.b
            r2 = r1
            r3 = 100
            r4 = r16
            r2.<init>(r3, r4)
            r2 = 0
            r0.e(r1, r2)
            goto L77
        L6f:
            r0 = r16
            boolean r0 = r0.q()
            if (r0 == 0) goto Laa
        L77:
            r0 = r13
            if (r0 == 0) goto Laa
            r0 = r12
            r1 = r12
            android.content.Context r1 = r1.b
            r2 = r12
            com.google.android.apps.gsa.search.core.h.p r2 = r2.l
            r3 = r12
            com.google.android.apps.gsa.search.core.j.a r3 = r3.p
            r4 = r12
            com.google.common.base.at r4 = r4.I
            r5 = 0
            r6 = r12
            r7 = r12
            com.google.android.apps.gsa.search.core.ac.t r7 = r7.f
            boolean r7 = r7.b()
            r8 = 1
            boolean r6 = r6.w(r7, r8)
            r7 = r12
            com.google.android.libraries.g.a r7 = r7.z
            long r7 = r7.a()
            r8 = 0
            r9 = 0
            android.content.Intent r1 = n(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.C(r1)
        Laa:
            com.google.common.util.concurrent.cn r0 = com.google.android.apps.gsa.v.c.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.au.l.c():com.google.common.util.concurrent.cn");
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.b
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final cn f(HotwordResult hotwordResult, long j) {
        at p = hotwordResult.p();
        if (p.h()) {
            this.Y.b(j, new com.google.android.apps.gsa.b.a.a(hotwordResult.j(), hotwordResult.e(), (byte[]) p.c()));
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void g(int i) {
        String b;
        boolean F = o().F();
        boolean G = o().G();
        com.google.common.f.h d = f1628a.d();
        d.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(14799);
        boolean z = i == 2;
        hVar.O("Initializing MicroDataManager InitializeType-%d, isForced-%b, isActivePhoneEnrollment-%b isActiveGoogleHomeEnrollment-%b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(G), Boolean.valueOf(F));
        if (F) {
            b = ((com.google.android.apps.gsa.speech.hotword.c.d) this.w.a()).b();
        } else {
            if (!G) {
                com.google.android.apps.gsa.speech.o.g gVar = this.Z;
                e.a aVar = this.t;
                String o = gVar.o();
                ((com.google.android.apps.gsa.speech.k.b.c.e) aVar.a()).b(o, new d(this, o), z, com.google.android.apps.gsa.shared.speech.hotword.b.c.OK_HEY_GOOGLE);
                return;
            }
            b = this.Z.o();
        }
        this.c.n("Enrollment hotword model initialized", new c(this, b));
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.search.core.service.f.b
    public final void gR() {
        ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void h(HotwordResult hotwordResult) {
        o oVar = this.r.i;
        if (hotwordResult == null || oVar == null) {
            return;
        }
        if (oVar.f.y() || oVar.f.r()) {
            ab abVar = com.google.common.f.a.e.a;
            k kVar = oVar.e;
            com.google.android.apps.gsa.search.shared.service.ae aeVar = new com.google.android.apps.gsa.search.shared.service.ae(hf.SHOW_HOTWORD_TRIGGERED);
            aeVar.c(hotwordResult);
            kVar.a(aeVar.a());
        }
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("MicroDetectionWorker");
        com.google.android.apps.gsa.speech.o.g gVar = this.Z;
        SpeakerIdModel g = gVar.g(gVar.q());
        if (g == null) {
            fVar.b("speakerId model").a(new com.google.android.apps.gsa.shared.util.b.d("not available", false));
        } else if (g.b.h()) {
            fVar.b("speakerId model").a(new com.google.android.apps.gsa.shared.util.b.d("available", false));
        } else {
            fVar.b("speakerId model").a(new com.google.android.apps.gsa.shared.util.b.d("not available", false));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void i(boolean z) {
        this.c.n("MicroDetectionWorker.setIsEnrollmentClientConnected", new i(this, z, 0));
    }

    @Override // com.google.android.apps.gsa.search.core.service.f.a, com.google.android.apps.gsa.search.core.service.f.b
    public final void ie() {
        D();
        com.google.android.apps.gsa.speech.o.g gVar = this.Z;
        String o = gVar.o();
        gVar.f();
        x(o);
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void j(boolean z) {
        com.google.common.f.h d = f1628a.d();
        d.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
        com.google.common.f.h hVar = d;
        hVar.ak(14812);
        hVar.s("#setIsGearHeadClientConnected: isGearHeadClientConnected: %b", Boolean.valueOf(z));
        this.c.n("MicroDetectionWorker.setIsGearHeadClientConnected", new i(this, z, 1));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void k() {
        ab abVar = com.google.common.f.a.e.a;
        ((com.google.android.apps.gsa.speech.k.a) this.u.a()).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0406 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03eb  */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.google.android.apps.gsa.assistant.shared.u, java.lang.Object] */
    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.au.l.l():void");
    }

    @Override // com.google.android.apps.gsa.search.core.ae.am.a
    public final void m() {
    }

    final ClientConfig o() {
        o oVar = this.r.i;
        return oVar != null ? oVar.f : ClientConfig.f1327a;
    }

    public final void p(long j) {
        if (this.Q <= j) {
            this.Q = j;
            return;
        }
        com.google.common.f.h e = f1628a.e();
        e.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
        com.google.common.f.h hVar = e;
        hVar.ak(14790);
        hVar.p("Stale runnable..ignoring");
    }

    final void u(Uri uri) {
        if (uri != null) {
            ab abVar = com.google.common.f.a.e.a;
            try {
                ParcelFileDescriptor openFileDescriptor = this.b.getContentResolver().openFileDescriptor(uri, "r");
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
            } catch (IOException | SecurityException e) {
                y e2 = f1628a.e();
                e2.aj(com.google.common.f.a.e.a, "MicroDetectionWorker");
                a.a.dB(e2, "#closeAudioProvider", (char) 14794, e);
            }
        }
    }

    final boolean w(boolean z, boolean z2) {
        if (z) {
            ab abVar = com.google.common.f.a.e.a;
            this.V = false;
            return false;
        }
        if (!this.V) {
            if (!z2) {
                ab abVar2 = com.google.common.f.a.e.a;
                return false;
            }
            ab abVar3 = com.google.common.f.a.e.a;
            this.V = true;
        }
        ab abVar4 = com.google.common.f.a.e.a;
        return this.f.d();
    }

    public final void x(String str) {
        this.i.i(((com.google.android.apps.gsa.speech.k.b.c.e) this.t.a()).h(str));
    }
}
