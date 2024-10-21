package com.google.android.apps.gsa.nga.engine.ae.a;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.f;
import com.google.android.apps.gsa.nga.shared.ak.e;
import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.shared.util.c.be;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ae/a/i.class */
public final class i extends f implements AppOpsManager.OnOpChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public static final d f401a = d.j();
    public final e b;
    public final com.google.android.apps.gsa.nga.shared.s.e c;
    public final Context d;
    public final ActivityManager e;
    public final AppOpsManager f;
    public Class g;
    public Object h;
    private final h i;

    public i(Context context, h hVar, e eVar, final com.google.android.apps.gsa.nga.engine.g.a.f fVar, final af afVar, final a aVar, y yVar, n nVar) {
        super(nVar, yVar);
        com.google.android.apps.gsa.nga.shared.s.i iVar = new com.google.android.apps.gsa.nga.shared.s.i(Optional.empty(), com.google.android.apps.gsa.nga.engine.b.e.a.class);
        this.c = iVar;
        this.d = context;
        this.i = hVar;
        this.b = eVar;
        this.e = (ActivityManager) context.getSystemService(ActivityManager.class);
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        appOpsManager.getClass();
        this.f = appOpsManager;
        iVar.d(new be(fVar, afVar, aVar) { // from class: com.google.android.apps.gsa.nga.engine.ae.a.g

            /* renamed from: a, reason: collision with root package name */
            public final a f400a;
            public final com.google.android.apps.gsa.nga.engine.g.a.f b;
            public final af c;

            {
                this.b = fVar;
                this.c = afVar;
                this.f400a = aVar;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.be
            public final void hf(Object obj) {
                Optional optional = (Optional) obj;
                d dVar = i.f401a;
                optional.ifPresent(new c(this.c, 1));
                Collection._EL.stream((Set) this.f400a.a()).forEach(new c(optional, 0));
            }
        });
    }

    public final com.google.android.apps.gsa.nga.engine.ae.a a(String str) {
        return str == null ? com.google.android.apps.gsa.nga.engine.ae.a.a : (com.google.android.apps.gsa.nga.engine.ae.a) this.b.d().map(new d(str)).orElse(com.google.android.apps.gsa.nga.engine.ae.a.a);
    }

    public final Optional c() {
        return f().map(new e(2));
    }

    public final Optional e() {
        return f().map(new e(1));
    }

    public final Optional f() {
        Optional c = e.c(this.b.e());
        c.map(new e(0)).orElse("");
        if (!((Optional) ((com.google.android.apps.gsa.nga.shared.s.i) this.c).b.get()).equals(c)) {
            j(c);
        }
        return c;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        return this.i.a("[NGA] AppForegroundListenerImpl.init", new h(this, 0));
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        return this.i.a("[NGA] AppForegroundListenerImpl.onNgaDestroy", new h(this, 1));
    }

    public final void j(Optional optional) {
        this.i.n("[NGA] RefreshForegroundComponentName", new f(this, optional));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "AppForegroundListenerImpl";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 35;
    }

    @Override // android.app.AppOpsManager.OnOpChangedListener
    public final void onOpChanged(String str, String str2) {
        S();
    }
}
