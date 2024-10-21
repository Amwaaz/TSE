package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ar.class */
public final /* synthetic */ class ar implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final Object f1653a;
    private final int b;

    public /* synthetic */ ar(Object obj, int i) {
        this.b = i;
        this.f1653a = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (this.b != 0) {
            ((c) this.f1653a).c();
        } else {
            ((bg) this.f1653a).h();
        }
    }
}
