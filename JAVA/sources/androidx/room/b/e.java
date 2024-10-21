package androidx.room.b;

import androidx.room.ao;
import androidx.room.bo;
import androidx.room.by;
import androidx.room.u;
import java.util.Arrays;
import kotlinx.coroutines.b.b;
import kotlinx.coroutines.b.cp;
import kotlinx.coroutines.b.m;
import m.c.g;
import m.h;
import m.h.a.l;

/* loaded from: classes-dex2jar.jar:androidx/room/b/e.class */
public final class e {
    public static final m a(ao aoVar, String[] strArr, l lVar) {
        u N = aoVar.N();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
        strArr2.getClass();
        by byVar = N.c;
        h f = byVar.f(strArr2);
        Object obj = f.a;
        return new d(cp.r(new b(new bo(byVar, (int[]) f.b, (String[]) obj, (g) null, 0))), aoVar, lVar);
    }
}
