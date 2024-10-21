package com.google.android.apps.gsa.nga.engine.b.d;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.q.a.aj;
import com.google.android.apps.gsa.nga.shared.q.a.y;
import com.google.common.o.ls;
import com.google.common.util.concurrent.SettableFuture;
import e.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/b/d/i.class */
public final class i implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public NgaState f506a;
    public ls b;
    public final a c;
    public final SettableFuture d = new SettableFuture();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final aj f;

    public i(a aVar, y yVar, aj ajVar) {
        this.c = aVar;
        this.f = ajVar;
        yVar.c(this);
    }

    public final boolean a() {
        NgaState ngaState = this.f506a;
        return ngaState != null && ngaState.a();
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        ls lsVar = this.b;
        return lsVar != null ? lsVar : ls.a;
    }
}
