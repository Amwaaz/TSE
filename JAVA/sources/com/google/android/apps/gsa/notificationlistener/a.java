package com.google.android.apps.gsa.notificationlistener;

import android.content.ComponentName;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.ao.g$;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import h.a.a.p.b.a.f;
import j$.util.Optional;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/notificationlistener/a.class */
public final class a {
    private static final j b = j.i("com.google.android.apps.gsa.notificationlistener.a");

    /* renamed from: a, reason: collision with root package name */
    public final Context f1019a;

    public a(Context context) {
        this.f1019a = context;
    }

    public static boolean b(Context context, com.google.android.libraries.search.assistant.ai.c.a aVar) {
        e eVar;
        ab abVar = e.a;
        e eVar2 = (e) e.b.get();
        boolean z = true;
        if (eVar2 != null) {
            eVar = eVar2;
            if (eVar2.f.get()) {
                eVar2.e.add(aVar);
                aVar.g(new d(aVar));
                return z;
            }
        } else {
            eVar = null;
        }
        if (eVar == null) {
            h d = e.a.d();
            d.aj(e.a, "NLL.Service");
            h hVar = d;
            hVar.ak(5901);
            hVar.p("Requesting system to rebind to service");
            g$.ExternalSyntheticApiModelOutline0.m$1(new ComponentName(context, (Class<?>) GsaNotificationListenerService.class));
        } else {
            f.J(e.d, cl.d(new b(context)));
            y b2 = e.b();
            if (b2 != null && com.google.android.libraries.search.assistant.ai.d.a.a.f(b2.a)) {
                b2.a();
                synchronized (b2.d) {
                    b2.e = 0;
                    b2.g = true;
                    b2.f = b2.c.b(ex.l(new x(b2)));
                }
            }
        }
        z = false;
        return z;
    }

    public static final void c() {
        ab abVar = e.a;
        GsaNotificationListenerService a2 = e.a();
        if (a2 == null || !a2.a().e.isEmpty()) {
            return;
        }
        h d = e.a.d();
        d.aj(e.a, "NLL.Service");
        h hVar = d;
        hVar.ak(5881);
        hVar.p("Requesting system to unbind from service");
        g$.ExternalSyntheticApiModelOutline0.m(a2);
    }

    public static final void d(w wVar) {
        ab abVar = e.a;
        e.c.add(wVar);
    }

    public static final StatusBarNotification[] e(Optional optional) {
        ab abVar = e.a;
        int i = fl.e;
        optional.orElse(ni.a);
        e.f();
        GsaNotificationListenerService a2 = e.a();
        return a2 != null ? optional.isPresent() ? a2.getActiveNotifications((String[]) ((List) optional.get()).toArray(new String[0])) : a2.getActiveNotifications() : null;
    }

    public static final boolean f(String str) {
        ab abVar = e.a;
        GsaNotificationListenerService a2 = e.a();
        if (a2 == null) {
            return false;
        }
        h d = e.a.d();
        d.aj(e.a, "NLL.Service");
        h hVar = d;
        hVar.ak(5902);
        hVar.s("Cancelling notification %s", str);
        a2.cancelNotification(str);
        return true;
    }

    public static final void g(w wVar) {
        ab abVar = e.a;
        e.c.remove(wVar);
    }

    public final void a() {
        h d = b.d();
        d.aj(e.a, "NLL.ServiceAccessor");
        h hVar = d;
        hVar.ak(5873);
        hVar.p("Requesting system to rebind to service");
        g$.ExternalSyntheticApiModelOutline0.m(new ComponentName(this.f1019a, (Class<?>) GsaNotificationListenerService.class));
    }
}
