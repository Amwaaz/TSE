package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/aq.class */
final class aq extends androidx.room.e.a {
    public aq() {
        super(22, 23);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
