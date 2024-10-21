package com.google.android.apps.gsa.nga.engine.ui.e.l.a;

import com.google.android.apps.gsa.nga.engine.ae.ao;
import com.google.android.apps.gsa.nga.engine.ae.ap;
import com.google.android.apps.gsa.nga.engine.ae.b;
import com.google.android.apps.gsa.nga.engine.ui.e.i;
import com.google.android.apps.gsa.nga.engine.ui.e.r.a.p;
import com.google.android.apps.gsa.nga.shared.ae.a.a.bs;
import com.google.android.apps.gsa.nga.shared.ae.a.a.bt;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.f;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.apps.gsa.nga.shared.s.z;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.libraries.gsa.h.h;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/l/a/c.class */
public final class c implements i, ao, ap, b {

    /* renamed from: a, reason: collision with root package name */
    public final f f769a;
    private final e b;
    private final e c;
    private final e d;
    private final h e;
    private final com.google.android.apps.gsa.nga.shared.ak.e f;
    private final k g;
    private final com.google.android.apps.gsa.nga.engine.ui.e.h.a.a h;
    private final p i;

    public c(h hVar, com.google.android.apps.gsa.nga.shared.ak.e eVar, f fVar, com.google.android.apps.gsa.nga.engine.ui.e.h.a.a aVar, p pVar) {
        com.google.android.apps.gsa.nga.shared.s.i iVar = new com.google.android.apps.gsa.nga.shared.s.i(true, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.b = iVar;
        com.google.android.apps.gsa.nga.shared.s.i iVar2 = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.c = iVar2;
        com.google.android.apps.gsa.nga.shared.s.i iVar3 = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
        this.d = iVar3;
        this.g = new k();
        this.e = hVar;
        this.f = eVar;
        this.h = aVar;
        this.i = pVar;
        this.f769a = ad.h(iVar, fVar, iVar2, iVar3, new z() { // from class: com.google.android.apps.gsa.nga.engine.ui.e.l.a.a
            @Override // com.google.android.apps.gsa.nga.shared.s.z
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                ev evVar = (ev) obj2;
                Boolean bool = (Boolean) obj3;
                Boolean bool2 = (Boolean) obj4;
                bs a2 = bt.a();
                a2.c(((Boolean) obj).booleanValue());
                boolean z = true;
                if (!evVar.equals(ev.RESUMED)) {
                    z = evVar.equals(ev.PAUSED);
                }
                a2.d(z);
                a2.b(bool.booleanValue());
                a2.e(bool2.booleanValue());
                return a2.a();
            }
        });
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void h() {
        this.g.a();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.ao
    public final void hi(boolean z) {
        ad.b(this.e, this.b, Boolean.valueOf(!z), "isScreenLocked");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void hm() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.ap
    public final void hn(boolean z) {
        ad.b(this.e, this.d, Boolean.valueOf(z), "isScreenOn");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void i() {
        this.h.a();
        this.h.b();
        this.b.b(Boolean.valueOf(this.h.a()));
        this.d.b(Boolean.valueOf(this.h.b()));
        p pVar = this.i;
        pVar.getClass();
        this.g.c(this.f769a, new b(pVar));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ae.b
    public final void j(Optional optional) {
        ad.b(this.e, this.c, Boolean.valueOf(this.f.b().equals(com.google.android.apps.gsa.nga.shared.ak.c.b)), "isHomeScreen");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void k() {
    }
}
