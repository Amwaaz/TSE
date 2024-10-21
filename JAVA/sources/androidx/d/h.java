package androidx.d;

/* loaded from: classes-dex2jar.jar:androidx/d/h.class */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    final i f51a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(iVar.c);
        this.f51a = iVar;
    }

    @Override // androidx.d.q
    protected final Object a(int i) {
        return this.f51a.b[i];
    }

    @Override // androidx.d.q
    protected final void b(int i) {
        this.f51a.c(i);
    }
}
