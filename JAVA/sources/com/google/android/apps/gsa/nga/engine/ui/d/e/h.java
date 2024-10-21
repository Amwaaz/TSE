package com.google.android.apps.gsa.nga.engine.ui.d.e;

import com.google.android.apps.gsa.nga.engine.ui.d.a.a;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.ah;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/d/e/h.class */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.s.e f686a = new i(ah.RESPONSE_PLATE_STATE_UNKNOWN, a.class);
    private final com.google.android.libraries.gsa.h.h b;

    public h(com.google.android.libraries.gsa.h.h hVar) {
        this.b = hVar;
    }

    public final void a(int i) {
        int i2 = i - 1;
        ad.b(this.b, this.f686a, i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ah.RESPONSE_PLATE_STATE_COMPLETED : ah.RESPONSE_PLATE_STATE_UI_UPDATED : ah.RESPONSE_PLATE_STATE_RECEIVED : ah.RESPONSE_PLATE_STATE_WAITING : ah.RESPONSE_PLATE_STATE_UNKNOWN, "responsePlateState");
    }
}
