package com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.a.a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.a.j;
import com.google.apps.tiktok.tracing.dj;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/d/d/l.class */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d f1740a;
    public final Context b;
    public final j c;
    public final cr e;
    public final dj f;
    public final a h;
    public final com.google.android.apps.gsa.shared.util.q.a i;
    public e j;
    public final int m;
    public boolean k = false;
    public d l = null;
    public final bj g = new bj();
    public final k d = new k(this);

    public l(Context context, j jVar, com.google.android.apps.gsa.opa.a.a.a aVar, cr crVar, dj djVar, a aVar2, com.google.android.apps.gsa.shared.util.q.a aVar3, int i) {
        this.b = context;
        this.c = jVar;
        this.f1740a = aVar.a("AA.Context");
        this.e = crVar;
        this.f = djVar;
        this.h = aVar2;
        this.m = i;
        this.i = aVar3;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d b() {
        return com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.a;
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn c(e eVar) {
        return this.g.b(new g(this, eVar), this.e);
    }

    @Override // com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.g
    public final cn e() {
        return this.g.b(new j(this), this.e);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("HeadsetStateTriggerSource");
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d("Is registered? " + this.k, false));
        e eVar = this.j;
        StringBuilder sb = new StringBuilder("Has listener? ");
        sb.append(eVar != null);
        fVar.r(new com.google.android.apps.gsa.shared.util.b.d(sb.toString(), false));
    }
}
