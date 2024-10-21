package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/m.class */
public final class m extends androidx.room.e.a {
    public static final m c = new m();

    private m() {
        super(8, 9);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
