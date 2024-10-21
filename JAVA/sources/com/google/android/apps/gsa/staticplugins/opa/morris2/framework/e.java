package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.hc;
import com.google.android.libraries.assistant.auto.tng.morris.c.s;
import com.google.android.libraries.assistant.auto.tng.morris.c.t;
import com.google.android.libraries.assistant.auto.tng.morris.e.ek;
import com.google.android.libraries.assistant.auto.tng.morris.e.em;
import com.google.android.libraries.assistant.auto.tng.morris.e.eo;
import com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.c;
import com.google.android.libraries.assistant.auto.tng.morris.h.m;
import com.google.android.libraries.g.a;
import com.google.apps.tiktok.concurrent.k;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.db;
import com.google.common.util.concurrent.dl;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/morris2/framework/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1782a = j.i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.e");
    public final b b;
    public final h c;
    public final g d;
    public final Executor e;
    public final s f;
    public final t g;
    public final a h;
    public final k.a.a i;
    public final com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.g j;
    public final c k;
    public final Context l;
    public final k.a.a m;
    public final Optional n;
    public final com.google.android.apps.gsa.staticplugins.opa.morris2.j.a q;
    public com.google.android.libraries.assistant.auto.tng.morris.framework.e r;
    public int t;
    public final com.google.android.apps.gsa.staticplugins.opa.bo.a w;
    public final com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h x;
    public final hc y;
    public volatile em s = em.STATUS_INSTANTIATED;
    public Optional o = Optional.empty();
    public Optional p = Optional.empty();
    public volatile com.google.android.libraries.assistant.auto.tng.morris.e.c u = com.google.android.libraries.assistant.auto.tng.morris.e.c.f2774a;
    public eo v = eo.f2783a;

    public e(Context context, b bVar, h hVar, g gVar, s sVar, t tVar, a aVar, k.a.a aVar2, com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.g gVar2, c cVar, com.google.android.apps.gsa.staticplugins.opa.bo.a aVar3, hc hcVar, com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h hVar2, k.a.a aVar4, Optional optional, cr crVar, com.google.android.apps.gsa.staticplugins.opa.morris2.j.a aVar5) {
        this.l = context;
        this.b = bVar;
        this.c = hVar;
        this.d = gVar;
        this.e = new db(crVar);
        this.f = sVar;
        this.g = tVar;
        this.h = aVar;
        this.j = gVar2;
        this.k = cVar;
        this.w = aVar3;
        this.y = hcVar;
        this.n = optional;
        this.x = hVar2;
        this.m = aVar4;
        this.q = aVar5;
        this.i = aVar2;
    }

    public static Intent a(String str) {
        return new Intent(str).setFlags(268435456);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final Duration b() {
        return this.p.isPresent() ? Duration.between((Temporal) this.p.get(), Instant.ofEpochMilli(this.h.a())) : Duration.ZERO;
    }

    public final void c(ek ekVar) {
        ab abVar = com.google.common.f.a.e.a;
        m mVar = new m(this.h);
        mVar.e = mVar.d.f().toEpochMilli();
        k.d(dl.r(ex.l(new c(this, ekVar, mVar)), this.e), "State processing failed", new Object[0]);
    }

    public final boolean d() {
        int cN = a.a.cN(this.u.b);
        return cN == 0 || cN != 2;
    }

    public final int e() {
        int cN = a.a.cN(this.u.b);
        int i = cN;
        if (cN == 0) {
            i = 1;
        }
        return i;
    }
}
