package com.google.android.apps.gsa.nga.engine.c;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.f.d$;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.libraries.mdi.c.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.g.am.b.a.k;
import com.google.protobuf.cu;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/h.class */
public final class h extends f {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.engine.v.i f528a;
    private final com.google.android.libraries.mdi.c.a.i b;
    private final AtomicReference c;
    private final y d;

    public h(Context context, n nVar, y yVar, j jVar, com.google.android.apps.gsa.nga.engine.v.i iVar) {
        super(nVar, yVar);
        this.c = new AtomicReference(Optional.empty());
        this.d = yVar;
        com.google.android.libraries.mdi.c.a.f fVar = new com.google.android.libraries.mdi.c.a.f(context, jVar);
        fVar.c = 2;
        this.b = new com.google.android.libraries.mdi.c.a.i(fVar);
        this.f528a = iVar;
    }

    public final com.google.g.am.b.a.i a(String str, String str2) {
        try {
            Optional findFirst = Collection._EL.stream(this.b.a()).filter(new p(str, 1)).findFirst();
            if (findFirst.isEmpty()) {
                return com.google.g.am.b.a.i.a;
            }
            k kVar = (k) findFirst.get();
            com.google.g.am.b.a.i iVar = com.google.g.am.b.a.i.a;
            str2.getClass();
            cu cuVar = kVar.d;
            if (cuVar.containsKey(str2)) {
                iVar = (com.google.g.am.b.a.i) cuVar.get(str2);
            }
            return iVar;
        } catch (com.google.android.libraries.mdi.c.a.j | CancellationException e) {
            e.getMessage();
            return com.google.g.am.b.a.i.a;
        }
    }

    public final void b(i iVar) {
        this.b.d.add(iVar);
    }

    public final void c(i iVar) {
        this.b.d.remove(iVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return !((Optional) this.c.get()).equals(this.d.c().c);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        this.f528a.b(w.NGA_APP_ACTIONS_ICING_CACHE_INIT_START);
        this.c.set(this.d.c().c);
        int i = Build.VERSION.SDK_INT;
        com.google.android.libraries.mdi.c.a.i iVar = this.b;
        if (i >= 33) {
            d$.ExternalSyntheticApiModelOutline5.m(iVar.f3123a, iVar.e, new IntentFilter("com.google.android.gms.icing.PROPAGATE_DELETE"), 2);
        } else {
            iVar.f3123a.registerReceiver(iVar.e, new IntentFilter("com.google.android.gms.icing.PROPAGATE_DELETE"));
        }
        return com.google.common.util.concurrent.i.g(c.h(cf.i(com.google.common.util.concurrent.i.g(iVar.b(), new d(1), iVar.c)), Throwable.class, new f(this), ay.a), new g(this), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        com.google.android.libraries.mdi.c.a.i iVar = this.b;
        iVar.f3123a.unregisterReceiver(iVar.e);
        return com.google.common.util.concurrent.i.g(ci.a, new e(0), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AppActionsIcingCache";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 5;
    }
}
