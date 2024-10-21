package com.google.android.apps.gsa.search.core.preferences;

import java.io.File;
import java.util.concurrent.Executor;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/preferences/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1140a;
    private final a b;

    public j(Executor executor, a aVar) {
        this.f1140a = executor;
        this.b = aVar;
    }

    public final n a(File file) {
        n nVar = new n(this.f1140a, (Executor) this.b.a(), file);
        nVar.d.execute(new k(nVar));
        return nVar;
    }
}
