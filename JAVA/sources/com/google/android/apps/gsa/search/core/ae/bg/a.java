package com.google.android.apps.gsa.search.core.ae.bg;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.c.iv;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.ap.g.a.ae;
import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/bg/a.class */
public interface a {
    cn a(Query query);

    cn c(Query query, ae aeVar);

    cn f(Suggestion suggestion);

    cn g(long j, boolean z, Bundle bundle);

    cn h();

    cn i(long j);

    void j(int i);

    void k();

    void l();

    void m(Response response, iv ivVar, Query query);

    void n(Query query, boolean z);

    void o();

    void p(ClientConfig clientConfig, String str);

    void q(Bundle bundle);

    void r(Query query, int i, Query query2, Query query3);
}
