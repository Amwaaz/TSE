package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.d.a.d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ak;
import com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.q;
import com.google.android.libraries.assistant.auto.tng.morris.h.f;
import com.google.common.b.fu;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.f.j;
import java.util.Map;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/morris2/framework/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1783a = j.i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.g");
    public ha b = nr.a;
    private gy c;
    private a d;
    private final a e;

    public g(d dVar, b bVar, Map map, f fVar, a aVar, q qVar, a aVar2, c cVar, ak akVar) {
        gy gyVar = new gy();
        gyVar.h(dVar);
        gyVar.h(bVar);
        gyVar.h(fVar);
        gyVar.j(((fu) map).g());
        gyVar.h(qVar);
        gyVar.h(cVar);
        gyVar.h(akVar);
        this.c = gyVar;
        this.e = aVar2;
        this.d = aVar;
    }

    public final void a() {
        if (this.b.isEmpty()) {
            gy gyVar = this.c;
            gyVar.getClass();
            a aVar = this.d;
            aVar.getClass();
            gyVar.j(((Map) aVar.a()).values());
            gyVar.h((com.google.android.libraries.assistant.auto.tng.morris.framework.d) this.e.a());
            this.b = gyVar.g();
            this.c = null;
            this.d = null;
        }
    }
}
