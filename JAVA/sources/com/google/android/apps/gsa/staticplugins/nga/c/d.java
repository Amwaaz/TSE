package com.google.android.apps.gsa.staticplugins.nga.c;

import com.google.android.apps.gsa.search.core.ac.w;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.staticplugins.nga.k.n;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.qj;
import java.util.ArrayList;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/c/d.class */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final n f1680a;
    public final b b;
    private final h c;

    public d(n nVar, b bVar, h hVar) {
        this.f1680a = nVar;
        this.b = bVar;
        this.c = hVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ac.w
    public final void d(final i iVar) {
        this.c.n("[NGA] NgaSyncedStartupConfigFlagsUpdateListener.notifyNGAaboutConfigFlagsUpdated", new f(this, iVar) { // from class: com.google.android.apps.gsa.staticplugins.nga.c.c

            /* renamed from: a, reason: collision with root package name */
            public final d f1679a;
            public final i b;

            {
                this.f1679a = this;
                this.b = iVar;
            }

            @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
            public final void run() {
                final ArrayList arrayList = new ArrayList();
                d dVar = this.f1679a;
                qj j = dVar.b.a().j();
                while (j.hasNext()) {
                    i iVar2 = this.b;
                    Integer num = (Integer) j.next();
                    if (iVar2.a(num.intValue())) {
                        arrayList.add(num);
                    }
                }
                n nVar = dVar.f1680a;
                final int i = 0;
                nVar.f1687a.d(new com.google.android.apps.gsa.staticplugins.nga.k.a(arrayList, i) { // from class: com.google.android.apps.gsa.staticplugins.nga.k.j

                    /* renamed from: a, reason: collision with root package name */
                    public final Object f1686a;
                    private final int b;

                    {
                        this.b = i;
                        this.f1686a = arrayList;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.apps.gsa.nga.api.p, java.lang.Object] */
                    @Override // com.google.android.apps.gsa.staticplugins.nga.k.a
                    public final void a(Object obj) {
                        if (this.b != 0) {
                            obj.c(this.f1686a);
                        } else {
                            obj.m(this.f1686a);
                        }
                    }
                });
            }
        });
    }
}
