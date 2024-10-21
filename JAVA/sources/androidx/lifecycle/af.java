package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/af.class */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public v f64a;
    private ac b;

    public af(ad adVar, v vVar) {
        ac baVar;
        vVar.getClass();
        aj ajVar = aj.f66a;
        boolean z = adVar instanceof ac;
        boolean z2 = adVar instanceof k;
        if (z && z2) {
            baVar = new l((k) adVar, (ac) adVar);
        } else if (z2) {
            baVar = new l((k) adVar, null);
        } else if (z) {
            baVar = (ac) adVar;
        } else {
            Class<?> cls = adVar.getClass();
            if (aj.f66a.a(cls) == 2) {
                Object obj = aj.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    baVar = new bm(aj.b((Constructor) list.get(0), adVar), 2);
                } else {
                    int size = list.size();
                    p[] pVarArr = new p[size];
                    for (int i = 0; i < size; i++) {
                        pVarArr[i] = aj.b((Constructor) list.get(i), adVar);
                    }
                    baVar = new bm(pVarArr, 1);
                }
            } else {
                baVar = new ba(adVar);
            }
        }
        this.b = baVar;
        this.f64a = vVar;
    }

    public final void a(ae aeVar, u uVar) {
        v a2 = uVar.a();
        this.f64a = t.d(this.f64a, a2);
        this.b.a(aeVar, uVar);
        this.f64a = a2;
    }
}
