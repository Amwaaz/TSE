package com.google.android.apps.gsa.staticplugins.opa.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.publicsearch.b;
import com.google.apps.tiktok.tracing.au;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.a.a;
import com.google.common.f.a.d;
import com.google.common.util.concurrent.dl;
import java.lang.ref.WeakReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/j/k.class */
final class k implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f1775a;
    private final dj b;
    private final d c;

    public k(m mVar, dj djVar, d dVar) {
        this.f1775a = new WeakReference(mVar);
        this.b = djVar;
        this.c = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        au e = this.b.e("BroadcastReceiverServiceMessenger.onServiceConnected");
        try {
            final m mVar = (m) this.f1775a.get();
            if (mVar != null) {
                Runnable runnable = new Runnable(mVar, iBinder) { // from class: com.google.android.apps.gsa.staticplugins.opa.j.i

                    /* renamed from: a, reason: collision with root package name */
                    public final m f1773a;
                    public final IBinder b;

                    {
                        this.f1773a = mVar;
                        this.b = iBinder;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.apps.gsa.publicsearch.d] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar;
                        m mVar2 = this.f1773a;
                        IBinder iBinder2 = this.b;
                        if (iBinder2 == null) {
                            bVar = null;
                        } else {
                            try {
                                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                                bVar = queryLocalInterface instanceof com.google.android.apps.gsa.publicsearch.d ? (com.google.android.apps.gsa.publicsearch.d) queryLocalInterface : new b(iBinder2);
                            } catch (RemoteException e2) {
                                aus.f(mVar2.f1776a.e(), "onServiceDisconnected(): remote exception", (char) 16669, e2);
                                mVar2.b();
                                return;
                            }
                        }
                        IBinder a2 = bVar.a("opa_broadcast_receiver", (IBinder) null, (Bundle) null);
                        if (a2 == null) {
                            mVar2.b();
                            a e3 = mVar2.f1776a.e();
                            e3.ak(16670);
                            e3.p("SvcConn: binder null, could not send broadcast of action");
                            return;
                        }
                        a d = mVar2.f1776a.d();
                        d.ak(16668);
                        d.p("SvcConn: messenger connected");
                        mVar2.j = new Messenger(a2);
                        mVar2.c();
                    }
                };
                dl.q(ex.k(runnable), mVar.e);
            }
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        au e = this.b.e("BroadcastReceiverServiceMessenger.onServiceDisconnected");
        try {
            a d = this.c.d();
            d.ak(16661);
            d.p("SvcConn: onServiceDisconnected()");
            m mVar = (m) this.f1775a.get();
            if (mVar != null) {
                a d2 = mVar.f1776a.d();
                d2.ak(16671);
                d2.p("binder null");
                g gVar = new g(mVar, 0);
                dl.q(ex.k(gVar), mVar.e);
            }
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
