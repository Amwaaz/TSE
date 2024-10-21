package androidx.room;

import androidx.u.a.b;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/room/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f80a;
    public final au b;
    public final List c;
    public b d;
    public final androidx.room.c.b e;

    public a() {
        throw null;
    }

    public a(c cVar, au auVar) {
        this.f80a = cVar;
        this.b = auVar;
        this.c = cVar.e;
        this.e = new androidx.room.c.b(new androidx.room.c.c(cVar.c.a(androidx.u.a.d.a(cVar.f108a, cVar.b, new ah(this, auVar.f92a), false, false))));
        c();
    }

    public a(c cVar, m.h.a.l lVar) {
        this.f80a = cVar;
        this.b = new ag();
        this.c = cVar.e;
        this.e = new androidx.room.c.b(new androidx.room.c.c((androidx.u.a.g) lVar.a(new c(cVar.f108a, cVar.b, cVar.c, cVar.d, m.a.t.F(cVar.e, new aj(new ai(this, 0))), cVar.f, cVar.p, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o))));
        c();
    }

    private final void c() {
        androidx.u.a.g a2 = a();
        if (a2 != null) {
            a2.d(this.f80a.p == 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, androidx.u.a.g] */
    public final androidx.u.a.g a() {
        androidx.room.c.b bVar = this.e;
        androidx.room.c.b bVar2 = bVar;
        if (true != (bVar instanceof androidx.room.c.b)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2.f110a.f111a;
        }
        return null;
    }

    public final void b(androidx.room.c.c cVar) {
        androidx.u.a.b(cVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        androidx.u.a.b(cVar, as.a(this.b.b));
    }
}
