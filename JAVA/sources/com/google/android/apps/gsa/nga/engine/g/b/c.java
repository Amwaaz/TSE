package com.google.android.apps.gsa.nga.engine.g.b;

import com.google.android.apps.gsa.nga.engine.ae.a.i;
import com.google.android.apps.gsa.nga.engine.ae.aq;
import com.google.android.apps.gsa.nga.engine.ae.u;
import com.google.android.apps.gsa.nga.engine.ak.c.a.p;
import com.google.android.apps.gsa.nga.engine.ak.i.b;
import com.google.android.apps.gsa.nga.engine.ak.s.g;
import com.google.android.apps.gsa.nga.engine.education.a.o;
import com.google.android.apps.gsa.nga.engine.g.a.f;
import com.google.android.apps.gsa.nga.engine.m.c.a.x;
import com.google.android.apps.gsa.nga.engine.recognition.a.b.a.e;
import com.google.android.apps.gsa.nga.engine.ui.c.m;
import com.google.android.apps.gsa.nga.engine.v.a.ae;
import com.google.android.apps.gsa.nga.engine.v.a.ao;
import com.google.android.apps.gsa.nga.engine.v.t;
import com.google.android.apps.gsa.nga.engine.x.h;
import com.google.common.b.fg;
import com.google.common.b.fl;
import e.c.d;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/b/c.class */
public final class c implements d {
    public static fl b(fl flVar, fl flVar2) {
        fg fgVar = new fg(4);
        fgVar.i(flVar);
        fgVar.i(flVar2);
        fl g = fgVar.g();
        g.getClass();
        return g;
    }

    public static fl c(h hVar, t tVar, aq aqVar, e eVar) {
        fg fgVar = new fg(4);
        fgVar.h(tVar);
        fgVar.h(aqVar);
        fgVar.h(eVar);
        fgVar.h(hVar);
        fl g = fgVar.g();
        g.getClass();
        return g;
    }

    public static fl d(Optional optional, Optional optional2, Optional optional3, p pVar, u uVar, x xVar, Optional optional4, g gVar, Optional optional5, Optional optional6, Set set, o oVar, com.google.android.apps.gsa.nga.engine.p.a aVar, com.google.android.apps.gsa.nga.engine.m.d dVar, i iVar, com.google.android.apps.gsa.nga.engine.aj.b.h hVar, f fVar, ae aeVar, ao aoVar, com.google.android.apps.gsa.nga.engine.education.pie.d.a aVar2, com.google.android.apps.gsa.nga.engine.e.b.a.i iVar2, com.google.android.apps.gsa.nga.engine.n.e.ae aeVar2) {
        final fg fgVar = new fg(4);
        fgVar.h(fVar);
        fgVar.h(aVar);
        fgVar.h(xVar);
        fgVar.h(hVar);
        fgVar.h(dVar);
        fgVar.h(oVar);
        fgVar.h(aeVar);
        fgVar.h(iVar);
        fgVar.h(aoVar);
        fgVar.h(pVar);
        fgVar.h(uVar);
        fgVar.h(gVar);
        fgVar.h(aeVar2);
        final int i = 1;
        optional.ifPresent(new Consumer(fgVar, i) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = this.b;
                if (i2 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i2 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i2 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i2 == 3) {
                    this.f618a.h((b) obj);
                } else if (i2 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i2 = this.b;
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        final int i2 = 0;
        optional4.ifPresent(new java.util.function.Consumer(fgVar, i2) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i2;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = this.b;
                if (i22 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i22 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i22 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i22 == 3) {
                    this.f618a.h((b) obj);
                } else if (i22 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                int i22 = this.b;
                if (i22 != 0 && i22 != 1 && i22 != 2 && i22 != 3 && i22 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        final int i3 = 2;
        optional5.ifPresent(new java.util.function.Consumer(fgVar, i3) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i3;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = this.b;
                if (i22 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i22 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i22 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i22 == 3) {
                    this.f618a.h((b) obj);
                } else if (i22 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                int i22 = this.b;
                if (i22 != 0 && i22 != 1 && i22 != 2 && i22 != 3 && i22 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        final int i4 = 3;
        optional6.ifPresent(new java.util.function.Consumer(fgVar, i4) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i4;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = this.b;
                if (i22 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i22 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i22 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i22 == 3) {
                    this.f618a.h((b) obj);
                } else if (i22 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                int i22 = this.b;
                if (i22 != 0 && i22 != 1 && i22 != 2 && i22 != 3 && i22 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        final int i5 = 4;
        optional2.ifPresent(new java.util.function.Consumer(fgVar, i5) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i5;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = this.b;
                if (i22 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i22 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i22 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i22 == 3) {
                    this.f618a.h((b) obj);
                } else if (i22 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                int i22 = this.b;
                if (i22 != 0 && i22 != 1 && i22 != 2 && i22 != 3 && i22 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        final int i6 = 5;
        optional3.ifPresent(new java.util.function.Consumer(fgVar, i6) { // from class: com.google.android.apps.gsa.nga.engine.g.b.a

            /* renamed from: a, reason: collision with root package name */
            public final fg f618a;
            private final int b;

            {
                this.b = i6;
                this.f618a = fgVar;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = this.b;
                if (i22 == 0) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a) obj);
                    return;
                }
                if (i22 == 1) {
                    this.f618a.h((m) obj);
                    return;
                }
                if (i22 == 2) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.au.a.a) obj);
                } else if (i22 == 3) {
                    this.f618a.h((b) obj);
                } else if (i22 != 4) {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.at.a.a) obj);
                } else {
                    this.f618a.h((com.google.android.apps.gsa.nga.engine.bisto.a.a) obj);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                int i22 = this.b;
                if (i22 != 0 && i22 != 1 && i22 != 2 && i22 != 3 && i22 == 4) {
                    return Consumer._CC.$default$andThen(this, consumer);
                }
                return Consumer._CC.$default$andThen(this, consumer);
            }
        });
        fgVar.h(aVar2);
        fgVar.h(iVar2);
        fgVar.i(set);
        fl g = fgVar.g();
        g.getClass();
        return g;
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
