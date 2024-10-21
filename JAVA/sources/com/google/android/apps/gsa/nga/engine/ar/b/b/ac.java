package com.google.android.apps.gsa.nga.engine.ar.b.b;

import com.google.android.apps.gsa.nga.engine.ar.ag;
import com.google.android.apps.gsa.nga.engine.ar.b.f;
import com.google.android.apps.gsa.nga.engine.ar.b.w;
import com.google.android.libraries.gsa.h.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/b/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public final Object f476a;
    public final Object b;
    public final Object c;

    public ac(f fVar, w wVar, h hVar) {
        this.c = fVar;
        this.f476a = wVar;
        this.b = hVar;
    }

    public ac(Object obj, Object obj2, Object obj3) {
        this.f476a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.libraries.gsa.h.h] */
    public final void a(ag agVar) {
        this.b.a("[NGA] NonVoiceInteraction execution", new v(this, agVar));
    }
}
