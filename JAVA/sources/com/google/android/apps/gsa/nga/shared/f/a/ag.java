package com.google.android.apps.gsa.nga.shared.f.a;

import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.shared.f.ah;
import com.google.android.apps.gsa.nga.shared.f.as;
import com.google.android.apps.gsa.nga.shared.f.at;
import com.google.android.apps.gsa.nga.shared.f.b;
import com.google.android.apps.gsa.nga.shared.f.r;
import com.google.android.apps.gsa.nga.shared.f.s;
import com.google.android.apps.gsa.shared.k.bf;
import com.google.android.apps.gsa.shared.k.d;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.g.ar.bd;
import com.google.g.e.h.a.aw;
import com.google.knowledge.b.l;
import com.google.protobuf.cu;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/ag.class */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public final a f861a;
    private final com.google.android.apps.gsa.shared.util.q.a b;
    private final boolean c;
    private final com.google.android.apps.gsa.nga.shared.w.a d;

    public ag(a aVar, com.google.android.apps.gsa.shared.util.q.a aVar2, boolean z, com.google.android.apps.gsa.nga.shared.w.a aVar3) {
        this.f861a = aVar;
        this.b = aVar2;
        this.c = z;
        this.d = aVar3;
    }

    public final r a(String str) {
        return (r) d(str).map(new f(10)).orElse(r.a);
    }

    public final aw b() {
        l a2 = l.a(((aa) this.f861a.a()).c().h);
        l lVar = a2;
        if (a2 == null) {
            lVar = l.a;
        }
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            return aw.a;
        }
        if (ordinal == 1) {
            return aw.c;
        }
        if (ordinal == 2) {
            return aw.b;
        }
        throw new AssertionError();
    }

    public final bd c() {
        bd a2 = bd.a(((aa) this.f861a.a()).b().g);
        bd bdVar = a2;
        if (a2 == null) {
            bdVar = bd.a;
        }
        return bdVar;
    }

    public final Optional d(String str) {
        as asVar;
        r rVar;
        com.google.android.apps.gsa.nga.shared.f.af b = ((aa) this.f861a.a()).b();
        str.getClass();
        if (!b.m.containsKey(str)) {
            return Optional.empty();
        }
        s sVar = s.f882a;
        str.getClass();
        cu cuVar = b.m;
        if (cuVar.containsKey(str)) {
            sVar = (s) cuVar.get(str);
        }
        com.google.android.apps.gsa.nga.shared.f.a aVar = new com.google.android.apps.gsa.nga.shared.f.a((byte[]) null);
        aVar.b(r.a);
        int i = fl.e;
        aVar.a(ni.a);
        aVar.c = new as(Optional.empty(), Optional.empty());
        aVar.a((fl) Collection._EL.stream(sVar.f).map(new f(18)).collect(bs.a));
        if ((sVar.b & 8) != 0) {
            aVar.a = Optional.of(Locale.forLanguageTag(sVar.g));
        }
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        if ((sVar.b & 1) != 0) {
            empty = Optional.of(sVar.c);
        }
        if ((sVar.b & 2) != 0) {
            empty2 = Optional.of(sVar.d.E());
        }
        r a2 = r.a(sVar.i);
        r rVar2 = a2;
        if (a2 == null) {
            rVar2 = r.a;
        }
        aVar.b(rVar2);
        aVar.c = new as(empty, empty2);
        fl flVar = aVar.b;
        if (flVar != null && (asVar = aVar.c) != null && (rVar = aVar.d) != null) {
            return Optional.of(new b(aVar.a, flVar, asVar, rVar));
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.b == null) {
            sb.append(" assistantLocales");
        }
        if (aVar.c == null) {
            sb.append(" speechPreferences");
        }
        if (aVar.d == null) {
            sb.append(" assistantScreenContextOptInStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Optional e() {
        final int i = 0;
        final int i2 = 1;
        return u(null, new Function(i) { // from class: com.google.android.apps.gsa.nga.shared.f.a.af

            /* renamed from: a, reason: collision with root package name */
            private final int f860a;

            {
                this.f860a = i;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return this.f860a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                if (this.f860a != 0) {
                    return Boolean.valueOf(((com.google.android.apps.gsa.nga.shared.f.af) obj).f);
                }
                return Boolean.valueOf((((com.google.android.apps.gsa.nga.shared.f.af) obj).b & 8) != 0);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.f860a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        }, new java.util.function.Function(i2) { // from class: com.google.android.apps.gsa.nga.shared.f.a.af

            /* renamed from: a, reason: collision with root package name */
            private final int f860a;

            {
                this.f860a = i2;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return this.f860a != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                if (this.f860a != 0) {
                    return Boolean.valueOf(((com.google.android.apps.gsa.nga.shared.f.af) obj).f);
                }
                return Boolean.valueOf((((com.google.android.apps.gsa.nga.shared.f.af) obj).b & 8) != 0);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.f860a != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        });
    }

    public final Optional f() {
        return this.c ? Optional.of(false) : u(bf.c, new f(14), new f(15));
    }

    public final Optional g(final String str) {
        final int i = 1;
        final int i2 = 0;
        return l(new java.util.function.Function(str, i) { // from class: com.google.android.apps.gsa.nga.shared.f.a.ae

            /* renamed from: a, reason: collision with root package name */
            public final String f859a;
            private final int b;

            {
                this.b = i;
                this.f859a = str;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return this.b != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                if (this.b != 0) {
                    com.google.android.apps.gsa.nga.shared.f.af afVar = (com.google.android.apps.gsa.nga.shared.f.af) obj;
                    String str2 = this.f859a;
                    s sVar = s.f882a;
                    str2.getClass();
                    cu cuVar = afVar.m;
                    if (cuVar.containsKey(str2)) {
                        sVar = (s) cuVar.get(str2);
                    }
                    return Boolean.valueOf((sVar.b & 4) != 0);
                }
                com.google.android.apps.gsa.nga.shared.f.af afVar2 = (com.google.android.apps.gsa.nga.shared.f.af) obj;
                String str3 = this.f859a;
                s sVar2 = s.f882a;
                str3.getClass();
                cu cuVar2 = afVar2.m;
                if (cuVar2.containsKey(str3)) {
                    sVar2 = (s) cuVar2.get(str3);
                }
                return Boolean.valueOf(sVar2.e);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.b != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        }, new java.util.function.Function(str, i2) { // from class: com.google.android.apps.gsa.nga.shared.f.a.ae

            /* renamed from: a, reason: collision with root package name */
            public final String f859a;
            private final int b;

            {
                this.b = i2;
                this.f859a = str;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return this.b != 0 ? Function._CC.$default$andThen(this, function) : Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                if (this.b != 0) {
                    com.google.android.apps.gsa.nga.shared.f.af afVar = (com.google.android.apps.gsa.nga.shared.f.af) obj;
                    String str2 = this.f859a;
                    s sVar = s.f882a;
                    str2.getClass();
                    cu cuVar = afVar.m;
                    if (cuVar.containsKey(str2)) {
                        sVar = (s) cuVar.get(str2);
                    }
                    return Boolean.valueOf((sVar.b & 4) != 0);
                }
                com.google.android.apps.gsa.nga.shared.f.af afVar2 = (com.google.android.apps.gsa.nga.shared.f.af) obj;
                String str3 = this.f859a;
                s sVar2 = s.f882a;
                str3.getClass();
                cu cuVar2 = afVar2.m;
                if (cuVar2.containsKey(str3)) {
                    sVar2 = (s) cuVar2.get(str3);
                }
                return Boolean.valueOf(sVar2.e);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return this.b != 0 ? Function._CC.$default$compose(this, function) : Function._CC.$default$compose(this, function);
            }
        });
    }

    public final Optional h(Optional optional) {
        optional.getClass();
        return optional.isPresent() ? k((String) optional.get(), new f(9)) : Optional.of(true);
    }

    public final Optional i(Optional optional) {
        optional.getClass();
        return optional.isPresent() ? k((String) optional.get(), new f(19)) : Optional.of(true);
    }

    public final Optional j(Optional optional) {
        optional.getClass();
        return optional.isPresent() ? k((String) optional.get(), new f(17)) : Optional.of(true);
    }

    public final Optional k(String str, java.util.function.Function function) {
        ah c = ((aa) this.f861a.a()).c();
        if (!c.l.containsKey(str)) {
            return Optional.empty();
        }
        cu cuVar = c.l;
        if (cuVar.containsKey(str)) {
            return Optional.of(e$.ExternalSyntheticApiModelOutline0.m(function, (at) cuVar.get(str)));
        }
        throw new IllegalArgumentException();
    }

    public final Optional l(java.util.function.Function function, java.util.function.Function function2) {
        com.google.android.apps.gsa.nga.shared.f.af b = ((aa) this.f861a.a()).b();
        return ((Boolean) e$.ExternalSyntheticApiModelOutline0.m(function, b)).booleanValue() ? Optional.of((Boolean) e$.ExternalSyntheticApiModelOutline0.m(function2, b)) : Optional.empty();
    }

    public final Locale m() {
        com.google.android.apps.gsa.nga.shared.f.af b = ((aa) this.f861a.a()).b();
        return (b.b & 32) != 0 ? Locale.forLanguageTag(b.h) : Locale.getDefault();
    }

    public final boolean n() {
        if (this.c) {
            return false;
        }
        return ((Boolean) u(eu.cj, new f(11), new f(12)).orElse(Boolean.valueOf(this.b.i(eu.aa)))).booleanValue();
    }

    public final boolean o() {
        return ((aa) this.f861a.a()).c().g;
    }

    public final boolean p() {
        return ((aa) this.f861a.a()).c().f;
    }

    public final boolean q(Optional optional) {
        if (this.b.i(eu.aF)) {
            return false;
        }
        boolean z = ((aa) this.f861a.a()).a().s;
        r rVar = (r) optional.map(new ad(this, 1)).orElse(r.a);
        com.google.android.apps.gsa.nga.shared.w.a aVar = this.d;
        if (!z) {
            boolean a2 = aVar.f1017a.a();
            boolean equals = rVar.equals(r.b);
            if (a2 && !equals) {
                return false;
            }
        }
        return ((aa) this.f861a.a()).c().e;
    }

    public final boolean r() {
        return ((aa) this.f861a.a()).c().i;
    }

    public final boolean s() {
        return ((aa) this.f861a.a()).c().j;
    }

    public final boolean t() {
        return ((aa) this.f861a.a()).c().c;
    }

    public final Optional u(d dVar, java.util.function.Function function, java.util.function.Function function2) {
        return (dVar == null || this.b.i(dVar)) ? l(function, function2) : Optional.of(false);
    }
}
