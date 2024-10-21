package com.google.android.apps.gsa.nga.engine.v.a;

import com.google.android.apps.gsa.nga.engine.ap.a.b;
import com.google.android.apps.gsa.nga.engine.v.i;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.da;
import com.google.android.apps.gsa.nga.shared.q.d.db;
import com.google.android.apps.gsa.nga.shared.q.g;
import com.google.android.apps.gsa.shared.logger.b.e;
import com.google.android.apps.gsa.shared.logger.b.f;
import com.google.android.apps.gsa.shared.logger.b.h;
import com.google.android.apps.gsa.shared.logger.b.o;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.common.b.fu;
import com.google.common.base.ci;
import com.google.common.o.qn;
import com.google.common.o.r;
import com.google.g.z.w.l;
import com.google.protobuf.ba;
import e.a;
import j$.util.Optional;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/an.class */
public final class an extends h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.libraries.gsa.h.h f808a;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public boolean d = false;
    public Optional e = Optional.empty();
    private final a f;
    private final a g;
    private final ci h;
    private final g i;
    private final j j;
    private final b k;

    public an(a aVar, a aVar2, com.google.android.libraries.gsa.h.h hVar, ci ciVar, j jVar, b bVar, g gVar) {
        this.f = aVar;
        this.g = aVar2;
        this.f808a = hVar;
        this.h = ciVar;
        this.j = jVar;
        this.k = bVar;
        this.i = gVar;
    }

    private final f q(w wVar, ah ahVar, boolean z, boolean z2, long j, qn qnVar) {
        e eVar = new e();
        eVar.a = wVar;
        if (j != 0) {
            eVar.c = j;
        }
        if (ahVar.d.isEmpty()) {
            eVar.b = qnVar.build();
            return eVar.a();
        }
        eVar.c("RecognitionUtteranceId", ahVar.d);
        if (z) {
            eVar.c("RecognitionCandidateId", ahVar.c);
        }
        r rVar = qnVar.instance;
        String str = (rVar.b & 4) != 0 ? rVar.i : this.j.a(ahVar).b;
        qnVar.copyOnWrite();
        r rVar2 = qnVar.instance;
        str.getClass();
        rVar2.b |= 4;
        rVar2.i = str;
        if (z) {
            String str2 = ahVar.c;
            qnVar.copyOnWrite();
            r rVar3 = qnVar.instance;
            str2.getClass();
            rVar3.e |= 1024;
            rVar3.at = str2;
        }
        if (z2) {
            eVar.c("rId", str);
        }
        eVar.b = qnVar.build();
        return eVar.a();
    }

    @Override // com.google.android.apps.gsa.shared.logger.b.h, com.google.android.apps.gsa.nga.engine.v.i
    public final void a(f fVar) {
        long a2 = this.h.a();
        synchronized (this.b) {
            if (this.d) {
                o(fVar, a2, (String) this.e.orElse((Object) null));
                return;
            }
            f fVar2 = fVar;
            if (fVar.e <= 0) {
                e eVar = new e();
                eVar.b(fVar);
                eVar.c = a2;
                fVar2 = eVar.a();
            }
            this.c.add(fVar2);
            if (this.c.size() > 1000) {
                this.c.remove(0);
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void c(w wVar, ah ahVar) {
        a(q(wVar, ahVar, true, false, 0L, (qn) r.a.createBuilder()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void d(w wVar, ah ahVar, long j) {
        a(q(wVar, ahVar, true, false, j, (qn) r.a.createBuilder()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void e(w wVar, ah ahVar) {
        l(wVar, ahVar, (qn) r.a.createBuilder());
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void f(w wVar, ah ahVar) {
        a(q(wVar, ahVar, true, true, 0L, (qn) r.a.createBuilder()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void g(w wVar, ah ahVar) {
        a(q(wVar, ahVar, false, false, 0L, (qn) r.a.createBuilder()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void h(w wVar, ah ahVar, long j) {
        a(q(wVar, ahVar, false, false, j, (qn) r.a.createBuilder()));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void i(w wVar) {
        j(wVar, 0);
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void j(w wVar, int i) {
        qn createBuilder = r.a.createBuilder();
        l b = this.i.b();
        createBuilder.copyOnWrite();
        r rVar = createBuilder.instance;
        b.getClass();
        rVar.R = b;
        rVar.c |= 67108864;
        if (i != 0) {
            createBuilder.copyOnWrite();
            r rVar2 = createBuilder.instance;
            rVar2.x = i - 1;
            rVar2.b |= Integer.MIN_VALUE;
        }
        e eVar = new e();
        eVar.a = wVar;
        eVar.b = createBuilder.build();
        a(eVar.a());
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void k(w wVar, ah ahVar, qn qnVar) {
        a(q(wVar, ahVar, true, false, 0L, qnVar));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void l(w wVar, ah ahVar, qn qnVar) {
        l b = this.i.b();
        qnVar.copyOnWrite();
        r rVar = qnVar.instance;
        r rVar2 = r.a;
        b.getClass();
        rVar.R = b;
        rVar.c |= 67108864;
        k(wVar, ahVar, qnVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void m(w wVar, ah ahVar, qn qnVar) {
        a(q(wVar, ahVar, false, false, 0L, qnVar));
    }

    @Override // com.google.android.apps.gsa.nga.engine.v.i
    public final void n(w wVar, ah ahVar, qn qnVar, long j) {
        a(q(wVar, ahVar, false, false, j, qnVar));
    }

    public final void o(f fVar, long j, String str) {
        ((o) this.f.a()).b((com.google.android.apps.gsa.shared.logger.b.b) this.g.a());
        com.google.android.libraries.gsa.e.a.a b = com.google.android.libraries.gsa.e.a.a.b(fVar, j, fVar.c, str, fVar.d);
        ((o) this.f.a()).c(b);
        w wVar = b.a;
        b bVar = this.k;
        db dbVar = (db) bVar.f468a.get(wVar);
        if (dbVar != null) {
            ba createBuilder = da.a.createBuilder();
            createBuilder.copyOnWrite();
            da daVar = createBuilder.instance;
            daVar.c = dbVar.V;
            daVar.b |= 1;
            long j2 = b.b;
            createBuilder.copyOnWrite();
            da daVar2 = createBuilder.instance;
            daVar2.b |= 8;
            daVar2.f = j2;
            fu fuVar = b.d;
            bVar.a(createBuilder, (String) fuVar.get("RecognitionUtteranceId"), (String) fuVar.get("RecognitionCandidateId"));
        }
    }
}
