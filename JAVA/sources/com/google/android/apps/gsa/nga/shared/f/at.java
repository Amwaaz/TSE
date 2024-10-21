package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/at.class */
public final class at extends bi implements cz {

    /* renamed from: a */
    public static final at f875a;
    private static volatile df h;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        at atVar = new at();
        f875a = atVar;
        bi.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f875a, "\u0004\u0005��\u0001\u0001\u0005\u0005������\u0001ဇ��\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new at();
            case 4:
                return new ba(f875a);
            case 5:
                return f875a;
            case 6:
                bb bbVar = h;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (at.class) {
                        try {
                            bb bbVar3 = h;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f875a);
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
