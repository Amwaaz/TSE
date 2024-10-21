package com.google.android.apps.gsa.nga.shared.android.a;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import androidx.core.app.al;
import androidx.core.app.k;
import androidx.core.d.e$;
import androidx.media.a$;
import androidx.slice.o$;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/a/f.class */
public final class f {
    private final Context f;
    private final al g;
    private final a h;
    private static final d b = d.j();

    /* renamed from: a, reason: collision with root package name */
    public static final fl f846a = fl.y(com.google.android.apps.gsa.shared.y.a.NGA_ANDROID_VERSION, com.google.android.apps.gsa.shared.y.a.NGA_SODA, com.google.android.apps.gsa.shared.y.a.NGA_RUNNING, com.google.android.apps.gsa.shared.y.a.NGA_SURVEY, com.google.android.apps.gsa.shared.y.a.NGA_ABNORMAL_MEMORY, com.google.android.apps.gsa.shared.y.a.NGA_INITIAL_DOWNLOAD, com.google.android.apps.gsa.shared.y.a.NGA_SCREENSHOT, com.google.android.apps.gsa.shared.y.a.NGA_PIE_TRIGGER, com.google.android.apps.gsa.shared.y.a.NGA_APPFLOW_ERROR_OCCURRED, com.google.android.apps.gsa.shared.y.a.NGA_WARMACTIONS);
    private static final int c = 2131233345;
    private static final int d = 2132092966;
    private static final int e = 2132092965;

    public f(Context context, a aVar) {
        this.f = context;
        this.g = new al(context);
        this.h = aVar;
    }

    public final void a(com.google.android.apps.gsa.shared.y.a aVar) {
        this.g.d.cancel(null, aVar.aF);
    }

    public final boolean b(c cVar) {
        if (cVar.h.b && !this.h.i(eu.cJ)) {
            com.google.common.f.a.a f = b.f();
            f.ak(5077);
            f.p("Not displaying debug notification");
            return false;
        }
        int i = d.a[cVar.ordinal()];
        if (!e$.ExternalSyntheticApiModelOutline0.m(this.g.d)) {
            return false;
        }
        NotificationChannelGroup m = o$.ExternalSyntheticApiModelOutline1.m(this.g.d, "nga_notification_channels");
        if (m != null && o$.ExternalSyntheticApiModelOutline1.m(m)) {
            return false;
        }
        NotificationChannel m2 = a$.ExternalSyntheticApiModelOutline0.m(this.g.d, cVar.name());
        return m2 == null || a$.ExternalSyntheticApiModelOutline0.m(m2) != 0;
    }

    public final boolean c(com.google.android.apps.gsa.shared.y.a aVar, c cVar, e eVar) {
        if (!b(cVar)) {
            return false;
        }
        al alVar = this.g;
        if (a$.ExternalSyntheticApiModelOutline0.m(alVar.d, cVar.name()) == null) {
            List m = a$.ExternalSyntheticApiModelOutline0.m(this.g.d);
            if (m != null) {
                Iterator it = m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        al alVar2 = this.g;
                        a$.ExternalSyntheticApiModelOutline0.m(alVar2.d, new NotificationChannelGroup("nga_notification_channels", this.f.getString(e)));
                        break;
                    }
                    if (a$.ExternalSyntheticApiModelOutline0.m(a$.ExternalSyntheticApiModelOutline0.m(it.next())).equals("nga_notification_channels")) {
                        break;
                    }
                }
            }
            NotificationChannel notificationChannel = new NotificationChannel(cVar.name(), cVar.h.b(this.f), cVar.h.a);
            a$.ExternalSyntheticApiModelOutline0.m(notificationChannel, cVar.h.a(this.f));
            a$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, "nga_notification_channels");
            a$.ExternalSyntheticApiModelOutline0.m(this.g.d, notificationChannel);
        }
        k kVar = new k(this.f, (String) null);
        kVar.L.icon = c;
        kVar.z = "status";
        kVar.e = k.c(this.f.getString(d));
        kVar.d(2, true);
        eVar.a(kVar);
        kVar.G = cVar.name();
        this.g.a(null, aVar.aF, kVar.a());
        return true;
    }
}
