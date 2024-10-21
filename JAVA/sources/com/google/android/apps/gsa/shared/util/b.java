package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/b.class */
public final class b {

    /* renamed from: a */
    public final AccessibilityManager f1503a;

    public b(AccessibilityManager accessibilityManager) {
        this.f1503a = accessibilityManager;
    }

    public static void a(View view, long j) {
        if (view == null) {
            ab abVar = e.a;
        } else {
            view.postDelayed(new a(view), j);
        }
    }

    public final void b(Context context, String str) {
        if (cl.L(str) || !this.f1503a.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(16384);
        obtain.setClassName(context.getClass().getName());
        obtain.setPackageName(context.getPackageName());
        obtain.getText().add(str);
        this.f1503a.sendAccessibilityEvent(obtain);
    }

    public final boolean c() {
        return this.f1503a.isEnabled() && this.f1503a.isTouchExplorationEnabled();
    }
}
