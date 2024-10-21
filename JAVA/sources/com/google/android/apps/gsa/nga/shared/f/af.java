package com.google.android.apps.gsa.nga.shared.f;

import com.google.g.ar.bc;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/af.class */
public final class af extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final af f871a;
    private static volatile df n;
    public int b;
    public boolean c;
    public boolean d;
    public boolean f;
    public int g;
    public boolean j;
    public int k;
    public long l;
    public cu m = cu.a;
    public String e = "";
    public String h = "";
    public String i = "";

    static {
        af afVar = new af();
        f871a = afVar;
        bi.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f871a, "\u0004\u000b��\u0001\u0001Ϩ\u000b\u0001����\u0001ဇ��\u0003ဈ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b᠌\b\tဂ\t\u000bဇ\u0001\fဇ\u0007Ϩ2", new Object[]{"b", "c", "e", "f", "g", bc.a, "h", "i", "k", ad.f869a, "l", "d", "j", "m", ae.f870a});
            case 3:
                return new af();
            case 4:
                return new ba(f871a);
            case 5:
                return f871a;
            case 6:
                bb bbVar = n;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (af.class) {
                        try {
                            bb bbVar3 = n;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f871a);
                                n = bbVar2;
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
