package com.google.android.apps.gsa.nga.engine.c.b;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.a.g.a.e;
import com.google.android.libraries.search.account.d.d;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/b/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f521a;
    private final d b;
    private final cq c;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/b/b$a.class */
    public interface a {
        e wC();
    }

    public b(d dVar, cq cqVar, Context context) {
        this.b = dVar;
        this.c = cqVar;
        this.f521a = context;
    }

    public final cn a(String str) {
        return com.google.common.util.concurrent.i.g(this.b.a(str), ex.b(new com.google.android.apps.gsa.nga.engine.c.b.a(this)), this.c);
    }
}
