package com.google.android.apps.gsa.staticplugins.au.b;

import com.google.android.apps.gsa.speech.k.b.b.c;
import com.google.android.apps.gsa.speech.k.b.b.d;
import com.google.android.apps.gsa.tasks.ar;
import com.google.android.apps.gsa.tasks.m;
import com.google.android.apps.gsa.tasks.u;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bg;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/au/b/s.class */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1625a = j.i("com.google.android.apps.gsa.staticplugins.au.b.s");
    private final a b;

    public s(a aVar) {
        this.b = aVar;
    }

    public final void a(int i) {
        ba createBuilder = com.google.android.apps.gsa.tasks.s.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.tasks.s sVar = createBuilder.instance;
        sVar.b |= 8;
        sVar.f = true;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.tasks.s sVar2 = createBuilder.instance;
        sVar2.e = 1;
        sVar2.b |= 4;
        bc createBuilder2 = u.a.createBuilder();
        bg bgVar = d.a;
        ba createBuilder3 = c.a.createBuilder();
        createBuilder3.copyOnWrite();
        c cVar = createBuilder3.instance;
        cVar.d = i - 1;
        cVar.b |= 2;
        createBuilder2.w(bgVar, createBuilder3.build());
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.tasks.s sVar3 = createBuilder.instance;
        u build = createBuilder2.build();
        build.getClass();
        sVar3.h = build;
        sVar3.b |= 32;
        com.google.android.apps.gsa.tasks.s build2 = createBuilder.build();
        h d = f1625a.d();
        d.aj(com.google.common.f.a.e.a, "ModelDownloadTrigger");
        h hVar = d;
        hVar.ak(14936);
        hVar.p("Schedule model download");
        ((m) this.b.a()).f(ar.UPDATE_HOTWORD_MODELS, build2);
    }
}
