package com.google.android.apps.gsa.nga.shared.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.d.e;
import com.google.android.apps.gsa.shared.k.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/android/m.class */
public final class m extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.apps.gsa.shared.util.q.a f849a;
    private final d b;
    private final l c;

    public m(l lVar, com.google.android.apps.gsa.shared.util.q.a aVar, d dVar) {
        this.c = lVar;
        this.f849a = aVar;
        this.b = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e.i(110);
        if (this.f849a.i(this.b)) {
            this.c.a(intent);
        }
    }
}
