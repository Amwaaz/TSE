package com.google.android.apps.gsa.search.shared.service.d.b;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/d/b/v.class */
public final class v extends bd implements be {

    /* renamed from: a */
    public static final v f1347a;
    private static volatile df f;
    public int b;
    public long c;
    public int d;
    private byte g = 2;
    public String e = "";

    static {
        v vVar = new v();
        f1347a = vVar;
        bi.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(f1347a, "\u0004\u0003��\u0001\u0001\u0003\u0003������\u0001ဎ��\u0002ဍ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new v();
            case 4:
                return new bc(f1347a);
            case 5:
                return f1347a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (v.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1347a);
                                f = bbVar2;
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
