package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bv;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f1698a;
    private static volatile df g;
    public int b;
    public String c = "";
    public bv d = emptyLongList();
    public long e;
    public long f;

    static {
        a aVar = new a();
        f1698a = aVar;
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
                return newMessageInfo(f1698a, "\u0004\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001ဈ��\u0002\u0014\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new a();
            case 4:
                return new ba(f1698a);
            case 5:
                return f1698a;
            case 6:
                bb bbVar = g;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = g;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1698a);
                                g = bbVar2;
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
