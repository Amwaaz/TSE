package com.google.android.apps.gsa.search.core.service.e;

import com.google.android.apps.gsa.shared.util.c.n;
import com.google.common.b.fd;
import com.google.common.b.ha;
import com.google.common.base.as;
import com.google.common.util.concurrent.cn;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/g.class */
public abstract class g extends com.google.common.util.concurrent.d implements com.google.android.apps.gsa.shared.util.debug.a.a, cn {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1192a = new AtomicReference(n.f1552a);
    public final f b;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(String str, String str2, h hVar, a... aVarArr) {
        this.b = new f(str, str2, hVar, fd.b(EnumSet.of(a.IDLE, aVarArr)));
    }

    public final h e() {
        return this.b.f1191a.c;
    }

    public final ha f() {
        return this.b.f1191a.d;
    }

    protected final void fz() {
        n nVar = (n) this.f1192a.getAndSet(n.b);
        if (nVar != n.b && isCancelled() && q()) {
            nVar.b();
        }
    }

    public abstract cn g(Object obj);

    public final String h() {
        return this.b.f1191a.b;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("WorkProxy");
        fVar.b("WorkProxyClass").a(new com.google.android.apps.gsa.shared.util.b.d(h(), false));
        fVar.b("mWorkerId").a(new com.google.android.apps.gsa.shared.util.b.d(i(), false));
        fVar.b("mType").a(new com.google.android.apps.gsa.shared.util.b.d(e(), false));
        fVar.b("mTargetUserScenarios").a(new com.google.android.apps.gsa.shared.util.b.d(f(), false));
    }

    public final String i() {
        return this.b.f1191a.f1189a;
    }

    public final String toString() {
        as asVar = new as("WorkProxy");
        asVar.b("Name", h());
        asVar.b("WorkerId", i());
        if (e() != h.FIRE_AND_FORGET) {
            asVar.b("Type", e());
        }
        if (f().size() > 1) {
            asVar.b("UserScenarios", f());
        }
        asVar.b("id", Integer.toHexString(System.identityHashCode(this)));
        return asVar.toString();
    }
}
