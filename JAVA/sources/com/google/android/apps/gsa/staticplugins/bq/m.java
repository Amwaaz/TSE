package com.google.android.apps.gsa.staticplugins.bq;

import a.a;
import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.m.c;
import com.google.android.apps.gsa.assistant.shared.m.d;
import com.google.android.apps.gsa.assistant.shared.m.k;
import com.google.android.apps.gsa.assistant.shared.m.l;
import com.google.android.apps.gsa.assistant.shared.m.n;
import com.google.android.apps.gsa.s3.y;
import com.google.android.apps.gsa.search.core.google.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.cl;
import com.google.android.apps.gsa.shared.util.ao;
import com.google.android.apps.gsa.shared.v.ae;
import com.google.android.apps.gsa.shared.v.bh;
import com.google.android.apps.gsa.speech.o.g;
import com.google.android.apps.gsa.staticplugins.bl.f;
import com.google.android.libraries.gsa.c.a.a.t;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.ca;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import com.google.g.ar.an;
import com.google.g.ar.fb;
import com.google.g.ar.fe;
import com.google.g.ar.fi;
import com.google.g.ar.lk;
import com.google.g.ar.ll;
import com.google.g.ar.lm;
import com.google.protobuf.bd;
import com.google.protobuf.bg;
import com.google.protobuf.bi;
import com.google.speech.g.a.b;
import com.google.speech.g.am;
import com.google.speech.g.at;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bq/m.class */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1637a = j.i("com.google.android.apps.gsa.staticplugins.bq.m");
    public String b = null;
    public an c = null;
    private final h d;
    private final n e;
    private final ae f;
    private final i g;
    private final p h;
    private final f i;

    public m(f fVar, h hVar, n nVar, i iVar, p pVar, ae aeVar) {
        this.i = fVar;
        this.d = hVar;
        this.e = nVar;
        this.g = iVar;
        this.h = pVar;
        this.f = aeVar;
    }

    public static void e(at atVar, com.google.android.apps.gsa.assistant.shared.m.j jVar, com.google.android.apps.gsa.assistant.shared.m.j jVar2) {
        bg bgVar = bi.-$$Nest$smcheckIsLite(b.b);
        atVar.d(bgVar);
        int i = 1;
        if (((bd) atVar).br.o(bgVar.d)) {
            bg bgVar2 = bi.-$$Nest$smcheckIsLite(b.b);
            atVar.d(bgVar2);
            Object l = ((bd) atVar).br.l(bgVar2.d);
            fb fbVar = (fb) (l == null ? bgVar2.b : bgVar2.c(l));
            if ((fbVar.b & 1) != 0) {
                lk lkVar = fbVar.c;
                lk lkVar2 = lkVar;
                if (lkVar == null) {
                    lkVar2 = lk.a;
                }
                ab abVar = e.a;
                jVar.gM(lkVar2);
            } else {
                com.google.common.f.h e = f1637a.e();
                e.aj(e.a, "SettingsServerClient");
                com.google.common.f.h hVar = e;
                hVar.ak(23294);
                hVar.p("Settings response did not contain UI settings.");
                jVar.gL(new RuntimeException("Invalid get settings response."));
            }
            if (jVar2 != null) {
                if ((fbVar.b & 2) != 0) {
                    fi fiVar = fbVar.d;
                    fi fiVar2 = fiVar;
                    if (fiVar == null) {
                        fiVar2 = fi.a;
                    }
                    jVar2.gM(fiVar2);
                } else {
                    com.google.common.f.h e2 = f1637a.e();
                    e2.aj(e.a, "SettingsServerClient");
                    com.google.common.f.h hVar2 = e2;
                    hVar2.ak(23295);
                    hVar2.p("Response header was null.");
                    jVar2.gL(new RuntimeException("Response header missing."));
                }
            }
        }
        int dh = a.dh(atVar.c);
        if (dh != 0) {
            i = dh;
        }
        if (i == 2 || i == 3) {
            jVar.gH();
        }
    }

    private final k o(l lVar) {
        ab abVar = e.a;
        lVar.c.f();
        return h((Account) lVar.c.f(), (am) lVar.d.f(), new c(this, lVar, 0), new i(this, lVar));
    }

    public final com.google.common.base.at a() {
        return this.h.w(cl.v) ? com.google.common.base.at.k(this.g) : com.google.common.base.a.a;
    }

    public final cn b(c cVar, long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        cVar.a = new e(settableFuture);
        i("GetRequestTimeout", settableFuture, f(cVar.a()), j, timeUnit);
        return settableFuture;
    }

    public final cn c(k kVar, long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        kVar.b = new h(settableFuture);
        i("UpdateRequestTimeout", settableFuture, o(kVar.a()), j, timeUnit);
        return settableFuture;
    }

    public final cn d(Account account, lm lmVar, long j, TimeUnit timeUnit, String str) {
        k a2 = l.a();
        a2.c = com.google.common.base.at.j(account);
        a2.b(lmVar);
        a2.j = com.google.common.base.at.j(str);
        return c(a2, j, timeUnit);
    }

    public final k f(d dVar) {
        ab abVar = e.a;
        return h((Account) dVar.c.f(), (am) dVar.d.f(), new c(this, dVar, 2), new d(dVar));
    }

    public final k g(Account account, ll llVar, fe feVar, com.google.android.apps.gsa.assistant.shared.m.j jVar, com.google.android.apps.gsa.assistant.shared.m.j jVar2, String str, String str2) {
        ab abVar = e.a;
        return h(account, null, new a(this, llVar, feVar, str, str2), new f(jVar, jVar2));
    }

    public final k h(Account account, am amVar, ca caVar, com.google.android.apps.gsa.assistant.shared.m.j jVar) {
        com.google.android.apps.gsa.s3.n nVar = (com.google.android.apps.gsa.s3.n) ao.b(this.d, com.google.android.apps.gsa.s3.n.class, new l(jVar));
        n nVar2 = this.e;
        com.google.android.apps.gsa.shared.util.c.a.an anVar = (com.google.android.apps.gsa.shared.util.c.a.an) nVar2.f282a.a();
        anVar.getClass();
        t tVar = (t) nVar2.b.a();
        tVar.getClass();
        bh bhVar = (bh) nVar2.c.a();
        bhVar.getClass();
        com.google.android.apps.gsa.speech.helper.a aVar = (com.google.android.apps.gsa.speech.helper.a) nVar2.d.a();
        aVar.getClass();
        g gVar = (g) nVar2.e.a();
        gVar.getClass();
        com.google.android.apps.gsa.speech.m.b.a aVar2 = (com.google.android.apps.gsa.speech.m.b.a) nVar2.f.a();
        aVar2.getClass();
        p pVar = (p) nVar2.g.a();
        pVar.getClass();
        String str = (String) nVar2.h.a();
        str.getClass();
        String str2 = (String) nVar2.i.a();
        str2.getClass();
        String str3 = (String) nVar2.j.a();
        str3.getClass();
        com.google.android.apps.gsa.s3.m a2 = this.i.a(nVar, new com.google.android.apps.gsa.assistant.shared.m.i(account, amVar, anVar, tVar, bhVar, aVar, gVar, aVar2, pVar, str, str2, str3, caVar), new y(), this.f);
        a2.a();
        return new k(a2);
    }

    public final void i(String str, SettableFuture settableFuture, k kVar, long j, TimeUnit timeUnit) {
        this.d.o(str, timeUnit.toMillis(j), new b(kVar, settableFuture));
    }

    public final cn j(Account account, ll llVar, fe feVar, long j, TimeUnit timeUnit, String str) {
        SettableFuture settableFuture = new SettableFuture();
        i("GetRequestTimeout", settableFuture, g(account, llVar, feVar, new g(settableFuture), null, null, str), j, timeUnit);
        return settableFuture;
    }

    public final cn k(Account account, am amVar, lm lmVar, TimeUnit timeUnit, String str) {
        k a2 = l.a();
        a2.c = com.google.common.base.at.j(account);
        a2.d = com.google.common.base.at.j(amVar);
        a2.e = com.google.common.base.at.j((Object) null);
        a2.b(lmVar);
        a2.j = com.google.common.base.at.j(str);
        return c(a2, 5L, timeUnit);
    }

    public final void l(Account account, an anVar, lm lmVar, com.google.android.apps.gsa.assistant.shared.m.j jVar, String str) {
        k a2 = l.a();
        a2.c = com.google.common.base.at.j(account);
        a2.e = com.google.common.base.at.j(anVar);
        a2.b(lmVar);
        a2.b = jVar;
        a2.j = com.google.common.base.at.j(str);
        o(a2.a());
    }

    public final k m(Account account, am amVar, lm lmVar, com.google.android.apps.gsa.assistant.shared.m.j jVar, String str) {
        k a2 = l.a();
        a2.c = com.google.common.base.at.j(account);
        a2.d = com.google.common.base.at.j(amVar);
        a2.e = com.google.common.base.at.j((Object) null);
        a2.b(lmVar);
        if (jVar == null) {
            throw new NullPointerException("Null resultCallback");
        }
        a2.b = jVar;
        a2.j = com.google.common.base.at.j(str);
        return o(a2.a());
    }

    public final void n(Account account, lm lmVar, com.google.android.apps.gsa.assistant.shared.m.j jVar, String str) {
        k a2 = l.a();
        a2.c = com.google.common.base.at.j(account);
        a2.b(lmVar);
        a2.b = jVar;
        a2.j = com.google.common.base.at.j(str);
        o(a2.a());
    }
}
