package com.google.android.apps.gsa.binaries.velvet.app;

import androidx.work.c;
import com.google.apps.tiktok.contrib.work.e;
import com.google.apps.tiktok.tracing.bt;
import e.b.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/VelvetMultiprocessRoot_Application.class */
public final class VelvetMultiprocessRoot_Application extends oa {
    public final c h() {
        bt f = ((e) a.a(this, e.class)).nk().a.f("getWorkManagerConfiguration");
        try {
            c L = ((e) a.a(this, e.class)).L();
            if (f != null) {
                f.close();
            }
            return L;
        } catch (Throwable th) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
