package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/o.class */
public final class o extends bi implements cz {

    /* renamed from: a */
    public static final o f880a;
    private static volatile df f;
    public int b;
    public q c;
    public ac d;
    public h e;

    static {
        o oVar = new o();
        f880a = oVar;
        bi.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f880a, "\u0004\u0003��\u0001\u0002\u0005\u0003������\u0002ဉ��\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new o();
            case 4:
                return new ba(f880a);
            case 5:
                return f880a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (o.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f880a);
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
