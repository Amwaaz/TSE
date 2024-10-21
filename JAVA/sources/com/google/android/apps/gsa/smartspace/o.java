package com.google.android.apps.gsa.smartspace;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/smartspace/o.class */
public final class o extends bi implements cz {

    /* renamed from: a */
    public static final o f1587a;
    private static volatile df c;
    public cb b = emptyProtobufList();

    static {
        o oVar = new o();
        f1587a = oVar;
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
                return newMessageInfo(f1587a, "\u0004\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"b", n.class});
            case 3:
                return new o();
            case 4:
                return new ba(f1587a);
            case 5:
                return f1587a;
            case 6:
                bb bbVar = c;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (o.class) {
                        try {
                            bb bbVar3 = c;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1587a);
                                c = bbVar2;
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
