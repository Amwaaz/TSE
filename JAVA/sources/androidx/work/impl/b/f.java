package androidx.work.impl.b;

import androidx.u.a.j;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/f.class */
final class f extends androidx.room.h {
    public f(androidx.room.ao aoVar) {
        super(aoVar);
    }

    @Override // androidx.room.h
    protected final /* bridge */ /* synthetic */ void a(j jVar, Object obj) {
        d dVar = (d) obj;
        jVar.e(1, dVar.f193a);
        jVar.c(2, dVar.b.longValue());
    }

    @Override // androidx.room.bc
    protected final String e() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
