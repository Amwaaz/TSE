package com.google.android.apps.gsa.shared.s;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/s/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f1477a;

    public a(com.google.android.libraries.g.a aVar) {
        this.f1477a = new AtomicLong((Process.myPid() << 42) + aVar.f().toEpochMilli());
    }
}
