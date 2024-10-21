package com.google.android.apps.gsa.nga.engine.ui.e.b.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ui.e.c.b;
import com.google.android.apps.gsa.nga.engine.ui.e.e.b.c;
import com.google.android.libraries.gsa.h.h;
import e.c.d;
import e.c.k;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/b/a/s.class */
public final class s implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f696a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private final a f;
    private final int g;

    public s(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, int i) {
        this.g = i;
        this.f696a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
    }

    public s(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, int i, byte[] bArr) {
        this.g = i;
        this.e = aVar;
        this.d = aVar2;
        this.f696a = aVar3;
        this.f = aVar4;
        this.c = aVar5;
        this.b = aVar6;
    }

    public final /* synthetic */ Object a() {
        if (this.g != 0) {
            com.google.android.apps.gsa.nga.engine.ui.e.r.a.p pVar = (com.google.android.apps.gsa.nga.engine.ui.e.r.a.p) this.e.a();
            c cVar = this.b;
            Object obj = this.f.a;
            return new m(pVar, (b) this.d.a, this.f696a.a(), (com.google.android.apps.gsa.nga.shared.p.b) obj, this.c.b(), cVar.a());
        }
        return new r((Context) this.f696a.a, e.c.c.b(k.a(this.b)), (h) this.c.a, (com.google.android.apps.gsa.nga.engine.ak.v.a.e) this.d.a, (com.google.android.apps.gsa.nga.engine.ui.d.e.h) this.e.a, (com.google.android.apps.gsa.shared.util.q.a) this.f.a);
    }
}
