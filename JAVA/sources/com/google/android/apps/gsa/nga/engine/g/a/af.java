package com.google.android.apps.gsa.nga.engine.g.a;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.q.c.ft;
import com.google.android.apps.search.assistant.surfaces.voice.i.e.g;
import com.google.android.libraries.search.assistant.r.v;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.protobuf.ao;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.b.aq;
import kotlinx.coroutines.b.bj;
import kotlinx.coroutines.b.cp;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/af.class */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final j f611a = j.i("com.google.android.apps.gsa.nga.engine.g.a.af");
    public final AtomicReference b;
    public final com.google.android.apps.gsa.nga.shared.q.a.x c;
    private final Context d;
    private final ag e;
    private final cr f;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/a/af$a.class */
    public interface a {
        ao ll();

        g wl();
    }

    public af(Context context, ag agVar, cr crVar, com.google.android.apps.gsa.nga.shared.q.a.x xVar) {
        context.getClass();
        agVar.getClass();
        crVar.getClass();
        xVar.getClass();
        this.d = context;
        this.e = agVar;
        this.f = crVar;
        this.c = xVar;
        this.b = new AtomicReference(ab.f610a);
    }

    public static final void d(com.google.android.apps.gsa.nga.shared.q.a.x xVar, String str) {
        if (str == null) {
            throw new NullPointerException("Null event");
        }
        xVar.b(new ft("TNG_MA_STATE_UPDATE", str));
    }

    public final ac a(AccountId accountId, Runnable runnable) {
        a aVar = (a) com.google.apps.tiktok.i.x.d(this.d, a.class, accountId);
        g wl = aVar.wl();
        cn a2 = v.a(this.f, com.google.protobuf.b.a.a.c(aVar.ll()), new ap(this, runnable));
        d(this.c, "SUBSCRIBED");
        return new ac(cp.x(new aq(new aq(bj.b(new aj(new aq(new aj(new aq(new aq(new ak((m.c.g) null), wl.f2085a, 0), new al(this, (m.c.g) null), 5), 1), new am(a2, (m.c.g) null), 5), 0), 1), new an(this, runnable, (m.c.g) null), 5), new ao((m.c.g) null), 1), this.e), a2);
    }

    public final void b(Runnable runnable) {
        h d = f611a.d();
        d.ak(2795);
        d.p("Enabling NGA on-device components.");
        d(this.c, "NGA_ON_DEVICE_ALLOWED");
        Object andSet = this.b.getAndSet(ad.a);
        andSet.getClass();
        c((ae) andSet);
        runnable.run();
    }

    public final void c(ae aeVar) {
        if (aeVar instanceof ac) {
            ac acVar = (ac) aeVar;
            acVar.a.m((CancellationException) null);
            acVar.b.cancel(false);
            d(this.c, "UNSUBSCRIBED");
        }
    }
}
