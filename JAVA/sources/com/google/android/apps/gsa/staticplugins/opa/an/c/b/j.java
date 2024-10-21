package com.google.android.apps.gsa.staticplugins.opa.an.c.b;

import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gsa.nga.shared.q.c.dn;
import com.google.android.apps.gsa.nga.shared.q.c.do;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.h;
import com.google.common.f.y;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/an/c/b/j.class */
final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    final n f1756a;

    public j(n nVar) {
        this.f1756a = nVar;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.m
    public final String a() {
        return "Disconnected";
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.m
    public final void b() {
        boolean z;
        h d = n.f1757a.d();
        d.aj(e.a, "NgaEntryPointEventSendr");
        h hVar = d;
        hVar.ak(17778);
        hVar.p("setupConnection");
        boolean a2 = this.f1756a.m.a();
        int i = Build.VERSION.SDK_INT;
        m hVar2 = new h(this.f1756a);
        try {
            z = this.f1756a.o.f1755a.bindService(new Intent().setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.apps.gsa.publicsearch.IPublicSearchService"), ((h) hVar2).b, i >= 30 ? 4097 : 1);
        } catch (Throwable th) {
            y e = n.f1757a.e();
            e.aj(e.a, "NgaEntryPointEventSendr");
            a.a.dB(e, "Exception when binding to public search service", (char) 17780, th);
            z = false;
        }
        n nVar = this.f1756a;
        dn d2 = do.d();
        d2.b(((com.google.android.apps.gsa.nga.shared.q.f.a) nVar.f.map(new i()).orElse(com.google.android.apps.gsa.nga.shared.q.f.a.a)).e);
        d2.c(a2);
        d2.d(z);
        nVar.n.b(d2.a());
        if (z) {
            this.f1756a.b(hVar2);
            return;
        }
        h f = n.f1757a.f();
        f.aj(e.a, "NgaEntryPointEventSendr");
        h hVar3 = f;
        hVar3.ak(17779);
        hVar3.p("Unable to bind to public search service.");
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.m
    public final void c(String str) {
        com.google.common.f.j jVar = n.f1757a;
        ab abVar = e.a;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.m
    public final /* synthetic */ void d() {
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.an.c.b.m
    public final void e() {
        com.google.common.f.j jVar = n.f1757a;
        ab abVar = e.a;
    }
}
