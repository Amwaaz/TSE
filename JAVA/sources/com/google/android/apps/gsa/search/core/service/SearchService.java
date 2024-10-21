package com.google.android.apps.gsa.search.core.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.search.core.u.a.b;
import com.google.android.apps.gsa.shared.o.a.a;
import com.google.android.apps.gsa.shared.util.ar;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.libraries.search.t.a.a.a.e;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.j;
import j$.time.Duration;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/SearchService.class */
public class SearchService extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1147a = j.i("com.google.android.apps.gsa.search.core.service.SearchService");
    public com.google.android.apps.gsa.shared.util.debug.d b;
    public a c;
    public e d;
    public com.google.android.libraries.g.a e;
    af f;
    public com.google.android.apps.gsa.search.shared.service.b.d g;
    com.google.android.apps.gsa.search.shared.service.j h;

    private final af b() {
        if (this.f == null) {
            this.f = this.g.b();
        }
        return this.f;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        f e = f.e(this.c);
        e.l(this.b);
        e.t(printWriter, "");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        com.google.android.apps.gsa.shared.logger.k.f(556);
        if (this.h == null) {
            this.h = new com.google.android.apps.gsa.search.shared.service.j(b());
        }
        return this.h;
    }

    @Override // com.google.android.apps.gsa.search.core.service.q, android.app.Service
    public final void onCreate() {
        com.google.android.apps.gsa.d.e.h(17);
        super.onCreate();
        this.d.g(com.google.android.libraries.search.b.h.b.a.j.d(Duration.ofNanos(this.e.b())));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        af b = b();
        b.d.n("SearchServiceCore [pingClients]", new ab(b, 2));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        af b = b();
        if (intent != null) {
            ab abVar = com.google.common.f.a.e.a;
        }
        if (intent != null) {
            b.d.n("SearchServiceCore [processIntent]", new ac(b, intent));
            return 1;
        }
        ab abVar2 = com.google.common.f.a.e.a;
        com.google.android.apps.gsa.shared.logger.k.f(557);
        return 1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        b bVar;
        super.onTrimMemory(i);
        af b = b();
        Context context = b.c;
        if ((context != null && ar.r(context) && i >= 20) || i >= 60 || (i >= 10 && i <= 15)) {
            b.v = i;
            b.d.n("setMemoryTrimLevel", new z(b, 2));
            com.google.android.apps.gsa.search.core.service.g.b.b bVar2 = (com.google.android.apps.gsa.search.core.service.g.b.b) b.t.a();
            if (bVar2.c) {
                ab abVar = com.google.common.f.a.e.a;
            } else {
                h d = com.google.android.apps.gsa.search.core.service.g.b.b.f1215a.d();
                d.aj(com.google.common.f.a.e.a, "WorkerManager");
                h hVar = d;
                hVar.ak(7407);
                hVar.p("Unloading disused workers");
                Iterator it = bVar2.b.entrySet().iterator();
                while (it.hasNext()) {
                    ((com.google.android.apps.gsa.search.core.service.g.b.a.a) ((Map.Entry) it.next()).getValue()).e();
                }
            }
        }
        if ((i == 20 || i == 40) && (bVar = (b) b.n.a()) != null) {
            bVar.c();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }
}
