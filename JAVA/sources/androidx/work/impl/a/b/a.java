package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.work.af;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/a.class */
public final class a extends f {
    public a(Context context, b bVar) {
        super(context, bVar);
    }

    @Override // androidx.work.impl.a.b.f
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // androidx.work.impl.a.b.i
    public final /* synthetic */ Object b() {
        Boolean valueOf;
        Intent registerReceiver = this.f171a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            af.a();
            Log.e(b.a, "getInitialState - null intent received");
            valueOf = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            valueOf = Boolean.valueOf(z);
        }
        return valueOf;
    }

    @Override // androidx.work.impl.a.b.f
    public final void c(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        af.a().c(b.a, "Received ".concat(action));
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    f(false);
                    return;
                }
                return;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    f(false);
                    return;
                }
                return;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    f(true);
                    return;
                }
                return;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    f(true);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
