package com.google.android.apps.gsa.search.core.ae.aq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.core.m.w;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.shared.aq.b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.i.a.i;
import com.google.common.base.at;
import com.google.common.util.concurrent.cn;
import com.google.g.e.e.a.d;
import com.google.g.e.i.bx;
import com.google.g.e.i.lq;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aq/f.class */
public interface f {
    void A(Intent intent);

    void B(ServiceEventData serviceEventData);

    void C(boolean z, boolean z2, boolean z3);

    void D(Bundle bundle, boolean z);

    void E(byte[] bArr);

    void F(v vVar);

    void G(int i);

    void H(d dVar);

    void I(int i, int i2, lq lqVar, int i3);

    cn a(w wVar, b bVar, c cVar);

    cn c(Intent intent);

    cn d(byte[] bArr);

    cn f(Intent intent);

    cn g(at atVar, Query query, cn cnVar, com.google.android.apps.gsa.search.core.l.f fVar);

    cn h();

    cn i(byte[] bArr);

    cn j(Bundle bundle);

    cn k(Intent intent);

    cn l(Intent intent);

    cn m(cn cnVar);

    void n(byte[] bArr);

    void o(Uri uri, String str);

    void p(Intent intent);

    void q(com.google.android.libraries.search.i.a.b.b bVar, i iVar, boolean z);

    void r();

    void s();

    void t(long j);

    void u(bx bxVar);

    void v();

    void w(d dVar, Query query);

    void x(Intent intent);

    void y(Intent intent);

    void z(Intent intent);
}
