package com.google.android.apps.gsa.shared.search;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.search.a.d;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.ac;
import com.google.android.apps.gsa.shared.util.o;
import com.google.common.b.fl;
import com.google.common.b.nn;
import com.google.common.base.cl;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.o.gd;
import com.google.common.o.or;
import com.google.protobuf.ba;
import h.a.a.p.b.a.f;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/b.class */
public final class b {
    public long A;
    public boolean B;
    public boolean C;
    public long D;
    public long E;
    public QueryTriggerType F;
    public int G;
    public String H;
    public String I;
    public HotwordResultMetadata J;
    public String K;
    public String L;
    public String M;
    public or N;
    public ba P;
    public ba Q;

    /* renamed from: a, reason: collision with root package name */
    public Query f1484a;
    public long b;
    public long c;
    public CharSequence d;
    public fl e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public String k;
    public long m;
    public Long n;
    public gd o;
    public byte[] p;
    public Bundle q;
    public Uri r;
    public int s;
    public boolean t;
    public long u;
    public LatencyEvents v;
    public long w;
    public long x;
    public long y;
    public int z;
    public Map l = nn.a;
    public int O = 1;

    public static boolean c(boolean z, String str, String str2) {
        if (true != z) {
            str = null;
        }
        return !TextUtils.equals(str2, str);
    }

    public final void A(int i, int i2) {
        if (i == this.h && i2 == this.i) {
            return;
        }
        this.h = i;
        this.i = i2;
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(String str) {
        if (!this.B) {
            com.google.android.apps.gsa.shared.search.a.b bVar = (com.google.android.apps.gsa.shared.search.a.b) this.P.instance;
            this.B = c((bVar.b & 16) != 0, bVar.g, str);
        }
        if (str != null) {
            ba baVar = this.P;
            baVar.copyOnWrite();
            com.google.android.apps.gsa.shared.search.a.b bVar2 = (com.google.android.apps.gsa.shared.search.a.b) baVar.instance;
            com.google.android.apps.gsa.shared.search.a.b bVar3 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
            bVar2.b |= 16;
            bVar2.g = str;
            return;
        }
        ba baVar2 = this.P;
        baVar2.copyOnWrite();
        com.google.android.apps.gsa.shared.search.a.b bVar4 = (com.google.android.apps.gsa.shared.search.a.b) baVar2.instance;
        com.google.android.apps.gsa.shared.search.a.b bVar5 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
        bVar4.b &= -17;
        bVar4.g = com.google.android.apps.gsa.shared.search.a.b.f1481a.g;
    }

    public final void C(String str, boolean z) {
        d dVar = (d) this.Q.instance;
        int i = dVar.b & 2048;
        boolean z2 = i == 0;
        if (i == 0 || z) {
            if (str != null || c(!z2, dVar.j, null)) {
                this.B = true;
            }
            if (str != null) {
                ba baVar = this.Q;
                baVar.copyOnWrite();
                d dVar2 = (d) baVar.instance;
                dVar2.b |= 2048;
                dVar2.j = str;
                return;
            }
            ba baVar2 = this.Q;
            baVar2.copyOnWrite();
            d dVar3 = (d) baVar2.instance;
            dVar3.b &= -2049;
            dVar3.j = d.f1483a.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(long j) {
        this.B |= this.x != j;
        this.x = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(int i) {
        this.G = i;
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(String str) {
        boolean z = this.B;
        d dVar = (d) this.Q.instance;
        this.B = z | c(1 == (dVar.b & 1), dVar.c, str);
        if (str != null) {
            ba baVar = this.Q;
            baVar.copyOnWrite();
            d dVar2 = (d) baVar.instance;
            dVar2.b |= 1;
            dVar2.c = str;
            return;
        }
        ba baVar2 = this.Q;
        baVar2.copyOnWrite();
        d dVar3 = (d) baVar2.instance;
        dVar3.b &= -2;
        dVar3.c = d.f1483a.c;
    }

    public final void G(long j) {
        this.B |= this.w != j;
        this.w = j;
    }

    public final void H(long j) {
        this.B |= this.u != j;
        this.u = j;
    }

    public final void I(QueryTriggerType queryTriggerType) {
        this.B |= queryTriggerType != this.F;
        this.F = queryTriggerType;
    }

    public final void J(int i) {
        long j = i;
        if (j != (this.b & 15)) {
            d(4611721202799485455L, j);
            if (i == 1) {
                d(0L, 1024L);
            } else if (i == 0) {
                d(1024L, 0L);
                d(0L, 1073741824L);
                d(0L, 4194304L);
            }
            if (i == 1 || i == 2) {
                ba baVar = this.Q;
                baVar.copyOnWrite();
                d dVar = (d) baVar.instance;
                d dVar2 = d.f1483a;
                dVar.b |= 32;
                dVar.e = "web";
                this.l = nn.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(byte[] bArr) {
        this.B |= !Arrays.equals(this.p, bArr);
        this.p = bArr;
    }

    public final void L(int i) {
        this.B |= this.z != i;
        this.z = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(String str) {
        boolean z = this.B;
        d dVar = (d) this.Q.instance;
        this.B = z | c((dVar.b & 4096) != 0, dVar.k, str);
        if (str != null) {
            ba baVar = this.Q;
            baVar.copyOnWrite();
            d dVar2 = (d) baVar.instance;
            dVar2.b |= 4096;
            dVar2.k = str;
            return;
        }
        ba baVar2 = this.Q;
        baVar2.copyOnWrite();
        d dVar3 = (d) baVar2.instance;
        dVar3.b &= -4097;
        dVar3.k = d.f1483a.k;
    }

    public final void N(String str) {
        boolean z = this.B;
        d dVar = (d) this.Q.instance;
        this.B = z | c((dVar.b & 2) != 0, dVar.d, str);
        if (str != null) {
            ba baVar = this.Q;
            baVar.copyOnWrite();
            d dVar2 = (d) baVar.instance;
            dVar2.b |= 2;
            dVar2.d = str;
            return;
        }
        ba baVar2 = this.Q;
        baVar2.copyOnWrite();
        d dVar3 = (d) baVar2.instance;
        dVar3.b &= -3;
        dVar3.d = d.f1483a.d;
    }

    public final void O() {
        s(new LatencyEvents(0L, 0L, 0L, 0L, 0L));
    }

    public final void P() {
        D(0L);
        H(System.currentTimeMillis());
    }

    public final Query a() {
        long j;
        long j2;
        if (!this.B) {
            j jVar = Query.f1478a;
            ab abVar = e.a;
            return this.f1484a;
        }
        while (true) {
            j = this.y;
            j2 = 0;
            if (j != 0) {
                break;
            }
            j();
        }
        if (this.A == 0) {
            this.A = j;
        }
        cl.z(Query.cQ(this.d, this.h), "Query has length %s but selection start is %s", this.d.length(), this.h);
        cl.z(Query.cQ(this.d, this.i), "Query has length %s but selection end is %s", this.d.length(), this.i);
        if (this.C) {
            j2 = this.D;
        }
        ba baVar = this.P;
        ba baVar2 = this.Q;
        baVar.copyOnWrite();
        com.google.android.apps.gsa.shared.search.a.b bVar = (com.google.android.apps.gsa.shared.search.a.b) baVar.instance;
        d dVar = (d) baVar2.build();
        com.google.android.apps.gsa.shared.search.a.b bVar2 = com.google.android.apps.gsa.shared.search.a.b.f1481a;
        dVar.getClass();
        bVar.f = dVar;
        bVar.b |= 8;
        Query query = new Query(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.u, this.v, this.w, this.x, this.y, this.z, this.A, j2, this.E, this.s, this.t, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, 1, null, this.O, (com.google.android.apps.gsa.shared.search.a.b) this.P.build());
        ab abVar2 = e.a;
        return query;
    }

    public final void b() {
        d(109496107235258368L, 0L);
        e(72057594037944336L, 0L);
        f("query-header-visibility");
        this.f = null;
        this.g = null;
        this.h = -2;
        this.i = -2;
        this.j = 0;
        this.E = 0L;
        this.l = nn.a;
        this.e = null;
        this.N = null;
        this.p = null;
        this.o = null;
        this.k = null;
        this.I = null;
        this.K = null;
        ba baVar = this.Q;
        baVar.copyOnWrite();
        d dVar = (d) baVar.instance;
        d dVar2 = d.f1483a;
        dVar.b &= -4097;
        dVar.k = d.f1483a.k;
        ba baVar2 = this.Q;
        baVar2.copyOnWrite();
        d dVar3 = (d) baVar2.instance;
        dVar3.b &= -3;
        dVar3.d = d.f1483a.d;
        ba baVar3 = this.Q;
        baVar3.copyOnWrite();
        d dVar4 = (d) baVar3.instance;
        dVar4.b = (-2) & dVar4.b;
        dVar4.c = d.f1483a.c;
        ba baVar4 = this.Q;
        baVar4.copyOnWrite();
        d dVar5 = (d) baVar4.instance;
        dVar5.b &= -129;
        dVar5.f = d.f1483a.f;
        ba baVar5 = this.Q;
        baVar5.copyOnWrite();
        d dVar6 = (d) baVar5.instance;
        dVar6.b &= -524289;
        dVar6.n = d.f1483a.n;
        ba baVar6 = this.Q;
        baVar6.copyOnWrite();
        d dVar7 = (d) baVar6.instance;
        dVar7.b &= -257;
        dVar7.g = d.f1483a.g;
        ba baVar7 = this.Q;
        baVar7.copyOnWrite();
        d dVar8 = (d) baVar7.instance;
        dVar8.b &= -513;
        dVar8.h = d.f1483a.h;
        ba baVar8 = this.Q;
        baVar8.copyOnWrite();
        d dVar9 = (d) baVar8.instance;
        dVar9.b &= -4194305;
        dVar9.o = d.f1483a.o;
        if (this.f1484a.aJ("android.search.extra.PARENT_EVENT_ID") != null) {
            Bundle h = this.f1484a.h();
            h.getClass();
            this.q = h;
            h.remove("android.search.extra.PARENT_EVENT_ID");
        }
    }

    public final void d(long j, long j2) {
        long j3 = this.b;
        j jVar = Query.f1478a;
        ab abVar = e.a;
        long j4 = ((j ^ (-1)) & j3) | j2;
        this.B |= j4 != this.b;
        this.b = j4;
    }

    public final void e(long j, long j2) {
        long j3 = this.c;
        j jVar = Query.f1478a;
        ab abVar = e.a;
        long j4 = ((j ^ (-1)) & j3) | j2;
        this.B |= j4 != this.c;
        this.c = j4;
    }

    public final void f(String str) {
        Bundle bundle = this.q;
        if (bundle == null || !bundle.containsKey(str)) {
            return;
        }
        Bundle bundle2 = (Bundle) this.q.clone();
        this.q = bundle2;
        bundle2.remove(str);
    }

    public final void g() {
        this.B |= this.N != null;
        this.N = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.B |= this.M != null;
        this.M = null;
    }

    public final void i() {
        this.m = Query.c.f1477a.incrementAndGet();
        this.A = 0L;
        this.B = true;
    }

    public final void j() {
        this.y = o.f1569a.b.nextLong();
        this.B = true;
    }

    public final void k(String str, byte[] bArr) {
        if (this.q == null) {
            this.q = new Bundle();
        }
        this.q.putByteArray(str, bArr);
        this.B = true;
    }

    public final void l(String str, int i) {
        if (this.q == null) {
            this.q = new Bundle();
        }
        this.q.putInt(str, i);
        this.B = true;
    }

    public final void m(gd gdVar) {
        this.B |= !f.f(this.o, gdVar);
        this.o = gdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(long j) {
        if (this.m != j) {
            this.m = j;
            this.B = true;
        }
    }

    public final void o(Bundle bundle) {
        this.B |= this.q != bundle;
        this.q = bundle;
    }

    public final void p(String str) {
        boolean z = this.B;
        d dVar = (d) this.Q.instance;
        this.B = z | c((dVar.b & 256) != 0, dVar.g, str);
        if (str != null) {
            ba baVar = this.Q;
            baVar.copyOnWrite();
            d dVar2 = (d) baVar.instance;
            dVar2.b |= 256;
            dVar2.g = str;
            return;
        }
        ba baVar2 = this.Q;
        baVar2.copyOnWrite();
        d dVar3 = (d) baVar2.instance;
        dVar3.b &= -257;
        dVar3.g = d.f1483a.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        if (TextUtils.equals(this.H, str)) {
            return;
        }
        this.H = str;
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(long j) {
        this.A = j;
        this.B = true;
    }

    public final void s(LatencyEvents latencyEvents) {
        this.B |= !this.v.equals(latencyEvents);
        this.v = latencyEvents;
    }

    public final void t(String str) {
        this.B |= !TextUtils.equals(str, this.f);
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(Map map) {
        this.B |= !map.equals(this.l);
        this.l = map;
    }

    public final void v(CharSequence charSequence) {
        boolean c = ac.c(charSequence, this.d);
        this.B = (!c) | this.B;
        if (!c) {
            if ((this.b & 15) != 1) {
                d(2048L, 0L);
            }
            b();
        }
        this.d = ac.a(charSequence);
    }

    public final void w(Uri uri, int i, boolean z) {
        boolean z2 = this.B;
        boolean z3 = true;
        if (f.f(uri, this.r)) {
            z3 = true;
            if (this.s == i) {
                z3 = this.t != z;
            }
        }
        this.B = z2 | z3;
        this.r = uri;
        this.s = i;
        this.t = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(long j) {
        this.y = j;
        this.B = true;
    }

    public final void y(Long l) {
        if (f.f(this.n, l)) {
            return;
        }
        this.n = l;
        this.B = true;
    }

    public final void z(or orVar) {
        this.B |= !f.f(this.N, orVar);
        this.N = orVar;
    }
}
