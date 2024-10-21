package com.google.android.apps.gsa.nga.engine.ui.e.c.a;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/c/a/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Optional f699a;
    public Optional b;
    public int c;
    public int d;
    public int e;
    private com.google.android.apps.gsa.assistant.shared.k.c f;
    private boolean g;
    private byte h;

    public a() {
        throw null;
    }

    public a(byte[] bArr) {
        this.f699a = Optional.empty();
        this.b = Optional.empty();
    }

    public final b a() {
        int i;
        int i2;
        com.google.android.apps.gsa.assistant.shared.k.c cVar;
        int i3;
        if (this.h == 1 && (i = this.e) != 0 && (i2 = this.c) != 0 && (cVar = this.f) != null && (i3 = this.d) != 0) {
            return new b(i, i2, this.f699a, this.b, cVar, i3, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" state");
        }
        if (this.c == 0) {
            sb.append(" cause");
        }
        if (this.f == null) {
            sb.append(" opaTriggerType");
        }
        if (this.d == 0) {
            sb.append(" uiType");
        }
        if (this.h == 0) {
            sb.append(" isOptimizedOnShowInvcation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }

    public final void c(com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null opaTriggerType");
        }
        this.f = cVar;
    }
}
