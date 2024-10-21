package com.google.android.apps.gsa.shared.util.c.a;

import android.os.Handler;
import android.os.MessageQueue;
import com.google.android.apps.gsa.shared.util.c.bp;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/a/ao.class */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1515a;
    private final MessageQueue b;
    private final Map c = new HashMap(10);

    public ao(Handler handler, MessageQueue messageQueue) {
        this.f1515a = handler;
        this.b = messageQueue;
    }

    public final void a(bp bpVar) {
        MessageQueue.IdleHandler idleHandler;
        this.f1515a.removeCallbacks(bpVar);
        synchronized (this.c) {
            idleHandler = this.c.containsKey(bpVar) ? (MessageQueue.IdleHandler) this.c.remove(bpVar) : null;
        }
        if (idleHandler != null) {
            this.b.removeIdleHandler(idleHandler);
        }
    }
}
