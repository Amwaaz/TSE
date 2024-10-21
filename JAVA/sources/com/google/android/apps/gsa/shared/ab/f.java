package com.google.android.apps.gsa.shared.ab;

import androidx.lifecycle.an;
import androidx.lifecycle.as;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.base.at;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ab/f.class */
public final class f implements b {
    private static final ha h = ha.t(ev.PAUSED, ev.STOPPED, ev.UNKNOWN);
    private static final ha i = ha.s(ev.STOPPED, ev.UNKNOWN);
    public boolean b;
    public final h g;
    private final Set j = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final as f1363a = new as(ev.UNKNOWN);
    private final as k = new as(false);
    private final as l = new as();
    public final as c = new as();
    private final as m = new as();
    private final as n = new as();
    private final as o = new as(i.f1365a);
    public final as d = new as(g.f1364a);
    public i e = i.f1365a;
    public g f = g.f1364a;
    private final as p = new as();

    public f(h hVar) {
        this.g = hVar;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an a() {
        return this.c;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an b() {
        return this.m;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an c() {
        return this.p;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an d() {
        return this.l;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an e() {
        return this.n;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an f() {
        return this.f1363a;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an g() {
        return this.d;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an h() {
        return this.k;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final an i() {
        return this.o;
    }

    @Override // com.google.android.apps.gsa.shared.ab.b
    public final void j(a aVar) {
        this.j.add(aVar);
    }

    public final void k(boolean z) {
        this.p.l(Boolean.valueOf(z));
    }

    public final void l() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public final void m(boolean z) {
        this.l.l(Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        this.c.l(Boolean.valueOf(z));
        if (z) {
            o(false);
        }
    }

    public final void o(boolean z) {
        this.m.l(Boolean.valueOf(z));
    }

    public final void p(boolean z) {
        this.n.l(Boolean.valueOf(z));
    }

    public final void q(i iVar) {
        this.g.n("onOpaVisualStateChanged", new c(this, iVar, 1));
    }

    public final void r() {
        ev evVar = (ev) this.f1363a.a();
        if (h.contains(evVar)) {
            this.k.l(false);
        } else {
            this.k.l(Boolean.valueOf(this.b));
        }
        if (i.contains(evVar)) {
            this.o.l(i.f1365a);
            this.d.l(g.f1364a);
        } else {
            this.o.l(this.e);
            this.d.l(this.f);
        }
    }

    public final void s(at atVar, int i2) {
        this.g.n("onResponseStateUiUpdated", new d(this, i2, atVar));
    }
}
