package com.google.android.apps.gsa.staticplugins.nga.t;

import com.google.android.apps.gsa.assistant.settings.shared.t;
import com.google.android.apps.gsa.nga.shared.q.a;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.base.cl;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/t/c.class */
public final class c implements com.google.android.apps.gsa.staticplugins.nga.l.c {

    /* renamed from: a, reason: collision with root package name */
    private final t f1696a;
    private final a b;
    private final e.a c;
    private final e.a d;
    private final an e;

    public c(an anVar, t tVar, a aVar, e.a aVar2, e.a aVar3) {
        this.e = anVar;
        this.f1696a = tVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    public final fl a() {
        String r = this.e.r();
        if (!cl.L(r)) {
            fl a2 = this.f1696a.a(r);
            fl flVar = a2;
            if (((com.google.android.apps.gsa.shared.k.c) this.c.a()).w(eu.L)) {
                flVar = a2;
                if (!((com.google.android.apps.gsa.assistant.settings.features.v.c) this.d.a()).a().isEmpty()) {
                    Locale forLanguageTag = Locale.forLanguageTag(((com.google.android.apps.gsa.assistant.settings.features.v.c) this.d.a()).a());
                    flVar = a2;
                    if (!a2.contains(forLanguageTag)) {
                        fg fgVar = new fg(4);
                        fgVar.i(a2);
                        fgVar.h(forLanguageTag);
                        flVar = fgVar.g();
                    }
                }
            }
            if (!flVar.isEmpty()) {
                return flVar;
            }
        }
        return fl.p(Locale.getDefault());
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.c
    public final void b() {
        this.b.a(new b(this));
    }

    @Override // com.google.android.apps.gsa.staticplugins.nga.l.c
    public final /* synthetic */ void c() {
    }

    public final Locale d() {
        String r = this.e.r();
        return !cl.L(r) ? this.f1696a.c(r) : Locale.getDefault();
    }
}
