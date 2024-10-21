package com.google.android.apps.gsa.assistant.settings.features.a;

import android.accounts.Account;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.l.g.f;
import com.google.android.apps.gsa.search.core.google.gaia.an;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.apps.gsa.staticplugins.nga.k.e;
import com.google.android.apps.gsa.staticplugins.nga.k.n;
import com.google.android.libraries.geller.h.bp;
import com.google.android.libraries.geller.h.bq;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import com.google.protos.ap.a.a.s;
import com.google.protos.o.b.l;
import com.google.protos.o.b.v;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/settings/features/a/c.class */
public final class c implements bq {

    /* renamed from: a, reason: collision with root package name */
    public static final d f244a = d.c("A11ySettingsStatus");
    public final Optional b;
    public AtomicBoolean c;
    public AtomicBoolean d;
    private final h e;
    private final f f;
    private final an g;

    public c(f fVar, h hVar, an anVar, Optional optional) {
        this.f = fVar;
        this.e = hVar;
        this.g = anVar;
        this.b = optional;
    }

    public final void a() {
        if (this.g.r() == null) {
            return;
        }
        f fVar = this.f;
        String r = this.g.r();
        r.getClass();
        new ae(fVar.a(r, v.T, "accessibility_settings", s.a, l.a), this.e, "[Nga] fetchA11ySettings").a(new be(this) { // from class: com.google.android.apps.gsa.assistant.settings.features.a.a

            /* renamed from: a, reason: collision with root package name */
            public final c f243a;

            {
                this.f243a = this;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                Optional findFirst = Collection._EL.stream((fl) obj).findFirst();
                if (findFirst.isEmpty() || ((l) findFirst.get()).b != 13) {
                    return;
                }
                c cVar = this.f243a;
                if (cVar.c == null) {
                    cVar.c = new AtomicBoolean(false);
                }
                if (cVar.d == null) {
                    cVar.d = new AtomicBoolean(false);
                }
                AtomicBoolean atomicBoolean = cVar.c;
                l lVar = (l) findFirst.get();
                atomicBoolean.set((lVar.b == 13 ? (com.google.g.e.k.a.a) lVar.c : com.google.g.e.k.a.a.a).b);
                AtomicBoolean atomicBoolean2 = cVar.d;
                l lVar2 = (l) findFirst.get();
                atomicBoolean2.set((lVar2.b == 13 ? (com.google.g.e.k.a.a) lVar2.c : com.google.g.e.k.a.a.a).c);
                cVar.b.isPresent();
                ba createBuilder = com.google.android.apps.gsa.assistant.settings.features.a.b.a.a.createBuilder();
                boolean z = cVar.c.get();
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.assistant.settings.features.a.b.a aVar = createBuilder.instance;
                aVar.b |= 1;
                aVar.c = z;
                boolean z2 = cVar.d.get();
                createBuilder.copyOnWrite();
                com.google.android.apps.gsa.assistant.settings.features.a.b.a aVar2 = createBuilder.instance;
                aVar2.b |= 2;
                aVar2.d = z2;
                ((n) cVar.b.get()).f1687a.d(new e(new ProtoLiteParcelable(createBuilder.build()), 7));
            }
        }).a(new be() { // from class: com.google.android.apps.gsa.assistant.settings.features.a.b
            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                aus.g(c.f244a.e(), obj, "Failed fetching accessibility settings.", (char) 488);
            }
        });
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void e(v vVar, Account account, bp bpVar) {
        if (vVar == v.T && account != null) {
            a();
        }
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final /* synthetic */ void h() {
    }

    @Override // com.google.android.libraries.geller.h.bq
    public final void i(v vVar) {
    }
}
