package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/an.class */
final class an extends androidx.room.e.a {
    public an() {
        super(18, 19);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
