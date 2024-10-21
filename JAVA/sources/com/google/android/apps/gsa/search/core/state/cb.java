package com.google.android.apps.gsa.search.core.state;

import java.util.BitSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cb.class */
public final class cb {
    public static final cc a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet(250);
        bitSet2.or(bitSet);
        return new cc(bitSet2);
    }
}
