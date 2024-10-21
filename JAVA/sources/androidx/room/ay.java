package androidx.room;

import android.database.Cursor;
import androidx.u.a.b;
import java.util.Iterator;
import java.util.List;

@m.a
/* loaded from: classes-dex2jar.jar:androidx/room/ay.class */
public final class ay extends androidx.u.a.c {

    /* renamed from: a, reason: collision with root package name */
    private c f93a;
    private final List c;
    private final aw d;
    private final String e;
    private final String f;

    public ay(c cVar, aw awVar) {
        super(23);
        this.c = cVar.e;
        this.f93a = cVar;
        this.d = awVar;
        this.e = "86254750241babac4b8d52996a675549";
        this.f = "1cbd3130fa23b59692c061c594c16cc0";
    }

    private final void g(b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.j(as.a(this.e));
    }

    @Override // androidx.u.a.c
    public final void a(b bVar) {
        Cursor d = bVar.d("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (d.moveToFirst()) {
                z = false;
                if (d.getInt(0) == 0) {
                    z = true;
                }
            }
            m.f.a.a(d, (Throwable) null);
            this.d.b(bVar);
            if (!z) {
                ax a2 = this.d.a(bVar);
                if (!a2.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(a2.b)));
                }
            }
            g(bVar);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).f();
            }
        } finally {
        }
    }

    @Override // androidx.u.a.c
    public final void b(b bVar, int i, int i2) {
        d(bVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102 A[LOOP:0: B:23:0x00f9->B:25:0x0102, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // androidx.u.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.u.a.b r7) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ay.c(androidx.u.a.b):void");
    }

    @Override // androidx.u.a.c
    public final void d(b bVar, int i, int i2) {
        List m;
        c cVar = this.f93a;
        if (cVar != null && (m = androidx.room.g.u.m(cVar.d, i, i2)) != null) {
            androidx.room.g.u.r(new androidx.room.c.c(bVar));
            Iterator it = m.iterator();
            while (it.hasNext()) {
                ((androidx.room.e.a) it.next()).b(new androidx.room.c.c(bVar));
            }
            ax a2 = this.d.a(bVar);
            if (!a2.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(a2.b)));
            }
            g(bVar);
            return;
        }
        c cVar2 = this.f93a;
        if (cVar2 == null || androidx.room.g.u.n(cVar2, i, i2)) {
            throw new IllegalStateException(a.a.dX(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        bVar.j("DROP TABLE IF EXISTS `Dependency`");
        bVar.j("DROP TABLE IF EXISTS `WorkSpec`");
        bVar.j("DROP TABLE IF EXISTS `WorkTag`");
        bVar.j("DROP TABLE IF EXISTS `SystemIdInfo`");
        bVar.j("DROP TABLE IF EXISTS `WorkName`");
        bVar.j("DROP TABLE IF EXISTS `WorkProgress`");
        bVar.j("DROP TABLE IF EXISTS `Preference`");
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((bi) it2.next()).g();
        }
        this.d.b(bVar);
    }

    @Override // androidx.u.a.c
    public final void e() {
    }
}
