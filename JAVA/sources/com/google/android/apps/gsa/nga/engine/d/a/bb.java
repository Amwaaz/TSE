package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.android.apps.gsa.nga.shared.q.a.af;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.android.apps.gsa.nga.shared.q.d.bk;
import com.google.speech.i.a.w;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/bb.class */
public final class bb {
    public final Set b;
    public final bd c;
    public final com.google.android.libraries.g.a d;
    public final an e;
    public final com.google.android.apps.gsa.shared.util.q.a f;
    public final x i;
    private final e.a j;
    private final af l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f535a = new AtomicReference();
    public final ba g = new ba();
    public w h = w.a;
    private long k = 0;

    public bb(an anVar, Set set, bd bdVar, e.a aVar, af afVar, com.google.android.libraries.g.a aVar2, com.google.android.apps.gsa.shared.util.q.a aVar3, x xVar) {
        this.e = anVar;
        this.b = set;
        this.c = bdVar;
        this.l = afVar;
        this.d = aVar2;
        this.j = aVar;
        this.f = aVar3;
        this.i = xVar;
    }

    public final w a() {
        aa aaVar = (aa) DesugarAtomicReference.updateAndGet(this.f535a, new q(this, 17));
        aaVar.getClass();
        if (!aaVar.b) {
            return w.a;
        }
        com.google.protobuf.bc createBuilder = w.a.createBuilder();
        for (am amVar : this.b) {
            if (amVar.c()) {
                createBuilder.ap(amVar.a());
            }
        }
        return createBuilder.build();
    }

    public final void b(w wVar, bk bkVar) {
        az ayVar;
        long epochMilli = this.d.f().toEpochMilli();
        long j = this.k;
        int ordinal = bkVar.ordinal();
        if (ordinal != 10) {
            switch (ordinal) {
                case 38:
                case 39:
                case 41:
                    this.k = epochMilli;
                    ayVar = new ay(epochMilli, wVar, 0L);
                    break;
                case 40:
                    this.k = epochMilli;
                    ayVar = new az(this, wVar, epochMilli);
                    break;
                default:
                    ayVar = null;
                    break;
            }
        } else if (epochMilli - j < 3600000) {
            com.google.protobuf.bc builder = wVar.toBuilder();
            builder.copyOnWrite();
            builder.instance.c = w.emptyProtobufList();
            ayVar = new ay(epochMilli, builder.build(), this.k);
        } else {
            this.k = epochMilli;
            ayVar = new ay(epochMilli, wVar, 0L);
        }
        if (ayVar != null) {
            this.l.c(bkVar, ayVar, ah.a);
        }
    }

    public final void c() {
        ba baVar = this.g;
        long b = this.d.b();
        w a2 = a();
        baVar.a(a2, b);
        com.google.protobuf.bc builder = a2.toBuilder();
        builder.mergeFrom(this.c.c());
        w wVar = (w) builder.build();
        ((Optional) this.j.a()).ifPresent(new l(wVar, 4));
        this.h = wVar;
        b(wVar, bk.SPEECH_RECOGNITION_CONTEXT_UPDATE);
    }
}
