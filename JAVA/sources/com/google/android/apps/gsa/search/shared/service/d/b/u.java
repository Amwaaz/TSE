package com.google.android.apps.gsa.search.shared.service.d.b;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/d/b/u.class */
public final class u extends bd implements be {

    /* renamed from: a */
    public static final u f1346a;
    private static volatile df b;
    private int c;
    private v d;
    private byte e = 2;

    static {
        u uVar = new u();
        f1346a = uVar;
        bi.registerDefaultInstance(u.class, uVar);
    }

    private u() {
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
                return newMessageInfo(f1346a, "\u0004\u0001��\u0001\u0001\u0001\u0001����\u0001\u0001ᐉ��", new Object[]{"c", "d"});
            case 3:
                return new u();
            case 4:
                return new bc(f1346a);
            case 5:
                return f1346a;
            case 6:
                bb bbVar = b;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (u.class) {
                        try {
                            bb bbVar3 = b;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1346a);
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
