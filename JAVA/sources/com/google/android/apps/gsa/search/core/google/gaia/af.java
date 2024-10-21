package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.common.f.h;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bq;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/af.class */
public final class af implements bq {

    /* renamed from: a, reason: collision with root package name */
    final cn f1101a;
    final an b;
    private final int c;

    public af(an anVar, cn cnVar, int i) {
        this.c = i;
        this.f1101a = cnVar;
        this.b = anVar;
    }

    public final void gJ(Throwable th) {
        if (this.c != 0) {
            com.google.common.f.y e = an.f1105a.e();
            e.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
            a.a.dB(e, "#enableTikTokAccount: TikTok account enable failed", (char) 6976, th);
            this.b.t("#enableTikTokAccount: TikTok account enable failed");
        }
    }

    public final /* synthetic */ void gK(Object obj) {
        if (this.c != 0) {
            com.google.android.libraries.search.account.d.a aVar = (com.google.android.libraries.search.account.d.a) obj;
            this.b.t("#enableTikTokAccount: TikTok account enable succeeded");
            if (aVar != null) {
                dl.y(aVar.f3609a, new af(this.b, this.f1101a, 0), ay.a);
                return;
            }
            return;
        }
        String str = (String) obj;
        synchronized (this.b) {
            an anVar = this.b;
            if (anVar.k == this.f1101a && !h.a.a.p.b.a.f.f(anVar.r(), str)) {
                h e = an.f1105a.e();
                e.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
                h hVar = e;
                hVar.ak(6977);
                hVar.p("TikTok enabled account does not match the current account in AGSA Classic.");
            }
        }
    }
}
