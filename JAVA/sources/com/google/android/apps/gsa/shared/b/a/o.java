package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.a.ae;
import kotlinx.coroutines.ag;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/o.class */
final class o extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a */
    int f1384a;
    final Object b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ae aeVar, m.c.g gVar, int i) {
        super(2, gVar);
        this.c = i;
        this.b = aeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m.h.a.l lVar, m.c.g gVar, int i) {
        super(2, gVar);
        this.c = i;
        this.b = lVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return c((String) obj, (m.c.g) obj2).b(w.a);
        }
        return c((ag) obj, (m.c.g) obj2).b(w.a);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [kotlinx.coroutines.a.ae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, m.h.a.l] */
    public final Object b(Object obj) {
        if (this.c == 0) {
            m.c.a.a aVar = m.c.a.a.a;
            if (this.f1384a != 0) {
                m.k.b(obj);
            } else {
                m.k.b(obj);
                ?? r0 = this.b;
                this.f1384a = 1;
                if (r0.a(this) == aVar) {
                    return aVar;
                }
            }
            return w.a;
        }
        m.c.a.a aVar2 = m.c.a.a.a;
        int i = this.f1384a;
        m.k.b(obj);
        if (i == 0) {
            ?? r02 = this.b;
            w wVar = w.a;
            this.f1384a = 1;
            if (r02.a(wVar, this) == aVar2) {
                return aVar2;
            }
        }
        return w.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, m.h.a.l] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.a.ae, java.lang.Object] */
    public final m.c.g c(Object obj, m.c.g gVar) {
        return this.c != 0 ? new o((ae) this.b, gVar, 1) : new o((m.h.a.l) this.b, gVar, 0);
    }
}
