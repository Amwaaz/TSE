package com.google.android.apps.gsa.nga.engine.education.a;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/r.class */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Optional f557a;
    private boolean b;
    private byte c;

    public r() {
        throw null;
    }

    public r(byte[] bArr) {
        this.f557a = Optional.empty();
    }

    public final s a() {
        if (this.c == 1) {
            return new s(this.b, this.f557a);
        }
        throw new IllegalStateException("Missing required properties: setShowDisclosure");
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
