package androidx.u.a;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import m.h.b.m;
import m.p.s;

/* loaded from: classes-dex2jar.jar:androidx/u/a/c.class */
public abstract class c {
    public final int b;

    public c(int i) {
        this.b = i;
    }

    public static final void f(String str) {
        if (s.m(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int a2 = m.a(str.charAt(true != z ? i : length), 32);
            if (z) {
                if (a2 > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (a2 > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void a(b bVar);

    public void b(b bVar, int i, int i2) {
        throw null;
    }

    public void c(b bVar) {
    }

    public abstract void d(b bVar, int i, int i2);

    public void e() {
    }
}
