package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/x.class */
final class x extends androidx.room.bc {
    public x(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
