package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/p.class */
public final class p extends bi implements cz {

    /* renamed from: a */
    public static final p f881a;
    private static volatile df d;
    public int b;
    public String c = "";

    static {
        p pVar = new p();
        f881a = pVar;
        bi.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f881a, "\u0004\u0001��\u0001\u0001\u0001\u0001������\u0001ဈ��", new Object[]{"b", "c"});
            case 3:
                return new p();
            case 4:
                return new ba(f881a);
            case 5:
                return f881a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (p.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f881a);
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
