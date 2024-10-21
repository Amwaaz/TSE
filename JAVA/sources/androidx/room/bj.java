package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/bj.class */
public final class bj extends m.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    Object f99a;
    Object b;
    final by c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(by byVar, m.c.g gVar) {
        super(gVar);
        this.c = byVar;
    }

    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
