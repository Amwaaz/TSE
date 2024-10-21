package androidx.u;

import android.database.SQLException;
import androidx.room.c.c;
import androidx.room.c.j;

/* loaded from: classes-dex2jar.jar:androidx/u/a.class */
public final class a {
    public static final void a(int i, String str) {
        throw new SQLException(a.a.dA(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static final void b(c cVar, String str) {
        j a2 = cVar.a(str);
        try {
            a2.n();
        } finally {
            a2.k();
        }
    }
}
