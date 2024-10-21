package com.google.android.apps.gsa.nga.shared.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.shared.q.a.am;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.dw;
import com.google.android.apps.gsa.shared.util.g;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/a/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f832a;
    private final ComponentName b;
    private final x c;
    private final am d;

    public b(Context context, ComponentName componentName, x xVar, am amVar) {
        this.f832a = context;
        this.b = componentName;
        this.c = xVar;
        this.d = amVar;
    }

    public final void a(Bundle bundle) {
        ComponentName a2 = g.a(this.f832a, new Intent("com.google.android.voiceinteraction.START_VOICE_INTERACTION").setComponent(this.b).putExtras(bundle));
        this.c.b(new dw("NGA_START_ASSISTANT_INTERACTION_SUCCESS", a2 != null));
        Intent intent = (Intent) bundle.getParcelable("voice_intent");
        c cVar = c.UNKNOWN;
        if (intent != null) {
            cVar = c.a(intent.getIntExtra("nga_triggered_by", 0));
        }
        if (a2 == null) {
            this.d.d(1, cVar.cF, "componentName is null");
        } else {
            this.d.c(1, cVar.cF, 2);
        }
    }
}
