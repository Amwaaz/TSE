package com.google.android.apps.gsa.binaries.velvet.app;

import com.google.android.libraries.assistant.auto.tng.a.b.s;
import com.google.android.libraries.search.assistant.ao.b.e;
import com.google.android.libraries.search.assistant.ao.b.m;
import com.google.android.libraries.search.assistant.invocation.n.d.i;
import com.google.android.libraries.search.assistant.invocation.u.d.al;
import com.google.android.libraries.search.assistant.invocation.u.e.a.bl;
import com.google.android.libraries.search.assistant.invocation.u.g.a;
import com.google.android.libraries.search.assistant.invocation.u.g.a.t;
import com.google.android.libraries.search.assistant.invocation.u.g.a.u;
import com.google.android.libraries.search.assistant.invocation.u.g.c.d;
import com.google.android.libraries.search.assistant.invocation.u.g.d.n;
import com.google.android.libraries.search.assistant.invocation.utils.c;
import com.google.android.libraries.search.assistant.q.a.b.b.a.f;
import com.google.android.libraries.search.assistant.q.a.b.c.c.a.a.b;
import com.google.android.libraries.search.assistant.q.a.c.l.g;
import com.google.common.b.fu;
import com.google.common.b.nn;
import com.google.common.f.j;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import e.c.h;
import io.grpc.cq;
import io.grpc.cr;
import io.grpc.cx;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.ag;
import m.a.an;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/hn.class */
public final class hn implements h {

    /* renamed from: a, reason: collision with root package name */
    public final jo f300a;
    public final ik b;
    public final or c;
    private final int d;

    public hn(jo joVar, ik ikVar, or orVar, int i) {
        this.f300a = joVar;
        this.b = ikVar;
        this.c = orVar;
        this.d = i;
    }

    public final Object a() {
        Optional aVar;
        cq cqVar = null;
        switch (this.d) {
            case 0:
                or orVar = this.c;
                a aVar2 = new a(new t((u) orVar.b.kP.a(), new n((bl) orVar.b.kR.a(), (bl) orVar.b.tE.a(), (al) orVar.b.kU.a(), (i) orVar.b.eY.a(), (com.google.android.libraries.g.a) orVar.b.g.a()), (d) orVar.b.c.bT.a(), (nz) orVar.d.a(), (com.google.android.libraries.search.assistant.invocation.u.g.a.a) orVar.b.c.bU.a()), (m.c.n) orVar.b.P.a());
                j jVar = c.f4684a;
                return new com.google.android.libraries.search.assistant.invocation.utils.a(aVar2);
            case 1:
                return new nz(this);
            case 2:
                return new f((m.c.n) this.f300a.P.a(), (ag) this.c.e.a(), this.b.hz(), new com.google.android.libraries.search.assistant.q.a.b.c.b.a.d(this.c.f), (com.google.android.libraries.search.assistant.q.a.b.c.c.a.a) this.c.h.a(), (com.google.android.libraries.search.assistant.invocation.u.a.a) this.c.j.a(), Optional.of((e) this.b.c.fe.a()));
            case 3:
                return com.google.android.libraries.assistant.assistantactions.rendering.b.f.V((ag) this.f300a.Q.a());
            case 4:
                return new kx(this.f300a, this.b, this.c);
            case 5:
                return new com.google.android.libraries.search.assistant.q.a.b.c.c.a.a((ag) this.c.e.a(), (ag) this.c.g.a());
            case 6:
                return com.google.android.libraries.assistant.assistantactions.rendering.b.f.V((ag) this.f300a.bo.a());
            case 7:
                b bVar = (b) this.c.i.a();
                bVar.getClass();
                com.google.android.libraries.search.assistant.invocation.u.a.a a2 = com.google.android.libraries.search.assistant.invocation.u.a.a.a(bVar.c);
                com.google.android.libraries.search.assistant.invocation.u.a.a aVar3 = a2;
                if (a2 == null) {
                    aVar3 = com.google.android.libraries.search.assistant.invocation.u.a.a.UNRECOGNIZED;
                }
                aVar3.getClass();
                return aVar3;
            case 8:
                cx cxVar = this.c.f330a;
                cxVar.getClass();
                bg bgVar = com.google.android.libraries.search.assistant.q.a.b.c.c.a.a.a.a;
                bgVar.getClass();
                cr a3 = cxVar.a(com.google.frameworks.client.data.android.server.tiktok.a.d.a);
                if (a3 != null) {
                    cqVar = new cq(a3);
                }
                if (cqVar == null || !cqVar.hasNext()) {
                    throw new IllegalArgumentException("RequestContext was not part of the request. Wrap the stub with [withRequestContext].");
                }
                com.google.frameworks.client.data.android.server.tiktok.a.a aVar4 = (com.google.frameworks.client.data.android.server.tiktok.a.a) cqVar.next();
                if (cqVar.hasNext()) {
                    throw new IllegalArgumentException("[withRequestContext] must only be called once.");
                }
                bg bgVar2 = bi.-$$Nest$smcheckIsLite(bgVar);
                aVar4.d(bgVar2);
                if (!((bd) aVar4).br.o(bgVar2.d)) {
                    throw new IllegalArgumentException("RequestContext did not contain the extension with field number " + bgVar.d.b + ".");
                }
                bg bgVar3 = bi.-$$Nest$smcheckIsLite(bgVar);
                aVar4.d(bgVar3);
                Object l = ((bd) aVar4).br.l(bgVar3.d);
                Object c = l == null ? bgVar3.b : bgVar3.c(l);
                c.getClass();
                return (b) c;
            case 9:
                m.c.n nVar = (m.c.n) this.f300a.P.a();
                ag agVar = (ag) this.c.e.a();
                or orVar2 = this.c;
                return new com.google.android.libraries.search.assistant.q.a.b.b.b.h(nVar, agVar, new com.google.android.libraries.search.assistant.q.a.c.k.b(new com.google.android.libraries.search.assistant.q.a.c.m.b(orVar2.c.ic(), (ag) orVar2.e.a(), (ag) orVar2.g.a(), new com.google.android.libraries.search.assistant.q.a.c.h.h((ag) orVar2.e.a(), (com.google.android.libraries.search.assistant.q.a.b.c.c.b.a) orVar2.k.a(), (Map) orVar2.o.a(), orVar2.a()), Optional.empty()), (Map) orVar2.o.a(), (ag) orVar2.e.a(), new g(Optional.of((m) orVar2.c.cU.a()), (Map) orVar2.o.a(), (ag) orVar2.e.a(), orVar2.a())), (com.google.android.libraries.search.assistant.q.a.b.c.c.a.a) this.c.h.a());
            case 10:
                or orVar3 = this.c;
                fu fuVar = nn.a;
                com.google.android.libraries.search.assistant.invocation.u.a.a aVar5 = (com.google.android.libraries.search.assistant.invocation.u.a.a) orVar3.j.a();
                aVar5.getClass();
                if (!fuVar.containsKey(aVar5)) {
                    com.google.common.f.h f = com.google.android.libraries.search.assistant.q.a.b.c.c.b.b.a.f();
                    f.aj(com.google.common.f.a.e.a, "Convoc.RacPropsModule");
                    f.ak(53996);
                    f.s("PersistentPlugins not found for %s, using default PersistentPlugin", aVar5);
                    aVar = new com.google.android.libraries.search.assistant.q.a.b.c.c.b.a();
                    break;
                } else {
                    Object obj = fuVar.get(aVar5);
                    obj.getClass();
                    aVar = (com.google.android.libraries.search.assistant.q.a.b.c.c.b.a) obj;
                    break;
                }
            case 11:
                lt ltVar = (lt) this.c.m.a();
                lt ltVar2 = (lt) this.c.n.a();
                ag agVar2 = (ag) this.c.e.a();
                com.google.android.libraries.search.assistant.q.a.b.c.c.b.a aVar6 = (com.google.android.libraries.search.assistant.q.a.b.c.c.b.a) this.c.k.a();
                ltVar.getClass();
                ltVar2.getClass();
                agVar2.getClass();
                aVar6.getClass();
                Map as = an.as(new m.h(com.google.android.libraries.search.assistant.q.a.a.b.c.c, new com.google.android.libraries.search.assistant.q.a.a.b((m.c.g) null)));
                Optional linkedHashMap = new LinkedHashMap(an.ar(as.size()));
                Iterator it = as.entrySet().iterator();
                while (true) {
                    aVar = linkedHashMap;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        com.google.android.libraries.search.assistant.q.a.a.b.c cVar = (com.google.android.libraries.search.assistant.q.a.a.b.c) entry.getKey();
                        com.google.android.libraries.search.assistant.q.a.c.c.e aX = ltVar.aX((l) entry.getValue(), agVar2, Optional.empty());
                        new com.google.android.libraries.search.assistant.q.a.c.c.m(Optional.of(((hn) ltVar2.a).b.c.cg()), (ag) ((hn) ltVar2.a).c.e.a(), (b) ((hn) ltVar2.a).c.i.a(), cVar, aX);
                        linkedHashMap.put(key, aX);
                    }
                }
            case 12:
                return new lt(this);
            case 13:
                return new lt(this);
            case 14:
                return new lt(this);
            case 15:
                return new com.google.android.libraries.search.assistant.q.a.a.a.a.j(this.b.c.b.qh(), io.grpc.h.a);
            default:
                or orVar4 = this.c;
                com.google.android.libraries.search.assistant.invocation.u.a.a aVar7 = com.google.android.libraries.search.assistant.invocation.u.a.a.CLIENT_AUTO_PROJECTED;
                je jeVar = orVar4.c.c;
                fu m = fu.m(aVar7, new com.google.android.apps.search.assistant.surfaces.b.d.a.a(new com.google.android.apps.search.assistant.surfaces.b.d.a.d((lt) jeVar.fi.a(), (s) jeVar.b.aw.a(), (com.google.android.libraries.assistant.auto.tng.assistant.d.a.b.a.j) jeVar.b.f308a.e.a(), (com.google.android.apps.search.assistant.surfaces.b.a.d.a.a) jeVar.b.f308a.p.a(), (com.google.android.apps.search.assistant.surfaces.b.b.a.e) jeVar.f313a.ea.a()), jeVar.fL()));
                com.google.android.libraries.search.assistant.invocation.u.a.a aVar8 = (com.google.android.libraries.search.assistant.invocation.u.a.a) this.c.j.a();
                aVar8.getClass();
                if (!m.containsKey(aVar8)) {
                    com.google.common.f.h f2 = com.google.android.libraries.search.assistant.q.a.b.c.c.b.b.a.f();
                    f2.aj(com.google.common.f.a.e.a, "Convoc.RacPropsModule");
                    f2.ak(53997);
                    f2.s("ActiveInvocationPlugins not found for %s", aVar8);
                    aVar = Optional.empty();
                    break;
                } else {
                    Object obj2 = m.get(aVar8);
                    obj2.getClass();
                    aVar = Optional.of(obj2);
                    break;
                }
        }
        return aVar;
    }
}
