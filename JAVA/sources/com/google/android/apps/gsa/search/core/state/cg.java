package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.libraries.gsa.h.h;
import e.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/cg.class */
public class cg extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f1262a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.cg");
    public final a b;
    public final a c;
    public final com.google.android.apps.gsa.search.core.h.p d;
    public long e;
    public int f;
    public boolean g;
    public final com.google.android.apps.gsa.search.core.ae.aa.a.a h;
    private final a i;
    private final a j;
    private final a k;
    private final a l;
    private final com.google.android.apps.gsa.search.core.ac.t m;
    private final com.google.android.apps.gsa.search.core.h.s n;
    private final h o;
    private final com.google.android.apps.gsa.search.core.ae.bu.a p;
    private int q;
    private Query r;
    private boolean s;

    public cg(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, com.google.android.apps.gsa.search.core.ae.aa.a.a aVar8, com.google.android.apps.gsa.search.core.h.p pVar, com.google.android.apps.gsa.search.core.ac.t tVar, com.google.android.apps.gsa.search.core.h.s sVar, h hVar, com.google.android.apps.gsa.search.core.ae.bu.a aVar9) {
        super(aVar, 62);
        this.i = aVar2;
        this.b = aVar3;
        this.j = aVar4;
        this.k = aVar5;
        this.l = aVar6;
        this.c = aVar7;
        this.h = aVar8;
        this.d = pVar;
        this.m = tVar;
        this.n = sVar;
        this.o = hVar;
        this.p = aVar9;
    }

    private final int m(Query query, f fVar) {
        if (!query.di()) {
            return !query.cO() ? 0 : 6;
        }
        boolean z = false;
        if (fVar.f() == null) {
            z = false;
            if (this.n.f1127a.d().getBoolean("hotword_from_lock_screen", false)) {
                z = false;
                if (this.m.d()) {
                    boolean isDeviceLocked = this.m.b.isDeviceLocked();
                    com.google.common.f.ab abVar = com.google.common.f.a.e.a;
                    z = false;
                    if (isDeviceLocked) {
                        z = true;
                    }
                }
            }
        }
        this.s = z;
        return 6;
    }

    private final Map n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mActivityToSwitchToForResults", Integer.valueOf(this.q));
        linkedHashMap.put("mUiToLaunchForVoiceSearch", Integer.valueOf(this.f));
        return linkedHashMap;
    }

    public final boolean c(w... wVarArr) {
        for (w wVar : wVarArr) {
            if (wVar.f1313a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (true != r0.Q(512)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.apps.gsa.search.core.state.f r6, com.google.android.apps.gsa.search.core.state.ab r7, com.google.android.apps.gsa.search.core.state.bk r8) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.cg.f(com.google.android.apps.gsa.search.core.state.f, com.google.android.apps.gsa.search.core.state.ab, com.google.android.apps.gsa.search.core.state.bk):boolean");
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hF(String str) {
        if (str.equals("hotword_from_lock_screen") && f((f) this.i.a(), (ab) this.l.a(), (bk) this.c.a())) {
            an();
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hH() {
        if (((l) this.k.a()).f1305a != ((com.google.android.apps.gsa.search.core.state.d.q) this.j.a()).e.f1345a) {
            return;
        }
        int i = this.f;
        if (i != 0) {
            this.f = 0;
        } else {
            i = 0;
        }
        if (i != 0) {
            this.p.b(i, ((bk) this.c.a()).m, ((l) this.k.a()).f1305a);
            return;
        }
        if (l() && this.g) {
            this.g = false;
            Query query = this.r;
            com.google.android.apps.gsa.search.core.ae.bu.a aVar = this.p;
            ClientConfig clientConfig = ((j) this.b.a()).f1303a;
            int i2 = this.q;
            Query query2 = ((bk) this.c.a()).m;
            long j = ((l) this.k.a()).f1305a;
            boolean z = false;
            if (this.q == 6) {
                z = false;
                if (this.s) {
                    z = true;
                }
            }
            new com.google.android.apps.gsa.shared.util.c.ae(aVar.a(clientConfig, i2, query2, j, z), this.o, "Switch to results activity.").a(new b(this, query, 9)).a(new c(this, 7));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final String[] hI() {
        return new String[]{"hotword_from_lock_screen"};
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("UiLaunchState");
        for (Map.Entry entry : n().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                fVar.b((String) entry.getKey()).a(new d((Boolean) value, false));
            } else if (value instanceof Number) {
                fVar.b((String) entry.getKey()).a(new d((Number) value, false));
            } else {
                fVar.b((String) entry.getKey()).a(com.google.android.apps.gsa.shared.util.b.e.c(String.valueOf(value)));
            }
        }
    }

    public final boolean i() {
        return ((j) this.b.a()).f1303a.A();
    }

    public final boolean k(Query query) {
        ClientConfig clientConfig = ((j) this.b.a()).f1303a;
        if (!clientConfig.B()) {
            return false;
        }
        if (com.google.android.libraries.search.t.h.j.as.a().equals(query.aR()) && ((f) this.i.a()).H(query)) {
            return !clientConfig.q();
        }
        if (query.cx() && query.by()) {
            return true;
        }
        return !com.google.android.apps.gsa.shared.util.p.a.a(((j) this.b.a()).f1303a) && query.di();
    }

    public final boolean l() {
        if (this.r != ((bk) this.c.a()).m && f((f) this.i.a(), (ab) this.l.a(), (bk) this.c.a())) {
            an();
        }
        return this.q != 0;
    }

    public final String toString() {
        return "UiLaunchState(state=" + n().toString() + ")";
    }
}
