package androidx.work.impl.a.a;

import androidx.work.impl.b.ac;
import kotlinx.coroutines.b.m;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/a/d.class */
public abstract class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.a.b.i f169a;

    public d(androidx.work.impl.a.b.i iVar) {
        this.f169a = iVar;
    }

    @Override // androidx.work.impl.a.a.g
    public final m a(androidx.work.g gVar) {
        gVar.getClass();
        return new kotlinx.coroutines.b.d(new c(this, (m.c.g) null));
    }

    @Override // androidx.work.impl.a.a.g
    public final boolean c(ac acVar) {
        return b(acVar) && e(this.f169a.b());
    }

    protected abstract int d();

    protected boolean e(Object obj) {
        throw null;
    }
}
