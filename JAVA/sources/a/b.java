package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.l.f;
import com.google.android.apps.gsa.opa.smartspace.x;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.l.aj;
import com.google.android.apps.gsa.search.core.l.ap;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.b.o;
import com.google.android.apps.gsa.speech.e.c.h;
import com.google.android.apps.gsa.speech.e.c.r;
import com.google.android.apps.gsa.speech.e.c.t;
import com.google.android.apps.gsa.staticplugins.bi.f.d;
import com.google.android.apps.gsa.v.c;
import com.google.android.apps.gsa.x.e.a.g;
import com.google.android.apps.gsa.x.e.a.q;
import com.google.android.apps.search.assistant.surfaces.bisto.d.bq;
import com.google.android.apps.search.assistant.surfaces.bisto.interactor.f.b.d.n;
import com.google.android.libraries.search.ac.b.ac;
import com.google.android.libraries.search.ac.b.ae;
import com.google.android.libraries.search.ac.b.ag;
import com.google.android.libraries.search.ac.b.s;
import com.google.at.d.a.b.e;
import com.google.aw.a.a.a.ad;
import com.google.aw.a.a.a.j;
import com.google.aw.a.a.a.l;
import com.google.aw.a.a.a.m;
import com.google.bf.a.cq;
import com.google.bf.a.eg;
import com.google.bz.g.d.c.a.aa;
import com.google.bz.g.d.c.a.bn;
import com.google.common.base.at;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.ar.mp;
import com.google.g.c.ai;
import com.google.g.c.ay;
import com.google.g.c.bc;
import com.google.g.c.bf;
import com.google.g.e.c.c.bk;
import com.google.g.e.c.c.cu;
import com.google.g.e.c.c.dq;
import com.google.g.e.c.c.u;
import com.google.g.e.c.c.v;
import com.google.g.e.f.i;
import com.google.g.e.h.a.ct;
import com.google.g.e.i.bo;
import com.google.g.e.i.bp;
import com.google.g.e.i.br;
import com.google.g.e.i.cd;
import com.google.g.e.i.ce;
import com.google.g.e.i.ei;
import com.google.g.e.i.ej;
import com.google.g.e.i.ek;
import com.google.g.e.i.el;
import com.google.g.e.i.ft;
import com.google.g.e.i.gi;
import com.google.g.e.i.gk;
import com.google.g.e.i.il;
import com.google.g.e.i.io;
import com.google.g.e.i.ry;
import com.google.g.e.i.si;
import com.google.g.q.b.aw;
import com.google.g.q.b.ax;
import com.google.g.q.b.bv;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ao;
import com.google.protobuf.ba;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import com.google.protos.o.b.k;
import com.google.speech.g.au;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m.w;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes-dex2jar.jar:a/b.class */
public final class b {
    public static /* synthetic */ boolean A(Object obj) {
        ay a2 = ay.a(((bf) obj).n);
        ay ayVar = a2;
        if (a2 == null) {
            ayVar = ay.a;
        }
        return ayVar == ay.c;
    }

    public static /* synthetic */ ai B(bf bfVar) {
        bc bcVar = bfVar.C;
        bc bcVar2 = bcVar;
        if (bcVar == null) {
            bcVar2 = bc.a;
        }
        bg bgVar = bi.-$$Nest$smcheckIsLite(ai.b);
        bcVar2.d(bgVar);
        Object l = ((bd) bcVar2).br.l(bgVar.d);
        return (ai) (l == null ? bgVar.b : bgVar.c(l));
    }

    public static /* synthetic */ Optional C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        ba createBuilder = com.google.g.e.f.a.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.g.e.f.a aVar = createBuilder.instance;
        str.getClass();
        aVar.b |= 2;
        aVar.d = str;
        String K = cl.K(str2);
        createBuilder.copyOnWrite();
        com.google.g.e.f.a aVar2 = createBuilder.instance;
        aVar2.b |= 1;
        aVar2.c = K;
        return Optional.of(createBuilder.build());
    }

    public static /* synthetic */ Optional D(String str) {
        ba createBuilder = i.a.createBuilder();
        createBuilder.copyOnWrite();
        i iVar = createBuilder.instance;
        iVar.b |= 1;
        iVar.c = str;
        return Optional.of(createBuilder.build());
    }

    public static /* synthetic */ m E(j jVar, com.google.aw.a.a.a.i iVar) {
        ba createBuilder = m.a.createBuilder();
        createBuilder.copyOnWrite();
        m mVar = createBuilder.instance;
        mVar.c = 1;
        mVar.b |= 1;
        ba createBuilder2 = l.a.createBuilder();
        createBuilder2.copyOnWrite();
        l lVar = createBuilder2.instance;
        jVar.getClass();
        lVar.c = jVar;
        lVar.b |= 1;
        createBuilder2.copyOnWrite();
        l lVar2 = createBuilder2.instance;
        iVar.getClass();
        lVar2.d = iVar;
        lVar2.b |= 4;
        createBuilder.copyOnWrite();
        m mVar2 = createBuilder.instance;
        l build = createBuilder2.build();
        build.getClass();
        mVar2.d = build;
        mVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ ad F(e eVar) {
        ba createBuilder = ad.a.createBuilder();
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        adVar.c = eVar.sm;
        adVar.b |= 1;
        String languageTag = Locale.getDefault().toLanguageTag();
        createBuilder.copyOnWrite();
        ad adVar2 = createBuilder.instance;
        languageTag.getClass();
        adVar2.b |= 2;
        adVar2.d = languageTag;
        return createBuilder.build();
    }

    public static /* synthetic */ cn H(Object obj) {
        ab abVar = com.google.common.f.a.e.a;
        return dl.n(((q) obj).a());
    }

    public static /* synthetic */ cn I(Object obj) {
        ab abVar = com.google.common.f.a.e.a;
        return dl.n(((q) obj).a());
    }

    public static /* synthetic */ cn J(Object obj) {
        List list = (List) obj;
        SettableFuture settableFuture = (SettableFuture) list.get(1);
        ab abVar = com.google.common.f.a.e.a;
        return settableFuture;
    }

    public static /* synthetic */ cn K(Object obj) {
        List list = (List) obj;
        h hVar = (h) list.get(0);
        com.google.android.apps.gsa.speech.e.c.b bVar = (com.google.android.apps.gsa.speech.e.c.b) list.get(1);
        com.google.android.apps.gsa.speech.e.c.m mVar = (com.google.android.apps.gsa.speech.e.c.m) list.get(2);
        com.google.android.apps.gsa.shared.logger.b.h hVar2 = (com.google.android.apps.gsa.shared.logger.b.h) list.get(3);
        r rVar = (r) list.get(4);
        p pVar = (p) list.get(5);
        t tVar = (t) list.get(6);
        return dl.n(new com.google.android.apps.gsa.speech.e.c.a(hVar, bVar, mVar, hVar2, rVar, pVar, tVar));
    }

    public static /* synthetic */ cn L(Object obj) {
        List list = (List) obj;
        ((com.google.android.apps.gsa.shared.v.bg) list.get(0)).n((g) list.get(1));
        return c.b;
    }

    public static /* synthetic */ cn M(Object obj) {
        List list = (List) obj;
        com.google.android.apps.gsa.speech.e.c.a aVar = (com.google.android.apps.gsa.speech.e.c.a) list.get(0);
        c cVar = (c) list.get(1);
        com.google.android.apps.gsa.staticplugins.bi.i.a.a aVar2 = (com.google.android.apps.gsa.staticplugins.bi.i.a.a) list.get(2);
        at atVar = (at) list.get(3);
        com.google.android.apps.gsa.b.f.i iVar = (com.google.android.apps.gsa.b.f.i) list.get(5);
        ab abVar = com.google.common.f.a.e.a;
        iVar.f("HybrdVSSessionFinishMdl", atVar);
        aVar2.e = false;
        aVar.a();
        return dl.n(cVar);
    }

    public static /* synthetic */ cn N(Object obj) {
        List list = (List) obj;
        at atVar = (at) list.get(0);
        com.google.android.apps.gsa.shared.v.m mVar = (com.google.android.apps.gsa.shared.v.m) list.get(1);
        if (atVar.h()) {
            ((ap) atVar.c()).M(mVar.c());
        }
        return dl.n(atVar);
    }

    public static /* synthetic */ cn O(Object obj) {
        List list = (List) obj;
        g gVar = (g) list.get(0);
        return dl.n(gVar);
    }

    public static /* synthetic */ cn P(Object obj) {
        List list = (List) obj;
        com.google.android.apps.gsa.staticplugins.bi.f.c cVar = (com.google.android.apps.gsa.staticplugins.bi.f.c) list.get(0);
        List list2 = (List) list.get(1);
        if (list2.isEmpty()) {
            throw new o();
        }
        return dl.n(cVar.a(list2));
    }

    public static /* synthetic */ cn Q(Object obj) {
        List list = (List) obj;
        d dVar = (d) list.get(0);
        com.google.android.apps.gsa.speech.j.d dVar2 = (com.google.android.apps.gsa.speech.j.d) list.get(1);
        List list2 = (List) list.get(2);
        Collection collection = (Collection) list.get(3);
        com.google.android.apps.gsa.speech.m.d dVar3 = (com.google.android.apps.gsa.speech.m.d) list.get(4);
        com.google.android.apps.gsa.staticplugins.bi.f.e eVar = (com.google.android.apps.gsa.staticplugins.bi.f.e) list.get(5);
        at atVar = (at) list.get(7);
        ab abVar = com.google.common.f.a.e.a;
        dVar.a(dVar3, dVar2, eVar, list2, atVar);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((com.google.android.apps.gsa.x.d.a.b) ((Pair) it.next()).second).b(eVar, dVar3, atVar);
        }
        return dl.n(c.f1836a);
    }

    public static /* synthetic */ cn R(Object obj) {
        List list = (List) obj;
        com.google.android.libraries.gsa.c.a.a.t tVar = (com.google.android.libraries.gsa.c.a.a.t) list.get(0);
        p pVar = (p) list.get(1);
        int i = (int) pVar.i(az.ke);
        int i2 = (int) pVar.i(az.in);
        com.google.android.apps.gsa.shared.v.p a2 = com.google.android.apps.gsa.shared.v.r.a();
        a2.a = new com.google.android.apps.gsa.shared.v.q(i2, i);
        return tVar.a(53, a2.a()).e();
    }

    public static /* synthetic */ cn S(Object obj) {
        List list = (List) obj;
        com.google.android.apps.gsa.shared.v.l lVar = (com.google.android.apps.gsa.shared.v.l) list.get(0);
        p pVar = (p) list.get(1);
        Query query = (Query) list.get(2);
        boolean z = false;
        if (!lVar.equals(com.google.android.apps.gsa.shared.v.l.d)) {
            z = false;
            if (query.cU()) {
                z = false;
                if (pVar.w(az.kU)) {
                    z = true;
                }
            }
        }
        return dl.n(Boolean.valueOf(z));
    }

    public static /* synthetic */ Deque T(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    public static /* synthetic */ cn U(Object obj) {
        List list = (List) obj;
        return ci.a;
    }

    public static /* synthetic */ com.google.net.util.a.b V(Status.Code code) {
        switch (code.ordinal()) {
            case 0:
                return com.google.net.util.a.b.a;
            case 1:
                return com.google.net.util.a.b.b;
            case 2:
                return com.google.net.util.a.b.c;
            case 3:
                return com.google.net.util.a.b.d;
            case 4:
                return com.google.net.util.a.b.e;
            case 5:
                return com.google.net.util.a.b.f;
            case 6:
                return com.google.net.util.a.b.g;
            case 7:
                return com.google.net.util.a.b.h;
            case 8:
                return com.google.net.util.a.b.j;
            case 9:
                return com.google.net.util.a.b.k;
            case 10:
                return com.google.net.util.a.b.l;
            case 11:
                return com.google.net.util.a.b.m;
            case 12:
                return com.google.net.util.a.b.n;
            case 13:
                return com.google.net.util.a.b.o;
            case 14:
                return com.google.net.util.a.b.p;
            case 15:
                return com.google.net.util.a.b.q;
            case 16:
                return com.google.net.util.a.b.i;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(code))));
        }
    }

    public static /* synthetic */ int W(RectF rectF, RectF rectF2) {
        float f = rectF.left;
        float f2 = rectF2.left;
        float f3 = rectF.right;
        float f4 = rectF2.right;
        int i = f > f2 + 0.01f ? 1 : 0;
        int i2 = i;
        if (f3 < f4 - 0.01f) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (rectF.top > rectF2.top + 0.01f) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (rectF.bottom < rectF2.bottom - 0.01f) {
            i4 = i3 + 1;
        }
        return i4;
    }

    public static /* synthetic */ bq X(String str) {
        ba createBuilder = bq.a.createBuilder();
        createBuilder.copyOnWrite();
        bq bqVar = createBuilder.instance;
        str.getClass();
        bqVar.b |= 1;
        bqVar.c = str;
        return createBuilder.build();
    }

    public static /* synthetic */ int Y(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 25:
                return 27;
            case 26:
                return 28;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int Z(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aA(int i, v vVar) {
        if (vVar.c.size() <= i) {
            return 1;
        }
        bk bkVar = ((u) vVar.c.get(i)).g;
        bk bkVar2 = bkVar;
        if (bkVar == null) {
            bkVar2 = bk.a;
        }
        String str = bkVar2.c;
        if (str.equals("datetime_select_complete")) {
            return 2;
        }
        if (str.equals("recurrence_select_complete")) {
            return 3;
        }
        return str.equals("location_select_complete") ? 4 : 1;
    }

    public static /* synthetic */ bp aB(String str, bo boVar) {
        si createBuilder = bp.a.createBuilder();
        createBuilder.copyOnWrite();
        bp bpVar = createBuilder.instance;
        bpVar.b |= 1;
        bpVar.c = str;
        createBuilder.copyOnWrite();
        bp bpVar2 = createBuilder.instance;
        boVar.getClass();
        bpVar2.e = boVar;
        bpVar2.b |= 4;
        return createBuilder.build();
    }

    public static /* synthetic */ bp aC(String str, String str2) {
        ba createBuilder = com.google.speech.k.a.r.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.speech.k.a.r rVar = createBuilder.instance;
        str.getClass();
        rVar.c |= 1;
        rVar.f = str;
        createBuilder.copyOnWrite();
        com.google.speech.k.a.r rVar2 = createBuilder.instance;
        rVar2.c |= 8192;
        rVar2.n = str2;
        com.google.speech.k.a.r build = createBuilder.build();
        ba createBuilder2 = ry.a.createBuilder();
        createBuilder2.copyOnWrite();
        ry ryVar = createBuilder2.instance;
        str.getClass();
        ryVar.b |= 1;
        ryVar.c = str;
        ba createBuilder3 = ei.a.createBuilder();
        createBuilder3.copyOnWrite();
        ei eiVar = createBuilder3.instance;
        eiVar.b |= 1;
        eiVar.c = "speech.s3.TtsServiceRequest";
        com.google.protobuf.v byteString = build.toByteString();
        createBuilder3.copyOnWrite();
        ei eiVar2 = createBuilder3.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder2.copyOnWrite();
        ry ryVar2 = createBuilder2.instance;
        ei build2 = createBuilder3.build();
        build2.getClass();
        ryVar2.d = build2;
        ryVar2.b |= 2;
        return f.ai(createBuilder2.build());
    }

    public static /* synthetic */ ej aD(String str, String str2, MessageLite messageLite) {
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = str;
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = str2;
        com.google.protobuf.v byteString = messageLite.toByteString();
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        ei build = createBuilder2.build();
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ ce aE(ce ceVar, String str, String str2, com.google.protobuf.v vVar) {
        cd builder = ceVar.toBuilder();
        int size = builder.instance.b.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                break;
            }
            size = i;
            if (str.equals(builder.q(i).c)) {
                builder.u(i);
                break;
            }
        }
        ba createBuilder = ej.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = str;
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = str2;
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        vVar.getClass();
        eiVar2.b |= 2;
        eiVar2.d = vVar;
        ei build = createBuilder2.build();
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        builder.t(createBuilder.build());
        return builder.build();
    }

    public static /* synthetic */ com.google.protobuf.bc aF(String str, String str2) {
        com.google.protobuf.bc createBuilder = com.google.knowledge.a.a.a.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.knowledge.a.a.a aVar = createBuilder.instance;
        aVar.b |= 2;
        aVar.e = str;
        com.google.knowledge.a.a.b createBuilder2 = com.google.knowledge.a.a.c.a.createBuilder();
        ba createBuilder3 = com.google.knowledge.a.a.i.a.createBuilder();
        createBuilder3.copyOnWrite();
        com.google.knowledge.a.a.i iVar = createBuilder3.instance;
        str2.getClass();
        iVar.b = 1;
        iVar.c = str2;
        createBuilder2.copyOnWrite();
        com.google.knowledge.a.a.c cVar = createBuilder2.instance;
        com.google.knowledge.a.a.i build = createBuilder3.build();
        build.getClass();
        cVar.c = build;
        cVar.b = 3;
        createBuilder.copyOnWrite();
        com.google.knowledge.a.a.a aVar2 = createBuilder.instance;
        com.google.knowledge.a.a.c build2 = createBuilder2.build();
        build2.getClass();
        aVar2.f = build2;
        aVar2.b |= 4;
        return createBuilder;
    }

    public static /* synthetic */ int aG(com.google.protos.bg.b.a.a.p pVar) {
        switch (pVar.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(pVar))));
        }
    }

    public static /* synthetic */ void aH() {
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        throw new IllegalStateException("PRIMITIVE_LOW_TICK doesn't exist on " + Build.VERSION.SDK_INT);
    }

    public static /* synthetic */ void aI() {
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        throw new IllegalStateException("PRIMITIVE_TICK doesn't exist on " + Build.VERSION.SDK_INT);
    }

    public static /* synthetic */ boolean aJ(y yVar) {
        PlaybackStateCompat d = ((android.support.v4.media.session.l) yVar.b).d();
        return d != null && d.a == 7 && d.f == 3;
    }

    public static /* synthetic */ void aK(ac acVar, ba baVar, com.google.android.libraries.search.ac.b.r rVar) {
        ac createBuilder = s.a.createBuilder();
        createBuilder.copyOnWrite();
        s sVar = createBuilder.instance;
        com.google.android.libraries.search.ac.b.o build = baVar.build();
        build.getClass();
        sVar.e = build;
        sVar.b |= 2;
        createBuilder.copyOnWrite();
        s sVar2 = createBuilder.instance;
        sVar2.c = rVar.K;
        sVar2.b |= 1;
        acVar.A(createBuilder);
    }

    public static /* synthetic */ void aL(boolean z, dq dqVar) {
        com.google.android.libraries.appdoctor.b.f.A(dqVar, "select_time", z ? com.google.g.e.c.c.t.a : com.google.g.e.c.c.t.d);
        com.google.android.libraries.appdoctor.b.f.A(dqVar, "select_location", z ? com.google.g.e.c.c.t.a : com.google.g.e.c.c.t.d);
    }

    public static /* synthetic */ Object aa(Object obj) {
        ((View) obj).getClass();
        return w.a;
    }

    public static /* synthetic */ br ab(ek ekVar) {
        ba createBuilder = br.a.createBuilder();
        ba createBuilder2 = el.a.createBuilder();
        createBuilder2.copyOnWrite();
        el elVar = createBuilder2.instance;
        elVar.c = ekVar.u;
        elVar.b |= 1;
        createBuilder.copyOnWrite();
        br brVar = createBuilder.instance;
        el build = createBuilder2.build();
        build.getClass();
        brVar.c = build;
        brVar.b |= 1;
        return createBuilder.build();
    }

    public static /* synthetic */ Object ac(Object obj, Object obj2) {
        androidx.core.graphics.b bVar = (androidx.core.graphics.b) obj;
        androidx.core.graphics.b bVar2 = (androidx.core.graphics.b) obj2;
        bVar.getClass();
        bVar2.getClass();
        return androidx.core.graphics.b.c(bVar, bVar2);
    }

    public static /* synthetic */ Object ad(Object obj) {
        com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.b) obj;
        bVar.getClass();
        bVar.b = com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.anim.h.h(1.0f, 0.0f);
        Duration ofMillis = Duration.ofMillis(n.D(bVar.a, 2130970913));
        ofMillis.getClass();
        bVar.d = ofMillis;
        return w.a;
    }

    public static /* synthetic */ Object ae(Object obj) {
        com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.b bVar = (com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.b) obj;
        bVar.getClass();
        bVar.b = com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.transitions.elements.anim.h.h(1.0f, 0.0f);
        Duration ofMillis = Duration.ofMillis(n.D(bVar.a, 2130970914));
        ofMillis.getClass();
        bVar.d = ofMillis;
        return w.a;
    }

    public static /* synthetic */ Object af(Object obj) {
        com.google.protobuf.bc createBuilder = com.google.android.apps.search.assistant.surfaces.voice.ui.host.e.a.createBuilder();
        com.google.android.apps.search.assistant.surfaces.voice.ui.host.d dVar = com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.d;
        createBuilder.copyOnWrite();
        com.google.android.apps.search.assistant.surfaces.voice.ui.host.e eVar = createBuilder.instance;
        eVar.c = dVar.y;
        eVar.b |= 1;
        return createBuilder.build();
    }

    public static /* synthetic */ mp ag(com.google.protos.o.b.ad adVar) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(k.b);
        adVar.d(bgVar);
        Object l = ((bd) adVar).br.l(bgVar.d);
        mp mpVar = ((k) (l == null ? bgVar.b : bgVar.c(l))).c;
        mp mpVar2 = mpVar;
        if (mpVar == null) {
            mpVar2 = mp.a;
        }
        return mpVar2;
    }

    public static /* synthetic */ void ah(Duration duration, Duration duration2) {
        ba createBuilder = com.google.android.apps.search.googleapp.contentcreator.f.h.a.createBuilder();
        ao a2 = com.google.protobuf.b.a.a.a(duration);
        createBuilder.copyOnWrite();
        com.google.android.apps.search.googleapp.contentcreator.f.h hVar = createBuilder.instance;
        hVar.c = a2;
        hVar.b |= 1;
        ao a3 = com.google.protobuf.b.a.a.a(duration2);
        createBuilder.copyOnWrite();
        com.google.android.apps.search.googleapp.contentcreator.f.h hVar2 = createBuilder.instance;
        hVar2.d = a3;
        hVar2.b |= 2;
        createBuilder.build();
    }

    public static /* synthetic */ int ai(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aj(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ aa ak() {
        com.google.protobuf.bc createBuilder = aa.a.createBuilder();
        createBuilder.getClass();
        return bn.n(createBuilder);
    }

    public static /* synthetic */ com.google.cm.a al(int i) {
        ba createBuilder = com.google.cm.a.a.createBuilder();
        createBuilder.getClass();
        float red = Color.red(i);
        createBuilder.copyOnWrite();
        createBuilder.instance.c = red / 255.0f;
        float green = Color.green(i);
        createBuilder.copyOnWrite();
        createBuilder.instance.d = green / 255.0f;
        float blue = Color.blue(i);
        createBuilder.copyOnWrite();
        createBuilder.instance.e = blue / 255.0f;
        com.google.protobuf.ay a2 = com.google.protobuf.ay.a(Color.alpha(i) / 255.0f);
        a2.getClass();
        createBuilder.copyOnWrite();
        com.google.cm.a aVar = createBuilder.instance;
        aVar.f = a2;
        aVar.b |= 1;
        return com.google.cm.h.b(createBuilder);
    }

    public static /* synthetic */ Object am(Object obj, Object obj2) {
        androidx.compose.runtime.k kVar = (androidx.compose.runtime.k) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && kVar.R()) {
            kVar.y();
        }
        return w.a;
    }

    public static /* synthetic */ com.google.android.libraries.search.ac.b.k an(com.google.android.libraries.search.ac.b.n nVar, int i) {
        ba createBuilder = com.google.android.libraries.search.ac.b.k.a.createBuilder();
        ag a2 = nVar.a();
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ac.b.k kVar = createBuilder.instance;
        kVar.c = a2.q;
        kVar.b |= 1;
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ac.b.k kVar2 = createBuilder.instance;
        kVar2.d = i - 1;
        kVar2.b |= 2;
        return createBuilder.build();
    }

    public static /* synthetic */ Object ao(Object obj) {
        ag a2 = ag.a(((ae) obj).l);
        ag agVar = a2;
        if (a2 == null) {
            agVar = ag.a;
        }
        return agVar;
    }

    public static /* synthetic */ ObjectAnimator ap(View view, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, 0.5f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        return ofFloat;
    }

    public static /* synthetic */ ObjectAnimator aq(View view, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, 1.0f, 0.5f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        return ofFloat;
    }

    public static /* synthetic */ float ar(int i, RectF rectF, boolean z) {
        float f;
        boolean z2 = z;
        if (androidx.compose.a.a.ai.b(i, 0)) {
            if (z) {
                z2 = true;
            }
            f = rectF.left;
            return f;
        }
        if (!androidx.compose.a.a.ai.b(i, 1) || !z2) {
            f = rectF.right;
            return f;
        }
        f = rectF.left;
        return f;
    }

    public static /* synthetic */ int as(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int at(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void au(boolean z, String str, Object[] objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static /* synthetic */ ct av(gk gkVar, ct ctVar) {
        if (ctVar.h == null) {
            gk gkVar2 = gk.a;
        }
        com.google.protobuf.bc builder = ctVar.toBuilder();
        builder.copyOnWrite();
        ct ctVar2 = builder.instance;
        gkVar.getClass();
        ctVar2.h = gkVar;
        ctVar2.b |= 32;
        return builder.build();
    }

    public static /* synthetic */ String aw(Context context, String str) {
        return !TextUtils.isEmpty(str) ? cl.V(str, context.getResources().getString(2132088329)) ? "https://www.gstatic.com/images/icons/material/system/2x/home_googblue_24dp.png" : str.equalsIgnoreCase(context.getResources().getString(2132088343)) ? "https://www.gstatic.com/images/icons/material/system/2x/business_googblue_24dp.png" : str.equalsIgnoreCase(context.getResources().getString(2132088330)) ? "https://www.gstatic.com/images/icons/material/system/2x/smartphone_googblue_24dp.png" : "https://www.gstatic.com/images/icons/material/system/2x/phone_googblue_24dp.png" : "https://www.gstatic.com/images/icons/material/system/2x/phone_googblue_24dp.png";
    }

    public static /* synthetic */ boolean ax(String str, com.google.g.e.i.mp mpVar) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        com.google.g.e.i.c cVar = mpVar.g;
        com.google.g.e.i.c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = com.google.g.e.i.c.a;
        }
        com.google.g.e.i.b bVar = cVar2.b;
        com.google.g.e.i.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = com.google.g.e.i.b.a;
        }
        return bVar2.b.equals(str);
    }

    public static /* synthetic */ cu ay(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        ba createBuilder = com.google.g.e.c.c.cd.a.createBuilder();
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            createBuilder.copyOnWrite();
            com.google.g.e.c.c.cd cdVar = createBuilder.instance;
            cdVar.b |= 1;
            cdVar.c = defaultSmsPackage;
        } else {
            String uri = intent.toUri(0);
            createBuilder.copyOnWrite();
            com.google.g.e.c.c.cd cdVar2 = createBuilder.instance;
            uri.getClass();
            cdVar2.b |= 64;
            cdVar2.i = uri;
        }
        ba createBuilder2 = cu.a.createBuilder();
        createBuilder2.copyOnWrite();
        cu cuVar = createBuilder2.instance;
        com.google.g.e.c.c.cd build = createBuilder.build();
        build.getClass();
        cuVar.d = build;
        cuVar.c = 1;
        return createBuilder2.build();
    }

    public static /* synthetic */ boolean az(il ilVar) {
        if (ilVar.e.equals("location_picker")) {
            return ((ilVar.c == 7 ? (io) ilVar.d : io.a).b & 1) != 0;
        }
        return false;
    }

    public static /* synthetic */ bv b(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? bv.a : bv.c : bv.b;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            default:
                return 0;
        }
    }

    public static /* synthetic */ cn d(Object obj) {
        List list = (List) obj;
        ((com.google.android.apps.gsa.shared.logger.b.h) list.get(1)).b(com.google.android.apps.gsa.shared.logger.b.w.SEARCH_NETWORK_REQUEST_SENT);
        return c.b;
    }

    public static /* synthetic */ com.google.bz.c.a.b.b e(String str) {
        ba createBuilder = com.google.bz.c.a.b.b.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.bz.c.a.b.b bVar = createBuilder.instance;
        bVar.b |= 1;
        bVar.c = "general_error";
        createBuilder.copyOnWrite();
        com.google.bz.c.a.b.b bVar2 = createBuilder.instance;
        str.getClass();
        bVar2.b |= 2;
        bVar2.d = str;
        return createBuilder.build();
    }

    public static /* synthetic */ boolean f(cq cqVar) {
        return cqVar.c.size() > 0 && (((eg) cqVar.c.get(0)).b & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[Catch: ce -> 0x0184, TryCatch #0 {ce -> 0x0184, blocks: (B:12:0x0011, B:14:0x006d, B:16:0x007e, B:18:0x00a4, B:22:0x00d3, B:24:0x00d9, B:26:0x0102, B:28:0x010d, B:31:0x0115, B:34:0x012e, B:36:0x00b4, B:38:0x00bb, B:39:0x00c3, B:41:0x00ca, B:43:0x014e), top: B:11:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e A[Catch: ce -> 0x0184, TRY_ENTER, TryCatch #0 {ce -> 0x0184, blocks: (B:12:0x0011, B:14:0x006d, B:16:0x007e, B:18:0x00a4, B:22:0x00d3, B:24:0x00d9, B:26:0x0102, B:28:0x010d, B:31:0x0115, B:34:0x012e, B:36:0x00b4, B:38:0x00bb, B:39:0x00c3, B:41:0x00ca, B:43:0x014e), top: B:11:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.google.android.ssb.b g(java.lang.String r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.g(java.lang.String, android.os.Bundle):com.google.android.ssb.b");
    }

    public static /* synthetic */ int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int i(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String j(ft ftVar) {
        cu cuVar = ftVar.h;
        cu cuVar2 = cuVar;
        if (cuVar == null) {
            cuVar2 = cu.a;
        }
        gi giVar = ftVar.f;
        gi giVar2 = giVar;
        if (giVar == null) {
            giVar2 = gi.a;
        }
        String replace = (giVar2.c == 2 ? (String) giVar2.d : "").replace("+", "");
        gi giVar3 = ftVar.f;
        gi giVar4 = giVar3;
        if (giVar3 == null) {
            giVar4 = gi.a;
        }
        if ((giVar4.c == 6 ? (String) giVar4.d : "").isEmpty()) {
            if ((cuVar2.c == 1 ? (com.google.g.e.c.c.cd) cuVar2.d : com.google.g.e.c.c.cd.a).l.isEmpty()) {
                return (!cl.V("com.whatsapp", (cuVar2.c == 1 ? (com.google.g.e.c.c.cd) cuVar2.d : com.google.g.e.c.c.cd.a).c) || TextUtils.isEmpty(replace)) ? replace : String.format("%s@s.whatsapp.net", replace);
            }
            int i = cuVar2.c;
            String str = (i == 1 ? (com.google.g.e.c.c.cd) cuVar2.d : com.google.g.e.c.c.cd.a).l;
            return (i == 1 ? (com.google.g.e.c.c.cd) cuVar2.d : com.google.g.e.c.c.cd.a).l;
        }
        gi giVar5 = ftVar.f;
        gi giVar6 = giVar5 == null ? gi.a : giVar5;
        if (giVar6.c == 6) {
        }
        gi giVar7 = giVar5;
        if (giVar5 == null) {
            giVar7 = gi.a;
        }
        return giVar7.c == 6 ? (String) giVar7.d : "";
    }

    public static /* synthetic */ cn k(Object obj) {
        List list = (List) obj;
        return ((com.google.android.apps.gsa.search.core.ae.bd.a) list.get(0)).a(new com.google.cj.h.a.s((com.google.cj.h.a.c) list.get(2), (com.google.cj.g.b) list.get(1)));
    }

    public static /* synthetic */ cn l(Object obj) {
        com.google.android.apps.gsa.search.core.l.l lVar = (aj) obj;
        return lVar instanceof com.google.android.apps.gsa.search.core.l.l ? lVar.b.a : dl.n(com.google.common.base.a.a);
    }

    public static /* synthetic */ cn m(Object obj) {
        List list = (List) obj;
        g gVar = (g) list.get(1);
        return dl.n(gVar);
    }

    public static /* synthetic */ cn n(Object obj) {
        List list = (List) obj;
        return ((com.google.android.apps.gsa.search.core.m.i) list.get(0)).e(dl.n((Query) list.get(1))).c();
    }

    public static /* synthetic */ boolean o(Object obj) {
        com.google.speech.g.at atVar = (com.google.speech.g.at) obj;
        bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.speech.g.b.b);
        atVar.d(bgVar);
        return ((bd) atVar).br.o(bgVar.d);
    }

    public static /* synthetic */ void p(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    public static /* synthetic */ cn q(Object obj) {
        ba createBuilder = au.a.createBuilder();
        String b = com.google.android.libraries.search.t.k.a.b(((Long) obj).longValue());
        createBuilder.copyOnWrite();
        au auVar = createBuilder.instance;
        b.getClass();
        auVar.c |= 1;
        auVar.d = b;
        return dl.n(new com.google.android.apps.gsa.x.c.g.h(at.k(createBuilder.build()), au.b));
    }

    public static /* synthetic */ cn r(Object obj) {
        int bc;
        List list = (List) obj;
        Query query = (Query) list.get(1);
        ba createBuilder = com.google.speech.k.a.r.a.createBuilder();
        if (query.ba("android.opa.extra.VOICE_SEARCH_TTS_ENCODING") && (bc = a.bc(query.a("android.opa.extra.VOICE_SEARCH_TTS_ENCODING"))) != 0) {
            createBuilder.copyOnWrite();
            com.google.speech.k.a.r rVar = createBuilder.instance;
            rVar.j = bc;
            rVar.c |= 256;
        }
        if (query.ba("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ")) {
            int a2 = query.a("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ");
            createBuilder.copyOnWrite();
            com.google.speech.k.a.r rVar2 = createBuilder.instance;
            rVar2.c |= 32768;
            rVar2.p = a2;
        }
        return dl.n(new com.google.android.apps.gsa.x.c.g.h(at.k(createBuilder.build()), com.google.speech.k.a.r.b));
    }

    public static /* synthetic */ com.google.g.e.i.c.d s(String str) {
        ba createBuilder = com.google.g.e.i.c.d.a.createBuilder();
        str.getClass();
        createBuilder.copyOnWrite();
        com.google.g.e.i.c.d dVar = createBuilder.instance;
        dVar.b |= 4;
        dVar.c = str;
        return createBuilder.build();
    }

    public static /* synthetic */ com.google.g.aq.h t(com.google.g.aq.p pVar) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.g.aq.h.b);
        pVar.d(bgVar);
        Object l = ((bd) pVar).br.l(bgVar.d);
        return (com.google.g.aq.h) (l == null ? bgVar.b : bgVar.c(l));
    }

    public static /* synthetic */ com.google.g.aq.q u(com.google.g.aq.p pVar) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(com.google.g.aq.q.b);
        pVar.d(bgVar);
        Object l = ((bd) pVar).br.l(bgVar.d);
        return (com.google.g.aq.q) (l == null ? bgVar.b : bgVar.c(l));
    }

    public static /* synthetic */ void v(com.google.knowledge.b.e eVar, String str, String str2, MessageLite messageLite) {
        ba createBuilder = ej.a.createBuilder();
        ba createBuilder2 = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ej ejVar = createBuilder.instance;
        ejVar.b |= 1;
        ejVar.c = str;
        createBuilder2.copyOnWrite();
        ei eiVar = createBuilder2.instance;
        eiVar.b |= 1;
        eiVar.c = str2;
        com.google.protobuf.v byteString = messageLite.toByteString();
        createBuilder2.copyOnWrite();
        ei eiVar2 = createBuilder2.instance;
        byteString.getClass();
        eiVar2.b |= 2;
        eiVar2.d = byteString;
        createBuilder.copyOnWrite();
        ej ejVar2 = createBuilder.instance;
        ei build = createBuilder2.build();
        build.getClass();
        ejVar2.d = build;
        ejVar2.b |= 2;
        ce ceVar = eVar.instance.o;
        ce ceVar2 = ceVar;
        if (ceVar == null) {
            ceVar2 = ce.a;
        }
        cd builder = ceVar2.toBuilder();
        builder.w(createBuilder);
        eVar.copyOnWrite();
        com.google.knowledge.b.f fVar = eVar.instance;
        ce build2 = builder.build();
        build2.getClass();
        fVar.o = build2;
        fVar.b |= 262144;
    }

    public static /* synthetic */ boolean w(ej ejVar, String str, String str2) {
        if (!str.equals(ejVar.c)) {
            return false;
        }
        ei eiVar = ejVar.d;
        ei eiVar2 = eiVar;
        if (eiVar == null) {
            eiVar2 = ei.a;
        }
        return str2.equals(eiVar2.c);
    }

    public static /* synthetic */ boolean x(Object obj) {
        bf bfVar = ((x) obj).d;
        bf bfVar2 = bfVar;
        if (bfVar == null) {
            bfVar2 = bf.a;
        }
        ay a2 = ay.a(bfVar2.n);
        ay ayVar = a2;
        if (a2 == null) {
            ayVar = ay.a;
        }
        return com.google.android.apps.gsa.smartspace.c.f(ayVar);
    }

    public static /* synthetic */ String y(com.google.g.q.b.az azVar) {
        int i = azVar.d;
        return (i == 11 ? (aw) azVar.e : i == 10 ? (aw) azVar.e : aw.a).c;
    }

    public static /* synthetic */ boolean z(com.google.g.q.b.az azVar) {
        return (azVar.n.isEmpty() || (((ax) azVar.n.get(0)).b & 4) == 0) ? false : true;
    }
}
