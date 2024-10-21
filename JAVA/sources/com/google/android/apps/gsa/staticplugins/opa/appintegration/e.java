package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.assistant.d.b.g;
import com.google.android.libraries.assistant.d.c.a.a;
import com.google.android.libraries.assistant.d.c.a.c;
import com.google.common.base.at;
import com.google.common.f.ab;
import com.google.common.f.y;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/e.class */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f1759a = 0;
    final f b;

    public e(f fVar) {
        this.b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.libraries.assistant.d.c.a.c, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        ab abVar = com.google.common.f.a.e.a;
        if (iBinder == null) {
            aVar = null;
        } else {
            c queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationCallbackService");
            aVar = queryLocalInterface instanceof c ? queryLocalInterface : new a(iBinder);
        }
        this.b.h = at.k(aVar);
        this.f1759a = 3;
        this.b.c();
        this.b.i.a();
        try {
            this.b.h.c().b(new Binder());
        } catch (RemoteException e) {
            y f = f.f1760a.f();
            f.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
            a.a.dB(f, "#onServiceConnected(): failed to register death recipient.", (char) 16434, e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int dh;
        ab abVar = com.google.common.f.a.e.a;
        this.f1759a = 1;
        f fVar = this.b;
        fVar.h = com.google.common.base.a.a;
        fVar.i.b();
        if (this.b.l.h() || !this.b.m.h() || (dh = a.a.dh(((g) this.b.m.c()).c)) == 0 || dh != 2) {
            return;
        }
        f fVar2 = this.b;
        fVar2.l = fVar2.m;
        fVar2.m = com.google.common.base.a.a;
    }
}
