package androidx.work.impl.a.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.af;
import androidx.work.impl.utils.b.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/b/f.class */
public abstract class f extends i {
    private final BroadcastReceiver e;

    public f(Context context, b bVar) {
        super(context, bVar);
        this.e = new e(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // androidx.work.impl.a.b.i
    public final void d() {
        af.a().c(g.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.f171a.registerReceiver(this.e, a());
    }

    @Override // androidx.work.impl.a.b.i
    public final void e() {
        af.a().c(g.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.f171a.unregisterReceiver(this.e);
    }
}
