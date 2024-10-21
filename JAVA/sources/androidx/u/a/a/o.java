package androidx.u.a.a;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/o.class */
public final class o extends n implements androidx.u.a.j {
    public final SQLiteStatement b;

    public o(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // androidx.u.a.j
    public final int f() {
        return this.b.executeUpdateDelete();
    }

    @Override // androidx.u.a.j
    public final long g() {
        return this.b.executeInsert();
    }

    @Override // androidx.u.a.j
    public final void h() {
        this.b.execute();
    }
}
