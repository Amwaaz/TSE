package com.google.android.apps.gsa.search.shared.service.e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.ad;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.d.b.u;
import com.google.android.apps.gsa.search.shared.service.t;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.apps.gsa.search.shared.service.z;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.apps.gsa.shared.util.c.a.ao;
import com.google.android.apps.gsa.shared.util.g;
import com.google.common.b.ha;
import com.google.common.base.cl;
import com.google.common.f.j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/e/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1351a = j.i("com.google.android.apps.gsa.search.shared.service.e.e");
    private final x b;
    private final an c;

    public e(an anVar, x xVar) {
        this.c = anVar;
        this.b = xVar;
    }

    public static PendingIntent a(Context context, String str, u uVar, int i) {
        return PendingIntent.getService(context, 0, new Intent("com.google.android.search.core.action.ACTION_START_SESSION").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.search.core.service.SearchService").setData(new Uri.Builder().scheme("searchservice").path("/session").appendQueryParameter("sessionType", str).appendQueryParameter("sessionContext", Base64.encodeToString(uVar.toByteArray(), 11)).build()), 1140850688 | i);
    }

    public static void d(Context context, ClientEventData clientEventData) {
        g.a(context, new Intent("com.google.android.search.core.action.ACTION_PROCESS_GENERIC_CLIENT_EVENT").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.search.core.service.SearchService").putExtra("com.google.android.search.core.extra.EXTRA_GENERIC_CLIENT_EVENT", clientEventData));
    }

    private final cn e(ad adVar, SettableFuture settableFuture, ClientConfig clientConfig, ClientEventData clientEventData, long j) {
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d(clientConfig);
        dVar.f1344a |= 562949953421312L;
        t a2 = this.b.a(adVar, null, new ClientConfig(dVar));
        if (!a2.g) {
            a2.o = true;
        }
        ((ao) this.c.f1514a).f1515a.post(new c(a2, clientEventData));
        cn a3 = com.google.android.apps.gsa.shared.util.c.ao.a(settableFuture, j, this.c);
        this.c.j(a3, new d(clientEventData, a2, settableFuture));
        return a3;
    }

    private static boolean f(ClientConfig clientConfig) {
        return !z.d.contains(clientConfig.e);
    }

    public final cn b(ClientConfig clientConfig, ClientEventData clientEventData, long j) {
        if (f(clientConfig)) {
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            ha haVar = z.b;
            ac a2 = ac.a(adVar.c);
            ac acVar = a2;
            if (a2 == null) {
                acVar = ac.UNKNOWN;
            }
            boolean contains = haVar.contains(acVar);
            ac a3 = ac.a(clientEventData.f1328a.c);
            ac acVar2 = a3;
            if (a3 == null) {
                acVar2 = ac.UNKNOWN;
            }
            cl.l(contains, "Client event id %s should be present in SearchServiceContract#BACKGROUND_CLIENT_EVENT_IDS", acVar2);
        }
        final SettableFuture settableFuture = new SettableFuture();
        return e(new ad(settableFuture) { // from class: com.google.android.apps.gsa.search.shared.service.e.b

            /* renamed from: a, reason: collision with root package name */
            public final SettableFuture f1348a;

            {
                this.f1348a = settableFuture;
            }

            @Override // com.google.android.apps.gsa.search.shared.service.ad
            public final void gm(ServiceEventData serviceEventData) {
                hf a4 = hf.a(serviceEventData.f1330a.c);
                hf hfVar = a4;
                if (a4 == null) {
                    hfVar = hf.ATTACH_WEBVIEW;
                }
                if (hfVar == hf.UNBIND_BACKGROUND_CLIENT) {
                    this.f1348a.n(com.google.android.apps.gsa.v.c.f1836a);
                }
            }
        }, settableFuture, clientConfig, clientEventData, j);
    }

    public final cn c(ClientConfig clientConfig, ClientEventData clientEventData, hf hfVar, long j) {
        if (f(clientConfig)) {
            com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
            ha haVar = z.b;
            ac a2 = ac.a(adVar.c);
            ac acVar = a2;
            if (a2 == null) {
                acVar = ac.UNKNOWN;
            }
            boolean contains = haVar.contains(acVar);
            ac a3 = ac.a(clientEventData.f1328a.c);
            ac acVar2 = a3;
            if (a3 == null) {
                acVar2 = ac.UNKNOWN;
            }
            cl.l(contains, "Client event id %s should be present in SearchServiceContract#BACKGROUND_CLIENT_EVENT_IDS", acVar2);
        }
        SettableFuture settableFuture = new SettableFuture();
        return e(new a(hfVar, settableFuture), settableFuture, clientConfig, clientEventData, j);
    }
}
