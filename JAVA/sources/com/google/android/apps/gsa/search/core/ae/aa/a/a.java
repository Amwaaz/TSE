package com.google.android.apps.gsa.search.core.ae.aa.a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.at;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aa/a/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1056a;

    public a(e.a aVar) {
        this.f1056a = aVar;
    }

    public final cn a(Query query) {
        g dVar = new d(query);
        ((h) this.f1056a.a()).c(dVar);
        return dVar;
    }

    public final cn b(Query query, at atVar, at atVar2) {
        g eVar = new e(query, atVar, atVar2);
        ((h) this.f1056a.a()).c(eVar);
        return eVar;
    }

    public final void c(Query query, Uri uri) {
        ((h) this.f1056a.a()).c(new b(query, uri));
    }

    public final void d(Intent intent) {
        ((h) this.f1056a.a()).c(new c(intent));
    }

    public final void e() {
        ((h) this.f1056a.a()).c(new f());
    }
}
