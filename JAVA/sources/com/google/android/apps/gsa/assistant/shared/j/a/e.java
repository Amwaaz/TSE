package com.google.android.apps.gsa.assistant.shared.j.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/j/a/e.class */
public final class e extends bi implements cz {

    /* renamed from: a */
    public static final e f275a;
    private static volatile df g;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;

    static {
        e eVar = new e();
        f275a = eVar;
        bi.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f275a, "\u0004\u0004��\u0001\u0001\u0004\u0004������\u0001င��\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new e();
            case 4:
                return new ba(f275a);
            case 5:
                return f275a;
            case 6:
                bb bbVar = g;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (e.class) {
                        try {
                            bb bbVar3 = g;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f275a);
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
