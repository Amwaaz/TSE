package com.google.android.apps.gsa.nga.engine.as;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.ac.a.bb;
import com.google.android.apps.gsa.nga.engine.ac.a.bj;
import com.google.android.apps.gsa.opa.f.a.m;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/as/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private long f497a = 0;
    private SettableFuture b;
    private final bj c;

    public g(bj bjVar) {
        this.c = bjVar;
    }

    public final cn a() {
        SettableFuture settableFuture;
        synchronized (this) {
            this.f497a++;
            settableFuture = new SettableFuture();
            this.b = settableFuture;
            long j = this.f497a;
            bj bjVar = this.c;
            bjVar.b.n("[NGA] OpaCloudHandover.requestOpaUiScreenshot", new bb(bjVar, j));
        }
        return settableFuture;
    }

    public final void b(m mVar, Bundle bundle) {
        synchronized (this) {
            if (mVar.c == this.f497a) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("opa_ui_screenshot");
                SettableFuture settableFuture = this.b;
                if (settableFuture != null) {
                    settableFuture.n(Optional.ofNullable(bitmap));
                    this.b = null;
                }
            }
        }
    }
}
