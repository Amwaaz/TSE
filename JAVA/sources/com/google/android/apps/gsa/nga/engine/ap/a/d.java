package com.google.android.apps.gsa.nga.engine.ap.a;

import com.google.android.apps.gsa.nga.shared.e.a;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.d.da;
import com.google.common.b.oo;
import com.google.common.base.at;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ap/a/d.class */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f469a = new a(1000);
    public final af b;

    public d(af afVar) {
        this.b = afVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final at a(Set set, da daVar) {
        at U;
        synchronized (this) {
            U = oo.U(this.f469a.descendingIterator(), new c(set, daVar));
        }
        return U;
    }
}
