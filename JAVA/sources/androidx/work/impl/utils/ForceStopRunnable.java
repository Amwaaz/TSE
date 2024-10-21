package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.work.af;
import androidx.work.impl.av;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/ForceStopRunnable.class */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f212a = af.b("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final av d;
    private final h e;
    private int f = 0;

    /* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver.class */
    public class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f213a = af.b("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            int i = af.a().c;
            String str = f213a;
            if (i <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.a(context);
        }
    }

    public ForceStopRunnable(Context context, av avVar) {
        this.c = context.getApplicationContext();
        this.d = avVar;
        this.e = avVar.h;
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis();
        long j = b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + j, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x003f, code lost:
    
        if (r0 == false) goto L152;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
