package com.google.android.apps.gsa.nga.shared.s;

import com.google.android.apps.gsa.shared.util.c.be;
import com.google.common.b.ha;
import com.google.common.b.qj;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/s/a.class */
public abstract class a implements f {
    public ha c;
    private final Class f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1000a = new Object();
    public final Set b = new LinkedHashSet();
    public final AtomicReference d = new AtomicReference();
    public final be e = new h(this, 1);

    public a(Class cls, ha haVar) {
        this.f = cls;
        this.c = haVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final Class a() {
        return this.f;
    }

    public abstract Object b();

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final Object c() {
        return b();
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final void d(be beVar) {
        synchronized (this.f1000a) {
            boolean isEmpty = this.b.isEmpty();
            this.b.add(beVar);
            if (isEmpty) {
                this.d.set(b());
                qj j = this.c.j();
                while (j.hasNext()) {
                    ((f) j.next()).d(this.e);
                }
            }
        }
    }

    @Override // com.google.android.apps.gsa.nga.shared.s.f
    public final void e(be beVar) {
        synchronized (this.f1000a) {
            this.b.remove(beVar);
            if (this.b.isEmpty()) {
                qj j = this.c.j();
                while (j.hasNext()) {
                    ((f) j.next()).e(this.e);
                }
            }
        }
    }
}
