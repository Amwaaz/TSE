package com.google.android.apps.gsa.eventlogger;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.am;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.k.en;
import com.google.android.apps.gsa.shared.logger.k;
import com.google.android.apps.gsa.shared.v.ac;
import com.google.android.apps.gsa.shared.v.ae;
import com.google.android.apps.gsa.shared.v.af;
import com.google.android.apps.gsa.shared.v.al;
import com.google.android.apps.gsa.shared.v.i;
import com.google.android.apps.gsa.shared.v.r;
import com.google.android.gms.clearcut.as;
import com.google.android.libraries.gsa.h.c;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/eventlogger/d.class */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f354a = j.i("com.google.android.apps.gsa.eventlogger.d");
    public final com.google.android.libraries.g.a c;
    public final e.a d;
    public final e.a e;
    public final h f;
    public final Context g;
    public as i;
    public final com.google.android.gms.clearcut.a.b j;
    private final e.a k;
    private final e.a l;
    public long b = -1;
    public final com.google.android.apps.gsa.shared.logger.h.b h = com.google.android.apps.gsa.shared.logger.h.b.c;

    public d(e.a aVar, e.a aVar2, e.a aVar3, com.google.android.libraries.g.a aVar4, e.a aVar5, h hVar, com.google.android.gms.clearcut.a.b bVar, Context context) {
        this.g = context;
        this.c = aVar4;
        this.e = aVar2;
        this.k = aVar;
        this.d = aVar3;
        this.l = aVar5;
        this.f = hVar;
        this.j = bVar;
    }

    public final cn a() {
        return this.f.a("Flush events to Clearcut.", new c(this) { // from class: com.google.android.apps.gsa.eventlogger.b

            /* renamed from: a, reason: collision with root package name */
            public final d f353a;

            {
                this.f353a = this;
            }

            @Override // com.google.android.libraries.gsa.h.c
            public final Object a() {
                fl m;
                d dVar = this.f353a;
                synchronized (d.class) {
                    try {
                        synchronized (d.class) {
                            try {
                                com.google.android.apps.gsa.shared.logger.h.b bVar = dVar.h;
                                if (bVar != null) {
                                    if (!bVar.f.isEmpty()) {
                                        bVar.i(com.google.android.apps.gsa.shared.logger.h.b.j(bVar.f));
                                        bVar.f = new ArrayList();
                                    }
                                    bVar.g = -1L;
                                    synchronized (bVar.d) {
                                        m = fl.m(bVar.e);
                                        bVar.e.clear();
                                    }
                                    Iterator it = m.iterator();
                                    while (it.hasNext()) {
                                        dVar.b((ba) it.next());
                                    }
                                }
                                if (k.a().c instanceof g) {
                                    ((g) k.a().c).d();
                                }
                                int i = (int) ((p) dVar.d.a()).i(en.J);
                                long a2 = dVar.c.a();
                                if (i >= 0) {
                                    long j = dVar.b;
                                    if (j == -1 || a2 >= j + i) {
                                        dVar.f.m(((ae) dVar.e.a()).h(0), "maybeLogNetworkStatistics", new c(dVar, a2));
                                    }
                                }
                            } finally {
                            }
                        }
                        return com.google.android.apps.gsa.v.c.f1836a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return com.google.android.apps.gsa.v.c.f1836a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(ba baVar) {
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        baVar.copyOnWrite();
        com.google.cs.d.e eVar = baVar.instance;
        com.google.cs.d.e eVar2 = com.google.cs.d.e.a;
        eVar.b |= 1;
        eVar.c = micros;
        UriRequest g = ((am) this.k.a()).g(baVar.build());
        try {
            al b = com.google.android.apps.gsa.shared.v.am.b();
            b.f(g.a.toString());
            b.c(g.a());
            b.j = true;
            b.k = 5;
            com.google.android.apps.gsa.shared.v.am a2 = b.a();
            ae aeVar = (ae) this.e.a();
            cn f = aeVar.f(a2, ac.b, aeVar.b(r.a));
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
            ((i) f.get()).f();
            String uri = g.a.toString();
            ab abVar = com.google.common.f.a.e.a;
            if (uri.length() > 1536) {
                ((com.google.android.apps.gsa.shared.logger.e) this.l.a()).c(null, 17935266);
            }
        } catch (af e) {
            e = e;
            k.f(285);
            a.a.dB(f354a.e(), "Could not log the ACLE batch", (char) 1888, e);
        } catch (MalformedURLException e2) {
            e = e2;
            k.f(285);
            a.a.dB(f354a.f(), "Could not log the ACLE batch", (char) 1889, e);
        } catch (com.google.android.apps.gsa.shared.m.d e3) {
            e = e3;
            k.f(285);
            a.a.dB(f354a.e(), "Could not log the ACLE batch", (char) 1888, e);
        } catch (InterruptedException e4) {
            e = e4;
            k.f(285);
            a.a.dB(f354a.e(), "Could not log the ACLE batch", (char) 1888, e);
        } catch (ExecutionException e5) {
            e = e5;
            k.f(285);
            a.a.dB(f354a.f(), "Could not log the ACLE batch", (char) 1889, e);
        }
    }
}
