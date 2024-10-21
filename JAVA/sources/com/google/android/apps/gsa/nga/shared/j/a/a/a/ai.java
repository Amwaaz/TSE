package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import m.h.a.q;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ai.class */
final class ai extends m.c.b.a.h implements q {

    /* renamed from: a, reason: collision with root package name */
    Object f896a;
    Object b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(m.c.g gVar, int i) {
        super(3, gVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(m.c.g gVar, int i, byte[] bArr) {
        super(3, gVar);
        this.c = i;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.c != 0) {
            ai aiVar = new ai((m.c.g) obj3, 1, null);
            aiVar.f896a = (m) obj;
            aiVar.b = (m) obj2;
            return aiVar.b(m.w.a);
        }
        ai aiVar2 = new ai((m.c.g) obj3, 0);
        aiVar2.f896a = (o) obj;
        aiVar2.b = (o) obj2;
        return aiVar2.b(m.w.a);
    }

    public final Object b(Object obj) {
        if (this.c == 0) {
            m.k.b(obj);
            Object obj2 = this.f896a;
            Object obj3 = this.b;
            if (obj2 == null) {
                return obj3;
            }
            o oVar = (o) obj3;
            return new o(aq.a(((o) obj2).f928a, oVar.f928a), oVar.b);
        }
        m.k.b(obj);
        Object obj4 = this.f896a;
        Object obj5 = this.b;
        if (obj4 == null) {
            return obj5;
        }
        m mVar = (m) obj5;
        n nVar = mVar.f926a;
        m mVar2 = (m) obj4;
        return new m(aq.a(mVar2.f926a, nVar), aq.a(mVar2.b, mVar.b));
    }
}
