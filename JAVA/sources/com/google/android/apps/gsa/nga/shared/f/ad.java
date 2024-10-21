package com.google.android.apps.gsa.nga.shared.f;

import androidx.compose.ui.platform.ca;
import com.google.protobuf.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/ad.class */
final class ad implements bq {
    private final int c;
    static final bq b = new ad(1);

    /* renamed from: a, reason: collision with root package name */
    static final bq f869a = new ad(0);

    private ad(int i) {
        this.c = i;
    }

    public final boolean a(int i) {
        return this.c != 0 ? r.a(i) != null : ca.i(i);
    }
}
