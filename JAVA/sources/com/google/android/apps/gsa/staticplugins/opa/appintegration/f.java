package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.shared.a;
import com.google.android.apps.gsa.assistant.shared.c;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.libraries.assistant.d.c.b.a.g;
import com.google.android.libraries.assistant.d.c.c.ad;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1760a = j.i("com.google.android.apps.gsa.staticplugins.opa.appintegration.f");
    public static final a b = new b();
    public final Context c;
    public final e.a d;
    public final com.google.android.apps.gsa.search.core.h.p e;
    public final at f;
    public at g;
    public at h;
    public a i;
    public at j;
    public final e k;
    public at l;
    at m;
    private final o n;
    private final u o;
    private final c p;
    private final e.a q;
    private final h r;

    public f(Context context, o oVar, u uVar, c cVar, e.a aVar, h hVar, e.a aVar2, com.google.android.apps.gsa.search.core.h.p pVar, at atVar) {
        com.google.common.base.a aVar3 = com.google.common.base.a.a;
        this.g = aVar3;
        this.h = aVar3;
        this.i = b;
        this.j = aVar3;
        this.k = new e(this);
        this.l = aVar3;
        this.m = aVar3;
        this.c = context;
        this.n = oVar;
        this.o = uVar;
        this.p = cVar;
        this.q = aVar;
        this.r = hVar;
        this.d = aVar2;
        this.e = pVar;
        this.f = atVar;
    }

    public static void a(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException(str.concat(" should be called in main thread"));
        }
    }

    public final void b(int i) {
        ab abVar = com.google.common.f.a.e.a;
        if (i >= 5) {
            com.google.common.f.h f = f1760a.f();
            f.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
            com.google.common.f.h hVar = f;
            hVar.ak(16439);
            hVar.p("#connectIntegrationService(): Exceeded maximum number of reconnection attempts.");
            if (this.o.u((String) this.p.a().a())) {
                ((l) this.q.a()).b(false);
            }
            this.n.c();
            this.p.e(null);
            this.n.e();
            this.p.g(com.google.android.apps.gsa.assistant.shared.b.NOT_CONNECTED);
            return;
        }
        d dVar = new d(this, i);
        a("bindService");
        this.i = dVar;
        if (this.k.f1759a == 3) {
            com.google.common.f.h f2 = f1760a.f();
            f2.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
            com.google.common.f.h hVar2 = f2;
            hVar2.ak(16451);
            hVar2.p("#bindService(): calling bindService when service is connected.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gsa.opa.APP_INTEGRATION_CALLBACK_SERVICE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.appintegration.service.AppIntegrationService"));
        e eVar = this.k;
        eVar.f1759a = 2;
        if (this.c.bindService(intent, eVar, 1)) {
            return;
        }
        com.google.common.f.h f3 = f1760a.f();
        f3.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
        com.google.common.f.h hVar3 = f3;
        hVar3.ak(16449);
        hVar3.p("#bindService(): failed to bind service.");
        this.k.f1759a = 0;
        d(i + 1);
    }

    public final void c() {
        ab abVar = com.google.common.f.a.e.a;
        if (this.l.h()) {
            bc bcVar = (bc) com.google.android.libraries.assistant.d.c.c.f.a.createBuilder();
            com.google.android.libraries.assistant.d.c.c.e eVar = com.google.android.libraries.assistant.d.c.c.e.d;
            bcVar.copyOnWrite();
            com.google.android.libraries.assistant.d.c.c.f fVar = bcVar.instance;
            fVar.c = eVar.l;
            fVar.b |= 1;
            bcVar.w(ad.a, this.l.c());
            f(bcVar);
            e(bcVar);
            this.m = this.l;
            this.l = com.google.common.base.a.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.common.util.concurrent.cn, java.lang.Object] */
    public final void d(int i) {
        ab abVar = com.google.common.f.a.e.a;
        if (this.j.h()) {
            this.j.c().cancel(true);
        }
        this.j = at.k(this.r.j("opa:morris-bind-integration-service", Duration.ofMillis(1000L), new a(this, i)));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [io.grpc.j.ac, java.lang.Object] */
    public final void e(bc bcVar) {
        if (this.g.h()) {
            ?? c = this.g.c();
            ba createBuilder = g.a.createBuilder();
            createBuilder.copyOnWrite();
            g gVar = createBuilder.instance;
            com.google.android.libraries.assistant.d.c.c.f build = bcVar.build();
            build.getClass();
            gVar.c = build;
            gVar.b |= 1;
            c.iU(createBuilder.build());
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.android.libraries.assistant.d.c.a.c, java.lang.Object] */
    public final void f(bc bcVar) {
        com.google.android.libraries.assistant.d.c.c.e a2 = com.google.android.libraries.assistant.d.c.c.e.a(bcVar.instance.c);
        com.google.android.libraries.assistant.d.c.c.e eVar = a2;
        if (a2 == null) {
            eVar = com.google.android.libraries.assistant.d.c.c.e.a;
        }
        if (!this.h.h()) {
            throw new IllegalStateException(String.format("Check connected state before use for event: %d", Integer.valueOf(eVar.l)));
        }
        try {
            this.h.c().a(bcVar.build().toByteArray());
        } catch (RemoteException e) {
            com.google.common.f.h f = f1760a.f();
            f.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
            com.google.common.f.h g = f.g(e);
            g.ak(16441);
            com.google.android.libraries.assistant.d.c.c.e a3 = com.google.android.libraries.assistant.d.c.c.e.a(bcVar.instance.c);
            com.google.android.libraries.assistant.d.c.c.e eVar2 = a3;
            if (a3 == null) {
                eVar2 = com.google.android.libraries.assistant.d.c.c.e.a;
            }
            g.s("forwardCallbackEvent(): %s failed.", eVar2);
        }
    }
}
