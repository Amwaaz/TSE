package com.google.android.apps.gsa.staticplugins.nga.u;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.nga.shared.android.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/g.class */
final class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(45);
        i.b(intent).ifPresent(new aa(1));
    }
}
