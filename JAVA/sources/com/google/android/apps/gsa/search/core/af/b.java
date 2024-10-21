package com.google.android.apps.gsa.search.core.af;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fu;
import com.google.common.f.ab;
import com.google.common.f.j;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/af/b.class */
public class b extends BroadcastReceiver {
    private static final j b = j.i("com.google.android.apps.gsa.search.core.af.b");
    private static final fu c = fu.p("d", 1, "r", 2, "w", 3, "b", 4);

    /* renamed from: a, reason: collision with root package name */
    public final a f1095a;
    private final h d;

    public b(a aVar, h hVar) {
        this.f1095a = aVar;
        this.d = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(47);
        ab abVar = com.google.common.f.a.e.a;
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "com.google.android.apps.maps";
        }
        String stringExtra2 = intent.getStringExtra("mode");
        fu fuVar = c;
        if (fuVar.containsKey(stringExtra2)) {
            ((Integer) fuVar.get(stringExtra2)).intValue();
        }
        int intExtra = intent.getIntExtra("prompted_action_type", 0);
        com.google.bf.a.h a2 = com.google.bf.a.h.a(intExtra);
        com.google.bf.a.h hVar = a2;
        if (a2 == null) {
            com.google.common.f.h f = b.f();
            f.aj(com.google.common.f.a.e.a, "GmmBroadcastReceiver");
            com.google.common.f.h hVar2 = f;
            hVar2.ak(8221);
            hVar2.q("no majel.ActionType for: %d", intExtra);
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            hVar = com.google.bf.a.h.a;
        }
        this.d.n("onGmmNavStateChange", new a(this, str, intent, hVar));
    }
}
