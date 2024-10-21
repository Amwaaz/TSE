package com.google.android.apps.gsa.staticplugins.opa.ambient.b;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/b/h.class */
public final class h extends bi implements cz {

    /* renamed from: a */
    public static final h f1747a;
    private static volatile df e;
    public int b;
    public boolean c;
    public cb d = emptyProtobufList();

    static {
        h hVar = new h();
        f1747a = hVar;
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
                return newMessageInfo(f1747a, "\u0004\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဇ��\u0002\u001b", new Object[]{"b", "c", "d", g.class});
            case 3:
                return new h();
            case 4:
                return new ba(f1747a);
            case 5:
                return f1747a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (h.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1747a);
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
