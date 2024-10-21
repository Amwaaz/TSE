package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.android.apps.gsa.nga.shared.j.a.a.r;
import com.google.android.libraries.search.assistant.invocation.j.a.q;
import com.google.android.libraries.search.assistant.invocation.j.a.s;
import com.google.common.f.j;
import j$.time.Duration;
import kotlinx.coroutines.b.ct;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ah.class */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public static final j f895a = j.i("com.google.android.apps.gsa.nga.shared.j.a.a.a.ah");
    public final ct b;

    public ah(r rVar, com.google.android.libraries.search.assistant.invocation.g.a.a aVar, bc bcVar, ac acVar, w wVar, kotlinx.coroutines.ag agVar, q qVar) {
        rVar.getClass();
        wVar.getClass();
        agVar.getClass();
        qVar.getClass();
        kotlinx.coroutines.b.m b = s.b(kotlinx.coroutines.b.aj.a(new kotlinx.coroutines.b.a.n(new ag(null, aVar, bcVar, acVar, wVar), rVar)), "Legacy external hotword consumer configuration", qVar, null, 12);
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(5L);
        ofMinutes.getClass();
        this.b = com.google.android.libraries.search.assistant.r.a.r.c(com.google.android.libraries.search.assistant.r.a.r.k(b, ofSeconds, 1.5d, ofMinutes, 0.0d, new ab((m.c.g) null, 2, (char[]) null), 8), agVar, null, 6);
    }
}
