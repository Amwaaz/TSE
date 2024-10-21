package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f787a;

    static {
        ba createBuilder = i.f786a.createBuilder();
        b bVar = b.f778a;
        createBuilder.copyOnWrite();
        i iVar = (i) createBuilder.instance;
        bVar.getClass();
        iVar.c = bVar;
        iVar.b = 2;
        f787a = (i) createBuilder.build();
    }

    public static Optional a(i iVar) {
        int ordinal = f.a(iVar.b).ordinal();
        if (ordinal == 1) {
            return Optional.of(Long.valueOf((iVar.b == 3 ? (h) iVar.c : h.f785a).b));
        }
        if (ordinal == 2) {
            return Optional.of(Long.valueOf((iVar.b == 4 ? (e) iVar.c : e.f783a).b));
        }
        if (ordinal != 3) {
            return Optional.empty();
        }
        return Optional.of(Long.valueOf((iVar.b == 5 ? (c) iVar.c : c.f781a).b));
    }

    public static boolean b(i iVar) {
        return iVar.b != 2;
    }

    public static boolean c(i iVar) {
        if (iVar.b == 3) {
            return ((h) iVar.c).d;
        }
        return false;
    }

    public static boolean d(i iVar) {
        int ordinal = f.a(iVar.b).ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3;
    }

    public static boolean e(i iVar) {
        int aG;
        return iVar.b == 5 && (aG = a.a.aG(((c) iVar.c).c)) != 0 && aG == 7;
    }

    public static boolean f(i iVar) {
        if (iVar.b != 4) {
            return false;
        }
        int i = ((e) iVar.c).c;
        d dVar = i != 0 ? i != 1 ? null : d.APP_SHORTCUTS : d.ESCAPE_HATCH;
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = d.UNRECOGNIZED;
        }
        return dVar2.equals(d.APP_SHORTCUTS);
    }

    public static boolean g(i iVar) {
        if (iVar.b != 5) {
            return false;
        }
        int aG = a.a.aG(((c) iVar.c).c);
        int i = aG;
        if (aG == 0) {
            i = 1;
        }
        return i == 3 || i == 4;
    }
}
