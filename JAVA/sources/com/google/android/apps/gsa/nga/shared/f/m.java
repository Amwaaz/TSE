package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.bv;
import com.google.protobuf.cb;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/m.class */
public final class m extends bi implements cz {
    private static volatile df C;

    /* renamed from: a */
    public static final m f878a;
    public int A;
    public au B;
    public int b;
    public ap c;
    public cu d = cu.a;
    public cu e;
    public cu f;
    public ap g;
    public cu h;
    public int i;
    public int j;
    public bv k;
    public int l;
    public long m;
    public an n;
    public al o;
    public aj p;
    public bs q;
    public long r;
    public boolean s;
    public cb t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        m mVar = new m();
        f878a = mVar;
        bi.registerDefaultInstance(m.class, mVar);
    }

    private m() {
        cu cuVar = cu.a;
        this.e = cuVar;
        this.f = cuVar;
        this.h = cuVar;
        this.k = emptyLongList();
        this.q = emptyIntList();
        this.t = bi.emptyProtobufList();
    }

    public final cu a() {
        cu cuVar = this.d;
        if (!cuVar.b) {
            this.d = cuVar.a();
        }
        return this.d;
    }

    public final cu b() {
        cu cuVar = this.h;
        if (!cuVar.b) {
            this.h = cuVar.a();
        }
        return this.h;
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f878a, "\u0004\u001a��\u0001\u0001\u001c\u001a\u0004\u0003��\u0001ဉ��\u00022\u0003င\u0002\u0004\u0014\u0005င\u0005\u0006ဉ\u0007\u0007ဉ\b\bဉ\t\n\u0016\u000bဂ\n\fဇ\u000b\r2\u000eဉ\u0001\u0010\u001a\u0011င\u0003\u0012င\f\u0013ဇ\r\u0014င\u000e\u00152\u0016င\u000f\u0017င\u0010\u0018င\u0011\u0019င\u0012\u001aဉ\u0013\u001b2\u001cဂ\u0006", new Object[]{"b", "c", "d", k.a, "i", "k", "l", "n", "o", "p", "q", "r", "s", "h", l.a, "g", "t", "j", "u", "v", "w", "e", i.a, "x", "y", "z", "A", "B", "f", j.a, "m"});
            case 3:
                return new m();
            case 4:
                return new ba(f878a);
            case 5:
                return f878a;
            case 6:
                bb bbVar = C;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (m.class) {
                        try {
                            bb bbVar3 = C;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f878a);
                                C = bbVar2;
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
