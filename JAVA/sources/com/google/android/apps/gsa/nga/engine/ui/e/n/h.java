package com.google.android.apps.gsa.nga.engine.ui.e.n;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/n/h.class */
public final class h extends bi implements cz {

    /* renamed from: a */
    public static final h f785a;
    private static volatile df e;
    public long b;
    public boolean c;
    public boolean d;

    static {
        h hVar = new h();
        f785a = hVar;
        bi.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f785a, "\u0004\u0003����\u0002\u0004\u0003������\u0002\u0007\u0003\u0002\u0004\u0007", new Object[]{"c", "b", "d"});
            case 3:
                return new h();
            case 4:
                return new ba(f785a);
            case 5:
                return f785a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (h.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f785a);
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
