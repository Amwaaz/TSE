package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.protobuf.bc;
import e.a;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cq.class */
public abstract class cq implements com.google.android.apps.gsa.shared.util.debug.a.g, ap {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f1268a = new String[0];
    private static final com.google.android.apps.gsa.search.shared.service.c.ac[] b = new com.google.android.apps.gsa.search.shared.service.c.ac[0];
    public final int F;
    public boolean G;
    private final a c;

    /* JADX INFO: Access modifiers changed from: protected */
    public cq(a aVar, int i, int i2, int i3) {
        new AtomicLong();
        am(i2, i3, i);
        this.F = i;
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static cc aj(int i, int i2) {
        BitSet bitSet = new BitSet(250);
        bitSet.set(i, i2 + 1);
        return cb.a(bitSet);
    }

    public static cc ak(int i, int i2, int... iArr) {
        BitSet bitSet = new BitSet(250);
        for (int i3 : iArr) {
            am(i, i2, i3);
            bitSet.set(i3);
        }
        return cb.a(bitSet);
    }

    public static void al(int i) {
        boolean z = false;
        if (i >= 0) {
            z = false;
            if (i <= 250) {
                z = true;
            }
        }
        androidx.compose.ui.l.f.e(z);
    }

    public static void am(int i, int i2, int i3) {
        boolean z = false;
        if (i <= i3) {
            z = false;
            if (i3 <= i2) {
                z = true;
            }
        }
        androidx.compose.ui.l.f.e(z);
    }

    public com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return b;
    }

    @Override // com.google.android.apps.gsa.search.core.state.ap
    public final int ai() {
        return this.F;
    }

    public void an() {
        this.G = true;
        ((com.google.android.apps.gsa.search.core.state.b.a) this.c.a()).n(this.F);
    }

    public void hF(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hG(Query query, Bundle bundle) {
    }

    public void hH() {
    }

    public String[] hI() {
        return f1268a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hJ(com.google.android.apps.gsa.search.shared.service.d.b.v vVar, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hK(bc bcVar) {
    }

    public void hL(long j, ClientEventData clientEventData) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u(Bundle bundle) {
    }
}
