package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.state.a.b;
import com.google.common.base.at;
import com.google.protobuf.bc;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/ai.class */
public class ai {
    private static final com.google.common.f.j e = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.ai");

    /* renamed from: a, reason: collision with root package name */
    public ad f1233a;
    public final a b;
    public final a c;
    public final at d;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final x j;
    private final com.google.android.apps.gsa.search.core.service.d.j k;

    public ai(a aVar, a aVar2, a aVar3, a aVar4, at atVar, a aVar5, com.google.android.apps.gsa.search.core.service.d.j jVar, a aVar6, x xVar) {
        this.g = aVar;
        this.b = aVar2;
        this.h = aVar3;
        this.c = aVar4;
        this.d = atVar;
        this.f = aVar5;
        this.k = jVar;
        this.i = aVar6;
        this.j = xVar;
    }

    private final void f() {
        com.google.common.base.cl.v(((ad) this.g.a()).g(), "Notifications for LegacyEventBus should have been suspended at this point");
    }

    private final void g() {
        ad adVar = this.f1233a;
        if (adVar != null) {
            com.google.common.base.cl.v(adVar.g(), "Notifications for SessionEventBus should have been suspended at this point");
        }
    }

    private final void h(Bundle bundle, String str) {
        if (!str.equals("search")) {
            ((ad) this.g.a()).c(bundle);
            return;
        }
        ad adVar = this.f1233a;
        adVar.getClass();
        adVar.c(bundle);
    }

    private final void i(String str) {
        if (!str.equals("search")) {
            ((ad) this.g.a()).e();
            g();
        } else {
            ad adVar = this.f1233a;
            adVar.getClass();
            adVar.e();
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0115, code lost:
    
        if (r15 == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03cd A[Catch: all -> 0x041f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x041f, blocks: (B:10:0x0057, B:16:0x007c, B:29:0x011b, B:36:0x0152, B:38:0x0163, B:40:0x017f, B:42:0x018c, B:45:0x0199, B:46:0x01b3, B:48:0x01cf, B:49:0x01d8, B:50:0x01db, B:53:0x01e9, B:61:0x029d, B:65:0x02a9, B:67:0x02b4, B:70:0x02c2, B:74:0x02ce, B:76:0x02e3, B:78:0x0335, B:80:0x033b, B:82:0x0364, B:86:0x037a, B:90:0x03a7, B:92:0x03b3, B:94:0x03f5, B:102:0x03cd, B:107:0x03ea, B:111:0x020b, B:125:0x0284, B:128:0x00ad, B:130:0x00bc, B:114:0x0212, B:116:0x021e, B:121:0x0241), top: B:9:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00bc A[Catch: all -> 0x041f, TryCatch #2 {all -> 0x041f, blocks: (B:10:0x0057, B:16:0x007c, B:29:0x011b, B:36:0x0152, B:38:0x0163, B:40:0x017f, B:42:0x018c, B:45:0x0199, B:46:0x01b3, B:48:0x01cf, B:49:0x01d8, B:50:0x01db, B:53:0x01e9, B:61:0x029d, B:65:0x02a9, B:67:0x02b4, B:70:0x02c2, B:74:0x02ce, B:76:0x02e3, B:78:0x0335, B:80:0x033b, B:82:0x0364, B:86:0x037a, B:90:0x03a7, B:92:0x03b3, B:94:0x03f5, B:102:0x03cd, B:107:0x03ea, B:111:0x020b, B:125:0x0284, B:128:0x00ad, B:130:0x00bc, B:114:0x0212, B:116:0x021e, B:121:0x0241), top: B:9:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b3 A[Catch: all -> 0x041f, TRY_LEAVE, TryCatch #2 {all -> 0x041f, blocks: (B:10:0x0057, B:16:0x007c, B:29:0x011b, B:36:0x0152, B:38:0x0163, B:40:0x017f, B:42:0x018c, B:45:0x0199, B:46:0x01b3, B:48:0x01cf, B:49:0x01d8, B:50:0x01db, B:53:0x01e9, B:61:0x029d, B:65:0x02a9, B:67:0x02b4, B:70:0x02c2, B:74:0x02ce, B:76:0x02e3, B:78:0x0335, B:80:0x033b, B:82:0x0364, B:86:0x037a, B:90:0x03a7, B:92:0x03b3, B:94:0x03f5, B:102:0x03cd, B:107:0x03ea, B:111:0x020b, B:125:0x0284, B:128:0x00ad, B:130:0x00bc, B:114:0x0212, B:116:0x021e, B:121:0x0241), top: B:9:0x0057 }] */
    /* JADX WARN: Type inference failed for: r0v65, types: [e.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [e.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(com.google.android.apps.gsa.search.shared.service.d.b r8, long r9, android.os.Bundle r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.ai.j(com.google.android.apps.gsa.search.shared.service.d.b, long, android.os.Bundle, boolean):void");
    }

    public final b a(String str) {
        return ((af) this.h.a()).b(str);
    }

    public final com.google.android.apps.gsa.search.shared.service.d.b.v b(com.google.android.apps.gsa.search.shared.service.d.b bVar) {
        bc createBuilder = com.google.android.apps.gsa.search.shared.service.d.b.v.f1347a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.shared.service.d.b.v vVar = createBuilder.instance;
        vVar.b |= 1;
        vVar.c = bVar.f1345a;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.shared.service.d.b.v vVar2 = createBuilder.instance;
        vVar2.b |= 4;
        vVar2.e = bVar.b;
        int intValue = ((Integer) this.f.a()).intValue();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.shared.service.d.b.v vVar3 = createBuilder.instance;
        vVar3.b |= 2;
        vVar3.d = intValue;
        if (bVar.b.equals("search")) {
            ad adVar = this.f1233a;
            adVar.getClass();
            long j = bVar.f1345a;
            adVar.i(createBuilder);
        } else {
            ad adVar2 = (ad) this.g.a();
            long j2 = bVar.f1345a;
            adVar2.i(createBuilder);
        }
        return createBuilder.build();
    }

    public final void c(String str) {
        String str2 = ((com.google.android.apps.gsa.search.core.state.d.q) this.b.a()).e.b;
        f();
        g();
        com.google.common.base.cl.B(str2.equals(str), "Incorrect state..SessionType global [%s], Session type in SessionManager [%s]", str2, str);
        try {
            this.j.a();
        } finally {
            i(str);
        }
    }

    public final void d(com.google.android.apps.gsa.search.shared.service.d.b bVar, long j, Bundle bundle) {
        j(bVar, j, bundle, false);
        f();
        g();
    }

    public final void e(com.google.android.apps.gsa.search.shared.service.d.b bVar, Bundle bundle) {
        j(bVar, 1L, bundle, true);
    }
}
