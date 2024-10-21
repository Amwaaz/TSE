package com.google.android.apps.gsa.staticplugins.nga.k;

import android.os.Binder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.aq;
import com.google.android.libraries.gsa.h.f;
import com.google.common.o.ls;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/k/r.class */
public final /* synthetic */ class r implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1688a;
    public final Object b;
    private final int c;

    public /* synthetic */ r(Object obj, Object obj2, int i) {
        this.c = i;
        this.f1688a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.apps.gsa.staticplugins.nga.k.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.apps.gsa.staticplugins.nga.k.u] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.google.android.apps.gsa.nga.api.v] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.apps.gsa.staticplugins.nga.k.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.apps.gsa.staticplugins.nga.k.a, java.lang.Object] */
    @Override // com.google.android.libraries.gsa.h.f, com.google.android.libraries.gsa.h.g
    public final void run() {
        com.google.android.apps.gsa.nga.api.t tVar;
        ls lsVar;
        int i = this.c;
        if (i == 0) {
            ?? r0 = (u) this.f1688a;
            if (((aq) r0.c.a()).c()) {
                r0.c(this.b);
                return;
            }
            return;
        }
        if (i == 1) {
            ((u) this.f1688a).c(this.b);
            return;
        }
        ?? r02 = this.b;
        if (r02 == 0) {
            tVar = null;
        } else {
            IInterface queryLocalInterface = r02.queryLocalInterface("com.google.android.apps.gsa.nga.api.INgaService");
            tVar = queryLocalInterface instanceof com.google.android.apps.gsa.nga.api.v ? (com.google.android.apps.gsa.nga.api.v) queryLocalInterface : new com.google.android.apps.gsa.nga.api.t(r02);
        }
        if (tVar == null) {
            return;
        }
        Object obj = this.f1688a;
        t tVar2 = (t) obj;
        u uVar = tVar2.f1690a;
        if (uVar.f == null) {
            uVar.f = new Binder();
        }
        try {
            tVar.d(((t) obj).f1690a.f);
            u uVar2 = tVar2.f1690a;
            uVar2.g = tVar;
            uVar2.h = true;
            n nVar = (n) uVar2.e.a();
            NgaState ngaState = nVar.b;
            if (ngaState != null && (lsVar = nVar.c) != null) {
                nVar.n(ngaState, lsVar, true);
            }
            tVar2.f1690a.a(tVar);
        } catch (RemoteException e) {
            a.a.dB(u.f1691a.e(), "Fail to set the process token.", (char) 15116, e);
        }
    }
}
