package com.google.android.apps.gsa.shared.ab;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ab/g.class */
public final class g extends bi implements cz {

    /* renamed from: a */
    public static final g f1364a;
    private static volatile df f;
    public int b;
    public long c;
    public int d;
    public boolean e;

    static {
        g gVar = new g();
        f1364a = gVar;
        bi.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1364a, "\u0004\u0003��\u0001\u0001\u0003\u0003������\u0001ဂ��\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", j.b, "e"});
            case 3:
                return new g();
            case 4:
                return new ba(f1364a);
            case 5:
                return f1364a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (g.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1364a);
                                f = bbVar2;
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
