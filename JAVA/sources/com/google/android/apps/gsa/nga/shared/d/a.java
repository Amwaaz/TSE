package com.google.android.apps.gsa.nga.shared.d;

import com.google.common.b.dk;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/d/a.class */
public final class a {

    /* renamed from: a */
    private final dk f853a = new dk(20);

    public final void a(int i) {
        synchronized (this) {
            this.f853a.add(Integer.valueOf(i));
        }
    }

    public final boolean b(int i) {
        boolean contains;
        synchronized (this) {
            contains = this.f853a.contains(Integer.valueOf(i));
        }
        return contains;
    }
}
