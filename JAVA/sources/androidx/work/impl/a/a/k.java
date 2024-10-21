package androidx.work.impl.a.a;

import android.os.Build;
import androidx.work.impl.b.ac;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/a/k.class */
public final class k extends d {
    public k(androidx.work.impl.a.b.i iVar) {
        super(iVar);
    }

    @Override // androidx.work.impl.a.a.g
    public final boolean b(ac acVar) {
        int i = acVar.k.j;
        boolean z = true;
        if (i != 3) {
            if (Build.VERSION.SDK_INT < 30) {
                z = false;
            } else {
                if (i != 6) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.work.impl.a.a.d
    protected final int d() {
        return 7;
    }

    @Override // androidx.work.impl.a.a.d
    public final /* bridge */ /* synthetic */ boolean e(Object obj) {
        androidx.work.impl.a.i iVar = (androidx.work.impl.a.i) obj;
        iVar.getClass();
        return !iVar.a || iVar.c;
    }
}
