package com.google.android.apps.gsa.nga.engine.w.c.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bg;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bp;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.en;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/c/a/c.class */
public final class c extends bi implements cz {

    /* renamed from: a */
    public static final c f824a;
    public static final bg b;
    private static volatile df i;
    public int c;
    public double d = -1.0d;
    public double e = -1.0d;
    public double f = -1.0d;
    public int g = 2;
    public boolean h;

    static {
        c cVar = new c();
        f824a = cVar;
        bi.registerDefaultInstance(c.class, cVar);
        b = bi.newSingularGeneratedExtension(com.google.android.apps.gsa.nga.engine.w.a.a.d.f821a, cVar, cVar, (bp) null, 279980377, en.k, c.class);
    }

    private c() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f824a, "\u0004\u0005��\u0001\u0003\b\u0005������\u0003က��\u0004က\u0001\u0005က\u0002\u0006᠌\u0003\bဇ\u0004", new Object[]{"c", "d", "e", "f", "g", b.a, "h"});
            case 3:
                return new c();
            case 4:
                return new ba(f824a);
            case 5:
                return f824a;
            case 6:
                bb bbVar = i;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (c.class) {
                        try {
                            bb bbVar3 = i;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f824a);
                                i = bbVar2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return bbVar2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
