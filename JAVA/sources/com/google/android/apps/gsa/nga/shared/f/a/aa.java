package com.google.android.apps.gsa.nga.shared.f.a;

import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.shared.f.ah;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/aa.class */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final h f858a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final cg g;
    public final cg h;
    public final cg i;
    public final cg j;
    public final cg k;
    private final bj l = new bj();
    public final AtomicReference f = new AtomicReference(new u());

    public aa(aw awVar, n nVar, cg cgVar, cg cgVar2, cg cgVar3, cg cgVar4, cg cgVar5) {
        this.f858a = awVar.a(z.class);
        this.g = cgVar;
        this.h = cgVar2;
        this.i = cgVar3;
        this.j = cgVar4;
        this.k = cgVar5;
        this.b = new AtomicReference(nVar.f865a);
        this.c = new AtomicReference(nVar.b);
        this.d = new AtomicReference(nVar.c);
        this.e = new AtomicReference(nVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.apps.gsa.nga.shared.f.m a() {
        return (com.google.android.apps.gsa.nga.shared.f.m) e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.d.get()));
    }

    public final com.google.android.apps.gsa.nga.shared.f.af b() {
        return (com.google.android.apps.gsa.nga.shared.f.af) e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.b.get()));
    }

    public final ah c() {
        return (ah) e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.c.get()));
    }

    final cn d() {
        return this.l.b(new v(this), ay.a);
    }
}
