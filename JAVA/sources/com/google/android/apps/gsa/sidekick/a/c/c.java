package com.google.android.apps.gsa.sidekick.a.c;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.core.d.e$;
import androidx.media.a$;
import androidx.slice.o$;
import com.google.android.apps.gsa.shared.util.b.d;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.f.j;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/sidekick/a/c/c.class */
public class c implements com.google.android.apps.gsa.shared.util.debug.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1580a = j.i("com.google.android.apps.gsa.sidekick.a.c.c");
    public final NotificationManager b;

    public c(NotificationManager notificationManager) {
        this.b = notificationManager;
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        fVar.d((Object) null).b("notificationsEnabled").a(new d(Boolean.valueOf(e$.ExternalSyntheticApiModelOutline0.m(this.b)), false));
        List m = a$.ExternalSyntheticApiModelOutline0.m(this.b);
        if (m != null) {
            Iterator it = m.iterator();
            while (it.hasNext()) {
                NotificationChannelGroup m2 = a$.ExternalSyntheticApiModelOutline0.m(it.next());
                f d = fVar.d((Object) null);
                d.b("groupId").a(new d(a$.ExternalSyntheticApiModelOutline0.m(m2), false));
                d.b("groupIsBlocked").a(new d(Boolean.valueOf(o$.ExternalSyntheticApiModelOutline1.m(m2)), false));
            }
        }
        List m$1 = a$.ExternalSyntheticApiModelOutline0.m$1(this.b);
        if (m$1 != null) {
            Iterator it2 = m$1.iterator();
            while (it2.hasNext()) {
                NotificationChannel m3 = a$.ExternalSyntheticApiModelOutline0.m(it2.next());
                f d2 = fVar.d((Object) null);
                d2.b("channelId").a(new d(a$.ExternalSyntheticApiModelOutline0.m$1(m3), false));
                d2.b("channelName").a(new d(a$.ExternalSyntheticApiModelOutline0.m(m3), false));
                d2.b("channelImportance").a(new d(Integer.valueOf(a$.ExternalSyntheticApiModelOutline0.m(m3)), false));
                if (a$.ExternalSyntheticApiModelOutline0.m(m3) != null) {
                    d2.b("channelGroupId").a(new d(a$.ExternalSyntheticApiModelOutline0.m(m3), false));
                }
            }
        }
    }
}
