package com.google.android.apps.gsa.nga.shared.i.a;

import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.common.b.fl;
import com.google.common.b.fq;
import com.google.common.b.fu;
import com.google.common.util.concurrent.cn;
import j$.time.Instant;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/i/a/i.class */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final fu f886a;

    static {
        fq fqVar = new fq(4);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.PIXEL_LAUNCHER_QSB, com.google.android.apps.gsa.nga.shared.u.d.a.c.f);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.HOTWORD, com.google.android.apps.gsa.nga.shared.u.d.a.c.b);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_HOTWORD, com.google.android.apps.gsa.nga.shared.u.d.a.c.b);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.ELMYRA, com.google.android.apps.gsa.nga.shared.u.d.a.c.c);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_ELMYRA, com.google.android.apps.gsa.nga.shared.u.d.a.c.c);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.DIAG_SWIPE_GESTURE, com.google.android.apps.gsa.nga.shared.u.d.a.c.d);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_DIAG_SWIPE_GESTURE, com.google.android.apps.gsa.nga.shared.u.d.a.c.d);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.LONG_PRESS_HOME, com.google.android.apps.gsa.nga.shared.u.d.a.c.e);
        fqVar.i(com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_HOME, com.google.android.apps.gsa.nga.shared.u.d.a.c.e);
        f886a = fqVar.h(false);
    }

    fl a(l lVar, boolean z);

    fl b();

    cn c();

    cn d(Instant instant, l lVar, boolean z);

    cn e(Instant instant, com.google.android.apps.gsa.assistant.shared.k.c cVar);

    cn f(Instant instant, com.google.android.apps.gsa.assistant.shared.k.c cVar);

    cn g(Instant instant, l lVar, boolean z);

    Instant h();

    fl i(l lVar);
}
