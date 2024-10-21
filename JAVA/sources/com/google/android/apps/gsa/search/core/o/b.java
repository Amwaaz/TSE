package com.google.android.apps.gsa.search.core.o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/o/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f1136a;

    public b(a aVar, com.google.android.libraries.g.a aVar2) {
        this.f1136a = new AtomicLong((aVar.f1135a << 36) + ((aVar2.f().toEpochMilli() / 100) & 68719476735L));
    }
}
