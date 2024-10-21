package com.google.android.apps.gsa.nga.engine.r;

import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.bu;
import com.google.android.apps.gsa.nga.shared.q.c.bv;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.bs;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.qj;
import com.google.common.r.k;
import j$.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/r/b.class */
public final class b {
    public final g d;
    private final e e;
    private final x f;
    public final Object b = new Object();
    public boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f640a = new AtomicReference(j.f643a);

    public b(e eVar, g gVar, x xVar) {
        this.e = eVar;
        this.d = gVar;
        this.f = xVar;
    }

    public final void a(List list, Locale locale) {
        e eVar = this.e;
        long max = Math.max(eVar.b.d(eu.iF), 0L);
        com.google.android.apps.gsa.nga.engine.understanding.h.a.d dVar = eVar.f642a;
        int j = k.j(max);
        if (j < 0) {
            throw new IllegalArgumentException("maxKeywordsCount should be greater or equal zero");
        }
        ha haVar = (ha) Collection._EL.stream(list).map(new f(dVar, locale)).filter(new g()).collect(bs.b);
        fg h = fl.h(haVar.size());
        qj j2 = haVar.j();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!j2.hasNext()) {
                break;
            }
            ha haVar2 = (ha) j2.next();
            int i3 = j - i2;
            if (i3 < haVar2.size()) {
                ha haVar3 = (ha) Collection._EL.stream(haVar2).limit(i3).collect(bs.b);
                h.h(haVar3);
                haVar3.size();
                break;
            }
            h.h(haVar2);
            i = i2 + haVar2.size();
        }
        fl g = h.g();
        this.f640a.set(new j(dVar, g, locale, Collection._EL.stream(g).mapToInt(new i()).sum(), Collection._EL.stream(haVar).mapToInt(new i()).sum()));
        this.f.b(new bv(Double.valueOf(r0.e)));
        this.f.b(new bu(Double.valueOf(r0.f)));
        list.size();
    }
}
