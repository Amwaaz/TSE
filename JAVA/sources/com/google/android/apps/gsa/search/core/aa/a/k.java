package com.google.android.apps.gsa.search.core.aa.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.Cdo;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.phenotype.bv;
import com.google.apps.tiktok.i.x;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.protos.o.b.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/aa/a/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1045a = d.j();
    private final Context b;
    private final e.a c;
    private final SharedPreferences d;
    private final e.a e;
    private final e.a f;
    private final bv g;
    private final ScheduledExecutorService h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public k(Context context, e.a aVar, SharedPreferences sharedPreferences, e.a aVar2, e.a aVar3, bv bvVar, ScheduledExecutorService scheduledExecutorService, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.b = context;
        this.c = aVar;
        this.d = sharedPreferences;
        this.e = aVar2;
        this.f = aVar3;
        this.g = bvVar;
        this.h = scheduledExecutorService;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
    }

    private final j o() {
        AccountId p = p();
        if (p == null) {
            return null;
        }
        return (j) x.d(this.b, j.class, p);
    }

    private final AccountId p() {
        AccountId a2;
        if (this.m) {
            a2 = ((com.google.android.libraries.search.account.k) this.e.a()).a();
        } else {
            int i = this.d.getInt("tik_tok_account_id", -1);
            a2 = i == -1 ? null : com.google.apps.tiktok.account.c.a(i);
        }
        if (a2 == null) {
            com.google.common.f.a.a f = f1045a.f();
            f.ak(8082);
            f.p("Account id is not cached");
            ((com.google.android.libraries.search.account.a.a) this.c.a()).a();
        }
        return a2;
    }

    private final cn q(cn cnVar) {
        if (cnVar.isDone()) {
            return cnVar;
        }
        cn v = dl.v(dl.o(cnVar), ((p) this.f.a()).i(Cdo.c), TimeUnit.MILLISECONDS, this.h);
        dl.y(v, ex.h(new i()), ay.a);
        return v;
    }

    public final cn a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(q(this.g.a()));
        AccountId p = p();
        if (p != null) {
            arrayList.add(q(((j) x.d(this.b, j.class, p)).kr().a()));
        }
        return i.g(dl.t(arrayList), ex.b(new h()), ay.a);
    }

    public final ae b() {
        j o = o();
        return o == null ? ae.a : o.lD();
    }

    @Deprecated
    public final Collection c() {
        AccountId p = p();
        if (p != null) {
            cn a2 = ((j) x.d(this.b, j.class, p)).kr().a();
            cn a3 = this.g.a();
            try {
                HashSet hashSet = (HashSet) dl.a(dl.i(new cn[]{a2, a3}).a(ex.l(new d(a2, a3)), ay.a), ((p) this.f.a()).i(Cdo.c), TimeUnit.MILLISECONDS);
                hashSet.remove("");
                return hashSet;
            } catch (ExecutionException e) {
                com.google.common.f.a.a g = f1045a.f().g(e);
                g.aj(com.google.android.libraries.search.integrations.g.b.b, 147449327);
                g.ak(8084);
                g.p("Error while fetching the token.");
            } catch (TimeoutException e2) {
                com.google.common.f.a.a g2 = f1045a.f().g(e2);
                g2.aj(com.google.android.libraries.search.integrations.g.b.b, 146063093);
                g2.ak(8083);
                g2.p("Timed out accessing the server tokens.");
            }
        }
        return new ArrayList();
    }

    public final boolean d() {
        return this.l;
    }

    public final boolean e() {
        j o = o();
        return o != null && o.vN();
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        j o = o();
        if (o == null) {
            return false;
        }
        return o.vh();
    }

    public final boolean h() {
        j o = o();
        if (o == null) {
            return false;
        }
        return o.vm();
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        j o = o();
        return o != null && o.vo();
    }

    public final boolean k() {
        j o = o();
        return o != null && o.vt();
    }

    public final boolean l() {
        return false;
    }

    public final boolean m() {
        return this.k;
    }

    public final boolean n() {
        j o = o();
        if (o == null) {
            return false;
        }
        return o.vO();
    }
}
