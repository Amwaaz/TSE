package com.google.android.apps.gsa.search.core.ae.an;

import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.b.fl;
import com.google.common.util.concurrent.cn;
import com.google.protos.o.b.ad;
import com.google.protos.o.b.bi;
import com.google.protos.o.b.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/an/a.class */
public interface a {
    cn a(bi biVar, String str);

    cn b(Query query, c cVar, ClientConfig clientConfig);

    cn c(String str, int i);

    cn d(v vVar, ad adVar, boolean z);

    void f(com.google.android.apps.gsa.nga.shared.u.a aVar, fl flVar);
}
