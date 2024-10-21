package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/ap.class */
final class ap extends androidx.room.e.a {
    public ap() {
        super(20, 21);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
