package com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.a.h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.c.a.j;
import com.google.android.apps.gsa.v.c;
import com.google.apps.tiktok.tracing.au;
import com.google.common.f.a.a;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/d/d/k.class */
final class k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final l f1739a;

    public k(l lVar) {
        this.f1739a = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cn n;
        Object obj;
        cn b;
        e.i(60);
        au e = this.f1739a.f.e("HeadsetStateTriggerSource#onReceive");
        try {
            String action = intent.getAction();
            String str = action;
            if (action == null) {
                str = "empty";
            }
            a d = this.f1739a.f1740a.d();
            d.ak(16083);
            d.s("HeadsetState: onReceive=%s", str);
            l lVar = this.f1739a;
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.e eVar = lVar.j;
            if (eVar == null) {
                a d2 = lVar.f1740a.d();
                d2.ak(16084);
                d2.p("HeadsetState: No listener! bailing.");
            } else {
                if (intent == null) {
                    a f = lVar.f1740a.f();
                    f.ak(16097);
                    f.p("HeadsetState: null intent");
                    b = c.b;
                } else {
                    j jVar = lVar.c;
                    String action2 = intent.getAction();
                    if (jVar.h(intent)) {
                        ba j = jVar.j();
                        a aVar = a.b;
                        j.copyOnWrite();
                        d dVar = j.instance;
                        d dVar2 = d.a;
                        dVar.c = aVar.d;
                        dVar.b |= 1;
                        c cVar = c.b;
                        j.copyOnWrite();
                        d dVar3 = j.instance;
                        dVar3.d = cVar.e;
                        dVar3.b |= 4;
                        n = dl.n(Optional.of(j.build()));
                    } else if (j.i(intent)) {
                        if (j.e(jVar.f1748a)) {
                            a d3 = jVar.c.d();
                            d3.ak(16125);
                            d3.p("getBluetoothHeadsetState(): wired headset d/ced.");
                            n = jVar.a();
                        } else {
                            a f2 = jVar.c.f();
                            f2.ak(16126);
                            f2.p("extractHeadsetState(): No permissions, wired headset disconnected.");
                            ba j2 = jVar.j();
                            c cVar2 = c.a;
                            j2.copyOnWrite();
                            d dVar4 = j2.instance;
                            d dVar5 = d.a;
                            dVar4.d = cVar2.e;
                            dVar4.b |= 4;
                            a aVar2 = a.c;
                            j2.copyOnWrite();
                            d dVar6 = j2.instance;
                            dVar6.c = aVar2.d;
                            dVar6.b |= 1;
                            n = dl.n(Optional.of(j2.build()));
                        }
                    } else if (!j.e(jVar.f1748a)) {
                        a f3 = jVar.c.f();
                        f3.ak(16124);
                        f3.p("extractHeadsetState(): No permissions");
                        n = dl.n(Optional.empty());
                    } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action2)) {
                        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                        a d4 = jVar.c.d();
                        d4.ak(16123);
                        switch (intExtra) {
                            case 10:
                                obj = "STATE_OFF";
                                break;
                            case 11:
                                obj = "STATE_TURNING_ON";
                                break;
                            case 12:
                                obj = "STATE_ON";
                                break;
                            case 13:
                                obj = "STATE_TURNING_OFF";
                                break;
                            default:
                                obj = "ERROR";
                                break;
                        }
                        d4.s("Bluetooth setting toggled. State:[%s]", obj);
                        ba j3 = jVar.j();
                        c cVar3 = c.a;
                        j3.copyOnWrite();
                        d dVar7 = j3.instance;
                        d dVar8 = d.a;
                        dVar7.d = cVar3.e;
                        dVar7.b |= 4;
                        a aVar3 = a.c;
                        j3.copyOnWrite();
                        d dVar9 = j3.instance;
                        dVar9.c = aVar3.d;
                        dVar9.b |= 1;
                        n = dl.n(Optional.of(j3.build()));
                    } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE);
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        a d5 = jVar.c.d();
                        d5.ak(16120);
                        d5.H("Bluetooth adapter connection state to a profile changed. State:[%s] Device:[%s]", a.a.bm(intExtra2), a.a.t(bluetoothDevice));
                        if (intExtra2 == 2) {
                            a d6 = jVar.c.d();
                            d6.ak(16121);
                            d6.p("Adapter connected to some profile. Let's wait for the next intent which will be coming in.");
                            n = dl.n(Optional.empty());
                        } else {
                            a d7 = jVar.c.d();
                            d7.ak(16122);
                            d7.p("Adapter disconnected from all profiles.");
                            ba j4 = jVar.j();
                            c cVar4 = c.a;
                            j4.copyOnWrite();
                            d dVar10 = j4.instance;
                            d dVar11 = d.a;
                            dVar10.d = cVar4.e;
                            dVar10.b |= 4;
                            a aVar4 = a.c;
                            j4.copyOnWrite();
                            d dVar12 = j4.instance;
                            dVar12.c = aVar4.d;
                            dVar12.b |= 1;
                            n = dl.n(Optional.of(j4.build()));
                        }
                    } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
                        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        a d8 = jVar.c.d();
                        d8.ak(16115);
                        d8.H("A2DP profile connection state changed, State:[%s] Device:[%s]", a.a.bm(intExtra3), a.a.t(bluetoothDevice2));
                        if (intExtra3 == 2) {
                            n = !jVar.d.i(bc.aL) ? dl.n(jVar.b(bluetoothDevice2)) : jVar.a();
                        } else {
                            boolean g = jVar.g();
                            boolean f4 = jVar.f();
                            a d9 = jVar.c.d();
                            d9.ak(16116);
                            d9.M("A2DP device disconnected, profiles connected: headset:%b a2dp:%b", g, f4);
                            if (g) {
                                a d10 = jVar.c.d();
                                d10.ak(16119);
                                d10.p("A2DP device disconnected but still connected to headset profile");
                                n = !jVar.d.i(bc.aL) ? dl.n(Optional.empty()) : jVar.a();
                            } else if (f4) {
                                a d11 = jVar.c.d();
                                d11.ak(16118);
                                d11.p("A2DP device disconnected but still connected to the profile.");
                                n = !jVar.d.i(bc.aL) ? dl.n(Optional.empty()) : jVar.a();
                            } else {
                                a d12 = jVar.c.d();
                                d12.ak(16117);
                                d12.p("A2DP disconnected and headset profile disconnected");
                                ba j5 = jVar.j();
                                c cVar5 = c.a;
                                j5.copyOnWrite();
                                d dVar13 = j5.instance;
                                d dVar14 = d.a;
                                dVar13.d = cVar5.e;
                                dVar13.b |= 4;
                                a aVar5 = a.c;
                                j5.copyOnWrite();
                                d dVar15 = j5.instance;
                                dVar15.c = aVar5.d;
                                dVar15.b |= 1;
                                n = dl.n(Optional.of(j5.build()));
                            }
                        }
                    } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action2)) {
                        int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
                        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        a d13 = jVar.c.d();
                        d13.ak(16110);
                        d13.H("Headset profile connection state changed, State:[%s] Device:[%s]", a.a.bm(intExtra4), a.a.t(bluetoothDevice3));
                        if (intExtra4 == 2) {
                            n = !jVar.d.i(bc.aL) ? dl.n(jVar.b(bluetoothDevice3)) : jVar.a();
                        } else {
                            boolean g2 = jVar.g();
                            boolean f5 = jVar.f();
                            a d14 = jVar.c.d();
                            d14.ak(16111);
                            d14.M("Headset device disconnected, profiles connected: headset:%b a2dp:%b", g2, f5);
                            if (f5) {
                                a d15 = jVar.c.d();
                                d15.ak(16114);
                                d15.p("Headset disconnected but still connected to A2DP profile");
                                n = !jVar.d.i(bc.aL) ? dl.n(Optional.empty()) : jVar.a();
                            } else if (g2) {
                                a d16 = jVar.c.d();
                                d16.ak(16113);
                                d16.p("Headset device disconnected but still connected to the profile.");
                                n = !jVar.d.i(bc.aL) ? dl.n(Optional.empty()) : jVar.a();
                            } else {
                                a d17 = jVar.c.d();
                                d17.ak(16112);
                                d17.p("Headset disconnected and A2DP profile disconnected");
                                ba j6 = jVar.j();
                                c cVar6 = c.a;
                                j6.copyOnWrite();
                                d dVar16 = j6.instance;
                                d dVar17 = d.a;
                                dVar16.d = cVar6.e;
                                dVar16.b |= 4;
                                a aVar6 = a.c;
                                j6.copyOnWrite();
                                d dVar18 = j6.instance;
                                dVar18.c = aVar6.d;
                                dVar18.b |= 1;
                                n = dl.n(Optional.of(j6.build()));
                            }
                        }
                    } else {
                        a f6 = jVar.c.f();
                        f6.ak(16109);
                        f6.s("Unknown intent %s", action2);
                        n = dl.n(Optional.empty());
                    }
                    b = lVar.g.b(new i(lVar, com.google.apps.tiktok.tracing.contrib.c.e.g(n).h(new h(jVar, intent), jVar.e), eVar), lVar.e);
                }
                com.google.apps.tiktok.concurrent.k.d(b, "onReceive=%s failed", str);
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
