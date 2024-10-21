package androidx.room.f;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.u.a.j;

/* loaded from: classes-dex2jar.jar:androidx/room/f/i.class */
public final class i implements androidx.u.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f123a;

    public i(b bVar) {
        this.f123a = bVar;
    }

    @Override // androidx.u.a.b
    public final int a(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        return ((Number) this.f123a.b(new h(str, i, contentValues, str2, objArr))).intValue();
    }

    @Override // androidx.u.a.b
    public final long b(String str, int i, ContentValues contentValues) {
        return ((Number) this.f123a.b(new e(str, i, contentValues))).longValue();
    }

    @Override // androidx.u.a.b
    public final Cursor c(androidx.u.a.i iVar) {
        try {
            return new m(this.f123a.a().c(iVar), this.f123a);
        } catch (Throwable th) {
            this.f123a.d();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f123a.c();
    }

    @Override // androidx.u.a.b
    public final Cursor d(String str) {
        try {
            return new m(this.f123a.a().d(str), this.f123a);
        } catch (Throwable th) {
            this.f123a.d();
            throw th;
        }
    }

    @Override // androidx.u.a.b
    public final j e(String str) {
        return new l(str, this.f123a);
    }

    @Override // androidx.u.a.b
    public final void f() {
        try {
            this.f123a.a().f();
        } catch (Throwable th) {
            this.f123a.d();
            throw th;
        }
    }

    @Override // androidx.u.a.b
    public final void g() {
        try {
            this.f123a.a().g();
        } catch (Throwable th) {
            this.f123a.d();
            throw th;
        }
    }

    @Override // androidx.u.a.b
    public final /* synthetic */ void h() {
        f();
    }

    @Override // androidx.u.a.b
    public final void i() {
        try {
            androidx.u.a.b bVar = this.f123a.h;
            bVar.getClass();
            bVar.i();
        } finally {
            this.f123a.d();
        }
    }

    @Override // androidx.u.a.b
    public final void j(String str) {
        str.getClass();
        this.f123a.b(new c(str, 1));
    }

    @Override // androidx.u.a.b
    public final void k() {
        androidx.u.a.b bVar = this.f123a.h;
        bVar.getClass();
        bVar.k();
    }

    @Override // androidx.u.a.b
    public final boolean l() {
        b bVar = this.f123a;
        if (bVar.h == null) {
            return false;
        }
        return ((Boolean) bVar.b(d.f121a)).booleanValue();
    }

    @Override // androidx.u.a.b
    public final boolean m() {
        androidx.u.a.b bVar = this.f123a.h;
        if (bVar != null) {
            return bVar.m();
        }
        return false;
    }

    @Override // androidx.u.a.b
    public final boolean n() {
        return ((Boolean) this.f123a.b(f.a)).booleanValue();
    }

    @Override // androidx.u.a.b
    public final void o(Object[] objArr) {
        this.f123a.b(new c(objArr, 0));
    }
}
