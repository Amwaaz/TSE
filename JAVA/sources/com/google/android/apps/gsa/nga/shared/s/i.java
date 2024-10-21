package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.shared.util.c.be;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/i.class */
public final class i implements e {
    public final AtomicReference b;
    public final Class c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f1003a = new CopyOnWriteArraySet();
    public final be d = new h(this, 0);

    public i(Object obj, Class cls) {
        this.b = new AtomicReference(obj);
        this.c = cls;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final Class a() {
        return this.c;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.e
    public final void b(final Object obj) {
        com.google.android.libraries.gsa.h.i.b(this.c);
        new com.google.android.libraries.gsa.h.a.i(this.c, new com.google.android.libraries.gsa.h.f(this, obj) { // from class: com.google.android.apps.gsa.nga.shared.s.g

            /* renamed from: a, reason: collision with root package name */
            public final i f1001a;
            public final Object b;

            {
                this.f1001a = this;
                this.b = obj;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                this.f1001a.d.hf(this.b);
            }
        }).run();
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final Object c() {
        return this.b.get();
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final void d(be beVar) {
        this.f1003a.add(beVar);
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final void e(be beVar) {
        this.f1003a.remove(beVar);
    }
}
