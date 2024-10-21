package com.google.android.apps.gsa.l.g;

import com.google.android.apps.gsa.l.e.c;
import com.google.android.apps.gsa.tasks.ar;
import com.google.android.apps.gsa.tasks.s;
import com.google.android.apps.gsa.tasks.u;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.protobuf.ba;
import com.google.protobuf.bc;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/g/h.class */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final d f367a = d.j();
    private final com.google.android.apps.gsa.tasks.m b;

    public h(com.google.android.apps.gsa.tasks.m mVar) {
        this.b = mVar;
    }

    public static final fl b(v vVar) {
        switch (vVar.ordinal()) {
            case 3:
                return fl.p(ar.GELLER_ASSISTANT_ACTION_HISTORY_SYNC_TASK);
            case 5:
            case 15:
            case 20:
            case 22:
            case 52:
            case 68:
            case 69:
            case 70:
            case 74:
            case 75:
            case 158:
            case 180:
            case 184:
            case 209:
                return fl.p(ar.GELLER_OPA_REFRESH_TASK);
            case 9:
            case 45:
            case 71:
                return fl.p(ar.GELLER_REFRESH_TASK);
            case 53:
                return fl.p(ar.GELLER_CHALKBOARD_REFRESH_TASK);
            case 66:
                return fl.p(ar.GELLER_FOOTPRINTS_FALSE_ACCEPT_UPLOAD_TASK);
            case 179:
                return fl.p(ar.GELLER_PKG_ENTITIES_REFRESH_TASK);
            case 187:
                return fl.q(ar.GELLER_CORE_REFRESH_TASK, ar.GELLER_CORE_RELAXED_REFRESH_TASK);
            default:
                com.google.common.f.a.a e = f367a.e();
                e.ak(1991);
                e.p("Unsupported corpus type. No synchronization will be done.");
                int i = fl.e;
                return ni.a;
        }
    }

    public final boolean a(String str, v vVar) {
        fl b = b(vVar);
        if (b.isEmpty()) {
            com.google.common.f.a.a d = f367a.d();
            d.ak(1992);
            d.s("[Geller]Unable to find task name for %s", vVar.name());
            return false;
        }
        ba createBuilder = s.a.createBuilder();
        createBuilder.copyOnWrite();
        s sVar = createBuilder.instance;
        sVar.e = 1;
        sVar.b |= 4;
        bc createBuilder2 = u.a.createBuilder();
        bg bgVar = com.google.android.apps.gsa.l.e.d.a;
        ba createBuilder3 = c.c.createBuilder();
        createBuilder3.copyOnWrite();
        c cVar = createBuilder3.instance;
        str.getClass();
        cb cbVar = cVar.e;
        if (!cbVar.c()) {
            cVar.e = bi.mutableCopy(cbVar);
        }
        cVar.e.add(str);
        createBuilder3.copyOnWrite();
        c cVar2 = createBuilder3.instance;
        cVar2.i = 4;
        cVar2.d = 4 | cVar2.d;
        createBuilder3.copyOnWrite();
        c cVar3 = createBuilder3.instance;
        cVar3.d |= 2;
        cVar3.h = "agsa";
        createBuilder3.ba(vVar);
        createBuilder2.w(bgVar, createBuilder3.build());
        createBuilder.copyOnWrite();
        s sVar2 = createBuilder.instance;
        u build = createBuilder2.build();
        build.getClass();
        sVar2.h = build;
        sVar2.b |= 32;
        s build2 = createBuilder.build();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.b.f((ar) b.get(i), build2);
        }
        return true;
    }
}
