package com.google.android.apps.gsa.shared.util.keepalive;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.media.a$;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.f.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/d.class */
public class d {
    private static final j e = j.i("com.google.android.apps.gsa.shared.util.keepalive.d");
    public boolean b;
    public StandaloneKeepAlive$ForegroundService c;
    private final Context f;
    private final e.a g;
    private final Intent h;
    private final Intent i;
    private boolean k;
    private boolean l;
    public int d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1563a = new Object();
    private final List j = new ArrayList();

    public d(Context context, e.a aVar) {
        this.f = context;
        this.g = aVar;
        this.h = new Intent(context, (Class<?>) StandaloneKeepAlive$KeepAliveService.class);
        this.i = new Intent(context, (Class<?>) StandaloneKeepAlive$ForegroundService.class);
    }

    private final boolean f(String str) {
        return androidx.core.content.a.c(this.f, str) == 0;
    }

    private final boolean g(Intent intent, boolean z) {
        boolean z2;
        try {
            if (z) {
                a$.ExternalSyntheticApiModelOutline0.m(this.f, intent);
                z2 = false;
            } else {
                z2 = false;
                if (this.f.startService(intent) != null) {
                    z2 = true;
                }
            }
        } catch (IllegalStateException e2) {
            aus.b(e.f(), "Attempting to start service when the app is in background is not allowed on Android O+. Intent: %s", intent, (char) 9390, e2);
            z2 = false;
        }
        return z2;
    }

    public final void a(int i, Notification notification) {
        StandaloneKeepAlive$ForegroundService standaloneKeepAlive$ForegroundService;
        synchronized (this.f1563a) {
            if (this.k) {
                this.j.add(Pair.create(Integer.valueOf(i), notification));
                if (this.d != -1 && (standaloneKeepAlive$ForegroundService = this.c) != null) {
                    d(standaloneKeepAlive$ForegroundService);
                }
            } else {
                if (!this.j.isEmpty() && !this.l) {
                    for (Pair pair : this.j) {
                        ((NotificationManager) this.g.a()).notify(((Integer) pair.first).intValue(), (Notification) pair.second);
                    }
                }
                this.j.clear();
                this.j.add(Pair.create(Integer.valueOf(i), notification));
                this.k = true;
                if (!this.b) {
                    this.b = true;
                    g(this.i, true);
                }
            }
        }
    }

    public final void b(boolean z) {
        StandaloneKeepAlive$ForegroundService standaloneKeepAlive$ForegroundService;
        synchronized (this.f1563a) {
            if (this.k) {
                this.l = z;
                this.k = false;
                if (this.d != -1 && (standaloneKeepAlive$ForegroundService = this.c) != null) {
                    d(standaloneKeepAlive$ForegroundService);
                }
            }
        }
    }

    public final void c() {
        this.f.stopService(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (f("android.permission.ACCESS_FINE_LOCATION") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.apps.gsa.shared.util.keepalive.StandaloneKeepAlive$ForegroundService r6) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.keepalive.d.d(com.google.android.apps.gsa.shared.util.keepalive.StandaloneKeepAlive$ForegroundService):void");
    }

    public final boolean e() {
        return g(this.h, false);
    }
}
