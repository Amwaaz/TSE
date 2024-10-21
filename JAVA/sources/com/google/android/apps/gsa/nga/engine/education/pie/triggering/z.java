package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.b.ak;
import com.google.android.apps.gsa.nga.engine.education.pie.b.v;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.libraries.g.a;
import com.google.au.a.a.c;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/z.class */
public final class z implements com.google.android.apps.gsa.nga.engine.education.pie.d.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.a.d f608a = com.google.common.f.a.d.j();
    public final com.google.android.apps.gsa.nga.engine.education.pie.d b;
    public final com.google.android.apps.gsa.nga.shared.p.b c;
    public final a d;
    public final v e;
    public final ak f;
    public final y g;
    private final com.google.android.apps.gsa.nga.engine.education.pie.b.y h;

    public z(v vVar, ak akVar, com.google.android.apps.gsa.nga.engine.education.pie.b.y yVar, com.google.android.apps.gsa.nga.engine.education.pie.d dVar, com.google.android.apps.gsa.nga.shared.p.b bVar, y yVar2, a aVar) {
        this.e = vVar;
        this.f = akVar;
        this.h = yVar;
        this.c = bVar;
        this.g = yVar2;
        this.b = dVar;
        this.d = aVar;
    }

    public static com.google.au.a.a.a c(String str, Bundle bundle) {
        String uri = new Intent(str).putExtras(bundle).putExtra("NGA_PIE", true).toUri(0);
        c createBuilder = com.google.au.a.a.a.a.createBuilder();
        createBuilder.t(uri);
        return createBuilder.build();
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        this.h.f589a.b(new x(this));
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
        this.h.f589a.c(new x(this));
    }
}
