package com.google.android.apps.gsa.shared.search.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cu;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/a/d.class */
public final class d extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1483a;
    private static volatile df p;
    public int b;
    public int l;
    public boolean m;
    private a q;
    private cu r = cu.a;
    private byte s = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String n = "";
    public String o = "";

    static {
        d dVar = new d();
        f1483a = dVar;
        bi.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(f1483a, "\u0004\u000f��\u0001\u0002\u0019\u000f\u0001��\u0001\u0002ဈ��\u0003ဈ\u0001\u0007ဈ\u0005\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u000b\u000eဈ\f\u000fင\r\u0013ဇ\u0011\u0015ဈ\u0013\u0017ᐉ\u0015\u0018ဈ\u0016\u00192", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o", "r", c.f1482a});
            case 3:
                return new d();
            case 4:
                return new ba(f1483a);
            case 5:
                return f1483a;
            case 6:
                bb bbVar = p;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (d.class) {
                        try {
                            bb bbVar3 = p;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1483a);
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
