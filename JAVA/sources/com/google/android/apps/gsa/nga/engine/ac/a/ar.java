package com.google.android.apps.gsa.nga.engine.ac.a;

import com.google.android.apps.gsa.nga.engine.ar.ad;
import com.google.android.apps.gsa.nga.engine.m.d.ac;
import com.google.android.apps.gsa.nga.engine.v.d;
import com.google.android.apps.gsa.nga.engine.v.e;
import com.google.android.apps.gsa.nga.shared.o.b;
import com.google.android.apps.gsa.search.shared.service.c.ev;
import com.google.android.libraries.gsa.h.h;
import j$.time.Duration;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ac/a/ar.class */
public final class ar implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ac f389a;
    private final e b;
    private final h c;
    private boolean d;
    private final com.google.android.apps.gsa.nga.engine.ar.b.b.ac e;

    public ar(e eVar, ac acVar, com.google.android.apps.gsa.nga.engine.ar.b.b.ac acVar2, h hVar) {
        this.b = eVar;
        this.f389a = acVar;
        this.e = acVar2;
        this.c = hVar;
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final /* synthetic */ void a(ev evVar) {
    }

    @Override // com.google.android.apps.gsa.nga.shared.o.b
    public final void b(boolean z) {
        if (this.d && !z) {
            this.c.p("[NGA] Execute cancel callback", Duration.ofMillis(200L), new ap(this, 0));
        }
        this.d = z;
    }

    public final void c(com.google.android.apps.gsa.nga.engine.m.e eVar) {
        com.google.android.apps.gsa.nga.engine.recognition.h hVar = com.google.android.apps.gsa.nga.engine.recognition.h.f;
        com.google.android.apps.gsa.nga.engine.recognition.h hVar2 = eVar.b;
        com.google.android.apps.gsa.assistant.shared.k.c cVar = (hVar.equals(hVar2) || com.google.android.apps.gsa.nga.engine.recognition.h.e.equals(hVar2)) ? com.google.android.apps.gsa.assistant.shared.k.c.OPA_SUGGESTION_CHIP : com.google.android.apps.gsa.assistant.shared.k.c.TEXT_SUBMIT;
        e eVar2 = this.b;
        ad a2 = com.google.android.apps.gsa.nga.engine.ar.ag.a();
        a2.a = new d(eVar2.a()).a();
        a2.b = hVar2;
        a2.d(cVar);
        this.e.a(a2.b(eVar.a));
    }
}
