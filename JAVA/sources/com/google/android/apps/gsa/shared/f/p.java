package com.google.android.apps.gsa.shared.f;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.d;
import com.google.android.libraries.search.assistant.ai.c.b;
import com.google.common.f.j;
import com.google.common.util.concurrent.cr;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/f/p.class */
public class p {
    public final Object b = new Object();
    public d c;
    private final cr e;
    private static final j d = j.i("com.google.android.apps.gsa.shared.f.p");

    /* renamed from: a */
    static final long f1395a = TimeUnit.SECONDS.toMillis(5);

    public p(cr crVar) {
        this.e = crVar;
    }

    public final int a() {
        synchronized (this.b) {
            int i = 0;
            try {
                d dVar = this.c;
                if (dVar != null) {
                    i = dVar.a().getCurrentInterruptionFilter();
                }
                return i;
            } catch (b | SecurityException e) {
                com.google.common.f.h e2 = d.e();
                e2.aj(com.google.common.f.a.e.a, "NotifListenerAccessor");
                com.google.common.f.h g = e2.g(e);
                g.ak(8650);
                g.p("Fail to getCurrentInterruptionFilter");
                return 0;
            }
        }
    }

    public final NotificationListenerService.RankingMap b() {
        synchronized (this.b) {
            NotificationListenerService.RankingMap rankingMap = null;
            try {
                d dVar = this.c;
                if (dVar != null) {
                    rankingMap = dVar.a().getCurrentRanking();
                }
                return rankingMap;
            } catch (b | SecurityException e) {
                com.google.common.f.h e2 = d.e();
                e2.aj(com.google.common.f.a.e.a, "NotifListenerAccessor");
                com.google.common.f.h g = e2.g(e);
                g.ak(8651);
                g.p("Fail to getCurrentRanking");
                return null;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            d dVar = this.c;
            if (dVar != null) {
                dVar.b();
                this.c = null;
            }
        }
    }

    public final void d() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public final void e(int i, int i2) {
        if (i2 <= 0) {
            com.google.common.f.h f = d.f();
            f.aj(com.google.common.f.a.e.a, "NotifListenerAccessor");
            com.google.common.f.h hVar = f;
            hVar.ak(8653);
            hVar.p("Ran out of retries when requesting listener hints!");
            return;
        }
        synchronized (this.b) {
            d dVar = this.c;
            if (dVar != null) {
                try {
                    dVar.a().requestListenerHints(i);
                } catch (b | SecurityException e) {
                    com.google.common.f.h e2 = d.e();
                    e2.aj(com.google.common.f.a.e.a, "NotifListenerAccessor");
                    com.google.common.f.h g = e2.g(e);
                    g.ak(8652);
                    g.p("Fail to requestListenerHints");
                }
            } else {
                this.e.d(new o(this, i, i2), f1395a, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean f(String str, NotificationListenerService.RankingMap rankingMap) {
        if (rankingMap != null) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (rankingMap.getRanking(str, ranking)) {
                return ranking.matchesInterruptionFilter();
            }
        }
        int a2 = a();
        return a2 == 1 || a2 == 0;
    }

    public final StatusBarNotification[] g() {
        synchronized (this.b) {
            StatusBarNotification[] statusBarNotificationArr = null;
            try {
                d dVar = this.c;
                if (dVar != null) {
                    statusBarNotificationArr = dVar.a().getActiveNotifications();
                }
                return statusBarNotificationArr;
            } catch (b | SecurityException e) {
                com.google.common.f.h e2 = d.e();
                e2.aj(com.google.common.f.a.e.a, "NotifListenerAccessor");
                com.google.common.f.h g = e2.g(e);
                g.ak(8654);
                g.p("Fail to getActiveNotifications");
                return null;
            }
        }
    }

    public final void h(d dVar) {
        synchronized (this.b) {
            this.c = dVar;
        }
    }
}
