package com.google.android.apps.gsa.shared.util;

import com.google.android.libraries.g.a;
import com.google.android.libraries.g.a.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/ai.class */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final a f1499a;
    private final long b;

    public ai(a aVar) {
        this.f1499a = aVar;
        this.b = aVar.a();
    }

    public static ai b() {
        return new ai(new e());
    }

    public final long a() {
        return this.f1499a.a() - this.b;
    }
}
