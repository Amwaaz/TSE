package com.google.android.apps.gsa.nga.engine.recognition.o.a;

import com.google.android.apps.gsa.nga.engine.ak.y.a;
import com.google.android.apps.gsa.nga.engine.ar.ad;
import com.google.android.apps.gsa.nga.engine.ar.af;
import com.google.android.apps.gsa.nga.engine.ar.ag;
import com.google.android.apps.gsa.nga.engine.ar.b.b.ac;
import com.google.android.apps.gsa.nga.engine.b.c.g;
import com.google.android.apps.gsa.nga.engine.q.c;
import com.google.android.apps.gsa.nga.engine.recognition.h;
import com.google.android.apps.gsa.nga.engine.recognition.p;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.common.v.f;
import j$.time.Instant;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/o/a/e.class */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.engine.v.e f674a;
    private final Object b = new Object();
    private final f c;
    private final c d;
    private final com.google.android.apps.gsa.nga.shared.n.e e;
    private final ac f;

    public e(ac acVar, com.google.android.apps.gsa.nga.engine.v.e eVar, c cVar, f fVar, k kVar, aw awVar) {
        this.f = acVar;
        this.f674a = eVar;
        this.d = cVar;
        this.c = fVar;
        this.e = kVar.a(awVar.a(d.class), new com.google.android.apps.gsa.shared.util.c.d() { // from class: com.google.android.apps.gsa.nga.engine.recognition.o.a.b
            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                ((com.google.android.apps.gsa.nga.engine.n.d) obj).f();
            }
        });
    }

    public final void a(String str, String str2, com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        b(new com.google.android.apps.gsa.nga.engine.v.d(this.f674a.a()).a(), h.f, p.h, str, Optional.ofNullable(str2).filter(new c()), cVar, Optional.empty());
    }

    public final void b(g gVar, h hVar, int i, String str, Optional optional, com.google.android.apps.gsa.assistant.shared.k.c cVar, Optional optional2) {
        synchronized (this.b) {
            this.d.d();
            a a2 = com.google.android.apps.gsa.nga.engine.ak.y.b.a();
            optional2.ifPresent(new a(a2));
            ad a3 = ag.a();
            a3.a = gVar;
            a3.e(hVar);
            a3.d(cVar);
            a3.d = a2.a();
            Optional.empty();
            if (str == null) {
                throw new NullPointerException("Null textQuery");
            }
            if (i == 0) {
                throw new NullPointerException("Null sourceType");
            }
            Instant a4 = this.c.a();
            if (a4 == null) {
                throw new NullPointerException("Null time");
            }
            if (optional == null) {
                throw new NullPointerException("Null clickTrackingCgi");
            }
            a3.c = new com.google.android.apps.gsa.nga.engine.ar.g(new af(str, i, a4, optional));
            ag c = a3.c();
            this.e.a(c);
            this.f.a(c);
        }
    }
}
