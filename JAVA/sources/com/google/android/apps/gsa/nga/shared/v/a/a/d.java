package com.google.android.apps.gsa.nga.shared.v.a.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/v/a/a/d.class */
public final class d extends bi implements cz {

    /* renamed from: a */
    public static final d f1016a;
    private static volatile df d;
    public int b = 0;
    public Object c;

    static {
        d dVar = new d();
        f1016a = dVar;
        bi.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1016a, "\u0004\u0003\u0001��\u0001\u0004\u0003������\u0001<��\u0003<��\u0004<��", new Object[]{"c", "b", a.class, e.class, b.class});
            case 3:
                return new d();
            case 4:
                return new ba(f1016a);
            case 5:
                return f1016a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (d.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1016a);
                                d = bbVar2;
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
