package com.google.android.apps.gsa.search.core.google.gaia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.f.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/aj.class */
public final class aj extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final an f1102a;

    public aj(an anVar) {
        this.f1102a = anVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(71);
        if (intent != null && intent.getAction().equals("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED")) {
            an anVar = this.f1102a;
            anVar.c.h("Refresh accounts if allowlisted accounts changed.", new ai(this));
        } else {
            h f = an.f1105a.f();
            f.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
            h hVar = f;
            hVar.ak(6978);
            hVar.p("ApplicationRestrictionsChangedBroadcastReceiver called with wrong intent.");
        }
    }
}
