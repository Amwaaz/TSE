package com.google.android.apps.gsa.assistant.settings.devices.d.b;

import android.accounts.Account;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.l.g.m;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.k.cl;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.libraries.g.a;
import com.google.android.libraries.geller.h.bp;
import com.google.android.libraries.geller.h.bq;
import com.google.android.libraries.gsa.h.h;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.base.ah;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.e.i.ap;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protos.ap.a.a.s;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.bg;
import com.google.protos.o.b.v;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/devices/d/b/l.class */
public final class l implements bq {

    /* renamed from: a, reason: collision with root package name */
    public static final d f242a = d.j();
    private static final v g = v.cF;
    private static final String h = bg.b.name();
    public final com.google.android.apps.gsa.shared.k.c b;
    public final h c;
    public final Map d;
    public final Optional e;
    public boolean f = false;
    private final h i;
    private final a j;
    private final e.a k;
    private final com.google.android.apps.gsa.l.g.f l;
    private final m m;
    private cn n;

    public l(final an anVar, final com.google.android.apps.gsa.shared.k.c cVar, aw awVar, e.a aVar, com.google.android.apps.gsa.l.g.f fVar, m mVar, h hVar, Optional optional) {
        this.n = ci.a;
        this.b = cVar;
        h a2 = awVar.a(k.class);
        this.c = a2;
        this.j = new com.google.android.libraries.g.a.e();
        this.d = new ConcurrentHashMap();
        this.k = aVar;
        this.l = fVar;
        this.m = mVar;
        this.i = hVar;
        this.e = optional;
        this.n = a2.b("initPersonalResponseAllowed", new com.google.android.libraries.gsa.h.c(this, anVar, cVar) { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.g

            /* renamed from: a, reason: collision with root package name */
            public final l f241a;
            public final com.google.android.apps.gsa.shared.k.c b;
            public final an c;

            {
                this.f241a = this;
                this.c = anVar;
                this.b = cVar;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                ArrayList arrayList = new ArrayList();
                for (Account account : this.c.A()) {
                    com.google.android.apps.gsa.shared.k.c cVar2 = this.b;
                    l lVar = this.f241a;
                    String str = account.name;
                    arrayList.add(lVar.c.k(lVar.b(str), "initPersonalResponseAllowedForAccount", new com.google.android.libraries.gsa.h.d(lVar, str, cVar2, account) { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.e

                        /* renamed from: a, reason: collision with root package name */
                        public final l f240a;
                        public final String b;
                        public final com.google.android.apps.gsa.shared.k.c c;
                        public final Account d;

                        {
                            this.f240a = lVar;
                            this.b = str;
                            this.c = cVar2;
                            this.d = account;
                        }

                        @Override // com.google.android.libraries.gsa.h.d
                        public final Object a(Object obj) {
                            Optional optional2 = (Optional) obj;
                            if (!optional2.isPresent()) {
                                return null;
                            }
                            com.google.android.apps.gsa.shared.k.c cVar3 = this.c;
                            String str2 = this.b;
                            l lVar2 = this.f240a;
                            Boolean bool = (Boolean) lVar2.d.put(str2, (Boolean) optional2.get());
                            if (!cVar3.w(cl.L) || bool != null || !((Boolean) optional2.get()).booleanValue()) {
                                return null;
                            }
                            Account account2 = this.d;
                            com.google.common.f.a.a d = l.f242a.d();
                            d.ak(477);
                            d.p("Force sync PR status back to geller on init.");
                            lVar2.f(account2, ((Boolean) optional2.get()).booleanValue());
                            return null;
                        }
                    }));
                }
                cn g2 = com.google.common.util.concurrent.i.g(dl.t(arrayList), new ah() { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.f
                    public final Object apply(Object obj) {
                        d dVar = l.f242a;
                        return null;
                    }
                }, ay.a);
                com.google.android.apps.gsa.shared.o.a.a aVar2 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                return g2;
            }
        });
    }

    public final cn a(final Account account) {
        return dl.g(new cn[]{this.n}).a(ex.l(new Callable(this, account) { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.b

            /* renamed from: a, reason: collision with root package name */
            public final l f239a;
            public final Account b;

            {
                this.f239a = this;
                this.b = account;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f239a.c(this.b);
            }
        }), ay.a);
    }

    public final cn b(String str) {
        return this.i.k(this.l.a(str, g, h, s.a, com.google.protos.o.b.ay.a), "readPersonalResponseStatusFromGeller", new com.google.android.libraries.gsa.h.d() { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.c
            @Override // com.google.android.libraries.gsa.h.d
            public final Object a(Object obj) {
                return Collection._EL.stream((fl) obj).filter(new h()).findFirst().map(new Function() { // from class: com.google.android.apps.gsa.assistant.settings.devices.d.b.i
                    @Override // java.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function._CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ap apVar;
                        com.google.protos.o.b.ay ayVar = (com.google.protos.o.b.ay) obj2;
                        if (ayVar.c == 2) {
                            ap a2 = ap.a(((Integer) ayVar.d).intValue());
                            apVar = a2;
                            if (a2 == null) {
                                apVar = ap.a;
                            }
                        } else {
                            apVar = ap.a;
                        }
                        return Boolean.valueOf(apVar.equals(ap.c));
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return Function._CC.$default$compose(this, function);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean c(Account account) {
        try {
            dl.w(this.n);
        } catch (CancellationException | ExecutionException e) {
            aus.f(f242a.f(), "Failed to read PersonalResponse data", (char) 476, e);
        }
        Boolean bool = (Boolean) this.d.get(account.name);
        Boolean bool2 = bool;
        if (bool == null) {
            bool2 = true;
        }
        return bool2;
    }

    public final void d(String str, boolean z) {
        Iterator it = ((Set) this.k.a()).iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(str, z);
        }
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void e(v vVar, Account account, bp bpVar) {
        if (vVar == v.cF && account != null) {
            com.google.common.f.a.a d = f242a.d();
            d.ak(481);
            d.p("PR status onSyncCompleted called");
            this.c.k(b(account.name), "updatePersonalResponseAllowed", new d(this, account));
        }
    }

    public final void f(Account account, boolean z) {
        long epochMilli = this.j.f().toEpochMilli();
        com.google.common.f.a.a d = f242a.d();
        d.ak(482);
        Boolean valueOf = Boolean.valueOf(z);
        d.s("PR status to %s", valueOf);
        Boolean bool = (Boolean) this.d.put(account.name, valueOf);
        this.f = true;
        String str = account.name;
        v vVar = g;
        ba createBuilder = com.google.protos.o.b.ay.a.createBuilder();
        bg bgVar = bg.b;
        createBuilder.copyOnWrite();
        com.google.protos.o.b.ay ayVar = createBuilder.instance;
        ayVar.e = bgVar.G;
        ayVar.b |= 1;
        ap apVar = z ? ap.c : ap.d;
        createBuilder.copyOnWrite();
        com.google.protos.o.b.ay ayVar2 = createBuilder.instance;
        ayVar2.d = Integer.valueOf(apVar.e);
        ayVar2.c = 2;
        com.google.protos.o.b.ay build = createBuilder.build();
        bc createBuilder2 = ad.a.createBuilder();
        String str2 = h;
        createBuilder2.copyOnWrite();
        ad adVar = createBuilder2.instance;
        str2.getClass();
        adVar.b |= 4;
        adVar.e = str2;
        ba createBuilder3 = com.google.protos.e.v.b.a.b.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(epochMilli);
        createBuilder3.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar = createBuilder3.instance;
        bVar.b |= 1;
        bVar.c = micros;
        createBuilder3.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar2 = createBuilder3.instance;
        bVar2.b |= 2;
        bVar2.d = 0;
        createBuilder3.copyOnWrite();
        com.google.protos.e.v.b.a.b bVar3 = createBuilder3.instance;
        bVar3.b |= 4;
        bVar3.e = 0;
        createBuilder2.copyOnWrite();
        ad adVar2 = createBuilder2.instance;
        com.google.protos.e.v.b.a.b build2 = createBuilder3.build();
        build2.getClass();
        adVar2.c = build2;
        adVar2.b |= 1;
        ba createBuilder4 = com.google.protobuf.h.a.createBuilder();
        createBuilder4.copyOnWrite();
        createBuilder4.instance.b = "type.googleapis.com/geller.oneplatform.PrivacySettingsState";
        com.google.protobuf.v byteString = build.toByteString();
        createBuilder4.copyOnWrite();
        com.google.protobuf.h hVar = createBuilder4.instance;
        byteString.getClass();
        hVar.c = byteString;
        createBuilder2.copyOnWrite();
        ad adVar3 = createBuilder2.instance;
        com.google.protobuf.h build3 = createBuilder4.build();
        build3.getClass();
        adVar3.f = build3;
        m mVar = this.m;
        h hVar2 = this.c;
        adVar3.b |= 8;
        hVar2.m(mVar.c(str, vVar, (ad) createBuilder2.build(), true), "setPersonalResponseAllowed", new j(this, z, bool, account));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.accounts.Account r4) {
        /*
            r3 = this;
            r0 = r3
            com.google.common.util.concurrent.cn r0 = r0.n
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L48
            com.google.android.apps.gsa.shared.util.debug.b.d.a()
            r0 = r3
            com.google.common.util.concurrent.cn r0 = r0.n     // Catch: java.lang.Throwable -> L1c java.util.concurrent.ExecutionException -> L1f java.lang.InterruptedException -> L23
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1c java.util.concurrent.ExecutionException -> L1f java.lang.InterruptedException -> L23
            goto L48
        L1c:
            r4 = move-exception
            r0 = r4
            throw r0
        L1f:
            r5 = move-exception
            goto L24
        L23:
            r5 = move-exception
        L24:
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.assistant.settings.devices.d.b.l.f242a
            com.google.common.f.y r0 = r0.f()
            com.google.common.f.a.a r0 = (com.google.common.f.a.a) r0
            r1 = r5
            com.google.common.f.y r0 = r0.g(r1)
            com.google.common.f.a.a r0 = (com.google.common.f.a.a) r0
            r5 = r0
            r0 = r5
            r1 = 484(0x1e4, float:6.78E-43)
            r0.ak(r1)
            r0 = r5
            java.lang.String r1 = "Failed to read PersonalResponse data"
            r0.p(r1)
        L48:
            r0 = r3
            java.util.Map r0 = r0.d
            r1 = r4
            java.lang.String r1 = r1.name
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L7b
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.assistant.settings.devices.d.b.l.f242a
            com.google.common.f.y r0 = r0.d()
            com.google.common.f.a.a r0 = (com.google.common.f.a.a) r0
            r4 = r0
            r0 = r4
            r1 = 483(0x1e3, float:6.77E-43)
            r0.ak(r1)
            r0 = r4
            java.lang.String r1 = "PR status returns the default value"
            r0.p(r1)
            r0 = 1
            return r0
        L7b:
            r0 = r4
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.d.b.l.g(android.accounts.Account):boolean");
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final /* synthetic */ void h() {
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void i(v vVar) {
    }
}
