package com.google.android.apps.gsa.staticplugins.nga.f.a.e;

import androidx.work.WorkerParameters;
import androidx.work.ac;
import com.google.android.apps.gsa.nga.shared.q.c.db;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.apps.tiktok.contrib.work.l;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/f/a/e/a.class */
public final class a implements com.google.apps.tiktok.contrib.work.c {

    /* renamed from: a, reason: collision with root package name */
    private final p f1682a;
    private final e.a b;

    public a(p pVar, e.a aVar) {
        this.f1682a = pVar;
        this.b = aVar;
    }

    @Override // com.google.apps.tiktok.contrib.work.m
    public final /* synthetic */ cn a(WorkerParameters workerParameters) {
        return l.a();
    }

    @Override // com.google.apps.tiktok.contrib.work.c, com.google.apps.tiktok.contrib.work.m
    public final cn b(WorkerParameters workerParameters) {
        if (this.f1682a.w(eu.fU)) {
            com.google.android.apps.gsa.staticplugins.nga.f.a.a.c cVar = (com.google.android.apps.gsa.staticplugins.nga.f.a.a.c) this.b.a();
            String name = cVar.d().name();
            if (name == null) {
                throw new NullPointerException("Null eligibility");
            }
            cVar.h.b(new db("NGA_PIE_ELIGIBILITY", name));
        }
        return dl.n(new ac(androidx.work.l.f224a));
    }
}
