package com.google.android.apps.gsa.shared.util.c.a;

import android.text.TextUtils;
import androidx.compose.ui.l.f;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/i.class */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1531a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.c.a.i");
    public final int b;
    private final String c;
    private final AtomicLong d = new AtomicLong(0);

    public i(String str, int i) {
        f.e(!TextUtils.isEmpty(str));
        this.c = str;
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(this, runnable, this.c + this.d.getAndIncrement());
    }
}
