package androidx.lifecycle;

import androidx.b.a.a.b;
import androidx.b.a.a.e;
import androidx.b.a.b.a;
import androidx.b.a.b.d;
import h.a.a.p.b.a.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.b.cs;
import kotlinx.coroutines.b.dj;
import kotlinx.coroutines.b.dl;
import kotlinx.coroutines.b.dm;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/ag.class */
public class ag extends w {
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    public a b = new a();
    public v c = v.INITIALIZED;
    private final ArrayList h = new ArrayList();
    private final dl i = dm.a(v.INITIALIZED);

    public ag(ae aeVar) {
        this.d = new WeakReference(aeVar);
    }

    public static final void h(String str) {
        e eVar = b.a().b;
        if (!f.r()) {
            throw new IllegalStateException(a.a.dC(str, "Method ", " must be called on the main thread"));
        }
    }

    private final v i(ad adVar) {
        a aVar = this.b;
        v vVar = null;
        d dVar = aVar.f40a.containsKey(adVar) ? ((d) aVar.f40a.get(adVar)).d : null;
        v vVar2 = dVar != null ? ((af) dVar.b).f64a : null;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            vVar = (v) arrayList.get(arrayList.size() - 1);
        }
        return t.d(t.d(this.c, vVar2), vVar);
    }

    private final void j(v vVar) {
        v vVar2 = this.c;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 == v.INITIALIZED && vVar == v.DESTROYED) {
            throw new IllegalStateException("State must be at least CREATED to move to " + vVar + ", but was " + this.c + " in component " + this.d.get());
        }
        this.c = vVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        l();
        this.f = false;
        if (this.c == v.DESTROYED) {
            this.b = new a();
        }
    }

    private final void k() {
        ArrayList arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        r5.g = false;
        r5.i.g(r5.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ag.l():void");
    }

    @Override // androidx.lifecycle.w
    public final v a() {
        return this.c;
    }

    @Override // androidx.lifecycle.w
    public final dj b() {
        return new cs(this.i);
    }

    @Override // androidx.lifecycle.w
    public final void c(ad adVar) {
        Object obj;
        ae aeVar;
        adVar.getClass();
        h("addObserver");
        v vVar = this.c;
        v vVar2 = v.DESTROYED;
        v vVar3 = vVar2;
        if (vVar != vVar2) {
            vVar3 = v.INITIALIZED;
        }
        af afVar = new af(adVar, vVar3);
        a aVar = this.b;
        d a2 = aVar.a(adVar);
        if (a2 != null) {
            obj = a2.b;
        } else {
            aVar.f40a.put(adVar, aVar.c(adVar, afVar));
            obj = null;
        }
        if (((af) obj) == null && (aeVar = (ae) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            v i = i(adVar);
            this.e++;
            while (afVar.f64a.compareTo(i) < 0 && this.b.f40a.containsKey(adVar)) {
                this.h.add(afVar.f64a);
                u b = t.b(afVar.f64a);
                if (b == null) {
                    v vVar4 = afVar.f64a;
                    Objects.toString(vVar4);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(vVar4)));
                }
                afVar.a(aeVar, b);
                k();
                i = i(adVar);
            }
            if (!z) {
                l();
            }
            this.e--;
        }
    }

    @Override // androidx.lifecycle.w
    public final void d(ad adVar) {
        adVar.getClass();
        h("removeObserver");
        this.b.b(adVar);
    }

    public void e(u uVar) {
        uVar.getClass();
        h("handleLifecycleEvent");
        j(uVar.a());
    }

    @m.a
    public final void f(v vVar) {
        vVar.getClass();
        h("markState");
        g(vVar);
    }

    public final void g(v vVar) {
        vVar.getClass();
        h("setCurrentState");
        j(vVar);
    }
}
