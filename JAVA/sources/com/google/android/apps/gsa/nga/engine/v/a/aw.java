package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.b.c.g;
import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.recognition.h;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.libraries.g.a;
import com.google.common.f.a.d;
import com.google.common.o.qn;
import com.google.common.o.r;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/aw.class */
public final class aw {
    private static final d e = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final i f811a;
    public final Object b = new Object();
    public ah c;
    public boolean d;
    private final a f;
    private v g;
    private String h;
    private long i;
    private final y j;

    public aw(i iVar, a aVar, y yVar) {
        this.f811a = iVar;
        this.f = aVar;
        this.j = yVar;
    }

    public static w a(h hVar) {
        switch (hVar.ordinal()) {
            case 0:
                return w.NGA_ASR_RECOGNITION_START;
            case 1:
                return w.NGA_SODA_RECOGNITION_START;
            case 2:
                return w.NGA_SYSTEM_RECOGNITION_START;
            case 3:
            case 6:
            case 8:
                return w.NGA_TEXT_QUERY_RECOGNITION_START;
            case 4:
                return w.NGA_PROACTIVE_RECOGNITION_START;
            case 5:
                return w.NGA_SUGGESTION_CHIP_RECOGNITION_START;
            case 7:
                return w.NGA_S3_RECOGNITION_START;
            case 9:
                return w.NGA_WATCH_SUGGESTION_CHIP_RECOGNITION_START;
            case 10:
                return w.CONVERSATION_API_INTERACTION_START;
            case 11:
                return w.NGA_TITAN_VOICE_PLATE_START;
            default:
                return w.NGA_UNKNOWN_RECOGNITION_START;
        }
    }

    public final void b(ah ahVar) {
        this.f811a.c(w.NGA_EXECUTION_DONE, ahVar);
    }

    public final void c(w wVar, ah ahVar) {
        ah ahVar2;
        boolean z;
        synchronized (this.b) {
            ahVar2 = this.c;
            this.c = null;
            z = this.d;
            this.d = false;
        }
        ah ahVar3 = ahVar;
        if (ahVar2 != null) {
            ahVar3 = ahVar;
            if (ahVar2.d.equals(ahVar.d)) {
                ahVar3 = ahVar2;
            }
        }
        if (!z) {
            this.f811a.e(wVar, ahVar3);
            return;
        }
        qn createBuilder = r.a.createBuilder();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        rVar.e |= 32;
        rVar.aq = true;
        this.f811a.l(wVar, ahVar3, createBuilder);
    }

    public final void d(u uVar) {
        boolean z;
        long j;
        String str;
        Object obj = this.b;
        long b = this.f.b();
        synchronized (obj) {
            String b2 = com.google.android.apps.gsa.nga.shared.ag.a.b(uVar.b(), this.j.c().d);
            v vVar = uVar.j.a;
            v vVar2 = this.g;
            z = true;
            if (vVar2 != null && vVar2.equals(vVar)) {
                z = false;
            }
            if (z || ((str = this.h) != null && !str.equals(b2))) {
                this.g = uVar.j.a;
                this.i = b;
                this.h = b2;
            }
            j = this.i;
        }
        if (z) {
            i iVar = this.f811a;
            h hVar = uVar.l;
            g gVar = uVar.j;
            w a2 = a(hVar);
            ah c = gVar.c();
            qn qnVar = (qn) r.a.createBuilder();
            Optional optional = uVar.m;
            qnVar.getClass();
            optional.ifPresent(new l(qnVar, 5));
            iVar.n(a2, c, qnVar, b);
        }
        this.f811a.d(w.NGA_RECOGNITION_CANDIDATE_START, uVar.j.c(), b);
        if (uVar.d()) {
            if (!Duration.ofNanos(b - j).isZero()) {
                com.google.common.f.a.a d = e.d();
                d.ak(3570);
                d.s("Speech endpoint delay of %.1f seconds", Double.valueOf(r0.toMillis() / 1000.0d));
            }
            this.f811a.h(w.NGA_RECOGNITION_FINAL_TEXT, uVar.j.c(), j);
            this.f811a.h(w.NGA_RECOGNITION_END, uVar.j.c(), b);
        }
    }
}
