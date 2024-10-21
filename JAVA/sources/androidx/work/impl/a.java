package androidx.work.impl;

import androidx.room.bi;
import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a.class */
public final class a extends bi {
    @Override // androidx.room.bi
    public final void a(b bVar) {
        bVar.f();
        try {
            bVar.j("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - ah.f183a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bVar.k();
        } finally {
            bVar.i();
        }
    }
}
