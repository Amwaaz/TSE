package com.google.android.apps.gsa.nga.shared.f;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/s.class */
public final class s extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final s f882a;
    private static volatile df j;
    public int b;
    public boolean e;
    public boolean h;
    public int i;
    public String c = "";
    public v d = v.b;
    public cb f = bi.emptyProtobufList();
    public String g = "";

    static {
        s sVar = new s();
        f882a = sVar;
        bi.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f882a, "\u0004\u0007��\u0001\u0002\b\u0007��\u0001��\u0002ဈ��\u0003ည\u0001\u0004ဇ\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဇ\u0004\b᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", ad.b});
            case 3:
                return new s();
            case 4:
                return new ba(f882a);
            case 5:
                return f882a;
            case 6:
                bb bbVar = j;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (s.class) {
                        try {
                            bb bbVar3 = j;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f882a);
                                j = bbVar2;
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
