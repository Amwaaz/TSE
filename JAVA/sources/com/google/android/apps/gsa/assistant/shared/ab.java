package com.google.android.apps.gsa.assistant.shared;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.common.o.o.bd;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/ab.class */
public interface ab {
    int a(int i, int i2);

    PendingIntent b(PendingIntent pendingIntent, com.google.android.libraries.logging.j jVar);

    PendingIntent d(Intent intent, com.google.android.libraries.logging.j jVar);

    void e();

    void f(String str, bd bdVar);

    void g();

    void h(boolean z);

    void i(int i);

    void j(com.google.g.x.c.c cVar, String str);

    void k();

    void l();

    void m();

    void n(int i, int i2);

    boolean o();

    boolean p();

    Notification q();

    PendingIntent r(com.google.android.libraries.logging.j jVar);

    PendingIntent s(com.google.android.libraries.logging.j jVar, long j);

    void t(int i);
}
