package androidx.lifecycle;

import a.a;
import android.os.Looper;
import androidx.b.a.a.b;
import androidx.b.a.a.e;
import androidx.b.a.b.d;
import androidx.b.a.b.h;
import androidx.slice.b$;
import com.google.common.b.fl;
import com.google.common.b.ni;
import h.a.a.p.b.a.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/an.class */
public class an {
    static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final h f68a;
    final Object c;
    int d;
    public boolean e;
    volatile Object f;
    public int g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public an() {
        this.c = new Object();
        this.f68a = new h();
        this.d = 0;
        Object obj = b;
        this.f = obj;
        this.k = new au(this, 1);
        this.h = obj;
        this.g = -1;
    }

    public an(Object obj) {
        this.c = new Object();
        this.f68a = new h();
        this.d = 0;
        this.f = b;
        this.k = new au(this, 1);
        this.h = obj;
        this.g = 0;
    }

    private final void d(am amVar) {
        if (amVar.d) {
            if (!amVar.eX()) {
                amVar.d(false);
                return;
            }
            int i = amVar.e;
            int i2 = this.g;
            if (i < i2) {
                amVar.e = i2;
                amVar.c.eY(this.h);
            }
        }
    }

    static void e(String str) {
        e eVar = b.a().b;
        if (!f.r()) {
            throw new IllegalStateException(a.dC(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public Object a() {
        Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(am amVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (amVar != null) {
                d(amVar);
            } else {
                androidx.b.a.b.e d = this.f68a.d();
                while (d.hasNext()) {
                    d((am) ((d) d.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            amVar = null;
        }
    }

    public void g(ae aeVar, at atVar) {
        e("observe");
        if (aeVar.getLifecycle().a() == v.DESTROYED) {
            return;
        }
        al alVar = new al(this, aeVar, atVar);
        am amVar = (am) this.f68a.e(atVar, alVar);
        if (amVar != null && !amVar.c(aeVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (amVar != null) {
            return;
        }
        aeVar.getLifecycle().c(alVar);
    }

    public final void h(at atVar) {
        e("observeForever");
        ak akVar = new ak(this, atVar);
        am amVar = (am) this.f68a.e(atVar, akVar);
        if (amVar instanceof al) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (amVar != null) {
            return;
        }
        akVar.d(true);
    }

    public void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.k;
        e eVar = b.a().b;
        androidx.b.a.a.d dVar = (androidx.b.a.a.d) eVar;
        if (dVar.c == null) {
            synchronized (dVar.f39a) {
                if (((androidx.b.a.a.d) eVar).c == null) {
                    ((androidx.b.a.a.d) eVar).c = b$.ExternalSyntheticApiModelOutline0.m(Looper.getMainLooper());
                }
            }
        }
        dVar.c.post(runnable);
    }

    public void j(at atVar) {
        e("removeObserver");
        am amVar = (am) this.f68a.b(atVar);
        if (amVar == null) {
            return;
        }
        amVar.b();
        amVar.d(false);
    }

    public final void k(ae aeVar) {
        e("removeObservers");
        Iterator it = this.f68a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((am) entry.getValue()).c(aeVar)) {
                j((at) entry.getKey());
            }
        }
    }

    public void l(Object obj) {
        e("setValue");
        this.g++;
        this.h = obj;
        f(null);
    }

    public final boolean m() {
        return this.d > 0;
    }

    public final boolean n() {
        return this.f68a.e > 0;
    }

    public final boolean o() {
        return this.h != b;
    }

    public final void p() {
        com.google.common.f.ab abVar = com.google.common.f.a.e.a;
        com.google.android.libraries.aw.e.e.c();
        int i = fl.e;
        l(ni.a);
    }

    public final void q(List list) {
        com.google.android.libraries.aw.e.e.c();
        l(fl.m(list));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
    }
}
