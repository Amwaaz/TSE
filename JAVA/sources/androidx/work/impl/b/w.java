package androidx.work.impl.b;

import androidx.u.a.j;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/w.class */
final class w extends androidx.room.h {
    public w(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.h
    protected final /* bridge */ /* synthetic */ void a(j jVar, Object obj) {
        ax axVar = (ax) obj;
        jVar.e(1, axVar.a);
        jVar.a(2, androidx.work.au.c((androidx.work.l) axVar.b));
    }

    @Override // androidx.room.bc
    protected final String e() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
