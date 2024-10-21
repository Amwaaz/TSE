package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ae.class */
final class ae extends androidx.room.bc {
    public ae(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
