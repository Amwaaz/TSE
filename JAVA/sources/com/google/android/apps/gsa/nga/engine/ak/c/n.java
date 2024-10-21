package com.google.android.apps.gsa.nga.engine.ak.c;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.u.e;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.shared.k.bn;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.common.b.oo;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.v.f;
import com.google.cs.a.b.a.b;
import com.google.cs.a.b.a.c;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoField;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/c/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final d f425a = d.j();
    public static final String[] b = {"internal.3p:Alarm_cross_device", "internal.3p:Timer_cross_device", "internal.3p:Stopwatch_cross_device"};
    public static final String[] c = {"com.google.android.deskclock"};
    public final e.a d;
    public final e.a e;
    public final f f;
    public final ca g = cl.d(new g());
    public final x h;
    private final com.google.android.apps.gsa.shared.util.q.a i;

    public n(e.a aVar, e.a aVar2, f fVar, x xVar, com.google.android.apps.gsa.shared.util.q.a aVar3) {
        this.d = aVar;
        this.e = aVar2;
        this.f = fVar;
        this.h = xVar;
        this.i = aVar3;
    }

    public static Optional b(c cVar, String str) {
        return c(cVar, str).flatMap(new e(6));
    }

    public static Optional c(c cVar, String str) {
        List i = i(cVar, str);
        return i.isEmpty() ? Optional.empty() : Optional.of((String) i.get(0));
    }

    public static Optional d(c cVar, String str) {
        List i = i(cVar, str);
        return i.isEmpty() ? Optional.empty() : Optional.of((String) i.get(0));
    }

    public static Optional e(c cVar, String str) {
        return Optional.ofNullable((b) oo.aK(cVar.e, new l(str)));
    }

    public static Optional f(c cVar, String str) {
        return c(cVar, str).flatMap(new e(7));
    }

    static /* synthetic */ Optional g(String str) {
        try {
            return Optional.of(Long.valueOf(Duration.parse(str).toMillis()));
        } catch (DateTimeParseException e) {
            aus.f(f425a.e(), "Could not parse duration", (char) 4075, e);
            return Optional.empty();
        }
    }

    static /* synthetic */ Optional h(String str) {
        try {
            return Optional.of(Long.valueOf((e.a.parse(str).getLong(ChronoField.INSTANT_SECONDS) * 1000) + r0.get(ChronoField.MILLI_OF_SECOND)));
        } catch (DateTimeParseException e) {
            return Optional.empty();
        }
    }

    public static List i(c cVar, String str) {
        return (List) e(cVar, str).map(new e(0)).orElseGet(new f());
    }

    public static void j(c cVar, ba baVar) {
        Optional f = f(cVar, "expireTime");
        f.ifPresent(new d(baVar, 6));
        b(cVar, "remainingTime").flatMap(new i(f)).map(new e(2)).map(new e(3)).ifPresent(new d(baVar, 7));
    }

    private final Optional k(cn cnVar, String str) {
        if (!this.i.i(eu.gF)) {
            return Optional.empty();
        }
        try {
            String str2 = (String) ag.h(cnVar, Duration.ofMillis(this.i.d(bn.o)));
            if (!str2.isEmpty()) {
                return Optional.of(str2);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aus.i(f425a.e(), "getClockAppSelectionData: failed for %s", str, (char) 4074, e);
        }
        return Optional.empty();
    }

    public final p a(cn cnVar, String str) {
        o oVar = new o();
        oVar.a = "";
        k(cnVar, str).ifPresent(new d(oVar, 1));
        String str2 = oVar.a;
        if (str2 != null) {
            return new p(str2);
        }
        throw new IllegalStateException("Missing required properties: androidProviderPackageName");
    }
}
