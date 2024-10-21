package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.g.e;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.bt;
import com.google.android.apps.gsa.shared.logger.b.h;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.apps.gsa.shared.util.o.c;
import com.google.android.apps.gsa.staticplugins.opa.al.a.b;
import com.google.android.apps.gsa.staticplugins.opa.util.at;
import com.google.common.base.ca;
import com.google.common.f.ab;
import com.google.common.f.j;
import e.a;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/gf.class */
public class gf {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1766a = j.i("com.google.android.apps.gsa.staticplugins.opa.gf");
    private boolean b = false;
    private final a c;
    private final a d;
    private final Optional e;
    private final a f;
    private final Optional g;
    private final ca h;
    private final com.google.android.apps.gsa.nga.shared.ui.a.a i;
    private final z j;

    public gf(a aVar, a aVar2, Optional optional, a aVar3, Optional optional2, ca caVar, com.google.android.apps.gsa.nga.shared.ui.a.a aVar4, z zVar) {
        this.c = aVar;
        this.d = aVar2;
        this.e = optional;
        this.f = aVar3;
        this.g = optional2;
        this.h = caVar;
        this.i = aVar4;
        this.j = zVar;
    }

    private final void d(Context context, Intent intent) {
        com.google.android.apps.gsa.staticplugins.opa.al.a aVar;
        new c(context, this.b).ib(intent);
        if (this.g.isPresent()) {
            Bundle extras = intent.getExtras();
            boolean ac = e.ac(extras);
            boolean ag = e.ag(extras);
            if (ac) {
                aVar = com.google.android.apps.gsa.staticplugins.opa.al.a.b;
            } else if (!ag) {
                return;
            } else {
                aVar = com.google.android.apps.gsa.staticplugins.opa.al.a.a;
            }
            ((b) this.g.get()).b(aVar);
        }
    }

    private final void e(Intent intent) {
        ((com.google.android.apps.gsa.nga.shared.aj.a.c) this.e.get()).e(intent);
    }

    private final boolean f(Bundle bundle) {
        boolean z;
        if (!this.j.u() || !this.j.w() || e.ar(bundle)) {
            return false;
        }
        com.google.android.apps.gsa.nga.shared.ui.a.a aVar = this.i;
        ca caVar = this.h;
        int b = aVar.b();
        if (((Boolean) caVar.a()).booleanValue()) {
            this.e.isPresent();
            z = true;
        } else {
            z = false;
        }
        return b == 2 || z;
    }

    private final boolean g(Bundle bundle) {
        if (e.at(bundle) || e.aq(bundle) || e.af(bundle) || e.ae(bundle)) {
            return false;
        }
        if ((bundle != null && com.google.android.libraries.search.t.h.j.e.a().equals(bundle.getString("source"))) || e.aW(bundle) == com.google.android.apps.gsa.assistant.shared.k.c.GHA_MIC || e.aW(bundle) == com.google.android.apps.gsa.assistant.shared.k.c.GMM_MIC || e.aW(bundle) == com.google.android.apps.gsa.assistant.shared.k.c.APP_INTEGRATION_MIC || e.av(bundle)) {
            return false;
        }
        return (((p) this.d.a()).w(az.fN) && e.ag(bundle)) ? false : true;
    }

    public final Intent a(Context context, Bundle bundle, int i) {
        return ((at) this.c.a()).a(context, bundle, i);
    }

    public final void b(Context context, Bundle bundle) {
        ab abVar = com.google.common.f.a.e.a;
        if (g(bundle)) {
            ((h) this.f.a()).b(w.OPA_ANDROID_STARTUP_OTHER);
        }
        j jVar = f1766a;
        com.google.common.f.h d = jVar.d();
        d.aj(com.google.common.f.a.e.a, "OpaStarter");
        com.google.common.f.h hVar = d;
        hVar.ak(15994);
        hVar.p("Starting Opa");
        Intent a2 = e.Z(bundle) ? ((at) this.c.a()).a(context, bundle, e.g(bundle)) : ((at) this.c.a()).a(context, bundle, 268468224);
        Bundle D = e.D(bundle);
        boolean z = true;
        if (D != null) {
            a2.setAction("android.intent.action.SEND");
            a2.addFlags(1);
            a2.setType(D.getString("type"));
            a2.putExtra("android.intent.extra.STREAM", D.getParcelable("android.intent.extra.STREAM"));
            a2.putExtra("android.intent.extra.TEXT", D.getCharSequence("android.intent.extra.TEXT"));
        }
        if (!f(bundle)) {
            d(context, a2);
            return;
        }
        if (!((p) this.d.a()).w(bt.p) || !((p) this.d.a()).w(bt.o)) {
            z = false;
        }
        this.b = z;
        com.google.common.f.h d2 = jVar.d();
        d2.aj(com.google.common.f.a.e.a, "OpaStarter");
        com.google.common.f.h hVar2 = d2;
        hVar2.ak(15995);
        hVar2.s("Force display activity on main screen =  %b", Boolean.valueOf(this.b));
        if (this.b) {
            d(context, a2);
        } else {
            e(a2);
        }
    }

    public final void c(Context context, Bundle bundle, int i) {
        ab abVar = com.google.common.f.a.e.a;
        if (g(bundle)) {
            ((h) this.f.a()).b(w.OPA_ANDROID_STARTUP_OTHER);
        }
        com.google.common.f.h d = f1766a.d();
        d.aj(com.google.common.f.a.e.a, "OpaStarter");
        com.google.common.f.h hVar = d;
        hVar.ak(15998);
        hVar.p("Starting Opa");
        Intent a2 = ((at) this.c.a()).a(context, bundle, i);
        if (f(bundle)) {
            e(a2);
        } else {
            d(context, a2);
        }
    }
}
