package com.google.android.apps.gsa.nga.engine.ac.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.engine.ac.f;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.engine.ui.e.c.d;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.cv;
import com.google.android.apps.gsa.nga.shared.q.c.cw;
import com.google.android.apps.gsa.opa.f.b;
import com.google.android.apps.gsa.opa.q;
import com.google.android.apps.gsa.search.shared.g.e;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.k.g;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.t.h.j;
import com.google.common.util.concurrent.dl;
import com.google.g.e.i.ce;
import com.google.g.q.b.cq;
import com.google.g.q.b.cr;
import com.google.g.q.b.cs;
import com.google.protobuf.bc;
import com.google.speech.recognizer.a.l;
import com.google.speech.recognizer.a.m;
import com.google.speech.recognizer.a.s;
import com.google.speech.recognizer.a.u;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/bj.class */
public final class bj implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f393a = com.google.common.f.a.d.j();
    public final h b;
    public final h c;
    public final ba d;
    public final z e;
    public final av f;
    public final ab g;
    public final com.google.android.apps.gsa.shared.util.q.a h;
    public final c i;
    public n j;
    public final af k;
    public aa l = new aa(dl.n(com.google.android.apps.gsa.v.c.f1836a));
    private final Context m;
    private final e.a n;
    private final t o;
    private final com.google.android.apps.gsa.nga.engine.ar.b.d p;
    private final com.google.android.apps.gsa.nga.shared.aj.a.c q;

    public bj(Context context, h hVar, h hVar2, ba baVar, z zVar, e.a aVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar, af afVar, av avVar, ab abVar, com.google.android.apps.gsa.shared.util.q.a aVar2, com.google.android.apps.gsa.nga.shared.aj.a.c cVar, t tVar, c cVar2) {
        this.m = context;
        this.b = hVar;
        this.c = hVar2;
        this.d = baVar;
        this.e = zVar;
        this.n = aVar;
        this.p = dVar;
        this.k = afVar;
        this.f = avVar;
        this.g = abVar;
        this.h = aVar2;
        this.q = cVar;
        this.o = tVar;
        this.i = cVar2;
    }

    public static String a(Bundle bundle) {
        return bundle.getString("query-id", "");
    }

    public static void l(com.google.android.apps.gsa.nga.shared.s3.aidl.d dVar) {
        try {
            dVar.b();
        } catch (RemoteException e) {
        }
    }

    public final void b(f fVar) {
        String str;
        com.google.android.apps.gsa.assistant.shared.k.c cVar;
        QueryTriggerType queryTriggerType;
        String str2;
        ce ceVar;
        Bundle bundle;
        f fVar2 = this.d.g;
        if (fVar2 != null) {
            if (fVar2.e.equals(fVar.e)) {
                return;
            }
        }
        this.l.a();
        this.l = new aa(this.b.e("[NGA] GraphStartedLatch", Duration.ofMillis(Duration.ofSeconds(this.h.d(eu.kn)).toMillis()), new q()));
        ce ceVar2 = (ce) ((com.google.android.apps.gsa.nga.engine.ac.a) this.n.a()).a(fVar.c, fVar.d).orElse(ce.a);
        av avVar = this.f;
        avVar.f390a.b(new cw((byte[]) null));
        if (avVar.f390a.a() != null) {
            x xVar = avVar.f390a;
            String a2 = xVar.a();
            if (a2 == null) {
                throw new NullPointerException("Null deviceRamGb");
            }
            xVar.b(new cv("NGA_OPA_HANDOVER_QUERIES_DEVICE_TIER", a2));
        }
        aj a3 = this.p.a();
        com.google.android.apps.gsa.opa.f.a aVar = new com.google.android.apps.gsa.opa.f.a();
        aVar.a(Bundle.EMPTY);
        aVar.b(false);
        aVar.c(false);
        String str3 = fVar.e;
        if (str3 == null) {
            throw new NullPointerException("Null queryId");
        }
        aVar.a = str3;
        aVar.c = fVar.a;
        aVar.m = (byte) (aVar.m | 1);
        QueryTriggerType queryTriggerType2 = fVar.b;
        if (queryTriggerType2 == null) {
            throw new NullPointerException("Null queryTriggerType");
        }
        aVar.d = queryTriggerType2;
        com.google.android.apps.gsa.assistant.shared.k.c cVar2 = (com.google.android.apps.gsa.assistant.shared.k.c) a3.e().orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN);
        if (cVar2 == null) {
            throw new NullPointerException("Null opaTriggerType");
        }
        aVar.b = cVar2;
        String str4 = (String) a3.d().orElse(j.as.a());
        if (str4 == null) {
            throw new NullPointerException("Null source");
        }
        aVar.e = str4;
        if (ceVar2 == null) {
            throw new NullPointerException("Null conversationParams");
        }
        aVar.f = ceVar2;
        aVar.a(fVar.f);
        aVar.i = fVar.h;
        aVar.m = (byte) (aVar.m | 2);
        Optional optional = fVar.i;
        if (optional == null) {
            throw new NullPointerException("Null clientQueryParams");
        }
        aVar.j = optional;
        aVar.b(fVar.j);
        aVar.c(fVar.k);
        fVar.g.ifPresent(new w(aVar, 4));
        b a4 = this.e.a();
        if (aVar.m == 15 && (str = aVar.a) != null && (cVar = aVar.b) != null && (queryTriggerType = aVar.d) != null && (str2 = aVar.e) != null && (ceVar = aVar.f) != null && (bundle = aVar.h) != null) {
            a4.d(new com.google.android.apps.gsa.opa.f.c(str, cVar, aVar.c, queryTriggerType, str2, ceVar, aVar.g, bundle, aVar.i, aVar.j, aVar.k, aVar.l));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.a == null) {
            sb.append(" queryId");
        }
        if (aVar.b == null) {
            sb.append(" opaTriggerType");
        }
        if ((aVar.m & 1) == 0) {
            sb.append(" nonVoice");
        }
        if (aVar.d == null) {
            sb.append(" queryTriggerType");
        }
        if (aVar.e == null) {
            sb.append(" source");
        }
        if (aVar.f == null) {
            sb.append(" conversationParams");
        }
        if (aVar.h == null) {
            sb.append(" ngaQueryExtras");
        }
        if ((aVar.m & 2) == 0) {
            sb.append(" refreshScreenContext");
        }
        if ((aVar.m & 4) == 0) {
            sb.append(" queryTriggeredByBluetoothHeadset");
        }
        if ((aVar.m & 8) == 0) {
            sb.append(" queryTriggeredByWiredHeadset");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void c() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void d() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void e(com.google.android.apps.gsa.nga.api.a.ab abVar) {
        this.b.n("[NGA] OpaCloudHandover.onNgaToOpaCardStateChanged", new ac(this, abVar, 6, (byte[]) null));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void f() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final void g() {
        if (this.h.i(br.Q)) {
            this.q.d(g.d(this.h));
            return;
        }
        if (this.h.i(br.z)) {
            this.q.d(g.b(this.m));
            return;
        }
        if (this.h.i(br.t)) {
            this.q.d(g.a(this.m));
            return;
        }
        if (!this.h.i(az.dX)) {
            if (this.h.i(az.dY)) {
                this.b.n("[NGA] OpaCloudHandover.launchZeroState", new ap(this, 4));
                return;
            }
            t tVar = this.o;
            if (tVar.f396a.b()) {
                tVar.c.d(q.a(2, (HotwordResultMetadata) null, (Uri) null, 0, 0, 2));
                return;
            }
            Context context = tVar.b;
            com.google.android.apps.gsa.search.shared.g.d dVar = new com.google.android.apps.gsa.search.shared.g.d();
            dVar.B = true;
            tVar.c.d(e.t(context, dVar.a(), 268468224));
            return;
        }
        Context context2 = this.m;
        bc createBuilder = cs.a.createBuilder();
        createBuilder.copyOnWrite();
        cs csVar = createBuilder.instance;
        csVar.e = 1;
        csVar.b = 1 | csVar.b;
        cq cqVar = cq.f;
        createBuilder.copyOnWrite();
        cs csVar2 = createBuilder.instance;
        csVar2.h = cqVar.r;
        csVar2.b |= 16;
        cr crVar = cr.F;
        createBuilder.copyOnWrite();
        cs csVar3 = createBuilder.instance;
        csVar3.i = crVar.aa;
        csVar3.b |= 32;
        cs build = createBuilder.build();
        com.google.android.apps.gsa.shared.util.q.a aVar = this.h;
        String c = com.google.android.apps.gsa.search.shared.g.h.c(com.google.android.apps.gsa.search.shared.g.h.d(build));
        boolean z = false;
        if (build != null) {
            cr crVar2 = cr.F;
            cr a2 = cr.a(build.i);
            cr crVar3 = a2;
            if (a2 == null) {
                crVar3 = cr.a;
            }
            z = crVar2.equals(crVar3) ? false : aVar.i(az.fw);
        }
        this.q.d(com.google.android.apps.gsa.search.shared.g.h.a(context2, c, z, (com.google.common.o.o.p) null));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void h() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void i() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void j() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.d
    public final /* synthetic */ void k() {
    }

    final void m(int i) {
        com.google.common.f.a.d dVar = f393a;
        com.google.common.f.a.a d = dVar.d();
        d.ak(3702);
        d.p("#cancel()");
        f fVar = this.d.g;
        if (fVar != null) {
            com.google.common.f.a.a d2 = dVar.d();
            d2.ak(3703);
            d2.s("Cancelling [requestId=%s]", fVar.e);
            this.e.a().r(fVar.e, i);
        }
        this.d.b.b(com.google.android.apps.gsa.nga.engine.ac.c.IDLE);
    }

    public final void n(bc bcVar, f fVar) {
        if (this.h.i(eu.cd) && !fVar.l.isEmpty()) {
            Boolean bool = (Boolean) fVar.l.get();
            boolean booleanValue = bool.booleanValue();
            s sVar = bcVar.instance;
            if ((sVar.b & 8) != 0) {
                m mVar = sVar.f;
                m mVar2 = mVar;
                if (mVar == null) {
                    mVar2 = m.a;
                }
                l createBuilder = m.a.createBuilder(mVar2);
                createBuilder.copyOnWrite();
                m mVar3 = createBuilder.instance;
                mVar3.b |= 65536;
                mVar3.i = booleanValue;
                bcVar.copyOnWrite();
                s sVar2 = bcVar.instance;
                m build = createBuilder.build();
                build.getClass();
                sVar2.f = build;
                sVar2.b |= 8;
            }
            s sVar3 = bcVar.instance;
            if ((sVar3.b & 32) != 0) {
                u uVar = sVar3.h;
                u uVar2 = uVar;
                if (uVar == null) {
                    uVar2 = u.a;
                }
                bc createBuilder2 = u.a.createBuilder(uVar2);
                createBuilder2.copyOnWrite();
                u uVar3 = createBuilder2.instance;
                uVar3.b |= 512;
                uVar3.g = booleanValue;
                bcVar.copyOnWrite();
                s sVar4 = bcVar.instance;
                u build2 = createBuilder2.build();
                build2.getClass();
                sVar4.h = build2;
                sVar4.b |= 32;
            }
            s sVar5 = bcVar.instance;
            if ((sVar5.b & 4) != 0) {
                u uVar4 = sVar5.e;
                u uVar5 = uVar4;
                if (uVar4 == null) {
                    uVar5 = u.a;
                }
                bc createBuilder3 = u.a.createBuilder(uVar5);
                createBuilder3.copyOnWrite();
                u uVar6 = createBuilder3.instance;
                uVar6.b |= 512;
                uVar6.g = booleanValue;
                bcVar.copyOnWrite();
                s sVar6 = bcVar.instance;
                u build3 = createBuilder3.build();
                build3.getClass();
                sVar6.e = build3;
                sVar6.b |= 4;
            }
            com.google.common.f.a.a d = f393a.d();
            d.ak(3701);
            d.s("SODA recognition event updated with hotword validation signal (top_hypothesis_contains_hotword: %b)", bool);
        }
    }
}
