package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/e.class */
public final class e extends bi implements cz {

    /* renamed from: a */
    public static final e f783a;
    private static volatile df d;
    public long b;
    public int c;

    static {
        e eVar = new e();
        f783a = eVar;
        bi.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f783a, "\u0004\u0002����\u0001\u0003\u0002������\u0001\f\u0003\u0002", new Object[]{"c", "b"});
            case 3:
                return new e();
            case 4:
                return new ba(f783a);
            case 5:
                return f783a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (e.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f783a);
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
