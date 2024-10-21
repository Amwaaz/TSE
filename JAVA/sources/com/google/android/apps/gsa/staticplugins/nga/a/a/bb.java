package com.google.android.apps.gsa.staticplugins.nga.a.a;

import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.util.concurrent.bq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bb.class */
public final class bb implements bq {

    /* renamed from: a, reason: collision with root package name */
    final f f1660a;
    final bg b;

    public bb(bg bgVar, f fVar) {
        this.f1660a = fVar;
        this.b = bgVar;
    }

    public final void gJ(Throwable th) {
        ((h) this.b.b.a()).n("[NGA] NgaStateChecker#updateStateInBackground", new aw(this, this.f1660a, 3));
    }

    public final /* bridge */ /* synthetic */ void gK(Object obj) {
        final bf bfVar = (bf) obj;
        h hVar = (h) this.b.b.a();
        final f fVar = this.f1660a;
        hVar.n("[NGA] NgaStateChecker#updateStateInBackground", new f(this, bfVar, fVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.a.a.ba

            /* renamed from: a, reason: collision with root package name */
            public final bb f1659a;
            public final bf b;
            public final f c;

            {
                this.f1659a = this;
                this.b = bfVar;
                this.c = fVar;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                bf bfVar2 = this.b;
                f fVar2 = this.c;
                bb bbVar = this.f1659a;
                synchronized (bbVar.b.f1665a) {
                    bbVar.b.A = bfVar2;
                    fVar2.run();
                    bbVar.b.g();
                }
            }
        });
    }
}
