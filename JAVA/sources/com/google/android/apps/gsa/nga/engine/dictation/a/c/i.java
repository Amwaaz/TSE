package com.google.android.apps.gsa.nga.engine.dictation.a.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.c;
import com.google.common.f.a.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/dictation/a/c/i.class */
public final class i implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final j f544a;

    public i(j jVar) {
        this.f544a = jVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        a d = j.f545a.d();
        d.ak(2856);
        d.p("SysUi service binding died [IVR-C]");
        this.f544a.a(false);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        a d = j.f545a.d();
        d.ak(2857);
        d.p("SysUi service binding failed [IVR-C]");
        this.f544a.a(false);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.q.a.a aVar;
        a d = j.f545a.d();
        d.ak(2858);
        d.p("SysUiClientConnection#onServiceConnected [IVR-C]");
        synchronized (this.f544a) {
            j jVar = this.f544a;
            if (iBinder == null) {
                aVar = null;
            } else {
                com.google.android.q.a.a queryLocalInterface = iBinder.queryLocalInterface("com.google.android.systemui.statusbar.INotificationVoiceReplyService");
                aVar = queryLocalInterface instanceof com.google.android.q.a.a ? queryLocalInterface : new com.google.android.q.a.a(iBinder);
            }
            jVar.e = aVar;
            j jVar2 = this.f544a;
            com.google.android.q.a.a aVar2 = jVar2.e;
            if (aVar2 == null) {
                a f = j.f545a.f();
                f.ak(2861);
                f.p("Failed to create SysUi service stub [IVR-C]");
                return;
            }
            try {
                h hVar = jVar2.b;
                Parcel Z = aVar2.Z();
                c.f(Z, hVar);
                aVar2.ac(1, Z);
                a d2 = j.f545a.d();
                d2.ak(2859);
                d2.p("SysUi service connected [IVR-C]");
                j jVar3 = this.f544a;
                jVar3.d = true;
                m mVar = jVar3.c;
                int i = true != ((Boolean) mVar.b.filter(new k()).map(new l()).orElse(false)).booleanValue() ? 2 : 3;
                if (true != ((Boolean) mVar.c.e().orElse(false)).booleanValue()) {
                    i = 1;
                }
                ((j) mVar.f546a.a()).e(i);
            } catch (RemoteException e) {
                a g = j.f545a.f().g(e);
                g.ak(2860);
                g.p("Unable to register NGA to Sys UI [IVR-C]");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a d = j.f545a.d();
        d.ak(2862);
        d.p("SysUiClientConnection#onServiceDisconnected [IVR-C]");
        this.f544a.a(true);
    }
}
