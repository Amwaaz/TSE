package com.google.android.apps.gsa.nga.engine.s;

import com.google.android.apps.gsa.nga.engine.v.a.ap;
import com.google.android.apps.gsa.nga.engine.v.u;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/s/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f675a = d.j();
    public final h b;
    public final Object c = new Object();
    public boolean d = false;
    public final x e;
    public final ap f;
    private final Optional g;

    public c(ap apVar, h hVar, x xVar, Optional optional) {
        this.f = apVar;
        this.b = hVar;
        this.e = xVar;
        this.g = optional;
    }

    @Deprecated
    public final void a() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            if (this.g.isEmpty()) {
                a f = f675a.f();
                f.ak(3514);
                f.p("ensureLibrariesLoaded called while embeddedNativeLibraryAvailable is false.");
                return;
            }
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
            u a2 = this.f.a(28, ah.a);
            try {
                boolean booleanValue = ((Boolean) this.g.map(new a()).orElse(false)).booleanValue();
                this.d = booleanValue;
                Thread.currentThread().getStackTrace();
                this.b.n("[NGA] NgaNativeLibraryLoaderImpl.logNgaNativeCodeLoadedEvent", new b(this, booleanValue));
                a2.a();
            } finally {
            }
        }
    }
}
