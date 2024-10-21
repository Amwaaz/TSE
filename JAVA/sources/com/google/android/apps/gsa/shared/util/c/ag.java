package com.google.android.apps.gsa.shared.util.c;

import com.google.android.libraries.gsa.h.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.base.bc;
import com.google.common.base.cg;
import com.google.common.base.cl;
import com.google.common.f.j;
import com.google.common.n.c.r;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import j$.util.concurrent.DesugarTimeUnit;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/ag.class */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1547a = j.i("com.google.android.apps.gsa.shared.util.c.ag");

    public static cn a(Iterable iterable) {
        fl l = fl.l(iterable);
        int size = l.size();
        if (size == 0) {
            throw new IllegalArgumentException("Expected at least one future, got 0.");
        }
        if (size == 1) {
            return new x((cn) l.get(0));
        }
        y yVar = new y(l);
        AtomicReference atomicReference = new AtomicReference(yVar);
        int size2 = l.size();
        for (int i = 0; i < size2; i++) {
            cn cnVar = (cn) l.get(i);
            cnVar.b(new s(atomicReference, cnVar), com.google.common.util.concurrent.ay.a);
        }
        return yVar;
    }

    public static cn b(Iterable iterable) {
        fl l = fl.l(iterable);
        int size = l.size();
        if (size == 0) {
            throw new IllegalArgumentException("Expected at least one future, got 0.");
        }
        if (size == 1) {
            return new x((cn) l.get(0));
        }
        y yVar = new y(l);
        AtomicReference atomicReference = new AtomicReference(yVar);
        AtomicInteger atomicInteger = new AtomicInteger(l.size());
        int size2 = l.size();
        for (int i = 0; i < size2; i++) {
            cn cnVar = (cn) l.get(i);
            cnVar.b(new t(atomicReference, cnVar, atomicInteger), com.google.common.util.concurrent.ay.a);
        }
        return yVar;
    }

    public static cn c(h hVar, String str, c cVar, r rVar) {
        bi biVar = new bi(str, rVar, cVar, bc.b, hVar);
        biVar.d();
        return biVar;
    }

    public static cn d(h hVar, String str, c cVar, com.google.common.base.aw awVar, r rVar) {
        bi biVar = new bi(str, rVar, cVar, awVar, hVar);
        biVar.d();
        return biVar;
    }

    public static cn e(cn cnVar, Duration duration, h hVar) {
        af afVar = new af(cnVar);
        hVar.p("Timeout", Duration.ofMillis(duration.toMillis()), new q(afVar));
        cnVar.b(new r(afVar), com.google.common.util.concurrent.ay.a);
        return afVar;
    }

    public static cn f(cn cnVar, long j, TimeUnit timeUnit, h hVar) {
        return e(cnVar, Duration.of(j, DesugarTimeUnit.toChronoUnit(timeUnit)), hVar);
    }

    public static Object g(Future future) {
        if (!future.isDone()) {
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        }
        return future.get();
    }

    public static Object h(Future future, Duration duration) {
        if (com.google.common.v.b.f(duration) && !future.isDone()) {
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        }
        return future.get(com.google.common.v.b.d(duration), TimeUnit.NANOSECONDS);
    }

    public static Object i(Future future) {
        cl.y(future.isDone(), "Future was expected to be done: %s", future);
        return dl.x(future);
    }

    public static Object j(Future future, Object obj) {
        if (future.isDone()) {
            try {
                return h.a.a.p.b.a.f.H(future);
            } catch (CancellationException | ExecutionException e) {
            }
        }
        return obj;
    }

    @Deprecated
    public static Object k(Future future, Duration duration) {
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        return future.get(com.google.common.v.b.d(duration), TimeUnit.NANOSECONDS);
    }

    public static String l(Future future) {
        if (!future.isDone()) {
            return "pending";
        }
        try {
            return a.a.eg(h.a.a.p.b.a.f.H(future), "value(", ")");
        } catch (CancellationException e) {
            return "cancelled";
        } catch (ExecutionException e2) {
            return a.a.dD(e2, "failed(", ")");
        }
    }

    public static Throwable m(cn cnVar, Class cls) {
        try {
            throw new IllegalStateException(String.format("Future unexpectedly succeeded with <%s> rather than failing with a %s", dl.w(cnVar), cls));
        } catch (ExecutionException e) {
            int i = cg.a;
            try {
                return (Throwable) cls.cast(e.getCause());
            } catch (ClassCastException e2) {
                e2.initCause(e);
                throw e2;
            }
        }
    }

    public static boolean n(Future future) {
        if (!future.isDone()) {
            return false;
        }
        try {
            h.a.a.p.b.a.f.H(future);
            return false;
        } catch (CancellationException | ExecutionException e) {
            return true;
        }
    }

    public static boolean o(Future future, Class cls) {
        if (!future.isDone()) {
            return false;
        }
        try {
            h.a.a.p.b.a.f.H(future);
            return false;
        } catch (CancellationException e) {
            return false;
        } catch (ExecutionException e2) {
            return cls.isInstance(e2.getCause());
        }
    }

    public static boolean p(Future future) {
        if (!future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            h.a.a.p.b.a.f.H(future);
            return true;
        } catch (RuntimeException | ExecutionException e) {
            return false;
        }
    }

    public static void q(cn cnVar, String str, String str2, String str3) {
        dl.y(cnVar, new w(str, str3), com.google.common.util.concurrent.ay.a);
    }
}
