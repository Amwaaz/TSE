package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/ClientEventData.class */
public class ClientEventData extends EventData {
    public static final Parcelable.Creator CREATOR = new c(2);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.search.shared.service.c.ad f1328a;

    public ClientEventData(com.google.android.apps.gsa.search.shared.service.c.ad adVar, Parcelable parcelable) {
        super(parcelable);
        this.f1328a = adVar;
    }

    @Override // com.google.android.apps.gsa.search.shared.service.EventData
    public final byte[] a() {
        return this.f1328a.toByteArray();
    }
}
