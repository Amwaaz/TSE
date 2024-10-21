package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/c.class */
public final class c extends bi implements cz {

    /* renamed from: a */
    public static final c f781a;
    private static volatile df d;
    public long b;
    public int c;

    static {
        c cVar = new c();
        f781a = cVar;
        bi.registerDefaultInstance(c.class, cVar);
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
                return newMessageInfo(f781a, "\u0004\u0002����\u0001\u0003\u0002������\u0001\f\u0003\u0002", new Object[]{"c", "b"});
            case 3:
                return new c();
            case 4:
                return new ba(f781a);
            case 5:
                return f781a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (c.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f781a);
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
