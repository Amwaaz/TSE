package com.google.android.apps.gsa.nga.engine.c.c.a;

import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.nga.shared.f.a.ag;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.search.assistant.verticals.a.d.a.h;
import com.google.android.libraries.search.b.b;
import com.google.common.b.bs;
import com.google.common.b.fl;
import com.google.common.f.a.d;
import com.google.g.ab.e.b.e;
import com.google.protobuf.ba;
import e.a;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/c/a/i.class */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final d f524a = d.j();
    public final l b;
    public final a c;
    public final k d;
    public final b e;
    public final com.google.android.apps.gsa.nga.engine.c.c.a.b.a f;
    private final a g;
    private final com.google.android.apps.gsa.shared.util.q.a h;
    private final ag i;
    private final y j;

    public i(a aVar, com.google.android.apps.gsa.shared.util.q.a aVar2, l lVar, a aVar3, com.google.android.apps.gsa.nga.engine.c.c.a.b.a aVar4, k kVar, b bVar, y yVar, ag agVar) {
        this.g = aVar;
        this.h = aVar2;
        this.b = lVar;
        this.c = aVar3;
        this.f = aVar4;
        this.d = kVar;
        this.e = bVar;
        this.i = agVar;
        this.j = yVar;
    }

    public final e a(e eVar, Locale locale) {
        a aVar = this.g;
        ba builder = eVar.toBuilder();
        String string = ((com.google.android.apps.gsa.nga.shared.p.b) aVar.a()).a(locale).getString(eVar.f, new Object[0]);
        builder.copyOnWrite();
        e eVar2 = builder.instance;
        string.getClass();
        eVar2.b |= 2;
        eVar2.d = string;
        return builder.build();
    }

    public final fl b(String str, Locale locale) {
        Stream map = Collection._EL.stream(h.a()).filter(new h(str, 1)).filter(new a()).filter(new b(this, str, 0)).map(new c(this, locale, 0));
        int i = fl.e;
        return (fl) map.collect(bs.a);
    }

    public final boolean c() {
        return this.h.i(eu.bt);
    }

    public final boolean d(Locale locale) {
        return com.google.android.apps.gsa.shared.k.b.d(this.h.h(eu.x)).contains(locale.toLanguageTag());
    }

    public final boolean e() {
        Optional optional = this.j.c().c;
        ag agVar = this.i;
        agVar.getClass();
        if (((Boolean) optional.flatMap(new g(agVar)).orElse(false)).booleanValue()) {
            return ((Boolean) this.i.i(optional).orElse(false)).booleanValue() && ((Boolean) this.i.j(optional).orElse(false)).booleanValue();
        }
        return true;
    }
}
