package com.google.android.apps.gsa.staticplugins.nga.u.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/a/b.class */
public final class b extends bi implements cz {

    /* renamed from: a */
    public static final b f1702a;
    private static volatile df e;
    public int b;
    public long c;
    public cb d = emptyProtobufList();

    static {
        b bVar = new b();
        f1702a = bVar;
        bi.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1702a, "\u0004\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဂ��\u0002\u001b", new Object[]{"b", "c", "d", a.class});
            case 3:
                return new b();
            case 4:
                return new ba(f1702a);
            case 5:
                return f1702a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (b.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1702a);
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
