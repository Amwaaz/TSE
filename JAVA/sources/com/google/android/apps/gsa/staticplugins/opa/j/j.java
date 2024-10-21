package com.google.android.apps.gsa.staticplugins.opa.j;

import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.apps.tiktok.tracing.au;
import com.google.apps.tiktok.tracing.bc;
import com.google.apps.tiktok.tracing.bf;
import com.google.apps.tiktok.tracing.ex;
import com.google.apps.tiktok.tracing.ft;
import com.google.common.f.a.a;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/j/j.class */
final class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final m f1774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Looper looper) {
        super(looper);
        this.f1774a = mVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        m mVar = this.f1774a;
        au e = mVar.g.e("BroadcastReceiverServiceMessenger.handleMessage");
        try {
            if (!n.a((PackageManager) mVar.b.a())) {
                a e2 = mVar.f1776a.e();
                e2.ak(16664);
                e2.p("broadcast intent not from trusted package");
            } else if (message.what == 1) {
                int i = message.arg1;
                bc d = ft.d("BroadcastReceiverServiceMessenger.handleMessageFuture", bf.f5910a, true);
                try {
                    f fVar = new f(mVar, i);
                    d.a(dl.q(ex.k(fVar), mVar.e));
                    d.close();
                } finally {
                }
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
