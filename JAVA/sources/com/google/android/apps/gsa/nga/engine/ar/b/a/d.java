package com.google.android.apps.gsa.nga.engine.ar.b.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ae.ad;
import com.google.android.apps.gsa.nga.engine.ar.j;
import com.google.android.apps.gsa.nga.shared.aj.a.c;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/b/a/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ha f474a = ha.s(l.ALARM_RINGING, l.TIMER_RINGING);
    public final Context b;
    public final j c;
    public final a d;
    public final com.google.android.apps.gsa.nga.engine.recognition.a.b.a.e e;
    public final c f;
    public final ag g;
    public final ad h;

    public d(com.google.android.apps.gsa.nga.engine.recognition.a.b.a.e eVar, Context context, j jVar, c cVar, ag agVar, ad adVar, a aVar) {
        this.e = eVar;
        this.b = context;
        this.c = jVar;
        this.f = cVar;
        this.g = agVar;
        this.h = adVar;
        this.d = aVar;
    }

    public final boolean a() {
        return androidx.core.content.a.c(this.b, "android.permission.RECORD_AUDIO") == 0;
    }
}
