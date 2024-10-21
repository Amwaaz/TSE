package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/aj.class */
final class aj extends androidx.room.bc {
    public aj(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
