package com.google.android.apps.gsa.nga.engine.w.d.a;

import com.google.android.apps.gsa.nga.engine.w.a.a.d;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bg;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bp;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.en;
import com.google.protos.ak.a.c.b;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/d/a/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f826a;
    public static final bg b;
    private static volatile df e;
    public int c = 0;
    public Object d;

    static {
        a aVar = new a();
        f826a = aVar;
        bi.registerDefaultInstance(a.class, aVar);
        b = bi.newSingularGeneratedExtension(d.f821a, aVar, aVar, (bp) null, 281717907, en.k, a.class);
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
                return newMessageInfo(f826a, "\u0004\u0002\u0001��\u0001\u0002\u0002������\u0001<��\u0002<��", new Object[]{"d", "c", b.class, com.google.protos.ak.a.c.d.class});
            case 3:
                return new a();
            case 4:
                return new ba(f826a);
            case 5:
                return f826a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f826a);
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
