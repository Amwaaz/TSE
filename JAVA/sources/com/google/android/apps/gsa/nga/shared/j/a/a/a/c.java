package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.common.o.or;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/c.class */
final class c extends m.h.b.n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final h f917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar) {
        super(0);
        this.f917a = hVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.android.apps.gsa.search.shared.service.d dVar = new com.google.android.apps.gsa.search.shared.service.d();
        dVar.c = or.U;
        dVar.d = "device_boot_or_install";
        ClientConfig clientConfig = new ClientConfig(dVar);
        com.google.android.apps.gsa.search.shared.service.ae aeVar = new com.google.android.apps.gsa.search.shared.service.ae(com.google.android.apps.gsa.search.shared.service.c.ac.HOTWORD_SERVICE_CONNECTED);
        aeVar.f(new Intent());
        com.google.android.libraries.search.assistant.r.v.f(this.f917a.d.b.b(clientConfig, aeVar.d(), com.google.android.apps.gsa.broadcastreceiver.a.f332a), com.google.common.util.concurrent.ay.a, ar.b);
        return m.w.a;
    }
}
