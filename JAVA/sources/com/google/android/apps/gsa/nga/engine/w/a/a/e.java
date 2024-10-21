package com.google.android.apps.gsa.nga.engine.w.a.a;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/a/a/e.class */
public final class e extends bd implements be {

    /* renamed from: a */
    public static final e f822a;
    private static volatile df f;
    public int b;
    public float d;
    public float e;
    private byte g = 2;
    public String c = "";

    static {
        e eVar = new e();
        f822a = eVar;
        bi.registerDefaultInstance(e.class, eVar);
    }

    private e() {
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
                return newMessageInfo(f822a, "\u0004\u0003��\u0001\u0001\u0004\u0003������\u0001ဈ��\u0002ခ\u0001\u0004ခ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new e();
            case 4:
                return new bc(f822a);
            case 5:
                return f822a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (e.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f822a);
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
