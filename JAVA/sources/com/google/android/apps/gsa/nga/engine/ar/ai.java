package com.google.android.apps.gsa.nga.engine.ar;

import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/ai.class */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public Optional f472a;
    public Optional b;
    public Optional c;
    public com.google.android.apps.gsa.nga.engine.ak.y.b d;
    private ah e;
    private bu f;
    private l g;

    public ai() {
        throw null;
    }

    public ai(aj ajVar) {
        this.f472a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.e = ajVar.f473a;
        this.f472a = ajVar.b;
        this.f = ajVar.c;
        this.b = ajVar.d;
        this.c = ajVar.e;
        this.g = ajVar.f;
        this.d = ajVar.g;
    }

    public ai(byte[] bArr) {
        this.f472a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    public final aj a() {
        bu buVar;
        l lVar;
        com.google.android.apps.gsa.nga.engine.ak.y.b bVar;
        ah ahVar = this.e;
        if (ahVar != null && (buVar = this.f) != null && (lVar = this.g) != null && (bVar = this.d) != null) {
            return new aj(ahVar, this.f472a, buVar, this.b, this.c, lVar, bVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" state");
        }
        if (this.f == null) {
            sb.append(" opaInvocation");
        }
        if (this.g == null) {
            sb.append(" attentionTriggerType");
        }
        if (this.d == null) {
            sb.append(" tags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(l lVar) {
        if (lVar == null) {
            throw new NullPointerException("Null attentionTriggerType");
        }
        this.g = lVar;
    }

    public final void c(bu buVar) {
        if (buVar == null) {
            throw new NullPointerException("Null opaInvocation");
        }
        this.f = buVar;
    }

    public final void d(ah ahVar) {
        if (ahVar == null) {
            throw new NullPointerException("Null state");
        }
        this.e = ahVar;
    }

    public final void e(com.google.android.apps.gsa.assistant.shared.k.c cVar) {
        bu buVar = this.f;
        if (buVar == null) {
            throw new IllegalStateException("Property \"opaInvocation\" has not been set");
        }
        ba builder = buVar.toBuilder();
        builder.copyOnWrite();
        bu buVar2 = (bu) builder.instance;
        buVar2.c = cVar.cF;
        buVar2.b |= 1;
        c((bu) builder.build());
    }
}
