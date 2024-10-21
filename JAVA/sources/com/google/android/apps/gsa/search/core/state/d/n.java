package com.google.android.apps.gsa.search.core.state.d;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.service.ay;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.d.b.z;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.o.or;
import com.google.protobuf.ba;
import com.google.protobuf.bc;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/n.class */
public final class n extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1290a;

    public n(e.a aVar, e.a aVar2) {
        super(aVar, 23);
        this.f1290a = aVar2;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.EXTERNAL_VOICE_ASSIST};
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        ab abVar = e.a;
        com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
        com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
        if (a2 == null) {
            acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
        }
        if (acVar == com.google.android.apps.gsa.search.shared.service.c.ac.EXTERNAL_VOICE_ASSIST && clientEventData.d(Query.class)) {
            Query query = (Query) clientEventData.b(Query.class);
            ba createBuilder = com.google.android.apps.gsa.search.shared.service.d.b.y.a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.y yVar = createBuilder.instance;
            yVar.b |= 2;
            yVar.d = 3;
            or orVar = or.A;
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.y yVar2 = createBuilder.instance;
            yVar2.f = orVar.as;
            yVar2.b |= 8;
            String aR = query.aR();
            String str = aR;
            if (TextUtils.isEmpty(aR)) {
                str = com.google.android.libraries.search.t.h.j.e.a();
            }
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.y yVar3 = createBuilder.instance;
            str.getClass();
            yVar3.b |= 1;
            yVar3.c = str;
            boolean df = query.df();
            createBuilder.copyOnWrite();
            com.google.android.apps.gsa.search.shared.service.d.b.y yVar4 = createBuilder.instance;
            yVar4.b |= 16;
            yVar4.g = df;
            com.google.android.apps.gsa.search.shared.service.d.b.y build = createBuilder.build();
            bc createBuilder2 = com.google.android.apps.gsa.search.shared.service.d.b.u.f1346a.createBuilder();
            createBuilder2.w(z.a, build);
            ((ay) this.f1290a.a()).j("search", createBuilder2.build());
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
    }
}
