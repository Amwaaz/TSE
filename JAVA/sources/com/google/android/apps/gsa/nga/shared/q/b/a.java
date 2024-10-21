package com.google.android.apps.gsa.nga.shared.q.b;

import com.google.android.apps.gsa.nga.shared.q.a.am;
import com.google.android.apps.gsa.nga.shared.q.b;
import com.google.android.apps.gsa.shared.util.n.c;
import com.google.common.base.at;
import com.google.common.base.bd;
import e.c.d;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/b/a.class */
public final class a implements d {
    public static am b(at atVar) {
        return (am) ((bd) atVar).a;
    }

    public static b c(k.a.a aVar, k.a.a aVar2, c cVar) {
        b bVar = (cVar == c.INTERACTOR && ((Optional) aVar.a()).isPresent()) ? (b) ((Optional) aVar.a()).get() : (b) aVar2.a();
        bVar.getClass();
        return bVar;
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
