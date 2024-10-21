package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ak.class */
final class ak extends androidx.room.bc {
    public ak(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.bc
    public final String e() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
