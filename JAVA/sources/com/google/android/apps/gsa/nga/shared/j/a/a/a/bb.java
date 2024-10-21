package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.dj;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/bb.class */
public final class bb extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final bc f915a;
    final m.h.a.a b;

    public bb(bc bcVar, m.h.a.a aVar) {
        this.f915a = bcVar;
        this.b = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        dj djVar = this.f915a.d;
        m.h.a.a aVar = this.b;
        com.google.apps.tiktok.tracing.au e = djVar.e("TRG.VMConfigProv");
        try {
            com.google.common.f.h d = bc.f916a.d();
            d.aj(com.google.common.f.a.e.a, "TRG.VMConfigProv");
            d.ak(5176);
            d.p("New speakerId model signal.");
            aVar.a();
            m.f.a.a(e, (Throwable) null);
        } finally {
        }
    }
}
