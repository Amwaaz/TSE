package com.google.android.apps.gsa.binaries.velvet.app;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.b;
import com.google.apps.tiktok.experiments.phenotype.bh;
import com.google.apps.tiktok.experiments.phenotype.cv;
import com.google.apps.tiktok.experiments.phenotype.cw;
import com.google.apps.tiktok.experiments.phenotype.dc;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/binaries/velvet/app/ie.class */
public final class ie implements cw {

    /* renamed from: a, reason: collision with root package name */
    final jd f304a;

    public ie(jd jdVar) {
        this.f304a = jdVar;
    }

    @Override // com.google.apps.tiktok.experiments.phenotype.cw
    public final cv a(String str) {
        AccountId accountId = (AccountId) this.f304a.b.g.a();
        b bVar = (b) this.f304a.f312a.bN.a();
        jo joVar = this.f304a.f312a;
        joVar.adS();
        bh agc = joVar.agc();
        dc dcVar = (dc) joVar.gI.a();
        jd jdVar = this.f304a;
        return new cv(accountId, bVar, agc, dcVar, jdVar.b.j, (Executor) jdVar.f312a.H.a(), jo.aey(), str);
    }
}
