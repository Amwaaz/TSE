package com.google.android.apps.gsa.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.c.al;
import com.google.common.f.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/broadcastreceiver/b.class */
final class b extends al {

    /* renamed from: a, reason: collision with root package name */
    final Intent f333a;
    final BroadcastReceiver.PendingResult b;
    final CommonBroadcastReceiver c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommonBroadcastReceiver commonBroadcastReceiver, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        super("finishPendingResult", 2, 0);
        this.f333a = intent;
        this.b = pendingResult;
        this.c = commonBroadcastReceiver;
    }

    private final void d() {
        if (this.c.isOrderedBroadcast()) {
            this.b.setResultCode(-1);
        }
        this.b.finish();
    }

    public final void gJ(Throwable th) {
        h e = CommonBroadcastReceiver.c.e();
        e.ak(1616);
        e.s("failed to broadcast acl intent %s", this.f333a.getAction());
        Intent intent = this.f333a;
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction()) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            CommonBroadcastReceiver commonBroadcastReceiver = this.c;
            commonBroadcastReceiver.d.a(new com.google.android.apps.gsa.shared.m.a(th, 211, 2490374)).a();
        }
        d();
    }

    public final /* synthetic */ void gK(Object obj) {
        d();
    }
}
