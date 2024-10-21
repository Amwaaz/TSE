package com.google.android.apps.gsa.notificationlistener;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.d;
import com.google.android.apps.gsa.search.shared.service.e.e;
import com.google.android.apps.gsa.shared.f.b.c;
import com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.l;
import com.google.android.apps.gsa.shared.util.c.o;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.search.b.b;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;
import com.google.common.o.or;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/notificationlistener/v.class */
public final class v implements w {
    private static final j j = j.i("com.google.android.apps.gsa.notificationlistener.v");

    /* renamed from: a, reason: collision with root package name */
    public final Context f1020a;
    public final a b;
    public final b c;
    private final e k;
    private final h l;
    private final com.google.android.libraries.g.a m;
    private final i n;
    public int i = 1;
    public q d = q.a;
    public NotificationParseConfigs e = NotificationParseConfigs.m;
    public String f = "";
    public String g = "";
    public boolean h = true;

    public v(Context context, e eVar, a aVar, i iVar, h hVar, b bVar, com.google.android.libraries.g.a aVar2) {
        this.f1020a = context;
        this.k = eVar;
        this.b = aVar;
        this.n = iVar;
        this.l = hVar;
        this.c = bVar;
        this.m = aVar2;
    }

    private final void i(ac acVar, Bundle bundle) {
        ae aeVar = new ae(acVar);
        aeVar.f(bundle);
        ClientEventData d = aeVar.d();
        d dVar = new d();
        dVar.c = or.m;
        dVar.d = "notifications";
        this.l.m(this.k.b(new ClientConfig(dVar), d, 50000L), "GNLS#processGenericClientEvent", new o("GsaOnDemandAccessHelper", "Get active notifications", "failure"));
    }

    private static final StatusBarNotification[] j() {
        StatusBarNotification[] e = a.e(Optional.empty());
        StatusBarNotification[] statusBarNotificationArr = e;
        if (e == null) {
            com.google.common.f.h e2 = j.e();
            e2.aj(com.google.common.f.a.e.a, "GsaOnDemandAccessHelper");
            com.google.common.f.h hVar = e2;
            hVar.ak(5963);
            hVar.p("Failed to retrieve active notifications");
            statusBarNotificationArr = new StatusBarNotification[0];
        }
        return statusBarNotificationArr;
    }

    @Override // com.google.android.apps.gsa.notificationlistener.w
    public final void a() {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            e(this.d);
        } else if (i2 == 2) {
            f(this.d);
        } else if (i2 == 3) {
            g(this.d, this.e);
        } else if (i2 == 4) {
            c(this.f, this.g);
        } else if (i2 == 5) {
            b(this.f, this.h);
        }
        this.i = 1;
        this.d = q.a;
        this.f = "";
        this.g = "";
        this.h = true;
        a.g(this);
    }

    public final void b(String str, boolean z) {
        androidx.core.app.e eVar;
        ab abVar = com.google.common.f.a.e.a;
        StatusBarNotification[] j2 = j();
        int length = j2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            StatusBarNotification statusBarNotification = j2[i];
            if (statusBarNotification != null && statusBarNotification.getKey() != null && statusBarNotification.getKey().equals(str)) {
                eVar = com.google.android.apps.gsa.shared.notificationlistening.collection.a.ab.a(statusBarNotification.getNotification());
                break;
            }
            i++;
        }
        if (eVar != null) {
            try {
                PendingIntent pendingIntent = eVar.i;
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException e) {
                y e2 = j.e();
                e2.aj(com.google.common.f.a.e.a, "GsaOnDemandAccessHelper");
                a.a.dB(e2, "MarkAsRead intent send failed", (char) 5950, e);
                return;
            }
        }
        if (z) {
            a.f(str);
        }
    }

    public final void c(String str, String str2) {
        androidx.core.app.e eVar;
        ab abVar = com.google.common.f.a.e.a;
        StatusBarNotification[] j2 = j();
        int length = j2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            StatusBarNotification statusBarNotification = j2[i];
            if (statusBarNotification != null && statusBarNotification.getKey() != null && statusBarNotification.getKey().equals(str)) {
                int d = g.d(statusBarNotification.getNotification());
                int i2 = 0;
                while (true) {
                    if (i2 >= d) {
                        eVar = com.google.android.apps.gsa.shared.notificationlistening.collection.a.ab.b(statusBarNotification.getNotification());
                        break;
                    }
                    eVar = g.e(statusBarNotification.getNotification().actions[i2]);
                    if (eVar.c && c.a(eVar)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                i++;
            }
        }
        if (eVar == null) {
            h(str, false, "Failed to find the notification or its reply action.");
        } else {
            c.b(this.f1020a, eVar, str2, new u(this, str));
        }
    }

    public final void d() {
        a.d(this);
        this.b.a();
    }

    public final void e(q qVar) {
        StatusBarNotification[] j2 = j();
        ab abVar = com.google.common.f.a.e.a;
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) qVar.a(Arrays.asList(j2)).toArray(new StatusBarNotification[0]);
        int length = statusBarNotificationArr.length;
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("active_notifications", statusBarNotificationArr);
        i(ac.DELIVER_ACTIVE_NOTIFICATIONS, bundle);
        a.c();
    }

    public final void f(q qVar) {
        StatusBarNotification[] j2 = j();
        ab abVar = com.google.common.f.a.e.a;
        List<StatusBarNotification> a2 = qVar.a(Arrays.asList(j2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (!a2.isEmpty()) {
            for (StatusBarNotification statusBarNotification : a2) {
                Context context = this.f1020a;
                com.google.android.libraries.g.a aVar = this.m;
                String packageName = statusBarNotification.getPackageName();
                String b = com.google.android.apps.search.assistant.libraries.l.a.b(context, packageName, context.getString(2132096555));
                Bundle bundle = statusBarNotification.getNotification().extras;
                Object obj = bundle.get("android.text");
                Object obj2 = bundle.get("android.title");
                StandardNotification standardNotification = null;
                if (b != null) {
                    standardNotification = null;
                    if (obj != null) {
                        if (obj2 == null) {
                            standardNotification = null;
                        } else {
                            l lVar = new l(aVar);
                            lVar.r = obj.toString();
                            lVar.q = obj2.toString();
                            ((com.google.android.apps.gsa.shared.notificationlistening.common.a) lVar).l = packageName;
                            ((com.google.android.apps.gsa.shared.notificationlistening.common.a) lVar).b = b;
                            ((com.google.android.apps.gsa.shared.notificationlistening.common.a) lVar).m = Long.valueOf(statusBarNotification.getPostTime());
                            ((com.google.android.apps.gsa.shared.notificationlistening.common.a) lVar).j = statusBarNotification.getKey();
                            standardNotification = new StandardNotification(lVar);
                        }
                    }
                }
                if (standardNotification != null) {
                    arrayList.add(standardNotification);
                }
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("app_notifications", arrayList);
        i(ac.DELIVER_APP_NOTIFICATIONS, bundle2);
        a.c();
    }

    public final void g(q qVar, NotificationParseConfigs notificationParseConfigs) {
        StatusBarNotification[] j2 = j();
        ab abVar = com.google.common.f.a.e.a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>((Collection<? extends Object>) this.n.a(qVar.a(Arrays.asList(j2)), notificationParseConfigs));
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("parsed_notifications", arrayList);
        i(ac.DELIVER_PARSED_NOTIFICATIONS, bundle);
        this.l.m(this.l.h("Dumping audio content in notification if any", new s(this, arrayList)), "Done dumping all audio contents", new t());
    }

    public final void h(String str, boolean z, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("notification_reply_notification", str);
        bundle.putBoolean("notification_reply_result", z);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("notification_reply_result", str2);
        }
        i(ac.NOTIFICATION_REPLY_RESULT, bundle);
        a.c();
    }
}
