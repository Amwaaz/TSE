package com.google.android.apps.gsa.nga.engine.m.d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.as.j;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.m.d;
import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.shared.android.i;
import com.google.android.apps.gsa.nga.shared.android.l;
import com.google.android.apps.gsa.nga.shared.android.m;
import com.google.android.apps.gsa.nga.shared.u.e.a.o;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fg;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/m/d/ab.class */
public final class ab extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f621a = com.google.common.f.a.d.j();
    public final h b;
    public final g c;
    public final com.google.android.apps.gsa.nga.engine.n.e.ac d;
    private final Context e;
    private final m f;
    private final a g;
    private final j h;
    private final com.google.android.apps.gsa.nga.engine.as.d i;
    private final com.google.android.apps.gsa.nga.engine.v.a.j j;
    private final y k;

    public ab(g gVar, Context context, a aVar, com.google.android.apps.gsa.nga.engine.v.a.j jVar, com.google.android.apps.gsa.nga.engine.n.e.ac acVar, j jVar2, com.google.android.apps.gsa.nga.engine.as.d dVar, h hVar, y yVar, n nVar) {
        super(nVar);
        this.e = context;
        this.c = gVar;
        this.j = jVar;
        this.g = aVar;
        this.h = jVar2;
        this.d = acVar;
        this.i = dVar;
        this.b = hVar;
        this.k = yVar;
        this.f = new m(new l() { // from class: com.google.android.apps.gsa.nga.engine.m.d.v
            @Override // com.google.android.apps.gsa.nga.shared.android.l
            public final void a(Intent intent) {
                i.b(intent).ifPresent(new w(0));
            }
        }, aVar, eu.bQ);
    }

    @Override // com.google.android.apps.gsa.nga.engine.m.d
    public final Intent a() {
        return i.a(this, new w(2)).setAction("com.google.android.apps.googlequicksearchbox.nga.action.REPORT_FEEDBACK").setPackage(this.e.getPackageName());
    }

    @Override // com.google.android.apps.gsa.nga.engine.m.d
    public final void c(o oVar) {
        ba createBuilder = com.google.android.apps.gsa.nga.shared.u.a.a.createBuilder();
        String str = oVar.b;
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.a aVar = createBuilder.instance;
        str.getClass();
        aVar.b |= 1;
        aVar.c = str;
        String h = this.j.h();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.nga.shared.u.a aVar2 = createBuilder.instance;
        h.getClass();
        aVar2.b |= 512;
        aVar2.d = h;
        com.google.android.apps.gsa.nga.shared.u.a build = createBuilder.build();
        fg fgVar = new fg(4);
        if (this.g.i(eu.iU)) {
            fgVar.i(this.i.a());
        }
        new ae(this.b.l(this.h.b(), "[NGA] take shared answer card screenshot", new aa(this)), this.b, "[NGA] FeedbackExecution.takeScreenshot").a(new y(this, fgVar, build, 1)).a(new y(this, build, fgVar, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.k.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        androidx.core.content.a.f(this.e, this.f, new IntentFilter("com.google.android.apps.googlequicksearchbox.nga.action.REPORT_FEEDBACK"), null, 2);
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        this.e.unregisterReceiver(this.f);
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "FeedbackExecution";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 18;
    }
}
