package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.apps.tiktok.account.AccountId;
import m.h.a.s;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/af.class */
final class af extends m.c.b.a.h implements s {

    /* renamed from: a, reason: collision with root package name */
    Object f893a;
    Object b;
    boolean c;
    Object d;
    final AccountId e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(AccountId accountId, m.c.g gVar) {
        super(5, gVar);
        this.e = accountId;
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        Object obj2 = this.f893a;
        Object obj3 = this.b;
        boolean z = this.c;
        Object obj4 = this.d;
        return new ad(this.e, (String) obj2, (ay) obj3, z, obj4);
    }

    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        af afVar = new af(this.e, (m.c.g) obj5);
        afVar.f893a = (String) obj;
        afVar.b = (ay) obj2;
        afVar.c = booleanValue;
        afVar.d = obj4;
        return afVar.b(m.w.a);
    }
}
