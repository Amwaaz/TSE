package com.google.android.apps.gsa.nga.shared.j.a.a.b;

import com.google.android.libraries.search.ah.ac;
import com.google.android.libraries.search.ah.ar;
import com.google.android.libraries.search.ah.y;
import com.google.android.libraries.search.assistant.invocation.u.h.b.b.am;
import com.google.android.libraries.search.assistant.invocation.u.h.b.b.an;
import com.google.android.libraries.search.assistant.invocation.u.h.b.b.t;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/b/l.class */
public final class l implements an {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.j.a.a.c f943a;
    public final int b;
    private final AccountId c;
    private final String d;
    private final String e;
    private final am f;
    private final com.google.android.libraries.search.ah.f g;

    public l(AccountId accountId, String str, String str2, int i, com.google.android.apps.gsa.nga.shared.j.a.a.c cVar) {
        accountId.getClass();
        str2.getClass();
        this.c = accountId;
        this.d = str;
        this.e = str2;
        this.b = i;
        this.f943a = cVar;
        this.f = new k(this);
        ba createBuilder = com.google.android.libraries.search.ah.f.f3794a.createBuilder();
        createBuilder.getClass();
        ba createBuilder2 = ac.f3645a.createBuilder();
        createBuilder2.getClass();
        ar.k(i == 0 ? 1 : 2, createBuilder2);
        ac j = ar.j(createBuilder2);
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ah.f fVar = (com.google.android.libraries.search.ah.f) createBuilder.instance;
        fVar.d = j;
        fVar.b |= 2;
        ba createBuilder3 = y.f3948a.createBuilder();
        createBuilder3.getClass();
        ar.o(str2, createBuilder3);
        y n = ar.n(createBuilder3);
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ah.f fVar2 = (com.google.android.libraries.search.ah.f) createBuilder.instance;
        fVar2.c = n;
        fVar2.b |= 1;
        ba createBuilder4 = o.a.b.c.b.g.a.createBuilder();
        createBuilder4.getClass();
        ba createBuilder5 = o.a.b.c.b.f.a.createBuilder();
        createBuilder5.getClass();
        int i2 = i == 0 ? 3 : i - 1 != 0 ? 5 : 4;
        createBuilder5.copyOnWrite();
        o.a.b.c.b.f fVar3 = createBuilder5.instance;
        fVar3.c = i2 - 2;
        fVar3.b |= 1;
        o.a.b.c.b.f build = createBuilder5.build();
        build.getClass();
        o.a.b.c.b.f fVar4 = build;
        createBuilder4.copyOnWrite();
        o.a.b.c.b.g gVar = createBuilder4.instance;
        gVar.c = fVar4;
        gVar.b = 2;
        o.a.b.c.b.g a2 = o.a.b.c.b.h.a(createBuilder4);
        createBuilder.copyOnWrite();
        com.google.android.libraries.search.ah.f fVar5 = (com.google.android.libraries.search.ah.f) createBuilder.instance;
        fVar5.e = a2;
        fVar5.b |= 4;
        this.g = ar.q(createBuilder);
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final t a() {
        return j.a;
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final am b() {
        return this.f;
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final com.google.android.libraries.search.ah.f c() {
        return this.g;
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final AccountId d() {
        return this.c;
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final /* synthetic */ boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.a.a.p.b.a.f.h(this.c, lVar.c) && h.a.a.p.b.a.f.h(this.d, lVar.d) && h.a.a.p.b.a.f.h(this.e, lVar.e) && this.b == lVar.b && h.a.a.p.b.a.f.h(this.f943a, lVar.f943a);
    }

    @Override // com.google.android.libraries.search.assistant.invocation.u.h.b.b.ai
    public final /* synthetic */ int f() {
        return 1;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int i = this.b;
        int i2 = i;
        if (i == 0) {
            i2 = 0;
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + this.f943a.hashCode();
    }

    public final String toString() {
        int a2 = this.c.a();
        int i = this.b;
        String a3 = i != 0 ? r.a(i) : "NONE";
        return "LegacyOnDeviceHotwordConsumer(accountId=" + a2 + " (" + this.d + "), experience=" + a3 + ")";
    }
}
