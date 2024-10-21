package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bc.class */
final class bc extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final bg f1661a;

    public bc(bg bgVar) {
        this.f1661a = bgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(87);
        intent.getAction();
        this.f1661a.h();
    }
}
