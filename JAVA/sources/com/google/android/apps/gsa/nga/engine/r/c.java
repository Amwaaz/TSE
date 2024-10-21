package com.google.android.apps.gsa.nga.engine.r;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.c.ap;
import com.google.android.apps.gsa.search.shared.service.c.ei;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cf;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/r/c.class */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f641a;
    public final b b;
    private final a c;
    private final AtomicReference d;
    private final ag e;
    private final y f;

    public c(b bVar, a aVar, ag agVar, y yVar, n nVar) {
        super(nVar, yVar, ha.t(Integer.valueOf(eu.dZ.f1434a), Integer.valueOf(eu.dB.f1434a), Integer.valueOf(eu.dC.f1434a)));
        this.f641a = new AtomicReference();
        this.d = new AtomicReference(Optional.empty());
        this.b = bVar;
        this.c = aVar;
        this.e = agVar;
        this.f = yVar;
    }

    private final boolean a() {
        return this.c.i(eu.dZ) && this.c.i(eu.dB) && this.c.i(eu.dC);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final boolean gW() {
        return (this.f.c().d.equals((Locale) this.f641a.get()) && this.f.c().c.equals((Optional) this.d.get())) ? false : true;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        Locale locale = this.f.c().d;
        this.f641a.set(locale);
        this.d.set(this.f.c().c);
        b bVar = this.b;
        synchronized (bVar.b) {
            bVar.c = true;
        }
        g gVar = bVar.d;
        h hVar = gVar.b;
        com.google.android.apps.gsa.search.shared.service.e.e eVar = gVar.c;
        ClientConfig a2 = g.a();
        ba createBuilder = ei.a.createBuilder();
        ap apVar = ap.a;
        createBuilder.copyOnWrite();
        ei eiVar = createBuilder.instance;
        apVar.getClass();
        eiVar.c = apVar;
        eiVar.b = 18;
        return i.g(cf.i(hVar.k(eVar.c(a2, g.b(createBuilder.build()), hf.GET_EMAIL_THREADS, 50000L), "[NGA] NgaSearchServiceClientImpl.getEmailThreads.getEmailThreadsResponse", new com.google.android.apps.gsa.nga.engine.m.f.a.f())), new a(bVar, locale), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        b bVar = this.b;
        synchronized (bVar.b) {
            bVar.c = false;
        }
        bVar.f640a.set(j.f643a);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "GmailSubjectCache";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 25;
    }

    public final String toString() {
        AtomicReference atomicReference = this.f641a;
        y yVar = this.f;
        ag agVar = this.e;
        a aVar = this.c;
        return "GmailSubjectsCacheLifecycleManager{cache=" + String.valueOf(this.b) + ", syncedStartupPrefs=" + String.valueOf(aVar) + ", ngaPreferences=" + String.valueOf(agVar) + ", ngaConfigurationProvider=" + String.valueOf(yVar) + ", cachedFlag=" + a() + ", cachedLocale=" + atomicReference.toString() + ", isEnabled=" + gV() + "}";
    }
}
