package com.google.android.apps.gsa.search.core.state.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/ac.class */
final class ac extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final ae f1273a;

    public ac(ae aeVar) {
        this.f1273a = aeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(78);
        this.f1273a.i.n("MicroDetectionState#userForegroundBroadcastReceiver", new ab(this, intent, goAsync()));
    }
}
