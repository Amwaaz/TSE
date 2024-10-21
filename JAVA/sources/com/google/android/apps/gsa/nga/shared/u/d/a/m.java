package com.google.android.apps.gsa.nga.shared.u.d.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/u/d/a/m.class */
public final class m extends bi implements cz {

    /* renamed from: a */
    public static final m f1010a;
    private static volatile df c;
    public cb b = emptyProtobufList();

    static {
        m mVar = new m();
        f1010a = mVar;
        bi.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    public final void a() {
        cb cbVar = this.b;
        if (cbVar.c()) {
            return;
        }
        this.b = bi.mutableCopy(cbVar);
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1010a, "\u0004\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"b", n.class});
            case 3:
                return new m();
            case 4:
                return new ba(f1010a);
            case 5:
                return f1010a;
            case 6:
                bb bbVar = c;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (m.class) {
                        try {
                            bb bbVar3 = c;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1010a);
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
