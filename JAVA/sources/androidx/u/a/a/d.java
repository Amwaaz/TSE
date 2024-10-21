package androidx.u.a.a;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import m.h.a.r;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/d.class */
final class d extends m.h.b.n implements r {

    /* renamed from: a, reason: collision with root package name */
    final androidx.u.a.i f145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.u.a.i iVar) {
        super(4);
        this.f145a = iVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        sQLiteQuery.getClass();
        this.f145a.h(new n(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
