package com.google.android.apps.gsa.nga.shared.q.a;

import android.content.Context;
import com.google.android.apps.gsa.shared.k.et;
import com.google.android.apps.search.assistant.surfaces.voice.i.g.h.n;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.z.w.q;
import com.google.protobuf.ap;
import com.google.protobuf.ba;
import com.google.protobuf.ei;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.dc;
import kotlinx.coroutines.i.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f980a;
    private static final q i;
    public final com.google.common.v.f b;
    public final Context c;
    public final com.google.android.apps.gsa.shared.util.q.a d;
    public q g;
    private final kotlinx.coroutines.ag j;
    public final d h = new d();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/k$a.class */
    public interface a {
        com.google.android.apps.search.assistant.surfaces.voice.i.b.d wm();
    }

    static {
        ba createBuilder = q.a.createBuilder();
        ba createBuilder2 = ap.a.createBuilder();
        createBuilder2.getClass();
        ap s = ei.s(createBuilder2);
        createBuilder.copyOnWrite();
        q qVar = createBuilder.instance;
        qVar.c = s;
        qVar.b = 4;
        q build = createBuilder.build();
        build.getClass();
        i = build;
        f980a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.shared.q.a.k");
    }

    public k(com.google.common.v.f fVar, Context context, com.google.android.apps.gsa.shared.util.q.a aVar, kotlinx.coroutines.ag agVar) {
        this.b = fVar;
        this.c = context;
        this.d = aVar;
        this.j = agVar;
        ba createBuilder = q.a.createBuilder();
        ap apVar = ap.a;
        createBuilder.copyOnWrite();
        q qVar = createBuilder.instance;
        apVar.getClass();
        qVar.c = apVar;
        qVar.b = 1;
        q build = createBuilder.build();
        build.getClass();
        this.g = build;
    }

    private final l g(n nVar, com.google.android.apps.search.assistant.surfaces.voice.i.g.h.g gVar, q qVar) {
        return nVar != null ? new l(com.google.android.apps.search.assistant.surfaces.voice.i.b.e.a(nVar, gVar, (com.google.android.apps.search.assistant.surfaces.voice.i.g.h.g) null), true) : new l(qVar, false);
    }

    public final cn a(m.h.a.a aVar) {
        return !this.d.i(et.i) ? dl.n(i) : kotlinx.coroutines.c.i.e(this.j, (m.c.n) null, 0, new m(aVar, this, (m.c.g) null), 3);
    }

    public final cn b(m.h.a.a aVar) {
        return kotlinx.coroutines.c.i.e(this.j, (m.c.n) null, 0, new n(aVar, this, (m.c.g) null), 3);
    }

    public final Duration c() {
        Duration ofMillis = Duration.ofMillis(Math.min(this.d.d(et.d), 600L));
        ofMillis.getClass();
        return ofMillis;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(2:8|(3:10|11|12)(2:27|28))(4:29|30|31|(2:33|34)(7:35|36|37|38|39|40|(1:42)(2:43|44)))|14|15|16|17|18))|52|6|(0)(0)|14|15|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012b, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.apps.tiktok.account.AccountId r9, j$.time.Duration r10, m.c.g r11) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.q.a.k.d(com.google.apps.tiktok.account.AccountId, j$.time.Duration, m.c.g):java.lang.Object");
    }

    public final void e(AccountId accountId) {
        f(new p(accountId));
    }

    public final void f(m.h.a.a aVar) {
        if (this.d.i(et.i)) {
            dc.P(this.j, (m.c.n) null, 0, new o(this, aVar, (m.c.g) null), 3);
        }
    }
}
