package com.google.android.apps.gsa.speech.audio;

import android.content.Context;
import com.google.android.libraries.gsa.h.h;
import e.c.c;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/audio/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final a f1589a;
    private final a b;
    private final a c;
    private final a d;

    public e(a aVar, a aVar2, a aVar3, a aVar4) {
        aVar.getClass();
        this.f1589a = aVar;
        aVar2.getClass();
        this.b = aVar2;
        aVar3.getClass();
        this.c = aVar3;
        this.d = aVar4;
    }

    public final d a(c cVar) {
        Context context = (Context) this.f1589a.a();
        context.getClass();
        h hVar = (h) this.b.a();
        hVar.getClass();
        com.google.android.libraries.g.a aVar = (com.google.android.libraries.g.a) this.c.a();
        aVar.getClass();
        return new d(context, hVar, aVar, c.b(this.d.a), cVar);
    }
}
