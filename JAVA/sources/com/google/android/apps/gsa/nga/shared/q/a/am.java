package com.google.android.apps.gsa.nga.shared.q.a;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.shared.q.c.ed;
import com.google.android.apps.gsa.shared.util.as;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/am.class */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    public final Object f976a;
    public final Object b;
    public final Object c;

    public am(af afVar, x xVar, com.google.android.libraries.gsa.h.h hVar) {
        this.b = afVar;
        this.c = xVar;
        this.f976a = hVar;
    }

    public am(a aVar, Context context, com.google.android.apps.gsa.shared.o.a.a aVar2) {
        this.c = aVar;
        this.b = as.b(context);
        this.f976a = aVar2.a();
    }

    public final void a(int i) {
        c(i, 0, 1);
    }

    public final void b(int i, int i2, int i3) {
        String str;
        String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? "CANCELLED" : "FAILURE" : "SUCCESS" : "TRIGGERED";
        int ba = a.a.ba(i);
        switch (ba) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "ASSIST_INTERACTION_SESSION_STARTER__START_SESSION";
                break;
            case 3:
                str = "NGA_REMOTE_VIS__SEND_VIS_EVENT_OR_FINISH";
                break;
            case 4:
                str = "NGA_REMOTE_VIS__ON_SHOW";
                break;
            case 5:
                str = "NGA_REMOTE_VIS__ON_CREATE";
                break;
            case 6:
                str = "NGA_VIS_ON_CREATE";
                break;
            case 7:
                str = "NGA_VIS_ON_SHOW";
                break;
            case 8:
                str = "NGA_VIS_SERVICE_ON_BIND";
                break;
            case 9:
                str = "NGA_VIS_SERVICE_START_IN_PROCESS_SESSION";
                break;
            case 10:
                str = "NGA_VIS_SERVICE_START_REMOTE_SESSION";
                break;
            case 11:
                str = "NGA_TRIGGER";
                break;
            case 12:
                str = "UI_SHOW_OBSERVER";
                break;
            case 13:
                str = "GSA_VIS_ON_CREATE";
                break;
            case 14:
                str = "GSA_VIS_ON_BIND";
                break;
            case 15:
                str = "GSA_VIS_ON_DESTROY";
                break;
            case 16:
                str = "GSA_VIS_ON_START_SESSION";
                break;
            default:
                str = "null";
                break;
        }
        if (ba == 0) {
            throw null;
        }
        String name = c.a(i2).name();
        if (name == null) {
            throw new NullPointerException("Null triggerType");
        }
        ((x) this.c).b(new ed("NGA_TRIGGERING", str, name, str2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.libraries.gsa.h.h] */
    public final void c(int i, int i2, int i3) {
        this.f976a.n("[NGA] logTriggeringEvent", new al(this, i, i2, i3));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.libraries.gsa.h.h] */
    public final void d(int i, int i2, String str) {
        this.f976a.n("[NGA] logTriggeringEvent", new ak(this, i, i2, str));
    }
}
