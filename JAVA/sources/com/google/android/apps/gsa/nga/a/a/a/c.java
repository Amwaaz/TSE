package com.google.android.apps.gsa.nga.a.a.a;

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

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/a/a/a/c.class */
public final class c extends bi implements cz {

    /* renamed from: a */
    public static final c f378a;
    public static final bg b;
    private static volatile df c;

    static {
        c cVar = new c();
        f378a = cVar;
        bi.registerDefaultInstance(c.class, cVar);
        b = bi.newSingularGeneratedExtension(f.f823a, cVar, cVar, (bp) null, 283352693, en.k, c.class);
    }

    private c() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f378a, "\u0004��", null);
            case 3:
                return new c();
            case 4:
                return new ba(f378a);
            case 5:
                return f378a;
            case 6:
                bb bbVar = c;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (c.class) {
                        try {
                            bb bbVar3 = c;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f378a);
                                c = bbVar2;
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
