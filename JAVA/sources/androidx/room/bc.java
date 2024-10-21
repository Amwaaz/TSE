package androidx.room;

import androidx.u.a.j;
import java.util.concurrent.atomic.AtomicBoolean;
import m.m;

/* loaded from: classes-dex2jar.jar:androidx/room/bc.class */
public abstract class bc {

    /* renamed from: a, reason: collision with root package name */
    private final ao f95a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final m.e c = new m(new s(this, 3));

    public bc(ao aoVar) {
        this.f95a = aoVar;
    }

    private final j a() {
        return (j) this.c.b();
    }

    public final j c() {
        this.f95a.p();
        return this.b.compareAndSet(false, true) ? a() : d();
    }

    public final j d() {
        String e = e();
        e.getClass();
        ao aoVar = this.f95a;
        aoVar.p();
        aoVar.q();
        return aoVar.P().b().e(e);
    }

    protected abstract String e();

    public final void f(j jVar) {
        jVar.getClass();
        if (jVar == a()) {
            this.b.set(false);
        }
    }
}
