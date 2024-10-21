package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.nga.engine.b.f.a.n;
import com.google.android.apps.gsa.nga.engine.b.f.a.v;
import com.google.android.apps.gsa.nga.engine.b.g.b.as;
import com.google.common.b.ha;
import com.google.common.b.op;
import com.google.common.b.qj;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/b.class */
public final class b extends a {
    private final f f;

    public b(Class cls, f fVar) {
        super(cls, new op(fVar));
        this.f = fVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.a
    public final Object b() {
        f l;
        Optional optional = (Optional) ((i) this.f).b.get();
        if (optional.isEmpty()) {
            l = new i(com.google.android.apps.gsa.nga.engine.b.f.b.a, com.google.android.apps.gsa.nga.engine.b.e.a.class);
        } else {
            as asVar = ((v) optional.get()).f;
            asVar.getClass();
            l = ad.l(asVar.h.a, new n(optional));
        }
        f fVar = this.f;
        Object obj = this.f1000a;
        ha s = ha.s(fVar, l);
        synchronized (obj) {
            if (!this.c.equals(s)) {
                qj j = this.c.j();
                while (j.hasNext()) {
                    ((f) j.next()).e(this.e);
                }
                qj j2 = s.j();
                while (j2.hasNext()) {
                    ((f) j2.next()).d(this.e);
                }
                this.c = s;
            }
        }
        return l.c();
    }
}
