package com.google.android.apps.gsa.nga.engine.ui.e.h;

import com.google.android.apps.gsa.nga.engine.ar.ah;
import com.google.android.apps.gsa.nga.engine.ar.aj;
import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.shared.logger.b.w;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/p.class */
public class p implements com.google.android.apps.gsa.nga.engine.ui.e.c.a.e, com.google.android.apps.gsa.nga.engine.ar.d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f759a = 0;
    private static final com.google.common.f.j b = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.h.p");
    private final com.google.android.apps.gsa.nga.shared.s.e c;
    private final com.google.android.apps.gsa.nga.shared.s.e d;
    private final com.google.android.apps.gsa.nga.shared.s.f e;
    private final com.google.android.libraries.gsa.h.h f;

    static {
        com.google.android.apps.gsa.nga.engine.ui.e.c.a.c cVar = new com.google.android.apps.gsa.nga.engine.ui.e.c.a.c();
        com.google.android.apps.gsa.nga.engine.ui.e.c.a.a a2 = com.google.android.apps.gsa.nga.engine.ui.e.c.a.b.a();
        a2.e = 3;
        a2.c = 1;
        a2.c(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN);
        a2.d = 1;
        cVar.f701a = a2.a();
        com.google.android.apps.gsa.nga.engine.ui.e.c.a.a a3 = com.google.android.apps.gsa.nga.engine.ui.e.c.a.b.a();
        a3.e = 3;
        a3.c = 1;
        a3.c(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN);
        a3.d = 1;
        cVar.b = a3.a();
        cVar.a();
    }

    public p(final com.google.android.apps.gsa.nga.shared.ad.a.d dVar, final com.google.android.apps.gsa.nga.shared.ui.a.a aVar, com.google.android.libraries.gsa.h.h hVar) {
        com.google.android.apps.gsa.nga.shared.s.i iVar = new com.google.android.apps.gsa.nga.shared.s.i(aj.a(w.UNKNOWN_EVENT, com.google.android.apps.gsa.nga.shared.q.d.l.UNKNOWN).a(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.c = iVar;
        com.google.android.apps.gsa.nga.shared.s.i iVar2 = new com.google.android.apps.gsa.nga.shared.s.i(aj.a(w.UNKNOWN_EVENT, com.google.android.apps.gsa.nga.shared.q.d.l.UNKNOWN).a(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.d = iVar2;
        this.f = hVar;
        this.e = com.google.android.apps.gsa.nga.shared.s.ad.j(iVar2, iVar, new BiFunction(aVar, dVar) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.n

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.apps.gsa.nga.shared.ui.a.a f758a;
            public final com.google.android.apps.gsa.nga.shared.ad.a.d b;

            {
                this.f758a = aVar;
                this.b = dVar;
            }

            @Override // java.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                aj ajVar = (aj) obj;
                aj ajVar2 = (aj) obj2;
                int i = p.f759a;
                int b2 = this.f758a.b();
                if (b2 == 0) {
                    throw null;
                }
                com.google.android.apps.gsa.nga.engine.ui.e.c.a.c cVar = new com.google.android.apps.gsa.nga.engine.ui.e.c.a.c();
                int i2 = 1;
                com.google.android.apps.gsa.nga.engine.ui.e.c.a.b d = p.d(ajVar, 1);
                com.google.android.apps.gsa.nga.shared.ad.a.d dVar2 = this.b;
                cVar.f701a = d;
                if (dVar2.j(ajVar2.c())) {
                    i2 = 3;
                } else if (b2 == 2) {
                    i2 = 2;
                }
                cVar.b = p.d(ajVar2, i2);
                return cVar.a();
            }
        });
    }

    public static com.google.android.apps.gsa.nga.engine.ui.e.c.a.b d(aj ajVar, int i) {
        int i2;
        com.google.android.apps.gsa.nga.shared.q.d.l lVar = ajVar.f;
        com.google.android.apps.gsa.nga.engine.ui.e.c.a.a a2 = com.google.android.apps.gsa.nga.engine.ui.e.c.a.b.a();
        int ordinal = lVar.ordinal();
        a2.c = ordinal != 32 ? ordinal != 33 ? ordinal != 50 ? ordinal != 54 ? ordinal != 59 ? ordinal != 71 ? ordinal != 79 ? ordinal != 90 ? ordinal != 73 ? ordinal != 74 ? 1 : 7 : 9 : 11 : 10 : 4 : 8 : 5 : 6 : 3 : 2;
        int ordinal2 = ajVar.f473a.ordinal();
        if (ordinal2 == 0) {
            i2 = 1;
        } else if (ordinal2 == 1) {
            i2 = 2;
        } else if (ordinal2 == 2) {
            i2 = 3;
        } else {
            if (ordinal2 != 3) {
                throw new IllegalStateException();
            }
            i2 = 4;
        }
        a2.e = i2;
        a2.b(ajVar.c.o);
        Optional map = ajVar.b.map(new o());
        if (map == null) {
            throw new NullPointerException("Null identifier");
        }
        a2.b = map;
        a2.c((com.google.android.apps.gsa.assistant.shared.k.c) ajVar.e().orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN));
        a2.d = i;
        bu buVar = ajVar.c;
        if ((buVar.b & 8) != 0) {
            a2.f699a = Optional.of(Instant.ofEpochMilli(buVar.f));
        }
        return a2.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final /* synthetic */ void b(ah ahVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.c.a.e
    public final com.google.android.apps.gsa.nga.shared.s.f c() {
        return this.e;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ar.c
    public final void hc(aj ajVar, aj ajVar2) {
        com.google.common.f.h d = b.d();
        d.ak(4740);
        d.H("onActiveStateChangeEvent: %s => %s", ajVar2.f473a, ajVar.f473a);
        com.google.android.apps.gsa.nga.shared.s.ad.b(this.f, this.c, ajVar, "newState");
        com.google.android.apps.gsa.nga.shared.s.ad.b(this.f, this.d, ajVar2, "previousState");
    }
}
