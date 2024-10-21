package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.af;
import androidx.work.impl.av;
import java.util.Objects;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/systemalarm/RescheduleReceiver.class */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f204a = af.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        af a2 = af.a();
        String str = f204a;
        Objects.toString(intent);
        a2.c(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            av m = av.m(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (av.b) {
                BroadcastReceiver.PendingResult pendingResult = m.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                m.j = goAsync;
                if (m.i) {
                    m.j.finish();
                    m.j = null;
                }
            }
        } catch (IllegalStateException e) {
            af.a();
            Log.e(f204a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
