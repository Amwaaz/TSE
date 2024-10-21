package com.google.android.apps.gsa.nga.engine.m.f.a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.u.a;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.l;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.c.eh;
import com.google.android.apps.gsa.search.shared.service.c.ei;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.e.e;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.common.o.or;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ar;
import com.google.protobuf.ba;
import com.google.protobuf.bg;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.v;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/m/f/a/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d f624a = d.j();
    public final h b;
    public final e c;
    public final x d;

    public g(e eVar, h hVar, x xVar) {
        this.c = eVar;
        this.b = hVar;
        this.d = xVar;
    }

    public static ClientConfig a() {
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
        dVar.c = or.ah;
        dVar.d = "nga";
        return new ClientConfig(dVar);
    }

    public static ClientEventData b(ei eiVar) {
        ae aeVar = new ae(ac.NGA_CLIENT_EVENT);
        aeVar.e(eh.a, eiVar);
        return aeVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    public final cn c(aa aaVar, Optional optional) {
        ae aeVar = new ae(ac.NGA_CLIENT_EVENT);
        bg bgVar = eh.a;
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        aaVar.getClass();
        eiVar.c = aaVar;
        eiVar.b = 13;
        aeVar.e(bgVar, createBuilder.build());
        if (optional.isPresent()) {
            aeVar.f(optional.get());
        }
        return i.h(this.c.c(a(), aeVar.d(), hf.NGA_SERVICE_EVENT, 50000L), new c(), ay.a);
    }

    public final cn d(v vVar, ad adVar, boolean z) {
        ba createBuilder = aa.a.createBuilder();
        ba createBuilder2 = l.a.createBuilder();
        createBuilder2.copyOnWrite();
        l lVar = createBuilder2.instance;
        lVar.c = vVar.dl;
        lVar.b |= 1;
        createBuilder2.copyOnWrite();
        l lVar2 = createBuilder2.instance;
        adVar.getClass();
        lVar2.d = adVar;
        lVar2.b |= 2;
        createBuilder2.copyOnWrite();
        l lVar3 = createBuilder2.instance;
        lVar3.b |= 4;
        lVar3.e = z;
        createBuilder.copyOnWrite();
        aa aaVar = createBuilder.instance;
        l build = createBuilder2.build();
        build.getClass();
        aaVar.c = build;
        aaVar.b = 14;
        return c.b(c((aa) createBuilder.build(), Optional.empty()));
    }

    public final void e(a aVar, fl flVar) {
        this.d.b(new com.google.android.apps.gsa.nga.shared.q.c.ay((byte[]) null));
        ae aeVar = new ae(ac.NGA_CLIENT_EVENT);
        ar arVar = eh.a;
        ba createBuilder = ei.a.createBuilder();
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        aVar.getClass();
        eiVar.c = aVar;
        eiVar.b = 3;
        aeVar.e(arVar, createBuilder.build());
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("SCREENSHOTS", new ArrayList<>((Collection) flVar));
        aeVar.f(bundle);
        new com.google.android.apps.gsa.shared.util.c.ae(this.c.b(a(), aeVar.d(), 50000L), this.b, "[NGA] Send feedback request event to :search process.").b(new d(this)).a(new e(this));
    }
}
