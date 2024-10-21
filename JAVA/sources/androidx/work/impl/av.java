package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.core.d.e$;
import androidx.room.bi;
import androidx.work.bf;
import androidx.work.impl.a.b.n;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.b.b;
import androidx.work.impl.utils.o;
import com.google.android.apps.gsa.binaries.velvet.app.VelvetMultiprocessRoot_Application;
import com.google.common.util.concurrent.cn;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.dc;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/av.class */
public final class av extends androidx.work.av {
    public Context c;
    public androidx.work.c d;
    public WorkDatabase e;
    public List f;
    public p g;
    public androidx.work.impl.utils.h h;
    public boolean i = false;
    public BroadcastReceiver.PendingResult j;
    public volatile androidx.work.multiprocess.ab k;
    public final androidx.work.impl.a.b.p l;
    public b m;
    private final kotlinx.coroutines.ag p;

    /* renamed from: a, reason: collision with root package name */
    public static final String f187a = androidx.work.af.b("WorkManagerImpl");
    private static av n = null;
    private static av o = null;
    public static final Object b = new Object();

    public av(Context context, final androidx.work.c cVar, b bVar, WorkDatabase workDatabase, final List list, p pVar, androidx.work.impl.a.b.p pVar2) {
        Context applicationContext = context.getApplicationContext();
        if (e$.ExternalSyntheticApiModelOutline0.m(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        androidx.work.af afVar = new androidx.work.af(4);
        synchronized (androidx.work.af.f158a) {
            if (androidx.work.af.b == null) {
                androidx.work.af.b = afVar;
            }
        }
        this.c = applicationContext;
        this.m = bVar;
        this.e = workDatabase;
        this.g = pVar;
        this.l = pVar2;
        this.d = cVar;
        this.f = list;
        bVar.getClass();
        kotlinx.coroutines.ac acVar = bVar.b;
        acVar.getClass();
        kotlinx.coroutines.ag z = dc.z(acVar);
        this.p = z;
        final WorkDatabase workDatabase2 = this.e;
        this.h = new androidx.work.impl.utils.h(workDatabase2);
        p pVar3 = this.g;
        final androidx.work.impl.utils.l lVar = bVar.f216a;
        pVar3.c(new c(lVar, list, cVar, workDatabase2) { // from class: androidx.work.impl.s

            /* renamed from: a, reason: collision with root package name */
            public final Executor f210a;
            public final List b;
            public final androidx.work.c c;
            public final WorkDatabase d;

            {
                this.f210a = lVar;
                this.b = list;
                this.c = cVar;
                this.d = workDatabase2;
            }

            @Override // androidx.work.impl.c
            public final void a(androidx.work.impl.b.r rVar, boolean z2) {
                this.f210a.execute(new t(this.b, rVar, this.c, this.d));
            }
        });
        b bVar2 = this.m;
        bVar2.f216a.execute(new ForceStopRunnable(applicationContext, this));
        Context context2 = this.c;
        String str = ad.f179a;
        context2.getClass();
        if (androidx.work.impl.utils.i.a(context2, cVar)) {
            cp.x(new kotlinx.coroutines.b.aq(kotlinx.coroutines.b.aj.a(cp.r(new kotlinx.coroutines.b.aq(workDatabase.J().o(), new ab(null), 3))), new ac(context2, null), 5), z);
        }
    }

    @Deprecated
    public static av l() {
        synchronized (b) {
            av avVar = n;
            if (avVar != null) {
                return avVar;
            }
            return o;
        }
    }

    public static av m(Context context) {
        av avVar;
        synchronized (b) {
            av l = l();
            avVar = l;
            if (l == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof VelvetMultiprocessRoot_Application)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                o(applicationContext, ((VelvetMultiprocessRoot_Application) applicationContext).h());
                avVar = m(applicationContext);
            }
        }
        return avVar;
    }

    public static void o(Context context, androidx.work.c cVar) {
        androidx.room.ak h;
        synchronized (b) {
            av avVar = n;
            if (avVar != null && o != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (avVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (o == null) {
                    applicationContext.getClass();
                    cVar.getClass();
                    b bVar = new b(cVar.c);
                    final Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    androidx.work.impl.utils.l lVar = bVar.f216a;
                    lVar.getClass();
                    if (applicationContext.getResources().getBoolean(2131034193)) {
                        h = bi.i(applicationContext2, WorkDatabase.class);
                        h.c = true;
                    } else {
                        h = bi.h(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
                        h.b = new androidx.u.a.f(applicationContext2) { // from class: androidx.work.impl.ag

                            /* renamed from: a, reason: collision with root package name */
                            public final Context f182a;

                            {
                                this.f182a = applicationContext2;
                            }

                            @Override // androidx.u.a.f
                            public final androidx.u.a.g a(androidx.u.a.e eVar) {
                                return new androidx.u.a.a.m().a(androidx.u.a.d.a(this.f182a, eVar.b, eVar.c, true, true));
                            }
                        };
                    }
                    h.i(lVar);
                    h.k(new a());
                    h.c(h.c);
                    h.c(new q(applicationContext2, 2, 3));
                    h.c(i.c);
                    h.c(j.c);
                    h.c(new q(applicationContext2, 5, 6));
                    h.c(k.c);
                    h.c(l.c);
                    h.c(m.c);
                    h.c(new ay(applicationContext2));
                    h.c(new q(applicationContext2, 10, 11));
                    h.c(d.c);
                    h.c(e.c);
                    h.c(f.c);
                    h.c(g.c);
                    h.c(new q(applicationContext2, 21, 22));
                    h.d();
                    WorkDatabase workDatabase = (WorkDatabase) h.a();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    applicationContext3.getClass();
                    Context applicationContext4 = applicationContext3.getApplicationContext();
                    applicationContext4.getClass();
                    androidx.work.impl.a.b.a aVar = new androidx.work.impl.a.b.a(applicationContext4, bVar);
                    Context applicationContext5 = applicationContext3.getApplicationContext();
                    applicationContext5.getClass();
                    androidx.work.impl.a.b.c cVar2 = new androidx.work.impl.a.b.c(applicationContext5, bVar);
                    Context applicationContext6 = applicationContext3.getApplicationContext();
                    applicationContext6.getClass();
                    androidx.work.impl.a.b.l lVar2 = new androidx.work.impl.a.b.l(applicationContext6, bVar);
                    Context applicationContext7 = applicationContext3.getApplicationContext();
                    applicationContext7.getClass();
                    androidx.work.impl.a.b.p pVar = new androidx.work.impl.a.b.p(applicationContext3, aVar, cVar2, lVar2, new n(applicationContext7, bVar));
                    p pVar2 = new p(applicationContext.getApplicationContext(), cVar, bVar, workDatabase);
                    aw awVar = aw.f188a;
                    workDatabase.getClass();
                    o = new av(applicationContext.getApplicationContext(), cVar, bVar, workDatabase, (List) awVar.h(applicationContext, cVar, bVar, workDatabase, pVar, pVar2), pVar2, pVar);
                }
                n = o;
            }
        }
    }

    @Override // androidx.work.av
    public final androidx.work.ak a(String str) {
        return o.k(str, this);
    }

    @Override // androidx.work.av
    public final androidx.work.ak b(String str) {
        return o.j(str, this);
    }

    @Override // androidx.work.av
    public final androidx.work.ak c(UUID uuid) {
        return o.i(uuid, this);
    }

    @Override // androidx.work.av
    public final androidx.work.ak e(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new af(this, null, 2, list, null).i();
    }

    @Override // androidx.work.av
    public final androidx.work.ak f() {
        WorkDatabase workDatabase = this.e;
        androidx.work.c cVar = this.d;
        b bVar = this.m;
        workDatabase.getClass();
        cVar.getClass();
        bVar.getClass();
        androidx.work.impl.utils.l lVar = bVar.f216a;
        lVar.getClass();
        return bf.h(cVar.l, "PruneWork", lVar, new androidx.work.impl.utils.j(workDatabase, 0));
    }

    @Override // androidx.work.av
    public final cn g(androidx.work.aw awVar) {
        WorkDatabase workDatabase = this.e;
        b bVar = this.m;
        workDatabase.getClass();
        bVar.getClass();
        return o.a(workDatabase, bVar, new androidx.work.impl.utils.m(awVar, 0));
    }

    @Override // androidx.work.av
    public final cn h(String str) {
        WorkDatabase workDatabase = this.e;
        b bVar = this.m;
        workDatabase.getClass();
        bVar.getClass();
        str.getClass();
        return o.a(workDatabase, bVar, new androidx.work.impl.utils.m(str, 1));
    }

    @Override // androidx.work.av
    public final androidx.work.ak i(String str, int i, List list) {
        return new af(this, str, i, list, null).i();
    }

    @Override // androidx.work.av
    public final androidx.work.ak j(String str, androidx.work.r rVar, androidx.work.ay ayVar) {
        return rVar == androidx.work.r.UPDATE ? bj.a(this, str, ayVar) : s(str, rVar, ayVar).i();
    }

    public final /* synthetic */ w n() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.c;
        if (i >= 34) {
            androidx.work.impl.background.systemjob.a.a(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List e = androidx.work.impl.background.systemjob.c.e(context, jobScheduler);
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                androidx.work.impl.background.systemjob.c.f(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.e.J().B();
        u.a(this.d, this.e, this.f);
        return w.a;
    }

    public final void p() {
        synchronized (b) {
            this.i = true;
            BroadcastReceiver.PendingResult pendingResult = this.j;
            if (pendingResult != null) {
                pendingResult.finish();
                this.j = null;
            }
        }
    }

    public final void q() {
        androidx.work.au auVar = this.d.l;
        au auVar2 = new au(this);
        boolean c = androidx.tracing.a.c();
        if (c) {
            try {
                androidx.tracing.a.a("ReschedulingWork");
            } catch (Throwable th) {
                if (c) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        auVar2.f186a.n();
        if (c) {
            Trace.endSection();
        }
    }

    public final void r(androidx.work.impl.b.r rVar, int i) {
        b bVar = this.m;
        bVar.f216a.execute(new androidx.work.impl.utils.p(this.g, new v(rVar), true, i));
    }

    public final af s(String str, androidx.work.r rVar, androidx.work.ay ayVar) {
        return new af(this, str, rVar == androidx.work.r.KEEP ? 2 : 1, Collections.singletonList(ayVar), null);
    }
}
