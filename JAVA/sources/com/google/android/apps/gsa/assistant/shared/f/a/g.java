package com.google.android.apps.gsa.assistant.shared.f.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/f/a/g.class */
public final class g extends bi implements cz {

    /* renamed from: a */
    public static final g f271a;
    private static volatile df h;
    public cu b = cu.a;
    public cu c;
    public cu d;
    public cu e;
    public cu f;
    public cu g;

    static {
        g gVar = new g();
        f271a = gVar;
        bi.registerDefaultInstance(g.class, gVar);
    }

    private g() {
        cu cuVar = cu.a;
        this.c = cuVar;
        this.d = cuVar;
        this.e = cuVar;
        this.f = cuVar;
        this.g = cuVar;
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f271a, "\u0004\u0006����\u0001\u0006\u0006\u0006����\u00012\u00022\u00032\u00042\u00052\u00062", new Object[]{"b", b.a, "d", a.a, "e", f.a, "f", d.a, "g", e.a, "c", c.a});
            case 3:
                return new g();
            case 4:
                return new ba(f271a);
            case 5:
                return f271a;
            case 6:
                bb bbVar = h;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (g.class) {
                        try {
                            bb bbVar3 = h;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f271a);
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
