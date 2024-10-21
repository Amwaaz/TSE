package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountsException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.preferences.n;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.util.b.g;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.d;
import com.google.android.libraries.search.account.c.h;
import com.google.android.libraries.search.account.d.b.s;
import com.google.android.libraries.search.account.p;
import com.google.android.libraries.search.account.r;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.dk;
import com.google.common.b.ni;
import com.google.common.b.nr;
import com.google.common.b.pq;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.bj;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/google/gaia/an.class */
public class an implements b, com.google.android.apps.gsa.speech.helper.a, c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1105a = j.i("com.google.android.apps.gsa.search.core.google.gaia.an");
    private final h A;
    private final com.google.android.apps.gsa.shared.util.c.a.an B;
    public final p b;
    public final com.google.android.libraries.gsa.h.h c;
    public final com.google.android.libraries.gsa.h.h d;
    public final com.google.android.libraries.gsa.h.h e;
    public final Context f;
    public final e.a g;
    public final e.a h;
    public final e.a i;
    public final boolean j;
    public Account[] l;
    private final AccountManager m;
    private final e.a n;
    private final e.a o;
    private final e.a p;
    private final e.a q;
    private final at r;
    private final com.google.android.libraries.search.account.u s;
    private final e.a t;
    private final com.google.android.libraries.search.t.i.y u;
    private final boolean y;
    private final bj z = new bj();
    public cn k = null;
    private final Queue v = new pq(new dk(20));
    private final Queue w = new pq(new dk(5));
    private final Queue x = new pq(new dk(5));

    public an(Context context, e.a aVar, com.google.android.apps.gsa.shared.util.c.a.an anVar, com.google.android.libraries.gsa.h.h hVar, com.google.android.libraries.gsa.h.h hVar2, com.google.android.libraries.gsa.h.h hVar3, e.a aVar2, AccountManager accountManager, p pVar, e.a aVar3, h hVar4, e.a aVar4, e.a aVar5, at atVar, e.a aVar6, d dVar, com.google.android.libraries.search.account.u uVar, e.a aVar7, e.a aVar8, com.google.android.libraries.search.t.i.y yVar) {
        this.f = context;
        this.m = accountManager;
        this.b = pVar;
        this.B = anVar;
        this.c = hVar;
        this.d = hVar2;
        this.e = hVar3;
        this.n = aVar2;
        this.g = aVar;
        this.o = aVar3;
        this.A = hVar4;
        this.h = aVar6;
        this.p = aVar4;
        this.q = aVar5;
        this.r = atVar;
        this.s = uVar;
        this.t = aVar7;
        this.i = aVar8;
        this.u = yVar;
        this.j = ((com.google.android.apps.gsa.search.core.h.p) aVar6.a()).w(en.W);
        this.y = ((com.google.android.apps.gsa.search.core.h.p) aVar6.a()).w(en.m);
        dVar.a(this);
        com.google.android.apps.gsa.shared.o.a.a aVar9 = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        F(true);
    }

    private final Account D(String str) {
        Account account;
        synchronized (this) {
            account = null;
            if (str != null) {
                account = k(str);
                if (account == null) {
                    Account[] A = A();
                    int length = A.length;
                    int i = 0;
                    while (true) {
                        account = null;
                        if (i >= length) {
                            break;
                        }
                        account = A[i];
                        if (str.equalsIgnoreCase(this.m.getPreviousName(account))) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return account;
    }

    private final cn E(String str) {
        t("#enableTikTokAccount: start");
        cn cnVar = this.k;
        cn cnVar2 = cnVar;
        if (cnVar == null) {
            cnVar2 = ci.a;
        }
        cn b = dl.g(new cn[]{cnVar2}).b(new aa(this, (s) this.r.a, str, 0), new y(this, 3));
        this.k = b;
        b.getClass();
        dl.y(b, new af(this, b, 1), ay.a);
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144 A[Catch: all -> 0x0335, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0026, B:8:0x0068, B:11:0x0079, B:13:0x0086, B:13:0x0086, B:14:0x0089, B:17:0x00a5, B:20:0x00b8, B:24:0x0166, B:25:0x0171, B:28:0x0144, B:32:0x0157, B:39:0x00fc, B:46:0x00e0, B:47:0x00ee, B:52:0x0173, B:55:0x0209, B:58:0x0231, B:60:0x0239, B:62:0x025d, B:64:0x0272, B:68:0x02d8, B:70:0x02e8, B:73:0x0304, B:74:0x0315, B:81:0x0265, B:82:0x0188, B:87:0x019c, B:88:0x0200), top: B:3:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F(boolean r7) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.an.F(boolean):void");
    }

    private final boolean G(String str) {
        try {
            this.f.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private final Account[] H() {
        Account[] accountArr;
        if (this.j) {
            r rVar = ((com.google.android.libraries.search.account.a.v) this.t.a()).c;
            return rVar == null ? new Account[0] : (Account[]) rVar.a.toArray(new Account[0]);
        }
        synchronized (this) {
            accountArr = this.l;
        }
        return accountArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (((java.lang.Boolean) r7.a()).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(android.accounts.Account[] r6, com.google.common.base.ca r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.gaia.an.I(android.accounts.Account[], com.google.common.base.ca, int, boolean):void");
    }

    private final boolean J(Account account) {
        synchronized (this) {
            ab abVar = com.google.common.f.a.e.a;
            t("#setAccount: Setting the account to ".concat(account == null ? "signed out account" : "user account"));
            String str = (String) ((com.google.android.libraries.search.account.k) this.i.a()).b().f();
            String str2 = account != null ? account.name : null;
            if (h.a.a.p.b.a.f.f(str, str2)) {
                t("#setAccount: The old account is equal to the new account. No change required");
                return false;
            }
            t("#setAccount: The old account is different than the new account. Updating to new account");
            dl.x(this.A.d(str2, false));
            com.google.android.apps.gsa.search.core.preferences.i f = ((n) this.g.a()).f();
            if (str2 == null) {
                t("#setGoogleAccountToUse: Setting the account to null");
                TextUtils.isEmpty((String) ((com.google.android.libraries.search.account.k) this.i.a()).b().f());
                f.h("google_account");
            } else {
                t("#setGoogleAccountToUse: Setting a non-null account");
                f.f("google_account", str2);
            }
            f.b(false);
            cn E = E(str2);
            Intent intent = new Intent("com.google.android.apps.now.account_update_broadcast");
            intent.putExtra("account_name", str2);
            if (G("com.google.android.googlequicksearchbox")) {
                if (E == null) {
                    intent.setPackage("com.google.android.googlequicksearchbox");
                    this.f.sendBroadcast(intent, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
                    t("#finishAccountChange: broadcasted the account change.");
                } else {
                    this.z.b(new aa(this, E, intent, 1), new y(this, 2));
                }
            }
            ni niVar = com.google.android.apps.gsa.shared.util.p.f1571a;
            int i = niVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                String str3 = (String) niVar.get(i2);
                if (!"com.google.android.googlequicksearchbox".equals(str3) && G(str3)) {
                    intent.setPackage(str3);
                    this.f.sendBroadcast(intent, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
                }
            }
            ni niVar2 = com.google.android.apps.gsa.shared.util.p.i;
            int i3 = niVar2.d;
            for (int i4 = 0; i4 < i3; i4++) {
                String str4 = (String) niVar2.get(i4);
                if (G(str4)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setPackage(str4);
                    this.f.sendBroadcast(intent2, "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS");
                }
            }
            return true;
        }
    }

    public final Account[] A() {
        synchronized (this) {
            Account[] H = H();
            return H == null ? new Account[0] : H;
        }
    }

    public final String[] B() {
        synchronized (this) {
            Account[] H = H();
            if (H == null) {
                return new String[0];
            }
            String[] strArr = new String[H.length];
            for (int i = 0; i < H.length; i++) {
                strArr[i] = H[i].name;
            }
            return strArr;
        }
    }

    public final void C(String str) {
        this.w.add(new al(new Throwable()));
        t("#setAccountToUseByName: start");
        synchronized (this) {
            Account k = k(str);
            if (k == null) {
                throw new AccountsException(a.a.dC(str, "setAccountToUseByName: Account ", " not found."));
            }
            J(k);
        }
    }

    @Override // com.google.android.apps.gsa.speech.helper.a, com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn a(String str, long j) {
        return ((c) this.n.a()).a(str, j);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn b(String str, Account account, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        return ((c) this.n.a()).b(str, account, jVar);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final cn c(String str, Account account, boolean z, com.google.android.apps.gsa.shared.util.debug.j jVar) {
        return ((c) this.n.a()).c(str, account, z, jVar);
    }

    @Override // com.google.android.apps.gsa.speech.helper.a, com.google.android.apps.gsa.search.core.google.gaia.c
    public final String e(String str, long j) {
        return ((c) this.n.a()).e(str, j);
    }

    @Override // com.google.android.apps.gsa.speech.helper.a, com.google.android.apps.gsa.search.core.google.gaia.c
    public final String f(Account account, String str, long j) {
        return ((c) this.n.a()).f(account, str, j);
    }

    @Override // com.google.android.apps.gsa.speech.helper.a, com.google.android.apps.gsa.search.core.google.gaia.c
    public final Set g(String str, long j) {
        return ((c) this.n.a()).g(str, j);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final Set h(String str, long j, boolean z) {
        return ((c) this.n.a()).h(str, 10000L, false);
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(com.google.android.apps.gsa.shared.util.debug.a.f fVar) {
        fVar.q("LoginHelper: recent activity");
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            fVar.l((b) it.next());
        }
        fVar.q("LoginHelper: account change call stacks");
        Iterator it2 = this.w.iterator();
        while (it2.hasNext()) {
            fVar.l((b) it2.next());
        }
        fVar.q("LoginHelper: account logouts call stacks");
        Iterator it3 = this.x.iterator();
        while (it3.hasNext()) {
            fVar.l((b) it3.next());
        }
    }

    @Override // com.google.android.apps.gsa.speech.helper.a, com.google.android.apps.gsa.search.core.google.gaia.c
    public final void i(String str) {
        ((c) this.n.a()).i(str);
    }

    @Override // com.google.android.apps.gsa.search.core.google.gaia.c
    public final void j(Collection collection) {
        ((c) this.n.a()).j(collection);
    }

    @Override // com.google.android.apps.gsa.speech.helper.a
    public final Account k(String str) {
        synchronized (this) {
            Account[] A = A();
            if (str == null) {
                return null;
            }
            for (Account account : A) {
                if (account.name.equalsIgnoreCase(str)) {
                    return account;
                }
            }
            return null;
        }
    }

    public final Account l() {
        Account D;
        synchronized (this) {
            D = D(r());
        }
        return D;
    }

    public final cn m(Account account, String str) {
        return this.c.l(n(account, "gmscore_out_of_sync_fake_service"), "Check if GmsCore is initialized", new n(this, account, str));
    }

    public final cn n(Account account, String str) {
        int i = com.google.android.l.a.f2724a;
        AccountManagerCallback<Boolean> ahVar = new ah<>();
        String a2 = com.google.android.l.a.a(str);
        ((ah) ahVar).a = this.m.hasFeatures(account, new String[]{a2}, ahVar, (Handler) this.q.a());
        return ahVar;
    }

    public final cn o() {
        synchronized (this) {
            if (this.y) {
                cn c = this.A.c();
                x xVar = new x(1);
                return com.google.common.util.concurrent.i.g(c, ex.b(xVar), ay.a);
            }
            if (this.k == null) {
                E(r());
            }
            final int i = 1;
            return dl.o(com.google.common.util.concurrent.i.h(this.k, new com.google.common.util.concurrent.r(i) { // from class: com.google.android.apps.gsa.search.core.google.gaia.t

                /* renamed from: a, reason: collision with root package name */
                private final int f1113a;

                {
                    this.f1113a = i;
                }

                public final cn apply(Object obj) {
                    return this.f1113a != 0 ? ((com.google.android.libraries.search.account.d.a) obj).f3609a : ((com.google.android.libraries.search.account.d.a) obj).b;
                }
            }, ay.a));
        }
    }

    public final String p() {
        return q(r());
    }

    public final String q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i <= 1; i++) {
            try {
                String a2 = ((com.google.android.libraries.gcoreclient.d.b) this.p.a()).a(str);
                String str2 = a2;
                if (a2 != null) {
                    str2 = a2;
                    if (a2.startsWith("accountId=")) {
                        ((com.google.android.apps.gsa.shared.logger.e) this.o.a()).c(null, 24866813);
                        str2 = a2.substring(10);
                    }
                }
                return str2;
            } catch (com.google.android.libraries.gcoreclient.d.a e) {
                com.google.common.f.h f = f1105a.f();
                f.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
                com.google.common.f.h g = f.g(e);
                g.ak(6984);
                com.google.android.apps.gsa.shared.o.a.a aVar = g.b;
                com.google.android.apps.gsa.shared.o.a.a aVar2 = g.b;
                g.s("Google Auth exception for getAccountId(%s)", com.google.android.apps.gsa.shared.util.b.f.c(str));
                return null;
            } catch (IOException e2) {
                com.google.common.f.h f2 = f1105a.f();
                f2.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
                com.google.common.f.h g2 = f2.g(e2);
                g2.ak(6983);
                com.google.android.apps.gsa.shared.o.a.a aVar3 = g.b;
                com.google.android.apps.gsa.shared.o.a.a aVar4 = g.b;
                g2.s("IO exception for getAccountId(%s)", com.google.android.apps.gsa.shared.util.b.f.c(str));
            }
        }
        return null;
    }

    public final String r() {
        return (String) ((com.google.android.libraries.search.account.k) this.i.a()).b().f();
    }

    public final Set s() {
        try {
            return (Set) ((at) dl.x(this.A.a())).f();
        } catch (Throwable th) {
            com.google.common.f.y e = f1105a.e();
            e.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
            a.a.dB(e, "accountDataStoreService.getAllowlistedAccountNames failed.", (char) 6986, th);
            return nr.a;
        }
    }

    public final void t(String str) {
        this.v.add(new ak(str));
    }

    public final void u(Account account, Uri uri, String str, com.google.android.apps.gsa.shared.util.f fVar) {
        this.B.d(new ag(this, account, uri, str, fVar));
    }

    public final void v() {
        com.google.common.f.h d = f1105a.d();
        d.aj(com.google.common.f.a.e.a, "Search.LoginHelperImpl");
        com.google.common.f.h hVar = d;
        hVar.ak(6987);
        hVar.p("#refresh()");
        t("#refresh()");
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        F(false);
    }

    public final boolean w(String str) {
        Account D;
        synchronized (this) {
            D = D(str);
        }
        return D != null;
    }

    public final boolean x() {
        int length;
        synchronized (this) {
            length = A().length;
        }
        return length > 0;
    }

    public final boolean y() {
        for (Account account : A()) {
            if (account.name.endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gsa.speech.helper.a
    public final boolean z(String str) {
        ab abVar = com.google.common.f.a.e.a;
        return str.equals(r());
    }
}
