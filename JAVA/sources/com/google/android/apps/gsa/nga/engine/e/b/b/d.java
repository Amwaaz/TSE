package com.google.android.apps.gsa.nga.engine.e.b.b;

import android.media.AudioAttributes;
import android.media.AudioManager;
import androidx.annotation.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.ai;
import com.google.android.apps.gsa.speech.audio.a.g;
import com.google.android.apps.gsa.staticplugins.j.c;
import com.google.android.apps.gsa.x.a.e;
import com.google.android.libraries.g.a;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.gsa.h.i;
import com.google.android.libraries.search.d.f;
import com.google.common.base.cl;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.f.y;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/e/b/b/d.class */
public class d implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f552a = j.i("com.google.android.apps.gsa.nga.engine.e.b.b.d");
    private final a b;
    private final com.google.android.apps.gsa.nga.engine.e.b.a.e c;
    private final AudioManager d;
    private final h e;
    private String o;
    private long p;
    private boolean r;
    private final com.google.android.apps.gsa.shared.util.q.a s;
    private final Object h = new Object();
    private f i = f.ROUTE_NO_AUDIO;
    private com.google.android.libraries.search.d.e j = com.google.android.libraries.search.d.e.CONNECTION_TYPE_NONE;
    private int k = -1;
    private boolean l = false;
    private boolean m = false;
    private c t = null;
    private int n = 12;
    private int q = 150;
    private final AudioAttributes.Builder f = new AudioAttributes.Builder().setContentType(1).setUsage(2);
    private final AudioAttributes.Builder g = new AudioAttributes.Builder().setContentType(2).setUsage(12);

    public d(a aVar, AudioManager audioManager, h hVar, com.google.android.apps.gsa.nga.engine.e.b.a.e eVar, com.google.android.apps.gsa.shared.util.q.a aVar2) {
        this.b = aVar;
        this.d = audioManager;
        this.c = eVar;
        this.e = hVar;
        this.s = aVar2;
        synchronized (eVar.g) {
            eVar.i.put(this, eVar.c);
        }
    }

    private final void y() {
        if (this.c.b() != 12) {
            ab abVar = com.google.common.f.a.e.a;
            return;
        }
        long millis = this.b.e().toMillis();
        long j = this.p;
        com.google.android.libraries.search.d.e eVar = this.j;
        com.google.android.libraries.search.d.e eVar2 = com.google.android.libraries.search.d.e.CONNECTION_TYPE_BVRA;
        long j2 = (eVar == eVar2 ? eVar == eVar2 ? this.q : 2000 : 0) - (millis - j);
        ab abVar2 = com.google.common.f.a.e.a;
        if (j2 <= 0) {
            return;
        }
        long a2 = this.b.a();
        while (true) {
            try {
                long a3 = (a2 + j2) - this.b.a();
                if (a3 <= 0) {
                    return;
                } else {
                    this.h.wait(a3);
                }
            } catch (InterruptedException e) {
                y f = f552a.f();
                f.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                a.a.dB(f, "Thread was interrupted, aborting await", (char) 2676, e);
                return;
            }
        }
    }

    private static boolean z(f fVar) {
        return fVar == f.ROUTE_BLUETOOTH_PREFERRED || fVar == f.ROUTE_BLUETOOTH_REQUIRED;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final int a() {
        if (this.k != -1) {
            ab abVar = com.google.common.f.a.e.a;
            return this.k;
        }
        if (this.d.isBluetoothScoOn()) {
            ab abVar2 = com.google.common.f.a.e.a;
            return 3;
        }
        if (this.d.isWiredHeadsetOn()) {
            ab abVar3 = com.google.common.f.a.e.a;
            return 2;
        }
        ab abVar4 = com.google.common.f.a.e.a;
        return 1;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final int b() {
        return v();
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final int c() {
        return this.d.getStreamVolume(v());
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final AudioAttributes d() {
        return w();
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void e(String str) {
        String str2;
        ab abVar = com.google.common.f.a.e.a;
        synchronized (this.h) {
            if (this.n == 10 && (str2 = this.o) != null && str2.equals(str)) {
                this.n = 11;
                this.h.notify();
            }
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void f(int i) {
        if (this.r) {
            this.e.n("Enhance audio session", new a(i));
        }
    }

    @Override // com.google.android.apps.gsa.speech.audio.a.g
    public final void g(int i, int i2) {
        i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        ab abVar = com.google.common.f.a.e.a;
        synchronized (this.h) {
            if (s()) {
                if (i2 == 10) {
                    if (!this.l) {
                        this.l = true;
                        if (i == 12) {
                            com.google.common.f.h d = f552a.d();
                            d.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                            com.google.common.f.h hVar = d;
                            hVar.ak(2681);
                            hVar.p("BT route lost");
                            c cVar = this.t;
                            if (cVar != null) {
                                this.e.n("onScoStateChanged: onRouteLost", new b(cVar, 2));
                            }
                        } else if (i == 11) {
                            com.google.common.f.h d2 = f552a.d();
                            d2.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                            com.google.common.f.h hVar2 = d2;
                            hVar2.ak(2680);
                            hVar2.p("BT connection failed");
                        }
                    }
                } else if (i2 == 12 && i == 11) {
                    this.p = this.b.e().toMillis();
                }
            }
            p();
            this.h.notify();
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void h(boolean z) {
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void i() {
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void j(boolean z) {
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void k() {
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void l(boolean z) {
        this.r = z;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void m(int i) {
        ab abVar = com.google.common.f.a.e.a;
        this.q = i;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void n(int i) {
        this.k = i;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void o(boolean z) {
    }

    final void p() {
        ab abVar = com.google.common.f.a.e.a;
        i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        synchronized (this.h) {
            boolean z = false;
            if (this.m) {
                this.m = false;
                this.h.notify();
            }
            if (s()) {
                this.c.e();
                if (this.l) {
                    return;
                }
                if (this.c.b() == 10 && this.c.a() == 1) {
                    com.google.common.f.h d = f552a.d();
                    d.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                    com.google.common.f.h hVar = d;
                    hVar.ak(2690);
                    hVar.p("BT required, starting SCO");
                    com.google.android.apps.gsa.nga.engine.e.b.a.e eVar = this.c;
                    com.google.android.libraries.search.d.e eVar2 = this.j;
                    if (com.google.android.apps.gsa.shared.util.permissions.c.a(eVar.b)) {
                        i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
                        eVar.k = eVar2;
                        if (eVar2 == com.google.android.libraries.search.d.e.CONNECTION_TYPE_NONE) {
                            com.google.common.f.h e = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.e();
                            e.ak(2626);
                            e.p("startSco: Invalid connection type, returning");
                        } else {
                            eVar.e();
                            ai.b();
                            if (eVar.b() == 10) {
                                eVar.g(11);
                                com.google.common.f.h d2 = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.d();
                                d2.ak(2634);
                                d2.p("Starting VR");
                                if (!com.google.android.apps.gsa.shared.util.permissions.c.a(eVar.b)) {
                                    com.google.common.f.h d3 = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.d();
                                    d3.ak(2641);
                                    d3.p("startVoiceRecognition: no Bluetooth permissions on S+");
                                } else if (eVar.j == null) {
                                    com.google.common.f.h f = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.f();
                                    f.ak(2640);
                                    f.p("mBluetoothHeadset is null");
                                } else if (eVar.l.a() && eVar.k == com.google.android.libraries.search.d.e.CONNECTION_TYPE_VIRTUAL_CALL_SCO) {
                                    eVar.d.f550a.startBluetoothSco();
                                    z = true;
                                } else if (eVar.l.a() && eVar.k == com.google.android.libraries.search.d.e.CONNECTION_TYPE_BVRA) {
                                    com.google.android.apps.gsa.speech.audio.a.j c = eVar.c();
                                    if (c != null && (!eVar.e.i(eu.bJ) || eVar.j.c(c))) {
                                        z = eVar.j.e(c);
                                    }
                                } else {
                                    com.google.android.apps.gsa.speech.audio.a.j c2 = eVar.c();
                                    if (c2 != null) {
                                        z = eVar.j.d(c2);
                                    }
                                }
                                com.google.common.f.h d4 = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.d();
                                d4.ak(2622);
                                d4.s("startSco: startVoiceRecognition returned %b", Boolean.valueOf(z));
                                if (!z) {
                                    com.google.common.f.h d5 = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.d();
                                    d5.ak(2624);
                                    d5.p("startSco: startVoiceRecognition failed");
                                    eVar.g(10);
                                }
                            }
                        }
                    } else {
                        com.google.common.f.h d6 = com.google.android.apps.gsa.nga.engine.e.b.a.e.f549a.d();
                        d6.ak(2627);
                        d6.p("startSco: no Bluetooth permissions on S+");
                    }
                }
            } else if (this.c.b() != 10) {
                com.google.common.f.h d7 = f552a.d();
                d7.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                com.google.common.f.h hVar2 = d7;
                hVar2.ak(2687);
                hVar2.p("BT not required, stopping SCO");
                this.c.h();
            }
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final boolean q() {
        return this.r;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final boolean r() {
        return (s() && this.c.b() == 12) || this.d.isBluetoothA2dpOn();
    }

    final boolean s() {
        boolean z;
        synchronized (this.h) {
            z = z(this.i);
        }
        return z;
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void t(f fVar, com.google.android.libraries.search.d.e eVar, c cVar) {
        ab abVar = com.google.common.f.a.e.a;
        f fVar2 = fVar;
        if (z(fVar)) {
            fVar2 = fVar;
            if (eVar == com.google.android.libraries.search.d.e.CONNECTION_TYPE_NONE) {
                com.google.common.f.h e = f552a.e();
                e.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                com.google.common.f.h hVar = e;
                hVar.ak(2695);
                hVar.p("CONNECTION_TYPE_NONE for BT route, forcing BT off.");
                fVar2 = f.ROUTE_NO_BLUETOOTH;
            }
        }
        synchronized (this.h) {
            this.t = cVar;
            com.google.android.libraries.search.d.e eVar2 = eVar;
            if (eVar == com.google.android.libraries.search.d.e.CONNECTION_TYPE_ANY) {
                eVar2 = com.google.android.libraries.search.d.e.CONNECTION_TYPE_NONE;
            }
            if (fVar2 != this.i || eVar2 != this.j) {
                com.google.common.f.h d = f552a.d();
                d.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                com.google.common.f.h hVar2 = d;
                hVar2.ak(2693);
                hVar2.O("Route changed: %s->%s,%s->%s", this.i, fVar2, this.j, eVar2);
                if (!z(this.i) && z(fVar2)) {
                    this.l = false;
                }
                this.i = fVar2;
                this.j = eVar2;
                this.m = true;
                this.e.n("updateRoute: synchronizeBluetoothState", new b(this, 0));
            }
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final void u(String str) {
        ab abVar = com.google.common.f.a.e.a;
        cl.u(!i.d(com.google.android.apps.gsa.speech.audio.b.a.class));
        cl.u(!i.d(b.class));
        Object obj = this.h;
        ai b = ai.b();
        synchronized (obj) {
            try {
                if (!s()) {
                    y();
                    long a2 = b.a();
                    if (a2 > 2000) {
                        com.google.common.f.h f = f552a.f();
                        f.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                        com.google.common.f.h hVar = f;
                        hVar.ak(2718);
                        hVar.r("awaitRouting took %dms", a2);
                    }
                    return;
                }
                try {
                    if (this.n != 12) {
                        com.google.common.f.h d = f552a.d();
                        d.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                        com.google.common.f.h hVar2 = d;
                        hVar2.ak(2705);
                        int i = this.n;
                        String str2 = this.o;
                        String str3 = str2;
                        if (str2 == null) {
                            str3 = "(null)";
                        }
                        String str4 = str;
                        if (str == null) {
                            str4 = "(null)";
                        }
                        hVar2.Q("awaitBluetoothRoutingLocked: mAwaitState=%d. Was expecting AWAIT_STATE_NONE(%d). Other states are AWAITING(%s) and CANCELLED(%d). mAwaitToken = %s, requested token = %s", Integer.valueOf(i), 12, 10, 11, str3, str4);
                        this.n = 12;
                        this.o = null;
                    } else {
                        this.n = 10;
                        this.o = str;
                        if (this.c.b() == 12) {
                            this.n = 12;
                            this.o = null;
                        } else if (this.l) {
                            com.google.common.f.h f2 = f552a.f();
                            f2.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                            com.google.common.f.h hVar3 = f2;
                            hVar3.ak(2703);
                            hVar3.p("SCO connection has failed");
                            this.n = 12;
                            this.o = null;
                        } else {
                            long j = this.i == f.ROUTE_BLUETOOTH_REQUIRED ? 1000L : 200L;
                            long millis = this.b.e().toMillis();
                            long j2 = j;
                            while (this.c.a() == 0 && j2 > 0 && this.n != 11) {
                                try {
                                    this.h.wait(j2);
                                    j2 = (millis + j) - this.b.e().toMillis();
                                } catch (InterruptedException e) {
                                    com.google.common.f.h f3 = f552a.f();
                                    f3.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                                    com.google.common.f.h g = f3.g(e);
                                    g.ak(2701);
                                    g.p("Thread was interrupted, aborting await");
                                }
                            }
                            if (this.n != 11) {
                                int a3 = this.c.a();
                                com.google.android.apps.gsa.speech.audio.a.j c = this.c.c();
                                if (a3 == 0) {
                                    com.google.common.f.h f4 = f552a.f();
                                    f4.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                                    com.google.common.f.h hVar4 = f4;
                                    hVar4.ak(2698);
                                    hVar4.p("Timed out waiting for BT device state");
                                    this.l = true;
                                } else if (a3 != 2 && c != null) {
                                    long millis2 = this.b.e().toMillis();
                                    long j3 = 2000;
                                    while (true) {
                                        if ((this.c.b() == 11 || this.m) && j3 > 0 && this.n != 11) {
                                            try {
                                                this.h.wait(j3);
                                                j3 = (millis2 + 2000) - this.b.e().toMillis();
                                            } catch (InterruptedException e2) {
                                                com.google.common.f.h f5 = f552a.f();
                                                f5.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                                                com.google.common.f.h g2 = f5.g(e2);
                                                g2.ak(2711);
                                                g2.p("Thread was interrupted, aborting await");
                                            }
                                        }
                                        this.n = 12;
                                        this.o = null;
                                    }
                                    if (this.n != 11) {
                                        int b2 = this.c.b();
                                        if (b2 == 11) {
                                            com.google.common.f.h f6 = f552a.f();
                                            f6.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                                            com.google.common.f.h hVar5 = f6;
                                            hVar5.ak(2708);
                                            hVar5.p("SCO connection timed out");
                                            this.l = true;
                                            h hVar6 = this.e;
                                            com.google.android.apps.gsa.nga.engine.e.b.a.e eVar = this.c;
                                            eVar.getClass();
                                            hVar6.n("awaitBluetoothScoConnectionLocked: stopSco", new b(eVar, 1));
                                        } else if (b2 == 10) {
                                            com.google.common.f.h f7 = f552a.f();
                                            f7.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                                            com.google.common.f.h hVar7 = f7;
                                            hVar7.ak(2707);
                                            hVar7.p("SCO connection attempt failed");
                                        } else {
                                            this.n = 12;
                                            this.o = null;
                                        }
                                    }
                                    this.n = 12;
                                    this.o = null;
                                }
                            }
                        }
                    }
                    y();
                    long a4 = b.a();
                    if (a4 > 2000) {
                        com.google.common.f.h f8 = f552a.f();
                        f8.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                        com.google.common.f.h hVar8 = f8;
                        hVar8.ak(2714);
                        hVar8.r("awaitRouting took %dms", a4);
                    }
                } finally {
                    this.n = 12;
                    this.o = null;
                }
            } catch (Throwable th) {
                y();
                long a5 = b.a();
                if (a5 > 2000) {
                    com.google.common.f.h f9 = f552a.f();
                    f9.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                    com.google.common.f.h hVar9 = f9;
                    hVar9.ak(2716);
                    hVar9.r("awaitRouting took %dms", a5);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final int v() {
        synchronized (this.h) {
            if (this.c.b() != 12 && (!this.s.i(eu.bB) || !this.d.isBluetoothScoOn())) {
                com.google.common.f.h d = f552a.d();
                d.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
                com.google.common.f.h hVar = d;
                hVar.ak(2670);
                hVar.s("getOutputStream: STREAM_MUSIC (SCO state was %s)", com.google.android.apps.gsa.nga.engine.e.b.a.e.d(this.c.b()));
                return 3;
            }
            com.google.common.f.h d2 = f552a.d();
            d2.aj(com.google.common.f.a.e.a, "NgaAudioRouter");
            com.google.common.f.h hVar2 = d2;
            hVar2.ak(2669);
            hVar2.p("getOutputStream: STREAM_VOICE_CALL");
            return 0;
        }
    }

    @Override // com.google.android.apps.gsa.x.a.e
    public final AudioAttributes w() {
        if (v() == 0) {
            AudioAttributes.Builder builder = this.f;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }
        AudioAttributes.Builder builder2 = this.g;
        if (builder2 != null) {
            return builder2.build();
        }
        return null;
    }

    @Override // com.google.android.apps.gsa.speech.audio.a.g
    public final void x() {
        i.b(com.google.android.apps.gsa.speech.audio.b.a.class);
        ab abVar = com.google.common.f.a.e.a;
        synchronized (this.h) {
            p();
            this.h.notify();
        }
    }
}
