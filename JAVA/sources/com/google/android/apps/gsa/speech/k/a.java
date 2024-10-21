package com.google.android.apps.gsa.speech.k;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.k.b.c.e;
import com.google.android.apps.gsa.speech.o.g;
import com.google.android.libraries.search.account.k;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/a.class */
public final class a {
    private static final j g = j.i("com.google.android.apps.gsa.speech.k.a");

    /* renamed from: a, reason: collision with root package name */
    public final c f1596a;
    public final com.google.android.apps.gsa.speech.hotword.a b;
    public final e.a c;
    public final e.a d;
    public final g e;
    public final k f;
    private final e h;
    private final com.google.android.apps.gsa.shared.util.b i;
    private final b j;

    public a(g gVar, c cVar, e eVar, com.google.android.apps.gsa.speech.hotword.a aVar, com.google.android.apps.gsa.shared.util.b bVar, e.a aVar2, e.a aVar3, k kVar, b bVar2) {
        this.e = gVar;
        this.f1596a = cVar;
        this.h = eVar;
        this.b = aVar;
        this.i = bVar;
        this.c = aVar2;
        this.d = aVar3;
        this.f = kVar;
        this.j = bVar2;
    }

    private final com.google.android.apps.gsa.shared.speech.hotword.b.a n() {
        g gVar = this.e;
        return (com.google.android.apps.gsa.shared.speech.hotword.b.a) gVar.j().get(gVar.o());
    }

    public final String a() {
        com.google.android.apps.gsa.shared.speech.hotword.b.a n = n();
        if (n != null) {
            return n.d;
        }
        return null;
    }

    public final String b() {
        g gVar = this.j.b;
        com.google.android.apps.gsa.shared.speech.hotword.b.a aVar = (com.google.android.apps.gsa.shared.speech.hotword.b.a) gVar.j().get(gVar.o());
        String str = aVar != null ? aVar.e : null;
        String str2 = str;
        if (str == null) {
            h d = b.f1597a.d();
            d.ak(10028);
            d.p("Prompt is null");
            str2 = "Ok Google";
        }
        return str2;
    }

    public final void c() {
        ((SharedPreferences) this.d.a()).edit().putInt("hands_free_hotword_retraining_notification_state", 2).apply();
    }

    public final void d(boolean z, com.google.android.libraries.search.ai.c.c cVar) {
        this.e.M(z, cVar);
    }

    public final void e(boolean z, com.google.android.libraries.search.ai.c.c cVar) {
        this.e.O(z, cVar);
    }

    public final boolean f() {
        boolean z = false;
        if (this.b == com.google.android.apps.gsa.speech.hotword.a.AVAILABLE) {
            z = false;
            if (h()) {
                z = true;
            }
        }
        h d = g.d();
        d.ak(10021);
        d.s("hasHotwordEverywhere-%b", Boolean.valueOf(z));
        return z;
    }

    public final boolean g() {
        g gVar = this.e;
        String o = gVar.o();
        gVar.f();
        return !this.h.h(o).a();
    }

    public final boolean h() {
        return n() != null;
    }

    public final boolean i() {
        return this.e.X() || this.e.am();
    }

    public final boolean j() {
        return this.e.aa() && this.e.X() && !((SharedPreferences) this.d.a()).getBoolean("always_on_hotword_suppressed", false);
    }

    public final boolean k() {
        return this.e.aa() && this.e.am();
    }

    public final boolean l(Query query) {
        boolean bx = query.bx();
        if ((query.bS() && !bx) || this.i.c()) {
            return false;
        }
        boolean z = query.cS() && query.cI();
        boolean z2 = query.cS() && query.cE();
        if (bx || z2 != z) {
            return z2 || z || bx;
        }
        return false;
    }

    public final void m() {
        synchronized (this) {
        }
    }
}
