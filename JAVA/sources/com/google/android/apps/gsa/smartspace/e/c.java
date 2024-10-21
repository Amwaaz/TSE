package com.google.android.apps.gsa.smartspace.e;

import androidx.work.WorkerParameters;
import androidx.work.ac;
import com.google.android.apps.gsa.opa.smartspace.d;
import com.google.android.apps.gsa.smartspace.l;
import com.google.android.apps.search.assistant.verticals.ambient.n.r;
import com.google.apps.tiktok.contrib.work.b.p;
import com.google.apps.tiktok.tracing.contrib.c.h;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/smartspace/e/c.class */
public final class c implements com.google.apps.tiktok.contrib.work.c {

    /* renamed from: a, reason: collision with root package name */
    public final p f1583a;
    private final l b;
    private final d c;
    private final r d;
    private final Executor e;
    private final com.google.android.apps.gsa.search.core.aa.a.c f;

    public c(p pVar, l lVar, r rVar, d dVar, Executor executor, com.google.android.apps.gsa.search.core.aa.a.c cVar) {
        this.f1583a = pVar;
        this.b = lVar;
        this.d = rVar;
        this.c = dVar;
        this.e = executor;
        this.f = cVar;
    }

    @Override // com.google.apps.tiktok.contrib.work.m
    public final /* synthetic */ cn a(WorkerParameters workerParameters) {
        return com.google.apps.tiktok.contrib.work.l.a();
    }

    @Override // com.google.apps.tiktok.contrib.work.c, com.google.apps.tiktok.contrib.work.m
    public final cn b(WorkerParameters workerParameters) {
        if (this.f.d || (!this.c.s() && !this.c.g())) {
            return dl.n(new ac(androidx.work.l.f224a));
        }
        return i.g(h.b(new cn[]{this.b.a(), this.d.a()}).a(new a(), this.e), ex.b(new b()), ay.a);
    }
}
