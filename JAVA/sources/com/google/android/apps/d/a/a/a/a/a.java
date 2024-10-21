package com.google.android.apps.d.a.a.a.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/d/a/a/a/a/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f232a;
    private static volatile df e;
    public int b;
    public String c = "";
    public boolean d;

    static {
        a aVar = new a();
        f232a = aVar;
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
                return newMessageInfo(f232a, "\u0004\u0002��\u0001\u0001\u0004\u0002������\u0001ဈ��\u0004ဇ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new a();
            case 4:
                return new ba(f232a);
            case 5:
                return f232a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f232a);
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
