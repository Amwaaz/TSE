package com.google.android.apps.gsa.nga.engine.ae;

import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/e.class */
public final /* synthetic */ class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final q f409a;

    @Override // com.google.android.libraries.gsa.h.d
    public final Object a(Object obj) {
        q qVar = this.f409a;
        synchronized (qVar.k) {
            qVar.l = true;
            if (qVar.m) {
                qVar.j();
            }
        }
        return c.f1836a;
    }
}
