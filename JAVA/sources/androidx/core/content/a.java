package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.al;
import androidx.core.content.b.o;
import androidx.core.d.e$;
import androidx.core.d.j;
import androidx.core.f.d$;
import androidx.h.a.a$;

/* loaded from: classes-dex2jar.jar:androidx/core/content/a.class */
public class a {
    public static int c(Context context, String str) {
        a.a.cl(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : e$.ExternalSyntheticApiModelOutline0.m(new al(context).d) ? 0 : -1;
    }

    public static Context d(Context context) {
        androidx.core.d.e a2;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService("locale");
            a2 = systemService != null ? androidx.core.d.e.b(a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m(systemService))) : androidx.core.d.e.f46a;
        } else {
            a2 = androidx.core.d.e.a(android.support.v4.app.a.a(context));
        }
        Context context2 = context;
        if (Build.VERSION.SDK_INT <= 32) {
            context2 = context;
            if (!e$.ExternalSyntheticApiModelOutline0.m(a2.b.f47a)) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                j.b(configuration, a2);
                context2 = context.createConfigurationContext(configuration);
            }
        }
        return context2;
    }

    public static ColorStateList e(Context context, int i) {
        return o.b(context.getResources(), i, context.getTheme());
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        Intent m;
        int i2 = i;
        if ((i & 1) != 0) {
            if ((i & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
            i2 = i | 2;
        }
        int i3 = i2 & 4;
        if ((i2 & 2) == 0) {
            if (i3 == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i3 != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return d$.ExternalSyntheticApiModelOutline5.m(context, broadcastReceiver, intentFilter, str, (Handler) null, i2);
        }
        if (i3 == 0 || str != null) {
            m = d$.ExternalSyntheticApiModelOutline5.m(context, broadcastReceiver, intentFilter, str, (Handler) null, i2 & 1);
        } else {
            String concat = String.valueOf(context.getPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            if (e.a(context, concat) != 0) {
                throw new RuntimeException(a.a.dC(concat, "Permission ", " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            m = context.registerReceiver(broadcastReceiver, intentFilter, concat, null);
        }
        return m;
    }
}
