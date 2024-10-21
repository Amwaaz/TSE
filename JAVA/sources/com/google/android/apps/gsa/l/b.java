package com.google.android.apps.gsa.l;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.b.e;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.geller.portable.z;
import com.google.android.libraries.gsa.h.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.base.at;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.protos.e.v.a.t;
import com.google.protos.o.b.v;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/l/b.class */
public class b implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final j f361a = j.i("com.google.android.apps.gsa.l.b");
    private final Context b;
    private final h c;
    private Geller d = null;
    private final GellerLoggingCallback e;
    private final AccountManager f;
    private final t g;
    private final e.a h;
    private final g i;

    public b(Context context, h hVar, g gVar, AccountManager accountManager, d dVar, GellerLoggingCallback gellerLoggingCallback, t tVar, e.a aVar) {
        this.b = context;
        this.c = hVar;
        this.e = gellerLoggingCallback;
        this.i = gVar;
        this.f = accountManager;
        this.g = tVar;
        this.h = aVar;
        dVar.a(this);
    }

    private final Geller e() {
        Geller geller;
        synchronized (this) {
            if (this.d == null) {
                com.google.android.apps.gsa.shared.util.l.a.a("geller_jni_lib");
                Context context = this.b;
                g gVar = this.i;
                cr a2 = gVar.a("[GELLER]LightweightExecutor", gVar.b);
                g gVar2 = this.i;
                cr a3 = gVar2.a("[GELLER]BackgroundExecutor", gVar2.c);
                g gVar3 = this.i;
                z zVar = new z(context, a2, a3, gVar3.a("[GELLER]BlockingExecutor", gVar3.d), nr.a);
                zVar.n = this.g;
                zVar.o = at.k(this.h);
                zVar.h = this.e;
                this.d = new Geller(zVar);
            }
            geller = this.d;
        }
        return geller;
    }

    public final Geller a() {
        try {
            return e();
        } catch (UnsatisfiedLinkError e) {
            a.a.dB(f361a.e(), "Unable to load native geller_jni_lib library.", (char) 1948, e);
            return null;
        }
    }

    public final cn b() {
        h hVar = this.c;
        if (hVar != null) {
            return hVar.b("GellerProvider.getAsync", new c(this) { // from class: com.google.android.apps.gsa.l.a

                /* renamed from: a, reason: collision with root package name */
                public final b f360a;

                {
                    this.f360a = this;
                }

                @Override // com.google.android.libraries.gsa.h.c
                public final Object a() {
                    return this.f360a.c();
                }
            });
        }
        throw new UnsupportedOperationException("Background runner not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ cn c() {
        try {
            return dl.n(e());
        } catch (UnsatisfiedLinkError e) {
            return dl.m(e);
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.q("GellerProvider");
        Geller a2 = a();
        if (a2 == null) {
            fVar.s("Geller instance is null.", new e[0]);
            return;
        }
        fVar.b("geller_state").a(new com.google.android.apps.gsa.shared.util.b.d(String.format("isReadOnly=%s, isWalEnabled=%s", Boolean.valueOf(a2.k.f2980a), true), false));
        for (Account account : this.f.getAccounts()) {
            String str = account.name;
            f d = fVar.d((Object) null);
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.b.g.b;
            com.google.android.apps.gsa.shared.o.a.a aVar2 = com.google.android.apps.gsa.shared.util.b.g.b;
            d.q(String.format("CorpusStats_%s", e.d(account).a(false)));
            com.google.protos.ap.a.a.f a3 = com.google.android.libraries.geller.e.a.a();
            int i = fl.e;
            for (com.google.protos.e.v.a.f fVar2 : a2.n(str, ni.a, a3).c) {
                String str2 = fVar2.c;
                f d2 = d.d((Object) null);
                d2.q(str2);
                d2.b("size_bytes").a(new com.google.android.apps.gsa.shared.util.b.d(Long.valueOf(fVar2.d), false));
                d2.b("num_rows_in_key_table").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(fVar2.e), false));
                d2.b("num_rows_in_value_table").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(fVar2.f), false));
                f d3 = d.d((Object) null);
                d3.q("Keys");
                try {
                    ha d4 = a2.d(str, v.b(str2), com.google.android.libraries.geller.e.a.a());
                    d3.b("num_unique_keys").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(d4.size()), false));
                    d3.b("keys_list_limited").a(new com.google.android.apps.gsa.shared.util.b.d(Arrays.toString(((Set) Collection._EL.stream(d4).limit(100L).collect(Collectors.toSet())).toArray()), false));
                } catch (GellerException e) {
                    a.a.dB(f361a.e(), "Error while dumping corpus keys.", (char) 1949, e);
                }
            }
        }
    }
}
