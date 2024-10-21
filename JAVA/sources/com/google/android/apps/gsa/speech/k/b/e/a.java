package com.google.android.apps.gsa.speech.k.b.e;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/k/b/e/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f1604a;
    private static volatile df e;
    public int b;
    public v c = v.b;
    public String d = "";

    static {
        a aVar = new a();
        f1604a = aVar;
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
                return newMessageInfo(f1604a, "\u0004\u0002��\u0001\u0001\u0002\u0002������\u0001ည��\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new a();
            case 4:
                return new ba(f1604a);
            case 5:
                return f1604a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1604a);
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
