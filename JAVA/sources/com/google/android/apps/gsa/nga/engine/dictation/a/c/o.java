package com.google.android.apps.gsa.nga.engine.dictation.a.c;

import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ae.ao;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/dictation/a/c/o.class */
public final class o extends c implements Consumer, ao {

    /* renamed from: a, reason: collision with root package name */
    private static final d f547a = d.j();
    private final AtomicBoolean b;
    private final j c;
    private final Optional d;
    private final a e;
    private final ad f;
    private final ag g;

    public o(n nVar, j jVar, Optional optional, ad adVar, ag agVar, a aVar) {
        super(nVar, new op(Integer.valueOf(eu.cw.f1434a)));
        this.b = new AtomicBoolean(false);
        this.c = jVar;
        this.d = optional;
        this.f = adVar;
        this.g = agVar;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.dictation.a.c.o.a():void");
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        a();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer._CC.$default$andThen(this, consumer);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.i, com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.cw.f1434a))) {
            a();
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        if (!this.b.getAndSet(true)) {
            com.google.common.f.a.a d = f547a.d();
            d.ak(2880);
            d.p("Subscribing to eligibility updates [IVR-C]");
            this.d.ifPresent(new n(this, 1));
        }
        a();
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.ao
    public final void hi(boolean z) {
        a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        if (this.b.getAndSet(false)) {
            com.google.common.f.a.a d = f547a.d();
            d.ak(2881);
            d.p("Unsubscribing to eligibility updates [IVR-C]");
            this.d.ifPresent(new n(this, 0));
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "SysUiConnectionManager";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 11;
    }
}
