package androidx.work.impl.background.a;

import androidx.work.af;
import androidx.work.impl.b.ac;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/a/a.class */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ac f199a;
    final b b;

    public a(b bVar, ac acVar) {
        this.b = bVar;
        this.f199a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        af.a().c(b.f200a, "Scheduling work ".concat(this.f199a.b));
        this.b.b.c(this.f199a);
    }
}
