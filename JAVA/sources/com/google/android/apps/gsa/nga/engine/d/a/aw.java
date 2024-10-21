package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.common.b.ha;
import com.google.common.b.nn;
import com.google.common.b.nr;
import j$.time.Duration;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/aw.class */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    public static final Duration f533a = Duration.ofDays(1);
    public final com.google.android.libraries.g.a b;
    private final AtomicReference c = new AtomicReference(new av(nn.a, nr.a, false));

    public aw(com.google.android.libraries.g.a aVar) {
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ha a() {
        return ((av) DesugarAtomicReference.updateAndGet(this.c, new q(this, 6))).f532a.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ha haVar) {
        DesugarAtomicReference.getAndUpdate(this.c, new aq(this, haVar));
    }
}
