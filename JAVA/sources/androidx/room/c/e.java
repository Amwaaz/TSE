package androidx.room.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/c/e.class */
public final class e extends m.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    Object f113a;
    Object b;
    final f c;
    int d;
    f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, m.c.g gVar) {
        super(gVar);
        this.c = fVar;
    }

    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
