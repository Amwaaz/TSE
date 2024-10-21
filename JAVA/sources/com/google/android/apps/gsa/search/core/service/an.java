package com.google.android.apps.gsa.search.core.service;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.search.core.state.ca;
import com.google.android.apps.gsa.search.core.state.d.ai;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.libraries.gsa.h.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.y;
import com.google.common.util.concurrent.dl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/an.class */
public final class an implements f {

    /* renamed from: a, reason: collision with root package name */
    final ao f1153a;
    private final int b;
    private final int c;

    public an(ao aoVar, int i, int i2) {
        this.c = i2;
        this.f1153a = aoVar;
        this.b = i;
    }

    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        if (this.c != 0) {
            ab abVar = e.a;
            if (((ai) this.f1153a.d.a()).p()) {
                this.f1153a.a();
                return;
            }
            ao aoVar = this.f1153a;
            if (aoVar.f == this.b) {
                HashSet hashSet = new HashSet();
                Iterator it = ((Set) this.f1153a.h.a()).iterator();
                while (it.hasNext()) {
                    hashSet.add(((ca) it.next()).a());
                }
                new ae(dl.j(hashSet), (h) this.f1153a.e.a(), "ServiceShutdownLikely listener callback").b(new f() { // from class: com.google.android.apps.gsa.search.core.service.al
                    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
                    public final void run() {
                        ab abVar2 = e.a;
                    }
                }).a(new be() { // from class: com.google.android.apps.gsa.search.core.service.am
                    @Override // com.google.android.apps.gsa.shared.util.c.be
                    public final void hf(Object obj) {
                        y f = ao.f1154a.f();
                        f.aj(e.a, "ServiceLifecycleDecider");
                        aus.c(f, obj, "ServiceShutdownLikely listeners execution failure.", (char) 7309);
                        int i = com.google.android.apps.gsa.shared.util.b.h.a;
                    }
                });
                return;
            }
            return;
        }
        ab abVar2 = e.a;
        if (((ai) this.f1153a.d.a()).p()) {
            this.f1153a.a();
            return;
        }
        ao aoVar2 = this.f1153a;
        if (aoVar2.f == this.b) {
            Iterator it2 = ((Set) aoVar2.h.a()).iterator();
            while (it2.hasNext()) {
                ((ca) it2.next()).b();
            }
            ao aoVar3 = this.f1153a;
            aoVar3.g = false;
            aoVar3.i.b(false);
            this.f1153a.c.a(false);
            this.f1153a.i.c();
        }
    }
}
