package com.google.android.apps.gsa.search.core.ae.aq.b;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.ae.aq.f;
import com.google.android.apps.gsa.search.core.ae.bw.c;
import com.google.android.apps.gsa.search.core.m.w;
import com.google.android.apps.gsa.search.core.service.e.a.h;
import com.google.android.apps.gsa.search.core.service.e.g;
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
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ae/aq/b/ao.class */
public final class ao implements f {

    /* renamed from: a, reason: collision with root package name */
    private final a f1066a;

    public ao(a aVar) {
        this.f1066a = aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void A(Intent intent) {
        ((h) this.f1066a.a()).c(new ai(intent));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void B(ServiceEventData serviceEventData) {
        ((h) this.f1066a.a()).c(new as(serviceEventData));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void C(boolean z, boolean z2, boolean z3) {
        ((h) this.f1066a.a()).c(new au(z, z2, z3));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void D(Bundle bundle, boolean z) {
        ((h) this.f1066a.a()).c(new ax(bundle));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void E(byte[] bArr) {
        ((h) this.f1066a.a()).c(new be(bArr));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void F(v vVar) {
        ((h) this.f1066a.a()).c(new bf(vVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void G(int i) {
        ((h) this.f1066a.a()).c(new bg(i));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void H(d dVar) {
        ((h) this.f1066a.a()).c(new bi(dVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void I(int i, int i2, lq lqVar, int i3) {
        ((h) this.f1066a.a()).c(new bc(i, i2, lqVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn a(w wVar, b bVar, c cVar) {
        g aVar = new a(wVar, bVar, cVar);
        ((h) this.f1066a.a()).c(aVar);
        return aVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn c(Intent intent) {
        g gVar = new g(intent);
        ((h) this.f1066a.a()).c(gVar);
        return gVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn d(byte[] bArr) {
        g iVar = new i(bArr);
        ((h) this.f1066a.a()).c(iVar);
        return iVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn f(Intent intent) {
        g jVar = new j(intent);
        ((h) this.f1066a.a()).c(jVar);
        return jVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn g(at atVar, Query query, cn cnVar, com.google.android.apps.gsa.search.core.l.f fVar) {
        g nVar = new n(atVar, query, cnVar, fVar);
        ((h) this.f1066a.a()).c(nVar);
        return nVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn h() {
        g arVar = new ar();
        ((h) this.f1066a.a()).c(arVar);
        return arVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn i(byte[] bArr) {
        g avVar = new av(bArr);
        ((h) this.f1066a.a()).c(avVar);
        return avVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn j(Bundle bundle) {
        g ayVar = new ay(bundle);
        ((h) this.f1066a.a()).c(ayVar);
        return ayVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn k(Intent intent) {
        g bbVar = new bb(intent);
        ((h) this.f1066a.a()).c(bbVar);
        return bbVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn l(Intent intent) {
        g bdVar = new bd(intent);
        ((h) this.f1066a.a()).c(bdVar);
        return bdVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final cn m(cn cnVar) {
        g bhVar = new bh(cnVar);
        ((h) this.f1066a.a()).c(bhVar);
        return bhVar;
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void n(byte[] bArr) {
        ((h) this.f1066a.a()).c(new l(bArr));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void o(Uri uri, String str) {
        ((h) this.f1066a.a()).c(new m(uri, str));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void p(Intent intent) {
        ((h) this.f1066a.a()).c(new o(intent));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void q(com.google.android.libraries.search.i.a.b.b bVar, i iVar, boolean z) {
        ((h) this.f1066a.a()).c(new q(bVar, iVar, z));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void r() {
        ((h) this.f1066a.a()).c(new v());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void s() {
        ((h) this.f1066a.a()).c(new x());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void t(long j) {
        ((h) this.f1066a.a()).c(new y(j));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void u(bx bxVar) {
        ((h) this.f1066a.a()).c(new ab(bxVar));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void v() {
        ((h) this.f1066a.a()).c(new ac());
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void w(d dVar, Query query) {
        ((h) this.f1066a.a()).c(new ae(dVar, query));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void x(Intent intent) {
        ((h) this.f1066a.a()).c(new af(intent));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void y(Intent intent) {
        ((h) this.f1066a.a()).c(new ag(intent));
    }

    @Override // com.google.android.apps.gsa.search.core.ae.aq.f
    public final void z(Intent intent) {
        ((h) this.f1066a.a()).c(new ah(intent));
    }
}
