package com.google.android.apps.gsa.search.shared.service.c;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/shared/service/c/hg.class */
public final class hg extends bd implements be {

    /* renamed from: a, reason: collision with root package name */
    public static final hg f1343a;
    private static volatile df d;
    public int b;
    private byte e = 2;
    public int c = 1;

    static {
        hg hgVar = new hg();
        f1343a = hgVar;
        bi.registerDefaultInstance(hg.class, hgVar);
    }

    private hg() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(f1343a, "\u0004\u0001��\u0001\u0001\u0001\u0001������\u0001᠌��", new Object[]{"b", "c", he.f1341a});
            case 3:
                return new hg();
            case 4:
                return new bc(f1343a);
            case 5:
                return f1343a;
            case 6:
                bb bbVar = d;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (hg.class) {
                        try {
                            bb bbVar3 = d;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1343a);
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
