package com.google.android.apps.gsa.staticplugins.opa.ambient.c.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import androidx.e.a.g;
import com.google.android.apps.gsa.assistant.shared.q;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.shared.util.permissions.c;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.apps.tiktok.tracing.contrib.c.e;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.fl;
import com.google.common.b.ha;
import com.google.common.b.ni;
import com.google.common.f.a.d;
import com.google.common.i.o;
import com.google.common.i.p;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cr;
import com.google.common.util.concurrent.dl;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ba;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/c/a/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1748a;
    public final AudioManager b;
    public final d c;
    public final a d;
    public final cr e;
    private final com.google.android.libraries.g.a f;

    public j(Context context, AudioManager audioManager, a aVar, com.google.android.libraries.g.a aVar2, cr crVar, com.google.android.apps.gsa.opa.a.a.a aVar3) {
        this.f1748a = context;
        this.b = audioManager;
        this.d = aVar;
        this.f = aVar2;
        this.e = crVar;
        this.c = aVar3.a("headsetCtxPrv");
    }

    public static Optional c(List list, boolean z) {
        return Collection._EL.stream(list).filter(new a(z)).findFirst();
    }

    public static boolean e(Context context) {
        return (androidx.core.d.a.b() || Build.VERSION.SDK_INT > 30) ? c.a(context) : androidx.core.content.a.c(context, "android.permission.BLUETOOTH") == 0;
    }

    public static boolean i(Intent intent) {
        return "android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.getIntExtra("state", 0) == 0;
    }

    private final cn k(Context context, int i) {
        if (e(context)) {
            return e.g(g.a(new b(this, context, i))).j(5L, TimeUnit.SECONDS, this.e).e(TimeoutException.class, new c(this), this.e);
        }
        com.google.common.f.a.a f = this.c.f();
        f.ak(16128);
        f.p("Bluetooth permissions not granted, returning an empty list");
        int i2 = fl.e;
        return dl.n(ni.a);
    }

    public final cn a() {
        boolean g = g();
        boolean f = f();
        com.google.common.f.a.a d = this.c.d();
        d.ak(16127);
        d.M("getBluetoothHeadsetState(): profiles connected: headset:%b a2dp:%b", g, f);
        ArrayList arrayList = new ArrayList();
        if (this.d.i(bc.Q)) {
            arrayList.add(k(this.f1748a, 1));
        }
        arrayList.add(k(this.f1748a, 2));
        cn t = dl.t(arrayList);
        f fVar = new f(this);
        return i.g(t, ex.b(fVar), this.e);
    }

    public final Optional b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            com.google.common.f.a.a f = this.c.f();
            f.ak(16130);
            f.p("No device in intent");
            return Optional.empty();
        }
        ba j = j();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.a aVar = com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.a.b;
        j.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar = j.instance;
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar2 = com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d.a;
        dVar.c = aVar.d;
        dVar.b |= 1;
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.c cVar = q.a(bluetoothDevice) ? com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.c.d : com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.c.c;
        j.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar3 = j.instance;
        dVar3.d = cVar.e;
        dVar3.b |= 4;
        String name = bluetoothDevice.getName();
        j.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar4 = j.instance;
        name.getClass();
        dVar4.b |= 8;
        dVar4.e = name;
        String d = d(Optional.of(bluetoothDevice));
        j.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar5 = j.instance;
        dVar5.b |= 32;
        dVar5.g = d;
        return Optional.of(j.build());
    }

    public final String d(Optional optional) {
        if (!this.d.i(bc.am) || optional.isEmpty()) {
            return "";
        }
        String str = (String) optional.map(new e(2)).orElse("");
        String str2 = (String) optional.map(new e(0)).orElse("");
        if (str.isEmpty() && str2.isEmpty()) {
            return "";
        }
        String concat = str.concat(str2);
        int i = p.b;
        return o.a.b(concat).toString();
    }

    public final boolean f() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean z = false;
        if (defaultAdapter != null) {
            z = false;
            if (defaultAdapter.getProfileConnectionState(2) == 2) {
                z = true;
            }
        }
        com.google.common.f.a.a d = this.c.d();
        d.ak(16141);
        d.s("is a2dp profile connected? %s", Boolean.valueOf(z));
        return z;
    }

    public final boolean g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean z = false;
        if (defaultAdapter != null) {
            z = false;
            if (defaultAdapter.getProfileConnectionState(1) == 2) {
                z = true;
            }
        }
        com.google.common.f.a.a d = this.c.d();
        d.ak(16142);
        d.M("is headset profile connected? %s check_enabled? %b", z, this.d.i(bc.Q));
        return z;
    }

    public final boolean h(Intent intent) {
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            boolean z = intent.getIntExtra("state", 0) > 0;
            com.google.common.f.a.a d = this.c.d();
            d.ak(16148);
            d.s("headset plug, got intent w/ extra: %s", Boolean.valueOf(z));
            return z;
        }
        if (this.b.isWiredHeadsetOn()) {
            return true;
        }
        for (AudioDeviceInfo audioDeviceInfo : this.b.getDevices(3)) {
            if (ha.t(4, 3, 22).contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                com.google.common.f.a.a d2 = this.c.d();
                d2.ak(16147);
                d2.p("got wired device, returning true");
                return true;
            }
        }
        com.google.common.f.a.a d3 = this.c.d();
        d3.ak(16146);
        d3.p("wired -- returning false");
        return false;
    }

    public final ba j() {
        ba createBuilder = com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d.a.createBuilder();
        long a2 = this.f.a();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.d dVar = createBuilder.instance;
        dVar.b |= 16;
        dVar.f = a2;
        return createBuilder;
    }
}
