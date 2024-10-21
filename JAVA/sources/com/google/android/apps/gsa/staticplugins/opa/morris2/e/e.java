package com.google.android.apps.gsa.staticplugins.opa.morris2.e;

import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.slice.o$;
import com.google.android.apps.gsa.notificationlistener.d;
import com.google.android.apps.gsa.notificationlistener.i;
import com.google.android.apps.gsa.notificationlistener.m;
import com.google.android.apps.gsa.notificationlistener.q;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.shared.f.p;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.cc;
import com.google.android.apps.gsa.shared.notificationlistening.collection.a.z;
import com.google.android.libraries.search.assistant.ai.c.a;
import com.google.common.b.oo;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.or;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/morris2/e/e.class */
public class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1778a = j.i("com.google.android.apps.gsa.staticplugins.opa.morris2.e.e");
    public final com.google.android.libraries.g.a b;
    public final p d;
    public final com.google.android.apps.gsa.shared.util.q.a e;
    public final Context f;
    public long g;
    public final i h;
    private final cr i;
    private final cr j;
    private final com.google.android.apps.gsa.search.shared.service.e.e l;
    private final List m;
    public final Object c = new Object();
    private final bj k = new bj();

    public e(Context context, com.google.android.libraries.g.a aVar, p pVar, cr crVar, cr crVar2, com.google.android.apps.gsa.search.shared.service.e.e eVar, com.google.android.apps.gsa.shared.util.q.a aVar2, z zVar, i iVar) {
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        this.g = 0L;
        this.b = aVar;
        this.d = pVar;
        this.i = crVar;
        this.j = crVar2;
        this.l = eVar;
        this.e = aVar2;
        this.h = iVar;
        this.f = context;
        m mVar = new m();
        mVar.b().h(new com.google.android.apps.gsa.notificationlistener.p(new String[]{"call", "msg"}, 1, (byte[]) null));
        arrayList.add(mVar.a());
        HashSet f = oo.f(1);
        Collections.addAll(f, "com.whatsapp");
        if (aVar2.i(cc.V)) {
            ab abVar = com.google.common.f.a.e.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(b.d(aVar2.h(az.eu)));
            linkedHashSet.addAll(b.d(aVar2.h(az.et)));
            if (linkedHashSet.isEmpty()) {
                linkedHashSet.addAll(zVar.c.w());
            }
            if (Telephony.Sms.getDefaultSmsPackage(context) != null) {
                linkedHashSet.add(Telephony.Sms.getDefaultSmsPackage(context));
            }
            f.addAll(linkedHashSet);
        }
        String[] strArr = (String[]) f.toArray(new String[f.size()]);
        m mVar2 = new m();
        mVar2.b().h(new com.google.android.apps.gsa.notificationlistener.p(strArr, 0));
        arrayList.add(mVar2.a());
    }

    private final StatusBarNotification[] k(StatusBarNotification[] statusBarNotificationArr) {
        StatusBarNotification[] statusBarNotificationArr2;
        if (statusBarNotificationArr == null || statusBarNotificationArr.length == 0) {
            return new StatusBarNotification[0];
        }
        synchronized (this.c) {
            long j = this.g;
            List list = this.m;
            NotificationListenerService.RankingMap b = this.d.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((q) it.next()).a(Arrays.asList(statusBarNotificationArr)));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) it2.next();
                if (b != null) {
                    NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
                    if (b.getRanking(statusBarNotification.getKey(), ranking) && o$.ExternalSyntheticApiModelOutline1.m(ranking)) {
                        it2.remove();
                    }
                }
            }
            if (arrayList.isEmpty()) {
                statusBarNotificationArr2 = new StatusBarNotification[0];
            } else if (j == 0) {
                statusBarNotificationArr2 = new StatusBarNotification[arrayList.size()];
                arrayList.toArray(statusBarNotificationArr2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) arrayList.get(i);
                    if (statusBarNotification2.getPostTime() >= j) {
                        arrayList2.add(statusBarNotification2);
                    }
                }
                statusBarNotificationArr2 = (StatusBarNotification[]) arrayList2.toArray(new StatusBarNotification[0]);
            }
            ab abVar = com.google.common.f.a.e.a;
        }
        return statusBarNotificationArr2;
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void a() {
        ab abVar = com.google.common.f.a.e.a;
        this.d.c();
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void b(boolean z) {
        this.i.execute(new a(this, z));
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void c(int i) {
        ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void d(int i) {
        ab abVar = com.google.common.f.a.e.a;
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.i.execute(new c(this, statusBarNotification, 2));
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.i.execute(new c(this, statusBarNotification, 1));
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void g(d dVar) {
        this.i.execute(new c(this, dVar, 0));
    }

    public final void h(ac acVar, String str, StatusBarNotification... statusBarNotificationArr) {
        StatusBarNotification[] k = k(statusBarNotificationArr);
        if (k == null || k.length == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray(str, k);
        j(acVar, bundle);
    }

    public final void i(ac acVar, StatusBarNotification... statusBarNotificationArr) {
        StatusBarNotification[] k = k(statusBarNotificationArr);
        if (k == null || k.length == 0) {
            return;
        }
        dl.y(this.k.a(new b(this, k), this.j), new d(this, acVar), this.i);
    }

    public final void j(ac acVar, Bundle bundle) {
        ae aeVar = new ae(acVar);
        aeVar.f(bundle);
        ClientEventData d = aeVar.d();
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
        dVar.c = or.m;
        dVar.d = "morris";
        this.l.b(new ClientConfig(dVar), d, 50000L);
    }
}
