package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.search.shared.service.b.b;
import com.google.android.apps.gsa.shared.k.cx;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.gsa.h.i;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import e.a;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/ao.class */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1154a = j.i("com.google.android.apps.gsa.search.core.service.ao");
    public static final Long b = 10000L;
    public final b c;
    public final a d;
    public final a e;
    public int f = 0;
    public boolean g = false;
    public final a h;
    public final com.google.android.apps.gsa.shared.util.keepalive.d i;
    private final a j;

    public ao(com.google.android.apps.gsa.shared.util.keepalive.d dVar, b bVar, a aVar, a aVar2, a aVar3, a aVar4) {
        this.i = dVar;
        this.c = bVar;
        this.d = aVar;
        this.e = aVar2;
        this.h = aVar3;
        this.j = aVar4;
    }

    public final void a() {
        boolean z;
        i.c(com.google.android.apps.gsa.search.core.service.a.a.class);
        if (((ai) this.d.a()).r(2)) {
            ab abVar = e.a;
            this.f++;
            z = true;
        } else {
            z = false;
            if (this.g) {
                ai aiVar = (ai) this.d.a();
                z = false;
                if (aiVar.e) {
                    z = false;
                    if (aiVar.q() == 2) {
                        aiVar.e = false;
                        z = true;
                    }
                }
                ab abVar2 = e.a;
            }
        }
        ab abVar3 = e.a;
        if (z) {
            this.c.a(true);
            this.g = !this.i.e();
            if (((p) this.j.a()).w(cx.f1432a)) {
                f abVar4 = new ab(this, 3);
                h hVar = (h) this.e.a();
                b.longValue();
                hVar.p("KeepAliveService stop", Duration.ofMillis(10000L), abVar4);
            }
        }
    }
}
