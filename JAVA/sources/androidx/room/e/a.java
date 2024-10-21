package androidx.room.e;

import androidx.room.c.c;
import androidx.u.a.b;
import m.g;

/* loaded from: classes-dex2jar.jar:androidx/room/e/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f118a;
    public final int b;

    public a(int i, int i2) {
        this.f118a = i;
        this.b = i2;
    }

    public void a(b bVar) {
        throw new g("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.u.a.b, java.lang.Object] */
    public void b(c cVar) {
        a(cVar.f111a);
    }
}
