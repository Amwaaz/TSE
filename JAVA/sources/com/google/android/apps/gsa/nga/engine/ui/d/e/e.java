package com.google.android.apps.gsa.nga.engine.ui.d.e;

import com.google.android.apps.gsa.nga.shared.q.ah;
import com.google.common.a.c;
import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.g.e.i.d.cd;
import com.google.protobuf.ba;
import io.grpc.j.ac;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/d/e/e.class */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f685a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.d.e.e");
    public final com.google.android.libraries.gsa.h.h b;
    public final c c;
    public Optional d;
    public final HashMap e;

    public e(com.google.android.libraries.gsa.h.h hVar) {
        com.google.common.a.j jVar = new com.google.common.a.j();
        jVar.g(3L);
        this.c = jVar.a();
        this.d = Optional.empty();
        this.e = new HashMap();
        this.b = hVar;
    }

    public static void b(List list, cd cdVar) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((ac) it.next(), cdVar);
        }
    }

    public static void c(ac acVar, cd cdVar) {
        if (cdVar.equals(cd.a)) {
            acVar.iU(com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.c.a);
        } else {
            ba createBuilder = com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.c.a.createBuilder();
            createBuilder.copyOnWrite();
            com.google.android.apps.search.assistant.surfaces.voice.m.a.a.a.c cVar = createBuilder.instance;
            cdVar.getClass();
            cVar.c = cdVar;
            cVar.b |= 1;
            acVar.iU(createBuilder.build());
        }
        acVar.iT();
    }

    public final fl a(ah ahVar) {
        fl flVar;
        int i = fl.e;
        return (!this.e.containsKey(ahVar) || (flVar = (fl) this.e.remove(ahVar)) == null) ? ni.a : flVar;
    }
}
