package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/bv.class */
public final class bv extends m.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    Object f104a;
    final by b;
    int c;
    androidx.room.a.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(by byVar, m.c.g gVar) {
        super(gVar);
        this.b = byVar;
    }

    public final Object b(Object obj) {
        this.f104a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
