package com.google.android.apps.gsa.nga.engine.e.b.a;

import android.content.Intent;
import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.speech.audio.a.j;
import com.google.android.apps.gsa.speech.audio.a.n;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/e/b/a/d.class */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    final e f548a;

    public d(e eVar) {
        this.f548a = eVar;
    }

    @Override // com.google.android.apps.gsa.speech.audio.a.n
    protected final void a(Intent intent, j jVar) {
        if (this.f548a.e.i(eu.bL)) {
            e eVar = this.f548a;
            eVar.c.n(aus.l(jVar, intent, "BluetoothController: onReceive[intent=", ", device=", "]"), new c(this, intent, jVar));
        }
    }
}
