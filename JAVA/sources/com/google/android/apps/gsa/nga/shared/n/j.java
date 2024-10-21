package com.google.android.apps.gsa.nga.shared.n;

import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/n/j.class */
public class j {
    public static final com.google.common.f.a.d b = com.google.common.f.a.d.c("ListenerCollectionFactory");

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.gsa.h.h f970a;
    public final a c;

    public j(com.google.android.libraries.gsa.h.h hVar, final a aVar) {
        this.f970a = hVar;
        final ca d = cl.d(new ca(aVar) { // from class: com.google.android.apps.gsa.nga.shared.n.g

            /* renamed from: a, reason: collision with root package name */
            public final a f968a;

            {
                this.f968a = aVar;
            }

            public final Object a() {
                com.google.common.f.a.d dVar = j.b;
                return new CopyOnWriteArraySet((Collection) this.f968a.a());
            }
        });
        d.getClass();
        this.c = new a(d) { // from class: com.google.android.apps.gsa.nga.shared.n.h

            /* renamed from: a, reason: collision with root package name */
            public final ca f969a;

            {
                this.f969a = d;
            }

            public final Object a() {
                return (Set) this.f969a.a();
            }
        };
    }

    public final void b(Object obj) {
        ((Set) this.c.a()).add(obj);
    }

    public final void c(Object obj) {
        ((Set) this.c.a()).remove(obj);
    }

    public final void d(final be beVar) {
        cn a2 = this.f970a.a("[NGA] ListenerCollection", new com.google.android.libraries.gsa.h.c(this, beVar) { // from class: com.google.android.apps.gsa.nga.shared.n.f

            /* renamed from: a, reason: collision with root package name */
            public final j f967a;
            public final be b;

            {
                this.f967a = this;
                this.b = beVar;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                be beVar2 = this.b;
                for (Object obj : (Set) this.f967a.c.a()) {
                    try {
                        beVar2.hf(obj);
                    } catch (Exception e) {
                        com.google.common.f.a.a g = j.b.b(Level.SEVERE).g(e);
                        g.ak(5213);
                        g.H("Crash calling listener %s with consumer %s", obj, beVar2);
                    }
                }
                return com.google.android.apps.gsa.v.c.f1836a;
            }
        });
        this.f970a.m(a2, "[NGA] ListenerCollection callback", new i());
        dl.o(a2);
    }
}
