package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.h.h;
import com.google.common.o.hb;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ba.class */
public class ba extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1244a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.ba");
    public final a b;
    public final h c;
    public final a d;
    public Query e;
    public ActionData f;
    private final a g;
    private final com.google.android.apps.gsa.search.core.h.p h;
    private final com.google.android.apps.gsa.speech.o.g i;

    public ba(a aVar, a aVar2, a aVar3, com.google.android.apps.gsa.speech.o.g gVar, com.google.android.apps.gsa.search.core.h.p pVar, h hVar, a aVar4) {
        super(aVar, 56);
        this.g = aVar2;
        this.b = aVar3;
        this.i = gVar;
        this.e = Query.b;
        this.f = null;
        this.h = pVar;
        this.c = hVar;
        this.d = aVar4;
    }

    public final ActionData a(Query query) {
        if (i(query)) {
            return this.f;
        }
        return null;
    }

    public final void c(Query query, ActionData actionData) {
        com.google.common.f.am.d.getClass();
        bc createBuilder = hb.a.createBuilder();
        createBuilder.copyOnWrite();
        hb hbVar = createBuilder.instance;
        hbVar.b |= 2;
        hbVar.n = 191;
        String b = com.google.android.libraries.search.t.k.a.b(query.E);
        createBuilder.copyOnWrite();
        hb hbVar2 = createBuilder.instance;
        b.getClass();
        hbVar2.b |= 4;
        hbVar2.o = b;
        com.google.android.apps.gsa.shared.logger.k.g(createBuilder.build(), null, null, null);
        if (query.co(this.e)) {
            this.f = actionData;
            an();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(Query query) {
        if (query.bV() || !query.br() || ((int) this.h.i(en.T)) == 0) {
            return false;
        }
        return (((f) this.g.a()).J(query) || !bb.a(query, query.bJ() ? this.i.o() : this.i.u()) || query.bB()) ? false : true;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("PumpkinState");
        fVar.k(this.e);
        fVar.k(this.f);
    }

    public final boolean i(Query query) {
        return this.f != null && this.e.co(query);
    }

    public final String toString() {
        return "PumpkinState";
    }
}
