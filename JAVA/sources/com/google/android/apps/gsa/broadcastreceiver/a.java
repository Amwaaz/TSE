package com.google.android.apps.gsa.broadcastreceiver;

import android.content.IntentFilter;
import com.google.common.b.gy;
import com.google.common.b.ha;
import com.google.common.b.qj;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/broadcastreceiver/a.class */
public final class a {

    /* renamed from: a */
    public static final long f332a = TimeUnit.SECONDS.toMillis(9);
    public static final ha b;
    private static final ha c;

    static {
        ha w = ha.w("android.intent.action.HEADSET_PLUG", "android.bluetooth.device.action.UUID", "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.intent.action.USER_PRESENT", "android.intent.action.ACTION_POWER_CONNECTED", new String[]{"android.intent.action.ACTION_POWER_DISCONNECTED", "android.bluetooth.mapmce.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.pbapclient.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.headsetclient.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.a2dp-sink.profile.action.CONNECTION_STATE_CHANGED"});
        c = w;
        gy gyVar = new gy();
        IntentFilter intentFilter = new IntentFilter();
        qj j = w.j();
        while (j.hasNext()) {
            intentFilter.addAction((String) j.next());
        }
        intentFilter.addAction("android.intent.action.PACKAGES_SUSPENDED");
        intentFilter.addAction("android.intent.action.PACKAGES_UNSUSPENDED");
        gyVar.h(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        gyVar.h(intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        intentFilter3.addCategory("android.bluetooth.headset.intent.category.companyid.224");
        gyVar.h(intentFilter3);
        b = gyVar.g();
    }
}
