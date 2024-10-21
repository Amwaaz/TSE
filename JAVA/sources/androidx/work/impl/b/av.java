package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/av.class */
final class av extends androidx.room.bc {
    public av(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
