package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.gg;
import com.google.android.apps.gsa.search.shared.service.c.gh;
import com.google.android.apps.gsa.search.shared.service.c.gj;
import com.google.android.apps.gsa.search.shared.service.c.gk;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.concurrent.CancellationException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/f.class */
public class f extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1282a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.f");
    private final com.google.android.apps.gsa.search.core.ae.e.a b;
    private final com.google.android.libraries.gsa.h.h c;

    public f(e.a aVar, com.google.android.apps.gsa.search.core.ae.e.a aVar2, com.google.android.libraries.gsa.h.h hVar) {
        super(aVar, 8);
        this.b = aVar2;
        this.c = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.AMP_VIEWER_SUPPORT_REQUEST, com.google.android.apps.gsa.search.shared.service.c.ac.PRERENDER_AMP_DOCUMENT, com.google.android.apps.gsa.search.shared.service.c.ac.PRERENDER_AMP_VIEWER, com.google.android.apps.gsa.search.shared.service.c.ac.OPEN_AMP_DOCUMENT, com.google.android.apps.gsa.search.shared.service.c.ac.OPEN_AMP_VIEWER};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        cn d;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        switch (acVar.ordinal()) {
            case 39:
                com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
                bg bgVar = bi.-$$Nest$smcheckIsLite(gk.b);
                adVar.d(bgVar);
                if (!((bd) adVar).br.o(bgVar.d)) {
                    com.google.common.f.h f = f1282a.f();
                    f.ak(7923);
                    f.p("PRERENDER_AMP_VIEWER requires a PrerenderAmpViewerEventData proto.");
                    int i = com.google.android.apps.gsa.shared.util.b.h.a;
                    return;
                }
                com.google.android.apps.gsa.search.core.ae.e.a aVar = this.b;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
                bg bgVar2 = bi.-$$Nest$smcheckIsLite(gk.b);
                adVar2.d(bgVar2);
                Object l = ((bd) adVar2).br.l(bgVar2.d);
                d = aVar.d((gk) (l == null ? bgVar2.b : bgVar2.c(l)));
                break;
            case 40:
                com.google.android.apps.gsa.search.shared.service.c.ad adVar3 = clientEventData.f1328a;
                bg bgVar3 = bi.-$$Nest$smcheckIsLite(gh.b);
                adVar3.d(bgVar3);
                if (!((bd) adVar3).br.o(bgVar3.d)) {
                    com.google.common.f.h f2 = f1282a.f();
                    f2.ak(7925);
                    f2.p("OPEN_AMP_VIEWER requires an OpenAmpViewerEventData proto.");
                    int i2 = com.google.android.apps.gsa.shared.util.b.h.a;
                    return;
                }
                com.google.android.apps.gsa.search.core.ae.e.a aVar2 = this.b;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar4 = clientEventData.f1328a;
                bg bgVar4 = bi.-$$Nest$smcheckIsLite(gh.b);
                adVar4.d(bgVar4);
                Object l2 = ((bd) adVar4).br.l(bgVar4.d);
                d = aVar2.b((gh) (l2 == null ? bgVar4.b : bgVar4.c(l2)));
                break;
            case 41:
            case 42:
            default:
                com.google.common.f.h f3 = f1282a.f();
                f3.ak(7921);
                com.google.android.apps.gsa.search.shared.service.c.ac a3 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
                com.google.android.apps.gsa.search.shared.service.c.ac acVar2 = a3;
                if (a3 == null) {
                    acVar2 = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
                }
                f3.s("Unsupported event id: %s", acVar2);
                int i3 = com.google.android.apps.gsa.shared.util.b.h.a;
                return;
            case 43:
                com.google.android.apps.gsa.search.shared.service.c.ad adVar5 = clientEventData.f1328a;
                bg bgVar5 = bi.-$$Nest$smcheckIsLite(gj.b);
                adVar5.d(bgVar5);
                if (!((bd) adVar5).br.o(bgVar5.d)) {
                    com.google.common.f.h f4 = f1282a.f();
                    f4.ak(7922);
                    f4.p("PRERENDER_AMP_DOCUMENT requires a PrerenderAmpDocumentEventData proto.");
                    int i4 = com.google.android.apps.gsa.shared.util.b.h.a;
                    return;
                }
                com.google.android.apps.gsa.search.core.ae.e.a aVar3 = this.b;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar6 = clientEventData.f1328a;
                bg bgVar6 = bi.-$$Nest$smcheckIsLite(gj.b);
                adVar6.d(bgVar6);
                Object l3 = ((bd) adVar6).br.l(bgVar6.d);
                d = aVar3.c((gj) (l3 == null ? bgVar6.b : bgVar6.c(l3)));
                break;
            case 44:
                com.google.android.apps.gsa.search.shared.service.c.ad adVar7 = clientEventData.f1328a;
                bg bgVar7 = bi.-$$Nest$smcheckIsLite(gg.b);
                adVar7.d(bgVar7);
                if (!((bd) adVar7).br.o(bgVar7.d)) {
                    com.google.common.f.h f5 = f1282a.f();
                    f5.ak(7924);
                    f5.p("OPEN_AMP_DOCUMENT requires an OpenAmpDocumentEventData proto.");
                    int i5 = com.google.android.apps.gsa.shared.util.b.h.a;
                    return;
                }
                com.google.android.apps.gsa.search.core.ae.e.a aVar4 = this.b;
                com.google.android.apps.gsa.search.shared.service.c.ad adVar8 = clientEventData.f1328a;
                bg bgVar8 = bi.-$$Nest$smcheckIsLite(gg.b);
                adVar8.d(bgVar8);
                Object l4 = ((bd) adVar8).br.l(bgVar8.d);
                d = aVar4.a((gg) (l4 == null ? bgVar8.b : bgVar8.c(l4)));
                break;
            case 45:
                d = this.b.f(j);
                break;
        }
        com.google.android.apps.gsa.shared.util.c.ac a4 = new com.google.android.apps.gsa.shared.util.c.ae(d, this.c, "AmpState.handleGenericClientEvent").a(new e(1));
        a4.b(CancellationException.class, new e(0));
        a4.a(new e(2));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("AmpState");
    }
}
