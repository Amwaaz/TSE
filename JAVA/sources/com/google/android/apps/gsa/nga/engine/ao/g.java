package com.google.android.apps.gsa.nga.engine.ao;

import com.google.android.apps.gsa.nga.shared.f.a.ai;
import com.google.android.apps.gsa.nga.shared.f.t;
import com.google.android.apps.gsa.nga.shared.n.c;
import com.google.android.apps.gsa.nga.shared.n.e;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.search.core.ac.v;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import j$.util.function.BiFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ao/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d f467a = d.j();
    public final com.google.android.apps.gsa.shared.util.q.a b;
    public final v c;
    public final e d;
    public final e e;
    public final c f;
    public final com.google.android.libraries.gsa.h.h g;
    public final com.google.android.libraries.gsa.h.h h;
    public final Map i = new HashMap();

    public g(com.google.android.apps.gsa.shared.util.q.a aVar, v vVar, k kVar, com.google.android.libraries.gsa.h.h hVar, k kVar2, k kVar3, com.google.android.libraries.gsa.h.h hVar2) {
        this.b = aVar;
        this.c = vVar;
        this.f = kVar.b(new BiFunction() { // from class: com.google.android.apps.gsa.nga.engine.ao.a
            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ai) obj).b((t) obj2);
            }
        });
        this.g = hVar;
        this.h = hVar2;
        final int i = 1;
        this.d = kVar2.a(hVar, new com.google.android.apps.gsa.shared.util.c.d(i) { // from class: com.google.android.apps.gsa.nga.engine.ao.b

            /* renamed from: a, reason: collision with root package name */
            private final int f465a;

            {
                this.f465a = i;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f465a != 0) {
                    ((i) obj).gX((ha) obj2);
                } else {
                    ((h) obj).H((t) obj2);
                }
            }
        });
        final int i2 = 0;
        this.e = kVar3.a(hVar, new com.google.android.apps.gsa.shared.util.c.d(i2) { // from class: com.google.android.apps.gsa.nga.engine.ao.b

            /* renamed from: a, reason: collision with root package name */
            private final int f465a;

            {
                this.f465a = i2;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f465a != 0) {
                    ((i) obj).gX((ha) obj2);
                } else {
                    ((h) obj).H((t) obj2);
                }
            }
        });
    }
}
