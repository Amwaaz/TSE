package com.google.android.apps.gsa.nga.engine.ae;

import com.google.android.apps.gsa.shared.util.c.d;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/aj.class */
public final /* synthetic */ class aj implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f404a;

    @Override // com.google.android.apps.gsa.shared.util.c.d
    public final void a(Object obj, Object obj2) {
        int i = this.f404a;
        if (i == 0) {
            ((ao) obj).hi(((Boolean) obj2).booleanValue());
        } else if (i != 1) {
            ((ap) obj).hn(((Boolean) obj2).booleanValue());
        } else {
            ((l) obj).I((ha) obj2);
        }
    }
}
