package com.google.android.apps.gsa.speech.f;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.h.c;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.df;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.speech.o.g;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/f/a.class */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    boolean f1591a;
    boolean b;
    boolean c;
    boolean d;
    private final Context e;
    private final e.a f;

    public a(Context context, e.a aVar) {
        this.e = context;
        this.f = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        ab abVar = e.a;
        boolean w = pVar.w(df.f1437a);
        boolean w2 = pVar.w(df.b);
        if (!this.f1591a || this.b != w || this.c != w2) {
            this.f1591a = true;
            this.b = w;
            this.c = w2;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED");
            intent.putExtra("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED", this.f1591a);
            this.e.sendBroadcast(intent);
        }
        if (!pVar.w(en.r) || this.d) {
            return;
        }
        g gVar = (g) this.f.a();
        if (gVar.ag()) {
            return;
        }
        this.d = true;
        if (!gVar.am()) {
            gVar.E();
        } else if (gVar.X()) {
            gVar.E();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void iW(p pVar) {
        a(pVar, i.f1123a);
    }
}
