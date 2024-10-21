package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.libraries.assistant.soda.d.a.aa;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.ab;
import com.google.common.f.y;
import com.google.common.o.id;
import com.google.common.o.ie;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ba;
import com.google.protobuf.bg;
import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1492a = com.google.common.f.j.i("com.google.android.apps.gsa.shared.speech.hotword.e");
    public final com.google.android.libraries.search.b.b b;
    public final com.google.android.libraries.mdi.download.h.h c;
    public final Boolean d;
    final j e;
    final e.a f;
    final ConcurrentMap g;
    public final g h;
    private final Duration i;
    private final aa j;

    public e(g gVar, com.google.android.libraries.search.b.b bVar, com.google.android.libraries.mdi.download.h.h hVar, e.a aVar, Duration duration, Boolean bool, j jVar, Duration duration2, aa aaVar) {
        this.h = gVar;
        this.b = bVar;
        this.c = hVar;
        this.f = aVar;
        this.d = bool;
        this.e = jVar;
        this.i = duration2;
        this.j = aaVar;
        com.google.common.a.j jVar2 = new com.google.common.a.j();
        jVar2.g(1L);
        jVar2.f(duration.toMinutes(), TimeUnit.MINUTES);
        this.g = jVar2.a().a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.libraries.search.ah.n a() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.speech.hotword.e.a():com.google.android.libraries.search.ah.n");
    }

    final cn b() {
        ab abVar = com.google.common.f.a.e.a;
        cn a2 = this.j.a(this.b);
        i iVar = new i(this, 1);
        g gVar = this.h;
        return i.g(a2, iVar, gVar.a("[APA] HotwordModelConfigFetcher: Updating hotword config", gVar.c));
    }

    final /* synthetic */ Long c(cn cnVar) {
        Long l;
        try {
            l = (Long) dl.w(cnVar);
        } catch (NullPointerException | CancellationException | ExecutionException e) {
            y f = f1492a.f();
            f.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcher");
            a.a.dB(f, "Fetch future failed", (char) 9164, e);
            l = -1000L;
        }
        com.google.common.f.j jVar = f1492a;
        com.google.common.f.h d = jVar.d();
        d.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcher");
        com.google.common.f.h hVar = d;
        hVar.ak(9163);
        hVar.s("Post refresh fetch succeeded: %b", l);
        com.google.common.f.h d2 = jVar.d();
        d2.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcher");
        com.google.common.f.h hVar2 = d2;
        hVar2.ak(9165);
        hVar2.s("logEmbeddedAssetsFetchAppflows with buildID: %d", l);
        if (this.d.booleanValue()) {
            com.google.android.libraries.search.b.i.a c = l.longValue() != -1000 ? com.google.android.libraries.search.b.a.j.a.q.c(com.google.net.util.a.b.a) : com.google.android.libraries.search.b.a.j.a.r.c(com.google.net.util.a.b.p);
            com.google.android.libraries.search.b.b bVar = this.b;
            bg bgVar = id.b;
            ba createBuilder = id.a.createBuilder();
            ba createBuilder2 = ie.a.createBuilder();
            long longValue = l.longValue();
            createBuilder2.copyOnWrite();
            ie ieVar = createBuilder2.instance;
            ieVar.b |= 1;
            ieVar.c = longValue;
            createBuilder.copyOnWrite();
            id idVar = createBuilder.instance;
            ie build = createBuilder2.build();
            build.getClass();
            idVar.k = build;
            idVar.c |= 4096;
            c.k(bgVar, createBuilder.build());
            bVar.a(c);
        }
        return l;
    }

    public final void d() {
        com.google.common.f.h d = f1492a.d();
        d.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcher");
        com.google.common.f.h hVar = d;
        hVar.ak(9159);
        hVar.p("#refreshHotwordConfigCache");
        cn b = b();
        d dVar = new d(this, 1);
        g gVar = this.h;
        i.h(b, ex.e(dVar), gVar.a("[APA] HotwordModelConfigFetcher: Fetch config from MDD", gVar.c));
    }
}
