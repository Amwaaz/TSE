package androidx.work.impl.a;

import android.net.ConnectivityManager;
import androidx.work.impl.a.a.g;
import androidx.work.impl.b.ac;
import kotlinx.coroutines.b.d;
import kotlinx.coroutines.b.m;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/h.class */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f174a;
    public final long b;

    public h(ConnectivityManager connectivityManager, long j) {
        this.f174a = connectivityManager;
        this.b = j;
    }

    @Override // androidx.work.impl.a.a.g
    public final m a(androidx.work.g gVar) {
        gVar.getClass();
        return new d(new g(gVar, this, (m.c.g) null));
    }

    @Override // androidx.work.impl.a.a.g
    public final boolean b(ac acVar) {
        return acVar.k.b.b != null;
    }

    @Override // androidx.work.impl.a.a.g
    public final boolean c(ac acVar) {
        if (b(acVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
