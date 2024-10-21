package com.google.android.apps.gsa.nga.engine.ak.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.notificationlistener.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/s/d.class */
final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final e f440a;
    final g b;

    public d(g gVar, e eVar) {
        this.f440a = eVar;
        this.b = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(91);
        a.b(this.f440a.f441a.getApplicationContext(), this.b.c);
    }
}
