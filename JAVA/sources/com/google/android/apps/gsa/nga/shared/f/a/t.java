package com.google.android.apps.gsa.nga.shared.f.a;

import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.account.k;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/t.class */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final h f867a;
    public final Executor b;
    public final k c;
    public final cg d;

    public t(cg cgVar, h hVar, k kVar) {
        this.d = cgVar;
        this.f867a = hVar;
        this.c = kVar;
        this.b = new s(hVar);
    }

    public final cn a() {
        cg cgVar = this.d;
        cgVar.getClass();
        return this.f867a.k(this.f867a.b("[NGA] getNgaInputPlatePreferences", new ah(cgVar, 1)), "[NGA] getNgaLensChipPreferences", new aj(1));
    }

    public final cn b() {
        return this.f867a.k(this.c.e(), "[NGA] getVoiceMatchPromoImpressionCount", new l(this, 14));
    }

    public final cn c(long j) {
        return c.b(this.d.a(new r(j, 0), this.b));
    }
}
