package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/ar.class */
public final class ar extends bi implements cz {

    /* renamed from: a */
    public static final ar f874a;
    private static volatile df g;
    public int b;
    public long c;
    public cb d = emptyProtobufList();
    public cb e = emptyProtobufList();
    public cb f = emptyProtobufList();

    static {
        ar arVar = new ar();
        f874a = arVar;
        bi.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f874a, "\u0004\u0004��\u0001\u0001\u0004\u0004��\u0003��\u0001ဂ��\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", aq.class, "e", aq.class, "f", aq.class});
            case 3:
                return new ar();
            case 4:
                return new ba(f874a);
            case 5:
                return f874a;
            case 6:
                bb bbVar = g;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (ar.class) {
                        try {
                            bb bbVar3 = g;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f874a);
                                g = bbVar2;
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
