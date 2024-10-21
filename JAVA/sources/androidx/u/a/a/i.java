package androidx.u.a.a;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/i.class */
public final class i {
    public static final e a(f fVar, SQLiteDatabase sQLiteDatabase) {
        fVar.getClass();
        e eVar = fVar.f147a;
        if (eVar != null && h.a.a.p.b.a.f.h(eVar.c, sQLiteDatabase)) {
            return eVar;
        }
        e eVar2 = new e(sQLiteDatabase);
        fVar.f147a = eVar2;
        return eVar2;
    }
}
