package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.q;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.bo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/h.class */
public final class h implements com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.ao f922a;
    public final kotlinx.coroutines.ag b;
    public final cr c;
    public final y d;
    private final ae e;
    private final com.google.android.libraries.search.ah.e.a.e.b f;
    private volatile bo g;
    private final String h;
    private final com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c i;

    public h(ae aeVar, com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar, com.google.android.libraries.search.ah.e.a.e.b bVar, y yVar, com.google.protobuf.ao aoVar, kotlinx.coroutines.ag agVar, cr crVar) {
        aeVar.getClass();
        cVar.getClass();
        bVar.getClass();
        agVar.getClass();
        crVar.getClass();
        this.e = aeVar;
        this.i = cVar;
        this.f = bVar;
        this.d = yVar;
        this.f922a = aoVar;
        this.b = agVar;
        this.c = crVar;
        this.h = "BistoHotwordListener";
    }

    @Override // com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(2:9|(2:11|12)(2:24|25))(4:26|27|28|(2:30|31))|13|14|(1:16)|17|(1:19)(2:21|22)))|34|6|7|(0)(0)|13|14|(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        r6 = m.k.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.gsa.nga.shared.j.a.a.a.ad r6, m.c.g r7) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.j.a.a.a.h.b(com.google.android.apps.gsa.nga.shared.j.a.a.a.ad, m.c.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.google.android.apps.gsa.nga.shared.j.a.a.a.ad r6, m.c.g r7) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.j.a.a.a.h.c(com.google.android.apps.gsa.nga.shared.j.a.a.a.ad, m.c.g):java.lang.Object");
    }

    @Override // com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m
    public final String d() {
        return this.h;
    }

    @Override // com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m
    public final void e(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.a aVar, Duration duration) {
        com.google.common.f.h d = i.f923a.d();
        d.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
        d.ak(5160);
        d.p("VIS ready, registering Bisto hotword listener.");
        bo boVar = this.g;
        if (boVar != null) {
            boVar.m((CancellationException) null);
        }
        this.g = cp.x(new kotlinx.coroutines.b.aq(new kotlinx.coroutines.b.aq(kotlinx.coroutines.b.aj.a(cp.r(this.e)), new aw(new com.google.apps.tiktok.concurrent.ai(new q(this) { // from class: com.google.android.apps.gsa.nga.shared.j.a.a.a.a

            /* renamed from: a, reason: collision with root package name */
            public final h f887a;

            {
                this.f887a = this;
            }

            public final cn a() {
                h hVar = this.f887a;
                return kotlinx.coroutines.c.i.e(hVar.b, (m.c.n) null, 0, new d(hVar, null), 3);
            }
        }, this.c), this, (m.c.g) null, 1), 5), new g(this, null), 1), this.b);
    }

    @Override // com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.c.m
    public final void f(Duration duration) {
        com.google.common.f.h d = i.f923a.d();
        d.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
        d.ak(5161);
        d.p("VIS shutting down, unregistering Bisto hotword listener.");
        bo boVar = this.g;
        if (boVar != null) {
            boVar.m((CancellationException) null);
        }
        this.g = null;
    }
}
