package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/n.class */
final class n extends androidx.room.bc {
    public n(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
