package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/vis/af.class */
public final class af extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final a f1727a;

    public af(a aVar) {
        this.f1727a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(106);
        if (this.f1727a.i(eu.es)) {
            System.exit(0);
        }
    }
}
