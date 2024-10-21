package com.google.android.apps.gsa.shared.ad;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.bs;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;
import com.google.protobuf.v;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/ad/a.class */
public final class a extends bi implements cz {

    /* renamed from: a */
    public static final a f1366a;
    private static volatile df l;
    public int b;
    public boolean d;
    public float e;
    public int f;
    public long g;
    public String c = "";
    public String h = "";
    public cb i = bi.emptyProtobufList();
    public v j = v.b;
    public bs k = emptyIntList();

    static {
        a aVar = new a();
        f1366a = aVar;
        bi.registerDefaultInstance(a.class, aVar);
    }

    private a() {
    }

    public final void a() {
        cb cbVar = this.i;
        if (cbVar.c()) {
            return;
        }
        this.i = bi.mutableCopy(cbVar);
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1366a, "\u0004\t��\u0001\u0001\t\t��\u0002��\u0001ဈ��\u0002ဇ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007\u001a\bည\u0006\t\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new a();
            case 4:
                return new ba(f1366a);
            case 5:
                return f1366a;
            case 6:
                bb bbVar = l;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = l;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1366a);
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
