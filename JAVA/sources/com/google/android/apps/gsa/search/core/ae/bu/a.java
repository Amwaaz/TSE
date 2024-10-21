package com.google.android.apps.gsa.search.core.ae.bu;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bu/a.class */
public interface a {
    cn a(ClientConfig clientConfig, int i, Query query, long j, boolean z);

    void b(int i, Query query, long j);

    void c();
}
