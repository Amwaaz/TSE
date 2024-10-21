package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/n.class */
public final class n extends bi implements cz {

    /* renamed from: a */
    public static final n f879a;
    private static volatile df b;

    static {
        n nVar = new n();
        f879a = nVar;
        bi.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f879a, "\u0004��", null);
            case 3:
                return new n();
            case 4:
                return new ba(f879a);
            case 5:
                return f879a;
            case 6:
                bb bbVar = b;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (n.class) {
                        try {
                            bb bbVar3 = b;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f879a);
                                b = bbVar2;
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
