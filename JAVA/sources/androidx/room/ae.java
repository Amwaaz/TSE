package androidx.room;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes-dex2jar.jar:androidx/room/ae.class */
public final class ae {

    /* renamed from: a */
    public final q f84a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public ae(q qVar, int[] iArr, String[] strArr) {
        m.a.aa singleton;
        iArr.getClass();
        strArr.getClass();
        this.f84a = qVar;
        this.b = iArr;
        this.c = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        if (length2 == 0) {
            singleton = m.a.aa.a;
        } else {
            singleton = Collections.singleton(strArr[0]);
            singleton.getClass();
        }
        this.d = singleton;
    }
}
