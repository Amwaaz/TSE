package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.c.hg;
import com.google.protobuf.ar;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/ServiceEventData.class */
public class ServiceEventData extends EventData {
    public static final Parcelable.Creator CREATOR = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final hg f1330a;

    public ServiceEventData(hg hgVar, Parcelable parcelable) {
        super(parcelable);
        this.f1330a = hgVar;
    }

    @Override // com.google.android.apps.gsa.search.shared.service.EventData
    public final byte[] a() {
        return this.f1330a.toByteArray();
    }

    public final Object e(ar arVar) {
        hg hgVar = this.f1330a;
        bg bgVar = bi.-$$Nest$smcheckIsLite(arVar);
        hgVar.d(bgVar);
        androidx.compose.ui.l.f.e(((bd) hgVar).br.o(bgVar.d));
        hg hgVar2 = this.f1330a;
        bg bgVar2 = bi.-$$Nest$smcheckIsLite(arVar);
        hgVar2.d(bgVar2);
        Object l = ((bd) hgVar2).br.l(bgVar2.d);
        return l == null ? bgVar2.b : bgVar2.c(l);
    }
}
