package com.google.android.apps.gsa.staticplugins.nga.u;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.staticplugins.nga.t.c;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/y.class */
public final class y {
    public static final int b = 0;
    private final p f;
    private final ac g;
    private final c h;
    private static final d c = d.j();

    /* renamed from: a, reason: collision with root package name */
    static final ha f1724a = ha.w(com.google.android.apps.gsa.nga.shared.ab.j.TELEPORT, com.google.android.apps.gsa.nga.shared.ab.j.QUERY_DEEP_LINKS, com.google.android.apps.gsa.nga.shared.ab.j.SODA, com.google.android.apps.gsa.nga.shared.ab.j.APP_ACTIONS, com.google.android.apps.gsa.nga.shared.ab.j.TCLIB, com.google.android.apps.gsa.nga.shared.ab.j.INTENTS, new com.google.android.apps.gsa.nga.shared.ab.j[]{com.google.android.apps.gsa.nga.shared.ab.j.SKIP_COMPONENT_LIST, com.google.android.apps.gsa.nga.shared.ab.j.CORTEX});
    private static final ha d = (ha) Collection._EL.stream(fl.v("fr-FR", "fr-CA", "it-IT", "de-DE", "es-ES", "es-MX", "es-US")).map(new Function() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.x
        @Override // java.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return Function._CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Locale.forLanguageTag((String) obj);
        }

        @Override // java.util.function.Function
        public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
            return Function._CC.$default$compose(this, function);
        }
    }).collect(bs.b);
    private static final ha e = ha.s(com.google.android.apps.gsa.nga.shared.ab.j.TELEPORT, com.google.android.apps.gsa.nga.shared.ab.j.TCLIB);

    public y(p pVar, ac acVar, c cVar) {
        this.f = pVar;
        this.g = acVar;
        this.h = cVar;
    }

    private final ha b() {
        try {
            ha a2 = this.g.a(this.f.t(eu.iX));
            a d2 = c.d();
            d2.ak(15310);
            d2.s("Flag controlled groups: %s", Collection._EL.stream(a2).map(new c(5)).collect(Collectors.joining(", ")));
            return a2;
        } catch (IllegalArgumentException e2) {
            aus.f(c.e(), "Parsing initial download groups went wrong: returning default value.", (char) 15311, e2);
            return this.g.a(eu.iX.b);
        }
    }

    public final ha a() {
        ha g;
        if (d.contains(this.h.d())) {
            gy gyVar = new gy();
            gyVar.j(e);
            gyVar.j(b());
            g = gyVar.g();
        } else {
            gy gyVar2 = new gy();
            gyVar2.j((ha) Collection._EL.stream(f1724a).filter(new w(this.f.w(eu.iW), 0)).collect(bs.b));
            gyVar2.j(b());
            g = gyVar2.g();
        }
        a d2 = c.d();
        d2.ak(15312);
        d2.s("Required groups: %s", Collection._EL.stream(g).map(new c(5)).collect(bs.b));
        return g;
    }
}
