package com.google.android.apps.gsa.nga.engine.q.a;

import com.google.android.apps.gsa.nga.engine.d.a.bd;
import com.google.android.apps.gsa.nga.engine.n.g;
import com.google.android.apps.gsa.nga.engine.q.a;
import com.google.android.apps.gsa.nga.shared.q.d.bz;
import com.google.g.e.i.bx;
import com.google.g.e.i.cd;
import com.google.g.e.i.ce;
import com.google.protos.e.v.v;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/q/a/b.class */
public final class b implements com.google.android.apps.gsa.nga.engine.n.d {

    /* renamed from: a, reason: collision with root package name */
    private Optional f638a = Optional.empty();
    private final bd b;

    public b(bd bdVar) {
        this.b = bdVar;
    }

    private final void i() {
        synchronized (this) {
            this.f638a = Optional.empty();
            this.b.d(ce.a);
        }
    }

    public final ce a() {
        ce ceVar;
        synchronized (this) {
            ceVar = (ce) b().map(new a()).orElse(ce.a);
        }
        return ceVar;
    }

    public final Optional b() {
        Optional optional;
        synchronized (this) {
            optional = this.f638a;
        }
        return optional;
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final void c(com.google.android.apps.gsa.nga.engine.m.b bVar) {
        synchronized (this) {
            g gVar = bVar.a;
            int a2 = bz.a(gVar.d.c);
            int i = a2;
            if (a2 == 0) {
                i = 1;
            }
            if (i != 1011) {
                if (i != 1013) {
                    i();
                    return;
                }
                cd createBuilder = ce.a.createBuilder();
                createBuilder.s(bVar.a.b.d);
                ce build = createBuilder.build();
                a aVar = new a();
                aVar.b(build);
                aVar.a = 3;
                this.f638a = Optional.of(aVar.a());
                this.b.d(build);
                return;
            }
            v vVar = gVar.b.k;
            v vVar2 = vVar;
            if (vVar == null) {
                vVar2 = v.a;
            }
            bx bxVar = vVar2.f;
            bx bxVar2 = bxVar;
            if (bxVar == null) {
                bxVar2 = bx.a;
            }
            ce ceVar = bxVar2.f;
            ce ceVar2 = ceVar;
            if (ceVar == null) {
                ceVar2 = ce.a;
            }
            a aVar2 = new a();
            aVar2.b(ceVar2);
            aVar2.a = 2;
            this.f638a = Optional.of(aVar2.a());
            this.b.d(ceVar2);
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void d(com.google.android.apps.gsa.nga.engine.m.b bVar) {
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.d
    public final /* synthetic */ void f() {
    }

    public final void g() {
        synchronized (this) {
            i();
        }
    }

    public final void h(com.google.android.apps.gsa.nga.engine.q.b bVar) {
        synchronized (this) {
            this.f638a = Optional.of(bVar);
            this.b.d(bVar.a);
        }
    }
}
