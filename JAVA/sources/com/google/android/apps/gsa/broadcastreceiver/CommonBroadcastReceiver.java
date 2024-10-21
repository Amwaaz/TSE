package com.google.android.apps.gsa.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.d.e$;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ae;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.shared.util.c.a.an;
import com.google.android.apps.gsa.shared.util.n.c;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.o.or;
import e.b.a.c.b.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/broadcastreceiver/CommonBroadcastReceiver.class */
public class CommonBroadcastReceiver extends e {
    public static final j c = j.i("com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
    public com.google.android.apps.gsa.shared.logger.e d;
    public com.google.android.apps.gsa.search.shared.service.e.e e;
    public com.google.android.libraries.g.a f;
    public an g;

    public CommonBroadcastReceiver() {
        com.google.android.apps.gsa.shared.util.n.b.a(c.SEARCH);
    }

    @Override // com.google.android.apps.gsa.broadcastreceiver.e, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.j(2);
        if (intent == null) {
            h f = c.f();
            f.ak(1617);
            f.p("Null intent");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            return;
        }
        if (!this.h) {
            synchronized (this.i) {
                if (!this.h) {
                    ((d) f.a(context)).aaD(this);
                    this.h = true;
                }
            }
        }
        ae aeVar = new ae(ac.COMMON_BROADCAST_MESSAGE_RECEIVED);
        aeVar.f(intent);
        ClientEventData d = aeVar.d();
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
        dVar.c = or.H;
        dVar.f1344a = 1L;
        dVar.d = "broadcast_receiver";
        ClientConfig clientConfig = new ClientConfig(dVar);
        BroadcastReceiver.PendingResult goAsync = goAsync();
        com.google.android.libraries.g.a aVar = this.f;
        long j = a.f332a;
        long a2 = aVar.a() - e$.ExternalSyntheticApiModelOutline0.m();
        long j2 = j;
        if (a2 < j) {
            j2 = j - a2;
        }
        this.g.h(this.e.b(clientConfig, d, j2), new b(this, intent, goAsync));
    }
}
