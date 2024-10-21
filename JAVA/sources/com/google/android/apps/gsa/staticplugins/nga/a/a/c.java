package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ca;
import com.google.common.base.cl;
import e.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1668a;
    public final a b;
    private final h f;
    public final Object c = new Object();
    private final Object g = new Object();
    public final List d = new ArrayList();
    public ca e = b();
    private AccessibilityManager h = d();

    public c(Context context, a aVar, h hVar) {
        this.f1668a = context;
        this.b = aVar;
        this.f = hVar;
    }

    private final AccessibilityManager d() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1668a.getSystemService("accessibility");
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(new ar(this, 1));
            accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.b

                /* renamed from: a, reason: collision with root package name */
                public final c f1658a;

                {
                    this.f1658a = this;
                }

                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    this.f1658a.c();
                }
            });
        }
        return accessibilityManager;
    }

    public final AccessibilityManager a() {
        AccessibilityManager accessibilityManager;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = d();
            }
            accessibilityManager = this.h;
        }
        return accessibilityManager;
    }

    public final ca b() {
        return cl.d(new o(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.f.n("[NGA] notifyAccessibilityStatusChanged", new a(this));
    }
}
