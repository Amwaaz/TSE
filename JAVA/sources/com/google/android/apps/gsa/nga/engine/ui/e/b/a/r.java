package com.google.android.apps.gsa.nga.engine.ui.e.b.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.ak.v.a;
import com.google.android.apps.gsa.nga.shared.android.l;
import com.google.android.apps.gsa.nga.shared.android.m;
import com.google.android.apps.gsa.nga.shared.o.b;
import com.google.android.apps.gsa.nga.shared.o.c;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.nga.shared.s.f;
import com.google.android.apps.gsa.nga.shared.s.k;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.apps.gsa.shared.ab.g;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.ab;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/b/a/r.class */
public final class r implements com.google.android.apps.gsa.nga.engine.ui.e.i, b, c, a, com.google.android.apps.gsa.nga.shared.o.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f695a;
    public final com.google.android.apps.gsa.nga.engine.ui.d.e.h g;
    private final Context h;
    private final BroadcastReceiver i;
    private final e.a k;
    private final com.google.android.apps.gsa.nga.engine.ak.v.a.e m;
    public final com.google.android.apps.gsa.nga.shared.s.e b = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.apps.gsa.nga.shared.s.e c = new com.google.android.apps.gsa.nga.shared.s.i(false, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.apps.gsa.nga.shared.s.e d = new com.google.android.apps.gsa.nga.shared.s.i(ev.UNKNOWN, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.apps.gsa.nga.shared.s.e e = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    public final com.google.android.apps.gsa.nga.shared.s.e f = new com.google.android.apps.gsa.nga.shared.s.i(com.google.android.apps.gsa.nga.engine.ui.e.b.a.f691a, com.google.android.apps.gsa.nga.engine.ui.e.c.e.class);
    private boolean l = false;
    private final k j = new k();

    public r(Context context, e.a aVar, h hVar, com.google.android.apps.gsa.nga.engine.ak.v.a.e eVar, com.google.android.apps.gsa.nga.engine.ui.d.e.h hVar2, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        this.h = context;
        this.k = aVar;
        this.f695a = hVar;
        this.m = eVar;
        this.g = hVar2;
        this.i = new m(new l(this) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.b.a.p

            /* renamed from: a, reason: collision with root package name */
            public final r f694a;

            {
                this.f694a = this;
            }

            @Override // com.google.android.apps.gsa.nga.shared.android.l
            public final void a(Intent intent) {
                String stringExtra = intent.getStringExtra("reason");
                if (stringExtra == null || !stringExtra.equals("voiceinteraction")) {
                    r rVar = this.f694a;
                    rVar.f695a.n("[NGA] onCloseSystemDialogs", new o(rVar));
                }
            }
        }, aVar2, eu.bR);
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final void a(ev evVar) {
        ab abVar = com.google.common.f.a.e.a;
        ad.b(this.f695a, this.d, evVar, "onOpaLifecycleChanged");
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final void b(boolean z) {
        this.f695a.n("[NGA] onOpaVisibilityChanged", new n(this, z));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final /* synthetic */ void c() {
    }

    public final void d(boolean z) {
        ab abVar = com.google.common.f.a.e.a;
        ad.b(this.f695a, this.b, Boolean.valueOf(z), "opaInTypingModeChanged");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ak.v.a
    public final void e() {
        ab abVar = com.google.common.f.a.e.a;
        hl(com.google.android.apps.gsa.shared.ab.i.f1365a);
        hk(g.f1364a);
        d(false);
        f(false);
        b(false);
    }

    public final void f(boolean z) {
        ab abVar = com.google.common.f.a.e.a;
        ad.b(this.f695a, this.c, Boolean.valueOf(z), "opaInVoiceSearchModeChanged");
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void h() {
        if (this.l) {
            this.l = false;
            this.h.unregisterReceiver(this.i);
        }
        this.f.b(com.google.android.apps.gsa.nga.engine.ui.e.b.a.f691a);
        hl(com.google.android.apps.gsa.shared.ab.i.f1365a);
        hk(g.f1364a);
        d(false);
        f(false);
        this.j.a();
        this.m.b(this);
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.a
    public final void hj(boolean z) {
        ab abVar = com.google.common.f.a.e.a;
        ad.b(this.f695a, this.e, Optional.of(Boolean.valueOf(z)), "onOpaActivityForegroundStateChanged");
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.c
    public final void hk(g gVar) {
        this.f695a.n("[NGA] opaResponseVisualStateChange", new q(this, gVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.c
    public final void hl(com.google.android.apps.gsa.shared.ab.i iVar) {
        this.f695a.n("[NGA] opaVisualStateChanged", new q(this, iVar, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void hm() {
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final void i() {
        if (!this.l) {
            this.l = true;
            androidx.core.content.a.f(this.h, this.i, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), null, 2);
        }
        this.j.c((f) this.k.a(), new g(this, 4));
        this.j.c(this.f, new g(this, 5));
        this.j.c(this.f, new g(this, 6));
        this.m.a(this);
    }

    @Override // com.google.android.apps.gsa.nga.engine.ui.e.i
    public final /* synthetic */ void k() {
    }
}
