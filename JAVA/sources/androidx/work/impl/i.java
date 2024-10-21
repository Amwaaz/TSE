package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/i.class */
public final class i extends androidx.room.e.a {
    public static final i c = new i();

    private i() {
        super(3, 4);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
