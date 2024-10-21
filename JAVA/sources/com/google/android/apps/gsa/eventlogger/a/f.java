package com.google.android.apps.gsa.eventlogger.a;

import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/eventlogger/a/f.class */
public final class f implements com.google.android.apps.gsa.search.core.h.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f351a;

    public f(int i) {
        this.f351a = i;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        if (this.f351a != 0) {
            c.a(pVar);
        } else {
            e.a(pVar);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        if (this.f351a != 0) {
            c.a(pVar);
        } else {
            e.a(pVar);
        }
    }
}
