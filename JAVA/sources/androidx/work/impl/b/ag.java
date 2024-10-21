package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ag.class */
final class ag extends androidx.room.bc {
    public ag(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
