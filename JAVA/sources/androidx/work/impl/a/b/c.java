package androidx.work.impl.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.work.af;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/c.class */
public final class c extends f {
    public c(Context context, b bVar) {
        super(context, bVar);
    }

    @Override // androidx.work.impl.a.b.f
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.a.b.i
    public final /* synthetic */ Object b() {
        Boolean valueOf;
        Intent registerReceiver = this.f171a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            af.a();
            Log.e(d.a, "getInitialState - null intent received");
            valueOf = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", -1);
            float f = intExtra2;
            float f2 = intExtra3;
            if (intExtra == 1 || f / f2 > 0.15f) {
                z = true;
            }
            valueOf = Boolean.valueOf(z);
        }
        return valueOf;
    }

    @Override // androidx.work.impl.a.b.f
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        af.a().c(d.a, "Received ".concat(String.valueOf(intent.getAction())));
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(true);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(false);
            }
        }
    }
}
