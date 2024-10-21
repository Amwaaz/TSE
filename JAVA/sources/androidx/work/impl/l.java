package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/l.class */
public final class l extends androidx.room.e.a {
    public static final l c = new l();

    private l() {
        super(7, 8);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
