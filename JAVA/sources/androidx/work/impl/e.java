package androidx.work.impl;

import androidx.u.a.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/e.class */
public final class e extends androidx.room.e.a {
    public static final e c = new e();

    private e() {
        super(12, 13);
    }

    @Override // androidx.room.e.a
    public final void a(b bVar) {
        bVar.j("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        bVar.j("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
