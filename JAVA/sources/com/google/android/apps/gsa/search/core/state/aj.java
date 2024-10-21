package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.h.h;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/aj.class */
public class aj extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1234a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.aj");
    public final a b;
    public final com.google.android.apps.gsa.search.core.h.p c;
    public Query d;
    public PlaybackStatus e;
    private final com.google.android.apps.gsa.search.core.ae.ak.a f;
    private final h g;

    public aj(a aVar, a aVar2, com.google.android.apps.gsa.search.core.h.p pVar, com.google.android.apps.gsa.search.core.ae.ak.a aVar3, h hVar) {
        super(aVar, 76);
        this.d = Query.b;
        this.b = aVar2;
        this.c = pVar;
        this.f = aVar3;
        this.g = hVar;
    }

    public final void a() {
        new com.google.android.apps.gsa.shared.util.c.ae(this.f.a(), this.g, "MediaControlState.storePlaybackStatusSnapshot").a(new c(this, 3)).a(new a(11));
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
    }
}
