package com.google.android.apps.gsa.assistant.shared.d;

import com.google.g.x.a.d;
import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cb;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/d/k.class */
public final class k extends bi implements cz {

    /* renamed from: a */
    public static final k f265a;
    private static volatile df e;
    public int b;
    public d d;
    private byte f = 2;
    public cb c = bi.emptyProtobufList();

    static {
        k kVar = new k();
        f265a = kVar;
        bi.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(f265a, "\u0004\u0002��\u0001\u0002\u0003\u0002��\u0001\u0001\u0002\u001a\u0003ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new k();
            case 4:
                return new ba(f265a);
            case 5:
                return f265a;
            case 6:
                bb bbVar = e;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (k.class) {
                        try {
                            bb bbVar3 = e;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f265a);
                                e = bbVar2;
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
