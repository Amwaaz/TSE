package com.google.android.apps.gsa.search.core.ae.ao.a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.ae.ao.a;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.util.concurrent.cn;
import com.google.g.e.i.mi;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/ao/a/g.class */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f1063a;

    public g(e.a aVar) {
        this.f1063a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn a() {
        com.google.android.apps.gsa.search.core.service.e.g aVar = new a();
        ((h) this.f1063a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn b() {
        com.google.android.apps.gsa.search.core.service.e.g bVar = new b();
        ((h) this.f1063a.a()).c(bVar);
        return bVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn c(mi miVar) {
        com.google.android.apps.gsa.search.core.service.e.g cVar = new c(miVar);
        ((h) this.f1063a.a()).c(cVar);
        return cVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn f() {
        com.google.android.apps.gsa.search.core.service.e.g dVar = new d();
        ((h) this.f1063a.a()).c(dVar);
        return dVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn g(String str, boolean z) {
        com.google.android.apps.gsa.search.core.service.e.g fVar = new f(str, z);
        ((h) this.f1063a.a()).c(fVar);
        return fVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn h(BundledMessageNotification bundledMessageNotification) {
        com.google.android.apps.gsa.search.core.service.e.g eVar = new e(bundledMessageNotification);
        ((h) this.f1063a.a()).c(eVar);
        return eVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn i(List list) {
        com.google.android.apps.gsa.search.core.service.e.g jVar = new j(list);
        ((h) this.f1063a.a()).c(jVar);
        return jVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn j(List list) {
        com.google.android.apps.gsa.search.core.service.e.g kVar = new k(list);
        ((h) this.f1063a.a()).c(kVar);
        return kVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn k(ClientEventData clientEventData) {
        com.google.android.apps.gsa.search.core.service.e.g lVar = new l(clientEventData);
        ((h) this.f1063a.a()).c(lVar);
        return lVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn l(String str, String str2) {
        com.google.android.apps.gsa.search.core.service.e.g oVar = new o(str, str2);
        ((h) this.f1063a.a()).c(oVar);
        return oVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn m(BundledMessageNotification bundledMessageNotification, String str) {
        com.google.android.apps.gsa.search.core.service.e.g nVar = new n(bundledMessageNotification, str);
        ((h) this.f1063a.a()).c(nVar);
        return nVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn n(BundledMessageNotification bundledMessageNotification, String str) {
        com.google.android.apps.gsa.search.core.service.e.g pVar = new p(bundledMessageNotification, str);
        ((h) this.f1063a.a()).c(pVar);
        return pVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn o(List list) {
        com.google.android.apps.gsa.search.core.service.e.g qVar = new q(list);
        ((h) this.f1063a.a()).c(qVar);
        return qVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final void p() {
        ((h) this.f1063a.a()).c(new i());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final void q(Context context) {
        ((h) this.f1063a.a()).c(new m(context));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final void r(List list) {
        ((h) this.f1063a.a()).c(new r(list));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.ao.a
    public final cn s(int i) {
        com.google.android.apps.gsa.search.core.service.e.g hVar = new h(i);
        ((h) this.f1063a.a()).c(hVar);
        return hVar;
    }
}
