package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/as.class */
final class as extends androidx.room.bc {
    public as(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
