package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.q.a.b;
import com.google.common.util.concurrent.cn;
import com.google.common.v.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/aa.class */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final Object f384a;
    public final Object b;

    public aa(cn cnVar) {
        this.f384a = new AtomicBoolean();
        this.b = cnVar;
    }

    public aa(f fVar, b bVar) {
        this.f384a = fVar;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    public final void a() {
        this.b.cancel(false);
    }
}
