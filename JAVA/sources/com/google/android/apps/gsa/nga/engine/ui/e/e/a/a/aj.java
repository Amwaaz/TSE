package com.google.android.apps.gsa.nga.engine.ui.e.e.a.a;

import com.google.android.apps.gsa.nga.shared.s.f;
import com.google.android.libraries.gsa.h.h;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/e/a/a/aj.class */
public final class aj implements e.c.d {

    /* renamed from: a, reason: collision with root package name */
    private final a f708a;
    private final a b;
    private final int c;

    public aj(a aVar, a aVar2, int i) {
        this.c = i;
        this.f708a = aVar;
        this.b = aVar2;
    }

    public aj(a aVar, a aVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = aVar;
        this.f708a = aVar2;
    }

    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            return new ai((com.google.android.apps.gsa.nga.shared.p.b) this.f708a.a, this.b.b(), com.google.android.apps.gsa.nga.engine.ui.e.e.b.b.a());
        }
        if (i != 1) {
            return new am((h) this.f708a.a, (f) this.b.a());
        }
        return new ai((com.google.android.apps.gsa.nga.engine.ui.e.c.b) this.b.a, (ai) this.f708a.a());
    }
}
