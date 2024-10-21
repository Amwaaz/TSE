package com.google.android.apps.gsa.languagepack.c;

import com.google.android.apps.gsa.speech.o.g;
import com.google.android.libraries.assistant.auto.b.a.a.c;
import com.google.android.libraries.mdi.download.ae;
import com.google.android.libraries.mdi.download.bg;
import com.google.android.libraries.mdi.download.bz;
import com.google.android.libraries.mdi.download.k;
import com.google.android.libraries.mdi.download.t;
import com.google.android.libraries.storage.a.j;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bo;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import e.a;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/languagepack/c/i.class */
public final class i implements ae {

    /* renamed from: a, reason: collision with root package name */
    public static final d f371a = d.j();
    public final j b;
    public final c c;
    private final l d;
    private final a e;
    private final a f;
    private final k.a.a g;

    public i(c cVar, l lVar, a aVar, j jVar, k.a.a aVar2, a aVar3) {
        this.c = cVar;
        this.d = lVar;
        this.e = aVar3;
        this.f = aVar;
        this.b = jVar;
        this.g = aVar2;
    }

    public final cn a(bz bzVar, String str) {
        if (!((Boolean) this.g.a()).booleanValue()) {
            com.google.common.f.a.a d = f371a.d();
            d.ak(2320);
            d.p("Language pack downloads disabled, skipping.");
            return ci.a;
        }
        d dVar = f371a;
        com.google.common.f.a.a d2 = dVar.d();
        d2.ak(2318);
        d2.s("Download file group for language pack: %s", str);
        if (!this.c.b.containsKey(str)) {
            com.google.common.f.a.a f = dVar.f();
            f.ak(2319);
            f.s("Locale %s is not compatible, please check manifest exists", str);
            return ci.a;
        }
        t b = this.c.b(str);
        l lVar = this.d;
        com.google.common.f.a.a d3 = l.f372a.d();
        d3.ak(2326);
        d3.s("Download locale manifest for: %s", str);
        t b2 = lVar.c.b(str);
        bg bgVar = (bg) k.f3282a.createBuilder();
        String str2 = b2.c;
        bgVar.copyOnWrite();
        k kVar = (k) bgVar.instance;
        str2.getClass();
        kVar.b |= 1;
        kVar.c = str2;
        bgVar.copyOnWrite();
        k kVar2 = (k) bgVar.instance;
        kVar2.i = lVar.b;
        kVar2.b |= 2048;
        ba createBuilder = com.google.android.libraries.mdi.download.j.f3280a.createBuilder();
        String str3 = b2.c;
        createBuilder.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar = (com.google.android.libraries.mdi.download.j) createBuilder.instance;
        str3.getClass();
        jVar.b |= 1;
        jVar.c = str3;
        String str4 = b2.d;
        createBuilder.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar2 = (com.google.android.libraries.mdi.download.j) createBuilder.instance;
        str4.getClass();
        jVar2.b |= 2;
        jVar2.d = str4;
        com.google.android.libraries.mdi.download.i iVar = com.google.android.libraries.mdi.download.i.NONE;
        createBuilder.copyOnWrite();
        com.google.android.libraries.mdi.download.j jVar3 = (com.google.android.libraries.mdi.download.j) createBuilder.instance;
        jVar3.f = iVar.d;
        jVar3.b |= 8;
        bgVar.t(createBuilder);
        k kVar3 = (k) bgVar.build();
        com.google.android.libraries.mdi.download.a aVar = new com.google.android.libraries.mdi.download.a(null);
        aVar.b(kVar3);
        e g = e.g(bzVar.a(aVar.a()));
        dl.y(((bo) g).b, ex.h(new k(str, 0)), ay.a);
        e i = e.g(e.g(g.h(new j(0), ay.a)).i(new h(str, bzVar, b, 0), (Executor) this.f.a()).h(new d(this, str, 5), (Executor) this.f.a()).h(new d(this, str, 6), (Executor) this.f.a())).i(new h(this, str, bzVar, 1), (Executor) this.f.a());
        dl.y(((bo) i).b, ex.h(new k(str, 1)), ay.a);
        return i.h(new j(1), ay.a);
    }

    @Override // com.google.android.libraries.mdi.download.ae
    public final cn b(bz bzVar) {
        return a(bzVar, ((g) this.e.a()).o());
    }
}
