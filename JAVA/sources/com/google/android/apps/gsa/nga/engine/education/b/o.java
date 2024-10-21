package com.google.android.apps.gsa.nga.engine.education.b;

import com.google.android.apps.gsa.nga.engine.education.a.t;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.nga.shared.f.a.l;
import com.google.android.apps.gsa.nga.shared.f.a.m;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.k.ce;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.util.concurrent.ay;
import com.google.common.v.f;
import com.google.g.aa.d.e;
import com.google.g.ab.e.b.c;
import com.google.protobuf.ba;
import com.google.protobuf.cu;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/b/o.class */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f563a = com.google.common.f.a.d.j();
    public final f b;
    public final a c;
    public final com.google.android.apps.gsa.shared.util.q.a d;
    public final b e;
    public final d f;
    public final Random g = new Random();
    public final m h;
    private final boolean i;
    private final y j;

    public o(f fVar, a aVar, m mVar, com.google.android.apps.gsa.shared.util.q.a aVar2, boolean z, b bVar, d dVar, y yVar) {
        this.b = fVar;
        this.c = aVar;
        this.h = mVar;
        this.d = aVar2;
        this.e = bVar;
        this.i = z;
        this.f = dVar;
        this.j = yVar;
    }

    public static c f(String str, String str2, Locale locale) {
        ba createBuilder = c.a.createBuilder();
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        cVar.c = 1;
        cVar.b |= 1;
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        str.getClass();
        cVar2.b |= 2;
        cVar2.d = str;
        createBuilder.copyOnWrite();
        c cVar3 = createBuilder.instance;
        cVar3.b |= 4;
        cVar3.e = str2;
        ba createBuilder2 = com.google.g.ab.e.b.b.a.createBuilder();
        String language = locale.getLanguage();
        createBuilder2.copyOnWrite();
        com.google.g.ab.e.b.b bVar = createBuilder2.instance;
        language.getClass();
        bVar.b |= 1;
        bVar.c = language;
        String country = locale.getCountry();
        createBuilder2.copyOnWrite();
        com.google.g.ab.e.b.b bVar2 = createBuilder2.instance;
        country.getClass();
        bVar2.b |= 2;
        bVar2.d = country;
        createBuilder.copyOnWrite();
        c cVar4 = createBuilder.instance;
        com.google.g.ab.e.b.b build = createBuilder2.build();
        build.getClass();
        cVar4.f = build;
        cVar4.b |= 8;
        ba createBuilder3 = com.google.g.ab.e.b.a.a.createBuilder();
        createBuilder3.copyOnWrite();
        com.google.g.ab.e.b.a aVar = createBuilder3.instance;
        aVar.b |= 1;
        aVar.c = true;
        com.google.g.ab.e.b.a build2 = createBuilder3.build();
        createBuilder.copyOnWrite();
        c cVar5 = createBuilder.instance;
        build2.getClass();
        cVar5.g = build2;
        cVar5.b |= 16;
        return createBuilder.build();
    }

    private final long l() {
        return this.d.d(eu.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (j$.time.Duration.between((j$.time.Instant) r0.get(r0.size() - 1), r7.b.a()).toMillis() <= r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.g.aa.d.e m() {
        /*
            r7 = this;
            r0 = r7
            com.google.android.apps.gsa.shared.util.q.a r0 = r0.d
            com.google.android.apps.gsa.shared.k.f r1 = com.google.android.apps.gsa.shared.k.eu.bd
            long r0 = r0.d(r1)
            j$.time.Duration r0 = j$.time.Duration.ofDays(r0)
            long r0 = r0.toMillis()
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r0 = r7
            com.google.android.apps.gsa.nga.shared.f.a.m r0 = r0.h
            com.google.common.b.fl r0 = r0.f()
            r11 = r0
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2c
            com.google.g.aa.d.e r0 = com.google.g.aa.d.e.b
            return r0
        L2c:
            r0 = r11
            r1 = r11
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            j$.time.Instant r0 = (j$.time.Instant) r0
            r1 = r7
            com.google.common.v.f r1 = r1.b
            j$.time.Instant r1 = r1.a()
            j$.time.Duration r0 = j$.time.Duration.between(r0, r1)
            long r0 = r0.toMillis()
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L74
        L4f:
            r0 = r7
            com.google.android.apps.gsa.shared.util.q.a r0 = r0.d
            com.google.android.apps.gsa.shared.k.f r1 = com.google.android.apps.gsa.shared.k.eu.be
            long r0 = r0.d(r1)
            r9 = r0
            r0 = r7
            com.google.android.apps.gsa.nga.shared.f.a.m r0 = r0.h
            com.google.android.apps.gsa.nga.shared.f.m r0 = r0.b()
            int r0 = r0.l
            r8 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L78
            r0 = r8
            long r0 = (long) r0
            r1 = r9
            r2 = 1
            long r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L78
        L74:
            com.google.g.aa.d.e r0 = com.google.g.aa.d.e.c
            return r0
        L78:
            com.google.g.aa.d.e r0 = com.google.g.aa.d.e.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.b.o.m():com.google.g.aa.d.e");
    }

    private final fl n(Locale locale, Optional optional, boolean z) {
        Stream stream = Collection._EL.stream(((com.google.android.apps.gsa.nga.engine.education.a.o) this.c.a()).e(locale, t.IN_APP));
        Stream stream2 = stream;
        if (z) {
            stream2 = stream.filter(new k(this, optional, 0));
        }
        if (optional.isEmpty()) {
            Stream filter = stream2.filter(new l(0));
            int i = fl.e;
            return (fl) filter.collect(bs.a);
        }
        Stream filter2 = stream2.filter(new m(optional, 0));
        int i2 = fl.e;
        return (fl) filter2.collect(bs.a);
    }

    public final e a() {
        if (!this.j.c().e.e() || this.i) {
            return e.a;
        }
        if (!this.f.b()) {
            return e.g;
        }
        int i = this.h.b().i;
        return e.b;
    }

    public final e b() {
        if (!this.d.i(eu.cQ) || this.i) {
            return e.a;
        }
        if (!this.f.b()) {
            return m();
        }
        int i = this.h.b().i;
        return e.b;
    }

    public final e c(Locale locale, Optional optional) {
        return (this.d.i(eu.cP) && !this.i && (((long) this.h.a((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"))) < this.d.d(eu.bb) || (this.d.i(eu.bt) && this.d.i(eu.bu) && j((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"), locale)))) ? e.d : e.a;
    }

    public final e d() {
        if (!this.d.i(bt.w) || this.i) {
            return e.a;
        }
        if (!this.f.b()) {
            return m();
        }
        int i = this.h.b().i;
        return e.b;
    }

    public final e e() {
        if (!this.d.i(ce.h) || this.i) {
            return e.a;
        }
        if (!this.f.b()) {
            return m();
        }
        int i = this.h.b().i;
        return e.b;
    }

    public final fl g(com.google.g.ab.e.b.d dVar, String str, boolean z) {
        Stream filter = Collection._EL.stream(dVar.b).filter(new j(z)).filter(new n(this, l(), str, 1));
        int i = fl.e;
        return (fl) filter.collect(bs.a);
    }

    public final fl h(Locale locale) {
        fl e = ((com.google.android.apps.gsa.nga.engine.education.a.o) this.c.a()).e(locale, t.HOME_SCREEN);
        Stream filter = Collection._EL.stream(e).filter(new m(this, 2));
        int i = fl.e;
        fl flVar = (fl) filter.collect(bs.a);
        flVar.size();
        e.size();
        if (!this.d.i(eu.cS) || !flVar.isEmpty()) {
            return flVar;
        }
        m mVar = this.h;
        z.g(mVar.b.l(mVar.c.a(new com.google.android.apps.gsa.nga.shared.f.a.c(9), ay.a), "[NGA] EducationPreferences.resetHomescreenImpressions", new l(mVar, 2)), new b(6));
        return (fl) Collection._EL.stream(e).collect(bs.a);
    }

    public final fl i(Locale locale, Optional optional) {
        fl n = n(locale, optional, true);
        if (!n.isEmpty() || !this.d.i(br.bt)) {
            return n;
        }
        fl n2 = n(locale, optional, false);
        m mVar = this.h;
        z.g(mVar.b.l(mVar.c.a(new com.google.android.apps.gsa.nga.shared.f.a.b((String) optional.orElse("CURRENT_APPLICATION_UNKNOWN"), 4), ay.a), "[NGA] EducationPreferences.clearInAppQueriesShownList", new com.google.android.apps.gsa.nga.shared.f.a.a(mVar, 17)), new b(8));
        return n2;
    }

    public final boolean j(String str, Locale locale) {
        return Collection._EL.stream(((com.google.android.apps.gsa.nga.engine.education.a.o) this.c.a()).a(f(str, "", locale)).b).anyMatch(new n(this, l(), str, 0));
    }

    public final boolean k(String str, long j, String str2) {
        com.google.android.apps.gsa.nga.shared.f.m b = this.h.b();
        com.google.android.apps.gsa.nga.shared.f.d dVar = com.google.android.apps.gsa.nga.shared.f.d.a;
        str2.getClass();
        cu cuVar = b.e;
        if (cuVar.containsKey(str2)) {
            dVar = (com.google.android.apps.gsa.nga.shared.f.d) cuVar.get(str2);
        }
        str.getClass();
        cu cuVar2 = dVar.b;
        return ((long) (cuVar2.containsKey(str) ? ((Integer) cuVar2.get(str)).intValue() : 0)) >= j;
    }
}
