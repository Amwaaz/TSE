package com.google.android.apps.gsa.assistant.shared.j.a;

import com.google.android.apps.gsa.nga.shared.u.d.a.r;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/j/a/c.class */
public final class c extends bi implements cz {

    /* renamed from: a */
    public static final c f274a;
    private static volatile df l;
    public int b;
    public long d;
    public int e;
    public long g;
    public d i;
    public int j;
    public r k;
    public cu c = cu.a;
    public cu h = cu.a;
    public boolean f = true;

    static {
        c cVar = new c();
        f274a = cVar;
        bi.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    public final cu a() {
        cu cuVar = this.c;
        if (!cuVar.b) {
            this.c = cuVar.a();
        }
        return this.c;
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f274a, "\u0004\t��\u0001\u0001\n\t\u0002����\u00012\u0002ဂ��\u0003င\u0001\u0004ဇ\u0002\u0005ဂ\u0003\u00062\u0007ဉ\u0004\bင\u0005\nဉ\u0007", new Object[]{"b", "c", b.a, "d", "e", "f", "g", "h", a.a, "i", "j", "k"});
            case 3:
                return new c();
            case 4:
                return new ba(f274a);
            case 5:
                return f274a;
            case 6:
                bb bbVar = l;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (c.class) {
                        try {
                            bb bbVar3 = l;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f274a);
                                l = bbVar2;
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
