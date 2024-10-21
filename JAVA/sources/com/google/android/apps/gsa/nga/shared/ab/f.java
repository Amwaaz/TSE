package com.google.android.apps.gsa.nga.shared.ab;

import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.assistant.c.b.a.b;
import com.google.common.b.bs;
import com.google.common.b.fu;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ab/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f837a = com.google.common.f.a.d.j();
    public final fu b;
    private final fu c;
    private final a d;
    private final com.google.android.apps.gsa.shared.o.b.a.a e;

    public f(a aVar, com.google.android.apps.gsa.shared.o.b.a.a aVar2, Map map) {
        this.d = aVar;
        this.e = aVar2;
        this.c = fu.k(map);
        final int i = 1;
        this.b = (fu) Collection._EL.stream(((fu) map).v()).collect(bs.e(new b(3), new Function(i) { // from class: com.google.android.apps.gsa.nga.shared.ab.e

            /* renamed from: a, reason: collision with root package name */
            private final int f836a;

            {
                this.f836a = i;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return this.f836a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f836a != 0 ? (j) ((Map.Entry) obj).getKey() : Optional.of((j) obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.f836a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: com.google.android.apps.gsa.nga.shared.ab.d
            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(java.util.function.Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (j) obj;
            }
        }));
    }

    public static boolean f(String str) {
        return str.startsWith("apa_") || str.equals(h.n.y);
    }

    public final j a(String str) {
        return (j) ((Optional) h.c(str).map(new b(2)).orElseGet(new c(this, str, 0))).orElse(j.UNRECOGNIZED);
    }

    public final String b(j jVar) {
        h a2 = h.a(jVar);
        if (e()) {
            return (String) (!e() ? Optional.empty() : Optional.ofNullable((b) this.c.get(jVar))).map(new b(0)).orElseGet(new c(jVar, a2, 1));
        }
        return a2.x;
    }

    public final String c(j jVar) {
        return (!jVar.equals(j.SKIP_COMPONENT_LIST) || e()) ? b(jVar) : "nga_skip_component_list";
    }

    public final String d() {
        return String.valueOf(b(j.WEBREF)).concat("-index");
    }

    public final boolean e() {
        return this.d.i(eu.mD);
    }
}
