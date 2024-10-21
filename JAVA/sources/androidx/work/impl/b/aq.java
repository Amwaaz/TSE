package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/aq.class */
final class aq extends androidx.room.bc {
    public aq(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET state=? WHERE id=?";
    }
}
