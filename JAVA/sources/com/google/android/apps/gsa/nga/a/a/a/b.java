package com.google.android.apps.gsa.nga.a.a.a;

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

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/a/a/a/b.class */
public final class b extends bi implements cz {

    /* renamed from: a */
    public static final b f377a;
    public static final bg b;
    private static volatile df f;
    public int c;
    public double d = 100000.0d;
    public String e = "";

    static {
        b bVar = new b();
        f377a = bVar;
        bi.registerDefaultInstance(b.class, bVar);
        b = bi.newSingularGeneratedExtension(d.f821a, bVar, bVar, (bp) null, 313195476, en.k, b.class);
    }

    private b() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f377a, "\u0004\u0002��\u0001\u0001\u0004\u0002������\u0001က��\u0004ဈ\u0004", new Object[]{"c", "d", "e"});
            case 3:
                return new b();
            case 4:
                return new ba(f377a);
            case 5:
                return f377a;
            case 6:
                bb bbVar = f;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (b.class) {
                        try {
                            bb bbVar3 = f;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f377a);
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
