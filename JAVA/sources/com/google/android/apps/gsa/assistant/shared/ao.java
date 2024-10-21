package com.google.android.apps.gsa.assistant.shared;

import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fd;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;
import java.util.EnumSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/ao.class */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public static final ha f259a = fd.b(EnumSet.of(com.google.android.apps.gsa.assistant.shared.k.c.LONG_PRESS_HOME, com.google.android.apps.gsa.assistant.shared.k.c.LONG_PRESS_POWER_BUTTON, com.google.android.apps.gsa.assistant.shared.k.c.DIAG_SWIPE_GESTURE, com.google.android.apps.gsa.assistant.shared.k.c.HARDWARE_BUTTON, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_DIAG_SWIPE_GESTURE, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_HOME, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_LONG_PRESS_POWER_BUTTON, com.google.android.apps.gsa.assistant.shared.k.c.LOCKSCREEN_HARDWARE_BUTTON));
    public final n b;
    public final a c;
    private final com.google.android.libraries.gsa.h.h d;
    private final com.google.android.libraries.g.a e;
    private final e.a f;
    private final e.a g;

    public ao(n nVar, com.google.android.libraries.gsa.h.h hVar, a aVar, com.google.android.libraries.g.a aVar2, e.a aVar3, e.a aVar4) {
        this.b = nVar;
        this.d = hVar;
        this.c = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar4;
    }

    public final cn a(h hVar) {
        return com.google.android.apps.gsa.nga.shared.ah.a.z.b(this.d, "shouldEnableSpeedBump", hVar.a(28), hVar.b(), new an(this, hVar));
    }

    public final cn b(com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        return a(new ai(cVar, this.c, this.e, this.f, this.g));
    }
}
