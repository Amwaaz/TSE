package com.google.android.apps.gsa.nga.engine.ac.a;

import android.os.Bundle;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ac.b;
import com.google.android.apps.gsa.nga.engine.ac.d;
import com.google.android.apps.gsa.nga.engine.am.g;
import com.google.android.apps.gsa.nga.engine.ar.b.b.l;
import com.google.android.apps.gsa.nga.engine.ar.b.b.w;
import com.google.android.apps.gsa.nga.engine.ar.b.q;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.shared.n.e;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.al;
import com.google.android.apps.gsa.nga.shared.q.c.dm;
import com.google.android.apps.gsa.nga.shared.s3.a.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.t.h.j;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.bi;
import com.google.protobuf.ce;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/ao.class */
public final class ao extends com.google.android.apps.gsa.nga.engine.t.c implements d, com.google.android.apps.gsa.nga.engine.ak.v.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f388a = com.google.common.f.a.d.c("Opa2NgaEvent");
    public final h b;
    public final ba c;
    public final af d;
    public final com.google.android.apps.gsa.nga.engine.ac.a e;
    public final g f;
    public final e g;
    public final com.google.android.apps.gsa.nga.shared.n.c h;
    public final bj i;
    public final com.google.android.apps.gsa.shared.util.q.a j;
    public final ar k;
    public final com.google.android.apps.gsa.nga.shared.q.a.af l;
    public final com.google.android.apps.gsa.nga.engine.as.g m;
    public final com.google.android.apps.gsa.nga.engine.recognition.o.a.e n;
    public final q o;
    public final com.google.android.apps.gsa.nga.engine.am.d.e p;
    public final com.google.android.apps.gsa.nga.engine.ar.b.b.ah q;
    private final y r;
    private final com.google.android.apps.gsa.nga.engine.ak.v.a.e s;
    private final x t;

    public ao(h hVar, ba baVar, af afVar, com.google.android.apps.gsa.nga.engine.ac.a aVar, g gVar, k kVar, k kVar2, ar arVar, com.google.android.apps.gsa.nga.shared.q.a.af afVar2, bj bjVar, x xVar, com.google.android.apps.gsa.nga.engine.as.g gVar2, com.google.android.apps.gsa.nga.engine.recognition.o.a.e eVar, q qVar, com.google.android.apps.gsa.nga.engine.am.d.e eVar2, n nVar, y yVar, com.google.android.apps.gsa.nga.engine.ak.v.a.e eVar3, com.google.android.apps.gsa.nga.engine.ar.b.b.ah ahVar, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        super(nVar);
        this.b = hVar;
        this.c = baVar;
        this.d = afVar;
        this.e = aVar;
        this.r = yVar;
        this.s = eVar3;
        this.q = ahVar;
        this.j = aVar2;
        this.g = kVar.a(hVar, new com.google.android.apps.gsa.shared.util.c.d() { // from class: com.google.android.apps.gsa.nga.engine.ac.a.ah
            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                com.google.android.apps.gsa.nga.engine.ar.b.b.x xVar2 = (com.google.android.apps.gsa.nga.engine.ar.b.b.x) obj;
                xVar2.d.n("[NGA] OpaMicRequestListenerImpl.onOpaCloseMicRequest", new l(xVar2, (b) obj2, 5, (byte[]) null));
            }
        });
        this.h = kVar2.b(new BiFunction() { // from class: com.google.android.apps.gsa.nga.engine.ac.a.ai
            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                cn h;
                cn b;
                com.google.android.apps.gsa.nga.engine.ar.b.b.x xVar2 = (com.google.android.apps.gsa.nga.engine.ar.b.b.x) obj;
                com.google.android.apps.gsa.opa.f.a.n nVar2 = (com.google.android.apps.gsa.opa.f.a.n) obj2;
                int dh = a.a.dh(nVar2.c);
                int i = dh;
                if (dh == 0) {
                    i = 1;
                }
                int i2 = i - 1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        com.google.common.f.a.a e = com.google.android.apps.gsa.nga.engine.ar.b.b.x.a.e();
                        e.ak(4493);
                        int dh2 = a.a.dh(nVar2.c);
                        e.s("onOpaOpenMicRequest - ignoring unhandled open_mic_mode: %s", (dh2 == 0 || dh2 == 1) ? "UNKNOWN" : dh2 != 2 ? dh2 != 3 ? "VOICE_TYPING" : "MAGIC_MIC" : "DIALOG_FOLLOW_ON");
                        b = com.google.android.apps.gsa.v.c.b;
                    } else {
                        com.google.android.apps.gsa.assistant.shared.k.c a2 = com.google.android.apps.gsa.assistant.shared.k.c.a(nVar2.d);
                        com.google.android.apps.gsa.assistant.shared.k.c cVar = a2;
                        if (a2 == null) {
                            cVar = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
                        }
                        b = com.google.android.apps.gsa.v.c.b(xVar2.d.h("[NGA] OpaMicRequestListenerImpl.startHalfListening", new w(xVar2, cVar, 1)));
                    }
                } else if ((nVar2.b & 4) == 0 || xVar2.e.m(nVar2.e)) {
                    com.google.android.apps.gsa.assistant.shared.k.c a3 = com.google.android.apps.gsa.assistant.shared.k.c.a(nVar2.d);
                    com.google.android.apps.gsa.assistant.shared.k.c cVar2 = a3;
                    if (a3 == null) {
                        cVar2 = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
                    }
                    if (xVar2.f.i(eu.me)) {
                        int ordinal = cVar2.ordinal();
                        xVar2.h.b(cVar2, ordinal != 78 ? ordinal != 87 ? null : j.cg.a() : j.bd.a(), true);
                        h = ci.a;
                    } else {
                        h = xVar2.d.h("[NGA] OpaMicRequestListenerImpl.startFullListening", new w(xVar2, cVar2, 0));
                    }
                    b = com.google.android.apps.gsa.v.c.b(h);
                } else {
                    b = com.google.android.apps.gsa.v.c.b;
                }
                return b;
            }
        });
        this.f = gVar;
        this.k = arVar;
        this.l = afVar2;
        this.i = bjVar;
        this.t = xVar;
        this.m = gVar2;
        this.n = eVar;
        this.o = qVar;
        this.p = eVar2;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ac.d
    public final void a(Bundle bundle, com.google.android.apps.gsa.nga.shared.s3.aidl.d dVar) {
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        this.b.n("[NGA] onCloudFulfillmentStart", new am(this, bundle, dVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final /* synthetic */ void c() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ac.d
    public final void d(Bundle bundle, byte[] bArr) {
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            i parseFrom = bi.parseFrom(i.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            x xVar = this.t;
            int cz = a.a.cz(parseFrom.b);
            int i = cz;
            if (cz == 0) {
                i = 1;
            }
            xVar.b(new al(com.google.android.apps.gsa.nga.shared.s3.a.h.a(i)));
            this.b.n("[NGA] onCloudFulfillmentStop", new am(this, bundle, parseFrom, 0));
        } catch (ce e) {
            aus.f(f388a.e(), "Unable to parse StopReason", (char) 3665, e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void e() {
        if (this.d.a() != com.google.android.apps.gsa.nga.engine.ac.c.IDLE) {
            this.t.b(new dm((byte[]) null));
        }
        this.b.n("[NGA] onSearchProcessDied", new ap(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ac.d
    public final void f(byte[] bArr, Bundle bundle) {
        try {
            this.b.n("[NGA] onOpaToNgaEvent", new aj(this, bi.parseFrom(com.google.android.apps.gsa.opa.f.a.l.a, bArr, ExtensionRegistryLite.getGeneratedRegistry()), bundle));
        } catch (ce e) {
            aus.f(f388a.e(), "Unable to parse OpaToNgaEvent", (char) 3669, e);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.r.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        this.s.a(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.s.b(this);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "OpaToNgaEventHandler";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 31;
    }
}
