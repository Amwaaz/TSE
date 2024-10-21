package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/j.class */
public final class j extends androidx.room.e.a {
    public static final j c = new j();

    private j() {
        super(4, 5);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        bVar.j("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
