package com.google.android.apps.gsa.smartspace;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.u.b.e;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/smartspace/i.class */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f1585a;
    private final a b;
    private final a c;

    public i(a aVar, a aVar2, a aVar3) {
        aVar.getClass();
        this.f1585a = aVar;
        aVar2.getClass();
        this.b = aVar2;
        aVar3.getClass();
        this.c = aVar3;
    }

    public final h a(g gVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1585a.a();
        sharedPreferences.getClass();
        Context context = (Context) this.b.a();
        context.getClass();
        e eVar = (e) this.c.a();
        eVar.getClass();
        return new h(sharedPreferences, context, eVar, gVar);
    }
}
