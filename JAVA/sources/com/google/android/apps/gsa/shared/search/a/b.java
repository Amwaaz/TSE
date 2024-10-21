package com.google.android.apps.gsa.shared.search.a;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/search/a/b.class */
public final class b extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1481a;
    private static volatile df h;
    public int b;
    public d f;
    private byte i = 2;
    public v c = v.b;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        b bVar = new b();
        f1481a = bVar;
        bi.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(f1481a, "\u0004\u0005��\u0001\u0001\u0005\u0005����\u0001\u0001ည��\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new b();
            case 4:
                return new ba(f1481a);
            case 5:
                return f1481a;
            case 6:
                bb bbVar = h;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (b.class) {
                        try {
                            bb bbVar3 = h;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1481a);
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
