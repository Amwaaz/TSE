package com.google.android.apps.gsa.search.core.service.d;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/d/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public ClientConfig f1163a;

    public final ClientConfig a() {
        ClientConfig clientConfig = this.f1163a;
        if (clientConfig != null) {
            return clientConfig;
        }
        throw new IllegalStateException("No client has been attached to this session.");
    }
}
