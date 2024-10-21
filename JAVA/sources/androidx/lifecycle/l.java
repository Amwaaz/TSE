package androidx.lifecycle;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/l.class */
public final class l implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final k f75a;
    private final ac b;

    public l(k kVar, ac acVar) {
        this.f75a = kVar;
        this.b = acVar;
    }

    @Override // androidx.lifecycle.ac
    public final void a(ae aeVar, u uVar) {
        switch (uVar) {
            case ON_CREATE:
                this.f75a.ht(aeVar);
                break;
            case ON_START:
                this.f75a.hx(aeVar);
                break;
            case ON_RESUME:
                this.f75a.hw(aeVar);
                break;
            case ON_PAUSE:
                this.f75a.hv(aeVar);
                break;
            case ON_STOP:
                this.f75a.hy(aeVar);
                break;
            case ON_DESTROY:
                this.f75a.hu(aeVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        ac acVar = this.b;
        if (acVar != null) {
            acVar.a(aeVar, uVar);
        }
    }
}
