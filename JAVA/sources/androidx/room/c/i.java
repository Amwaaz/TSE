package androidx.room.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/c/i.class */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.u.a.j f117a;

    public i(androidx.u.a.b bVar, String str) {
        super(bVar, str);
        this.f117a = bVar.e(str);
    }

    @Override // androidx.u.b
    public final double a(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    @Override // androidx.u.b
    public final int b() {
        q();
        return 0;
    }

    @Override // androidx.u.b
    public final long c(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    @Override // androidx.u.b
    public final String d(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    @Override // androidx.u.b
    public final String e(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    @Override // androidx.u.b
    public final void f(int i, byte[] bArr) {
        q();
        this.f117a.a(i, bArr);
    }

    @Override // androidx.u.b
    public final void g(int i, double d) {
        q();
        this.f117a.b(i, d);
    }

    @Override // androidx.u.b
    public final void h(int i, long j) {
        q();
        this.f117a.c(i, j);
    }

    @Override // androidx.u.b
    public final void i(int i) {
        q();
        this.f117a.d(i);
    }

    @Override // androidx.u.b
    public final void j(int i, String str) {
        str.getClass();
        q();
        this.f117a.e(i, str);
    }

    @Override // androidx.u.b
    public final void k() {
        this.f117a.close();
        this.h = true;
    }

    @Override // androidx.u.b
    public final void l() {
    }

    @Override // androidx.u.b
    public final boolean m(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    @Override // androidx.u.b
    public final boolean n() {
        q();
        this.f117a.h();
        return false;
    }

    @Override // androidx.u.b
    public final byte[] o(int i) {
        q();
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }
}
