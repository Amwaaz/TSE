package com.google.android.apps.gsa.staticplugins.nga.k;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.aq;
import com.google.android.apps.gsa.nga.api.at;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.f.a.ai;
import com.google.android.apps.gsa.nga.shared.n.c;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.staticplugins.nga.a.a.bg;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/k/x.class */
public final class x implements com.google.android.apps.gsa.search.core.g.b.a, at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.gsa.h.h f1692a;
    private final n b;
    private final e.a c;
    private final e.a d;
    private final c e;

    public x(com.google.android.libraries.gsa.h.h hVar, n nVar, e.a aVar, e.a aVar2, k kVar) {
        this.f1692a = hVar;
        this.b = nVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = kVar.d(new Function() { // from class: com.google.android.apps.gsa.staticplugins.nga.k.v
            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ai) obj).a();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return Function._CC.$default$compose(this, function);
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final void a(NgaState ngaState) {
        throw null;
    }

    @Override // com.google.android.apps.gsa.search.core.g.b.a
    public final void b(boolean z, boolean z2) {
        this.f1692a.n("[NGA] NgaStartupListener.onDeviceInstallOrBoot", new w(this, 0));
    }

    public final void c() {
        this.b.n(((bg) this.c.a()).a(), ((aq) this.d.a()).b(), false);
    }

    @Override // com.google.android.apps.gsa.nga.api.at
    public final /* synthetic */ void ir(NgaState ngaState, boolean z) {
        ab abVar = e.a;
        if (ngaState != NgaState.DISABLED) {
            z.h("NgaStartupListener", dl.k(new cn[]{this.e.b()}), "Failed to notify reload listeners for changes.", new Object[0]);
        }
        c();
    }
}
