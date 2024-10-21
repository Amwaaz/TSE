package com.google.android.apps.gsa.nga.engine.ar;

import com.google.android.apps.gsa.nga.engine.ar.b.b.s;
import com.google.android.apps.gsa.nga.engine.b.c.g;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.f.ab;
import com.google.common.o.qn;
import com.google.common.o.r;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/o.class */
public final class o {
    private final Optional b;
    private final com.google.android.apps.gsa.nga.engine.ak.o c;
    private final a d;
    private final i e;
    private final s g;
    private final AtomicReference f = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final e f493a = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.g.b.e.class);

    public o(Optional optional, com.google.android.apps.gsa.nga.engine.ak.o oVar, s sVar, a aVar, i iVar) {
        this.b = optional;
        this.c = oVar;
        this.g = sVar;
        this.d = aVar;
        this.e = iVar;
    }

    public final boolean a(String str) {
        String str2 = (String) this.f.get();
        if (str2 == null) {
            return false;
        }
        return Objects.equals(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, com.google.android.apps.gsa.nga.engine.ar.n] */
    public final boolean b(com.google.android.apps.gsa.nga.shared.u.f.o oVar, u uVar, com.google.android.apps.gsa.nga.engine.ak.t.a.b bVar, double d, boolean z) {
        ah b = bVar.b();
        if (b.equals(ah.FULL_LISTENING) || b.equals(ah.EXECUTING)) {
            return true;
        }
        if (this.b.isEmpty()) {
            return false;
        }
        m a2 = this.b.get().a(uVar, oVar, this.c.c(uVar, bVar.b.a.f()), 0.0d, z, this.d.i(eu.al) && !a(uVar.j.a.d()));
        boolean z2 = a2.c;
        boolean z3 = z2;
        if (!this.d.i(eu.af)) {
            z3 = z2 | a2.a;
        }
        if (z3) {
            if (!a(uVar.j.c().d)) {
                i iVar = this.e;
                g gVar = uVar.j;
                w wVar = w.NGA_DELIBERATE_INTENT_ACCEPTED_FOR_TRANSCRIPTION;
                com.google.android.apps.gsa.nga.shared.q.ah c = gVar.c();
                qn qnVar = (qn) r.a.createBuilder();
                int i = a2.e;
                qnVar.copyOnWrite();
                r rVar = qnVar.instance;
                rVar.d |= 67108864;
                rVar.am = i;
                iVar.m(wVar, c, qnVar);
            }
            this.f.set(uVar.j.c().d);
        }
        if (!a2.a) {
            uVar.d();
            ab abVar = com.google.common.f.a.e.a;
            return false;
        }
        s sVar = this.g;
        uVar.d();
        ab abVar2 = com.google.common.f.a.e.a;
        sVar.b.a(l.DELIBERATE_INPUT_DETECTED, com.google.android.apps.gsa.nga.shared.q.ah.a);
        this.f493a.b(Optional.of(uVar.j.a));
        return true;
    }
}
