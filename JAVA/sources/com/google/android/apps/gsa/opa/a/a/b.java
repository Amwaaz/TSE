package com.google.android.apps.gsa.opa.a.a;

import com.google.common.f.a.e;
import com.google.common.f.y;
import com.google.common.util.concurrent.bq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/a/a/b.class */
final class b implements bq {

    /* renamed from: a, reason: collision with root package name */
    final c f1023a;

    public b(c cVar) {
        this.f1023a = cVar;
    }

    public final void gJ(Throwable th) {
        y e = c.f1024a.e();
        e.aj(e.a, "AAFileLoggerCfg");
        a.a.dB(e, "onFailure()", (char) 5995, th);
    }

    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = false;
        if (bool != null) {
            z = false;
            if (bool.booleanValue()) {
                z = true;
            }
        }
        this.f1023a.b = z;
    }
}
