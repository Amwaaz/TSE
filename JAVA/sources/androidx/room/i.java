package androidx.room;

import android.database.SQLException;

/* loaded from: classes-dex2jar.jar:androidx/room/i.class */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final g f130a;
    private final e b;

    public i(g gVar, e eVar) {
        this.f130a = gVar;
        this.b = eVar;
    }

    public final void a(androidx.room.c.c cVar, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                try {
                    this.f130a.f(cVar, obj);
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        throw e;
                    }
                    if (!m.p.s.E(message, "unique", true) && !m.p.s.E(message, "2067", false) && !m.p.s.E(message, "1555", false)) {
                        throw e;
                    }
                    this.b.d(cVar, obj);
                }
            }
        }
    }
}
