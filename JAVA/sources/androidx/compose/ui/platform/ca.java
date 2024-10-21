package androidx.compose.ui.platform;

import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.compose.ui.semantics.z;
import com.google.android.apps.search.assistant.surfaces.voice.robin.data.bb;
import com.google.android.apps.search.assistant.surfaces.voice.robin.data.bm;
import com.google.android.apps.search.assistant.surfaces.voice.robin.data.s;
import com.google.android.libraries.assistant.contexttrigger.e.v;
import com.google.android.libraries.search.ac.b.ac;
import com.google.android.libraries.search.ac.b.ah;
import com.google.android.libraries.search.ac.b.r;
import com.google.android.libraries.search.n.a;
import com.google.apps.tiktok.cache.p;
import com.google.apps.tiktok.cache.q;
import com.google.apps.tiktok.p.l;
import com.google.apps.tiktok.p.m;
import com.google.aw.a.a.a.ad;
import com.google.aw.a.a.a.f;
import com.google.aw.a.a.a.i;
import com.google.aw.a.a.a.j;
import com.google.aw.a.a.a.k;
import com.google.aw.a.a.a.n;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.g.ar.ap;
import com.google.g.ar.as;
import com.google.g.ar.lk;
import com.google.g.b.a.a.a.w;
import com.google.g.e.c.c.cd;
import com.google.g.e.c.c.cu;
import com.google.g.e.d.a.g;
import com.google.g.e.h.a.aa;
import com.google.g.e.h.a.ai;
import com.google.g.e.h.a.cf;
import com.google.g.e.i.bo;
import com.google.g.e.i.bp;
import com.google.g.e.i.bx;
import com.google.g.e.i.ce;
import com.google.g.e.i.dh;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.si;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ba;
import com.google.protobuf.bi;
import com.google.protobuf.c;
import com.google.speech.g.d.b;
import j$.util.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/compose/ui/platform/ca.class */
public final class ca {
    public static /* synthetic */ m A(String str) {
        com.google.common.q.m a2 = a.a("s3.grpc.url", str, 443);
        l lVar = new l();
        lVar.a = a2.a;
        lVar.b = Integer.valueOf(a2.a());
        lVar.b(b.e);
        return lVar.a();
    }

    public static /* synthetic */ boolean B(int i) {
        return a.a.cp(i) != 0;
    }

    public static /* synthetic */ q C() {
        p a2 = q.a();
        a2.e(lk.a);
        a2.b(TimeUnit.MINUTES.toMillis(5L));
        return a2.a();
    }

    public static /* synthetic */ List D(List list) {
        List P = t.P(list);
        int size = P.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return t.N(P);
            }
            Object obj = P.get(i);
            bm bmVar = null;
            com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.j.a.b bVar = obj instanceof com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.j.a.b ? (com.google.android.apps.search.assistant.surfaces.voice.robin.ui.chat.j.a.b) obj : null;
            if (bVar != null) {
                bmVar = bVar.a;
            }
            if (!(bmVar instanceof s)) {
                size = i;
                if (bmVar instanceof bb) {
                }
            }
            P.remove(i);
            size = i;
        }
    }

    public static /* synthetic */ boolean E(int i) {
        return a.a.dt(i) != 0;
    }

    public static /* synthetic */ List F(List list) {
        list.getClass();
        ac createBuilder = com.google.android.libraries.search.ac.b.s.a.createBuilder();
        createBuilder.getClass();
        ah.k(r.e, createBuilder);
        ah.l(createBuilder);
        List L = t.L(list, 5);
        L.getClass();
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ac.b.s sVar = createBuilder.instance;
        sVar.a();
        c.addAll(L, sVar.d);
        List singletonList = Collections.singletonList(ah.j(createBuilder));
        singletonList.getClass();
        return singletonList;
    }

    public static /* synthetic */ boolean G(int i) {
        return a.a.cB(i) != 0;
    }

    public static /* synthetic */ boolean H(int i) {
        return a.b.as(i) != 0;
    }

    public static /* synthetic */ bp I(String str) {
        si createBuilder = bo.a.createBuilder();
        ba createBuilder2 = dh.a.createBuilder();
        createBuilder2.copyOnWrite();
        dh dhVar = createBuilder2.instance;
        dhVar.e = 1;
        dhVar.b |= 16;
        createBuilder.at(a.b.aD("common_media_control_args", "assistant.api.client_op.media_args", createBuilder2.build()));
        return a.b.aB(str, createBuilder.build());
    }

    public static /* synthetic */ bp J(bp bpVar, int i) {
        bp bpVar2 = bpVar;
        if (i == 2) {
            si builder = bpVar.toBuilder();
            bo boVar = bpVar.e;
            bo boVar2 = boVar;
            if (boVar == null) {
                boVar2 = bo.a;
            }
            si builder2 = boVar2.toBuilder();
            ba createBuilder = cf.a.createBuilder();
            createBuilder.copyOnWrite();
            cf cfVar = createBuilder.instance;
            cfVar.c = 2;
            cfVar.b |= 1;
            createBuilder.copyOnWrite();
            cf cfVar2 = createBuilder.instance;
            cfVar2.d = 2;
            cfVar2.b = 2 | cfVar2.b;
            builder2.at(a.b.aD("show_drl_visual_treatment_args", "assistant.api.params.DrlVisualTreatmentParams", createBuilder.build()));
            builder.copyOnWrite();
            bp bpVar3 = builder.instance;
            bo build = builder2.build();
            build.getClass();
            bpVar3.e = build;
            bpVar3.b |= 4;
            bpVar2 = (bp) builder.build();
        }
        return bpVar2;
    }

    public static /* synthetic */ boolean K(int i) {
        return a.a.ay(i) != 0;
    }

    public static /* synthetic */ boolean L(int i) {
        return a.a.dp(i) != 0;
    }

    public static /* synthetic */ boolean M(int i) {
        return a.a.dl(i) != 0;
    }

    public static /* synthetic */ boolean N(int i) {
        return a.a.au(i) != 0;
    }

    public static /* synthetic */ boolean O(int i) {
        return a.a.ct(i) != 0;
    }

    public static /* synthetic */ boolean P(int i) {
        return a.a.cz(i) != 0;
    }

    public static /* synthetic */ void Q(si siVar, g gVar, ce ceVar) {
        ba createBuilder = ai.a.createBuilder();
        createBuilder.copyOnWrite();
        ai aiVar = createBuilder.instance;
        aiVar.b |= 1;
        aiVar.c = true;
        createBuilder.copyOnWrite();
        ai aiVar2 = createBuilder.instance;
        gVar.getClass();
        aiVar2.h = gVar;
        aiVar2.b |= 32;
        ce aE = a.b.aE(ceVar, "asst.client.execution.params", "assistant.api.params.ClientExecutionParams", createBuilder.build().toByteString());
        siVar.copyOnWrite();
        bx bxVar = siVar.instance;
        bx bxVar2 = bx.a;
        aE.getClass();
        bxVar.f = aE;
        bxVar.b |= 16;
    }

    static /* synthetic */ int a(z zVar, androidx.compose.ui.semantics.q qVar) {
        z zVar2 = androidx.compose.ui.semantics.t.a;
        if (androidx.d.bb.e(qVar.c.c, androidx.compose.ui.semantics.t.a) || !androidx.d.bb.e(qVar.c.c, androidx.compose.ui.semantics.t.z)) {
            return zVar.p;
        }
        return 0;
    }

    public static /* synthetic */ boolean b(int i) {
        return a.a.dn(i) != 0;
    }

    public static /* synthetic */ boolean c(int i) {
        return a.a.dh(i) != 0;
    }

    public static /* synthetic */ boolean d(int i) {
        return a.a.cU(i) != 0;
    }

    public static /* synthetic */ boolean e(int i) {
        return a.a.cJ(i) != 0;
    }

    public static /* synthetic */ boolean f(int i) {
        return a.a.cL(i) != 0;
    }

    public static /* synthetic */ boolean g(int i) {
        return a.a.dj(i) != 0;
    }

    public static /* synthetic */ boolean h(int i) {
        return a.a.aA(i) != 0;
    }

    public static /* synthetic */ boolean i(int i) {
        return a.a.dm(i) != 0;
    }

    public static /* synthetic */ boolean j(int i) {
        return a.a.aD(i) != 0;
    }

    public static /* synthetic */ boolean k(Object obj) {
        as asVar = ((ap) obj).j;
        as asVar2 = asVar;
        if (asVar == null) {
            asVar2 = as.b;
        }
        return asVar2.j;
    }

    public static /* synthetic */ boolean l(ap apVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            as asVar = apVar.j;
            as asVar2 = asVar;
            if (asVar == null) {
                asVar2 = as.b;
            }
            return asVar2.E;
        }
        if (i2 != 1) {
            return true;
        }
        as asVar3 = apVar.j;
        as asVar4 = asVar3;
        if (asVar3 == null) {
            asVar4 = as.b;
        }
        return asVar4.F;
    }

    public static /* synthetic */ boolean m(Object obj) {
        int cN = a.a.cN(((com.google.g.b.a.a.a.l) obj).d);
        return cN != 0 && cN == 3;
    }

    public static /* synthetic */ Object n(Object obj) {
        com.google.common.base.a k;
        fl flVar = (fl) obj;
        ab abVar = e.a;
        flVar.size();
        if (flVar.isEmpty()) {
            k = com.google.common.base.a.a;
        } else {
            flVar.get(0);
            w wVar = ((com.google.g.ab.b.a.a.a) flVar.get(0)).b;
            w wVar2 = wVar;
            if (wVar == null) {
                wVar2 = w.a;
            }
            k = at.k(wVar2);
        }
        return k;
    }

    public static /* synthetic */ boolean o(int i) {
        return a.a.aG(i) != 0;
    }

    public static /* synthetic */ boolean p(int i) {
        return a.a.ba(i) != 0;
    }

    public static /* synthetic */ boolean q(int i) {
        return a.a.ax(i) != 0;
    }

    public static /* synthetic */ boolean r(int i) {
        return a.a.av(i) != 0;
    }

    public static /* synthetic */ boolean s(int i) {
        return a.a.bb(i) != 0;
    }

    public static /* synthetic */ boolean t(int i) {
        return a.a.be(i) != 0;
    }

    public static /* synthetic */ boolean u(int i) {
        return a.a.dq(i) != 0;
    }

    public static /* synthetic */ boolean v(Intent intent, String str, PackageManager packageManager) {
        for (cu cuVar : v.f(a.a.bX(intent, packageManager), packageManager)) {
            if (cl.V(str, (cuVar.c == 1 ? (cd) cuVar.d : cd.a).c)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Optional w(ce ceVar) {
        Optional empty;
        for (ej ejVar : ceVar.b) {
            if (a.b.w(ejVar, "asst.communication.call", "assistant.api.params.CallParams")) {
                try {
                    ei eiVar = ejVar.d;
                    ei eiVar2 = eiVar;
                    if (eiVar == null) {
                        eiVar2 = ei.a;
                    }
                    empty = Optional.of(bi.parseFrom(aa.a, eiVar2.d, ExtensionRegistryLite.getGeneratedRegistry()));
                } catch (com.google.protobuf.ce e) {
                    empty = Optional.empty();
                }
                return empty;
            }
        }
        return Optional.empty();
    }

    public static /* synthetic */ boolean x(int i) {
        return i == 0;
    }

    public static /* synthetic */ boolean y(int i) {
        return a.b.h(i) != 0;
    }

    public static /* synthetic */ fl z(j jVar, j jVar2, i iVar, com.google.at.d.a.b.e eVar, n nVar, Iterable iterable) {
        com.google.aw.a.a.a.m E = a.b.E(jVar, iVar);
        ad F = a.b.F(eVar);
        fg fgVar = new fg(4);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.aw.a.a.a.e createBuilder = f.a.createBuilder();
            createBuilder.q(E);
            ba createBuilder2 = com.google.aw.a.a.a.m.a.createBuilder();
            createBuilder2.copyOnWrite();
            com.google.aw.a.a.a.m mVar = createBuilder2.instance;
            mVar.c = 2;
            mVar.b |= 1;
            ba createBuilder3 = com.google.aw.a.a.a.l.a.createBuilder();
            createBuilder3.copyOnWrite();
            com.google.aw.a.a.a.l lVar = createBuilder3.instance;
            jVar2.getClass();
            lVar.c = jVar2;
            lVar.b |= 1;
            ba createBuilder4 = k.a.createBuilder();
            createBuilder4.copyOnWrite();
            k kVar = createBuilder4.instance;
            str.getClass();
            kVar.b |= 1;
            kVar.c = str;
            k build = createBuilder4.build();
            createBuilder3.copyOnWrite();
            com.google.aw.a.a.a.l lVar2 = createBuilder3.instance;
            build.getClass();
            lVar2.e = build;
            lVar2.b |= 2048;
            createBuilder2.copyOnWrite();
            com.google.aw.a.a.a.m mVar2 = createBuilder2.instance;
            com.google.aw.a.a.a.l build2 = createBuilder3.build();
            build2.getClass();
            mVar2.d = build2;
            mVar2.b |= 2;
            createBuilder.q(createBuilder2.build());
            createBuilder.copyOnWrite();
            f fVar = createBuilder.instance;
            F.getClass();
            fVar.g = F;
            fVar.b |= 8;
            createBuilder.copyOnWrite();
            f fVar2 = createBuilder.instance;
            nVar.getClass();
            fVar2.f = nVar;
            fVar2.b |= 4;
            fgVar.h(createBuilder.build());
        }
        return fgVar.g();
    }
}
