package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import com.google.android.apps.gsa.shared.k.bw;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.libraries.gsa.h.h;
import com.google.android.play.core.f.m;
import com.google.android.play.core.f.q;
import com.google.common.b.fl;
import com.google.common.f.a.e;
import com.google.common.f.j;
import e.a;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/fv.class */
public final class fv {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1765a = j.i("com.google.android.apps.gsa.staticplugins.opa.fv");
    public final a b;
    public final a c;
    public final q d;
    private final a e;
    private final h f;

    public fv(Context context, a aVar, a aVar2, a aVar3, h hVar) {
        q a2 = m.a(context).a();
        this.e = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = a2;
        this.f = hVar;
    }

    public final void a(Locale locale) {
        if (!b(locale)) {
            this.f.h("OpaLanguageSplitter", new fs(this, locale));
        }
        com.google.common.f.h d = f1765a.d();
        d.aj(e.a, "OpaLanguageSplitter");
        com.google.common.f.h hVar = d;
        hVar.ak(15977);
        hVar.s("schedule language deferred installation %s", locale);
        q qVar = this.d;
        locale.getClass();
        qVar.b(fl.p(locale));
    }

    public final boolean b(Locale locale) {
        if (!((c) this.e.a()).w(bw.r)) {
            return true;
        }
        boolean z = locale.getLanguage().equals(Locale.getDefault().getLanguage()) ? true : this.d.f() != null && this.d.f().contains(locale.getLanguage());
        com.google.common.f.h d = f1765a.d();
        d.aj(e.a, "OpaLanguageSplitter");
        com.google.common.f.h hVar = d;
        hVar.ak(15982);
        hVar.J("#isLanguageInstalled: %b, installed language's size: %d", z, this.d.f() != null ? this.d.f().size() : 0);
        for (String str : this.d.f()) {
            com.google.common.f.h d2 = f1765a.d();
            d2.aj(e.a, "OpaLanguageSplitter");
            com.google.common.f.h hVar2 = d2;
            hVar2.ak(15983);
            hVar2.s("Installed language: %s", str);
        }
        return z;
    }
}
