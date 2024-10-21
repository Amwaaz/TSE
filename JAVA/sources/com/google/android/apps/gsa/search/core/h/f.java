package com.google.android.apps.gsa.search.core.h;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/f.class */
public final class f extends bi implements cz {

    /* renamed from: a */
    public static final f f1121a;
    private static volatile df g;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";

    static {
        f fVar = new f();
        f1121a = fVar;
        bi.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1121a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007������\u0001ဈ��\u0002:��\u0003;��\u00045��\u0005င\u0001\u0006=��\u00073��", new Object[]{"d", "c", "b", "e", "f"});
            case 3:
                return new f();
            case 4:
                return new ba(f1121a);
            case 5:
                return f1121a;
            case 6:
                bb bbVar = g;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (f.class) {
                        try {
                            bb bbVar3 = g;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1121a);
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
