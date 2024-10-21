package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import io.grpc.cx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/az.class */
public final class az extends m.c.b.a.h implements m.h.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f912a;
    final bc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(bc bcVar, m.c.g gVar) {
        super(1, gVar);
        this.b = bcVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new az(this.b, (m.c.g) obj).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f912a;
        m.k.b(obj);
        if (i == 0) {
            com.google.common.f.h d = bc.f916a.d();
            d.aj(com.google.common.f.a.e.a, "TRG.VMConfigProv");
            d.ak(5174);
            d.p("Fetching HotwordConfig.");
            bc bcVar = this.b;
            com.google.protobuf.ba createBuilder = com.google.android.libraries.search.ah.e.a.f.d.f3750a.createBuilder();
            createBuilder.getClass();
            com.google.android.libraries.search.ah.e.a.f.d d2 = com.google.android.libraries.search.ah.e.a.f.l.d(createBuilder);
            this.f912a = 1;
            Object b = bcVar.c.b(d2, new cx(), this);
            obj = b;
            if (b == aVar) {
                return aVar;
            }
        }
        com.google.android.libraries.search.ah.e.a.f.e eVar = (com.google.android.libraries.search.ah.e.a.f.e) obj;
        return new ay(eVar.d, eVar.e, this.b.e.getAndIncrement());
    }
}
