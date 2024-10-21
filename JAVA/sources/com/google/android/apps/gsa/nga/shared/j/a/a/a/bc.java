package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.Context;
import com.google.android.libraries.search.assistant.r.a.r;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.f.j;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.b.ct;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/bc.class */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public static final j f916a = j.i("com.google.android.apps.gsa.nga.shared.j.a.a.a.bc");
    public final Context b;
    public final com.google.android.libraries.search.ah.e.a.f.n c;
    public final dj d;
    public final AtomicInteger e;
    public final ct f;
    private final kotlinx.coroutines.ag g;

    public bc(Context context, com.google.android.libraries.search.ah.e.a.f.n nVar, kotlinx.coroutines.ag agVar, dj djVar) {
        context.getClass();
        nVar.getClass();
        agVar.getClass();
        djVar.getClass();
        this.b = context;
        this.c = nVar;
        this.g = agVar;
        this.d = djVar;
        this.e = new AtomicInteger(0);
        kotlinx.coroutines.b.m a2 = com.google.android.libraries.search.assistant.r.a.a.g.a("VOICE_MATCH_SETTINGS", new az(this, null), new ba(this, 0));
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        this.f = r.c(kotlinx.coroutines.b.aj.a(r.k(a2, ofSeconds, 1.5d, ofMinutes, 0.0d, new ab((m.c.g) null, 5, (boolean[]) null), 8)), agVar, null, 6);
    }
}
