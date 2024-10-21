package com.google.android.apps.gsa.shared.speech.hotword.b;

import com.google.protobuf.ba;
import com.google.protobuf.bb;
import com.google.protobuf.bh;
import com.google.protobuf.bi;
import com.google.protobuf.cz;
import com.google.protobuf.df;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/b/a.class */
public final class a extends bi implements cz {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1489a;
    private static volatile df h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "Ok Google";
    public boolean f;
    public int g;

    static {
        a aVar = new a();
        f1489a = aVar;
        bi.registerDefaultInstance(a.class, aVar);
    }

    private a() {
        bi.emptyProtobufList();
        this.g = 1;
    }

    protected final Object dynamicMethod(bh bhVar, Object obj, Object obj2) {
        switch (bhVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f1489a, "\u0004\u0005��\u0001\u0001\u0006\u0005������\u0001ဈ��\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", b.f1490a});
            case 3:
                return new a();
            case 4:
                return new ba(f1489a);
            case 5:
                return f1489a;
            case 6:
                bb bbVar = h;
                bb bbVar2 = bbVar;
                if (bbVar == null) {
                    synchronized (a.class) {
                        try {
                            bb bbVar3 = h;
                            bbVar2 = bbVar3;
                            if (bbVar3 == null) {
                                bbVar2 = new bb(f1489a);
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
