package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ai.class */
final class ai extends androidx.room.bc {
    public ai(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
