package com.google.android.apps.gsa.staticplugins.nga.t;

import com.google.android.apps.gsa.nga.shared.f.a.ai;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/t/i.class */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f1697a;
    private final com.google.android.apps.gsa.nga.shared.n.c b;
    private final com.google.android.libraries.gsa.h.h c;

    public i(a aVar, k kVar, com.google.android.libraries.gsa.h.h hVar) {
        this.f1697a = aVar;
        this.b = kVar.b(new BiFunction() { // from class: com.google.android.apps.gsa.staticplugins.nga.t.h
            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ai) obj).b((t) obj2);
            }
        });
        this.c = hVar;
    }

    public final cn a(t tVar) {
        return com.google.android.apps.gsa.v.c.b(dl.k(new cn[]{this.c.a("[NGA] NgaSettingsChangeNotifier.notifyInteractor", new p(this, tVar, 1)), this.b.a(tVar)}));
    }
}
