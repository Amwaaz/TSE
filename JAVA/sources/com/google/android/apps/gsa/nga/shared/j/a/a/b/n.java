package com.google.android.apps.gsa.nga.shared.j.a.a.b;

import com.google.android.apps.gsa.binaries.velvet.app.jn;
import com.google.android.apps.gsa.binaries.velvet.app.jo;
import com.google.android.apps.gsa.binaries.velvet.app.ls;
import com.google.android.apps.gsa.binaries.velvet.app.lt;
import com.google.android.apps.gsa.search.shared.service.x;
import com.google.android.libraries.search.d.x.a.d;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.cr;
import kotlinx.coroutines.ag;
import m.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/b/n.class */
public final class n extends m.c.b.a.h implements m.h.a.q {

    /* renamed from: a, reason: collision with root package name */
    Object f945a;
    Object b;
    final AccountId c;
    final com.google.apps.tiktok.account.data.a d;
    final q e;
    final com.google.android.libraries.search.assistant.invocation.c.a.a.b f;
    final lt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.google.android.libraries.search.assistant.invocation.c.a.a.b bVar, lt ltVar, AccountId accountId, com.google.apps.tiktok.account.data.a aVar, q qVar, m.c.g gVar) {
        super(3, gVar);
        this.f = bVar;
        this.g = ltVar;
        this.c = accountId;
        this.d = aVar;
        this.e = qVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f, this.g, this.c, this.d, this.e, (m.c.g) obj3);
        nVar.f945a = (String) obj;
        nVar.b = (com.google.android.libraries.search.assistant.invocation.c.a.a.b.a) obj2;
        return nVar.b(w.a);
    }

    public final Object b(Object obj) {
        m.k.b(obj);
        Object obj2 = this.f945a;
        Object obj3 = this.b;
        if (obj3 == com.google.android.libraries.search.assistant.invocation.c.a.a.b.a.f4230a) {
            com.google.android.libraries.search.assistant.invocation.c.a.a.b bVar = this.f;
            if (bVar.d) {
                return null;
            }
            if (bVar.c && bVar.e.a()) {
                return null;
            }
        }
        lt ltVar = this.g;
        AccountId accountId = this.c;
        String str = this.d.b.j;
        str.getClass();
        int ordinal = ((com.google.android.libraries.search.assistant.invocation.c.a.a.b.a) obj3).ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        jo joVar = ((jn) ltVar.a).f318a;
        return new l(accountId, str, (String) obj2, i, new com.google.android.apps.gsa.nga.shared.j.a.a.c((com.google.android.apps.gsa.nga.shared.j.b.k) joVar.sR.a(), new com.google.android.apps.gsa.nga.shared.j.a.a.c.i((x) joVar.hI.a(), (com.google.android.libraries.g.a) joVar.g.a(), joVar.kk(), (cr) joVar.B.a(), (cr) joVar.H.a()), new com.google.android.apps.gsa.nga.shared.j.a.a.q(new com.google.android.libraries.search.d.c.b.e((com.google.android.libraries.search.d.c.a.f) joVar.ef.a(), (d) joVar.sS.a(), (m.c.n) joVar.R.a()), (ls) joVar.sT.a(), (lt) joVar.sV.a(), (cr) joVar.v.a(), (ag) joVar.bo.a(), (m.c.n) joVar.R.a(), (com.google.android.libraries.search.assistant.invocation.n.d.i) joVar.eY.a(), ((com.google.apps.tiktok.experiments.e) joVar.V.a()).a("com.google.android.libraries.search.assistant.invocation.device 45385882").d()), (com.google.android.apps.search.assistant.platform.g.g.b.k) joVar.VF(), (com.google.android.apps.gsa.search.shared.h.b) joVar.ip.a(), joVar.kk(), (com.google.android.libraries.search.d.ac.c.a.h) joVar.fF.a(), (ag) joVar.Q.a(), (m.c.n) joVar.R.a()));
    }
}
