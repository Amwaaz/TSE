package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/au.class */
final class au extends androidx.room.bc {
    public au(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}
