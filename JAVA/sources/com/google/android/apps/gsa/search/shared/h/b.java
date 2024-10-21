package com.google.android.apps.gsa.search.shared.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.apps.gsa.shared.util.g;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/h/b.class */
public class b {
    private static final j b = j.i("com.google.android.apps.gsa.search.shared.h.b");

    /* renamed from: a, reason: collision with root package name */
    public final k f1325a;
    private final Context c;
    private final ComponentName d;

    public b(Context context, ComponentName componentName, k kVar) {
        this.c = context;
        this.d = componentName;
        this.f1325a = kVar;
    }

    public static Intent a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("InteractorSessionFlags", 8);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    private final Intent f(Intent intent, int i) {
        ab abVar = e.a;
        if (this.f1325a.a()) {
            intent.putExtra("InteractorMode", i);
            Bundle bundle = new Bundle();
            bundle.putParcelable("voice_intent", intent);
            return new Intent("com.google.android.voiceinteraction.START_VOICE_INTERACTION").setComponent(this.d).putExtras(bundle);
        }
        h f = b.f();
        f.aj(e.a, "VISessionStarter");
        h hVar = f;
        hVar.ak(8411);
        hVar.p("Caller should have checked if we could have started a voice session before calling this method. Noop.");
        return null;
    }

    public final Intent b(Bundle bundle) {
        return f(a(bundle), 1);
    }

    public final void c(Bundle bundle) {
        e(a(bundle), 1);
    }

    public final void d(Bundle bundle) {
        e(a(bundle), 1);
    }

    public final void e(Intent intent, int i) {
        Intent f = f(intent, i);
        if (f != null) {
            g.a(this.c, f);
        }
    }
}
