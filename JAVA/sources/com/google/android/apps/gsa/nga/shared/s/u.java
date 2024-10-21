package com.google.android.apps.gsa.nga.shared.s;

import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/u.class */
final class u extends a {
    final z f;
    final f g;
    final f h;
    final f i;
    final f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Class cls, ha haVar, z zVar, f fVar, f fVar2, f fVar3, f fVar4) {
        super(cls, haVar);
        this.f = zVar;
        this.g = fVar;
        this.h = fVar2;
        this.i = fVar3;
        this.j = fVar4;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.a
    public final Object b() {
        f fVar = this.j;
        f fVar2 = this.i;
        f fVar3 = this.h;
        return this.f.a(this.g.c(), fVar3.c(), fVar2.c(), fVar.c());
    }
}
