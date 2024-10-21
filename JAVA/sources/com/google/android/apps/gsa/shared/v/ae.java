package com.google.android.apps.gsa.shared.v;

import com.google.android.apps.gsa.shared.util.debug.a.a;
import com.google.android.apps.gsa.shared.util.debug.a.k;
import com.google.common.util.concurrent.cn;
import io.grpc.cx;
import java.io.File;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/v/ae.class */
public interface ae extends k, a {
    @Deprecated
    d a();

    m b(r rVar);

    cn e(String str, int i, int i2);

    @Deprecated
    cn f(am amVar, t tVar, m mVar);

    @Deprecated
    cn g(am amVar, t tVar, m mVar);

    cn h(int i);

    void i(File file);

    void j();

    m k(int i, r rVar, com.google.android.apps.gsa.shared.aq.d.d dVar, com.google.android.apps.gsa.shared.aq.f.a aVar);

    @Deprecated
    cn l(String str, int i, cx cxVar, String str2, int i2);
}
