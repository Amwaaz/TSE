package com.google.android.apps.gsa.nga.engine.recognition.b;

import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/b/e.class */
public final class e {
    public final h c;
    public final a d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f645a = true;
    public float b = 0.0f;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public e(h hVar, a aVar) {
        this.c = hVar;
        this.d = aVar;
    }

    public final boolean a() {
        boolean z;
        long d = this.d.d(eu.lY);
        synchronized (this) {
            z = true;
            if (!this.e.get()) {
                z = d > 0 && this.b * 1000.0f > ((float) d);
            }
        }
        return z;
    }
}
