package com.google.android.apps.gsa.nga.engine.e.b.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.d.bk;
import com.google.android.apps.gsa.shared.util.ai;
import com.google.android.apps.gsa.shared.util.ao;
import com.google.android.apps.gsa.shared.util.permissions.c;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.android.apps.gsa.speech.audio.a.g;
import com.google.android.apps.gsa.speech.audio.a.k;
import com.google.android.apps.gsa.speech.audio.a.l;
import com.google.android.apps.gsa.speech.audio.a.m;
import com.google.android.apps.gsa.speech.audio.a.n;
import com.google.android.apps.gsa.speech.audio.a.o;
import com.google.android.libraries.gsa.h.h;
import com.google.common.b.fq;
import com.google.common.f.j;
import java.util.List;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/e/b/a/e.class */
public class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f549a = j.i("com.google.android.apps.gsa.nga.engine.e.b.a.e");
    private static Map m;
    public final Context b;
    public final h c;
    public final f d;
    public final a e;
    com.google.android.apps.gsa.speech.audio.a.i h;
    public k j;
    public com.google.android.libraries.search.d.e k;
    public final com.google.android.apps.gsa.shared.util.j l;
    private com.google.android.apps.gsa.speech.audio.a.j q;
    public final Object g = new Object();
    public final bk i = new bk(3);
    private boolean n = false;
    private int o = 0;
    private int p = 10;
    final n f = new d(this);

    public e(com.google.android.apps.gsa.shared.util.j jVar, Context context, h hVar, f fVar, a aVar) {
        this.l = jVar;
        this.b = context;
        this.c = hVar;
        this.d = fVar;
        this.e = aVar;
    }

    public static String d(int i) {
        synchronized (e.class) {
            try {
                if (m == null) {
                    fq fqVar = new fq(4);
                    fqVar.i(0, "DEVICE_STATE_UNKNOWN");
                    fqVar.i(1, "DEVICE_STATE_CONNECTED");
                    fqVar.i(2, "DEVICE_STATE_NONE");
                    fqVar.i(10, "SCO_STATE_DISCONNECTED");
                    fqVar.i(11, "SCO_STATE_CONNECTING");
                    fqVar.i(12, "SCO_STATE_CONNECTED");
                    m = fqVar.h(false);
                }
                String str = (String) m.get(Integer.valueOf(i));
                return str != null ? str : "[Illegal value]";
            } finally {
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.g) {
            i = this.o;
        }
        return i;
    }

    public final int b() {
        int i;
        synchronized (this.g) {
            i = this.p;
        }
        return i;
    }

    public final com.google.android.apps.gsa.speech.audio.a.j c() {
        com.google.android.apps.gsa.speech.audio.a.j jVar;
        synchronized (this.g) {
            jVar = this.o == 1 ? this.q : null;
        }
        return jVar;
    }

    public final void e() {
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        synchronized (this.g) {
            if (this.h == null && this.o == 0) {
                ai.b();
                if (c.a(this.b)) {
                    com.google.android.apps.gsa.speech.audio.a.i a2 = o.a();
                    this.h = a2;
                    if (a2 != null && this.d.f550a.isBluetoothScoAvailableOffCall()) {
                        if (!this.h.a(this.b, (l) ao.b(this.c, l.class, this))) {
                            com.google.common.f.h d = f549a.d();
                            d.ak(2602);
                            d.p("BT not available: no headset profile");
                            this.o = 2;
                        } else if (this.h.a.isEnabled()) {
                            int profileConnectionState = this.h.a.getProfileConnectionState(1);
                            if (profileConnectionState == 3 || profileConnectionState == 0) {
                                this.o = 2;
                            }
                        } else {
                            this.o = 2;
                        }
                    }
                    com.google.common.f.h d2 = f549a.d();
                    d2.ak(2599);
                    d2.p("BT not available: no off call adapter");
                    this.o = 2;
                } else {
                    com.google.common.f.h d3 = f549a.d();
                    d3.ak(2603);
                    d3.p("initializeLocked: no Bluetooth permissions on S+");
                }
            }
        }
    }

    final void f(com.google.android.apps.gsa.speech.audio.a.j jVar) {
        if (!c.a(this.b) && jVar != null) {
            com.google.common.f.h d = f549a.d();
            d.ak(2619);
            d.p("setDevice: no Bluetooth permissions on S+");
            return;
        }
        com.google.common.f.h d2 = f549a.d();
        d2.ak(2616);
        d2.s("%s", jVar == null ? "No BT device" : "BT device connected");
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        synchronized (this.g) {
            int i = this.p;
            int i2 = this.o;
            if (jVar == null) {
                this.p = 10;
                this.o = 2;
                this.q = null;
            } else {
                this.q = jVar;
                this.o = 1;
                Intent intent = new Intent("com.google.android.apps.gsa.handsfree.ACTION_DEVICE_CONNECTED");
                intent.setClassName(this.b, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
                intent.putExtra("com.google.android.apps.gsa.handsfree.EXTRA_DEVICE_ADDRESS", jVar.a.getAddress());
                this.b.sendBroadcast(intent);
            }
            int i3 = 0;
            while (true) {
                bk bkVar = this.i;
                if (i3 < bkVar.d) {
                    g gVar = (g) bkVar.e(i3);
                    int i4 = this.p;
                    if (i4 != i) {
                        ((h) this.i.h(i3)).n("BluetoothController.setDevice: onScoStateChanged", new a(gVar, i, i4, 0));
                    }
                    if (this.o != i2) {
                        ((h) this.i.h(i3)).n("BluetoothController.setDevice: onDeviceStateChanged", new b(gVar));
                    }
                    i3++;
                }
            }
        }
    }

    public final void g(int i) {
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        synchronized (this.g) {
            int i2 = this.p;
            this.p = i;
            if (i != i2) {
                int i3 = 0;
                while (true) {
                    bk bkVar = this.i;
                    if (i3 >= bkVar.d) {
                        break;
                    }
                    ((h) this.i.h(i3)).n("BluetoothController.setScoState: onScoStateChanged", new a((g) bkVar.e(i3), i2, i, 1));
                    i3++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.e.b.a.e.h():void");
    }

    final void i(int i) {
        synchronized (this.g) {
            if (i == 12 || i == 1) {
                if (this.p == 11) {
                    g(12);
                }
            } else if (i == 10 || i == 0) {
                if (this.p != 10 && i == 0) {
                    h();
                }
                g(10);
            } else if (this.p != 11) {
                com.google.common.f.h f = f549a.f();
                f.ak(2608);
                f.p("Not expecting STATE_AUDIO_CONNECTING");
            }
        }
    }

    @Override // com.google.android.apps.gsa.speech.audio.a.l
    public final void j(m mVar) {
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        if (!this.n) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            this.b.registerReceiver(this.f, intentFilter);
            this.n = true;
        }
        if (!c.a(this.b)) {
            com.google.common.f.h d = f549a.d();
            d.ak(2614);
            d.p("onServiceConnected: no Bluetooth permissions on S+");
            return;
        }
        k kVar = (k) mVar;
        this.j = kVar;
        List b = kVar.b();
        if (b.isEmpty()) {
            f(null);
            return;
        }
        com.google.android.apps.gsa.speech.audio.a.j jVar = (com.google.android.apps.gsa.speech.audio.a.j) b.get(0);
        if (this.j.a(jVar) == 2) {
            f(jVar);
        } else {
            f(null);
        }
    }

    @Override // com.google.android.apps.gsa.speech.audio.a.l
    public final void k() {
        com.google.android.libraries.gsa.h.i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        if (this.n) {
            this.b.unregisterReceiver(this.f);
            this.n = false;
        }
        this.j = null;
        f(null);
    }
}
