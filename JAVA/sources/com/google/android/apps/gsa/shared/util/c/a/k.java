package com.google.android.apps.gsa.shared.util.c.a;

import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.o.bl;
import com.google.common.o.br;
import com.google.common.o.qn;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/k.class */
public final class k implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.libraries.g.a f1533a;
    public final as c;
    public final com.google.android.apps.gsa.shared.o.a.a d;
    public final aw f;
    private final ThreadPoolExecutor g;
    public final Set e = Collections.newSetFromMap(new WeakHashMap());
    public final String b = "UserFacingBlocking";

    public k(com.google.android.libraries.g.a aVar, com.google.android.apps.gsa.shared.o.a.a aVar2, aw awVar) {
        this.f1533a = aVar;
        this.d = aVar2;
        this.f = awVar;
        com.google.android.apps.gsa.shared.o.a.a aVar3 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 300L, TimeUnit.SECONDS, new SynchronousQueue(), new i("UserFacingBlocking", 0));
        this.g = threadPoolExecutor;
        this.c = new as(threadPoolExecutor);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        com.google.protobuf.ba createBuilder = br.a.createBuilder();
        createBuilder.copyOnWrite();
        br brVar = createBuilder.instance;
        brVar.b |= 1;
        brVar.c = this.b;
        createBuilder.copyOnWrite();
        br brVar2 = createBuilder.instance;
        brVar2.b |= 64;
        brVar2.l = true;
        createBuilder.copyOnWrite();
        br brVar3 = createBuilder.instance;
        brVar3.b |= 16;
        brVar3.j = false;
        createBuilder.copyOnWrite();
        br brVar4 = createBuilder.instance;
        brVar4.b |= 4;
        brVar4.e = 25;
        int poolSize = this.g.getPoolSize();
        createBuilder.copyOnWrite();
        br brVar5 = createBuilder.instance;
        brVar5.b |= 2;
        brVar5.d = poolSize;
        br build = createBuilder.build();
        qn qnVar = fVar.c;
        qnVar.copyOnWrite();
        bl blVar = qnVar.instance;
        bl blVar2 = bl.a;
        build.getClass();
        blVar.a();
        blVar.g.add(build);
        synchronized (this.e) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((ap) it.next()).hq(fVar);
            }
        }
    }
}
