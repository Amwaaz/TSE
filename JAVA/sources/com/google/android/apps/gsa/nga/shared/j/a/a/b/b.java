package com.google.android.apps.gsa.nga.shared.j.a.a.b;

import com.google.android.apps.gsa.nga.shared.j.a.a.a.ae;
import com.google.android.libraries.search.assistant.invocation.u.h.b.b.an;
import kotlinx.coroutines.b.cd;
import kotlinx.coroutines.b.cp;
import m.w;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/b/b.class */
public final class b extends m.c.b.a.h implements m.h.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f935a;
    Object b;
    final Object c;
    private Object d;
    private final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m.c.g gVar, ae aeVar, int i) {
        super(3, gVar);
        this.e = i;
        this.c = aeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m.c.g gVar, i iVar, int i) {
        super(3, gVar);
        this.e = i;
        this.c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m.c.g gVar, q qVar, int i) {
        super(3, gVar);
        this.e = i;
        this.c = qVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        if (i == 0) {
            b bVar = new b((m.c.g) obj3, (q) this.c, 0);
            bVar.d = (kotlinx.coroutines.b.n) obj;
            bVar.b = obj2;
            return bVar.b(w.a);
        }
        if (i != 1) {
            b bVar2 = new b((m.c.g) obj3, (ae) this.c, 2);
            bVar2.d = (kotlinx.coroutines.b.n) obj;
            bVar2.b = obj2;
            return bVar2.b(w.a);
        }
        b bVar3 = new b((m.c.g) obj3, (i) this.c, 1);
        bVar3.d = (kotlinx.coroutines.b.n) obj;
        bVar3.b = obj2;
        return bVar3.b(w.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlinx.coroutines.b.n] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlinx.coroutines.b.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlinx.coroutines.b.n] */
    public final Object b(Object obj) {
        int i = this.e;
        if (i == 0) {
            m.c.a.a aVar = m.c.a.a.a;
            if (this.f935a != 0) {
                m.k.b(obj);
            } else {
                m.k.b(obj);
                ?? r0 = this.d;
                an anVar = (an) this.b;
                kotlinx.coroutines.b.m cdVar = anVar == null ? this.c : new cd(anVar, 1);
                this.f935a = 1;
                if (cp.w((kotlinx.coroutines.b.n) r0, cdVar, this) == aVar) {
                    return aVar;
                }
            }
            return w.a;
        }
        if (i != 1) {
            m.c.a.a aVar2 = m.c.a.a.a;
            int i2 = this.f935a;
            m.k.b(obj);
            if (i2 == 0) {
                ?? r02 = this.d;
                kotlinx.coroutines.b.m cdVar2 = ((Boolean) this.b).booleanValue() ? this.c : new cd((Object) null, 1);
                this.f935a = 1;
                if (cp.w((kotlinx.coroutines.b.n) r02, cdVar2, this) == aVar2) {
                    return aVar2;
                }
            }
            return w.a;
        }
        m.c.a.a aVar3 = m.c.a.a.a;
        if (this.f935a != 0) {
            m.k.b(obj);
        } else {
            m.k.b(obj);
            ?? r03 = this.d;
            com.google.android.libraries.search.assistant.invocation.u.h.b.b.w wVar = (com.google.android.libraries.search.assistant.invocation.u.h.b.b.w) this.b;
            kotlinx.coroutines.b.m cdVar3 = wVar == null ? this.c : new cd(wVar, 1);
            this.f935a = 1;
            if (cp.w((kotlinx.coroutines.b.n) r03, cdVar3, this) == aVar3) {
                return aVar3;
            }
        }
        return w.a;
    }
}
