package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import m.a;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/ai.class */
public class ai extends Service implements ae {

    /* renamed from: a, reason: collision with root package name */
    public final bx f65a = new bx(this);

    @Override // androidx.lifecycle.ae
    public final w getLifecycle() {
        return this.f65a.f74a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.f65a.a(u.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f65a.a(u.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        bx bxVar = this.f65a;
        bxVar.a(u.ON_STOP);
        bxVar.a(u.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @a
    public final void onStart(Intent intent, int i) {
        this.f65a.a(u.ON_START);
        super.onStart(intent, i);
    }
}
