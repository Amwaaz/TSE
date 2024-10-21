package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import androidx.slice.o$;
import androidx.window.b.bb$;
import androidx.work.af;
import androidx.work.ak;
import androidx.work.as;
import androidx.work.au;
import androidx.work.bf;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.av;
import androidx.work.impl.b.a;
import androidx.work.impl.b.ac;
import androidx.work.impl.b.ad;
import androidx.work.impl.bp;
import androidx.work.impl.p;
import androidx.work.impl.r;
import androidx.work.impl.u;
import com.google.common.util.concurrent.cn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/o.class */
public final class o {
    public static final cn a(WorkDatabase workDatabase, androidx.work.impl.utils.b.b bVar, m.h.a.l lVar) {
        l lVar2 = bVar.f216a;
        lVar2.getClass();
        return bf.e(lVar2, "loadStatusFuture", new n(lVar, workDatabase));
    }

    public static final void b(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(t.ae(arrayList, ",", (CharSequence) null, (CharSequence) null, (m.h.a.l) null, 62));
    }

    public static final int[] c(NetworkRequest networkRequest) {
        int[] ab;
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            ab = bb$.ExternalSyntheticApiModelOutline3.m$1(networkRequest);
            ab.getClass();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 29; i++) {
                int i2 = new int[]{17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9}[i];
                if (o$.ExternalSyntheticApiModelOutline1.m$1(networkRequest, i2)) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            ab = t.ab(arrayList);
        }
        return ab;
    }

    public static final int[] d(NetworkRequest networkRequest) {
        int[] ab;
        networkRequest.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            ab = bb$.ExternalSyntheticApiModelOutline3.m(networkRequest);
            ab.getClass();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 9; i++) {
                int i2 = new int[]{2, 0, 3, 6, 9, 8, 4, 1, 5}[i];
                if (o$.ExternalSyntheticApiModelOutline1.m(networkRequest, i2)) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            ab = t.ab(arrayList);
        }
        return ab;
    }

    public static final NetworkRequest e(int[] iArr, int[] iArr2) {
        int i;
        iArr.getClass();
        iArr2.getClass();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            try {
                builder.addCapability(i3);
            } catch (IllegalArgumentException e) {
                af.a();
                Log.w(f.f219a, "Ignoring adding capability '" + i3 + '\'', e);
            }
            i2++;
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return build;
    }

    public static final int f(WorkDatabase workDatabase, String str) {
        Long a2 = workDatabase.E().a(str);
        int i = 0;
        int longValue = a2 != null ? (int) a2.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i = longValue + 1;
        }
        g(workDatabase, str, i);
        return longValue;
    }

    public static final void g(WorkDatabase workDatabase, String str, int i) {
        workDatabase.E().b(new androidx.work.impl.b.d(str, Long.valueOf(i)));
    }

    public static final ac h(List list, ac acVar) {
        list.getClass();
        boolean e = acVar.f.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean e2 = acVar.f.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean e3 = acVar.f.e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (e || !e2 || !e3) {
            return acVar;
        }
        String str = acVar.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        au.f(acVar.f, linkedHashMap);
        linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return ac.g(acVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", au.d(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 16777195);
    }

    public static final ak i(UUID uuid, av avVar) {
        uuid.getClass();
        au auVar = avVar.d.l;
        l lVar = avVar.m.f216a;
        lVar.getClass();
        return bf.h(auVar, "CancelWorkById", lVar, new b(avVar, uuid, 1));
    }

    public static final ak j(String str, av avVar) {
        str.getClass();
        au auVar = avVar.d.l;
        l lVar = avVar.m.f216a;
        lVar.getClass();
        return bf.h(auVar, "CancelWorkByName_".concat(str), lVar, new b(str, avVar, 0));
    }

    public static final ak k(String str, av avVar) {
        str.getClass();
        au auVar = avVar.d.l;
        l lVar = avVar.m.f216a;
        lVar.getClass();
        return bf.h(auVar, "CancelWorkByTag_".concat(str), lVar, new b(avVar, str, 2));
    }

    public static final void l(av avVar, String str) {
        bp a2;
        WorkDatabase workDatabase = avVar.e;
        workDatabase.getClass();
        ad J = workDatabase.J();
        a D = workDatabase.D();
        List aQ = t.aQ(new String[]{str});
        while (!aQ.isEmpty()) {
            String str2 = (String) t.bd(aQ);
            as b = J.b(str2);
            if (b != as.SUCCEEDED && b != as.FAILED) {
                J.D(str2);
            }
            aQ.addAll(D.a(str2));
        }
        p pVar = avVar.g;
        pVar.getClass();
        synchronized (pVar.j) {
            af.a().c(p.f209a, a.a.dU(str, "Processor cancelling "));
            pVar.h.add(str);
            a2 = pVar.a(str);
        }
        p.e(str, a2, 1);
        Iterator it = avVar.f.iterator();
        while (it.hasNext()) {
            ((r) it.next()).b(str);
        }
    }

    public static final void m(String str, av avVar) {
        str.getClass();
        avVar.getClass();
        WorkDatabase workDatabase = avVar.e;
        workDatabase.getClass();
        workDatabase.v(new c(workDatabase, str, avVar, 1));
    }

    public static final void n(av avVar) {
        u.a(avVar.d, avVar.e, avVar.f);
    }
}
