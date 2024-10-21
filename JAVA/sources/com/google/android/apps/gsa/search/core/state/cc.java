package com.google.android.apps.gsa.search.core.state;

import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cc.class */
public final class cc {

    /* renamed from: a */
    public final BitSet f1260a;

    public cc(BitSet bitSet) {
        this.f1260a = bitSet;
    }

    public static cc a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet(250);
        bitSet2.or(bitSet);
        return new cc(bitSet2);
    }

    public final BitSet b() {
        BitSet bitSet = new BitSet(250);
        bitSet.or(this.f1260a);
        return bitSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cc) {
            return this.f1260a.equals(((cc) obj).f1260a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1260a});
    }

    public final String toString() {
        return this.f1260a.toString();
    }
}
