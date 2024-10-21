package com.google.android.apps.gsa.search.core.service;

import a.a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.ac;
import com.google.android.apps.gsa.shared.util.debug.a.e;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.a.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/m.class */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f1217a = new ArrayDeque();
    public final List b = new ArrayList();
    final o c;

    public m(o oVar) {
        this.c = oVar;
    }

    public final int a() {
        o oVar = this.c;
        if (oVar.s == null) {
            return 1;
        }
        if (oVar.i || oVar.f.e.equals("transcription")) {
            return this.f1217a.isEmpty() ? 3 : 2;
        }
        return 1;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        fVar.q("ClientEventDispatcher");
        int a2 = a() - 1;
        if (a2 == 0) {
            fVar.b("mode").a(new com.google.android.apps.gsa.shared.util.b.d("paused", false));
            fVar.b("events being dispatched").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f1217a.size()), false));
        } else if (a2 != 1) {
            fVar.b("mode").a(new com.google.android.apps.gsa.shared.util.b.d("sync dispatch", false));
        } else {
            fVar.b("mode").a(new com.google.android.apps.gsa.shared.util.b.d("async dispatch", false));
            fVar.b("events being dispatched").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f1217a.size()), false));
        }
        int i = 1;
        for (ClientEventData clientEventData : this.b) {
            e b = fVar.b(a.dy(i, "pending event id [", "]"));
            ac a3 = ac.a(clientEventData.f1328a.c);
            ac acVar = a3;
            if (a3 == null) {
                acVar = ac.UNKNOWN;
            }
            b.a(new com.google.android.apps.gsa.shared.util.b.d(acVar, false));
            i++;
        }
        int i2 = 1;
        for (ClientEventData clientEventData2 : this.f1217a) {
            e b2 = fVar.b(a.dy(i2, "flushed event id [", "]"));
            ac a4 = ac.a(clientEventData2.f1328a.c);
            ac acVar2 = a4;
            if (a4 == null) {
                acVar2 = ac.UNKNOWN;
            }
            b2.a(new com.google.android.apps.gsa.shared.util.b.d(acVar2, false));
            i2++;
        }
    }
}
