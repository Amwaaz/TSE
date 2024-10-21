package androidx.work.impl.utils.b;

import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/b/a.class */
final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final b f215a;

    public a(b bVar) {
        this.f215a = bVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f215a.c.post(runnable);
    }
}
