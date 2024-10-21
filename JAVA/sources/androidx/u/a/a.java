package androidx.u.a;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a.class */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f142a;
    public final Object[] b;

    public a(String str, Object[] objArr) {
        this.f142a = str;
        this.b = objArr;
    }

    @Override // androidx.u.a.i
    public final String g() {
        return this.f142a;
    }

    @Override // androidx.u.a.i
    public final void h(h hVar) {
        d.b(hVar, this.b);
    }
}
