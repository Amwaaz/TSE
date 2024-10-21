package com.google.android.apps.gsa.nga.shared.j.a.a;

import com.google.android.libraries.search.account.k;
import com.google.android.libraries.search.assistant.r.a.a.g;
import com.google.common.f.j;
import j$.time.Duration;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.b.aj;
import kotlinx.coroutines.b.ct;
import kotlinx.coroutines.b.m;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/y.class */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final j f959a = j.i("com.google.android.apps.gsa.nga.shared.j.a.a.y");
    public final ct b;
    public final k c;
    private final ag d;

    public y(k kVar, ag agVar, com.google.android.libraries.search.assistant.invocation.j.a.q qVar) {
        kVar.getClass();
        agVar.getClass();
        qVar.getClass();
        this.c = kVar;
        this.d = agVar;
        m b = com.google.android.libraries.search.assistant.invocation.j.a.s.b(aj.a(g.a("LEGACY_HOTWORD_CONSUMER_ACCOUNT", new s(this, null), new v(this))), "Legacy hotword consumer account", qVar, null, 12);
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        this.b = com.google.android.libraries.search.assistant.r.a.r.c(com.google.android.libraries.search.assistant.r.a.r.f(b, ofSeconds, 1.5d, ofMinutes, 0.1d, new w(null)), agVar, null, 6);
    }
}
