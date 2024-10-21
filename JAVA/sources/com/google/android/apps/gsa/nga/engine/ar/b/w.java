package com.google.android.apps.gsa.nga.engine.ar.b;

import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bj;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.android.apps.gsa.nga.shared.q.d.m;
import com.google.common.f.a.a;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/w.class */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.a.d f489a = com.google.common.f.a.d.j();
    private final af b;

    public w(af afVar) {
        this.b = afVar;
    }

    public final void a(com.google.android.apps.gsa.nga.shared.q.d.l lVar, ah ahVar) {
        ba createBuilder = m.a.createBuilder();
        createBuilder.copyOnWrite();
        m mVar = createBuilder.instance;
        mVar.c = lVar.aO;
        mVar.b |= 1;
        b((m) createBuilder.build(), ahVar);
    }

    public final void b(m mVar, ah ahVar) {
        bk bkVar = bk.ATTENTION_HANDLER;
        ba createBuilder = bj.a.createBuilder();
        createBuilder.copyOnWrite();
        bj bjVar = createBuilder.instance;
        mVar.getClass();
        bjVar.c = mVar;
        bjVar.b = 24;
        this.b.b(bkVar, createBuilder.build(), ahVar);
    }

    public final void c(String str, boolean z) {
        if (z) {
            return;
        }
        a f = f489a.f();
        f.ak(4417);
        f.s("%s is not allowed.", str);
    }
}
