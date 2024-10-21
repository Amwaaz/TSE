package com.google.android.apps.gsa.assistant.shared;

import com.google.android.apps.gsa.assistant.shared.f.a.k;
import com.google.android.apps.gsa.assistant.shared.f.a.l;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.f.a.e;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/n.class */
public class n extends h {
    public static final com.google.common.f.j e = com.google.common.f.j.i("com.google.android.apps.gsa.assistant.shared.n");

    public n(a aVar, com.google.android.libraries.g.a aVar2, e.a aVar3, e.a aVar4) {
        super(aVar, aVar2, aVar3, aVar4);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.h
    public final cn a(int i) {
        l lVar = (l) this.c.a();
        cn g = i.g(i.g(lVar.b.d(), new com.google.android.apps.gsa.assistant.shared.f.a.j(2), lVar.a), new l(this, i), ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return g;
    }

    @Override // com.google.android.apps.gsa.assistant.shared.h
    public final cn b() {
        l lVar = (l) this.c.a();
        return i.g(lVar.b.d(), new com.google.android.apps.gsa.assistant.shared.f.a.j(true, 3), lVar.a);
    }

    @Override // com.google.android.apps.gsa.assistant.shared.h
    public final void e(boolean z) {
        com.google.common.f.ab abVar = e.a;
        l lVar = (l) this.c.a();
        com.google.android.apps.gsa.v.c.b(lVar.b.b(new k(Boolean.valueOf(z), 1), lVar.a));
    }
}
