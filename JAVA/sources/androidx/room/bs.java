package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/bs.class */
public final class bs extends m.c.b.a.h implements m.h.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f102a;
    final by b;
    final m.h.a.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(by byVar, m.h.a.a aVar, m.c.g gVar) {
        super(2, gVar);
        this.b = byVar;
        this.c = aVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return c((kotlinx.coroutines.ag) obj, (m.c.g) obj2).b(m.w.a);
    }

    public final Object b(Object obj) {
        m.c.a.a aVar = m.c.a.a.a;
        try {
            if (this.f102a != 0) {
                m.k.b(obj);
            } else {
                m.k.b(obj);
                by byVar = this.b;
                this.f102a = 1;
                if (byVar.b(this) == aVar) {
                    return aVar;
                }
            }
            this.c.a();
            return m.w.a;
        } catch (Throwable th) {
            this.c.a();
            throw th;
        }
    }

    public final m.c.g c(Object obj, m.c.g gVar) {
        return new bs(this.b, this.c, gVar);
    }
}
