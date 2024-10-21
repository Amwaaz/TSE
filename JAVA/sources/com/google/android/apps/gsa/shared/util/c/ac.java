package com.google.android.apps.gsa.shared.util.c;

import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fg;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final cn f1544a;
    private final h b;
    private final String c;
    private final be d;
    private final fg e = new fg(4);

    public ac(cn cnVar, h hVar, String str, be beVar) {
        this.f1544a = cnVar;
        this.b = hVar;
        this.c = str;
        this.d = beVar;
    }

    public final void a(be beVar) {
        this.b.m(this.f1544a, this.c, new aa(this.d, this.e.g(), beVar));
    }

    public final void b(Class cls, be beVar) {
        this.e.h(new ab(cls, beVar));
    }

    public final void c(Class cls, com.google.android.libraries.gsa.h.f fVar) {
        this.e.h(new ab(cls, new z(fVar)));
    }
}
