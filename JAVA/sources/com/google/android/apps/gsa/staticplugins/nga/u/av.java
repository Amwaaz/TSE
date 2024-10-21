package com.google.android.apps.gsa.staticplugins.nga.u;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.apps.gsa.staticplugins.nga.t.c;
import com.google.android.apps.gsa.staticplugins.nga.u.a.ai;
import com.google.android.libraries.mdi.download.aa;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.q;
import e.a;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/av.class */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1713a = d.j();
    private static final long u = TimeUnit.SECONDS.toMillis(10);
    private final bp A;
    private final bq E;
    public final com.google.android.libraries.gsa.h.h b;
    public final com.google.android.libraries.gsa.h.h c;
    public final p d;
    public final c e;
    public final com.google.android.apps.gsa.nga.shared.ab.f f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final j l;
    public final a m;
    public final a n;
    public final a o;
    public final f p;
    public final ai q;
    public final a r;
    private final a v;
    private final com.google.android.apps.gsa.search.core.h.h w;
    private final y x;
    private final com.google.android.apps.gsa.l.f.a y;
    private final ay z;
    private final AtomicBoolean B = new AtomicBoolean(false);
    private final AtomicBoolean C = new AtomicBoolean(false);
    private final bj D = new bj();
    public final Object s = new Object();
    public cn t = dl.n(new ArrayList());

    public av(com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, p pVar, c cVar, com.google.android.apps.gsa.nga.shared.ab.f fVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, j jVar, a aVar7, com.google.android.apps.gsa.search.core.h.h hVar3, a aVar8, y yVar, com.google.android.apps.gsa.l.f.a aVar9, a aVar10, ay ayVar, bp bpVar, ai aiVar, f fVar2, bq bqVar, a aVar11) {
        this.b = hVar;
        this.c = hVar2;
        this.d = pVar;
        this.e = cVar;
        this.f = fVar;
        this.j = aVar;
        this.k = aVar2;
        this.g = aVar3;
        this.h = aVar4;
        this.i = aVar5;
        this.m = aVar6;
        this.l = jVar;
        this.v = aVar7;
        this.w = hVar3;
        this.n = aVar8;
        this.x = yVar;
        this.y = aVar9;
        this.o = aVar10;
        this.z = ayVar;
        this.A = bpVar;
        this.q = aiVar;
        this.p = fVar2;
        this.E = bqVar;
        this.r = aVar11;
    }

    public final cn a() {
        this.B.set(true);
        return this.c.k(this.b.k(c(com.google.android.libraries.mdi.d.DOWNLOADED), "[NGA] NgaInitialDownloader.discoverPresentGroupIds.toSet", new b(this, 12)), "[NGA] NgaInitialDownloader.discoverPresentGroupIds.includeSystemImage", new b(this, 13));
    }

    public final cn b(q qVar) {
        return this.D.b(qVar, new bg(this, 1));
    }

    public final cn c(com.google.android.libraries.mdi.d dVar) {
        return this.b.k(this.b.b("[NGA] NgaInitialDownloader.getClientFileGroups", new r(this, 2)), "[NGA] NgaInitialDownloader.getClientFileGroups.getLatest", new aj(this, dVar, 3));
    }

    public final cn d() {
        return dl.h((Iterable) Collection._EL.stream((Set) this.v.a()).map(new d(this, 5)).collect(Collectors.toList())).a(new bj(1), com.google.common.util.concurrent.ay.a);
    }

    public final cn e(Locale locale, boolean z) {
        cn b;
        ((ae) this.n.a()).b();
        ((ag) this.m.a()).f(3);
        cn k = this.b.k(this.b.l(this.b.l(this.b.f(ag.e(this.w.a(), Duration.ofMillis(u), this.b), "[NGA] NgaInitialDownloader.tryStartDownload.refreshFlagsError", Exception.class, new b(this, 17)), "[NGA] NgaInitialDownloader.tryStartDownload.refreshFileGroups", new b(this, 18)), "[NGA] NgaInitialDownloader.tryStartDownload.discoverPresentGroupIds", new b(this, 19)), "[NGA] NgaInitialDownloader.tryStartDownload.discoverMissingGroupIds", new aj(this, locale, 4));
        cn l = this.b.l(k, "[NGA] NgaInitialDownloader.tryStartDownload.recalculateDownladSize", new am(this, false, 1));
        synchronized (this.s) {
            cn l2 = this.b.l(l, "[NGA] NgaInitialDownloader.tryStartDownload.downloadGroupIds.shouldDownload", new aj(this, k, 5));
            this.t = l2;
            b = com.google.android.apps.gsa.v.c.b(l2);
        }
        cn l3 = this.b.l(this.b.f(b, "[NGA] NgaInitialDownloader.tryStartDownload.handleDownloadError", Exception.class, new b(this, 20)), "[NGA] NgaInitialDownloader.tryStartDownload.downloadComplete", new an(this, 1));
        new ae(l3, this.b, "[NGA] NgaInitialDownloader.tryStartDownload.afterDownloadDiscovery.processResult").a(new ai(this, locale)).a(new aq(this, 1));
        return this.b.l(l3, "[NGA] NgaInitialDownloader.tryStartDownload.downloadComplete", new am(this, true, 0));
    }

    public final Set f(Locale locale) {
        return (Set) Collection._EL.stream(this.x.a()).filter(new ak(this, this.l.a(locale), 0)).collect(Collectors.toSet());
    }

    public final boolean g() {
        com.google.common.f.a.a d = bq.f1717a.d();
        d.ak(15379);
        d.p("NGA Sync: beginOnDataPresent");
        this.E.d();
        this.A.b();
        return true;
    }

    public final cn h(String str) {
        com.google.common.f.a.a d = f1713a.d();
        d.ak(15335);
        d.s("Downloading '%s' and refreshing groups afterwards", str);
        t tVar = (t) this.k.a();
        com.google.android.libraries.mdi.download.z a2 = aa.a();
        a2.d(str);
        a2.c(com.google.android.libraries.mdi.download.f.a);
        return this.b.f(this.b.l(tVar.a(a2.a()), a.a.dC(str, "[NGA] NgaInitialDownloader.downloadAndRefreshGroups.refreshAfterDownload '", "'"), new b(this, 9)), "[NGA] NgaInitialDownloader.downloadAndRefreshGroups.catchEx", Exception.class, new b(str, 10));
    }
}
