package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/room/MultiInstanceInvalidationService.class */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f79a;
    public final Map b = new LinkedHashMap();
    public final RemoteCallbackList c = new z(this);
    private final n d = new n(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
