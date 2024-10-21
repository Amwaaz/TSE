package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.tracing.dj;
import kotlinx.coroutines.a.r;
import kotlinx.coroutines.a.s;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/z.class */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final ac f933a;
    final kotlinx.coroutines.a.ae b;

    public z(ac acVar, kotlinx.coroutines.a.ae aeVar) {
        this.f933a = acVar;
        this.b = aeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        dj djVar = this.f933a.c;
        kotlinx.coroutines.a.ae aeVar = this.b;
        com.google.apps.tiktok.tracing.au e = djVar.e("TRG.IEStatusProv");
        try {
            boolean booleanExtra = intent.getBooleanExtra("com.google.android.googlequicksearchbox.extra.HOTWORD_REQUESTED", false);
            com.google.common.f.h d = ac.f890a.d();
            d.aj(com.google.common.f.a.e.a, "TRG.IEStatusProv");
            d.ak(5168);
            com.google.common.f.h hVar = d;
            Boolean valueOf = Boolean.valueOf(booleanExtra);
            hVar.s("In enrollment signal: %s", valueOf);
            Object a2 = kotlinx.coroutines.a.v.a(aeVar, valueOf);
            if (a2 instanceof r) {
                Throwable b = s.b(a2);
                com.google.common.f.h f = ac.f890a.f();
                f.aj(com.google.common.f.a.e.a, "TRG.IEStatusProv");
                com.google.common.f.h g = f.g(b);
                g.ak(5169);
                g.p("Emit of in enrollment signal failed.");
            }
            m.f.a.a(e, (Throwable) null);
        } finally {
        }
    }
}
