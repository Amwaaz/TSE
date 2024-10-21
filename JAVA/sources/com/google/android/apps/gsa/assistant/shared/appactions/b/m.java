package com.google.android.apps.gsa.assistant.shared.appactions.b;

import com.google.android.apps.gsa.assistant.shared.appactions.g.b;
import com.google.android.apps.gsa.assistant.shared.appactions.g.e;
import com.google.android.apps.gsa.l.g.f;
import com.google.android.libraries.gsa.h.h;
import com.google.android.libraries.storage.protostore.cg;
import com.google.common.base.ah;
import com.google.common.base.cl;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/appactions/b/m.class */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final h f261a;
    public final f b;
    public final e.a c;
    public final a d;

    public m(h hVar, e.a aVar, f fVar, a aVar2) {
        this.f261a = hVar;
        this.b = fVar;
        this.c = aVar;
        this.d = aVar2;
    }

    public static b a(b bVar, String str, ah ahVar) {
        for (int i = 0; i < bVar.c.size(); i++) {
            com.google.android.apps.gsa.assistant.shared.appactions.g.c cVar = (com.google.android.apps.gsa.assistant.shared.appactions.g.c) bVar.c.get(i);
            if (str.equals(cVar.c)) {
                ba builder = bVar.toBuilder();
                com.google.android.apps.gsa.assistant.shared.appactions.g.c cVar2 = (com.google.android.apps.gsa.assistant.shared.appactions.g.c) ahVar.apply(cVar);
                builder.copyOnWrite();
                b bVar2 = builder.instance;
                cVar2.getClass();
                bVar2.a();
                bVar2.c.set(i, cVar2);
                return builder.build();
            }
        }
        ba builder2 = bVar.toBuilder();
        ba createBuilder = com.google.android.apps.gsa.assistant.shared.appactions.g.c.a.createBuilder();
        createBuilder.copyOnWrite();
        com.google.android.apps.gsa.assistant.shared.appactions.g.c cVar3 = createBuilder.instance;
        str.getClass();
        cVar3.b |= 1;
        cVar3.c = str;
        com.google.android.apps.gsa.assistant.shared.appactions.g.c cVar4 = (com.google.android.apps.gsa.assistant.shared.appactions.g.c) ahVar.apply(createBuilder.build());
        builder2.copyOnWrite();
        b bVar3 = builder2.instance;
        cVar4.getClass();
        bVar3.a();
        bVar3.c.add(cVar4);
        return builder2.build();
    }

    public final cn b(ah ahVar) {
        return this.d.b() ? this.f261a.k(((cg) this.c.a()).a(ahVar, ay.a), "done", new i()) : com.google.android.apps.gsa.v.c.b;
    }

    public final cn c(String str) {
        return b(new d(str, 2));
    }

    public final cn d(String str) {
        return b(new d(str, 0));
    }

    public final cn e(String str, Optional optional) {
        ba createBuilder = e.a.createBuilder();
        String T = cl.T(str.trim());
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        T.getClass();
        eVar.b |= 1;
        eVar.c = T;
        optional.ifPresent(new l(createBuilder));
        return b(new d(createBuilder, 1));
    }
}
