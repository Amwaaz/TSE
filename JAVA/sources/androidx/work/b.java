package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m.c.n;

/* loaded from: classes-dex2jar.jar:androidx/work/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Executor f165a;
    public n b;
    public bb c;
    public Executor d;
    public aq e;
    public androidx.core.g.b f;
    public String g;
    public int h = 20;

    static /* synthetic */ void a(AtomicBoolean atomicBoolean, androidx.e.a.b bVar, m.h.a.a aVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            bVar.b(aVar.a());
        } catch (Throwable th) {
            bVar.d(th);
        }
    }
}
