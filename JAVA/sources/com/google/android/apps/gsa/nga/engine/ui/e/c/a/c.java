package com.google.android.apps.gsa.nga.engine.ui.e.c.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/c/a/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public b f701a;
    public b b;

    public final d a() {
        if (this.f701a != null && this.b != null) {
            return new d(this.f701a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f701a == null) {
            sb.append(" previousState");
        }
        if (this.b == null) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
