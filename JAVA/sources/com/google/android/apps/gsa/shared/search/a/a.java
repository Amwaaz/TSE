package com.google.android.apps.gsa.shared.search.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/a/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f1480a;
    private static volatile df b;
    private int c;
    private o.a.e.e.f.b d;
    private byte e = 2;

    static {
        a aVar = new a();
        f1480a = aVar;
        bi.registerDefaultInstance(a.class, aVar);
    }

    private a() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(f1480a, "\u0004\u0001��\u0001\n\n\u0001����\u0001\nᐉ\u0004", new Object[]{"c", "d"});
            case 3:
                return new a();
            case 4:
                return new ba(f1480a);
            case 5:
                return f1480a;
            case 6:
                bb bbVar = b;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = b;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1480a);
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
