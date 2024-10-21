package com.google.android.apps.gsa.shared.ab;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ab/i.class */
public final class i extends bi implements cz {

    /* renamed from: a */
    public static final i f1365a;
    private static volatile df d;
    public int b;
    public int c;

    static {
        i iVar = new i();
        f1365a = iVar;
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
                return newMessageInfo(f1365a, "\u0004\u0001��\u0001\u0001\u0001\u0001������\u0001᠌��", new Object[]{"b", "c", j.a});
            case 3:
                return new i();
            case 4:
                return new ba(f1365a);
            case 5:
                return f1365a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (i.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1365a);
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
