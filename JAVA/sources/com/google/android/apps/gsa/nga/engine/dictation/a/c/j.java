package com.google.android.apps.gsa.nga.engine.dictation.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.q.a.a;
import com.google.common.f.a.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/dictation/a/c/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final d f545a = d.j();
    public final h b;
    public final m c;
    public boolean d;
    private final Context f;
    private boolean g;
    private final ServiceConnection h = new i(this);
    public a e = null;

    public j(Context context, h hVar, m mVar) {
        this.f = context;
        this.b = hVar;
        this.c = mVar;
    }

    private final void f() {
        synchronized (this) {
            if (!this.g) {
                com.google.common.f.a.a d = f545a.d();
                d.ak(2866);
                d.p("No binding to unbind [IVR-C]");
                return;
            }
            try {
                this.f.unbindService(this.h);
            } catch (RuntimeException e) {
                aus.f(f545a.f(), "Failed to unbind SysUi service [IVR-C]", (char) 2865, e);
            }
            com.google.common.f.a.a d2 = f545a.d();
            d2.ak(2864);
            d2.p("Unbinding success [IVR-C]");
            this.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        synchronized (this) {
            if (z) {
                f();
            }
            com.google.common.f.a.a d = f545a.d();
            d.ak(2863);
            d.p("Disconnected from SysUi [IVR-C]");
            this.e = null;
            this.d = false;
        }
    }

    final boolean b(int i, String str) {
        synchronized (this) {
            a aVar = this.e;
            if (!this.d || aVar == null) {
                com.google.common.f.a.a f = f545a.f();
                f.ak(2877);
                f.p("not calling #startVoiceReply, SysUi not connected [IVR-C]");
                return false;
            }
            try {
                com.google.common.f.a.a d = f545a.d();
                d.ak(2878);
                d.q("startVoiceReply: sessionToken=%s [IVR-C]", i);
                Parcel Z = aVar.Z();
                Z.writeInt(i);
                Z.writeString(str);
                aVar.ac(2, Z);
                return true;
            } catch (RemoteException e) {
                aus.f(f545a.f(), "Unable to start voice reply [IVR-C]", (char) 2879, e);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this) {
            if (this.g) {
                if (this.d) {
                    com.google.common.f.a.a d = f545a.d();
                    d.ak(2870);
                    d.p("Already connected to SysUi [IVR-C]");
                    return;
                } else {
                    com.google.common.f.a.a f = f545a.f();
                    f.ak(2869);
                    f.p("Disconnecting as previous connection attempt was only partially complete [IVR-C]");
                    a(true);
                    return;
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.systemui", "com.google.android.systemui.statusbar.NotificationVoiceReplyManagerService"));
            boolean bindService = this.f.bindService(intent, this.h, 1);
            this.g = bindService;
            if (bindService) {
                com.google.common.f.a.a d2 = f545a.d();
                d2.ak(2868);
                d2.p("Bound to SysUi [IVR-C]");
            } else {
                com.google.common.f.a.a f2 = f545a.f();
                f2.ak(2867);
                f2.p("Unable to bind to SysUi [IVR-C]");
            }
        }
    }

    final void d(int i) {
        synchronized (this) {
            a aVar = this.e;
            if (!this.d || aVar == null) {
                com.google.common.f.a.a f = f545a.f();
                f.ak(2871);
                f.p("not calling #onVoiceAuthStateChanged, SysUi not connected [IVR-C]");
                return;
            }
            try {
                com.google.common.f.a.a d = f545a.d();
                d.ak(2872);
                d.w("onVoiceAuthStateChanged: sessionToken=%s, newState=%s [IVR-C]", i, 1);
                Parcel Z = aVar.Z();
                Z.writeInt(i);
                Z.writeInt(1);
                aVar.ac(3, Z);
            } catch (RemoteException e) {
                aus.f(f545a.f(), "Unable to send auth state to Sys UI [IVR-C]", (char) 2873, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        synchronized (this) {
            a aVar = this.e;
            if (!this.d || aVar == null) {
                com.google.common.f.a.a f = f545a.f();
                f.ak(2874);
                f.p("not calling #setFeatureEnabled, SysUi not connected [IVR-C]");
                return;
            }
            try {
                com.google.common.f.a.a d = f545a.d();
                d.ak(2875);
                d.q("setFeatureEnabled: enabledSetting=%s [IVR-C]", i);
                Parcel Z = aVar.Z();
                Z.writeInt(i);
                aVar.ac(4, Z);
            } catch (RemoteException e) {
                aus.f(f545a.f(), "Unable to send feature enabled state to Sys UI [IVR-C]", (char) 2876, e);
            }
        }
    }
}
