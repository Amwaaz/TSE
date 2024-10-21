package androidx.u.a.a;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/n.class */
public class n implements androidx.u.a.h {

    /* renamed from: a */
    public final SQLiteProgram f153a;

    public n(SQLiteProgram sQLiteProgram) {
        this.f153a = sQLiteProgram;
    }

    @Override // androidx.u.a.h
    public final void a(int i, byte[] bArr) {
        bArr.getClass();
        this.f153a.bindBlob(i, bArr);
    }

    @Override // androidx.u.a.h
    public final void b(int i, double d) {
        this.f153a.bindDouble(i, d);
    }

    @Override // androidx.u.a.h
    public final void c(int i, long j) {
        this.f153a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f153a.close();
    }

    @Override // androidx.u.a.h
    public final void d(int i) {
        this.f153a.bindNull(i);
    }

    @Override // androidx.u.a.h
    public final void e(int i, String str) {
        str.getClass();
        this.f153a.bindString(i, str);
    }
}
