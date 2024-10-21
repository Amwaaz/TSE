package com.google.android.apps.gsa.staticplugins.opa.j;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.apps.gsa.v.c;
import com.google.android.libraries.k.x;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.q;
import e.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/j/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final d f1776a;
    public final a b;
    public final Context d;
    public final cr e;
    public final Messenger f;
    public final dj g;
    public k i;
    public Messenger j;
    public final List c = new ArrayList();
    public final AtomicInteger h = new AtomicInteger(0);
    public final Map k = new HashMap();
    private final AtomicInteger l = new AtomicInteger(0);

    public m(Context context, g gVar, a aVar, dj djVar, Looper looper, com.google.android.apps.gsa.opa.a.a.a aVar2) {
        this.d = context;
        this.e = x.b(gVar.a(l.class.getName(), gVar.b));
        this.b = aVar;
        this.g = djVar;
        this.f = new Messenger(new j(this, looper));
        this.f1776a = aVar2.a("BrdcstRcvrMsgr");
    }

    public final cn a(final Intent intent) {
        final int incrementAndGet = this.l.incrementAndGet();
        return dl.s(ex.d(new q(this, intent, incrementAndGet) { // from class: com.google.android.apps.gsa.staticplugins.opa.j.h

            /* renamed from: a, reason: collision with root package name */
            public final m f1772a;
            public final Intent b;
            public final int c;

            {
                this.f1772a = this;
                this.b = intent;
                this.c = incrementAndGet;
            }

            public final cn a() {
                cn a2;
                Intent intent2 = this.b;
                if (intent2 == null) {
                    a2 = c.b;
                } else {
                    int i = this.c;
                    m mVar = this.f1772a;
                    com.google.common.f.a.a d = mVar.f1776a.d();
                    d.ak(16662);
                    d.y("sendMessage(): received broadcast id:%d with action:%s", i, intent2.getAction());
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("pss_broadcast_intent", intent2);
                    obtain.setData(bundle);
                    obtain.replyTo = mVar.f;
                    obtain.arg1 = i;
                    a2 = androidx.e.a.g.a(new e(mVar, i, obtain, intent2));
                }
                return a2;
            }
        }), this.e);
    }

    public final void b() {
        com.google.common.f.a.a d = this.f1776a.d();
        d.ak(16663);
        d.p("disconnect()");
        dl.q(ex.k(new g(this, 1)), this.e);
    }

    public final void c() {
        Messenger messenger = this.j;
        if (messenger == null) {
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            try {
                this.h.incrementAndGet();
                this.h.get();
                messenger.send(message);
                it.remove();
            } catch (RemoteException e) {
                aus.f(this.f1776a.e(), "processMessages(): remote exception", (char) 16674, e);
            }
        }
    }
}
