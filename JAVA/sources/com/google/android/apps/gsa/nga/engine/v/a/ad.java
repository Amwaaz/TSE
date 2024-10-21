package com.google.android.apps.gsa.nga.engine.v.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.q.a.k;
import com.google.android.apps.gsa.nga.shared.q.h;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.search.account.y;
import com.google.common.util.concurrent.cn;
import com.google.common.v.f;
import com.google.g.z.w.q;
import kotlinx.coroutines.ag;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/v/a/ad.class */
public final class ad implements h {

    /* renamed from: a, reason: collision with root package name */
    public final y f805a;
    private final f b;
    private final Context c;
    private final a d;
    private final ag e;
    private final k f;

    public ad(f fVar, Context context, a aVar, ag agVar, y yVar) {
        fVar.getClass();
        context.getClass();
        aVar.getClass();
        agVar.getClass();
        yVar.getClass();
        this.b = fVar;
        this.c = context;
        this.d = aVar;
        this.e = agVar;
        this.f805a = yVar;
        this.f = new k(fVar, context, aVar, agVar);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final q a() {
        return this.f.g;
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final cn b() {
        return this.f.a(new ac(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final cn c() {
        return this.f.b(new ac(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.h
    public final void d() {
        this.f.f(new ac(this, 2));
    }
}
