package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/o.class */
final class o extends androidx.room.bc {
    public o(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
