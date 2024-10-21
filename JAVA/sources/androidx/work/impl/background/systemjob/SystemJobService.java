package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.core.d.e$;
import androidx.slice.o$;
import androidx.window.b.bb$;
import androidx.work.af;
import androidx.work.bg;
import androidx.work.impl.at;
import androidx.work.impl.av;
import androidx.work.impl.b.r;
import androidx.work.impl.p;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.impl.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/systemjob/SystemJobService.class */
public class SystemJobService extends JobService implements androidx.work.impl.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f205a = af.b("SystemJobService");
    private av b;
    private final Map c = new HashMap();
    private final x d = w.a(false);
    private at e;

    private static r b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new r(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException e) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.a.dC(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // androidx.work.impl.c
    public final void a(r rVar, boolean z) {
        c("onExecuted");
        af.a().c(f205a, rVar.f197a.concat(" executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.c.remove(rVar);
        this.d.a(rVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            av m = av.m(getApplicationContext());
            this.b = m;
            p pVar = m.g;
            this.e = new at(pVar, m.m);
            pVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            af.a();
            Log.w(f205a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        av avVar = this.b;
        if (avVar != null) {
            avVar.g.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            af.a().c(f205a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        r b = b(jobParameters);
        if (b == null) {
            af.a();
            Log.e(f205a, "WorkSpec id not found!");
            return false;
        }
        if (this.c.containsKey(b)) {
            af a2 = af.a();
            String str = f205a;
            Objects.toString(b);
            a2.c(str, "Job is already being executed by SystemJobService: ".concat(b.toString()));
            return false;
        }
        af a3 = af.a();
        String str2 = f205a;
        Objects.toString(b);
        a3.c(str2, "onStartJob for ".concat(b.toString()));
        this.c.put(b, jobParameters);
        bg bgVar = new bg();
        if (e$.ExternalSyntheticApiModelOutline0.m(jobParameters) != null) {
            bgVar.b = Arrays.asList(e$.ExternalSyntheticApiModelOutline0.m(jobParameters));
        }
        if (e$.ExternalSyntheticApiModelOutline0.m(jobParameters) != null) {
            bgVar.a = Arrays.asList(e$.ExternalSyntheticApiModelOutline0.m(jobParameters));
        }
        bgVar.c = o$.ExternalSyntheticApiModelOutline1.m(jobParameters);
        this.e.a(this.d.b(b), bgVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        c("onStopJob");
        if (this.b == null) {
            af.a().c(f205a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        r b = b(jobParameters);
        if (b == null) {
            af.a();
            Log.e(f205a, "WorkSpec id not found!");
            return false;
        }
        af a2 = af.a();
        String str = f205a;
        Objects.toString(b);
        a2.c(str, "onStopJob for ".concat(b.toString()));
        this.c.remove(b);
        v a3 = this.d.a(b);
        if (a3 != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                i = bb$.ExternalSyntheticApiModelOutline3.m(jobParameters);
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i = -512;
                        break;
                }
            }
            this.e.b(a3, i);
        }
        p pVar = this.b.g;
        String str2 = b.f197a;
        synchronized (pVar.j) {
            contains = pVar.h.contains(str2);
        }
        return !contains;
    }
}
