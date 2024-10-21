package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.android.libraries.search.assistant.invocation.g.a.a.s;
import com.google.android.libraries.search.assistant.r.a.r;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.b.ct;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/w.class */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f931a;
    public final ct b;
    public final s c;
    private final kotlinx.coroutines.ag d;

    public w(s sVar, kotlinx.coroutines.ag agVar) {
        sVar.getClass();
        agVar.getClass();
        this.c = sVar;
        this.d = agVar;
        this.f931a = new AtomicInteger();
        kotlinx.coroutines.b.m a2 = kotlinx.coroutines.b.aj.a(com.google.android.libraries.search.assistant.r.a.a.g.a("HOTWORD_ENROLLMENT_STATE_CHANGED", new t(this, null), new ba(this, 1)));
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        this.b = r.c(r.k(a2, ofSeconds, 1.5d, ofMinutes, 0.0d, new ab((m.c.g) null, 1, (byte[]) null), 8), agVar, null, 6);
    }
}
