package com.google.android.apps.gsa.nga.engine.aa;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.aa.f;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.nga.shared.u.k;
import com.google.android.apps.gsa.shared.util.c.ag;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/aa/c.class */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f383a = d.j();
    public final g b;
    public final y c;
    private final h d;

    public c(g gVar, y yVar, h hVar) {
        this.b = gVar;
        this.c = yVar;
        this.d = hVar;
    }

    public final cn a(Duration duration, com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        return this.d.f(ag.e(this.d.k(this.d.b("[NGA] sendOneOffRequest", new a(this, cVar)), "[NGA] InteractorOnboardingChipProvider.getOnboardingChipFromInteractor", new b(1)), Duration.ofMillis(duration.toMillis()), this.d), "[NGA] InteractorOnboardingChipProvider.Exception", Exception.class, new b(2));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.f
    public final cn b(m mVar, as asVar, ah ahVar) {
        int i = true != mVar.equals(m.C) ? 1 : 2;
        ba createBuilder = aa.a.createBuilder();
        ba createBuilder2 = k.a.createBuilder();
        createBuilder2.copyOnWrite();
        k kVar = createBuilder2.instance;
        kVar.c = i - 1;
        kVar.b |= 1;
        k build = createBuilder2.build();
        createBuilder.copyOnWrite();
        aa aaVar = createBuilder.instance;
        build.getClass();
        aaVar.c = build;
        aaVar.b = 19;
        return this.d.k(this.b.c(createBuilder.build(), Optional.empty()), "[NGA] InteractorOnboardingChipProvider.onSuggestionClicked", new b(0));
    }
}
