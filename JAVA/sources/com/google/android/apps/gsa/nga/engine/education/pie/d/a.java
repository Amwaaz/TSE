package com.google.android.apps.gsa.nga.engine.education.pie.d;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.shared.k.d;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fl;
import com.google.common.b.op;
import com.google.common.util.concurrent.cn;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/d/a.class */
public final class a extends c {
    private static final d c = eu.fM;

    /* renamed from: a, reason: collision with root package name */
    protected final com.google.android.apps.gsa.shared.util.q.a f590a;
    protected final y b;
    private final fl d;

    public a(n nVar, y yVar, com.google.android.apps.gsa.shared.util.q.a aVar, fl flVar) {
        super(nVar, new op(Integer.valueOf(c.f1434a)));
        this.b = yVar;
        this.f590a = aVar;
        this.d = flVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.b.c().f619a && this.f590a.i(c);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        ArrayList arrayList = new ArrayList();
        fl flVar = this.d;
        int size = flVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((b) flVar.get(i)).a());
        }
        return com.google.android.apps.gsa.v.c.a(arrayList);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        fl flVar = this.d;
        int size = flVar.size();
        for (int i = 0; i < size; i++) {
            ((b) flVar.get(i)).hd();
        }
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "PieLifecycleHandler";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 15;
    }
}
