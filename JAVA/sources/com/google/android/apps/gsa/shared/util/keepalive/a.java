package com.google.android.apps.gsa.shared.util.keepalive;

import android.app.Notification;
import android.app.NotificationManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.shared.k.cy;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/keepalive/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f1560a;
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public Integer d;
    private final e.a e;
    private final d f;

    public a(d dVar, NotificationManager notificationManager, e.a aVar) {
        this.f = dVar;
        this.f1560a = notificationManager;
        this.e = aVar;
    }

    public final void a(boolean z) {
        Integer num = this.d;
        num.getClass();
        int intValue = num.intValue();
        Notification notification = (Notification) this.b.get(intValue);
        this.c.delete(intValue);
        if (this.c.size() != 0) {
            Integer valueOf = Integer.valueOf(this.c.keyAt(0));
            this.d = valueOf;
            b(valueOf.intValue(), (Notification) this.b.get(this.d.intValue()), true, true);
            if (!z) {
                b(intValue, notification, false, false);
                return;
            }
        } else {
            if (!z) {
                if (!((com.google.android.apps.gsa.shared.k.c) this.e.a()).w(cy.f)) {
                    this.f.b(false);
                    return;
                }
                this.f.b(true);
                b(intValue, notification, false, false);
                this.d = null;
                return;
            }
            this.d = null;
            this.f.b(true);
        }
        this.b.delete(intValue);
    }

    public final void b(int i, Notification notification, boolean z, boolean z2) {
        this.b.put(i, notification);
        if (z) {
            this.c.put(i, true);
        } else {
            this.c.delete(i);
        }
        if (z2) {
            this.d = Integer.valueOf(i);
        }
        if (!z || z2) {
            notification.flags &= -3;
        } else {
            notification.flags |= 2;
        }
        if (z && z2) {
            this.f.a(i, notification);
        } else {
            com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
            this.f1560a.notify(i, notification);
        }
    }

    public final boolean c() {
        Integer num = this.d;
        return num != null && num.intValue() == 131077;
    }
}
