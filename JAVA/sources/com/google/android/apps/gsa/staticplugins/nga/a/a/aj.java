package com.google.android.apps.gsa.staticplugins.nga.a.a;

import a.a;
import com.google.common.f.a.e;
import com.google.common.f.y;
import com.google.common.util.concurrent.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/aj.class */
final class aj implements bq {

    /* renamed from: a, reason: collision with root package name */
    final ak f1647a;

    public aj(ak akVar) {
        this.f1647a = akVar;
    }

    public final void gJ(Throwable th) {
        y e = ak.f1648a.e();
        e.aj(e.a, "NgaLocationAccessChk");
        a.dB(e, "Failed to update location consent in prefs", (char) 15023, th);
    }

    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        this.f1647a.a(((Boolean) obj).booleanValue());
    }
}
