package com.google.android.apps.gsa.nga.engine.ar.c;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ar.b.d;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bi;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.u.l.a.b;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/c/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f491a;
    private final com.google.android.libraries.g.a b;
    private b c;
    private boolean d;
    private final af e;
    private final ad f;
    private final d g;

    public a(ad adVar, d dVar, Context context, com.google.android.libraries.g.a aVar, af afVar) {
        this.f = adVar;
        this.g = dVar;
        this.f491a = context;
        this.b = aVar;
        this.e = afVar;
    }

    private final void d(int i) {
        bk bkVar = bk.MULTI_DEVICE_ARBITRATION;
        ba createBuilder = bj.a.createBuilder();
        ba createBuilder2 = bi.a.createBuilder();
        createBuilder2.copyOnWrite();
        bi biVar = createBuilder2.instance;
        biVar.c = i - 1;
        biVar.b |= 1;
        bi build = createBuilder2.build();
        createBuilder.copyOnWrite();
        bj bjVar = createBuilder.instance;
        build.getClass();
        bjVar.c = build;
        bjVar.b = 105;
        this.e.b(bkVar, createBuilder.build(), ah.a);
    }

    private final ba e() {
        ba createBuilder = b.a.createBuilder();
        boolean d = this.f.d();
        createBuilder.copyOnWrite();
        createBuilder.instance.c = d;
        boolean c = this.f.c();
        createBuilder.copyOnWrite();
        createBuilder.instance.d = c;
        return createBuilder;
    }

    public final Optional a() {
        synchronized (this) {
            b bVar = this.c;
            if (bVar != null) {
                this.c = null;
                this.d = true;
                d(5);
                return Optional.of(bVar);
            }
            if (this.d) {
                if (((c) this.g.a().e().orElse(c.UNKNOWN)).equals(c.FOLLOW_ON)) {
                    d(5);
                    return Optional.of(e().build());
                }
                this.d = false;
            }
            d(6);
            return Optional.empty();
        }
    }

    public final void b() {
        synchronized (this) {
            d(2);
            this.c = e().build();
        }
    }

    public final void c(HotwordResult hotwordResult) {
        synchronized (this) {
            d(4);
            ba createBuilder = com.google.android.apps.gsa.nga.shared.u.l.a.a.a.createBuilder();
            float a2 = hotwordResult.a();
            createBuilder.copyOnWrite();
            createBuilder.instance.c = a2;
            float b = hotwordResult.b();
            createBuilder.copyOnWrite();
            createBuilder.instance.b = b;
            com.google.android.apps.gsa.nga.shared.u.l.a.a build = createBuilder.build();
            ba createBuilder2 = com.google.android.apps.gsa.shared.speech.c.a.a.createBuilder();
            HotwordResultMetadata r = HotwordResultMetadata.r(this.f491a, hotwordResult, this.f.d(), hotwordResult.l() > 0 ? hotwordResult.l() : this.b.a(), false);
            float b2 = r.b();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar = createBuilder2.instance;
            aVar.b |= 2;
            aVar.d = b2;
            float c = r.c();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar2 = createBuilder2.instance;
            aVar2.b = 4 | aVar2.b;
            aVar2.e = c;
            float a3 = r.a();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar3 = createBuilder2.instance;
            aVar3.b |= 1;
            aVar3.c = a3;
            float d = r.d();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar4 = createBuilder2.instance;
            aVar4.b |= 8;
            aVar4.f = d;
            long g = r.g();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar5 = createBuilder2.instance;
            aVar5.b |= 64;
            aVar5.i = g;
            int i = r.j().e;
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar6 = createBuilder2.instance;
            aVar6.b |= 128;
            aVar6.j = i;
            boolean p = r.p();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar7 = createBuilder2.instance;
            aVar7.b |= 16;
            aVar7.g = p;
            boolean k = r.k();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar8 = createBuilder2.instance;
            aVar8.b |= 32;
            aVar8.h = k;
            boolean o = r.o();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar9 = createBuilder2.instance;
            aVar9.b |= 2048;
            aVar9.n = o;
            if (r.i().h()) {
                String str = (String) r.i().c();
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.shared.speech.c.a aVar10 = createBuilder2.instance;
                aVar10.b |= 256;
                aVar10.k = str;
            } else {
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.shared.speech.c.a aVar11 = createBuilder2.instance;
                aVar11.b &= -257;
                aVar11.k = com.google.android.apps.gsa.shared.speech.c.a.a.k;
            }
            if (r.h().h()) {
                String str2 = (String) r.h().c();
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.shared.speech.c.a aVar12 = createBuilder2.instance;
                aVar12.b |= 512;
                aVar12.l = str2;
            } else {
                createBuilder2.copyOnWrite();
                com.google.android.apps.gsa.shared.speech.c.a aVar13 = createBuilder2.instance;
                aVar13.b &= -513;
                aVar13.l = com.google.android.apps.gsa.shared.speech.c.a.a.l;
            }
            int e = r.e();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar14 = createBuilder2.instance;
            aVar14.b |= 1024;
            aVar14.m = e;
            boolean l = r.l();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar15 = createBuilder2.instance;
            aVar15.b |= 4096;
            aVar15.o = l;
            boolean n = r.n();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar16 = createBuilder2.instance;
            aVar16.b |= 8192;
            aVar16.p = n;
            boolean m = r.m();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar17 = createBuilder2.instance;
            aVar17.b |= 65536;
            aVar17.q = m;
            long f = r.f();
            createBuilder2.copyOnWrite();
            com.google.android.apps.gsa.shared.speech.c.a aVar18 = createBuilder2.instance;
            aVar18.b |= 131072;
            aVar18.r = f;
            createBuilder2.build();
            ba e2 = e();
            e2.copyOnWrite();
            b bVar = e2.instance;
            b bVar2 = b.a;
            build.getClass();
            bVar.e = build;
            bVar.b |= 1;
            e2.copyOnWrite();
            b bVar3 = e2.instance;
            com.google.android.apps.gsa.shared.speech.c.a build2 = createBuilder2.build();
            build2.getClass();
            bVar3.f = build2;
            bVar3.b |= 2;
            this.c = e2.build();
        }
    }
}
