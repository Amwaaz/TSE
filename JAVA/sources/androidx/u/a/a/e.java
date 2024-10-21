package androidx.u.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.Method;
import m.h.a.r;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/e.class */
public final class e implements androidx.u.a.b {
    public final SQLiteDatabase c;
    private static final String[] d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public static final m.e f146a = m.k.c(3, b.f144a);
    public static final m.e b = m.k.c(3, b.b);

    public e(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    @Override // androidx.u.a.b
    public final int a(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(d[i]);
        sb.append(str);
        sb.append(" SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        androidx.u.a.j e2 = e(sb.toString());
        androidx.u.a.d.b(e2, objArr2);
        return ((o) e2).b.executeUpdateDelete();
    }

    @Override // androidx.u.a.b
    public final long b(String str, int i, ContentValues contentValues) {
        return this.c.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.u.a.b
    public final Cursor c(androidx.u.a.i iVar) {
        final d dVar = new d(iVar);
        Cursor rawQueryWithFactory = this.c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory(dVar) { // from class: androidx.u.a.a.a

            /* renamed from: a, reason: collision with root package name */
            public final r f143a;

            {
                this.f143a = dVar;
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                m.e eVar = e.f146a;
                return (Cursor) this.f143a.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, iVar.g(), e, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // androidx.u.a.b
    public final Cursor d(String str) {
        return c(new androidx.u.a.a(str, null));
    }

    @Override // androidx.u.a.b
    public final androidx.u.a.j e(String str) {
        SQLiteStatement compileStatement = this.c.compileStatement(str);
        compileStatement.getClass();
        return new o(compileStatement);
    }

    @Override // androidx.u.a.b
    public final void f() {
        this.c.beginTransaction();
    }

    @Override // androidx.u.a.b
    public final void g() {
        this.c.beginTransactionNonExclusive();
    }

    @Override // androidx.u.a.b
    public final void h() {
        if (c.a() == null || c.b() == null) {
            this.c.beginTransaction();
            return;
        }
        Method a2 = c.a();
        a2.getClass();
        Method b2 = c.b();
        b2.getClass();
        Object invoke = b2.invoke(this.c, null);
        if (invoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        a2.invoke(invoke, 0, null, 0, null);
    }

    @Override // androidx.u.a.b
    public final void i() {
        this.c.endTransaction();
    }

    @Override // androidx.u.a.b
    public final void j(String str) {
        str.getClass();
        this.c.execSQL(str);
    }

    @Override // androidx.u.a.b
    public final void k() {
        this.c.setTransactionSuccessful();
    }

    @Override // androidx.u.a.b
    public final boolean l() {
        return this.c.inTransaction();
    }

    @Override // androidx.u.a.b
    public final boolean m() {
        return this.c.isOpen();
    }

    @Override // androidx.u.a.b
    public final boolean n() {
        return this.c.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.u.a.b
    public final void o(Object[] objArr) {
        this.c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
