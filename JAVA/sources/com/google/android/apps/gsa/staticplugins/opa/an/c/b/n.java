package com.google.android.apps.gsa.staticplugins.opa.an.c.b;

import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.f.a.b;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.v.f;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/an/c/b/n.class */
public class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1757a = com.google.common.f.j.i("com.google.android.apps.gsa.staticplugins.opa.an.c.b.n");
    public static final Duration b = Duration.ofSeconds(1);
    static final Duration c = Duration.ofSeconds(4);
    public static final Duration d = Duration.ofSeconds(60);
    public final h e;
    public final Optional f;
    public final f g;
    public final com.google.android.apps.gsa.shared.util.q.a h;
    public final h i;
    public final List j = new ArrayList();
    public Optional k = Optional.empty();
    public m l = new j(this);
    public final b m;
    public final x n;
    public final a o;

    public n(a aVar, h hVar, Optional optional, b bVar, x xVar, f fVar, h hVar2, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        this.o = aVar;
        this.e = hVar;
        this.f = optional;
        this.m = bVar;
        this.n = xVar;
        this.g = fVar;
        this.i = hVar2;
        this.h = aVar2;
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        try {
            this.o.f1755a.unbindService(serviceConnection);
        } catch (Throwable th) {
            com.google.common.f.h e = f1757a.e();
            e.aj(e.a, "NgaEntryPointEventSendr");
            com.google.common.f.h g = e.g(th);
            g.ak(17789);
            g.H("Unbinding failed (%s): %s", str, th.getMessage());
        }
        j jVar = new j(this);
        com.google.common.f.h d2 = f1757a.d();
        d2.aj(e.a, "NgaEntryPointEventSendr");
        com.google.common.f.h hVar = d2;
        hVar.ak(17791);
        hVar.N("State changed: %s => %s (%s)", this.l.a(), "Disconnected", str);
        this.l = jVar;
    }

    public final void b(m mVar) {
        com.google.common.f.h d2 = f1757a.d();
        d2.aj(e.a, "NgaEntryPointEventSendr");
        com.google.common.f.h hVar = d2;
        hVar.ak(17790);
        hVar.H("State changed: %s => %s", this.l.a(), mVar.a());
        this.l = mVar;
        mVar.d();
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.p
    public final void c(com.google.android.apps.gsa.staticplugins.opa.an.c.d.h hVar, Bundle bundle) {
        ab abVar = e.a;
        this.e.n("sendEventData", new b(this, hVar, bundle));
    }
}
