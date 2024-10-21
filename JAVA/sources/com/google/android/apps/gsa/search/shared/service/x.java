package com.google.android.apps.gsa.search.shared.service;

import android.content.Context;
import com.google.common.base.at;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/x.class */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final a f1359a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private final a f;
    private final a g;

    public x(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        aVar.getClass();
        this.f1359a = aVar;
        aVar2.getClass();
        this.b = aVar2;
        aVar3.getClass();
        this.c = aVar3;
        this.d = aVar4;
        aVar5.getClass();
        this.e = aVar5;
        this.f = aVar6;
        aVar7.getClass();
        this.g = aVar7;
    }

    public final t a(ad adVar, com.google.android.apps.gsa.shared.util.ae aeVar, ClientConfig clientConfig) {
        Context context = (Context) this.f1359a.a();
        context.getClass();
        clientConfig.getClass();
        com.google.android.libraries.gsa.h.h hVar = (com.google.android.libraries.gsa.h.h) this.b.a();
        hVar.getClass();
        com.google.android.apps.gsa.shared.o.a.a aVar = (com.google.android.apps.gsa.shared.o.a.a) this.c.a();
        aVar.getClass();
        e.a aVar2 = (e.a) this.d.a();
        aVar2.getClass();
        at atVar = (at) this.e.a();
        atVar.getClass();
        e.a aVar3 = (e.a) this.f.a();
        Boolean bool = (Boolean) this.g.a();
        bool.getClass();
        return new t(context, adVar, aeVar, clientConfig, hVar, aVar, aVar2, atVar, aVar3, bool.booleanValue());
    }
}
