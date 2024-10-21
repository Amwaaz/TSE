package androidx.d;

import androidx.d.a.a;
import h.a.a.p.b.a.f;
import java.util.ConcurrentModificationException;

/* loaded from: classes-dex2jar.jar:androidx/d/k.class */
public final class k {
    public static final int a(i iVar, int i) {
        try {
            return a.a(iVar.f52a, iVar.c, i);
        } catch (IndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int b(i iVar, Object obj, int i) {
        int i2 = iVar.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(iVar, i);
        if (a2 >= 0 && !f.h(obj, iVar.b[a2])) {
            int i3 = a2 + 1;
            while (i3 < i2 && iVar.f52a[i3] == i) {
                if (f.h(obj, iVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && iVar.f52a[i4] == i; i4--) {
                if (f.h(obj, iVar.b[i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    public static final void c(i iVar, int i) {
        iVar.f52a = new int[i];
        iVar.b = new Object[i];
    }
}
