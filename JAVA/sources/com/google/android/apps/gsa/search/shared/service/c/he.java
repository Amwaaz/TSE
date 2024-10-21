package com.google.android.apps.gsa.search.shared.service.c;

import com.google.protobuf.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/c/he.class */
final class he implements bq {
    private final int c;
    static final bq b = new he(1);

    /* renamed from: a, reason: collision with root package name */
    static final bq f1341a = new he(0);

    private he(int i) {
        this.c = i;
    }

    public final boolean a(int i) {
        return this.c != 0 ? ac.a(i) != null : hf.a(i) != null;
    }
}
