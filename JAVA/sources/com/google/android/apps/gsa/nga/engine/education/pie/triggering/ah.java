package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.b.y;
import com.google.android.apps.gsa.nga.shared.u.d.a.an;
import com.google.android.apps.gsa.nga.shared.u.d.a.u;
import com.google.android.apps.gsa.nga.shared.u.d.a.x;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.v.c;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/ah.class */
public final class ah implements com.google.android.apps.gsa.nga.engine.education.pie.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f596a;
    private final y b;

    public ah(y yVar, a aVar) {
        this.b = yVar;
        this.f596a = aVar;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final cn a() {
        if (this.f596a.i(eu.gg)) {
            y yVar = this.b;
            ba createBuilder = x.a.createBuilder();
            ba createBuilder2 = an.a.createBuilder();
            u uVar = u.a;
            createBuilder2.copyOnWrite();
            an anVar = createBuilder2.instance;
            uVar.getClass();
            anVar.c = uVar;
            anVar.b = 1;
            createBuilder.copyOnWrite();
            x xVar = createBuilder.instance;
            an build = createBuilder2.build();
            build.getClass();
            xVar.c = build;
            xVar.b = 8;
            yVar.a(new ProtoLiteParcelable(createBuilder.build()));
        }
        return c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.education.pie.d.b
    public final void hd() {
    }
}
