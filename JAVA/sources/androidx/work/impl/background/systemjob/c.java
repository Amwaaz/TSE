package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.appsearch.d.a.c$;
import androidx.core.d.e$;
import androidx.media.a$;
import androidx.slice.o$;
import androidx.window.b.bb$;
import androidx.work.af;
import androidx.work.as;
import androidx.work.bf;
import androidx.work.f;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b.ac;
import androidx.work.impl.b.bc;
import androidx.work.impl.b.k;
import androidx.work.impl.b.q;
import androidx.work.impl.r;
import androidx.work.impl.utils.e;
import androidx.work.impl.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import m.a.an;
import m.a.t;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/systemjob/c.class */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f208a = af.b("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final b d;
    private final WorkDatabase e;
    private final androidx.work.c f;

    public c(Context context, WorkDatabase workDatabase, androidx.work.c cVar) {
        JobScheduler a2 = a.a(context);
        b bVar = new b(context);
        this.b = context;
        this.c = a2;
        this.d = bVar;
        this.e = workDatabase;
        this.f = cVar;
    }

    public static androidx.work.impl.b.r a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new androidx.work.impl.b.r(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException e) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b = a.b(jobScheduler);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            af.a();
            Log.e(f208a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // androidx.work.impl.r
    public final void b(String str) {
        ArrayList arrayList;
        List<JobInfo> e = e(this.b, this.c);
        if (e == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(2);
            for (JobInfo jobInfo : e) {
                androidx.work.impl.b.r a2 = a(jobInfo);
                if (a2 != null && str.equals(a2.f197a)) {
                    arrayList.add(Integer.valueOf(jobInfo.getId()));
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(this.c, ((Integer) it.next()).intValue());
        }
        this.e.G().e(str);
    }

    @Override // androidx.work.impl.r
    public final void c(ac... acVarArr) {
        int intValue;
        WorkDatabase workDatabase;
        h hVar = new h(this.e, null);
        for (ac acVar : acVarArr) {
            this.e.r();
            try {
                ac c = this.e.J().c(acVar.b);
                if (c == null) {
                    af.a();
                    Log.w(f208a, "Skipping scheduling " + acVar.b + " because it's no longer in the DB");
                    this.e.w();
                    workDatabase = this.e;
                } else if (c.c != as.ENQUEUED) {
                    af.a();
                    Log.w(f208a, "Skipping scheduling " + acVar.b + " because it is no longer enqueued");
                    this.e.w();
                    workDatabase = this.e;
                } else {
                    androidx.work.impl.b.r m = bc.m(acVar);
                    k a2 = this.e.G().a(m);
                    if (a2 != null) {
                        intValue = a2.c;
                    } else {
                        Object R = hVar.f221a.R(new e(hVar, 0));
                        R.getClass();
                        intValue = ((Number) R).intValue();
                    }
                    if (a2 == null) {
                        this.e.G().c(q.a(m, intValue));
                    }
                    g(acVar, intValue);
                    this.e.w();
                    workDatabase = this.e;
                }
                workDatabase.s();
            } catch (Throwable th) {
                this.e.s();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.r
    public final boolean d() {
        return true;
    }

    public final void g(ac acVar, int i) {
        int i2;
        String str;
        g gVar = acVar.k;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", acVar.b);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", acVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", acVar.f());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.d.b).setRequiresCharging(gVar.c).setRequiresDeviceIdle(gVar.d).setExtras(persistableBundle);
        Object obj = gVar.b.b;
        if (obj != null) {
            extras.getClass();
            o$.ExternalSyntheticApiModelOutline1.m(extras, (NetworkRequest) obj);
        } else {
            int i3 = gVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 3;
                            if (i4 != 3) {
                                i2 = 4;
                                if (i4 != 4) {
                                    af a2 = af.a();
                                    String str2 = b.f207a;
                                    Objects.toString(bf.d(i3));
                                    a2.c(str2, "API version too low. Cannot convert network type value ".concat(bf.d(i3)));
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                o$.ExternalSyntheticApiModelOutline1.m(extras, new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!gVar.d) {
            extras.setBackoffCriteria(acVar.n, acVar.m == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(acVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!acVar.r) {
            o$.ExternalSyntheticApiModelOutline1.m(extras, true);
        }
        if (gVar.a()) {
            for (f fVar : gVar.i) {
                e$.ExternalSyntheticApiModelOutline0.m(extras, new JobInfo.TriggerContentUri(fVar.a, fVar.b ? 1 : 0));
            }
            e$.ExternalSyntheticApiModelOutline0.m(extras, gVar.g);
            e$.ExternalSyntheticApiModelOutline0.m$1(extras, gVar.h);
        }
        extras.setPersisted(false);
        a$.ExternalSyntheticApiModelOutline0.m(extras, gVar.e);
        a$.ExternalSyntheticApiModelOutline0.m$1(extras, gVar.f);
        int i5 = acVar.l;
        if (Build.VERSION.SDK_INT >= 31 && acVar.r && i5 <= 0 && max <= 0) {
            bb$.ExternalSyntheticApiModelOutline3.m(extras, true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = acVar.x) != null) {
            c$.ExternalSyntheticApiModelOutline0.m(extras, str);
        }
        JobInfo build = extras.build();
        af a3 = af.a();
        String str3 = f208a;
        a3.c(str3, "Scheduling work ID " + acVar.b + "Job ID " + i);
        try {
            if (this.c.schedule(build) == 0) {
                af.a();
                Log.w(str3, "Unable to schedule work ID " + acVar.b);
                if (acVar.r && acVar.y == 1) {
                    acVar.r = false;
                    af.a().c(str3, String.format("Scheduling a non-expedited job (work ID %s)", acVar.b));
                    g(acVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            androidx.work.c cVar = this.f;
            int i6 = a.f206a;
            int size = workDatabase.J().j().size();
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler a4 = a.a(context);
                List b = a.b(a4);
                if (b != null) {
                    List e2 = e(context, a4);
                    int size2 = e2 != null ? b.size() - e2.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List e3 = e(context, (JobScheduler) systemService);
                    int size3 = e3 != null ? e3.size() : 0;
                    str4 = t.ae(an.bN(new String[]{b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", (CharSequence) null, (CharSequence) null, (l) null, 62);
                }
            } else {
                List e4 = e(context, a.a(context));
                if (e4 != null) {
                    str4 = e4.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + str4 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + cVar.j + '.';
            af.a();
            Log.e(f208a, str6);
            IllegalStateException illegalStateException = new IllegalStateException(str6, e);
            androidx.core.g.b bVar = this.f.g;
            if (bVar == null) {
                throw illegalStateException;
            }
            bVar.accept(illegalStateException);
        } catch (Throwable th) {
            af.a();
            String str7 = f208a;
            Objects.toString(acVar);
            Log.e(str7, "Unable to schedule ".concat(String.valueOf(acVar)), th);
        }
    }
}
