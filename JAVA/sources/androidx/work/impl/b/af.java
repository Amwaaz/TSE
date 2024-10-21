package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/af.class */
final class af extends androidx.room.bc {
    public af(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
