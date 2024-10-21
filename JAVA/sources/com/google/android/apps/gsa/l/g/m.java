package com.google.android.apps.gsa.l.g;

import com.google.android.apps.gsa.l.b;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/g/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final b f368a;
    public final h b;
    public final com.google.android.libraries.gsa.h.h c;

    public m(b bVar, h hVar, com.google.android.libraries.gsa.h.h hVar2) {
        this.f368a = bVar;
        this.b = hVar;
        this.c = hVar2;
    }

    public final cn a(String str, v vVar, String str2) {
        cn h = i.h(this.f368a.b(), new j(str, vVar, str2, 3), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return h;
    }

    public final cn b(String str, v vVar, boolean z) {
        cn h = i.h(this.f368a.b(), new l(str, vVar, 0), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return !z ? h : this.c.k(h, "scheduleGellerSync", new k(this, str, vVar, 2));
    }

    public final cn c(String str, v vVar, ad adVar, boolean z) {
        cn h = i.h(this.f368a.b(), new j(str, vVar, adVar, 0), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return !z ? h : this.c.k(h, "scheduleGellerSync", new k(this, str, vVar, 0));
    }
}
