package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/ax.class */
final class ax extends n {

    /* renamed from: a, reason: collision with root package name */
    final az f71a;

    public ax(az azVar) {
        this.f71a = azVar;
    }

    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = bi.b;
            activity.getClass();
            bi findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            findFragmentByTag.a = this.f71a.h;
        }
    }

    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        az azVar = this.f71a;
        int i = azVar.c - 1;
        azVar.c = i;
        if (i == 0) {
            azVar.e.postDelayed(azVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        ay.a(activity, new aw(this));
    }

    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        az azVar = this.f71a;
        azVar.b--;
        azVar.c();
    }
}
