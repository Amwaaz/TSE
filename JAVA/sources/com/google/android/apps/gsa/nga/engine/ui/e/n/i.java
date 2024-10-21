package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/i.class */
public final class i extends bi implements cz {

    /* renamed from: a */
    public static final i f786a;
    private static volatile df e;
    public int b = 0;
    public Object c;
    public boolean d;

    static {
        i iVar = new i();
        f786a = iVar;
        bi.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f786a, "\u0004\u0007\u0001��\u0001\u0007\u0007������\u0001\u0007\u0002<��\u0003<��\u0004<��\u0005<��\u0006<��\u0007<��", new Object[]{"c", "b", "d", b.class, h.class, e.class, c.class, a.class, g.class});
            case 3:
                return new i();
            case 4:
                return new ba(f786a);
            case 5:
                return f786a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (i.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f786a);
                                e = bbVar2;
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
