package com.google.android.apps.gsa.shared.logger.b;

import com.google.common.b.fu;
import com.google.common.b.hn;
import com.google.common.b.oo;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/logger/b/v.class */
final class v {

    /* renamed from: a */
    public final NavigableSet f1463a = new TreeSet();
    public final Map b = new HashMap();

    public final hn a() {
        hn y;
        synchronized (this) {
            y = hn.y(this.f1463a);
        }
        return y;
    }

    public final hn b(com.google.android.libraries.gsa.e.a.a aVar, com.google.android.libraries.gsa.e.a.a aVar2) {
        synchronized (this) {
            NavigableSet subSet = this.f1463a.subSet(aVar, true, aVar2, true);
            fu fuVar = aVar2.d;
            if (fuVar.isEmpty()) {
                return hn.y(subSet);
            }
            return hn.y(oo.g(subSet, new u(fuVar, 0)));
        }
    }

    public final hn c(com.google.android.libraries.gsa.e.a.a aVar) {
        hn y;
        synchronized (this) {
            y = hn.y(this.f1463a.headSet(aVar, true));
        }
        return y;
    }
}
