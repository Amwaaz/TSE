package com.google.android.apps.gsa.nga.engine.c.c.a;

import com.google.android.apps.gsa.nga.shared.ak.e;
import com.google.g.ab.e.b.b;
import com.google.g.ab.e.b.c;
import e.a;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/c/c/a/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f525a;
    private final a b;

    public k(a aVar, a aVar2) {
        this.f525a = aVar;
        this.b = aVar2;
    }

    public static Optional a(c cVar) {
        b bVar = cVar.f;
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = b.a;
        }
        if (bVar2.c.isEmpty()) {
            return Optional.empty();
        }
        b bVar3 = cVar.f;
        b bVar4 = bVar3;
        if (bVar3 == null) {
            bVar4 = b.a;
        }
        if (bVar4.d.isEmpty()) {
            b bVar5 = cVar.f;
            b bVar6 = bVar5;
            if (bVar5 == null) {
                bVar6 = b.a;
            }
            return Optional.of(new Locale(bVar6.c));
        }
        b bVar7 = cVar.f;
        String str = (bVar7 == null ? b.a : bVar7).c;
        b bVar8 = bVar7;
        if (bVar7 == null) {
            bVar8 = b.a;
        }
        return Optional.of(new Locale(str, bVar8.d));
    }

    public final String b(c cVar) {
        if (cVar.h) {
            Optional d = ((e) this.f525a.a()).d();
            if (d.isPresent()) {
                return (String) d.get();
            }
        }
        return cVar.d;
    }

    public final boolean c() {
        return ((com.google.android.apps.search.assistant.libraries.dictation.starter.a) this.b.a()).f1859a.get();
    }
}
