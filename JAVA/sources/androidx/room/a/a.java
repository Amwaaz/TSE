package androidx.room.a;

import kotlinx.a.b;
import kotlinx.a.c;
import kotlinx.a.f;

/* loaded from: classes-dex2jar.jar:androidx/room/a/a.class */
public final class a {

    /* renamed from: a */
    private final m.h.a.a f81a;
    private final c b = new c(0, f.a);
    private final b c = new b(false, f.a);

    public a(m.h.a.a aVar) {
        this.f81a = aVar;
    }

    public final void a() {
        synchronized (this) {
            if (this.c.a(false, true)) {
                do {
                } while (this.b.c != 0);
                this.f81a.a();
            }
        }
    }

    public final void b() {
        synchronized (this) {
            c.a.decrementAndGet(this.b);
            if (this.b.c < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean c() {
        synchronized (this) {
            if (this.c.c()) {
                return false;
            }
            c.a.incrementAndGet(this.b);
            return true;
        }
    }
}
