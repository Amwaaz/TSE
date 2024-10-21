package com.google.android.apps.gsa.nga.engine.ui.e.h.e;

import com.google.android.apps.gsa.assistant.shared.k.c;
import com.google.android.apps.gsa.nga.shared.aa.a.f;
import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.nga.shared.u.e.a.u;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.ha;
import com.google.protobuf.ba;
import java.util.concurrent.Executor;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/e/j.class */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ha f749a = ha.u(c.DIAG_SWIPE_GESTURE, c.LONG_PRESS_HOME, c.LONG_PRESS_POWER_BUTTON, c.HARDWARE_BUTTON);
    public final h b;
    public final com.google.android.apps.gsa.nga.shared.p.b c;
    public final Executor d;
    public final com.google.android.apps.gsa.shared.util.q.a e;
    public final b f;

    public j(final h hVar, com.google.android.apps.gsa.nga.shared.p.b bVar, com.google.android.apps.gsa.shared.util.q.a aVar, b bVar2) {
        this.b = hVar;
        this.c = bVar;
        this.d = new Executor(hVar) { // from class: com.google.android.apps.gsa.nga.engine.ui.e.h.e.d

            /* renamed from: a, reason: collision with root package name */
            public final h f748a;

            {
                this.f748a = hVar;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ha haVar = j.f749a;
                runnable.getClass();
                this.f748a.n("[NGA] TactileChipsProvider", new i(runnable));
            }
        };
        this.e = aVar;
        this.f = bVar2;
    }

    public static f a(m mVar) {
        ba createBuilder = f.a.createBuilder();
        ba createBuilder2 = com.google.android.apps.gsa.nga.shared.u.e.h.a.createBuilder();
        ba createBuilder3 = com.google.android.apps.gsa.nga.shared.u.e.c.a.createBuilder();
        ba createBuilder4 = u.a.createBuilder();
        ba createBuilder5 = as.a.createBuilder();
        createBuilder5.copyOnWrite();
        createBuilder5.instance.c = mVar.getNumber();
        createBuilder4.copyOnWrite();
        u uVar = createBuilder4.instance;
        as build = createBuilder5.build();
        build.getClass();
        uVar.c = build;
        uVar.b = 22;
        createBuilder3.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.e.c cVar = createBuilder3.instance;
        u build2 = createBuilder4.build();
        build2.getClass();
        cVar.c = build2;
        cVar.b = 2;
        createBuilder2.cD(createBuilder3);
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        com.google.android.apps.gsa.nga.shared.u.e.h build3 = createBuilder2.build();
        build3.getClass();
        fVar.c = build3;
        fVar.b = 8;
        return createBuilder.build();
    }
}
