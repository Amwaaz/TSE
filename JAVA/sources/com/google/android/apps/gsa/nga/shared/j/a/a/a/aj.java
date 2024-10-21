package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import j$.time.Duration;
import m.h.a.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/aj.class */
public final /* synthetic */ class aj extends m.h.b.k implements q {
    public aj(Object obj) {
        super(3, obj, as.class, "onConnectivityStatusDecisionTick", "onConnectivityStatusDecisionTick$java_com_google_android_apps_gsa_nga_shared_entrypoint_hotword_hdm_bisto_bisto_hotword_listener(Lcom/google/android/apps/gsa/nga/shared/entrypoint/hotword/hdm/bisto/ConnectivityStatusDecision;Lcom/google/android/apps/gsa/nga/shared/entrypoint/hotword/hdm/bisto/ConnectivityStatusDecision;Ljava/time/Duration;)V", 0);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.android.libraries.g.a, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        oVar.getClass();
        ((Duration) obj3).getClass();
        m mVar = oVar.b;
        boolean z = mVar.b.f927a;
        boolean z2 = mVar.f926a.f927a;
        as asVar = (as) this.e;
        if (!((!z2) & (!z))) {
            Duration ofMillis = Duration.ofMillis(asVar.b.a());
            ofMillis.getClass();
            Object obj4 = asVar.f905a;
            m mVar2 = oVar.b;
            n nVar = oVar.f928a;
            com.google.android.libraries.search.assistant.invocation.n.d.i iVar = (com.google.android.libraries.search.assistant.invocation.n.d.i) obj4;
            ((com.google.android.libraries.ax.h) iVar.f4322a.ao.a()).b((int) r0.getSeconds(), Boolean.valueOf(mVar2.f926a.f927a), Boolean.valueOf(mVar2.b.f927a), Boolean.valueOf(nVar.f927a), iVar.a(), iVar.b());
            m mVar3 = oVar.b;
            Duration b = m.b.b.b(mVar3.f926a.b, m.b.b.b(mVar3.b.b, oVar.f928a.b));
            Object obj5 = asVar.f905a;
            ofMillis.minus(b).getClass();
            m mVar4 = oVar.b;
            n nVar2 = oVar.f928a;
            boolean h = h.a.a.p.b.a.f.h(oVar, oVar2);
            com.google.android.libraries.search.assistant.invocation.n.d.i iVar2 = (com.google.android.libraries.search.assistant.invocation.n.d.i) obj5;
            ((com.google.android.libraries.ax.e) iVar2.f4322a.am.a()).b(r0.toMillis(), Boolean.valueOf(mVar4.f926a.f927a), Boolean.valueOf(mVar4.b.f927a), Boolean.valueOf(nVar2.f927a), Boolean.valueOf(!h), iVar2.a(), iVar2.b());
            as.a(oVar, oVar2, ofMillis, asVar, "outcome", ar.f904a);
            as.a(oVar, oVar2, ofMillis, asVar, "subscription", ar.c);
            as.a(oVar, oVar2, ofMillis, asVar, "polling", ar.d);
        }
        return m.w.a;
    }
}
