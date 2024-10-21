package com.google.android.apps.gsa.opa.a.a.a;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.b.a.h;
import com.google.common.f.b.a.i;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import e.c.d;
import java.util.concurrent.Callable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/opa/a/a/a/b.class */
public final class b implements d {
    public static cn b(final com.google.android.apps.gsa.shared.util.q.a aVar, cq cqVar) {
        return dl.r(ex.l(new Callable(aVar) { // from class: com.google.android.apps.gsa.opa.a.a.a.a

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.apps.gsa.shared.util.q.a f1022a;

            {
                this.f1022a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f1022a.i(bc.D));
            }
        }), cqVar);
    }

    public static cq c(g gVar) {
        cr a2 = gVar.a("AAFloggerBackground", gVar.c);
        a2.getClass();
        return a2;
    }

    public static h d(Context context, cq cqVar, i iVar) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            return new h(context, cqVar, iVar);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
