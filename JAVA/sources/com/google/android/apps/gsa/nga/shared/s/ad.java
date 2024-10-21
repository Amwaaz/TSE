package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.base.aw;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/ad.class */
public final class ad {
    public static cn a(f fVar, aw awVar) {
        ae aeVar = new ae(fVar, awVar);
        aeVar.a.d(aeVar.b);
        aeVar.c(aeVar.a.c());
        return aeVar;
    }

    public static void b(com.google.android.libraries.gsa.h.h hVar, e eVar, Object obj, String str) {
        hVar.n(String.format("[NGA] postValue.%s", str), new n(eVar, obj, 0));
    }

    public static void c(com.google.android.libraries.gsa.h.h hVar, d dVar, Object obj, Duration duration, String str) {
        if (duration.isZero()) {
            b(hVar, dVar, obj, str);
        } else {
            String format = String.format("[NGA] postValue.%s", str);
            hVar.n(format, new l(dVar, hVar, format, duration, obj, str));
        }
    }

    public static void d(f fVar, be beVar) {
        Class a2 = fVar.a();
        com.google.android.libraries.gsa.h.i.b(a2);
        fVar.d(beVar);
        new com.google.android.libraries.gsa.h.a.i(a2, new n(beVar, fVar, 2)).run();
    }

    public static f e(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, ac acVar) {
        return new x(fVar.a(), ha.w(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f[]{fVar7}), acVar, fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static f f(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, ab abVar) {
        return new w(fVar.a(), ha.w(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f[0]), abVar, fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static f g(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, aa aaVar) {
        return new v(fVar.a(), ha.v(fVar, fVar2, fVar3, fVar4, fVar5), aaVar, fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static f h(f fVar, f fVar2, f fVar3, f fVar4, z zVar) {
        return new u(fVar.a(), ha.u(fVar, fVar2, fVar3, fVar4), zVar, fVar, fVar2, fVar3, fVar4);
    }

    public static f i(f fVar, f fVar2, f fVar3, y yVar) {
        return new t(fVar.a(), ha.t(fVar, fVar2, fVar3), yVar, fVar, fVar2, fVar3);
    }

    public static f j(f fVar, f fVar2, BiFunction biFunction) {
        return new s(fVar.a(), ha.s(fVar, fVar2), biFunction, fVar, fVar2);
    }

    public static f k(Class cls, ha haVar, Function function) {
        return new r(cls, ha.o(haVar), function, haVar);
    }

    public static f l(f fVar, Function function) {
        return new p(fVar.a(), new op(fVar), function, fVar);
    }
}
