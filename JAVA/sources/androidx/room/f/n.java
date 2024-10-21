package androidx.room.f;

/* loaded from: classes-dex2jar.jar:androidx/room/f/n.class */
public final class n implements androidx.u.a.g, androidx.room.d {

    /* renamed from: a, reason: collision with root package name */
    public final b f125a;
    private final androidx.u.a.g b;
    private final i c;

    public n(androidx.u.a.g gVar, b bVar) {
        gVar.getClass();
        this.b = gVar;
        this.f125a = bVar;
        this.c = new i(bVar);
        if (gVar instanceof n) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        bVar.f120a = gVar;
    }

    @Override // androidx.room.d
    public final androidx.u.a.g a() {
        return this.b;
    }

    @Override // androidx.u.a.g
    public final androidx.u.a.b b() {
        this.c.f123a.b(g.f122a);
        return this.c;
    }

    @Override // androidx.u.a.g
    public final String c() {
        return this.b.c();
    }

    @Override // androidx.u.a.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.f123a.c();
    }

    @Override // androidx.u.a.g
    public final void d(boolean z) {
        this.b.d(z);
    }
}
