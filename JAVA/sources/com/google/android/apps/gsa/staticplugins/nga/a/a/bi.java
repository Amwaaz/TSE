package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bi.class */
final class bi extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final bj f1666a;

    public bi(bj bjVar) {
        this.f1666a = bjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(88);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.f1666a.c();
        }
    }
}
