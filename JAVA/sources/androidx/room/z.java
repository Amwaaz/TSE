package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* loaded from: classes-dex2jar.jar:androidx/room/z.class */
public final class z extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    final MultiInstanceInvalidationService f140a;

    public z(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f140a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((l) iInterface).getClass();
        obj.getClass();
        this.f140a.b.remove((Integer) obj);
    }
}
