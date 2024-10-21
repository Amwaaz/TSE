package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/aa.class */
final class aa extends n {
    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = bi.b;
        bg.d(activity);
    }

    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
