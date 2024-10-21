package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ap.class */
final class ap extends androidx.room.bc {
    public ap(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "DELETE FROM workspec WHERE id=?";
    }
}
