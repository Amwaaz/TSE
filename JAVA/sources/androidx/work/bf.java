package androidx.work;

import android.os.Trace;
import androidx.e.a.d;
import com.google.common.util.concurrent.cn;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m.c.n;
import m.h.a.p;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/work/bf.class */
public class bf {
    public static cn a(Executor executor, m.h.a.a aVar) {
        return androidx.e.a.g.a(new be(executor, aVar, 0));
    }

    public static aw b(UUID... uuidArr) {
        return new aw(m.a.an.bQ(uuidArr), (List) null, (List) null, 14);
    }

    public static aw c(String... strArr) {
        return new aw((List) null, (List) null, m.a.an.bQ(strArr), 11);
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public static cn e(Executor executor, String str, m.h.a.a aVar) {
        executor.getClass();
        return androidx.e.a.g.a(new w(executor, str, aVar));
    }

    public static cn f(n nVar, p pVar) {
        nVar.getClass();
        return androidx.e.a.g.a(new be(nVar, pVar, 1));
    }

    public static Executor g(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new d(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static ak h(au auVar, final String str, final Executor executor, final m.h.a.a aVar) {
        executor.getClass();
        final androidx.lifecycle.as asVar = new androidx.lifecycle.as(ak.b);
        return new al(androidx.e.a.g.a(new d(executor, str, aVar, asVar) { // from class: androidx.work.am

            /* renamed from: a, reason: collision with root package name */
            public final Executor f160a;
            public final String b;
            public final m.h.a.a c;
            public final androidx.lifecycle.as d;

            {
                this.f160a = executor;
                this.b = str;
                this.c = aVar;
                this.d = asVar;
            }

            @Override // androidx.e.a.d
            public final Object a(final androidx.e.a.b bVar) {
                final String str2 = this.b;
                final m.h.a.a aVar2 = this.c;
                final androidx.lifecycle.as asVar2 = this.d;
                this.f160a.execute(new Runnable(str2, aVar2, asVar2, bVar) { // from class: androidx.work.an

                    /* renamed from: a, reason: collision with root package name */
                    public final String f161a;
                    public final m.h.a.a b;
                    public final androidx.lifecycle.as c;
                    public final androidx.e.a.b d;

                    {
                        this.f161a = str2;
                        this.b = aVar2;
                        this.c = asVar2;
                        this.d = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.e.a.b bVar2 = this.d;
                        androidx.lifecycle.as asVar3 = this.c;
                        m.h.a.a aVar3 = this.b;
                        String str3 = this.f161a;
                        boolean c = androidx.tracing.a.c();
                        if (c) {
                            try {
                                androidx.tracing.a.a(str3);
                            } finally {
                                if (c) {
                                    Trace.endSection();
                                }
                            }
                        }
                        try {
                            aVar3.a();
                            asVar3.i(ak.f159a);
                            bVar2.b(ak.f159a);
                        } catch (Throwable th) {
                            asVar3.i(new ah(th));
                            bVar2.d(th);
                        }
                    }
                });
                return w.a;
            }
        }));
    }
}
