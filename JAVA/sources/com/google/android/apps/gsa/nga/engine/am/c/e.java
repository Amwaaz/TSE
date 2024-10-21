package com.google.android.apps.gsa.nga.engine.am.c;

import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.aa.f;
import com.google.android.apps.gsa.nga.shared.aa.g;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c/e.class */
public class e implements g, f {
    private static final j c = j.i("com.google.android.apps.gsa.nga.engine.am.c.e");

    /* renamed from: a, reason: collision with root package name */
    public final a f455a;
    public final com.google.android.apps.gsa.nga.engine.n.e.a b;
    private final h d;

    public e(a aVar, h hVar, com.google.android.apps.gsa.nga.engine.n.e.a aVar2) {
        this.f455a = aVar;
        this.d = hVar;
        this.b = aVar2;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final cn a(Locale locale) {
        if (!this.f455a.i(br.S)) {
            int i = fl.e;
            return dl.n(ni.a);
        }
        com.google.android.apps.gsa.nga.shared.aa.e eVar = new com.google.android.apps.gsa.nga.shared.aa.e(m.A, com.google.android.apps.gsa.assistant.shared.s.m.g.i, "", "", "");
        eVar.d(144095);
        return dl.n(fl.p(eVar.b().a()));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.f
    public final cn b(m mVar, as asVar, ah ahVar) {
        com.google.common.f.h d = c.d();
        d.aj(com.google.common.f.a.e.a, "OlcSuggestionProvider");
        com.google.common.f.h hVar = d;
        hVar.ak(4249);
        hVar.p("Opening One Learning Center");
        return this.d.b("[NGA] LearningCenterSuggestionProvider.onSuggestionClicked", new j(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final String c() {
        return "LearningCenterSuggestionProvider";
    }
}
