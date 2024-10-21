package com.google.android.apps.gsa.nga.engine.w.c.a;

import com.google.android.apps.gsa.nga.engine.w.a.a.f;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bg;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bp;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.en;
import com.google.protos.ak.a.b.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/c/a/d.class */
public final class d extends bi implements cz {

    /* renamed from: a */
    public static final d f825a;
    public static final bg b;
    private static volatile df g;
    public boolean c;
    public boolean d;
    public int e;
    public a f;
    private int h;

    static {
        d dVar = new d();
        f825a = dVar;
        bi.registerDefaultInstance(d.class, dVar);
        b = bi.newSingularGeneratedExtension(f.f823a, dVar, dVar, (bp) null, 283352692, en.k, d.class);
    }

    private d() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f825a, "\u0004\u0004��\u0001\u0001\u0006\u0004������\u0001ဇ��\u0002ဇ\u0001\u0004ဉ\u0003\u0006င\u0002", new Object[]{"h", "c", "d", "f", "e"});
            case 3:
                return new d();
            case 4:
                return new ba(f825a);
            case 5:
                return f825a;
            case 6:
                bb bbVar = g;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (d.class) {
                        try {
                            bb bbVar3 = g;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f825a);
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
