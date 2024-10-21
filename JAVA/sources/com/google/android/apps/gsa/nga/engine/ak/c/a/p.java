package com.google.android.apps.gsa.nga.engine.ak.c.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.android.l;
import com.google.android.apps.gsa.nga.shared.n.e;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.apps.gsa.shared.util.c.d;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/c/a/p.class */
public final class p extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final ha f422a = ha.s("com.google.android.deskclock.action.ALARM_ALERT", "com.android.deskclock.ALARM_ALERT");
    public static final ha b = ha.s("com.google.android.deskclock.action.ALARM_DONE", "com.android.deskclock.ALARM_DONE");
    public static final ha c = ha.s("com.google.android.deskclock.action.TIMER_ALERT", "com.android.deskclock.TIMER_ALERT");
    public static final ha d = ha.s("com.google.android.deskclock.action.TIMER_DONE", "com.android.deskclock.TIMER_DONE");
    public final BroadcastReceiver e;
    public final Context f;
    public final e g;
    public final e h;
    private final h i;
    private final y j;

    public p(Context context, aw awVar, h hVar, k kVar, k kVar2, y yVar, com.google.android.apps.gsa.nga.engine.t.a.n nVar, a aVar) {
        super(nVar);
        this.f = context;
        h a2 = awVar.a(o.class);
        final int i = 1;
        this.g = kVar.a(a2, new d(i) { // from class: com.google.android.apps.gsa.nga.engine.ak.c.a.m

            /* renamed from: a, reason: collision with root package name */
            private final int f420a;

            {
                this.f420a = i;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f420a != 0) {
                    ((x) obj).f423a.set(((Boolean) obj2).booleanValue());
                } else {
                    ((x) obj).f423a.set(((Boolean) obj2).booleanValue());
                }
            }
        });
        final int i2 = 0;
        this.h = kVar2.a(a2, new d(i2) { // from class: com.google.android.apps.gsa.nga.engine.ak.c.a.m

            /* renamed from: a, reason: collision with root package name */
            private final int f420a;

            {
                this.f420a = i2;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f420a != 0) {
                    ((x) obj).f423a.set(((Boolean) obj2).booleanValue());
                } else {
                    ((x) obj).f423a.set(((Boolean) obj2).booleanValue());
                }
            }
        });
        this.i = hVar;
        this.j = yVar;
        this.e = new com.google.android.apps.gsa.nga.shared.android.m(new l(this) { // from class: com.google.android.apps.gsa.nga.engine.ak.c.a.n

            /* renamed from: a, reason: collision with root package name */
            public final p f421a;

            {
                this.f421a = this;
            }

            @Override // com.google.android.apps.gsa.nga.shared.android.l
            public final void a(Intent intent) {
                String action = intent.getAction();
                boolean contains = p.f422a.contains(action);
                p pVar = this.f421a;
                if (contains) {
                    pVar.g.a(true);
                } else if (p.b.contains(action)) {
                    pVar.g.a(false);
                }
                if (p.c.contains(action)) {
                    pVar.h.a(true);
                } else if (p.d.contains(action)) {
                    pVar.h.a(false);
                }
            }
        }, aVar, eu.bO);
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.j.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.i.a("[NGA] initialize", new l(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.i.a("[NGA]", new l(this, 1));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "DeskClockStateObservable";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 44;
    }
}
