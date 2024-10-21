package androidx.work.impl.utils;

import a.a;
import androidx.work.af;
import androidx.work.ay;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.av;
import androidx.work.impl.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f218a = af.b("EnqueueRunnable");

    public static void a(androidx.work.impl.af afVar) {
        int i;
        if (androidx.work.impl.af.k(afVar, new HashSet())) {
            throw new IllegalStateException(a.dI(afVar, "WorkContinuation has cycles (", ")"));
        }
        av avVar = afVar.f181a;
        WorkDatabase workDatabase = avVar.e;
        workDatabase.r();
        try {
            androidx.work.c cVar = avVar.d;
            workDatabase.getClass();
            cVar.getClass();
            List aQ = t.aQ(new androidx.work.impl.af[]{afVar});
            int i2 = 0;
            while (!aQ.isEmpty()) {
                androidx.work.impl.af afVar2 = (androidx.work.impl.af) t.bd(aQ);
                List list = afVar2.c;
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (true) {
                        i = i3;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((ay) it.next()).b.k.a()) {
                            int i4 = i3 + 1;
                            i3 = i4;
                            if (i4 < 0) {
                                t.aT();
                                i3 = i4;
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                int i5 = i2 + i;
                List list2 = afVar2.e;
                i2 = i5;
                if (list2 != null) {
                    aQ.addAll(list2);
                    i2 = i5;
                }
            }
            if (i2 != 0) {
                int a2 = workDatabase.J().a();
                if (a2 + i2 > 8) {
                    throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: " + a2 + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
                }
            }
            boolean b = b(afVar);
            workDatabase.w();
            if (b) {
                av avVar2 = afVar.f181a;
                u.a(avVar2.d, avVar2.e, avVar2.f);
            }
        } finally {
            workDatabase.s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x031c, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b1  */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(androidx.work.impl.af r7) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.d.b(androidx.work.impl.af):boolean");
    }
}
