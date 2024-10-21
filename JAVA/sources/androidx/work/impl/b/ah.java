package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ah.class */
final class ah extends androidx.room.bc {
    public ah(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
