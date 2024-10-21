package com.google.android.apps.gsa.s;

import com.google.protobuf.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/s/b.class */
public final class b implements bq {
    private final int c;
    public static final bq b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public static final bq f1041a = new b(0);

    private b(int i) {
        this.c = i;
    }

    public final boolean a(int i) {
        return this.c != 0 ? a.a(i) != null : c.a(i) != null;
    }
}
