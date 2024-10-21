package com.google.android.apps.gsa.nga.engine.ui.e.h.e;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/h/e/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f746a;
    private static volatile df c;
    public c b;
    private int d;

    static {
        a aVar = new a();
        f746a = aVar;
        bi.registerDefaultInstance(a.class, aVar);
    }

    private a() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f746a, "\u0004\u0001��\u0001\u0001\u0001\u0001������\u0001ဉ��", new Object[]{"d", "b"});
            case 3:
                return new a();
            case 4:
                return new ba(f746a);
            case 5:
                return f746a;
            case 6:
                bb bbVar = c;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = c;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f746a);
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
