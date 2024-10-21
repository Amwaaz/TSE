package com.google.android.apps.gsa.shared.util.c.a;

import android.os.Process;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/h.class */
final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final i f1530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f1530a = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(this.f1530a.b);
        } catch (SecurityException e) {
            com.google.common.f.h g = i.f1531a.f().g(e);
            g.ak(9337);
            g.q("Failed to set thread priority %d", this.f1530a.b);
            int i = com.google.android.apps.gsa.shared.util.b.h.a;
        }
        com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
        super.run();
    }
}
