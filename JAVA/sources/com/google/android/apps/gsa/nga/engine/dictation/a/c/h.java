package com.google.android.apps.gsa.nga.engine.dictation.a.c;

import com.google.android.apps.gsa.v.c;
import com.google.android.q.a.b;
import com.google.common.f.a.d;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/dictation/a/c/h.class */
public final class h extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final d f543a = d.j();
    private final a b;

    public h(a aVar) {
        this.b = aVar;
    }

    @Override // com.google.android.q.a.c
    public final void a(boolean z) {
        com.google.common.f.a.a d = f543a.d();
        d.ak(2853);
        d.s("onNotifAvailableForQuickPhraseChanged: available = %s [IVR-C]", Boolean.valueOf(z));
        ((f) this.b.a()).g.set(z);
    }

    @Override // com.google.android.q.a.c
    public final void b(boolean z) {
        com.google.common.f.a.a d = f543a.d();
        d.ak(2854);
        d.s("onNotifAvailableForReplyChanged: available = %s [IVR-C]", Boolean.valueOf(z));
        ((f) this.b.a()).f.set(z);
    }

    @Override // com.google.android.q.a.c
    public final void c(int i, int i2) {
        com.google.common.f.a.a d = f543a.d();
        d.ak(2855);
        d.w("onVoiceReplyHandled: sessionToken = %s; result = %s; [IVR-C]", i, i2);
        f fVar = (f) this.b.a();
        if (i2 != 0) {
            fVar.c(i, new Exception(a.a.dA(i2, "Voice reply session failed with error: ")));
            return;
        }
        e eVar = (e) fVar.e.remove(Integer.valueOf(i));
        if (eVar != null) {
            eVar.b.cancel(true);
            eVar.a.b(c.f1836a);
        }
    }
}
