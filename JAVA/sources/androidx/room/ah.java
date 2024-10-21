package androidx.room;

import androidx.room.c.j;
import androidx.u.a.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/room/ah.class */
public final class ah extends androidx.u.a.c {

    /* renamed from: a, reason: collision with root package name */
    final a f85a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(a aVar, int i) {
        super(i);
        this.f85a = aVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.u.a.c
    public final void a(b bVar) {
        androidx.room.c.c cVar = new androidx.room.c.c(bVar);
        j a2 = cVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (a2.n()) {
                z = false;
                if (a2.c(0) == 0) {
                    z = true;
                }
            }
            a aVar = this.f85a;
            a2.k();
            aVar.b.d(cVar);
            if (!z) {
                at c = aVar.b.c(cVar);
                if (!c.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(c.b)));
                }
            }
            aVar.b(cVar);
            aVar.b.a();
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).f();
            }
        } catch (Throwable th) {
            a2.k();
            throw th;
        }
    }

    @Override // androidx.u.a.c
    public final void b(b bVar, int i, int i2) {
        d(bVar, i, i2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0172 A[LOOP:0: B:24:0x0168->B:26:0x0172, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.u.a.b, java.lang.Object] */
    @Override // androidx.u.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.u.a.b r6) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ah.c(androidx.u.a.b):void");
    }

    @Override // androidx.u.a.c
    public final void d(b bVar, int i, int i2) {
        androidx.room.c.c cVar = new androidx.room.c.c(bVar);
        a aVar = this.f85a;
        List m = androidx.room.g.u.m(aVar.f80a.d, i, i2);
        if (m == null) {
            if (androidx.room.g.u.n(aVar.f80a, i, i2)) {
                throw new IllegalStateException(a.a.dX(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            }
            aVar.b.e(cVar);
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).g();
            }
            aVar.b.d(cVar);
            return;
        }
        aVar.b.g(cVar);
        Iterator it2 = m.iterator();
        while (it2.hasNext()) {
            ((androidx.room.e.a) it2.next()).b(cVar);
        }
        at c = aVar.b.c(cVar);
        if (!c.a) {
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(c.b)));
        }
        aVar.b.b();
        aVar.b(cVar);
    }
}
