package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.ae.bk.a;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.b.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/by.class */
public final class by extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final a f1256a;
    public final boolean b;
    public final BitFlags c;
    public long d;

    public by(e.a aVar, com.google.android.apps.gsa.speech.hotword.a aVar2, a aVar3) {
        super(aVar, 75);
        this.c = new BitFlags(getClass(), "FLAG_", 0L);
        this.b = aVar2 == com.google.android.apps.gsa.speech.hotword.a.AVAILABLE;
        this.f1256a = aVar3;
    }

    public final boolean a() {
        return this.c.e(5L);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("ServiceSessionState");
        fVar.b("mCanSafelyPerformHeadlessHotword").a(new d(Boolean.valueOf(this.b), false));
        fVar.b("Flags").a(new d(this.c.b(), false));
    }

    public final String toString() {
        return "ServiceSessionState(Flags=" + this.c.b() + ")";
    }
}
