package androidx.e.a;

import com.google.common.util.concurrent.cn;

/* loaded from: classes-dex2jar.jar:androidx/e/a/g.class */
public final class g {
    public static cn a(d dVar) {
        b bVar = new b();
        f fVar = new f(bVar);
        bVar.b = fVar;
        bVar.f61a = dVar.getClass();
        try {
            Object a2 = dVar.a(bVar);
            if (a2 != null) {
                bVar.f61a = a2;
            }
        } catch (Exception e) {
            fVar.b.g(e);
        }
        return fVar;
    }
}
