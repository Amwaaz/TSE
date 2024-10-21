package com.google.android.apps.gsa.nga.engine.am.b;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.ao.i;
import com.google.android.apps.gsa.shared.k.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.fl;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.f.a.d;
import com.google.g.an.a.h.k;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/b/g.class */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private static final d f452a = d.j();
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final a d;

    public g(a aVar) {
        this.d = aVar;
    }

    private final void c() {
        com.google.protos.e.z.d dVar;
        fl d = b.d(this.d.h(eu.kk));
        gy gyVar = new gy();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            String trim = ((String) d.get(i)).trim();
            try {
                dVar = com.google.protos.e.z.d.b(trim);
            } catch (IllegalArgumentException e) {
                try {
                    dVar = com.google.protos.e.z.d.b(a.a.dU(trim, "ONDEVICE_EXPERIMENT_"));
                } catch (IllegalArgumentException e2) {
                    aus.i(f452a.f(), "Dropping an unknown suggestions experiment %s", trim, (char) 4235, e2);
                    dVar = null;
                }
            }
            if (dVar != null) {
                gyVar.h(dVar);
            }
        }
        this.b.set(gyVar.g());
    }

    public final ha a() {
        return nr.a;
    }

    public final ha b() {
        if (this.b.get() == null) {
            c();
        }
        return (ha) this.b.get();
    }

    @Override // com.google.android.apps.gsa.nga.engine.ao.i
    public final void gX(ha haVar) {
        if (haVar.contains(Integer.valueOf(eu.kk.f1453a))) {
            c();
        }
        if (haVar.contains(Integer.valueOf(eu.kj.f1453a))) {
            gy gyVar = new gy();
            fl d = b.d(this.d.h(eu.kj));
            int size = d.size();
            for (int i = 0; i < size; i++) {
                gyVar.h(k.a((String) d.get(i)));
            }
            this.c.set(gyVar.g());
        }
    }
}
