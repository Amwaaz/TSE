package com.google.android.apps.gsa.nga.engine.w.a.a;

import com.google.protobuf.bb;
import com.google.protobuf.bc;
import com.google.protobuf.bd;
import com.google.protobuf.be;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/w/a/a/d.class */
public final class d extends bd implements be {

    /* renamed from: a */
    public static final d f821a;
    private static volatile df i;
    public int b;
    public g c;
    public g d;
    public b f;
    public c g;
    public boolean h;
    private byte j = 2;
    public String e = "";

    static {
        d dVar = new d();
        f821a = dVar;
        bi.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        byte b = 1;
        switch (bhVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(f821a, "\u0004\u0006��\u0001\u0001\r\u0006����\u0002\u0001ᐉ��\u0002ᐉ\u0001\u0003ဈ\u0002\u000bဉ\u0004\fဉ\u0003\rဇ\u0005", new Object[]{"b", "c", "d", "e", "g", "f", "h"});
            case 3:
                return new d();
            case 4:
                return new bc(f821a);
            case 5:
                return f821a;
            case 6:
                bb bbVar = i;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (d.class) {
                        try {
                            bb bbVar3 = i;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f821a);
                                i = bbVar2;
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
