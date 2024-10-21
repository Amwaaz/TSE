package com.google.android.apps.gsa.nga.engine.education.pie.b;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.shared.n.e;
import com.google.android.apps.gsa.shared.proto.io.ProtoLiteParcelable;
import com.google.common.f.a.a;
import com.google.common.f.a.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/b/y.class */
public final class y {
    private static final d b = d.j();

    /* renamed from: a, reason: collision with root package name */
    public final e f589a;

    public y(com.google.android.libraries.gsa.h.h hVar) {
        this.f589a = new e(hVar, new w(0), new x(0));
    }

    public final void a(ProtoLiteParcelable protoLiteParcelable) {
        try {
            com.google.android.apps.gsa.nga.shared.u.d.a.x d = protoLiteParcelable.d(com.google.android.apps.gsa.nga.shared.u.d.a.x.a.getParserForType());
            if (d != null) {
                this.f589a.a(d);
                return;
            }
            a e = b.e();
            e.ak(3019);
            e.p("Request proto missing");
        } catch (Exception e2) {
            aus.f(b.e(), "Error parsing request", (char) 3020, e2);
        }
    }
}
