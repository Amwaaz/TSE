package com.google.android.apps.gsa.nga.shared.aj.a;

import android.app.ActivityOptions;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.shared.a.b;
import com.google.android.apps.gsa.nga.shared.android.IntentLauncherActivity;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/aj/a/c.class */
public class c {
    private static final d d = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Context f842a;
    private final KeyguardManager e;
    private final b g;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    private final Queue f = new ArrayDeque();

    public c(b bVar, Context context) {
        this.g = bVar;
        this.f842a = context;
        this.e = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public c(b bVar, Context context, KeyguardManager keyguardManager) {
        this.g = bVar;
        this.f842a = context;
        this.e = keyguardManager;
    }

    private static String g(Intent intent) {
        String stringExtra = intent.getStringExtra("utterance_id");
        String str = stringExtra;
        if (stringExtra == null) {
            a e = d.e();
            e.ak(5852);
            e.p("Unexpected empty utteranceId");
            str = "";
        }
        return str;
    }

    public void a(Consumer consumer, String str) {
        com.google.android.apps.gsa.nga.shared.aj.a aVar = (com.google.android.apps.gsa.nga.shared.aj.a) this.c.get();
        if (aVar != null) {
            e$.ExternalSyntheticApiModelOutline0.m(consumer, aVar);
            return;
        }
        synchronized (this.f) {
            this.f.add(consumer);
        }
        b bVar = this.g;
        com.google.android.apps.gsa.nga.shared.a.a aVar2 = new com.google.android.apps.gsa.nga.shared.a.a();
        aVar2.e(str);
        bVar.a(aVar2.a());
    }

    public final void b(com.google.android.apps.gsa.nga.shared.aj.a aVar) {
        this.c.set(aVar);
        Consumer m = e$.ExternalSyntheticApiModelOutline0.m(this.b.getAndSet(null));
        if (m != null) {
            e$.ExternalSyntheticApiModelOutline0.m(m, aVar);
        }
        synchronized (this.f) {
            while (!this.f.isEmpty()) {
                e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.f.remove()), aVar);
            }
        }
    }

    public final void c(com.google.android.apps.gsa.nga.shared.aj.a aVar) {
        if (this.c.get() == null) {
            b(aVar);
        }
    }

    public final void d(Intent intent) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 31) {
            bundle = ActivityOptions.makeBasic().toBundle();
            bundle.putInt("android.activity.splashScreenStyle", 1);
        } else {
            bundle = null;
        }
        if (this.e.isKeyguardLocked()) {
            IntentLauncherActivity.a(this.f842a, intent, false, bundle);
        } else {
            this.f842a.startActivity(intent, bundle);
        }
    }

    public final void e(Intent intent) {
        a(new a(intent, 1), g(intent));
    }

    public final void f(Intent intent) {
        a(new a(intent, 2), g(intent));
    }
}
