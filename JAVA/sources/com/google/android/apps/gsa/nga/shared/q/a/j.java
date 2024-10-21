package com.google.android.apps.gsa.nga.shared.q.a;

import androidx.core.d.e$;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.m.b;
import com.google.android.apps.gsa.nga.shared.q.a;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fl;
import com.google.common.o.ls;
import com.google.g.z.w.d;
import com.google.g.z.w.l;
import com.google.protobuf.ba;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/a/j.class */
public final class j implements com.google.android.apps.gsa.nga.shared.q.g, y, a, aj, ah {

    /* renamed from: a, reason: collision with root package name */
    public static final int f979a = 0;
    private final AtomicReference e = new AtomicReference(b);
    private final AtomicReference f = new AtomicReference(new g(1));
    private final AtomicReference g = new AtomicReference(c);
    private final AtomicReference h = new AtomicReference(d);
    private final com.google.android.apps.gsa.shared.util.q.a i;
    private final com.google.android.libraries.search.assistant.a.a j;
    private static final Supplier b = new g(0);
    private static final e k = new e();
    private static final ai c = new ai() { // from class: com.google.android.apps.gsa.nga.shared.q.a.h
        @Override // com.google.android.apps.gsa.nga.shared.q.a.ai
        public final NgaState a() {
            int i = j.f979a;
            return null;
        }
    };
    private static final ag d = new ag() { // from class: com.google.android.apps.gsa.nga.shared.q.a.i
        @Override // com.google.android.apps.gsa.nga.shared.q.a.ag
        public final Optional a() {
            int i = j.f979a;
            return Optional.of(com.google.g.z.w.j.a);
        }
    };

    public j(com.google.android.apps.gsa.shared.util.q.a aVar, com.google.android.libraries.search.assistant.a.a aVar2) {
        this.i = aVar;
        this.j = aVar2;
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.a
    public final void a(Supplier supplier) {
        this.f.set(supplier);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.g
    public final l b() {
        fl flVar = (fl) e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.f.get()));
        if (flVar.size() == 1) {
            b.a(flVar.isEmpty() ? Locale.getDefault() : (Locale) flVar.get(0), this.i.h(eu.kh));
        }
        NgaState a2 = ((ai) this.g.get()).a();
        com.google.g.z.w.j jVar = (com.google.g.z.w.j) ((ag) this.h.get()).a().orElse(com.google.g.z.w.j.a);
        ba createBuilder = l.a.createBuilder();
        ls lsVar = (ls) e$.ExternalSyntheticApiModelOutline0.m(e$.ExternalSyntheticApiModelOutline0.m(this.e.get()));
        createBuilder.copyOnWrite();
        l lVar = createBuilder.instance;
        lVar.c = lsVar.y;
        lVar.b = 1 | lVar.b;
        com.google.g.z.w.k kVar = com.google.g.z.w.k.c;
        createBuilder.copyOnWrite();
        l lVar2 = createBuilder.instance;
        lVar2.d = kVar.d;
        lVar2.b |= 2;
        createBuilder.copyOnWrite();
        l lVar3 = createBuilder.instance;
        lVar3.f = 2;
        lVar3.b |= 8;
        com.google.g.z.w.e apply = a2 == null ? com.google.g.z.w.e.a : k.apply(a2);
        createBuilder.copyOnWrite();
        l lVar4 = createBuilder.instance;
        lVar4.e = apply.e;
        lVar4.b |= 4;
        createBuilder.copyOnWrite();
        l lVar5 = createBuilder.instance;
        jVar.getClass();
        lVar5.g = jVar;
        lVar5.b |= 16;
        d a3 = this.j.a();
        createBuilder.copyOnWrite();
        l lVar6 = createBuilder.instance;
        lVar6.j = a3;
        lVar6.b |= 128;
        return createBuilder.build();
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.a.y
    public final void c(Supplier supplier) {
        this.e.set(supplier);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.a.ah
    public final void d(ag agVar) {
        this.h.set(agVar);
    }

    @Override // com.google.android.apps.gsa.nga.shared.q.a.aj
    public final void e(ai aiVar) {
        this.g.set(aiVar);
    }
}
