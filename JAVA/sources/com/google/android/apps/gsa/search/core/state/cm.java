package com.google.android.apps.gsa.search.core.state;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cm.class */
public final class cm extends cl {
    public final cc b;

    public cm(cd cdVar, cc ccVar) {
        super(cdVar);
        this.b = ccVar;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cl
    public final boolean a(int i) {
        cq.al(i);
        return this.b.f1260a.get(i);
    }

    public final String toString() {
        cd cdVar = this.f1266a;
        return "Event ".concat(String.valueOf(String.valueOf(cdVar != null ? cdVar.a(this.b.b()).toString() : this.b)));
    }
}
