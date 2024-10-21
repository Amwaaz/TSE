package com.google.android.apps.gsa.nga.engine.w.a.a;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/a/a/f.class */
public final class f extends bd implements be {

    /* renamed from: a */
    public static final f f823a;
    private static volatile df e;
    public int b;
    private byte f = 2;
    public cb c = emptyProtobufList();
    public String d = "";

    static {
        f fVar = new f();
        f823a = fVar;
        bi.registerDefaultInstance(f.class, fVar);
    }

    private f() {
        emptyProtobufList();
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(f823a, "\u0004\u0002��\u0001\u0001\u0003\u0002��\u0001\u0001\u0001Л\u0003ဈ��", new Object[]{"b", "c", e.class, "d"});
            case 3:
                return new f();
            case 4:
                return new bc(f823a);
            case 5:
                return f823a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (f.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f823a);
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
