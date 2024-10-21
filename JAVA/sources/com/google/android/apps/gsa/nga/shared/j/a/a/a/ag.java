package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.apps.tiktok.account.AccountId;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.ct;
import m.h.a.q;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ag.class */
public final class ag extends m.c.b.a.h implements q {

    /* renamed from: a, reason: collision with root package name */
    int f894a;
    Object b;
    final com.google.android.libraries.search.assistant.invocation.g.a.a c;
    final bc d;
    final ac e;
    final w f;
    private Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(m.c.g gVar, com.google.android.libraries.search.assistant.invocation.g.a.a aVar, bc bcVar, ac acVar, w wVar) {
        super(3, gVar);
        this.c = aVar;
        this.d = bcVar;
        this.e = acVar;
        this.f = wVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ag agVar = new ag((m.c.g) obj3, this.c, this.d, this.e, this.f);
        agVar.g = (kotlinx.coroutines.b.n) obj;
        agVar.b = obj2;
        return agVar.b(m.w.a);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlinx.coroutines.b.n] */
    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f894a;
        m.k.b(obj);
        if (i == 0) {
            ?? r0 = this.g;
            AccountId accountId = (AccountId) this.b;
            ct ctVar = this.c.a(accountId).b;
            bc bcVar = this.d;
            ac acVar = this.e;
            w wVar = this.f;
            kotlinx.coroutines.b.m b = cp.b(ctVar, bcVar.f, acVar.d, wVar.b, new af(accountId, null));
            this.f894a = 1;
            if (cp.w((kotlinx.coroutines.b.n) r0, b, this) == aVar) {
                return aVar;
            }
        }
        return m.w.a;
    }
}
