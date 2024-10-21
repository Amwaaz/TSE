package com.google.android.apps.gsa.nga.shared.s;

import androidx.core.d.e$;
import com.google.common.b.ha;
import java.util.function.BiFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/s.class */
public final class s extends a {
    final BiFunction f;
    final f g;
    final f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Class cls, ha haVar, BiFunction biFunction, f fVar, f fVar2) {
        super(cls, haVar);
        this.f = biFunction;
        this.g = fVar;
        this.h = fVar2;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.a
    public final Object b() {
        f fVar = this.h;
        return e$.ExternalSyntheticApiModelOutline0.m(this.f, this.g.c(), fVar.c());
    }
}
