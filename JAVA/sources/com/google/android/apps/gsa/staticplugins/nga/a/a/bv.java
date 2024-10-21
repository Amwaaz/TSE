package com.google.android.apps.gsa.staticplugins.nga.a.a;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.apps.gsa.nga.shared.aj.a;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.staticplugins.nga.k.e;
import com.google.android.apps.gsa.staticplugins.nga.k.n;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bv.class */
public final class bv extends com.google.android.apps.gsa.nga.shared.aj.a.c {
    private final n d;
    private final com.google.android.apps.gsa.shared.k.c e;

    public bv(com.google.android.apps.gsa.nga.shared.a.b bVar, Context context, n nVar, com.google.android.apps.gsa.shared.k.c cVar) {
        super(bVar, context, (KeyguardManager) context.getSystemService(KeyguardManager.class));
        this.d = nVar;
        this.e = cVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aj.a.c
    public final void a(Consumer consumer, String str) {
        if (((a) this.c.get()) == null && this.e.w(eu.hP)) {
            f fVar = new f(this);
            n nVar = this.d;
            nVar.f1687a.d(new e(new com.google.android.apps.gsa.nga.api.am(fVar), 5));
        }
        super.a(consumer, str);
    }
}
