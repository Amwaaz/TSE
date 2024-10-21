package com.google.android.apps.gsa.nga.shared.u.d.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/u/d/a/ar.class */
public final class ar extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final ar f1006a;
    private static volatile df i;
    public int b;
    public int e;
    public m f;
    public q g;
    public int c = 1;
    public String d = "";
    public String h = "";

    static {
        ar arVar = new ar();
        f1006a = arVar;
        bi.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1006a, "\u0004\u0006��\u0001\u0001\u0007\u0006������\u0001᠌��\u0002ဈ\u0001\u0003᠌\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", as.f1007a, "d", "e", as.b, "f", "g", "h"});
            case 3:
                return new ar();
            case 4:
                return new ba(f1006a);
            case 5:
                return f1006a;
            case 6:
                bb bbVar = i;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (ar.class) {
                        try {
                            bb bbVar3 = i;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1006a);
                                i = bbVar2;
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
