package com.google.android.apps.gsa.binaries.velvet.app;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.o.s;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.z.z;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.g.b.bh;
import com.google.android.libraries.ao.g;
import com.google.android.libraries.search.assistant.ao.a.a.m;
import com.google.android.libraries.search.assistant.ao.d.k;
import com.google.android.libraries.search.assistant.invocation.h.c.b.a.j;
import com.google.android.libraries.search.assistant.invocation.u.a.ag;
import com.google.android.libraries.search.assistant.invocation.u.a.i;
import com.google.android.libraries.search.assistant.z.c.a.w;
import com.google.android.libraries.search.d.e.a.c;
import com.google.android.libraries.search.t.i.y;
import com.google.android.libraries.search.v.af;
import com.google.android.libraries.search.v.n;
import com.google.apps.tiktok.experiments.phenotype.ab;
import com.google.apps.tiktok.experiments.phenotype.x;
import com.google.br.d.a.a.c.d;
import com.google.br.d.a.a.e;
import com.google.br.d.a.a.f.f;
import com.google.br.d.a.a.g.c.b;
import com.google.common.base.at;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.r;
import e.b.a.c.c.a;
import e.c.h;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m.h.a.l;
import m.h.a.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/nz.class */
public final class nz {

    /* renamed from: a, reason: collision with root package name */
    public final Object f329a;

    public nz(Object obj) {
        this.f329a = obj;
    }

    public final Object a() {
        g.b().hashCode();
        h hVar = nx.f327a;
        return new jo(new a((Context) this.f329a));
    }

    public final e b(e eVar, d dVar, Collection collection) {
        return new e(eVar, dVar, collection, (b) ((jn) this.f329a).f318a.aS.a(), (nz) ((jn) this.f329a).f318a.aT.a(), (com.google.br.d.a.a.c.e) ((jn) this.f329a).f318a.aU.a(), (f) ((jn) this.f329a).f318a.aX.a());
    }

    public final j c(i iVar, ag agVar) {
        return new j((c) ((jn) this.f329a).f318a.fx.a(), (kotlinx.coroutines.ag) ((jn) this.f329a).f318a.Q.a(), iVar, agVar);
    }

    public final com.google.android.libraries.search.assistant.invocation.h.c.f.a d(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b bVar, ag agVar, com.google.android.libraries.search.assistant.invocation.h.c.f.b bVar2) {
        return new com.google.android.libraries.search.assistant.invocation.h.c.f.a(bVar, agVar, bVar2, (com.google.android.libraries.g.a) ((jn) this.f329a).f318a.g.a(), (lt) ((jn) this.f329a).f318a.fo.a());
    }

    public final x e(com.google.apps.tiktok.experiments.a aVar, l lVar, Executor executor, Map map, p pVar, l lVar2, r rVar, m.h.a.a aVar2) {
        return new x((Context) ((jn) this.f329a).f318a.f.a(), (lt) ((jn) this.f329a).f318a.af.a(), (Map) ((jn) this.f329a).f318a.ag.a(), (ab) ((jn) this.f329a).f318a.p.a(), (cq) ((jn) this.f329a).f318a.n.a(), (com.google.android.libraries.storage.a.j) ((jn) this.f329a).f318a.w.a(), (at) ((jn) this.f329a).f318a.ah.a(), (Map) ((jn) this.f329a).f318a.ai.a(), aVar, lVar, executor, map, pVar, lVar2, rVar, aVar2);
    }

    public final com.google.android.libraries.search.assistant.invocation.utils.c.r f(String str, Set set, kotlinx.coroutines.ag agVar) {
        return new com.google.android.libraries.search.assistant.invocation.utils.c.r(str, set, agVar, (jt) ((jn) this.f329a).f318a.eF.a());
    }

    public final aa g(ac acVar) {
        s sVar = (s) ((jh) this.f329a).b.d.aW.a();
        com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c cVar = (com.google.android.apps.search.assistant.surfaces.dictation.service.ae.c) ((jh) this.f329a).f314a.c.aj.a();
        jh jhVar = (jh) this.f329a;
        ji jiVar = jhVar.b.d;
        as eN = jiVar.eN();
        z N = jiVar.N();
        kotlinx.coroutines.ag agVar = (kotlinx.coroutines.ag) jhVar.f314a.Q.a();
        boolean f = ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45354202").f();
        boolean f2 = ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45360640").f();
        ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361354").b();
        long b = ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45361997").b();
        long b2 = ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45370953").b();
        long b3 = ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45374554").b();
        jx jxVar = ((jh) this.f329a).f314a.c;
        long m = jxVar.m();
        jxVar.e();
        return new aa(acVar, sVar, cVar, eN, N, agVar, f, f2, b, b2, b3, m, ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45390860").b(), ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45416184").b(), ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45623813").f(), ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45460135").b(), ((com.google.apps.tiktok.experiments.e) ((jh) this.f329a).f314a.c.f325a.V.a()).a("com.google.android.apps.search.assistant.device 45430973").b());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.a.f h(com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.a.a aVar) {
        return new com.google.android.apps.search.assistant.surfaces.voice.i.g.g.e.a.f(aVar, (com.google.common.v.f) ((it) this.f329a).f309a.ez.a(), (com.google.android.libraries.search.b.b) ((it) this.f329a).b.ba.a(), (kotlinx.coroutines.ag) ((it) this.f329a).f309a.Q.a(), (bh) ((it) this.f329a).b.f308a.fq.a(), ((com.google.apps.tiktok.experiments.e) ((it) this.f329a).b.f308a.rO().a.a()).a("com.google.android.apps.search.assistant.user 45639861").f(), ((it) this.f329a).b.f308a.rO().e(), (y) ((it) this.f329a).f309a.W.a(), (String) ((it) this.f329a).f309a.Y.a());
    }

    public final /* bridge */ /* synthetic */ n i(com.google.android.libraries.search.v.b bVar) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((it) this.f329a).f309a.H.a();
        Executor executor = (Executor) ((it) this.f329a).f309a.v.a();
        it itVar = (it) this.f329a;
        ik ikVar = itVar.b;
        h hVar = itVar.f309a.ax;
        com.google.android.libraries.web.webview.i.a.a.i iVar = (com.google.android.libraries.web.webview.i.a.a.i) ikVar.t.a();
        com.google.android.libraries.search.account.e.b bVar2 = (com.google.android.libraries.search.account.e.b) ((it) this.f329a).b.u.a();
        Object obj = this.f329a;
        Optional empty = Optional.empty();
        jo joVar = ((it) obj).b.f308a.f316a;
        com.google.android.libraries.search.v.c.p pVar = new com.google.android.libraries.search.v.c.p(joVar.b.eK, joVar.Q);
        boolean b = h.a.a.as.a.a.h.b(((it) this.f329a).f309a.V);
        h.a.a.as.a.a.h.a(((it) this.f329a).f309a.V);
        boolean f = ((com.google.apps.tiktok.experiments.e) ((it) this.f329a).f309a.b.f322a.V.a()).a("com.google.android.libraries.search.device 45641596").f();
        jj jjVar = ((it) this.f329a).b.f308a;
        return new n(scheduledExecutorService, executor, bVar, hVar, iVar, bVar2, empty, pVar, b, f, new af((Executor) jjVar.f316a.H.a(), (kotlinx.coroutines.ag) jjVar.f316a.bo.a(), (ConnectivityManager) jjVar.f316a.wN.a(), ((com.google.apps.tiktok.experiments.e) jjVar.f316a.b.f322a.V.a()).a("com.google.android.libraries.search.device 45641597").d()), (kotlinx.coroutines.ag) ((it) this.f329a).f309a.Q.a());
    }

    public final com.google.android.libraries.web.o.b.i j(List list) {
        return new com.google.android.libraries.web.o.b.i((com.google.frameworks.client.data.android.l) ((jd) this.f329a).f312a.f319a.aS.a(), (com.google.android.libraries.web.webview.i.a.a.i) ((jd) this.f329a).b.t.a(), (kotlinx.coroutines.ag) ((jd) this.f329a).f312a.Q.a(), list);
    }

    public final com.google.android.libraries.search.assistant.n.b.a k(com.google.android.libraries.search.assistant.n.a.d.a aVar, com.google.android.libraries.search.assistant.n.a.d.b bVar, com.google.android.libraries.search.assistant.n.a.d.at atVar, String str) {
        com.google.android.libraries.search.b.b b = ((com.google.android.libraries.search.t.a.a) ((jd) this.f329a).b.J.a()).b(com.google.android.libraries.search.t.a.h.CONTEXT_API);
        b.getClass();
        return new com.google.android.libraries.search.assistant.n.b.a(b, aVar, bVar, atVar, str, (com.google.android.libraries.g.a) ((jd) this.f329a).f312a.g.a(), ((com.google.apps.tiktok.experiments.e) ((jd) this.f329a).b.l.a()).a("com.google.android.apps.search.assistant.user 45388573").b(), ((com.google.apps.tiktok.experiments.e) ((jd) this.f329a).b.l.a()).a("com.google.android.apps.search.assistant.user 45459981").f());
    }

    public final com.google.android.libraries.search.assistant.ao.b.i l(m mVar, com.google.android.libraries.search.assistant.ao.a.a.b bVar, com.google.android.libraries.search.assistant.n.a.d.at atVar, l lVar) {
        ik ikVar = ((jd) this.f329a).b;
        return new com.google.android.libraries.search.assistant.ao.b.i(mVar, bVar, atVar, lVar, new k((w) ikVar.cS.a(), (com.google.android.libraries.search.assistant.aw.n.b.j) ikVar.f.b.aG.a(), ikVar.iG(), ikVar.iF()), (kotlinx.coroutines.ag) ((jd) this.f329a).f312a.bo.a());
    }

    public final com.google.android.apps.search.assistant.surfaces.voice.e.c.c m(Collection collection) {
        return new com.google.android.apps.search.assistant.surfaces.voice.e.c.c(collection, ((jd) this.f329a).b.iJ());
    }

    public final com.google.android.libraries.search.assistant.e.a.a.j n(String str) {
        return new com.google.android.libraries.search.assistant.e.a.a.j((kotlinx.coroutines.ag) ((jd) this.f329a).f312a.Q.a(), (com.google.android.libraries.g.a) ((jd) this.f329a).f312a.g.a(), str);
    }
}
