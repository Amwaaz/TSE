package com.google.android.apps.gsa.search.core.service.f.a;

import com.google.common.base.at;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/f/a/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1198a = j.i("com.google.android.apps.gsa.search.core.service.f.a.e");
    public final com.google.android.libraries.gsa.h.h b;
    public final Map c;
    private final com.google.android.libraries.gsa.h.h d;

    public e(Map map, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2) {
        this.c = map;
        this.d = hVar;
        this.b = hVar2;
    }

    public final cn a(final String str) {
        return this.d.b("Loading worker: ".concat(String.valueOf(str)), new com.google.android.libraries.gsa.h.c(this, str) { // from class: com.google.android.apps.gsa.search.core.service.f.a.d

            /* renamed from: a, reason: collision with root package name */
            public final e f1197a;
            public final String b;

            {
                this.f1197a = this;
                this.b = str;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                cn m;
                e eVar = this.f1197a;
                Map map = eVar.c;
                String str2 = this.b;
                k.a.a aVar = (k.a.a) map.get(str2);
                at k = aVar != null ? at.k((com.google.android.apps.gsa.search.core.service.f.b) aVar.a()) : com.google.common.base.a.a;
                if (k.h()) {
                    m = eVar.b.a("Initialize worker ".concat(String.valueOf(str2)), new com.google.android.libraries.gsa.h.c(k) { // from class: com.google.android.apps.gsa.search.core.service.f.a.c

                        /* renamed from: a, reason: collision with root package name */
                        public final at f1196a;

                        {
                            this.f1196a = k;
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.apps.gsa.search.core.service.f.b] */
                        @Override // com.google.android.libraries.gsa.h.c
                        public final Object a() {
                            ?? c = this.f1196a.c();
                            c.ie();
                            return c;
                        }
                    });
                } else {
                    String format = String.format("No worker found for Worker ID [%s].", str2);
                    com.google.common.f.h e = e.f1198a.e();
                    e.aj(com.google.common.f.a.e.a, "WorkerLoader");
                    com.google.common.f.h hVar = e;
                    hVar.ak(7395);
                    hVar.s("%s", format);
                    m = dl.m(new com.google.android.apps.gsa.search.core.service.g.a.a(format));
                }
                return m;
            }
        });
    }
}
