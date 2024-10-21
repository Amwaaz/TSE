package com.google.android.apps.gsa.shared.util.c;

import com.google.android.libraries.gsa.h.h;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/ae.class */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final cn f1546a;
    private final h b;
    private final String c;

    public ae(cn cnVar, h hVar, String str) {
        this.f1546a = cnVar;
        this.b = hVar;
        this.c = str;
    }

    public final ac a(be beVar) {
        return new ac(this.f1546a, this.b, this.c, beVar);
    }

    public final ac b(final com.google.android.libraries.gsa.h.f fVar) {
        return new ac(this.f1546a, this.b, this.c, new be(fVar) { // from class: com.google.android.apps.gsa.shared.util.c.ad

            /* renamed from: a, reason: collision with root package name */
            public final com.google.android.libraries.gsa.h.f f1545a;

            {
                this.f1545a = fVar;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                this.f1545a.run();
            }
        });
    }
}
