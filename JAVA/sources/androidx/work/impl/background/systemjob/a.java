package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.l.a.c.a$;
import androidx.work.af;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/systemjob/a.class */
public final class a {

    /* renamed from: a */
    public static final int f206a = 0;
    private static final String b = af.b("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        JobScheduler jobScheduler2 = jobScheduler;
        if (Build.VERSION.SDK_INT >= 34) {
            jobScheduler2 = a$.ExternalSyntheticApiModelOutline0.m(jobScheduler, "androidx.work.systemjobscheduler");
            jobScheduler2.getClass();
        }
        return jobScheduler2;
    }

    public static final List b(JobScheduler jobScheduler) {
        List<JobInfo> list;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            String str = b;
            af.a();
            Log.e(str, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        return list;
    }
}
