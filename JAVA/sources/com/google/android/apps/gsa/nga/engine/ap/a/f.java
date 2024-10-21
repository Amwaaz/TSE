package com.google.android.apps.gsa.nga.engine.ap.a;

import com.google.android.apps.gsa.nga.engine.ap.a;
import com.google.android.apps.gsa.nga.shared.q.d.da;
import com.google.android.apps.gsa.nga.shared.q.d.db;
import com.google.common.b.fq;
import com.google.common.b.ha;
import com.google.common.base.at;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ap/a/f.class */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    static final ha f470a = ha.t(db.NGA_EXPLICIT_TRIGGER_SQUEEZE, db.NGA_EXPLICIT_TRIGGER_MIC_TAP, db.NGA_EXPLICIT_TRIGGER_HOTWORD);
    private final d b;

    public f(d dVar) {
        this.b = dVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ap.a
    public final Map a(da daVar) {
        fq fqVar = new fq(4);
        db a2 = db.a(daVar.c);
        db dbVar = a2;
        if (a2 == null) {
            dbVar = db.NGA_EXPLICIT_TRIGGER_SQUEEZE;
        }
        for (e eVar : e.values()) {
            if (eVar.g.a.equals(dbVar)) {
                at a3 = this.b.a(eVar.f, daVar);
                if (a3.h()) {
                    fqVar.i(eVar.e, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(daVar.f - ((da) a3.c()).f)));
                }
            }
        }
        return fqVar.h(false);
    }
}
