package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:androidx/core/app/al.class */
public final class al {
    public static String b;
    private static ak f;
    public final NotificationManager d;
    private final Context g;

    /* renamed from: a */
    public static final Object f43a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public al(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(str, i, notification);
            return;
        }
        ah ahVar = new ah(this.g.getPackageName(), i, str, notification);
        synchronized (e) {
            if (f == null) {
                f = new ak(this.g.getApplicationContext());
            }
            f.a.obtainMessage(0, ahVar).sendToTarget();
        }
        this.d.cancel(str, i);
    }
}
