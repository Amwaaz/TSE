package com.google.android.apps.gsa.staticplugins.nga.a.a;

import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.libraries.gsa.h.f;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/aq.class */
public final /* synthetic */ class aq implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1652a;
    public final Object b;
    private final int c;

    public /* synthetic */ aq(bg bgVar, ev evVar, int i) {
        this.c = i;
        this.b = bgVar;
        this.f1652a = evVar;
    }

    public /* synthetic */ aq(bg bgVar, Object obj, int i) {
        this.c = i;
        this.f1652a = bgVar;
        this.b = obj;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ((bg) this.f1652a).t = (String) this.b;
        } else if (i != 1) {
            ((bg) this.b).p = (ev) this.f1652a;
        } else {
            ((bg) this.f1652a).w = (Boolean) this.b;
        }
    }
}
