package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/t.class */
public final class t extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f136a;
    final u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, m.c.g gVar) {
        super(2, gVar);
        this.b = uVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((kotlinx.coroutines.ag) obj, (m.c.g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        int i = this.f136a;
        m.k.b(obj);
        if (i == 0) {
            u uVar = this.b;
            this.f136a = 1;
            if (uVar.a(this) == aVar) {
                return aVar;
            }
        }
        return m.w.a;
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new t(this.b, gVar);
    }
}
