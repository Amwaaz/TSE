package com.google.android.apps.gsa.search.core.state.d;

import com.google.common.base.cl;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.time.Duration;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/d.class */
public class d extends com.google.android.apps.gsa.search.core.state.ae implements com.google.android.apps.gsa.search.core.state.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1281a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.d");
    static final int[] b = {500, 10000, 600000, 1800000, 3600000, 7200000};
    public final Queue c;
    public boolean d;
    public boolean e;
    private boolean f;
    private int g;
    private long h;
    private final com.google.android.apps.gsa.search.core.ae.c.a i;
    private cn j;
    private long k;
    private final com.google.android.libraries.gsa.h.h l;
    private final com.google.android.libraries.g.a m;

    public d(e.a aVar, com.google.android.libraries.g.a aVar2, com.google.android.apps.gsa.search.core.ae.c.a aVar3, com.google.android.libraries.gsa.h.h hVar) {
        super(aVar, 11);
        this.c = new ArrayDeque();
        this.h = -1L;
        this.k = -1L;
        this.i = aVar3;
        this.m = aVar2;
        this.l = hVar;
    }

    private final void l() {
        cn cnVar;
        if (this.d || (cnVar = this.j) == null) {
            return;
        }
        cnVar.cancel(false);
        this.j = null;
        this.k = -1L;
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.a
    public final void a() {
        i();
        f();
    }

    @Override // com.google.android.apps.gsa.search.core.state.a.a
    public final void b(ba baVar) {
        this.c.add(baVar);
        f();
    }

    final void c() {
        com.google.common.f.h e = f1281a.e();
        e.ak(7914);
        e.p("Sending failed");
        cl.u(this.d);
        this.d = false;
        this.g++;
        f();
    }

    public final void f() {
        boolean z = true;
        boolean z2 = (this.d || this.c.isEmpty()) ? false : true;
        boolean z3 = this.d;
        if (z2 && (!this.f || this.h < 0)) {
            int[] iArr = b;
            int i = this.g;
            int length = iArr.length;
            this.h = this.m.f().toEpochMilli() + iArr[Math.min(i, 5)];
        }
        this.f = z2;
        boolean z4 = (!this.c.isEmpty()) | z3;
        if (this.e != z4) {
            this.e = z4;
        } else {
            z = false;
        }
        if (this.f) {
            long j = this.h;
            if (this.j != null && this.k != j) {
                l();
            }
            if (this.j == null) {
                this.k = j;
                long epochMilli = j - this.m.f().toEpochMilli();
                if (epochMilli <= 0) {
                    k();
                } else {
                    this.j = this.l.j("startUploadFromMainThread", Duration.ofMillis(epochMilli), new c(this));
                }
            }
        } else {
            l();
        }
        if (!z || this.d) {
            return;
        }
        an();
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ActionVeLoggingState");
        fVar.b("ReadyToSend").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.f), false));
        fVar.b("SendingEvents").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.d), false));
        fVar.b("HasPendingWork").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.e), false));
        fVar.b("PendingSessions").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.c.size()), false));
    }

    public final void i() {
        this.g = 0;
        this.h = -1L;
    }

    public final void k() {
        this.j = null;
        this.k = -1L;
        if (this.f) {
            com.google.android.apps.gsa.search.core.ae.c.a aVar = this.i;
            cl.u(!this.d);
            this.d = true;
            f();
            ba baVar = (ba) this.c.peek();
            baVar.getClass();
            new com.google.android.apps.gsa.shared.util.c.ae(aVar.c(baVar), this.l, "start VE session upload").a(new b(this, 1)).a(new b(this, 0));
        }
    }
}
