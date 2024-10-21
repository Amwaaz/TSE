package com.google.android.apps.gsa.l.b;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.core.udc.d;
import com.google.android.apps.gsa.shared.k.az;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.k.be;
import com.google.android.apps.gsa.shared.k.bi;
import com.google.android.apps.gsa.shared.k.bo;
import com.google.android.apps.gsa.shared.k.br;
import com.google.android.apps.gsa.shared.k.cc;
import com.google.android.apps.gsa.shared.k.cl;
import com.google.android.apps.gsa.shared.k.cs;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.search.assistant.surfaces.voice.j.b.l;
import com.google.android.apps.search.assistant.surfaces.voice.j.e.f;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.bs;
import com.google.common.b.ha;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protos.o.b.v;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.function.Function;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/b/c.class */
public class c implements com.google.android.libraries.geller.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f362a = j.i("com.google.android.apps.gsa.l.b.c");
    public final com.google.android.apps.gsa.l.b b;
    public final d c;
    private final p d;
    private final h e;
    private final a f;
    private final ha g;
    private final com.google.android.apps.gsa.search.core.aa.b h;
    private final com.google.android.apps.gsa.search.core.aa.a.c i;
    private final com.google.android.apps.search.assistant.verticals.ambient.s.h.a.a j;
    private final com.google.android.apps.gsa.search.core.aa.b k;

    public c(p pVar, com.google.android.apps.gsa.l.b bVar, h hVar, d dVar, a aVar, com.google.android.apps.gsa.search.core.aa.b bVar2, com.google.android.apps.gsa.search.core.aa.b bVar3, com.google.android.apps.search.assistant.verticals.ambient.s.h.a.a aVar2, com.google.android.apps.gsa.search.core.aa.a.c cVar) {
        this.d = pVar;
        this.b = bVar;
        this.e = hVar;
        this.c = dVar;
        this.f = aVar;
        this.h = bVar2;
        this.k = bVar3;
        this.j = aVar2;
        this.g = (ha) Collection._EL.stream(pVar.k(bo.A)).map(new Function() { // from class: com.google.android.apps.gsa.l.b.b
            @Override // java.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function._CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return v.a(((Integer) obj).intValue());
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return Function._CC.$default$compose(this, function);
            }
        }).collect(bs.b);
        this.i = cVar;
    }

    private final void d() {
        if (((Optional) this.f.a()).isPresent()) {
        }
    }

    @Override // com.google.android.libraries.geller.b.b
    public final cn a(Account account, v vVar) {
        return !this.d.w(bo.k) ? dl.n(true) : this.g.contains(vVar) ? dl.n(false) : this.e.a("[GellerConfig]isUploadEnabled", new a(this, account, vVar));
    }

    public final boolean b(v vVar) {
        int ordinal = vVar.ordinal();
        if (ordinal == 3) {
            d();
            return this.d.w(az.cP);
        }
        if (ordinal == 4) {
            return this.d.w(bi.e);
        }
        if (ordinal == 5) {
            return this.d.w(bc.H);
        }
        if (ordinal == 17) {
            return true;
        }
        if (ordinal == 18) {
            return com.google.android.libraries.search.l.h.a.b() && this.d.w(bo.f);
        }
        if (ordinal == 45) {
            d();
            return this.d.w(cc.w) || this.j.f2458a.j();
        }
        if (ordinal == 46) {
            return true;
        }
        if (ordinal == 52) {
            return this.d.w(bo.g);
        }
        if (ordinal == 53) {
            return this.d.w(br.o) && this.d.w(br.cu);
        }
        if (ordinal == 134 || ordinal == 135 || ordinal == 179) {
            d();
            return false;
        }
        if (ordinal == 180) {
            return true;
        }
        switch (ordinal) {
            case 1:
                d();
                return false;
            case 15:
                return this.d.w(bo.e);
            case 22:
                d();
                return this.d.w(az.gw);
            case 57:
                return this.i.f;
            case 61:
            case 87:
                return true;
            case 71:
                d();
                return false;
            case 74:
                return this.d.w(bo.n);
            case 79:
                if (!this.d.w(eu.f23do)) {
                    return false;
                }
                d();
                return false;
            case 92:
                return this.d.w(eu.dl);
            case 104:
                f a2 = l.a(this.h);
                if (a2.d == 1 && ((Boolean) a2.e).booleanValue()) {
                    return true;
                }
                f a3 = l.a(this.k);
                return a3.d == 1 && ((Boolean) a3.e).booleanValue();
            case 117:
                f a4 = l.a(this.k);
                if (a4.d == 1) {
                    return ((Boolean) a4.e).booleanValue();
                }
                return false;
            case 147:
                return this.d.w(bo.o);
            case 158:
                return this.d.w(bo.p);
            case 169:
                return this.d.w(eu.fM) && this.d.w(eu.fW);
            case 177:
                return this.d.w(bo.t);
            case 187:
                d();
                return this.d.w(cl.S);
            case 202:
                return this.d.w(cs.Q);
            case 209:
                return true;
            default:
                switch (ordinal) {
                    case 9:
                        d();
                        return this.d.w(az.cn);
                    case 10:
                        return this.d.w(be.t);
                    case 11:
                        d();
                        return false;
                    case 12:
                        return this.d.w(bi.i);
                    default:
                        switch (ordinal) {
                            case 66:
                            case 67:
                                return true;
                            case 68:
                                return this.d.w(bo.m);
                            case 69:
                                return this.d.w(bo.l);
                            default:
                                switch (ordinal) {
                                    case 81:
                                        if (!this.d.w(eu.dm)) {
                                            return false;
                                        }
                                        d();
                                        return false;
                                    case 82:
                                        if (!this.d.w(eu.dj)) {
                                            return false;
                                        }
                                        d();
                                        return false;
                                    case 83:
                                        return true;
                                    case 84:
                                        d();
                                        return false;
                                    case 85:
                                        d();
                                        return false;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    @Override // com.google.android.libraries.geller.b.b
    public final boolean c(v vVar) {
        if (!this.d.w(bo.j)) {
            return true;
        }
        if (this.g.contains(vVar)) {
            return false;
        }
        return b(vVar);
    }
}
