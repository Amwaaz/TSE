package com.google.android.apps.gsa.nga.engine.c;

import com.google.android.libraries.appactions.a.n;
import com.google.android.libraries.appactions.a.o;
import e.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f530a;

    public m() {
        this.f530a = new AtomicReference(new n().a());
    }

    public m(a aVar) {
        this.f530a = aVar;
    }

    public final o a() {
        return (o) ((AtomicReference) this.f530a).get();
    }
}
