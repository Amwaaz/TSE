package com.google.android.apps.gsa.search.core.u;

import com.google.common.o.bk;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/u/b.class */
public final class b extends bi implements cz {

    /* renamed from: a */
    public static final b f1318a;
    private static volatile df f;
    public int b;
    public cb c = emptyProtobufList();
    public long d;
    public int e;

    static {
        b bVar = new b();
        f1318a = bVar;
        bi.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    public final void a() {
        cb cbVar = this.c;
        if (cbVar.c()) {
            return;
        }
        this.c = bi.mutableCopy(cbVar);
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1318a, "\u0004\u0003��\u0001\u0001\u0003\u0003��\u0001��\u0001\u001b\u0002ဃ��\u0003င\u0001", new Object[]{"b", "c", bk.class, "d", "e"});
            case 3:
                return new b();
            case 4:
                return new ba(f1318a);
            case 5:
                return f1318a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (b.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1318a);
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
