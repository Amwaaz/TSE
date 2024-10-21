package com.google.android.apps.gsa.nga.shared.s;

import com.google.common.b.ha;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/t.class */
public final class t extends a {
    final y f;
    final f g;
    final f h;
    final f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Class cls, ha haVar, y yVar, f fVar, f fVar2, f fVar3) {
        super(cls, haVar);
        this.f = yVar;
        this.g = fVar;
        this.h = fVar2;
        this.i = fVar3;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.a
    public final Object b() {
        f fVar = this.i;
        f fVar2 = this.h;
        return this.f.a(this.g.c(), fVar2.c(), fVar.c());
    }
}
