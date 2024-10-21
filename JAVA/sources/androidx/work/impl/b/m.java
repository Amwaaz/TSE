package androidx.work.impl.b;

import androidx.u.a.j;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/m.class */
final class m extends androidx.room.h {
    public m(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.h
    protected final /* bridge */ /* synthetic */ void a(j jVar, Object obj) {
        jVar.e(1, ((k) obj).f195a);
        jVar.c(2, r0.b);
        jVar.c(3, r0.c);
    }

    @Override // androidx.room.bc
    protected final String e() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
