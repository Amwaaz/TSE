package com.google.android.apps.gsa.nga.shared.f;

import com.google.knowledge.b.k;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/ah.class */
public final class ah extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final ah f873a;
    private static volatile df m;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public cu l = cu.a;
    public boolean f = true;

    static {
        ah ahVar = new ah();
        f873a = ahVar;
        bi.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f873a, "\u0004\n��\u0001\u0002\f\n\u0001����\u0002ဇ��\u0003ဇ\u0002\u0004ဇ\u0004\u0005ဇ\u0003\u0006ဇ\u0007\u0007ဇ\b\t2\nဇ\u0001\u000bဇ\u0006\f᠌\u0005", new Object[]{"b", "c", "e", "g", "f", "j", "k", "l", ag.f872a, "d", "i", "h", k.a});
            case 3:
                return new ah();
            case 4:
                return new ba(f873a);
            case 5:
                return f873a;
            case 6:
                bb bbVar = m;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (ah.class) {
                        try {
                            bb bbVar3 = m;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f873a);
                                m = bbVar2;
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
