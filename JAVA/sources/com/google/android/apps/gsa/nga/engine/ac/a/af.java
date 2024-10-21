package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.q.a.b;
import com.google.android.apps.gsa.nga.engine.ui.e.h.ad;
import com.google.android.apps.gsa.nga.shared.s.e;
import com.google.android.apps.gsa.nga.shared.s.i;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.g.e.h.a.ca;
import com.google.g.e.h.a.cb;
import com.google.g.e.i.ce;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/af.class */
public final class af {
    public final z d;
    public final ad e;
    public final com.google.android.apps.gsa.nga.shared.q.a.af g;
    private final com.google.android.apps.gsa.shared.util.q.a i;
    private final Set j;
    private final aa k;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f386a = new AtomicReference(com.google.android.apps.gsa.nga.engine.ac.c.IDLE);
    public final e b = new i(com.google.android.apps.gsa.nga.engine.ac.c.IDLE, com.google.android.apps.gsa.nga.engine.b.e.a.class);
    private final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicReference f = new AtomicReference(Optional.empty());

    public af(com.google.android.apps.gsa.shared.util.q.a aVar, z zVar, ad adVar, Set set, aa aaVar, com.google.android.apps.gsa.nga.shared.q.a.af afVar) {
        this.i = aVar;
        this.d = zVar;
        this.e = adVar;
        this.j = set;
        this.k = aaVar;
        this.g = afVar;
    }

    public final com.google.android.apps.gsa.nga.engine.ac.c a() {
        return (com.google.android.apps.gsa.nga.engine.ac.c) this.f386a.get();
    }

    final void b(boolean z) {
        this.h.set(z);
        if (z) {
            return;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((com.google.android.apps.gsa.nga.engine.ak.o.a) it.next()).f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, com.google.common.v.f] */
    public final boolean c() {
        boolean z;
        int cU;
        if (this.i.i(eu.iT)) {
            return false;
        }
        this.h.get();
        if (!this.h.get()) {
            return false;
        }
        aa aaVar = this.k;
        Optional b = ((b) aaVar.b).b();
        if (b.isEmpty()) {
            z = false;
        } else {
            int i = ((com.google.android.apps.gsa.nga.engine.q.b) b.get()).b;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                z = false;
            } else {
                ce ceVar = ((com.google.android.apps.gsa.nga.engine.q.b) b.get()).a;
                Instant a2 = aaVar.f384a.a();
                try {
                    Iterator it = com.google.android.libraries.assistant.p.a.a.a.c(ceVar, cb.a.getParserForType()).b.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        ca caVar = (ca) it.next();
                        com.google.ad.a.a.a.b bVar = caVar.e;
                        com.google.ad.a.a.a.b bVar2 = bVar;
                        if (bVar == null) {
                            bVar2 = com.google.ad.a.a.a.b.a;
                        }
                        int dn = a.a.dn(bVar2.b);
                        int i2 = dn;
                        if (dn == 0) {
                            i2 = 2;
                        }
                        if (i2 != 6 && i2 != 4 && i2 != 5) {
                            com.google.protos.at.c.a aVar = caVar.h;
                            com.google.protos.at.c.a aVar2 = aVar;
                            if (aVar == null) {
                                aVar2 = com.google.protos.at.c.a.a;
                            }
                            if (!aVar2.b && caVar.f.size() != 0 && ((cU = a.a.cU(caVar.c)) == 0 || cU != 4)) {
                                if ((caVar.b & 8) == 0 || a2.isBefore(Instant.ofEpochMilli(caVar.d))) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                } catch (com.google.protobuf.ce e) {
                    z = false;
                }
            }
        }
        return z;
    }
}
