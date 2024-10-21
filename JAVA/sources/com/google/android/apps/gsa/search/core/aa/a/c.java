package com.google.android.apps.gsa.search.core.aa.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.i.x;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.nr;
import com.google.common.b.oo;
import com.google.common.f.a.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/aa/a/c.class */
public final class c {
    private static final d J = d.j();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    private final Context K;
    private final e.a L;
    private final SharedPreferences M;
    private final e.a N;
    private final boolean O;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1044a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ha g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final long r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Context context, e.a aVar, SharedPreferences sharedPreferences, e.a aVar2, boolean z7, com.google.protos.l.a.b bVar, com.google.protos.l.a.b bVar2, com.google.protos.l.a.b bVar3, com.google.protos.l.a.b bVar4, com.google.protos.l.a.b bVar5, boolean z8, boolean z9, long j, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34) {
        this.f1044a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.K = context;
        this.L = aVar;
        this.M = sharedPreferences;
        this.N = aVar2;
        this.O = z7;
        gy gyVar = new gy();
        gyVar.j(bVar.b);
        gyVar.j(bVar2.b);
        gyVar.j(bVar3.b);
        gyVar.j(bVar4.b);
        this.g = ha.o(bVar5.b);
        this.h = z8;
        this.i = z9;
        this.j = j;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
        this.p = z15;
        this.q = z16;
        this.r = j2;
        this.s = z17;
        this.t = z18;
        this.u = z19;
        this.v = z20;
        this.w = z21;
        this.x = z22;
        this.y = z23;
        this.z = z24;
        this.B = z25;
        this.C = z26;
        this.A = z27;
        this.D = z28;
        this.E = z34 ? true : z29;
        this.F = z30;
        this.G = z31;
        this.H = z32;
        this.I = z33;
    }

    public final b a() {
        AccountId a2;
        if (this.O) {
            a2 = ((com.google.android.libraries.search.account.k) this.N.a()).a();
        } else {
            int i = this.M.getInt("tik_tok_account_id", -1);
            a2 = i == -1 ? null : com.google.apps.tiktok.account.c.a(i);
        }
        if (a2 == null) {
            com.google.common.f.a.a f = J.f();
            f.ak(8079);
            f.p("Account id is not cached");
            ((com.google.android.libraries.search.account.a.a) this.L.a()).a();
        }
        if (a2 == null) {
            return null;
        }
        return (b) x.d(this.K, b.class, a2);
    }

    public final ha b() {
        b a2 = a();
        if (a2 == null) {
            return nr.a;
        }
        return ha.o(oo.b(ha.o(a2.lm().b), ha.o(a2.ln().b)));
    }

    public final boolean c() {
        b a2 = a();
        return a2 != null && a2.sy();
    }

    public final boolean d() {
        b a2 = a();
        return a2 != null && a2.sB();
    }

    public final boolean e() {
        b a2 = a();
        return a2 != null && a2.vq();
    }

    public final boolean f() {
        b a2 = a();
        return a2 != null && a2.vu();
    }

    public final boolean g() {
        b a2 = a();
        return a2 != null && a2.vK();
    }
}
