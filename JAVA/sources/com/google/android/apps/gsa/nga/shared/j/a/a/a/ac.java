package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.Context;
import com.google.android.libraries.search.assistant.r.a.r;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.f.j;
import j$.time.Duration;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.ct;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final j f890a = j.i("com.google.android.apps.gsa.nga.shared.j.a.a.a.ac");
    public final Context b;
    public final dj c;
    public final ct d;
    private final kotlinx.coroutines.ag e;

    public ac(Context context, kotlinx.coroutines.ag agVar, dj djVar) {
        context.getClass();
        agVar.getClass();
        djVar.getClass();
        this.b = context;
        this.e = agVar;
        this.c = djVar;
        kotlinx.coroutines.b.m e = r.e(kotlinx.coroutines.b.aj.a(cp.r(new kotlinx.coroutines.b.d(new aa(this, null)))), "Hotword in-enrollment status", f890a);
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        this.d = r.c(r.k(e, ofSeconds, 1.5d, ofMinutes, 0.0d, new ab(null, 0), 8), agVar, null, 6);
    }
}
