package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.core.content.a;
import com.google.android.apps.gsa.nga.shared.ah.a.z;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.libraries.assistant.d.b.d;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/ap.class */
public final /* synthetic */ class ap implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1651a;
    private final int b;

    public /* synthetic */ ap(Object obj, int i) {
        this.b = i;
        this.f1651a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v72, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                x xVar = (x) this.f1651a;
                if (xVar.j()) {
                    z.g(xVar.g(), new n(1));
                    return;
                }
                return;
            }
            if (i == 2) {
                bg bgVar = (bg) ((bj) this.f1651a).b.a();
                bgVar.e();
                bgVar.h();
                return;
            }
            ?? r0 = this.f1651a;
            bj bjVar = (bj) r0;
            ((SharedPreferences) bjVar.d.a()).registerOnSharedPreferenceChangeListener(r0);
            c cVar = (c) bjVar.c.a();
            synchronized (cVar.c) {
                cVar.d.add(r0);
            }
            a.f(bjVar.f1667a, new bi(bjVar), new IntentFilter("android.intent.action.LOCALE_CHANGED"), null, 2);
            if (bjVar.e) {
                bu buVar = (bu) bjVar.f.a();
                bh bhVar = new bh(bjVar);
                cn b = ((com.google.android.apps.gsa.search.core.google.gaia.b.a.c) buVar.b.a()).b();
                bo boVar = new bo(buVar, 1);
                cn g = i.g(b, ex.b(boVar), ay.a);
                br brVar = new br(bhVar);
                dl.y(g, ex.h(brVar), ay.a);
                return;
            }
            return;
        }
        Object obj = this.f1651a;
        final bg bgVar2 = (bg) obj;
        boolean c = ((com.google.android.apps.gsa.nga.api.aq) bgVar2.d.a()).c();
        if (bgVar2.B == null) {
            bgVar2.B = new be();
        }
        final be beVar = bgVar2.B;
        ((h) bgVar2.c.a()).n("[NGA] NgaStateCheckerImpl.updateLifecycleState", new ax(beVar, c, 0));
        synchronized (bgVar2.f1665a) {
            if (c) {
                if (((bg) obj).z) {
                    return;
                }
                ((bg) obj).z = true;
                h hVar = (h) bgVar2.c.a();
                final androidx.lifecycle.an a2 = ((com.google.android.apps.gsa.assistant.shared.c) bgVar2.g.a()).a();
                final androidx.lifecycle.an c2 = ((com.google.android.apps.gsa.assistant.shared.c) bgVar2.g.a()).c();
                final androidx.lifecycle.an b2 = ((com.google.android.apps.gsa.assistant.shared.c) bgVar2.g.a()).b();
                final androidx.lifecycle.an f = ((com.google.android.apps.gsa.shared.ab.b) bgVar2.h.a()).f();
                final androidx.lifecycle.an a3 = ((com.google.android.apps.gsa.shared.ab.b) bgVar2.h.a()).a();
                final androidx.lifecycle.an b3 = ((com.google.android.apps.gsa.shared.ab.b) bgVar2.h.a()).b();
                final androidx.lifecycle.an c3 = ((com.google.android.apps.gsa.shared.ab.b) bgVar2.h.a()).c();
                final androidx.lifecycle.as asVar = ((com.google.android.apps.gsa.staticplugins.opa.samson.a.b.b) bgVar2.i.a()).f1796a;
                final androidx.lifecycle.as asVar2 = ((com.google.android.apps.gsa.staticplugins.opa.samson.a.b.b) bgVar2.j.a()).f1796a;
                hVar.n("[NGA]NgaStateCheckerImpl.NgaStateCheckerImpl register live-data", new f(bgVar2, a2, beVar, c2, b2, f, a3, b3, c3, asVar, asVar2) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.at

                    /* renamed from: a, reason: collision with root package name */
                    public final bg f1655a;
                    public final androidx.lifecycle.an b;
                    public final be c;
                    public final androidx.lifecycle.an d;
                    public final androidx.lifecycle.an e;
                    public final androidx.lifecycle.an f;
                    public final androidx.lifecycle.an g;
                    public final androidx.lifecycle.an h;
                    public final androidx.lifecycle.an i;
                    public final androidx.lifecycle.an j;
                    public final androidx.lifecycle.an k;

                    {
                        this.f1655a = bgVar2;
                        this.b = a2;
                        this.c = beVar;
                        this.d = c2;
                        this.e = b2;
                        this.f = f;
                        this.g = a3;
                        this.h = b3;
                        this.i = c3;
                        this.j = asVar;
                        this.k = asVar2;
                    }

                    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                    public final void run() {
                        final bg bgVar3 = this.f1655a;
                        androidx.lifecycle.at ayVar = new ay(bgVar3, 1);
                        androidx.lifecycle.an anVar = this.b;
                        be beVar2 = this.c;
                        anVar.g(beVar2, ayVar);
                        this.d.g(beVar2, new ay(bgVar3, 0));
                        final int i2 = 1;
                        this.e.g(beVar2, new androidx.lifecycle.at(bgVar3, i2) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.az

                            /* renamed from: a, reason: collision with root package name */
                            public final bg f1657a;
                            private final int b;

                            {
                                this.b = i2;
                                this.f1657a = bgVar3;
                            }

                            @Override // androidx.lifecycle.at
                            public final void eY(Object obj2) {
                                int i3 = this.b;
                                if (i3 == 0) {
                                    bg bgVar4 = this.f1657a;
                                    bgVar4.j(new aq(bgVar4, (ev) obj2, 2));
                                    return;
                                }
                                if (i3 == 1) {
                                    bg bgVar5 = this.f1657a;
                                    bgVar5.j(new aw(bgVar5, (d) obj2, 0));
                                } else if (i3 != 2) {
                                    bg bgVar6 = this.f1657a;
                                    bgVar6.j(new aw(bgVar6, (Boolean) obj2, 2));
                                } else {
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    bg bgVar7 = this.f1657a;
                                    bgVar7.j(new ax(bgVar7, booleanValue, 1));
                                }
                            }
                        });
                        final int i3 = 0;
                        this.f.g(beVar2, new androidx.lifecycle.at(bgVar3, i3) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.az

                            /* renamed from: a, reason: collision with root package name */
                            public final bg f1657a;
                            private final int b;

                            {
                                this.b = i3;
                                this.f1657a = bgVar3;
                            }

                            @Override // androidx.lifecycle.at
                            public final void eY(Object obj2) {
                                int i32 = this.b;
                                if (i32 == 0) {
                                    bg bgVar4 = this.f1657a;
                                    bgVar4.j(new aq(bgVar4, (ev) obj2, 2));
                                    return;
                                }
                                if (i32 == 1) {
                                    bg bgVar5 = this.f1657a;
                                    bgVar5.j(new aw(bgVar5, (d) obj2, 0));
                                } else if (i32 != 2) {
                                    bg bgVar6 = this.f1657a;
                                    bgVar6.j(new aw(bgVar6, (Boolean) obj2, 2));
                                } else {
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    bg bgVar7 = this.f1657a;
                                    bgVar7.j(new ax(bgVar7, booleanValue, 1));
                                }
                            }
                        });
                        this.g.g(beVar2, new ay(bgVar3, 2));
                        final int i4 = 2;
                        this.h.g(beVar2, new androidx.lifecycle.at(bgVar3, i4) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.az

                            /* renamed from: a, reason: collision with root package name */
                            public final bg f1657a;
                            private final int b;

                            {
                                this.b = i4;
                                this.f1657a = bgVar3;
                            }

                            @Override // androidx.lifecycle.at
                            public final void eY(Object obj2) {
                                int i32 = this.b;
                                if (i32 == 0) {
                                    bg bgVar4 = this.f1657a;
                                    bgVar4.j(new aq(bgVar4, (ev) obj2, 2));
                                    return;
                                }
                                if (i32 == 1) {
                                    bg bgVar5 = this.f1657a;
                                    bgVar5.j(new aw(bgVar5, (d) obj2, 0));
                                } else if (i32 != 2) {
                                    bg bgVar6 = this.f1657a;
                                    bgVar6.j(new aw(bgVar6, (Boolean) obj2, 2));
                                } else {
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    bg bgVar7 = this.f1657a;
                                    bgVar7.j(new ax(bgVar7, booleanValue, 1));
                                }
                            }
                        });
                        this.i.g(beVar2, new ay(bgVar3, 3));
                        this.j.g(beVar2, new ay(bgVar3, 4));
                        final int i5 = 3;
                        this.k.g(beVar2, new androidx.lifecycle.at(bgVar3, i5) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.az

                            /* renamed from: a, reason: collision with root package name */
                            public final bg f1657a;
                            private final int b;

                            {
                                this.b = i5;
                                this.f1657a = bgVar3;
                            }

                            @Override // androidx.lifecycle.at
                            public final void eY(Object obj2) {
                                int i32 = this.b;
                                if (i32 == 0) {
                                    bg bgVar4 = this.f1657a;
                                    bgVar4.j(new aq(bgVar4, (ev) obj2, 2));
                                    return;
                                }
                                if (i32 == 1) {
                                    bg bgVar5 = this.f1657a;
                                    bgVar5.j(new aw(bgVar5, (d) obj2, 0));
                                } else if (i32 != 2) {
                                    bg bgVar6 = this.f1657a;
                                    bgVar6.j(new aw(bgVar6, (Boolean) obj2, 2));
                                } else {
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    bg bgVar7 = this.f1657a;
                                    bgVar7.j(new ax(bgVar7, booleanValue, 1));
                                }
                            }
                        });
                    }
                });
                if (((com.google.android.apps.gsa.shared.k.c) bgVar2.e.a()).w(eu.aM)) {
                    Context context = bgVar2.k;
                    bgVar2.y = new bc(bgVar2);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.car.projection.extra.ACTION_BEGIN_PROJECTION");
                    intentFilter.addAction("android.car.projection.extra.ACTION_END_PROJECTION");
                    intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED");
                    intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED");
                    a.f(context, bgVar2.y, intentFilter, null, 2);
                }
            }
        }
    }
}
