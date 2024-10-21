package com.google.android.apps.gsa.nga.shared.u.d.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/u/d/a/q.class */
public final class q extends bi implements cz {

    /* renamed from: a */
    public static final q f1011a;
    private static volatile df f;
    public int b;
    public int c;
    public String d;
    public String e;

    static {
        q qVar = new q();
        f1011a = qVar;
        bi.registerDefaultInstance(q.class, qVar);
    }

    private q() {
        emptyProtobufList();
        this.d = "";
        this.e = "";
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1011a, "\u0004\u0003��\u0001\u0002\u0004\u0003������\u0002င��\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new q();
            case 4:
                return new ba(f1011a);
            case 5:
                return f1011a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (q.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1011a);
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
