package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.speech.i.a.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/ba.class */
public final class ba {
    private long b = Long.MIN_VALUE;

    /* renamed from: a */
    public w f534a = w.a;

    public final void a(w wVar, long j) {
        synchronized (this) {
            if (j >= this.b) {
                com.google.protobuf.bc builder = wVar.toBuilder();
                builder.copyOnWrite();
                w wVar2 = builder.instance;
                wVar2.d = null;
                wVar2.b &= -2;
                this.f534a = builder.build();
                this.b = j;
            }
        }
    }
}
