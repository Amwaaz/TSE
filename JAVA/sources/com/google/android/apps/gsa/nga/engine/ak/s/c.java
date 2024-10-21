package com.google.android.apps.gsa.nga.engine.ak.s;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.search.assistant.ai.c.a;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ak/s/c.class */
final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    final g f439a;

    public c(g gVar) {
        this.f439a = gVar;
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void a() {
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void b(boolean z) {
        this.f439a.d = Optional.empty();
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void c(int i) {
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void d(int i) {
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f439a.f442a.a(statusBarNotification);
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f439a.b.a(statusBarNotification);
    }

    @Override // com.google.android.libraries.search.assistant.ai.c.a
    public final void g(com.google.android.apps.gsa.notificationlistener.d dVar) {
        this.f439a.d = Optional.of(dVar);
    }
}
