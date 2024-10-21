package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import android.content.BroadcastReceiver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/au.class */
public final class au extends m.h.b.n implements m.h.a.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f907a;
    final Object b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.f907a = obj;
        this.b = obj2;
    }

    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            ((com.google.android.apps.search.assistant.surfaces.bisto.interactor.g.a.c) this.f907a).k.remove(this.b);
            return m.w.a;
        }
        if (i != 1) {
            ((bc) this.f907a).b.unregisterReceiver((BroadcastReceiver) this.b);
            return m.w.a;
        }
        ((ac) this.f907a).b.unregisterReceiver((BroadcastReceiver) this.b);
        return m.w.a;
    }
}
