package com.google.android.apps.gsa.staticplugins.opa.ambient.c.b.g;

import com.google.common.base.ca;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/b/g/a.class */
public final class a {

    /* renamed from: a */
    private boolean f1753a = false;
    private Object b = null;

    public final Object a(ca caVar) {
        if (!this.f1753a) {
            synchronized (this) {
                if (!this.f1753a) {
                    this.b = caVar.a();
                    this.f1753a = true;
                }
            }
        }
        return this.b;
    }

    public final void b(ca caVar) {
        synchronized (this) {
            if (this.f1753a) {
                this.b = caVar.a();
            }
        }
    }
}
