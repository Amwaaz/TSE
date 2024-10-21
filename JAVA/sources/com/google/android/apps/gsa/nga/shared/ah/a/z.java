package com.google.android.apps.gsa.nga.shared.ah.a;

import com.google.android.libraries.gsa.h.h;
import com.google.common.b.bs;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.qk;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/ah/a/z.class */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final j f841a = j.i("com.google.android.apps.gsa.nga.shared.ah.a.z");

    public static cn a(fl flVar, Function function) {
        Stream map = Collection._EL.stream(flVar).map(function);
        int i = fl.e;
        return i.g(dl.j((fl) map.collect(bs.a)), new b(6), ay.a);
    }

    public static cn b(h hVar, String str, cn cnVar, cn cnVar2, BiFunction biFunction) {
        return com.google.apps.tiktok.tracing.contrib.c.h.d(new cn[]{cnVar, cnVar2}).a(new s(biFunction, cnVar, cnVar2), new t(hVar, str, 0));
    }

    public static cn c(fl flVar, Function function) {
        Stream map = Collection._EL.stream(flVar).map(function);
        int i = fl.e;
        return i.g(dl.j((fl) map.collect(bs.a)), new n(flVar, 0), ay.a);
    }

    public static cn d(h hVar, String str, Iterable iterable) {
        cn n = dl.n(Optional.empty());
        Iterator it = iterable.iterator();
        int i = 1;
        cn cnVar = n;
        while (it.hasNext()) {
            cnVar = hVar.l(cnVar, String.format(Locale.US, "%s.firstNonEmpty.%d", str, Integer.valueOf(i)), new a((y) it.next(), 3));
            i++;
        }
        return cnVar;
    }

    public static cn e(h hVar, String str, Predicate predicate, Iterable iterable) {
        fg fgVar = new fg(4);
        qk D = ((fl) iterable).D(0);
        while (D.hasNext()) {
            fgVar.h(new o(hVar, (x) D.next(), str, predicate));
        }
        return d(hVar, str, fgVar.g());
    }

    public static cn f(java.util.Collection collection, Function function) {
        Stream map = Collection._EL.stream(collection).map(function);
        int i = fl.e;
        return i.g(dl.j((fl) map.collect(bs.a)), new b(5), ay.a);
    }

    public static void g(cn cnVar, w wVar) {
        dl.y(cnVar, new u(wVar), ay.a);
    }

    public static void h(String str, cn cnVar, String str2, Object... objArr) {
        g(cnVar, new r(str, str2, objArr));
    }

    public static void i(cn cnVar, Future future) {
        if (cnVar == null || !(((d) cnVar).value instanceof d.b) || future == null) {
            return;
        }
        future.cancel(false);
    }

    public static void j(cn cnVar, cn cnVar2) {
        if (cnVar2.isDone()) {
            return;
        }
        if (cnVar.isDone()) {
            i(cnVar, cnVar2);
            return;
        }
        v vVar = new v(cnVar, cnVar2);
        cnVar.b(vVar, ay.a);
        cnVar2.b(vVar, ay.a);
    }
}
