package androidx.room.g;

import androidx.room.ao;
import kotlinx.coroutines.ag;
import m.c.a.a;
import m.h.a.l;
import m.h.a.p;
import m.k;
import m.w;

/* loaded from: classes-dex2jar.jar:androidx/room/g/g.class */
public final class g extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    int f127a;
    final ao b;
    final boolean c;
    final boolean d;
    final l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m.c.g gVar, ao aoVar, boolean z, boolean z2, l lVar) {
        super(2, gVar);
        this.b = aoVar;
        this.c = z;
        this.d = z2;
        this.e = lVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((ag) obj, (m.c.g) obj2).b(w.a);
    }

    public final Object b(Object obj) {
        a aVar = a.a;
        int i = this.f127a;
        k.b(obj);
        if (i == 0) {
            ao aoVar = this.b;
            j jVar = new j(this.d, this.c, aoVar, null, this.e);
            this.f127a = 1;
            Object B = aoVar.B(jVar, this);
            obj = B;
            if (B == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new g(gVar, this.b, this.c, this.d, this.e);
    }
}
