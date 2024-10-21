package com.google.android.apps.gsa.search.core.state.d;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.c.bo;
import com.google.android.apps.gsa.search.shared.service.c.bp;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/state/d/w.class */
public class w extends com.google.android.apps.gsa.search.core.state.ae {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.f.j f1296a = com.google.common.f.j.i("com.google.android.apps.gsa.search.core.state.d.w");
    private final Map b;
    private final Queue c;

    public w(e.a aVar) {
        super(aVar, 3);
        this.b = new HashMap();
        this.c = new ArrayDeque();
    }

    private final void f(ActionData actionData, int i) {
        synchronized (this) {
            Integer num = (Integer) this.b.get(actionData);
            if (num != null) {
                int intValue = num.intValue();
                int i2 = i | intValue;
                if (i2 != intValue) {
                    this.b.put(actionData, Integer.valueOf(i2));
                    return;
                }
                return;
            }
            this.c.add(actionData);
            if (this.c.size() > 50) {
                this.b.remove((ActionData) this.c.remove());
            }
            this.b.put(actionData, Integer.valueOf(i));
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final com.google.android.apps.gsa.search.shared.service.c.ac[] ab() {
        return new com.google.android.apps.gsa.search.shared.service.c.ac[]{com.google.android.apps.gsa.search.shared.service.c.ac.SET_GWS_LOGGABLE_EVENT, com.google.android.apps.gsa.search.shared.service.c.ac.SUPPRESS_GWS_LOGGABLE_EVENT};
    }

    public final void c(ActionData actionData, int i) {
        if (i == 4096) {
            f(actionData, 4096);
        } else if (actionData.k()) {
            androidx.compose.ui.l.f.e((i & 4095) != 0);
            androidx.compose.ui.l.f.e((i & (-4096)) == 0);
            f(actionData, i);
        }
    }

    @Override // com.google.android.apps.gsa.search.core.state.cq
    public final void hL(long j, ClientEventData clientEventData) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(bo.a);
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = clientEventData.f1328a;
        adVar.d(bgVar);
        if (!((bd) adVar).br.o(bgVar.d)) {
            com.google.common.f.h f = f1296a.f();
            f.ak(7969);
            f.p("Expected GwsLoggableEventData extension.");
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
            return;
        }
        com.google.android.apps.gsa.search.shared.service.c.ad adVar2 = clientEventData.f1328a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(bo.a);
        adVar2.d(bgVar2);
        Object l = ((bd) adVar2).br.l(bgVar2.d);
        int i2 = ((bp) (l == null ? bgVar2.b : bgVar2.c(l))).c;
        try {
            ActionData actionData = (ActionData) clientEventData.b(ActionData.class);
            com.google.android.apps.gsa.search.shared.service.c.ac a2 = com.google.android.apps.gsa.search.shared.service.c.ac.a(clientEventData.f1328a.c);
            com.google.android.apps.gsa.search.shared.service.c.ac acVar = a2;
            if (a2 == null) {
                acVar = com.google.android.apps.gsa.search.shared.service.c.ac.UNKNOWN;
            }
            int ordinal = acVar.ordinal();
            if (ordinal == 16) {
                c(actionData, i2);
                return;
            }
            if (ordinal == 17 && actionData.k()) {
                int i3 = i2 & 4095;
                androidx.compose.ui.l.f.e(i3 != 0);
                androidx.compose.ui.l.f.e((i2 & (-4096)) == 0);
                f(actionData, i3 << 16);
            }
        } catch (Exception e) {
            com.google.common.f.h f2 = f1296a.f();
            f2.ak(7968);
            f2.p("GwsLoggableEventData did not contain ActionData");
            int i4 = com.google.android.apps.gsa.shared.util.b.h.a;
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
    }
}
