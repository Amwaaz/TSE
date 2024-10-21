package com.google.android.apps.gsa.nga.engine.m.c.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.engine.t.a.n;
import com.google.android.apps.gsa.nga.engine.t.c;
import com.google.android.apps.gsa.nga.shared.android.a.e;
import com.google.android.apps.gsa.nga.shared.android.a.f;
import com.google.android.apps.gsa.nga.shared.android.i;
import com.google.android.apps.gsa.nga.shared.android.l;
import com.google.android.apps.gsa.nga.shared.android.m;
import com.google.android.apps.gsa.nga.shared.p.b;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.util.concurrent.cn;
import java.util.function.Consumer;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/m/c/a/x.class */
public final class x extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f620a;
    public final f b;
    public final com.google.android.apps.gsa.nga.engine.ak.u.c c;
    public final b d;
    private final BroadcastReceiver e;
    private final y f;

    public x(Context context, f fVar, com.google.android.apps.gsa.nga.engine.ak.u.c cVar, b bVar, y yVar, n nVar, a aVar) {
        super(nVar);
        this.f620a = context;
        this.b = fVar;
        this.c = cVar;
        this.d = bVar;
        this.f = yVar;
        this.e = new m(new l() { // from class: com.google.android.apps.gsa.nga.engine.m.c.a.v
            @Override // com.google.android.apps.gsa.nga.shared.android.l
            public final void a(Intent intent) {
                i.b(intent).ifPresent(new w(0));
            }
        }, aVar, eu.bT);
    }

    public static Intent a(x xVar, Context context, Consumer consumer) {
        Intent a2 = i.a(xVar, consumer);
        a2.setAction("nga:screenshot_notification_callback_action");
        a2.setPackage(context.getPackageName());
        return a2;
    }

    final void c(String str) {
        e(str, new t(0));
    }

    public final void e(String str, e eVar) {
        this.b.c(com.google.android.apps.gsa.shared.y.a.NGA_SCREENSHOT, com.google.android.apps.gsa.nga.shared.android.a.c.a, new u(str, eVar));
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final boolean gV() {
        return this.f.c().f619a;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn h() {
        androidx.core.content.a.f(this.f620a, this.e, new IntentFilter("nga:screenshot_notification_callback_action"), null, 2);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.t.c
    public final cn i() {
        this.f620a.unregisterReceiver(this.e);
        return com.google.android.apps.gsa.v.c.b;
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final String l() {
        return "ScreenshotNotificationController";
    }

    @Override // com.google.android.apps.gsa.nga.engine.g.a
    public final int n() {
        return 16;
    }
}
