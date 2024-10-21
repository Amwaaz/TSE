package androidx.work.impl.b;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final String f190a = androidx.work.af.b("WorkSpec");
    public final String b;
    public androidx.work.as c;
    public String d;
    public String e;
    public androidx.work.l f;
    public androidx.work.l g;
    public long h;
    public long i;
    public long j;
    public androidx.work.g k;
    public int l;
    public androidx.work.a m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public int y;

    public ac(String str, androidx.work.as asVar, String str2, String str3, androidx.work.l lVar, androidx.work.l lVar2, long j, long j2, long j3, androidx.work.g gVar, int i, androidx.work.a aVar, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, int i4, long j8, int i5, int i6, String str4) {
        str.getClass();
        asVar.getClass();
        str2.getClass();
        str3.getClass();
        lVar.getClass();
        lVar2.getClass();
        gVar.getClass();
        aVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        this.b = str;
        this.c = asVar;
        this.d = str2;
        this.e = str3;
        this.f = lVar;
        this.g = lVar2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = gVar;
        this.l = i;
        this.m = aVar;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = z;
        this.y = i2;
        this.s = i3;
        this.t = i4;
        this.u = j8;
        this.v = i5;
        this.w = i6;
        this.x = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ac(java.lang.String r35, androidx.work.as r36, java.lang.String r37, java.lang.String r38, androidx.work.l r39, androidx.work.l r40, long r41, long r43, long r45, androidx.work.g r47, int r48, androidx.work.a r49, long r50, long r52, long r54, long r56, boolean r58, int r59, int r60, long r61, int r63, int r64, java.lang.String r65, int r66) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.ac.<init>(java.lang.String, androidx.work.as, java.lang.String, java.lang.String, androidx.work.l, androidx.work.l, long, long, long, androidx.work.g, int, androidx.work.a, long, long, long, long, boolean, int, int, long, int, int, java.lang.String, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ac(String str, String str2) {
        this(str, (androidx.work.as) null, str2, (String) null, (androidx.work.l) null, (androidx.work.l) null, 0L, 0L, 0L, (androidx.work.g) null, 0, (androidx.work.a) null, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        str.getClass();
        str2.getClass();
    }

    public static final List b(List list) {
        ArrayList arrayList;
        long j;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(t.aX(list, 10));
            Iterator it = list.iterator();
            arrayList = arrayList2;
            while (it.hasNext()) {
                ab abVar = (ab) it.next();
                androidx.work.l lVar = !abVar.q.isEmpty() ? (androidx.work.l) abVar.q.get(0) : androidx.work.l.f224a;
                UUID fromString = UUID.fromString(abVar.a);
                fromString.getClass();
                androidx.work.as asVar = abVar.b;
                HashSet hashSet = new HashSet(abVar.p);
                androidx.work.l lVar2 = abVar.c;
                int i = abVar.h;
                int i2 = abVar.m;
                androidx.work.g gVar = abVar.g;
                long j2 = abVar.d;
                long j3 = abVar.e;
                boolean z = j3 == 0;
                androidx.work.ar arVar = j3 != 0 ? new androidx.work.ar(j3, abVar.f) : null;
                androidx.work.as asVar2 = abVar.b;
                androidx.work.as asVar3 = androidx.work.as.ENQUEUED;
                if (asVar2 == asVar3) {
                    j = bc.n(asVar2 == asVar3 && i > 0, i, abVar.i, abVar.j, abVar.k, abVar.l, !z, j2, abVar.f, j3, abVar.n);
                } else {
                    j = Long.MAX_VALUE;
                }
                arrayList.add(new androidx.work.at(fromString, asVar, hashSet, lVar2, lVar, i, i2, gVar, j2, arVar, j, abVar.o));
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public static /* synthetic */ ac g(ac acVar, String str, androidx.work.as asVar, String str2, androidx.work.l lVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        if ((i5 & 1) != 0) {
            str = acVar.b;
        }
        if ((i5 & 2) != 0) {
            asVar = acVar.c;
        }
        if ((i5 & 4) != 0) {
            str2 = acVar.d;
        }
        String str3 = (i5 & 8) != 0 ? acVar.e : null;
        if ((i5 & 16) != 0) {
            lVar = acVar.f;
        }
        androidx.work.l lVar2 = (i5 & 32) != 0 ? acVar.g : null;
        long j3 = (i5 & 64) != 0 ? acVar.h : 0L;
        long j4 = (i5 & 128) != 0 ? acVar.i : 0L;
        long j5 = (i5 & 256) != 0 ? acVar.j : 0L;
        androidx.work.g gVar = (i5 & 512) != 0 ? acVar.k : null;
        if ((i5 & 1024) != 0) {
            i = acVar.l;
        }
        androidx.work.a aVar = (i5 & 2048) != 0 ? acVar.m : null;
        long j6 = (i5 & 4096) != 0 ? acVar.n : 0L;
        if ((i5 & 8192) != 0) {
            j = acVar.o;
        }
        long j7 = (i5 & 16384) != 0 ? acVar.p : 0L;
        long j8 = (32768 & i5) != 0 ? acVar.q : 0L;
        boolean z = (65536 & i5) != 0 ? acVar.r : false;
        int i6 = (131072 & i5) != 0 ? acVar.y : 0;
        if ((262144 & i5) != 0) {
            i2 = acVar.s;
        }
        if ((524288 & i5) != 0) {
            i3 = acVar.t;
        }
        if ((1048576 & i5) != 0) {
            j2 = acVar.u;
        }
        if ((i5 & 2097152) != 0) {
            i4 = acVar.v;
        }
        int i7 = acVar.w;
        String str4 = acVar.x;
        str.getClass();
        asVar.getClass();
        str2.getClass();
        str3.getClass();
        lVar.getClass();
        lVar2.getClass();
        gVar.getClass();
        aVar.getClass();
        if (i6 != 0) {
            return new ac(str, asVar, str2, str3, lVar, lVar2, j3, j4, j5, gVar, i, aVar, j6, j, j7, j8, z, i6, i2, i3, j2, i4, i7, str4);
        }
        throw null;
    }

    public final long a() {
        return bc.n(e(), this.l, this.m, this.n, this.o, this.s, f(), this.h, this.j, this.i, this.u);
    }

    public final void c(long j, long j2) {
        long j3 = 900000;
        if (j < 900000) {
            androidx.work.af.a();
            Log.w(f190a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (j >= 900000) {
            j3 = j;
        }
        this.i = j3;
        if (j2 < 300000) {
            androidx.work.af.a();
            Log.w(f190a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.i) {
            androidx.work.af.a();
            Log.w(f190a, a.a.dT(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.j = m.l.h.f(j2, 300000L, this.i);
    }

    public final boolean d() {
        return !h.a.a.p.b.a.f.h(androidx.work.g.f168a, this.k);
    }

    public final boolean e() {
        return this.c == androidx.work.as.ENQUEUED && this.l > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.a.a.p.b.a.f.h(this.b, acVar.b) && this.c == acVar.c && h.a.a.p.b.a.f.h(this.d, acVar.d) && h.a.a.p.b.a.f.h(this.e, acVar.e) && h.a.a.p.b.a.f.h(this.f, acVar.f) && h.a.a.p.b.a.f.h(this.g, acVar.g) && this.h == acVar.h && this.i == acVar.i && this.j == acVar.j && h.a.a.p.b.a.f.h(this.k, acVar.k) && this.l == acVar.l && this.m == acVar.m && this.n == acVar.n && this.o == acVar.o && this.p == acVar.p && this.q == acVar.q && this.r == acVar.r && this.y == acVar.y && this.s == acVar.s && this.t == acVar.t && this.u == acVar.u && this.v == acVar.v && this.w == acVar.w && h.a.a.p.b.a.f.h(this.x, acVar.x);
    }

    public final boolean f() {
        return this.i != 0;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int hashCode7 = this.k.hashCode();
        int i = (int) (j ^ (j >>> 32));
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int i3 = (int) (j3 ^ (j3 >>> 32));
        int i4 = this.l;
        int hashCode8 = this.m.hashCode();
        long j4 = this.n;
        long j5 = this.o;
        long j6 = this.p;
        long j7 = this.q;
        int bN = a.a.bN(this.r);
        int dk = a.a.dk(this.y);
        int i5 = (int) (j4 ^ (j4 >>> 32));
        int i6 = (int) (j5 ^ (j5 >>> 32));
        int i7 = (int) (j6 ^ (j6 >>> 32));
        int i8 = (int) (j7 ^ (j7 >>> 32));
        int i9 = this.s;
        long j8 = this.u;
        int i10 = this.t;
        int i11 = (int) (j8 ^ (j8 >>> 32));
        int i12 = this.v;
        int i13 = this.w;
        String str = this.x;
        return (((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + i2) * 31) + i3) * 31) + hashCode7) * 31) + i4) * 31) + hashCode8) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + bN) * 31) + dk) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{WorkSpec: " + this.b + '}';
    }
}
