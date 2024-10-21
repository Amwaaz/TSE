package androidx.e.a;

import com.google.common.util.concurrent.cn;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes-dex2jar.jar:androidx/e/a/a.class */
public abstract class a implements cn {
    static final AbstractC0000a b;
    public static final int c = 0;
    private static final Object e;
    volatile d listeners;
    public volatile Object value;
    volatile h waiters;

    /* renamed from: a, reason: collision with root package name */
    static final boolean f54a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(a.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$a.class */
    public abstract class AbstractC0000a {
        public abstract void a(h hVar, h hVar2);

        public abstract void b(h hVar, Thread thread);

        public abstract boolean c(a aVar, d dVar, d dVar2);

        public abstract boolean d(a aVar, Object obj, Object obj2);

        public abstract boolean e(a aVar, h hVar, h hVar2);
    }

    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$b.class */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        static final b f55a;
        static final b b;
        public final boolean c;
        final Throwable d;

        static {
            if (a.f54a) {
                b = null;
                f55a = null;
            } else {
                b = new b(false, null);
                f55a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$c.class */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        static final c f56a = new c(new Throwable() { // from class: androidx.e.a.a.c.1
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            int i = a.c;
            th.getClass();
            this.b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$d.class */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        static final d f57a = new d(null, null);
        final Runnable b;
        final Executor c;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$e.class */
    final class e extends AbstractC0000a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f58a;
        final AtomicReferenceFieldUpdater b;
        final AtomicReferenceFieldUpdater c;
        final AtomicReferenceFieldUpdater d;
        final AtomicReferenceFieldUpdater e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f58a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.e.a.a.AbstractC0000a
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // androidx.e.a.a.AbstractC0000a
        public final void b(h hVar, Thread thread) {
            this.f58a.lazySet(hVar, thread);
        }

        @Override // androidx.e.a.a.AbstractC0000a
        public final boolean c(a aVar, d dVar, d dVar2) {
            return androidx.compose.ui.l.f.c(this.d, aVar, dVar, dVar2);
        }

        @Override // androidx.e.a.a.AbstractC0000a
        public final boolean d(a aVar, Object obj, Object obj2) {
            return androidx.compose.ui.l.f.c(this.e, aVar, obj, obj2);
        }

        @Override // androidx.e.a.a.AbstractC0000a
        public final boolean e(a aVar, h hVar, h hVar2) {
            return androidx.compose.ui.l.f.c(this.c, aVar, hVar, hVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$f.class */
    public final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a f59a;
        final cn b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:androidx/e/a/a$h.class */
    public final class h {

        /* renamed from: a, reason: collision with root package name */
        static final h f60a = new h(null);
        volatile h next;
        volatile Thread thread;

        public h() {
            a.b.b(this, Thread.currentThread());
        }

        public h(byte[] bArr) {
        }
    }

    static {
        e gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "next"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    static Object a(cn cnVar) {
        Object obj;
        if (cnVar instanceof a) {
            Object obj2 = ((a) cnVar).value;
            obj = obj2;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                obj = obj2;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    obj = th != null ? new b(false, th) : b.b;
                }
            }
        } else {
            boolean isCancelled = cnVar.isCancelled();
            if ((!f54a) && isCancelled) {
                return b.b;
            }
            try {
                Object H = h.a.a.p.b.a.f.H(cnVar);
                obj = H == null ? e : H;
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new b(false, e2);
                }
                Objects.toString(cnVar);
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(cnVar)), e2));
            } catch (ExecutionException e3) {
                return new c(e3.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        return obj;
    }

    static void e(a aVar) {
        d dVar;
        d dVar2;
        a aVar2 = aVar;
        d dVar3 = null;
        while (true) {
            h hVar = aVar2.waiters;
            if (b.e(aVar2, hVar, h.f60a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                aVar2.d();
                do {
                    dVar = aVar2.listeners;
                } while (!b.c(aVar2, dVar, d.f57a));
                d dVar4 = dVar;
                while (true) {
                    d dVar5 = dVar4;
                    dVar2 = dVar3;
                    if (dVar5 == null) {
                        break;
                    }
                    dVar4 = dVar5.next;
                    dVar5.next = dVar3;
                    dVar3 = dVar5;
                }
                while (dVar2 != null) {
                    Runnable runnable = dVar2.b;
                    dVar3 = dVar2.next;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar2 = fVar.f59a;
                        if (aVar2.value == fVar) {
                            if (b.d(aVar2, fVar, a(fVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, dVar2.c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i(StringBuilder sb) {
        try {
            Object H = h.a.a.p.b.a.f.H(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(H));
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, a.a.dJ(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void k(h hVar) {
        h hVar2;
        hVar.thread = null;
        while (true) {
            h hVar3 = this.waiters;
            if (hVar3 == h.f60a) {
                return;
            }
            h hVar4 = null;
            while (true) {
                h hVar5 = hVar4;
                if (hVar3 == null) {
                    return;
                }
                h hVar6 = hVar3.next;
                if (hVar3.thread != null) {
                    hVar2 = hVar3;
                } else if (hVar5 != null) {
                    hVar5.next = hVar6;
                    hVar2 = hVar5;
                    if (hVar5.thread == null) {
                        break;
                    }
                } else {
                    hVar2 = hVar5;
                    if (!b.e(this, hVar3, hVar6)) {
                        break;
                    }
                }
                hVar3 = hVar6;
                hVar4 = hVar2;
            }
        }
    }

    private static final Object l(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        Object obj2 = obj;
        if (obj == e) {
            obj2 = null;
        }
        return obj2;
    }

    public final void b(Runnable runnable, Executor executor) {
        d dVar;
        runnable.getClass();
        executor.getClass();
        d dVar2 = this.listeners;
        if (dVar2 != d.f57a) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.next = dVar2;
                if (b.c(this, dVar2, dVar3)) {
                    return;
                }
                dVar = this.listeners;
                dVar2 = dVar;
            } while (dVar != d.f57a);
        }
        j(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String c() {
        Object obj = this.value;
        if (obj instanceof f) {
            return "setFuture=[" + h(((f) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final boolean cancel(boolean z) {
        Object obj = this.value;
        boolean z2 = false;
        if ((obj instanceof f) | (obj == null)) {
            b bVar = f54a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.f55a : b.b;
            a aVar = this;
            z2 = false;
            while (true) {
                if (b.d(aVar, obj, bVar)) {
                    e(aVar);
                    if (!(obj instanceof f)) {
                        break;
                    }
                    cn cnVar = ((f) obj).b;
                    if (!(cnVar instanceof a)) {
                        cnVar.cancel(z);
                        break;
                    }
                    aVar = (a) cnVar;
                    obj = aVar.value;
                    if (!(obj == null) && !(obj instanceof f)) {
                        break;
                    }
                    z2 = true;
                } else {
                    Object obj2 = aVar.value;
                    obj = obj2;
                    if (!(obj2 instanceof f)) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    protected void d() {
    }

    public final boolean f(Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            obj2 = e;
        }
        if (!b.d(this, null, obj2)) {
            return false;
        }
        e(this);
        return true;
    }

    public final boolean g(Throwable th) {
        th.getClass();
        if (!b.d(this, null, new c(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final Object get() {
        Object obj;
        h hVar;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return l(obj2);
        }
        h hVar2 = this.waiters;
        if (hVar2 != h.f60a) {
            h hVar3 = new h();
            do {
                AbstractC0000a abstractC0000a = b;
                abstractC0000a.a(hVar3, hVar2);
                if (abstractC0000a.e(this, hVar2, hVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            k(hVar3);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return l(obj);
                }
                hVar = this.waiters;
                hVar2 = hVar;
            } while (hVar != h.f60a);
        }
        return l(this.value);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        h hVar;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof f))) {
            return l(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        long j2 = nanos;
        if (nanos >= 1000) {
            h hVar2 = this.waiters;
            if (hVar2 != h.f60a) {
                h hVar3 = new h();
                do {
                    AbstractC0000a abstractC0000a = b;
                    abstractC0000a.a(hVar3, hVar2);
                    if (abstractC0000a.e(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return l(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                            nanos = j2;
                        } while (j2 >= 1000);
                        k(hVar3);
                    } else {
                        hVar = this.waiters;
                        hVar2 = hVar;
                    }
                } while (hVar != h.f60a);
            }
            return l(this.value);
        }
        while (j2 > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return l(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        String str2 = str;
        if (j2 + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -j2;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0) {
                z = nanos2 > 1000;
            }
            String str3 = concat;
            if (convert > 0) {
                String str4 = concat + convert + " " + lowerCase;
                String str5 = str4;
                if (z) {
                    str5 = str4.concat(",");
                }
                str3 = str5.concat(" ");
            }
            String str6 = str3;
            if (z) {
                str6 = str3 + nanos2 + " nanoseconds ";
            }
            str2 = str6.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.a.dx(aVar, str2, " for "));
    }

    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof f));
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                i(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
