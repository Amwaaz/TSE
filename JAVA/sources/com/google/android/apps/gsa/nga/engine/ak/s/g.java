package com.google.android.apps.gsa.nga.engine.ak.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.shared.n.k;
import com.google.android.apps.gsa.shared.util.c.a.aw;
import com.google.android.libraries.search.assistant.ai.c.a;
import com.google.common.a.an;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/s/g.class */
public final class g extends com.google.android.apps.gsa.nga.engine.t.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.apps.gsa.nga.shared.n.e f442a;
    public final com.google.android.apps.gsa.nga.shared.n.e b;
    public final a c;
    public Optional d;
    private final e e;
    private final Context f;
    private final BroadcastReceiver g;

    public g(n nVar, y yVar, e eVar, Context context, aw awVar, k kVar) {
        super(nVar, yVar);
        this.e = eVar;
        this.f = context;
        com.google.android.libraries.gsa.h.h a2 = awVar.a(f.class);
        final int i = 1;
        this.f442a = kVar.a(a2, new com.google.android.apps.gsa.shared.util.c.d(i) { // from class: com.google.android.apps.gsa.nga.engine.ak.s.b

            /* renamed from: a, reason: collision with root package name */
            private final int f438a;

            {
                this.f438a = i;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f438a == 0) {
                    ((com.google.android.apps.gsa.nga.engine.n.e.y) obj).b.d(((StatusBarNotification) obj2).getKey());
                    return;
                }
                com.google.android.apps.gsa.nga.engine.n.e.y yVar2 = (com.google.android.apps.gsa.nga.engine.n.e.y) obj;
                com.google.android.apps.gsa.nga.engine.ak.r.k kVar2 = yVar2.f629a;
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj2;
                if (kVar2.c(statusBarNotification).isEmpty()) {
                    return;
                }
                if (!"jp.naver.line.android".equals(statusBarNotification.getPackageName()) || "NOTIFICATION_TAG_MESSAGE".equals(statusBarNotification.getTag())) {
                    an anVar = yVar2.b;
                    anVar.a.put(statusBarNotification.getKey(), statusBarNotification);
                }
            }
        });
        final int i2 = 0;
        this.b = kVar.a(a2, new com.google.android.apps.gsa.shared.util.c.d(i2) { // from class: com.google.android.apps.gsa.nga.engine.ak.s.b

            /* renamed from: a, reason: collision with root package name */
            private final int f438a;

            {
                this.f438a = i2;
            }

            @Override // com.google.android.apps.gsa.shared.util.c.d
            public final void a(Object obj, Object obj2) {
                if (this.f438a == 0) {
                    ((com.google.android.apps.gsa.nga.engine.n.e.y) obj).b.d(((StatusBarNotification) obj2).getKey());
                    return;
                }
                com.google.android.apps.gsa.nga.engine.n.e.y yVar2 = (com.google.android.apps.gsa.nga.engine.n.e.y) obj;
                com.google.android.apps.gsa.nga.engine.ak.r.k kVar2 = yVar2.f629a;
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj2;
                if (kVar2.c(statusBarNotification).isEmpty()) {
                    return;
                }
                if (!"jp.naver.line.android".equals(statusBarNotification.getPackageName()) || "NOTIFICATION_TAG_MESSAGE".equals(statusBarNotification.getTag())) {
                    an anVar = yVar2.b;
                    anVar.a.put(statusBarNotification.getKey(), statusBarNotification);
                }
            }
        });
        this.d = Optional.empty();
        this.c = new c(this);
        this.g = new d(this, eVar);
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn h() {
        com.google.android.apps.gsa.notificationlistener.h.d(this.e.f441a);
        com.google.android.apps.gsa.notificationlistener.a.b(this.e.f441a.getApplicationContext(), this.c);
        androidx.core.content.a.f(this.f, this.g, new IntentFilter("com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED"), null, 2);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    protected final cn i() {
        this.f.unregisterReceiver(this.g);
        this.d.ifPresent(new a());
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "NotificationSetupHelper";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 46;
    }
}
