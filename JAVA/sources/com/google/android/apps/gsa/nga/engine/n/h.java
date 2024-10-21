package com.google.android.apps.gsa.nga.engine.n;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/h.class */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Optional f630a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    private long g;
    private byte h;

    public h() {
        throw null;
    }

    public h(byte[] bArr) {
        this.f630a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }

    public final i a() {
        if (this.h == 1) {
            return new i(this.f630a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        throw new IllegalStateException("Missing required properties: timestamp");
    }

    public final void b(long j) {
        this.g = j;
        this.h = (byte) 1;
    }
}
