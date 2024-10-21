package com.google.android.apps.gsa.speech.audio.a;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/audio/a/n.class */
public abstract class n extends BroadcastReceiver {
    protected abstract void a(Intent intent, j jVar);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(19);
        a(intent, intent.hasExtra("android.bluetooth.device.extra.DEVICE") ? new j((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) : null);
    }
}
