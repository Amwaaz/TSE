package com.google.android.apps.gsa.nga.shared.ah.a;

import com.google.common.util.concurrent.bq;
import java.util.concurrent.CancellationException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ah/a/u.class */
public final class u implements bq {

    /* renamed from: a */
    final w f840a;

    public u(w wVar) {
        this.f840a = wVar;
    }

    public final void gJ(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        this.f840a.a(th);
    }

    public final void gK(Object obj) {
    }
}
