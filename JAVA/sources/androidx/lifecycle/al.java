package androidx.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/al.class */
public final class al extends am implements ac {

    /* renamed from: a, reason: collision with root package name */
    final ae f67a;
    final an b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(an anVar, ae aeVar, at atVar) {
        super(anVar, atVar);
        this.b = anVar;
        this.f67a = aeVar;
    }

    @Override // androidx.lifecycle.ac
    public final void a(ae aeVar, u uVar) {
        v a2 = this.f67a.getLifecycle().a();
        if (a2 == v.DESTROYED) {
            this.b.j(this.c);
            return;
        }
        v vVar = null;
        while (vVar != a2) {
            d(eX());
            vVar = a2;
            a2 = this.f67a.getLifecycle().a();
        }
    }

    @Override // androidx.lifecycle.am
    public final void b() {
        this.f67a.getLifecycle().d(this);
    }

    @Override // androidx.lifecycle.am
    public final boolean c(ae aeVar) {
        return this.f67a == aeVar;
    }

    @Override // androidx.lifecycle.am
    public final boolean eX() {
        return this.f67a.getLifecycle().a().a(v.STARTED);
    }
}
