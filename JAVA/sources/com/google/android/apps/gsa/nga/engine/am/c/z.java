package com.google.android.apps.gsa.nga.engine.am.c;

import com.google.android.apps.gsa.nga.shared.aa.a.m;
import com.google.android.apps.gsa.nga.shared.aa.f;
import com.google.android.apps.gsa.nga.shared.aa.g;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.u.e.a.as;
import com.google.android.apps.gsa.shared.k.t;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.g.b.a.a.a.s;
import com.google.g.b.a.a.a.u;
import io.grpc.i;
import io.grpc.j.n;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/am/c/z.class */
public class z implements g, f {
    private static final j e = j.i("com.google.android.apps.gsa.nga.engine.am.c.z");

    /* renamed from: a, reason: collision with root package name */
    public final a f458a;
    public final b b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final com.google.android.apps.gsa.nga.engine.n.e.a d;
    private final h f;
    private final s g;

    public z(a aVar, b bVar, h hVar, com.google.android.apps.gsa.nga.engine.n.e.a aVar2, s sVar) {
        this.f458a = aVar;
        this.b = bVar;
        this.f = hVar;
        this.d = aVar2;
        this.g = sVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final cn a(Locale locale) {
        if (!this.f458a.i(t.f1456a)) {
            int i = fl.e;
            return dl.n(ni.a);
        }
        s sVar = this.g;
        i iVar = ((io.grpc.j.e) sVar).a;
        return com.google.common.util.concurrent.i.g(n.a(iVar.a(u.a(), ((io.grpc.j.e) sVar).b), com.google.g.b.a.a.a.b.a), new y(this, locale), ay.a);
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.f
    public final cn b(m mVar, as asVar, ah ahVar) {
        com.google.common.f.h d = e.d();
        d.ak(4262);
        d.p("Opening Dora");
        return this.f.b("[NGA] updatesCenterSuggestionProvider.onSuggestionClicked", new j(this, 3));
    }

    @Override // com.google.android.apps.gsa.nga.shared.aa.g
    public final String c() {
        return "UpdatesCenterSuggestionProvider";
    }
}
