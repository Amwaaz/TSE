package com.google.android.apps.gsa.search.core.service.e.a;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/j.class */
public final class j implements com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.search.core.service.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1182a = new AtomicBoolean();
    public final com.google.android.apps.gsa.search.core.service.e.a.a.c b;
    private final com.google.android.apps.gsa.search.core.service.e.b.c c;

    public j(com.google.android.apps.gsa.search.core.service.e.b.c cVar, com.google.android.apps.gsa.search.core.service.e.a.a.c cVar2) {
        this.b = cVar2;
        this.c = cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.service.b.a
    public final void a() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r0.a != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection b() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            com.google.android.apps.gsa.search.core.service.e.a.a.c r0 = r0.b     // Catch: java.lang.Throwable -> L7e
            r8 = r0
            r0 = r5
            com.google.android.apps.gsa.search.core.service.e.b.c r0 = r0.c     // Catch: java.lang.Throwable -> L7e
            com.google.android.apps.gsa.search.core.service.e.a r0 = r0.a()     // Catch: java.lang.Throwable -> L7e
            r9 = r0
            r0 = r9
            com.google.android.apps.gsa.search.core.service.e.a r1 = com.google.android.apps.gsa.search.core.service.e.a.IDLE     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L28
            r0 = r8
            r1 = 0
            r0.c = r1     // Catch: java.lang.Throwable -> L7e
            r0 = r8
            java.util.Queue r0 = r0.b     // Catch: java.lang.Throwable -> L7e
            java.util.Collection r0 = j$.util.DesugarCollections.unmodifiableCollection(r0)     // Catch: java.lang.Throwable -> L7e
            r6 = r0
            goto L75
        L28:
            r0 = r8
            com.google.android.apps.gsa.search.core.service.e.a.a.a r0 = r0.c     // Catch: java.lang.Throwable -> L7e
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L3c
            r0 = r7
            r6 = r0
            r0 = r7
            com.google.android.apps.gsa.search.core.service.e.a r0 = r0.a     // Catch: java.lang.Throwable -> L7e
            r1 = r9
            if (r0 == r1) goto L70
        L3c:
            r0 = r8
            com.google.android.apps.gsa.search.core.service.e.a.a.b r0 = r0.f1173a     // Catch: java.lang.Throwable -> L7e
            r6 = r0
            r0 = r8
            java.util.Queue r0 = r0.b     // Catch: java.lang.Throwable -> L7e
            r7 = r0
            r0 = r6
            k.a.a r0 = r0.f1172a     // Catch: java.lang.Throwable -> L7e
            r10 = r0
            com.google.android.apps.gsa.search.core.service.e.a.a.a r0 = new com.google.android.apps.gsa.search.core.service.e.a.a.a     // Catch: java.lang.Throwable -> L7e
            r6 = r0
            r0 = r10
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L7e
            com.google.android.apps.gsa.search.core.service.e.a.m r0 = (com.google.android.apps.gsa.search.core.service.e.a.m) r0     // Catch: java.lang.Throwable -> L7e
            r10 = r0
            r0 = r10
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L7e
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L7e
            r0 = r8
            r1 = r6
            r0.c = r1     // Catch: java.lang.Throwable -> L7e
        L70:
            r0 = r6
            java.util.Queue r0 = r0.c     // Catch: java.lang.Throwable -> L7e
            r6 = r0
        L75:
            r0 = r6
            java.util.Collection r0 = j$.util.DesugarCollections.unmodifiableCollection(r0)     // Catch: java.lang.Throwable -> L7e
            r6 = r0
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            return r0
        L7e:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.e.a.j.b():java.util.Collection");
    }

    public final boolean c(com.google.android.apps.gsa.search.core.service.e.g gVar) {
        com.google.android.apps.gsa.search.core.service.e.a.a.c cVar = this.b;
        boolean remove = cVar.b.remove(gVar);
        boolean z = remove;
        if (remove) {
            com.google.android.apps.gsa.search.core.service.e.a.a.a aVar = cVar.c;
            z = remove;
            if (aVar != null) {
                if (aVar.b.a(gVar)) {
                    aVar.c.remove(gVar);
                    return true;
                }
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkControllerQueue");
        fVar.b("newWorkInQueue").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.f1182a.get()), false));
        fVar.q("WorkProxies");
        Iterator it = DesugarCollections.unmodifiableCollection(this.b.b).iterator();
        while (it.hasNext()) {
            fVar.k((com.google.android.apps.gsa.search.core.service.e.g) it.next());
        }
    }
}
