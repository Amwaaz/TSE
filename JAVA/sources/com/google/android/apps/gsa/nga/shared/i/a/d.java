package com.google.android.apps.gsa.nga.shared.i.a;

import com.google.android.apps.gsa.shared.ah.a;
import com.google.common.b.fu;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/i/a/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final fu f885a = fu.p(0, c.THREE_BUTTON, 1, c.TWO_BUTTON, 2, c.GESTURE, 3, c.SAMSUNG_GESTURE);
    private final a b;

    public d(a aVar) {
        this.b = aVar;
    }

    public final c a() {
        return (c) f885a.getOrDefault(Integer.valueOf(this.b.a()), c.THREE_BUTTON);
    }
}
