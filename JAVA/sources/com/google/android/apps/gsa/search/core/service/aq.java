package com.google.android.apps.gsa.search.core.service;

import android.app.Notification;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.shared.util.keepalive.a;
import com.google.android.libraries.gsa.h.f;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/aq.class */
public final /* synthetic */ class aq implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1155a;
    public final Object b;
    private final int c;

    public /* synthetic */ aq(k kVar, ServiceEventData serviceEventData, int i) {
        this.c = i;
        this.b = kVar;
        this.f1155a = serviceEventData;
    }

    public /* synthetic */ aq(Object obj, Object obj2, int i) {
        this.c = i;
        this.f1155a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        int i = this.c;
        if (i == 0) {
            a aVar = ((au) this.f1155a).c.d;
            aVar.b(131077, (Notification) this.b, aVar.c.get(131077), aVar.c());
            return;
        }
        if (i == 1) {
            ((k) this.b).b((ServiceEventData) this.f1155a);
            return;
        }
        if (i == 2) {
            ai aiVar = ((au) this.f1155a).c;
            a aVar2 = aiVar.d;
            int size = aVar2.c.size();
            Integer num = aVar2.d;
            boolean z = size == 0;
            aVar2.b(131077, (Notification) this.b, true, z);
            if (z && num != null && num.intValue() != 131077) {
                aVar2.b(num.intValue(), (Notification) aVar2.b.get(num.intValue()), false, false);
            }
            aiVar.e = true;
            aiVar.an();
            return;
        }
        String action = ((Intent) this.b).getAction();
        boolean equals = "android.intent.action.SCREEN_OFF".equals(action);
        au auVar = ((at) this.f1155a).f1156a;
        if (!equals) {
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                auVar.c.f(false);
            }
        } else {
            auVar.c.i(false);
            ai aiVar2 = auVar.c;
            boolean isDeviceLocked = ((com.google.android.apps.gsa.search.core.ac.t) auVar.f1157a.a()).b.isDeviceLocked();
            ab abVar = e.a;
            aiVar2.f(isDeviceLocked);
        }
    }
}
