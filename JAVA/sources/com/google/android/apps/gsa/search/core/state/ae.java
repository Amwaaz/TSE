package com.google.android.apps.gsa.search.core.state;

import e.a;
import java.util.BitSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ae.class */
public abstract class ae extends cq {
    public static final cc y;
    public static final cc z = aj(0, 23);
    public static final cc A = aj(50, 76);

    static {
        BitSet bitSet = new BitSet(250);
        bitSet.set(0, 24);
        bitSet.set(50, 77);
        y = cb.a(bitSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ae(a aVar, int i) {
        super(aVar, i, 0, 76);
    }

    public static cc ah(int... iArr) {
        return cq.ak(0, 76, iArr);
    }
}
