package com.google.android.apps.gsa.search.core.h;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/h/e.class */
public final class e extends bi implements cz {

    /* renamed from: a */
    public static final e f1120a;
    private static volatile df h;
    public int b;
    public long d;
    public cb c = emptyProtobufList();
    public bs e = emptyIntList();
    public bs f = emptyIntList();
    public String g = "";

    static {
        e eVar = new e();
        f1120a = eVar;
        bi.registerDefaultInstance(e.class, eVar);
    }

    private e() {
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
                return newMessageInfo(f1120a, "\u0004\u0005��\u0001\u0001\u0006\u0005��\u0003��\u0001\u001b\u0002ဂ��\u0003\u0016\u0005\u0016\u0006ဈ\u0001", new Object[]{"b", "c", f.class, "d", "e", "f", "g"});
            case 3:
                return new e();
            case 4:
                return new ba(f1120a);
            case 5:
                return f1120a;
            case 6:
                bb bbVar = h;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (e.class) {
                        try {
                            bb bbVar3 = h;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1120a);
                                h = bbVar2;
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
