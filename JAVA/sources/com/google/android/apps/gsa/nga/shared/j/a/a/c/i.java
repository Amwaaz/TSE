package com.google.android.apps.gsa.nga.shared.j.a.a.c;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.d;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.libraries.search.assistant.invocation.u.h.b.d.b;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.o.or;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import m.c.g;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/c/i.class */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final Duration f950a;
    private static final Duration d;
    private static final ClientConfig e;
    public final com.google.android.libraries.g.a b;
    public final cr c;
    private final x f;
    private final b g;
    private final cr h;

    static {
        Duration ofSeconds = Duration.ofSeconds(10L);
        ofSeconds.getClass();
        f950a = ofSeconds;
        Duration ofSeconds2 = Duration.ofSeconds(5L);
        ofSeconds2.getClass();
        d = ofSeconds2;
        d dVar = new d();
        dVar.c = or.y;
        dVar.f1344a = 562949953978496L;
        dVar.d = "search";
        e = new ClientConfig(dVar);
    }

    public i(x xVar, com.google.android.libraries.g.a aVar, b bVar, cr crVar, cr crVar2) {
        xVar.getClass();
        aVar.getClass();
        crVar.getClass();
        crVar2.getClass();
        this.f = xVar;
        this.b = aVar;
        this.g = bVar;
        this.h = crVar;
        this.c = crVar2;
    }

    private final Object b(m.h.a.a aVar, g gVar) {
        Object b = kotlinx.coroutines.c.i.b(dl.q(ex.k(new c(aVar, 1)), this.h), gVar);
        return b == m.c.a.a.a ? b : w.a;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x033f: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:84:0x030e */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0312: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r20 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:84:0x030e */
    @Override // com.google.android.apps.gsa.nga.shared.j.a.a.c.a
    public final java.lang.Object a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r11, com.google.android.libraries.search.assistant.invocation.u.h.b.o r12, m.c.g r13) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.j.a.a.c.i.a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData, com.google.android.libraries.search.assistant.invocation.u.h.b.o, m.c.g):java.lang.Object");
    }
}
