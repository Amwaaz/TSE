package com.google.android.apps.gsa.assistant.shared.j;

import com.google.android.apps.gsa.assistant.shared.j.a.c;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import com.google.android.apps.gsa.shared.util.h.a;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.base.ah;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/j/o.class */
public final class o {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final cg f279a;

    static {
        Duration.ofHours(12L);
    }

    public o(cg cgVar) {
        this.f279a = cgVar;
    }

    public final cn a(final String str) {
        ab abVar = e.a;
        cn g = com.google.common.util.concurrent.i.g(this.f279a.d(), new ah(str) { // from class: com.google.android.apps.gsa.assistant.shared.j.j

            /* renamed from: a, reason: collision with root package name */
            public final String f276a;

            {
                this.f276a = str;
            }

            public final Object apply(Object obj) {
                c cVar = (c) obj;
                m mVar = new m();
                mVar.d(0);
                mVar.f(0);
                mVar.a(0);
                mVar.g(0L);
                mVar.c(0);
                mVar.h(true);
                mVar.b(0L);
                mVar.e(0);
                mVar.g(cVar.d);
                mVar.c(cVar.e);
                mVar.h(cVar.f);
                mVar.b(cVar.g);
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(cVar.c);
                mVar.e(Collection._EL.stream(unmodifiableMap.values()).mapToInt(new g()).sum());
                com.google.android.apps.gsa.assistant.shared.j.a.e eVar = (com.google.android.apps.gsa.assistant.shared.j.a.e) unmodifiableMap.get(Integer.toString(a.a(this.f276a)));
                if (eVar != null) {
                    mVar.d(eVar.d);
                    mVar.f(eVar.c);
                    mVar.a(eVar.e);
                }
                if (mVar.i == -1) {
                    return new n(mVar.f277a, mVar.b, mVar.c, mVar.d, mVar.e, mVar.f, mVar.g, mVar.h);
                }
                StringBuilder sb = new StringBuilder();
                if ((mVar.i & 1) == 0) {
                    sb.append(" nudgeUiCount");
                }
                if ((mVar.i & 2) == 0) {
                    sb.append(" suggestionShownCount");
                }
                if ((mVar.i & 4) == 0) {
                    sb.append(" appLaunchCount");
                }
                if ((mVar.i & 8) == 0) {
                    sb.append(" timeStampWhenNudgeWasShownInEpochSec");
                }
                if ((mVar.i & 16) == 0) {
                    sb.append(" lockScreenEntryPointDismissCount");
                }
                if ((mVar.i & 32) == 0) {
                    sb.append(" wasAssistantEverActivated");
                }
                if ((mVar.i & 64) == 0) {
                    sb.append(" lastLockScreenAppFlowTimestampInEpochSec");
                }
                if ((mVar.i & 128) == 0) {
                    sb.append(" nudgeUiCountOverAllApps");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }, ay.a);
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        return g;
    }

    public final cn b(String str) {
        ab abVar = e.a;
        return com.google.android.apps.gsa.v.c.b(this.f279a.a(new f(str, 2), ay.a));
    }
}
