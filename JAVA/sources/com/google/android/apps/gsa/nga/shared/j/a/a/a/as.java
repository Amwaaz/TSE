package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.android.libraries.search.assistant.invocation.j.a.q;
import com.google.android.libraries.search.assistant.invocation.j.a.s;
import com.google.android.libraries.search.assistant.r.a.r;
import com.google.common.util.concurrent.cr;
import j$.time.Duration;
import kotlinx.coroutines.b.cm;
import kotlinx.coroutines.b.ct;
import kotlinx.coroutines.b.dc;
import kotlinx.coroutines.b.di;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/as.class */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public final Object f905a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlinx.coroutines.b.m] */
    public as(as asVar, q qVar, com.google.android.libraries.search.assistant.invocation.n.k kVar, kotlinx.coroutines.ag agVar, boolean z, as asVar2) {
        asVar.getClass();
        qVar.getClass();
        agVar.getClass();
        kotlinx.coroutines.b.m b = s.b(kVar.a(new kotlinx.coroutines.b.aq(kotlinx.coroutines.b.aj.a(r.h(new am(asVar.f905a, z), new ai(null, 0))), new ab((m.c.g) null, 3, (short[]) null), 5), kVar.c, new aj(asVar2)), "Legacy external hotword status", qVar, null, 12);
        Duration ofSeconds = Duration.ofSeconds(5L);
        ofSeconds.getClass();
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        ct c = r.c(kotlinx.coroutines.b.aj.a(r.k(b, ofSeconds, 1.5d, ofMinutes, 0.0d, new ab((m.c.g) null, 4, (int[]) null), 8)), agVar, null, 6);
        this.f905a = c;
        this.b = new ap(c);
    }

    public as(com.google.android.libraries.g.a aVar, com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar, ax axVar, kotlinx.coroutines.ag agVar, cr crVar, com.google.protobuf.ao aoVar) {
        aVar.getClass();
        cVar.getClass();
        axVar.getClass();
        agVar.getClass();
        crVar.getClass();
        this.b = aoVar;
        kotlinx.coroutines.b.m a2 = kotlinx.coroutines.b.aj.a(r.h(new cm(com.google.android.libraries.search.assistant.r.v.c(crVar, aVar, com.google.protobuf.b.a.a.c(aoVar)), axVar.f910a, new l(cVar, aVar, null)), new ai(null, 1, null)));
        int i = dc.a;
        this.f905a = r.c(a2, agVar, new di(0L, 0L), 4);
    }

    public as(com.google.android.libraries.search.assistant.invocation.n.d.i iVar, com.google.android.libraries.g.a aVar) {
        iVar.getClass();
        aVar.getClass();
        this.f905a = iVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.google.android.apps.gsa.nga.shared.j.a.a.a.o r9, com.google.android.apps.gsa.nga.shared.j.a.a.a.o r10, j$.time.Duration r11, com.google.android.apps.gsa.nga.shared.j.a.a.a.as r12, java.lang.String r13, m.h.a.l r14) {
        /*
            r0 = r14
            r1 = r9
            java.lang.Object r0 = r0.a(r1)
            com.google.android.apps.gsa.nga.shared.j.a.a.a.n r0 = (com.google.android.apps.gsa.nga.shared.j.a.a.a.n) r0
            r19 = r0
            r0 = r10
            if (r0 == 0) goto L27
            r0 = r14
            r1 = r10
            java.lang.Object r0 = r0.a(r1)
            com.google.android.apps.gsa.nga.shared.j.a.a.a.n r0 = (com.google.android.apps.gsa.nga.shared.j.a.a.a.n) r0
            r18 = r0
            r0 = r18
            r14 = r0
            r0 = r18
            if (r0 != 0) goto L32
        L27:
            com.google.android.apps.gsa.nga.shared.j.a.a.a.n r0 = new com.google.android.apps.gsa.nga.shared.j.a.a.a.n
            r1 = r0
            r2 = 0
            r3 = r11
            r1.<init>(r2, r3)
            r14 = r0
        L32:
            r0 = r19
            boolean r0 = r0.f927a
            if (r0 != 0) goto L3d
            goto L54
        L3d:
            r0 = r14
            boolean r0 = r0.f927a
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L55
            r0 = r9
            r1 = r10
            boolean r0 = h.a.a.p.b.a.f.h(r0, r1)
            if (r0 == 0) goto L54
            goto L55
        L54:
            return
        L55:
            r0 = r12
            java.lang.Object r0 = r0.f905a
            r9 = r0
            r0 = r11
            r1 = r19
            j$.time.Duration r1 = r1.b
            j$.time.Duration r0 = r0.minus(r1)
            r10 = r0
            r0 = r10
            java.lang.Class r0 = r0.getClass()
            r0 = r10
            long r0 = r0.toMillis()
            double r0 = (double) r0
            r15 = r0
            r0 = r9
            com.google.android.libraries.search.assistant.invocation.n.d.i r0 = (com.google.android.libraries.search.assistant.invocation.n.d.i) r0
            r11 = r0
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.n.d.g r0 = r0.f4322a
            r9 = r0
            r0 = r11
            java.lang.String r0 = r0.a()
            r10 = r0
            r0 = r11
            java.lang.String r0 = r0.b()
            r11 = r0
            r0 = r9
            com.google.common.base.ca r0 = r0.an
            java.lang.Object r0 = r0.a()
            com.google.android.libraries.ax.e r0 = (com.google.android.libraries.ax.e) r0
            r1 = r15
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r17
            r6 = 1
            r5 = r5 ^ r6
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            r0.b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.j.a.a.a.as.a(com.google.android.apps.gsa.nga.shared.j.a.a.a.o, com.google.android.apps.gsa.nga.shared.j.a.a.a.o, j$.time.Duration, com.google.android.apps.gsa.nga.shared.j.a.a.a.as, java.lang.String, m.h.a.l):void");
    }
}
