package com.google.android.apps.gsa.shared.util.c;

import com.google.common.b.fl;
import com.google.common.b.ni;
import java.util.concurrent.CancellationException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/aa.class */
final class aa implements com.google.android.libraries.gsa.h.e {

    /* renamed from: a, reason: collision with root package name */
    private final be f1542a;
    private final fl b;
    private final be c;

    public aa(be beVar, fl flVar, be beVar2) {
        this.f1542a = beVar;
        this.b = flVar;
        this.c = beVar2;
    }

    @Override // com.google.android.libraries.gsa.h.e
    public final void gJ(Throwable th) {
        boolean z;
        int i = 0;
        do {
            ni niVar = this.b;
            if (i >= niVar.d) {
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                if (th instanceof CancellationException) {
                    this.c.hf((CancellationException) th);
                    return;
                } else {
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    if (!(th instanceof Exception)) {
                        throw new RuntimeException("Future failed with an unsupported Throwable class", th);
                    }
                    this.c.hf((Exception) th);
                    return;
                }
            }
            ab abVar = (ab) niVar.get(i);
            if (abVar.f1543a.isInstance(th)) {
                abVar.b.hf(abVar.f1543a.cast(th));
                z = true;
            } else {
                z = false;
            }
            i++;
        } while (!z);
    }

    @Override // com.google.android.libraries.gsa.h.e
    public final void gK(Object obj) {
        this.f1542a.hf(obj);
    }
}
