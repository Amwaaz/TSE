package com.google.android.apps.gsa.shared.b.a;

import kotlinx.coroutines.a.ae;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/b/a/s.class */
final class s extends m.c.b.a.h implements m.h.a.l {

    /* renamed from: a */
    int f1388a;
    final Object b;
    final Object c;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ae aeVar, Object obj, m.c.g gVar, int i) {
        super(1, gVar);
        this.d = i;
        this.c = aeVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m.h.a.p pVar, String str, m.c.g gVar, int i) {
        super(1, gVar);
        this.d = i;
        this.c = pVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.a.ae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, m.h.a.p] */
    public final /* synthetic */ Object a(Object obj) {
        if (this.d != 0) {
            return new s((m.h.a.p) this.c, (String) this.b, (m.c.g) obj, 1).b(w.a);
        }
        return new s((ae) this.c, this.b, (m.c.g) obj, 0).b(w.a);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, m.h.a.p] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlinx.coroutines.a.ae, java.lang.Object] */
    public final Object b(Object obj) {
        if (this.d != 0) {
            m.c.a.a aVar = m.c.a.a.a;
            int i = this.f1388a;
            m.k.b(obj);
            if (i == 0) {
                ?? r0 = this.c;
                Object obj2 = this.b;
                this.f1388a = 1;
                if (r0.a(obj2, this) == aVar) {
                    return aVar;
                }
            }
            return w.a;
        }
        m.c.a.a aVar2 = m.c.a.a.a;
        if (this.f1388a != 0) {
            m.k.b(obj);
        } else {
            m.k.b(obj);
            ?? r02 = this.c;
            Object obj3 = this.b;
            this.f1388a = 1;
            if (r02.a(obj3, this) == aVar2) {
                return aVar2;
            }
        }
        return w.a;
    }
}
