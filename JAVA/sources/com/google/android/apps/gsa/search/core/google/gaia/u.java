package com.google.android.apps.gsa.search.core.google.gaia;

import android.content.Intent;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/u.class */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final an f1114a;
    public final Intent b;

    public /* synthetic */ u(an anVar, Intent intent) {
        this.f1114a = anVar;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.b;
        intent.setPackage("com.google.android.googlequicksearchbox");
        an anVar = this.f1114a;
        anVar.f.sendBroadcast(intent, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
        anVar.t("#finishAccountChange: broadcasted the account change after enabling completed.");
    }
}
