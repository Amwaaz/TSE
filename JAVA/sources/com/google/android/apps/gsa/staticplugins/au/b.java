package com.google.android.apps.gsa.staticplugins.au;

import com.google.android.apps.gsa.search.core.state.d.t;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.o.hb;
import com.google.common.o.or;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/au/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1622a = j.i("com.google.android.apps.gsa.staticplugins.au.b");
    public final a b;
    private final a c;
    private final t d;

    public b(t tVar, a aVar, a aVar2) {
        this.d = tVar;
        this.c = aVar;
        this.b = aVar2;
    }

    public final void a(or orVar, String str, int i, Query query, HotwordResult hotwordResult, int i2, boolean z, boolean z2, boolean z3) {
        bc createBuilder = hb.a.createBuilder();
        createBuilder.copyOnWrite();
        hb hbVar = createBuilder.instance;
        hbVar.b |= 2;
        hbVar.n = i;
        createBuilder.copyOnWrite();
        hb hbVar2 = createBuilder.instance;
        hbVar2.D = i2;
        hbVar2.c |= 4096;
        or c = k.c(orVar, query.bw(), query.bS(), this.d.f());
        createBuilder.copyOnWrite();
        hb hbVar3 = createBuilder.instance;
        hbVar3.A = c.as;
        hbVar3.c |= 8;
        String b = com.google.android.libraries.search.t.k.a.b(query.E);
        createBuilder.copyOnWrite();
        hb hbVar4 = createBuilder.instance;
        b.getClass();
        hbVar4.b |= 4;
        hbVar4.o = b;
        boolean bw = query.bw();
        createBuilder.copyOnWrite();
        hb hbVar5 = createBuilder.instance;
        hbVar5.c |= 131072;
        hbVar5.F = bw;
        if (hotwordResult == null) {
            h f = f1622a.f();
            f.aj(com.google.common.f.a.e.a, "MDHotwordTriggerLogger");
            h hVar = f;
            hVar.ak(14765);
            hVar.p("hotwordResult is null!");
            int i3 = com.google.android.apps.gsa.shared.util.b.h.a;
            return;
        }
        float d = hotwordResult.d();
        createBuilder.copyOnWrite();
        hb hbVar6 = createBuilder.instance;
        hbVar6.c |= 67108864;
        hbVar6.K = d;
        float c2 = hotwordResult.c();
        createBuilder.copyOnWrite();
        hb hbVar7 = createBuilder.instance;
        hbVar7.c |= 33554432;
        hbVar7.J = c2;
        boolean C = hotwordResult.C();
        createBuilder.copyOnWrite();
        hb hbVar8 = createBuilder.instance;
        hbVar8.c |= 134217728;
        hbVar8.L = C;
        createBuilder.copyOnWrite();
        hb hbVar9 = createBuilder.instance;
        hbVar9.c |= 536870912;
        hbVar9.M = z;
        createBuilder.copyOnWrite();
        hb hbVar10 = createBuilder.instance;
        hbVar10.c |= 1073741824;
        hbVar10.N = z2;
        createBuilder.copyOnWrite();
        hb hbVar11 = createBuilder.instance;
        hbVar11.c |= Integer.MIN_VALUE;
        hbVar11.O = z3;
        if (str != null) {
            createBuilder.copyOnWrite();
            hb hbVar12 = createBuilder.instance;
            hbVar12.d |= 4;
            hbVar12.R = str;
        }
        String x = hotwordResult.x();
        if (x != null) {
            createBuilder.copyOnWrite();
            hb hbVar13 = createBuilder.instance;
            hbVar13.c |= 16777216;
            hbVar13.I = x;
        }
        int c3 = ((com.google.android.apps.gsa.x.a.e) this.c.a()).c();
        createBuilder.copyOnWrite();
        hb hbVar14 = createBuilder.instance;
        hbVar14.d |= 64;
        hbVar14.T = c3;
        k.g(createBuilder.build(), null, null, null);
    }
}
