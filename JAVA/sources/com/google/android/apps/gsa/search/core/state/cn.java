package com.google.android.apps.gsa.search.core.state;

import java.util.BitSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cn.class */
final class cn extends cl {
    public final BitSet b;

    public cn(cd cdVar, BitSet bitSet) {
        super(cdVar);
        this.b = bitSet;
    }

    @Override // com.google.android.apps.gsa.search.core.state.cl
    public final boolean a(int i) {
        cq.al(i);
        return this.b.get(i);
    }

    public final String toString() {
        cd cdVar = this.f1266a;
        return "Event ".concat(String.valueOf(String.valueOf(cdVar != null ? cdVar.a(this.b).toString() : this.b)));
    }
}
