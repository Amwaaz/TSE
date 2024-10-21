package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/al.class */
final class al extends androidx.room.bc {
    public al(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}
