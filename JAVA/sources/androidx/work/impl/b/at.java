package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/at.class */
final class at extends androidx.room.bc {
    public at(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET output=? WHERE id=?";
    }
}
