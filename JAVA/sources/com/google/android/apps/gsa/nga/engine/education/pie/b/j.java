package com.google.android.apps.gsa.nga.engine.education.pie.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.accessibility.AccessibilityManager;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.education.pie.d.b;
import com.google.android.apps.gsa.nga.engine.g.a;
import com.google.android.apps.gsa.nga.shared.i.a.e;
import com.google.android.apps.gsa.nga.shared.s.ad;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.b.ha;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.cn;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/j.class */
public final class j extends BroadcastReceiver implements b, com.google.android.apps.gsa.nga.engine.b.b, com.google.android.apps.gsa.nga.engine.ao.i, a, e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f583a = d.j();
    public final com.google.android.libraries.gsa.h.h b;
    public final com.google.android.apps.gsa.shared.util.q.a c;
    public final com.google.android.apps.gsa.nga.engine.b.d.i g;
    public final com.google.android.apps.gsa.nga.engine.g.a.y h;
    private final Context i;
    private AccessibilityManager k;
    private final Object j = new Object();
    private boolean l = false;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public final com.google.android.apps.gsa.nga.shared.s.e d = new com.google.android.apps.gsa.nga.shared.s.i(com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBILITY_UNKNOWN, com.google.android.libraries.gsa.h.b.c.class);
    private final bj n = new bj();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final com.google.android.apps.gsa.nga.shared.s.k f = new com.google.android.apps.gsa.nga.shared.s.k();

    public j(Context context, com.google.android.libraries.gsa.h.h hVar, com.google.android.apps.gsa.nga.engine.b.d.i iVar, com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.apps.gsa.nga.engine.g.a.y yVar, AccessibilityManager accessibilityManager) {
        this.i = context;
        this.b = hVar;
        this.g = iVar;
        this.c = aVar;
        this.h = yVar;
        this.k = accessibilityManager;
    }

    private final void h(AccessibilityManager accessibilityManager) {
        if (accessibilityManager != null && this.l && this.m.compareAndSet(false, true)) {
            accessibilityManager.addAccessibilityStateChangeListener(new g(this));
        }
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final void O() {
        this.e.set(true);
        e();
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.i.registerReceiver(this, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.l = true;
        h(c());
        return this.b.a("[NGA] PieEligibilityCheckerImpl.subscribe", new u(this, 1));
    }

    public final AccessibilityManager c() {
        AccessibilityManager accessibilityManager;
        synchronized (this.j) {
            if (this.k == null) {
                AccessibilityManager accessibilityManager2 = (AccessibilityManager) this.i.getSystemService("accessibility");
                this.k = accessibilityManager2;
                h(accessibilityManager2);
            }
            accessibilityManager = this.k;
        }
        return accessibilityManager;
    }

    @Override // com.google.android.apps.gsa.nga.shared.i.a.e
    public final /* synthetic */ com.google.android.apps.gsa.nga.shared.u.d.a.w d() {
        return (com.google.android.apps.gsa.nga.shared.u.d.a.w) ((com.google.android.apps.gsa.nga.shared.s.i) this.d).b.get();
    }

    public final void e() {
        final int i = 1;
        new ae(this.n.b(new com.google.common.util.concurrent.q(this) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.b.h

            /* renamed from: a, reason: collision with root package name */
            public final j f581a;

            {
                this.f581a = this;
            }

            public final cn a() {
                j jVar = this.f581a;
                return jVar.b.h("[NGA] PieEligibilityCheckerImpl.update", new al(jVar, 1));
            }
        }, ay.a), this.b, "[NGA] PieEligibilityCheckerImpl.checkFuture").b(new ad(1)).a(new be(i) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.b.i

            /* renamed from: a, reason: collision with root package name */
            private final int f582a;

            {
                this.f582a = i;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                if (this.f582a != 0) {
                    aus.g(j.f583a.e(), obj, "Failed to update Pie eligibility", (char) 3004);
                } else {
                    ((com.google.android.apps.gsa.nga.shared.u.d.a.w) obj).name();
                }
            }
        });
    }

    public final boolean f() {
        return this.c.i(eu.fM);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return ((com.google.android.apps.gsa.nga.shared.s.i) this.d).b.get() == com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_ELIGIBLE;
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        e();
    }

    @Override // com.google.android.apps.gsa.nga.engine.b.b
    public final void hb(com.google.android.apps.gsa.nga.engine.b.a aVar) {
        e();
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.f.a();
        this.l = false;
        AccessibilityManager c = c();
        if (c != null && this.m.compareAndSet(true, false)) {
            c.removeAccessibilityStateChangeListener(new g(this));
        }
        this.i.unregisterReceiver(this);
        ad.b(this.b, this.d, com.google.android.apps.gsa.nga.shared.u.d.a.w.PIE_INELIGIBLE_UNINITIALIZED, "invalidate");
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "PieEligibilityChecker";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 14;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.apps.gsa.d.e.i(99);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            e();
        }
    }
}
