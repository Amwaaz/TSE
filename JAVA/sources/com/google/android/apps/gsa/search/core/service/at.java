package com.google.android.apps.gsa.search.core.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/at.class */
final class at extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final au f1156a;

    public at(au auVar) {
        this.f1156a = auVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(107);
        this.f1156a.b.n("Process device update broadcast", new aq(this, intent, 3));
    }
}
