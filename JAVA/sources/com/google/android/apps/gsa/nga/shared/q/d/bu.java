package com.google.android.apps.gsa.nga.shared.q.d;

import com.google.android.apps.gsa.assistant.shared.k.b;
import com.google.common.o.a.c;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/q/d/bu.class */
public final class bu extends bi implements cz {

    /* renamed from: a */
    public static final bu f984a;
    private static volatile df p;
    public int b;
    public int c;
    public int e;
    public long f;
    public long g;
    public int h;
    public long i;
    public boolean j;
    public int k;
    public float m;
    public float n;
    public boolean o;
    public String d = "";
    public String l = "";

    static {
        bu buVar = new bu();
        f984a = buVar;
        bi.registerDefaultInstance(bu.class, buVar);
    }

    private bu() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f984a, "\u0004\r��\u0001\u0001\r\r������\u0001᠌��\u0002ဂ\u0003\u0003ဂ\u0004\u0004᠌\u0005\u0005ဈ\u0001\u0006᠌\u0002\u0007ဂ\u0006\bဇ\u0007\t᠌\b\nဈ\t\u000bခ\n\fခ\u000b\rဇ\f", new Object[]{"b", "c", b.a, "f", "g", "h", c.g, "d", "e", c.f, "i", "j", "k", by.l, "l", "m", "n", "o"});
            case 3:
                return new bu();
            case 4:
                return new ba(f984a);
            case 5:
                return f984a;
            case 6:
                bb bbVar = p;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (bu.class) {
                        try {
                            bb bbVar3 = p;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f984a);
                                p = bbVar2;
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
