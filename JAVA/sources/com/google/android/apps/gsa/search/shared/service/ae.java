package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.c.hf;
import com.google.android.apps.gsa.search.shared.service.c.hg;
import com.google.common.base.cl;
import com.google.protobuf.ar;
import com.google.protobuf.bc;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/ae.class */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private Parcelable f1331a;
    private boolean b;
    private final bc c;

    public ae(com.google.android.apps.gsa.search.shared.service.c.ac acVar) {
        bc createBuilder = com.google.android.apps.gsa.search.shared.service.c.ad.f1339a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.search.shared.service.c.ad adVar = createBuilder.instance;
        adVar.c = acVar.cr;
        adVar.b |= 1;
        this.c = createBuilder;
    }

    public ae(com.google.android.apps.gsa.search.shared.service.c.ad adVar) {
        this.c = adVar.toBuilder();
    }

    public ae(hf hfVar) {
        bc createBuilder = hg.f1343a.createBuilder();
        createBuilder.copyOnWrite();
        hg hgVar = createBuilder.instance;
        hgVar.c = hfVar.cx;
        hgVar.b |= 1;
        this.c = createBuilder;
    }

    public ae(hg hgVar) {
        this.c = hgVar.toBuilder();
    }

    public final ServiceEventData a() {
        return new ServiceEventData(this.c.build(), this.f1331a);
    }

    public final void b(ar arVar, Object obj) {
        cl.v(!this.b, "Only one extension is allowed.");
        this.c.w(arVar, obj);
        this.b = true;
    }

    public final void c(Parcelable parcelable) {
        cl.v(this.f1331a == null, "Only one parcelable is allowed.");
        EventData.c(parcelable);
        this.f1331a = parcelable;
    }

    public final ClientEventData d() {
        return new ClientEventData(this.c.build(), this.f1331a);
    }

    public final void e(ar arVar, Object obj) {
        cl.v(!this.b, "Only one extension is allowed.");
        this.c.w(arVar, obj);
        this.b = true;
    }

    public final void f(Parcelable parcelable) {
        cl.v(this.f1331a == null, "Only one parcelable is allowed.");
        EventData.c(parcelable);
        this.f1331a = parcelable;
    }
}
