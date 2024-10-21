package com.google.android.apps.gsa.search.core.service.e.a.a;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/a/a/c.class */
public final class c {

    /* renamed from: a */
    public final b f1173a;
    public final Queue b = new ConcurrentLinkedQueue();
    public volatile a c;

    public c(b bVar) {
        this.f1173a = bVar;
    }

    public final String toString() {
        return this.b.toString();
    }
}
