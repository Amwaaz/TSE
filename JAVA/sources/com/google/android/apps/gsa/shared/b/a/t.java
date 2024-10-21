package com.google.android.apps.gsa.shared.b.a;

import androidx.lifecycle.an;
import kotlinx.coroutines.a.ae;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/t.class */
final class t extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f1389a;
    final m.h.a.a b;
    final u c;
    final String d;
    final an e;
    private Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m.h.a.a aVar, u uVar, String str, an anVar, m.c.g gVar) {
        super(2, gVar);
        this.b = aVar;
        this.c = uVar;
        this.d = str;
        this.e = anVar;
    }

    public static final void d(u uVar, String str, ae aeVar, Object obj) {
        uVar.e(str, new s(aeVar, obj, (m.c.g) null, 0));
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((ae) obj, (m.c.g) obj2).b(w.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009c, code lost:
    
        if (kotlinx.coroutines.a.ac.a(r8, r0, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (kotlinx.coroutines.c.i.b(r0, r7) != r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            m.c.a.a r0 = m.c.a.a.a
            r11 = r0
            r0 = r7
            int r0 = r0.f1389a
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2b
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L1a
            r0 = r8
            m.k.b(r0)
            goto La2
        L1a:
            r0 = r7
            java.lang.Object r0 = r0.f
            kotlinx.coroutines.a.ae r0 = (kotlinx.coroutines.a.ae) r0
            r10 = r0
            r0 = r8
            m.k.b(r0)
            r0 = r10
            r8 = r0
            goto L86
        L2b:
            r0 = r8
            m.k.b(r0)
            r0 = r7
            java.lang.Object r0 = r0.f
            kotlinx.coroutines.a.ae r0 = (kotlinx.coroutines.a.ae) r0
            r8 = r0
            r0 = r7
            com.google.android.apps.gsa.shared.b.a.u r0 = r0.c
            r1 = r7
            java.lang.String r1 = r1.d
            r2 = r8
            r3 = r7
            m.h.a.a r3 = r3.b
            java.lang.Object r3 = r3.a()
            d(r0, r1, r2, r3)
            r0 = r7
            androidx.lifecycle.an r0 = r0.e
            r10 = r0
            r0 = r7
            com.google.android.apps.gsa.shared.b.a.u r0 = r0.c
            r12 = r0
            com.google.android.apps.gsa.shared.b.a.q r0 = new com.google.android.apps.gsa.shared.b.a.q
            r1 = r0
            r2 = r10
            r3 = r12
            r4 = r7
            java.lang.String r4 = r4.d
            r5 = r8
            r1.<init>(r2, r3, r4, r5)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.ex.k(r0)
            r1 = r12
            java.util.concurrent.Executor r1 = r1.k
            com.google.common.util.concurrent.cn r0 = com.google.common.util.concurrent.dl.q(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r8
            r0.f = r1
            r0 = r7
            r1 = 1
            r0.f1389a = r1
            r0 = r10
            r1 = r7
            java.lang.Object r0 = kotlinx.coroutines.c.i.b(r0, r1)
            r1 = r11
            if (r0 == r1) goto La6
        L86:
            com.google.android.apps.gsa.shared.b.a.k r0 = com.google.android.apps.gsa.shared.b.a.k.c
            r10 = r0
            r0 = r7
            r1 = 0
            r0.f = r1
            r0 = r7
            r1 = 2
            r0.f1389a = r1
            r0 = r8
            r1 = r10
            r2 = r7
            java.lang.Object r0 = kotlinx.coroutines.a.ac.a(r0, r1, r2)
            r1 = r11
            if (r0 != r1) goto La2
            goto La6
        La2:
            m.w r0 = m.w.a
            return r0
        La6:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.b.a.t.b(java.lang.Object):java.lang.Object");
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        t tVar = new t(this.b, this.c, this.d, this.e, gVar);
        tVar.f = obj;
        return tVar;
    }
}
