package com.google.android.apps.gsa.nga.engine.am.c;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.aa.g;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.util.concurrent.cn;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c/x.class */
public final class x implements g {

    /* renamed from: a, reason: collision with root package name */
    public final b f457a;
    public final com.google.android.apps.gsa.nga.shared.ak.e b;
    public final a c;
    public final Context d;
    public final ag e;
    public final ad f;
    public final y g;
    private final h h;

    public x(ag agVar, h hVar, b bVar, com.google.android.apps.gsa.nga.shared.ak.e eVar, ad adVar, a aVar, y yVar, Context context) {
        this.e = agVar;
        this.h = hVar;
        this.f457a = bVar;
        this.b = eVar;
        this.f = adVar;
        this.c = aVar;
        this.g = yVar;
        this.d = context;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final cn a(Locale locale) {
        return this.h.a("[NGA] onSuggestionsForInvocation", new w(this, locale));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final String c() {
        return "ScreenContextSuggestionProvider";
    }
}
