package com.google.android.apps.gsa.nga.engine.education.pie.a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.ae.a.i;
import com.google.android.apps.gsa.nga.engine.education.pie.f.aa;
import com.google.android.apps.gsa.nga.engine.education.pie.f.c;
import com.google.android.apps.gsa.nga.engine.education.pie.f.e;
import com.google.android.apps.gsa.nga.engine.education.pie.f.o;
import com.google.android.apps.gsa.nga.engine.education.pie.f.t;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.u.d.a.l;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fu;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/a/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f573a = com.google.common.f.a.d.j();
    public final fu b;

    public n(final d dVar, final w wVar, final f fVar, final f fVar2, final j jVar) {
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        final int i4 = 3;
        final int i5 = 4;
        this.b = fu.q(l.APP_OPEN, new Function(dVar, i) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.a.m

            /* renamed from: a, reason: collision with root package name */
            public final Object f572a;
            private final int b;

            {
                this.b = i;
                this.f572a = dVar;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$andThen(this, function);
                }
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i6 = this.b;
                if (i6 == 0) {
                    Bundle bundle = (Bundle) obj;
                    bundle.getClass();
                    w wVar2 = (w) this.f572a;
                    aa aaVar = (aa) wVar2.f574a.a();
                    aaVar.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) wVar2.b.a();
                    kVar.getClass();
                    aa aaVar2 = (aa) wVar2.c.a();
                    aaVar2.getClass();
                    return new v(bundle, aaVar, kVar, aaVar2);
                }
                if (i6 == 1) {
                    Bundle bundle2 = (Bundle) obj;
                    bundle2.getClass();
                    d dVar2 = (d) this.f572a;
                    aa aaVar3 = (aa) dVar2.f569a.a();
                    aaVar3.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) dVar2.b.a();
                    kVar2.getClass();
                    o oVar = (o) dVar2.c.a();
                    oVar.getClass();
                    e eVar = (e) dVar2.d.a();
                    eVar.getClass();
                    t tVar = (t) dVar2.e.a();
                    tVar.getClass();
                    a aVar = (a) dVar2.f.a();
                    aVar.getClass();
                    return new c(bundle2, aaVar3, kVar2, oVar, eVar, tVar, aVar);
                }
                if (i6 == 2) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.getClass();
                    f fVar3 = (f) this.f572a;
                    aa aaVar4 = (aa) fVar3.f570a.a();
                    aaVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar3.b.a();
                    kVar3.getClass();
                    e eVar2 = (e) fVar3.c.a();
                    eVar2.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar3.d.a();
                    mVar.getClass();
                    t tVar2 = (t) fVar3.e.a();
                    tVar2.getClass();
                    return new e(bundle3, aaVar4, kVar3, eVar2, mVar, tVar2);
                }
                if (i6 == 3) {
                    Bundle bundle4 = (Bundle) obj;
                    bundle4.getClass();
                    f fVar4 = (f) this.f572a;
                    aa aaVar5 = (aa) fVar4.f570a.a();
                    aaVar5.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar4 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar4.c.a();
                    kVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar4.e.a();
                    mVar2.getClass();
                    t tVar3 = (t) fVar4.d.a();
                    tVar3.getClass();
                    t tVar4 = (t) fVar4.b.a();
                    tVar4.getClass();
                    return new b(bundle4, aaVar5, kVar4, mVar2, tVar3, tVar4);
                }
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                j jVar2 = (j) this.f572a;
                aa aaVar6 = (aa) jVar2.f571a.a();
                aaVar6.getClass();
                t tVar5 = (t) jVar2.b.a();
                tVar5.getClass();
                c cVar = (c) jVar2.c.a();
                cVar.getClass();
                y yVar = (y) jVar2.d.a();
                yVar.getClass();
                com.google.android.apps.gsa.nga.engine.education.b.o oVar2 = (com.google.android.apps.gsa.nga.engine.education.b.o) jVar2.e.a();
                oVar2.getClass();
                b bVar = (b) jVar2.f.a();
                bVar.getClass();
                a aVar2 = (a) jVar2.g.a();
                aVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.e.a.b) jVar2.h.a();
                bVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.b.b bVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.b.b) jVar2.i.a();
                bVar3.getClass();
                i iVar = (i) jVar2.j.a();
                iVar.getClass();
                return new i(bundle5, aaVar6, tVar5, cVar, yVar, oVar2, bVar, aVar2, bVar2, bVar3, iVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$compose(this, function);
                }
                return Function._CC.$default$compose(this, function);
            }
        }, l.SWIPE_EDUCATION, new java.util.function.Function(wVar, i2) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.a.m

            /* renamed from: a, reason: collision with root package name */
            public final Object f572a;
            private final int b;

            {
                this.b = i2;
                this.f572a = wVar;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$andThen(this, function);
                }
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i6 = this.b;
                if (i6 == 0) {
                    Bundle bundle = (Bundle) obj;
                    bundle.getClass();
                    w wVar2 = (w) this.f572a;
                    aa aaVar = (aa) wVar2.f574a.a();
                    aaVar.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) wVar2.b.a();
                    kVar.getClass();
                    aa aaVar2 = (aa) wVar2.c.a();
                    aaVar2.getClass();
                    return new v(bundle, aaVar, kVar, aaVar2);
                }
                if (i6 == 1) {
                    Bundle bundle2 = (Bundle) obj;
                    bundle2.getClass();
                    d dVar2 = (d) this.f572a;
                    aa aaVar3 = (aa) dVar2.f569a.a();
                    aaVar3.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) dVar2.b.a();
                    kVar2.getClass();
                    o oVar = (o) dVar2.c.a();
                    oVar.getClass();
                    e eVar = (e) dVar2.d.a();
                    eVar.getClass();
                    t tVar = (t) dVar2.e.a();
                    tVar.getClass();
                    a aVar = (a) dVar2.f.a();
                    aVar.getClass();
                    return new c(bundle2, aaVar3, kVar2, oVar, eVar, tVar, aVar);
                }
                if (i6 == 2) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.getClass();
                    f fVar3 = (f) this.f572a;
                    aa aaVar4 = (aa) fVar3.f570a.a();
                    aaVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar3.b.a();
                    kVar3.getClass();
                    e eVar2 = (e) fVar3.c.a();
                    eVar2.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar3.d.a();
                    mVar.getClass();
                    t tVar2 = (t) fVar3.e.a();
                    tVar2.getClass();
                    return new e(bundle3, aaVar4, kVar3, eVar2, mVar, tVar2);
                }
                if (i6 == 3) {
                    Bundle bundle4 = (Bundle) obj;
                    bundle4.getClass();
                    f fVar4 = (f) this.f572a;
                    aa aaVar5 = (aa) fVar4.f570a.a();
                    aaVar5.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar4 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar4.c.a();
                    kVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar4.e.a();
                    mVar2.getClass();
                    t tVar3 = (t) fVar4.d.a();
                    tVar3.getClass();
                    t tVar4 = (t) fVar4.b.a();
                    tVar4.getClass();
                    return new b(bundle4, aaVar5, kVar4, mVar2, tVar3, tVar4);
                }
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                j jVar2 = (j) this.f572a;
                aa aaVar6 = (aa) jVar2.f571a.a();
                aaVar6.getClass();
                t tVar5 = (t) jVar2.b.a();
                tVar5.getClass();
                c cVar = (c) jVar2.c.a();
                cVar.getClass();
                y yVar = (y) jVar2.d.a();
                yVar.getClass();
                com.google.android.apps.gsa.nga.engine.education.b.o oVar2 = (com.google.android.apps.gsa.nga.engine.education.b.o) jVar2.e.a();
                oVar2.getClass();
                b bVar = (b) jVar2.f.a();
                bVar.getClass();
                a aVar2 = (a) jVar2.g.a();
                aVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.e.a.b) jVar2.h.a();
                bVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.b.b bVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.b.b) jVar2.i.a();
                bVar3.getClass();
                i iVar = (i) jVar2.j.a();
                iVar.getClass();
                return new i(bundle5, aaVar6, tVar5, cVar, yVar, oVar2, bVar, aVar2, bVar2, bVar3, iVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$compose(this, function);
                }
                return Function._CC.$default$compose(this, function);
            }
        }, l.GENERIC_TRY_SAYING, new java.util.function.Function(fVar, i3) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.a.m

            /* renamed from: a, reason: collision with root package name */
            public final Object f572a;
            private final int b;

            {
                this.b = i3;
                this.f572a = fVar;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$andThen(this, function);
                }
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i6 = this.b;
                if (i6 == 0) {
                    Bundle bundle = (Bundle) obj;
                    bundle.getClass();
                    w wVar2 = (w) this.f572a;
                    aa aaVar = (aa) wVar2.f574a.a();
                    aaVar.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) wVar2.b.a();
                    kVar.getClass();
                    aa aaVar2 = (aa) wVar2.c.a();
                    aaVar2.getClass();
                    return new v(bundle, aaVar, kVar, aaVar2);
                }
                if (i6 == 1) {
                    Bundle bundle2 = (Bundle) obj;
                    bundle2.getClass();
                    d dVar2 = (d) this.f572a;
                    aa aaVar3 = (aa) dVar2.f569a.a();
                    aaVar3.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) dVar2.b.a();
                    kVar2.getClass();
                    o oVar = (o) dVar2.c.a();
                    oVar.getClass();
                    e eVar = (e) dVar2.d.a();
                    eVar.getClass();
                    t tVar = (t) dVar2.e.a();
                    tVar.getClass();
                    a aVar = (a) dVar2.f.a();
                    aVar.getClass();
                    return new c(bundle2, aaVar3, kVar2, oVar, eVar, tVar, aVar);
                }
                if (i6 == 2) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.getClass();
                    f fVar3 = (f) this.f572a;
                    aa aaVar4 = (aa) fVar3.f570a.a();
                    aaVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar3.b.a();
                    kVar3.getClass();
                    e eVar2 = (e) fVar3.c.a();
                    eVar2.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar3.d.a();
                    mVar.getClass();
                    t tVar2 = (t) fVar3.e.a();
                    tVar2.getClass();
                    return new e(bundle3, aaVar4, kVar3, eVar2, mVar, tVar2);
                }
                if (i6 == 3) {
                    Bundle bundle4 = (Bundle) obj;
                    bundle4.getClass();
                    f fVar4 = (f) this.f572a;
                    aa aaVar5 = (aa) fVar4.f570a.a();
                    aaVar5.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar4 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar4.c.a();
                    kVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar4.e.a();
                    mVar2.getClass();
                    t tVar3 = (t) fVar4.d.a();
                    tVar3.getClass();
                    t tVar4 = (t) fVar4.b.a();
                    tVar4.getClass();
                    return new b(bundle4, aaVar5, kVar4, mVar2, tVar3, tVar4);
                }
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                j jVar2 = (j) this.f572a;
                aa aaVar6 = (aa) jVar2.f571a.a();
                aaVar6.getClass();
                t tVar5 = (t) jVar2.b.a();
                tVar5.getClass();
                c cVar = (c) jVar2.c.a();
                cVar.getClass();
                y yVar = (y) jVar2.d.a();
                yVar.getClass();
                com.google.android.apps.gsa.nga.engine.education.b.o oVar2 = (com.google.android.apps.gsa.nga.engine.education.b.o) jVar2.e.a();
                oVar2.getClass();
                b bVar = (b) jVar2.f.a();
                bVar.getClass();
                a aVar2 = (a) jVar2.g.a();
                aVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.e.a.b) jVar2.h.a();
                bVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.b.b bVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.b.b) jVar2.i.a();
                bVar3.getClass();
                i iVar = (i) jVar2.j.a();
                iVar.getClass();
                return new i(bundle5, aaVar6, tVar5, cVar, yVar, oVar2, bVar, aVar2, bVar2, bVar3, iVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$compose(this, function);
                }
                return Function._CC.$default$compose(this, function);
            }
        }, l.APP_EDUCATION, new java.util.function.Function(fVar2, i4) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.a.m

            /* renamed from: a, reason: collision with root package name */
            public final Object f572a;
            private final int b;

            {
                this.b = i4;
                this.f572a = fVar2;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$andThen(this, function);
                }
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i6 = this.b;
                if (i6 == 0) {
                    Bundle bundle = (Bundle) obj;
                    bundle.getClass();
                    w wVar2 = (w) this.f572a;
                    aa aaVar = (aa) wVar2.f574a.a();
                    aaVar.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) wVar2.b.a();
                    kVar.getClass();
                    aa aaVar2 = (aa) wVar2.c.a();
                    aaVar2.getClass();
                    return new v(bundle, aaVar, kVar, aaVar2);
                }
                if (i6 == 1) {
                    Bundle bundle2 = (Bundle) obj;
                    bundle2.getClass();
                    d dVar2 = (d) this.f572a;
                    aa aaVar3 = (aa) dVar2.f569a.a();
                    aaVar3.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) dVar2.b.a();
                    kVar2.getClass();
                    o oVar = (o) dVar2.c.a();
                    oVar.getClass();
                    e eVar = (e) dVar2.d.a();
                    eVar.getClass();
                    t tVar = (t) dVar2.e.a();
                    tVar.getClass();
                    a aVar = (a) dVar2.f.a();
                    aVar.getClass();
                    return new c(bundle2, aaVar3, kVar2, oVar, eVar, tVar, aVar);
                }
                if (i6 == 2) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.getClass();
                    f fVar3 = (f) this.f572a;
                    aa aaVar4 = (aa) fVar3.f570a.a();
                    aaVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar3.b.a();
                    kVar3.getClass();
                    e eVar2 = (e) fVar3.c.a();
                    eVar2.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar3.d.a();
                    mVar.getClass();
                    t tVar2 = (t) fVar3.e.a();
                    tVar2.getClass();
                    return new e(bundle3, aaVar4, kVar3, eVar2, mVar, tVar2);
                }
                if (i6 == 3) {
                    Bundle bundle4 = (Bundle) obj;
                    bundle4.getClass();
                    f fVar4 = (f) this.f572a;
                    aa aaVar5 = (aa) fVar4.f570a.a();
                    aaVar5.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar4 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar4.c.a();
                    kVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar4.e.a();
                    mVar2.getClass();
                    t tVar3 = (t) fVar4.d.a();
                    tVar3.getClass();
                    t tVar4 = (t) fVar4.b.a();
                    tVar4.getClass();
                    return new b(bundle4, aaVar5, kVar4, mVar2, tVar3, tVar4);
                }
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                j jVar2 = (j) this.f572a;
                aa aaVar6 = (aa) jVar2.f571a.a();
                aaVar6.getClass();
                t tVar5 = (t) jVar2.b.a();
                tVar5.getClass();
                c cVar = (c) jVar2.c.a();
                cVar.getClass();
                y yVar = (y) jVar2.d.a();
                yVar.getClass();
                com.google.android.apps.gsa.nga.engine.education.b.o oVar2 = (com.google.android.apps.gsa.nga.engine.education.b.o) jVar2.e.a();
                oVar2.getClass();
                b bVar = (b) jVar2.f.a();
                bVar.getClass();
                a aVar2 = (a) jVar2.g.a();
                aVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.e.a.b) jVar2.h.a();
                bVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.b.b bVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.b.b) jVar2.i.a();
                bVar3.getClass();
                i iVar = (i) jVar2.j.a();
                iVar.getClass();
                return new i(bundle5, aaVar6, tVar5, cVar, yVar, oVar2, bVar, aVar2, bVar2, bVar3, iVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$compose(this, function);
                }
                return Function._CC.$default$compose(this, function);
            }
        }, l.MULTI_STEP_TRY_SAYING, new java.util.function.Function(jVar, i5) { // from class: com.google.android.apps.gsa.nga.engine.education.pie.a.m

            /* renamed from: a, reason: collision with root package name */
            public final Object f572a;
            private final int b;

            {
                this.b = i5;
                this.f572a = jVar;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$andThen(this, function);
                }
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i6 = this.b;
                if (i6 == 0) {
                    Bundle bundle = (Bundle) obj;
                    bundle.getClass();
                    w wVar2 = (w) this.f572a;
                    aa aaVar = (aa) wVar2.f574a.a();
                    aaVar.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) wVar2.b.a();
                    kVar.getClass();
                    aa aaVar2 = (aa) wVar2.c.a();
                    aaVar2.getClass();
                    return new v(bundle, aaVar, kVar, aaVar2);
                }
                if (i6 == 1) {
                    Bundle bundle2 = (Bundle) obj;
                    bundle2.getClass();
                    d dVar2 = (d) this.f572a;
                    aa aaVar3 = (aa) dVar2.f569a.a();
                    aaVar3.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) dVar2.b.a();
                    kVar2.getClass();
                    o oVar = (o) dVar2.c.a();
                    oVar.getClass();
                    e eVar = (e) dVar2.d.a();
                    eVar.getClass();
                    t tVar = (t) dVar2.e.a();
                    tVar.getClass();
                    a aVar = (a) dVar2.f.a();
                    aVar.getClass();
                    return new c(bundle2, aaVar3, kVar2, oVar, eVar, tVar, aVar);
                }
                if (i6 == 2) {
                    Bundle bundle3 = (Bundle) obj;
                    bundle3.getClass();
                    f fVar3 = (f) this.f572a;
                    aa aaVar4 = (aa) fVar3.f570a.a();
                    aaVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar3.b.a();
                    kVar3.getClass();
                    e eVar2 = (e) fVar3.c.a();
                    eVar2.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar3.d.a();
                    mVar.getClass();
                    t tVar2 = (t) fVar3.e.a();
                    tVar2.getClass();
                    return new e(bundle3, aaVar4, kVar3, eVar2, mVar, tVar2);
                }
                if (i6 == 3) {
                    Bundle bundle4 = (Bundle) obj;
                    bundle4.getClass();
                    f fVar4 = (f) this.f572a;
                    aa aaVar5 = (aa) fVar4.f570a.a();
                    aaVar5.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.k kVar4 = (com.google.android.apps.gsa.nga.engine.education.pie.f.k) fVar4.c.a();
                    kVar4.getClass();
                    com.google.android.apps.gsa.nga.engine.education.pie.f.m mVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.f.m) fVar4.e.a();
                    mVar2.getClass();
                    t tVar3 = (t) fVar4.d.a();
                    tVar3.getClass();
                    t tVar4 = (t) fVar4.b.a();
                    tVar4.getClass();
                    return new b(bundle4, aaVar5, kVar4, mVar2, tVar3, tVar4);
                }
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                j jVar2 = (j) this.f572a;
                aa aaVar6 = (aa) jVar2.f571a.a();
                aaVar6.getClass();
                t tVar5 = (t) jVar2.b.a();
                tVar5.getClass();
                c cVar = (c) jVar2.c.a();
                cVar.getClass();
                y yVar = (y) jVar2.d.a();
                yVar.getClass();
                com.google.android.apps.gsa.nga.engine.education.b.o oVar2 = (com.google.android.apps.gsa.nga.engine.education.b.o) jVar2.e.a();
                oVar2.getClass();
                b bVar = (b) jVar2.f.a();
                bVar.getClass();
                a aVar2 = (a) jVar2.g.a();
                aVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.e.a.b bVar2 = (com.google.android.apps.gsa.nga.engine.education.pie.e.a.b) jVar2.h.a();
                bVar2.getClass();
                com.google.android.apps.gsa.nga.engine.education.pie.b.b bVar3 = (com.google.android.apps.gsa.nga.engine.education.pie.b.b) jVar2.i.a();
                bVar3.getClass();
                i iVar = (i) jVar2.j.a();
                iVar.getClass();
                return new i(bundle5, aaVar6, tVar5, cVar, yVar, oVar2, bVar, aVar2, bVar2, bVar3, iVar);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2 && i6 == 3) {
                    return Function._CC.$default$compose(this, function);
                }
                return Function._CC.$default$compose(this, function);
            }
        });
    }
}
