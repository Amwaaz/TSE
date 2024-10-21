package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.state.g.d;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.ssb.b;
import com.google.knowledge.b.c;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.bi;
import e.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/j.class */
public final class j extends ae implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public ClientConfig f1303a;
    public long b;
    public boolean c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    private Bundle h;
    private b i;
    private final BitFlags j;
    private List k;
    private boolean l;
    private CardDecision m;
    private final com.google.android.apps.gsa.search.core.ae.bk.a n;
    private final a o;
    private final com.google.android.apps.gsa.search.core.state.d.q p;

    public j(a aVar, a aVar2, a aVar3, a aVar4, com.google.android.apps.gsa.search.core.ae.bk.a aVar5, com.google.android.apps.gsa.search.core.state.d.q qVar, a aVar6, x xVar) {
        super(aVar6, 55);
        this.f1303a = ClientConfig.f1327a;
        this.b = 0L;
        this.j = new BitFlags(getClass(), "FLAG_", 0L);
        this.l = false;
        this.d = aVar;
        this.e = aVar3;
        this.f = aVar4;
        this.g = aVar2;
        this.n = aVar5;
        this.p = qVar;
        this.o = aVar6;
        xVar.addObserver(this);
    }

    private final void i(Bundle bundle) {
        if (bundle != this.h) {
            this.h = bundle;
            b g = bundle == null ? null : a.b.g(bundle.getString("android.intent.extra.ASSIST_PACKAGE"), bundle.getBundle("android.intent.extra.ASSIST_CONTEXT"));
            this.i = g;
            this.n.h(g);
            e();
            an();
        }
    }

    public final String a() {
        b bVar = this.i;
        if (bVar == null) {
            return null;
        }
        com.google.knowledge.b.t tVar = bVar.c;
        com.google.knowledge.b.t tVar2 = tVar;
        if (tVar == null) {
            tVar2 = com.google.knowledge.b.t.a;
        }
        if ((tVar2.b & 16) == 0) {
            return null;
        }
        com.google.knowledge.b.t tVar3 = bVar.c;
        com.google.knowledge.b.t tVar4 = tVar3;
        if (tVar3 == null) {
            tVar4 = com.google.knowledge.b.t.a;
        }
        c cVar = tVar4.e;
        c cVar2 = cVar;
        if (cVar == null) {
            cVar2 = c.a;
        }
        return cVar2.c;
    }

    public final void b(f fVar, boolean z) {
        if (fVar.T() && this.f1303a.w()) {
            List i = fVar.i();
            VoiceAction f = fVar.f();
            CardDecision g = fVar.g();
            boolean z2 = this.l;
            boolean z3 = false;
            if (f != null) {
                z3 = false;
                if (f.v()) {
                    z3 = true;
                }
            }
            this.l = z3;
            if (z || !com.google.android.apps.gsa.shared.util.ao.l(this.k, i) || !h.a.a.p.b.a.f.f(this.m, g) || z2 != this.l) {
                this.k = i;
                this.m = g;
                Query query = fVar.h;
                ActionData actionData = fVar.i;
                String str = actionData != null ? actionData.h : null;
                Query query2 = query;
                if (str != null) {
                    query2 = query.aa(str);
                }
                this.n.k(query2, i, g, i != null ? i.indexOf(f) : -1);
            }
        }
        if (this.f1303a.v() && !fVar.V() && fVar.g.c(8L, 0L)) {
            this.n.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.b != 0;
    }

    public final boolean e() {
        if (this.i == null || this.f1303a.g() || !((bk) this.f.a()).t) {
            return false;
        }
        this.h = null;
        this.i = null;
        this.n.h(null);
        return true;
    }

    public final boolean f(f fVar, s sVar, bk bkVar, boolean z) {
        Query query = bkVar.m;
        if (this.f1303a.p() && z && ((!query.cE() || !query.bJ() || !this.f1303a.q()) && (sVar.b() || (query.cP() && (fVar.I() || !fVar.T() || fVar.V() || !fVar.J(query)))))) {
            if (!this.j.c(0L, 1L)) {
                return false;
            }
            this.n.j(true);
            return true;
        }
        if (!this.j.c(1L, 0L)) {
            return false;
        }
        this.n.j(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
        com.google.protobuf.bg bgVar = bi.-$$Nest$smcheckIsLite(d.b);
        vVar.d(bgVar);
        Object l = ((bd) vVar).br.l(bgVar.d);
        d dVar = (d) (l == null ? bgVar.b : bgVar.c(l));
        Bundle bundle = null;
        if (i == 1) {
            bundle = null;
            if ((dVar.c & 1) != 0) {
                com.google.protobuf.v vVar2 = dVar.d;
                Parcelable.Creator creator = Bundle.CREATOR;
                com.google.common.f.j jVar = com.google.android.apps.gsa.shared.util.ar.f1501a;
                Bundle bundle2 = (Bundle) com.google.android.apps.gsa.shared.util.ar.e(vVar2.E(), creator);
                bundle = bundle2;
                if (bundle2 != null) {
                    bundle2.setClassLoader(j.class.getClassLoader());
                    bundle = bundle2;
                }
            }
        }
        i(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hK(bc bcVar) {
        com.google.protobuf.ba createBuilder = d.a.createBuilder();
        Bundle bundle = this.h;
        if (bundle != null) {
            com.google.protobuf.v f = com.google.android.apps.gsa.shared.util.ar.f(bundle);
            createBuilder.copyOnWrite();
            d dVar = createBuilder.instance;
            f.getClass();
            dVar.c |= 1;
            dVar.d = f;
        }
        bcVar.w(d.b, createBuilder.build());
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActiveClientState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currentClientId", Long.valueOf(this.b));
        linkedHashMap.put("clientConfig", this.f1303a);
        linkedHashMap.put("hotwordDetectionEnabled", Boolean.valueOf(this.c));
        linkedHashMap.put("Flags", this.j.b());
        String a2 = a();
        String str = a2;
        if (a2 == null) {
            str = "NULL";
        }
        linkedHashMap.put("Assist Package", str);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.b((String) entry.getKey()).a(new com.google.android.apps.gsa.shared.util.b.d((Boolean) value, false));
            } else if (value instanceof Number) {
                fVar.b((String) entry.getKey()).a(new com.google.android.apps.gsa.shared.util.b.d((Number) value, false));
            } else {
                fVar.b((String) entry.getKey()).a(com.google.android.apps.gsa.shared.util.b.e.c(String.valueOf(value)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void u(Bundle bundle) {
        i(bundle);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        com.google.android.libraries.gsa.h.i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        com.google.android.apps.gsa.search.core.state.d.q qVar = this.p;
        String str = qVar.f1292a.e;
        String str2 = qVar.e.b;
        boolean z = true;
        boolean z2 = this.b != 0 && str.equals("search");
        if (((l) this.g.a()).f1305a == 0 || !str2.equals("search")) {
            z = false;
        }
        if (z2 || z) {
            try {
                ((cp) this.o.a()).e();
            } finally {
                ((cp) this.o.a()).f();
            }
        }
    }
}
