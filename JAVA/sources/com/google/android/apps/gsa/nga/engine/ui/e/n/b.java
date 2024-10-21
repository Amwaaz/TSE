package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/b.class */
public final class b extends bi implements cz {

    /* renamed from: a */
    public static final b f778a;
    private static volatile df b;

    static {
        b bVar = new b();
        f778a = bVar;
        bi.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f778a, "\u0004��", null);
            case 3:
                return new b();
            case 4:
                return new ba(f778a);
            case 5:
                return f778a;
            case 6:
                bb bbVar = b;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (b.class) {
                        try {
                            bb bbVar3 = b;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f778a);
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
