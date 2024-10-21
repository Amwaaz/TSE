package androidx.work.impl.a;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.af;
import androidx.work.impl.a.a.e;
import androidx.work.impl.a.a.f;
import androidx.work.impl.a.a.g;
import androidx.work.impl.a.a.k;
import androidx.work.impl.a.a.l;
import androidx.work.impl.a.b.i;
import androidx.work.impl.a.b.p;
import androidx.work.impl.b.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.aj;
import kotlinx.coroutines.b.m;
import m.a.an;
import m.a.t;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/a/o.class */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f175a;

    public o(p pVar) {
        e eVar = new e(pVar.b);
        f fVar = new f(pVar.c);
        l lVar = new l(pVar.e);
        i iVar = pVar.d;
        androidx.work.impl.a.a.h hVar = new androidx.work.impl.a.a.h(iVar);
        k kVar = new k(iVar);
        androidx.work.impl.a.a.j jVar = new androidx.work.impl.a.a.j(pVar.d);
        androidx.work.impl.a.a.i iVar2 = new androidx.work.impl.a.a.i(pVar.d);
        Context context = pVar.f173a;
        String str = r.f176a;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.f175a = an.bN(new g[]{eVar, fVar, lVar, hVar, kVar, jVar, iVar2, new h((ConnectivityManager) systemService, r.b)});
    }

    public final m a(ac acVar) {
        acVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f175a) {
            if (((g) obj).b(acVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.aX(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g) it.next()).a(acVar.k));
        }
        return aj.a(new n((m[]) t.N(arrayList2).toArray(new m[0])));
    }

    public final boolean b(ac acVar) {
        acVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f175a) {
            if (((g) obj).c(acVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            af.a().c(r.f176a, "Work " + acVar.b + " constrained by " + t.ae(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, k.a, 31));
        }
        return arrayList.isEmpty();
    }
}
