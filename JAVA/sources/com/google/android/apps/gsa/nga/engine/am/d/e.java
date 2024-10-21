package com.google.android.apps.gsa.nga.engine.am.d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.nga.engine.ar.b.d;
import com.google.android.apps.gsa.nga.engine.ui.e.e.a.a.am;
import com.google.android.apps.gsa.nga.engine.v.a.j;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.shared.logger.b.h;
import com.google.android.apps.gsa.shared.util.q.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/d/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f459a;
    public final PackageManager b;
    public final a c;
    public final h d;
    public final d e;
    public final j f;
    public final x g;
    public final com.google.android.apps.gsa.nga.engine.ui.d.e.e h;
    public final am i;

    public e(Context context, am amVar, a aVar, h hVar, d dVar, j jVar, x xVar, com.google.android.apps.gsa.nga.engine.ui.d.e.e eVar) {
        this.f459a = context;
        this.b = context.getPackageManager();
        this.i = amVar;
        this.c = aVar;
        this.d = hVar;
        this.e = dVar;
        this.f = jVar;
        this.g = xVar;
        this.h = eVar;
    }
}
