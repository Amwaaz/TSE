package com.google.android.apps.gsa.shared.b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/m.class */
public final class m extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final u f1382a;
    final m.h.a.p b;

    public m(u uVar, m.h.a.p pVar) {
        this.f1382a = uVar;
        this.b = pVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        com.google.common.f.j jVar = u.f1390a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            this.f1382a.e("carMode broadcast", new s(this.b, action, (m.c.g) null, 1));
        }
    }
}
