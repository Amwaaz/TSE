package androidx.work.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/u.class */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f211a = androidx.work.af.b("Schedulers");

    public static void a(androidx.work.c cVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.b.ad J = workDatabase.J();
        workDatabase.r();
        try {
            List f = J.f();
            androidx.work.au auVar = cVar.k;
            b(J, f);
            List e = J.e(cVar.j);
            androidx.work.au auVar2 = cVar.k;
            b(J, e);
            if (f != null) {
                e.addAll(f);
            }
            List y = J.y();
            workDatabase.w();
            workDatabase.s();
            if (e.size() > 0) {
                androidx.work.impl.b.ac[] acVarArr = (androidx.work.impl.b.ac[]) e.toArray(new androidx.work.impl.b.ac[e.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    if (rVar.d()) {
                        rVar.c(acVarArr);
                    }
                }
            }
            if (y.size() > 0) {
                androidx.work.impl.b.ac[] acVarArr2 = (androidx.work.impl.b.ac[]) y.toArray(new androidx.work.impl.b.ac[y.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r rVar2 = (r) it2.next();
                    if (!rVar2.d()) {
                        rVar2.c(acVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.s();
            throw th;
        }
    }

    private static void b(androidx.work.impl.b.ad adVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adVar.A(((androidx.work.impl.b.ac) it.next()).b, currentTimeMillis);
            }
        }
    }
}
