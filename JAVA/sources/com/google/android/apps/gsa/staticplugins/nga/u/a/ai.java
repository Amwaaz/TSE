package com.google.android.apps.gsa.staticplugins.nga.u.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.gsa.staticplugins.nga.u.t;
import com.google.android.libraries.mdi.download.aw;
import com.google.android.libraries.mdi.download.ax;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.mdi.download.workmanager.workers.c;
import com.google.android.libraries.phenotype.client.af;
import com.google.common.b.bs;
import com.google.common.b.dk;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.fu;
import com.google.common.b.im;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Predicate;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/ai.class */
public final class ai implements com.google.android.apps.gsa.shared.util.debug.a.b, com.google.android.apps.gsa.shared.x.a, c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f1701a = com.google.common.f.a.d.j();
    public static final Comparator b;
    public final Context c;
    public final com.google.android.apps.gsa.search.core.h.p d;
    public final af e;
    public final com.google.android.libraries.gsa.h.h f;
    public final com.google.android.libraries.gsa.h.h g;
    public final com.google.common.v.f h;
    public final com.google.android.apps.gsa.staticplugins.nga.t.c i;
    public final fu j;
    public final com.google.android.apps.gsa.nga.shared.ab.f k;
    public final Queue l;
    public final bj m;
    public Optional n;
    private final e.a o;
    private final t p;
    private final fl q;
    private final e.a r;

    static {
        g gVar = new g(13);
        Comparator naturalOrder = Comparator._CC.naturalOrder();
        naturalOrder.getClass();
        b = Comparator._CC.comparing(gVar, new im(naturalOrder));
    }

    public ai(final Context context, e.a aVar, t tVar, com.google.android.apps.gsa.search.core.h.p pVar, af afVar, com.google.android.libraries.gsa.h.h hVar, final com.google.android.libraries.gsa.h.h hVar2, com.google.common.v.f fVar, com.google.android.apps.gsa.staticplugins.nga.t.c cVar, e eVar, com.google.android.apps.gsa.shared.util.debug.d dVar, com.google.android.apps.gsa.nga.shared.ab.f fVar2, e.a aVar2) {
        final dk dkVar = new dk(100);
        this.l = dkVar;
        bj bjVar = new bj();
        this.m = bjVar;
        this.n = Optional.empty();
        this.c = context;
        this.o = aVar;
        this.p = tVar;
        this.d = pVar;
        this.e = afVar;
        this.f = hVar;
        this.g = hVar2;
        this.h = fVar;
        this.i = cVar;
        fl t = fl.t(eVar.b(eu.Z, "data_sync_configuration_sources"), eVar.a(eu.mF, "use_canary_sot_filegroups"), eVar.a(eu.mI, "use_head_sot_filegroups"), eVar.a(eu.bG, "enable_automatic_download_of_initial_data"), eVar.b(eu.jB, "mdd_configuration_mode"));
        this.q = t;
        fg fgVar = new fg(4);
        fgVar.i(t);
        fgVar.h(eVar.a(eu.mK, "use_sot_filegroup_populator [irrelevant for app versions > 12.5]"));
        this.j = (fu) Collection._EL.stream(fgVar.g()).collect(bs.e(new g(8), new g(9), new l(2)));
        this.k = fVar2;
        this.r = aVar2;
        bjVar.a(new Callable(context, dkVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.z

            /* renamed from: a, reason: collision with root package name */
            public final Context f1711a;
            public final Queue b;

            {
                this.f1711a = context;
                this.b = dkVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.f1711a;
                File h = ai.h(context2);
                if (!h.exists() && !h.mkdir()) {
                    com.google.common.f.a.a f = ai.f1701a.f();
                    f.ak(15386);
                    f.p("Failed to create events directory");
                    return null;
                }
                File[] listFiles = ai.h(context2).listFiles();
                if (listFiles == null) {
                    com.google.common.f.a.a f2 = ai.f1701a.f();
                    f2.ak(15385);
                    f2.p("Failed to list files in events directory");
                    return null;
                }
                Queue queue = this.b;
                Stream map = DesugarArrays.stream(listFiles).sorted(ai.b).map(new g(11)).filter(new Predicate() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.x
                    @Override // java.util.function.Predicate
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate._CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate negate() {
                        return Predicate._CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                        return Predicate._CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Optional) obj).isPresent();
                    }
                }).map(new g(12));
                int i = fl.e;
                fl flVar = (fl) map.collect(bs.a);
                synchronized (queue) {
                    fl m = fl.m(queue);
                    queue.clear();
                    queue.addAll(flVar);
                    queue.addAll(m);
                }
                return null;
            }
        }, new Executor(hVar2) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.aa

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.libraries.gsa.h.h f1699a;

            {
                this.f1699a = hVar2;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                com.google.common.f.a.d dVar2 = ai.f1701a;
                runnable.getClass();
                this.f1699a.n("[NGA] NgaSyncDumper.readEventsFromDisk", new s(runnable));
            }
        });
        hVar2.n("[NGA] NgaSyncDumper.refreshBreakdown", new o(this, hVar, aVar2));
        dVar.a(this);
    }

    public static File h(Context context) {
        return new File(context.getCacheDir(), "sync_events");
    }

    public static String i(al alVar) {
        return (String) Collection._EL.stream(DesugarCollections.unmodifiableMap(alVar.b).entrySet()).map(new q(8)).sorted().collect(Collectors.joining(", ", "{", "}"));
    }

    private final Collector l(Function function, Function function2) {
        return Collectors.collectingAndThen(Collectors.toMap(new ad(this, function), function2, new ae()), new q(5));
    }

    private final void m(String str, Optional optional) {
        cn a2 = this.g.a("[NGA] NgaSyncDumper.buildEvent.getPhDataFileGroups", new u(this, 0));
        bz bzVar = (bz) this.o.a();
        aw a3 = ax.a();
        a3.d(true);
        cn h = bzVar.h(a3.a());
        cn c = this.p.c();
        cn f = com.google.android.apps.gsa.nga.shared.ah.a.z.f(this.q, new q(4));
        this.f.m(dl.i(new cn[]{h, c, a2, f}).a(new v(this, a2, c, h, f, optional, str), new w(this, 0)), "[NGA] NgaSyncDumper.addEvent", new ah(this, str));
    }

    @Override // com.google.android.apps.gsa.shared.x.a
    public final void a(String str) {
        c(str);
    }

    @Override // com.google.android.apps.gsa.shared.x.a
    public final void b(String str, Throwable th) {
        m(str, Optional.of(th));
    }

    @Override // com.google.android.libraries.mdi.download.workmanager.workers.c
    public final void c(String str) {
        m(str, Optional.empty());
        j();
    }

    @Override // com.google.android.libraries.mdi.download.workmanager.workers.c
    public final void e(String str, Throwable th) {
        m(str, Optional.of(th));
    }

    public final Collector f() {
        return l(new q(6), new q(7));
    }

    public final Collector g() {
        return l(new q(1), new q(0));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fl b2;
        com.google.common.f.a.d dVar = f1701a;
        com.google.common.f.a.a d = dVar.d();
        d.ak(15390);
        d.p("Dumping NgaSync's state.");
        synchronized (this.l) {
            b2 = fl.m(this.l).b();
        }
        m("DUMP_TASK", Optional.empty());
        com.google.common.f.a.a d2 = dVar.d();
        d2.ak(15392);
        d2.p("Dumping Data Usage breakdown");
        Optional optional = this.n;
        fVar.q("Nga Mdd Breakdown Info");
        String str = true != optional.isPresent() ? "Not available" : "Available";
        fVar.a("Breakdown Status").a(new com.google.android.apps.gsa.shared.util.b.d(str, false));
        com.google.common.f.a.a d3 = dVar.d();
        d3.ak(15393);
        d3.s("Breakdown status: %s", str);
        if (!optional.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            b bVar = (b) optional.get();
            fVar.b("Total Size").a(new com.google.android.apps.gsa.shared.util.b.d(Formatter.formatFileSize(this.c, bVar.c), false));
            String format = String.format(Locale.ENGLISH, "Total Size: %d", Long.valueOf(bVar.c));
            sb.append(format);
            sb.append('\n');
            com.google.common.f.a.a d4 = dVar.d();
            d4.ak(15394);
            d4.s("%s", format);
            for (a aVar : bVar.d) {
                com.google.android.apps.gsa.shared.util.debug.a.f d5 = fVar.d((Object) null);
                d5.q("MDD Group");
                d5.b("Group Name").a(new com.google.android.apps.gsa.shared.util.b.d(aVar.c, false));
                d5.b("Version").a(new com.google.android.apps.gsa.shared.util.b.d(TextUtils.join((CharSequence) ", ", (Iterable) aVar.d), false));
                d5.b("Size (including shared files)").a(new com.google.android.apps.gsa.shared.util.b.d(Formatter.formatFileSize(this.c, aVar.e), false));
                d5.b("Shared Files Size").a(new com.google.android.apps.gsa.shared.util.b.d(Formatter.formatFileSize(this.c, aVar.f), false));
                sb.append(String.format(Locale.ENGLISH, "Group: %s, Versions: %s, Size: %d, Shared Size: %d", aVar.c, TextUtils.join((CharSequence) ", ", (Iterable) aVar.d), Long.valueOf(aVar.e), Long.valueOf(aVar.f)));
                sb.append('\n');
            }
            com.google.common.f.a.a d6 = f1701a.d();
            d6.ak(15395);
            d6.p("Attaching breakdown to feedback data");
            fVar.j("Nga Mdd Breakdown Info", sb.toString());
        }
        String str2 = (String) Collection._EL.stream(b2).map(new r(this, 1)).collect(Collectors.joining("\n", "\n", ""));
        com.google.common.f.a.a d7 = f1701a.d();
        d7.ak(15391);
        d7.p("Dumping NgaSync events");
        fVar.i("Nga Sync Info", str2, false);
    }

    public final void j() {
        k(this.f, (n) this.r.a());
    }

    public final void k(com.google.android.libraries.gsa.h.h hVar, n nVar) {
        new ae(nVar.a(), hVar, "[NGA] NgaSyncDumper.calculateBreakdown()").a(new be(this) { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.ab

            /* renamed from: a, reason: collision with root package name */
            public final ai f1700a;

            {
                this.f1700a = this;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                this.f1700a.n = Optional.of((b) obj);
            }
        }).a(new be() { // from class: com.google.android.apps.gsa.staticplugins.nga.u.a.ac
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                aus.g(ai.f1701a.f(), obj, "Something went wrong while calculating the data usage breakdown.", (char) 15397);
            }
        });
    }
}
