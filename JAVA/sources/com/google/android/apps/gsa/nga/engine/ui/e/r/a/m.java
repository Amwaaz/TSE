package com.google.android.apps.gsa.nga.engine.ui.e.r.a;

import android.content.Context;
import com.google.android.libraries.search.account.y;
import e.c.d;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/r/a/m.class */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f796a;
    private final a b;
    private final a c;
    private final int d;

    public m(a aVar, a aVar2, a aVar3, int i) {
        this.d = i;
        this.f796a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public m(a aVar, a aVar2, a aVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = aVar;
        this.f796a = aVar2;
        this.c = aVar3;
    }

    public final /* synthetic */ Object a() {
        if (this.d != 0) {
            this.b.b();
            return new d(this.f796a.b(), (p) this.c.a());
        }
        return new l((com.google.android.libraries.gsa.h.h) this.f796a.a, (Context) this.b.a, (y) this.c.a);
    }
}
