package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.dl;
import kotlinx.coroutines.b.dm;
import m.h.a.p;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/aw.class */
final class aw extends m.c.b.a.h implements p {

    /* renamed from: a, reason: collision with root package name */
    int f909a;
    final Object b;
    final Object c;
    private Object d;
    private final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c cVar, com.google.android.libraries.g.a aVar, m.c.g gVar, int i) {
        super(2, gVar);
        this.e = i;
        this.c = cVar;
        this.b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(com.google.apps.tiktok.concurrent.ai aiVar, h hVar, m.c.g gVar, int i) {
        super(2, gVar);
        this.e = i;
        this.b = aiVar;
        this.c = hVar;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return c((ad) obj, (m.c.g) obj2).b(m.w.a);
        }
        return c((kotlinx.coroutines.a.ae) obj, (m.c.g) obj2).b(m.w.a);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.libraries.g.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.libraries.g.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.libraries.g.a, java.lang.Object] */
    public final Object b(Object obj) {
        Object c;
        if (this.e != 0) {
            m.c.a.a aVar = m.c.a.a.a;
            int i = this.f909a;
            m.k.b(obj);
            if (i == 0) {
                ad adVar = (ad) this.d;
                if (!((com.google.apps.tiktok.concurrent.ai) this.b).d.isDone()) {
                    com.google.android.libraries.search.assistant.r.v.f(((com.google.apps.tiktok.concurrent.ai) this.b).b(), com.google.common.util.concurrent.ay.a, f.f920a);
                }
                com.google.common.f.h d = i.f923a.d();
                d.aj(com.google.common.f.a.e.a, "TRG.BistoHotwordStatus");
                d.ak(5156);
                d.s("On new legacy external hotword consumer configuration: %s.", adVar);
                Object obj2 = this.c;
                this.f909a = 1;
                if (((h) obj2).c(adVar, this) == aVar) {
                    return aVar;
                }
            }
            return m.w.a;
        }
        m.c.a.a aVar2 = m.c.a.a.a;
        if (this.f909a != 0) {
            m.k.b(obj);
        } else {
            m.k.b(obj);
            kotlinx.coroutines.a.ae aeVar = (kotlinx.coroutines.a.ae) this.d;
            dl a2 = dm.a(new n(((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.c).p(), aq.b(this.b)));
            av avVar = new av(a2, this.b);
            ((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.c).k.add(avVar);
            Object obj3 = this.c;
            ?? r0 = this.b;
            do {
                c = a2.c();
            } while (!a2.h(c, new n(((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) obj3).p(), aq.b(r0))));
            cp.x(new kotlinx.coroutines.b.aq(a2, new at(aeVar, null), 5), aeVar);
            au auVar = new au(this.c, avVar, 0);
            this.f909a = 1;
            if (kotlinx.coroutines.a.ac.a(aeVar, auVar, this) == aVar2) {
                return aVar2;
            }
        }
        return m.w.a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.libraries.g.a, java.lang.Object] */
    public final m.c.g c(Object obj, m.c.g gVar) {
        if (this.e != 0) {
            aw awVar = new aw((com.google.apps.tiktok.concurrent.ai) this.b, (h) this.c, gVar, 1);
            awVar.d = obj;
            return awVar;
        }
        aw awVar2 = new aw((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.c, (com.google.android.libraries.g.a) this.b, gVar, 0);
        awVar2.d = obj;
        return awVar2;
    }
}
