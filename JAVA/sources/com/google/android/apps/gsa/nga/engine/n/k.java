package com.google.android.apps.gsa.nga.engine.n;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Optional f632a;
    private long b;
    private byte c;

    public k() {
        throw null;
    }

    public k(byte[] bArr) {
        this.f632a = Optional.empty();
    }

    public final l a() {
        if (this.c == 1) {
            return new l(this.f632a, this.b);
        }
        throw new IllegalStateException("Missing required properties: timestamp");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
