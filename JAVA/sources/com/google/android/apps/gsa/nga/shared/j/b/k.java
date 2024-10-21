package com.google.android.apps.gsa.nga.shared.j.b;

import com.google.android.apps.gsa.nga.shared.j.c;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/b/k.class */
public final class k {
    private static final d b = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final Object f961a = new Object();
    private final ca c;

    public k(n nVar) {
        nVar.getClass();
        this.c = cl.d(new l(nVar, 1));
    }

    public final void a(c cVar) {
        ((Optional) this.c.a()).ifPresent(new i(cVar, 0));
    }

    public final void b(c cVar) {
        ((Optional) this.c.a()).ifPresent(new i(cVar, 1));
    }

    public final boolean c() {
        return ((Boolean) ((Optional) this.c.a()).map(new f(2)).orElse(false)).booleanValue();
    }

    public final boolean d(HotwordDetectedEventData hotwordDetectedEventData) {
        if (c()) {
            return ((Boolean) ((Optional) this.c.a()).map(new j(hotwordDetectedEventData)).orElse(false)).booleanValue();
        }
        com.google.common.f.a.a d = b.d();
        d.ak(5211);
        d.p("NGA not active, rejecting hotword event");
        return false;
    }
}
