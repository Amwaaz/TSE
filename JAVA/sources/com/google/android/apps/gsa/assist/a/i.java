package com.google.android.apps.gsa.assist.a;

import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.assist.d;
import com.google.android.apps.gsa.assist.e;
import com.google.android.apps.gsa.shared.k.c;
import com.google.android.apps.gsa.shared.logger.b.w;
import com.google.android.libraries.gsa.h.h;
import com.google.common.f.j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import e.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assist/a/i.class */
public class i {
    public final c b;
    public final h c;
    public SparseBooleanArray d;
    public Integer e;
    public d g;
    private final a i;
    private static final j h = j.i("com.google.android.apps.gsa.assist.a.i");

    /* renamed from: a, reason: collision with root package name */
    public static final int f235a = f.values().length;
    private final g[] k = new g[f235a];
    private final Object j = new Object();
    public final List f = new ArrayList();

    public i(c cVar, h hVar, a aVar) {
        this.b = cVar;
        this.c = hVar;
        this.i = aVar;
    }

    private final void j(f fVar) {
        g c = c(fVar);
        if (c.f234a == null) {
            c.f234a = new SettableFuture();
        }
        c.b = null;
    }

    public final e a(f fVar) {
        try {
            SettableFuture settableFuture = c(fVar).f234a;
            if (settableFuture != null) {
                com.google.android.apps.gsa.shared.o.a.a aVar = com.google.android.apps.gsa.shared.util.debug.b.d.f1553a;
                return (e) settableFuture.get();
            }
        } catch (InterruptedException e) {
            e = e;
            a.a.dB(h.e(), "Exception when retrieving AssistData.", (char) 153, e);
            ((com.google.android.apps.gsa.shared.logger.b.h) this.i.a()).a(j.a(w.ASSIST_DATA_MANAGER_GET_NULL_ASSIST_DATA, fVar));
            return null;
        } catch (CancellationException e2) {
            e = e2;
            a.a.dB(h.e(), "Exception when retrieving AssistData.", (char) 153, e);
            ((com.google.android.apps.gsa.shared.logger.b.h) this.i.a()).a(j.a(w.ASSIST_DATA_MANAGER_GET_NULL_ASSIST_DATA, fVar));
            return null;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        }
        ((com.google.android.apps.gsa.shared.logger.b.h) this.i.a()).a(j.a(w.ASSIST_DATA_MANAGER_GET_NULL_ASSIST_DATA, fVar));
        return null;
    }

    public final d b(f fVar) {
        if (c(fVar).b != null) {
            d dVar = c(fVar).b;
            dVar.getClass();
            return dVar;
        }
        com.google.common.f.h e = h.e();
        e.ak(154);
        e.s("getConfig for type: %s was called when config was null", fVar);
        return d.a;
    }

    public final g c(f fVar) {
        g gVar;
        synchronized (this.j) {
            if (this.k[fVar.ordinal()] == null) {
                this.k[fVar.ordinal()] = new g();
            }
            gVar = this.k[fVar.ordinal()];
            gVar.getClass();
        }
        return gVar;
    }

    public final cn d(f fVar) {
        SettableFuture settableFuture = c(fVar).f234a;
        if (settableFuture != null) {
            return dl.o(settableFuture);
        }
        return null;
    }

    public final void e() {
        SettableFuture settableFuture;
        for (f fVar : f.values()) {
            synchronized (this.j) {
                g gVar = this.k[fVar.ordinal()];
                if (gVar != null && (settableFuture = gVar.f234a) != null) {
                    settableFuture.cancel(true);
                    gVar.f234a = new SettableFuture();
                }
                this.k[fVar.ordinal()] = null;
            }
        }
        this.g = null;
        this.e = null;
    }

    public final void f(f fVar) {
        j(fVar);
        if (i(fVar)) {
            j(f.SCREENSHOT);
        }
    }

    public final void g(e eVar, f fVar) {
        g c = c(fVar);
        SettableFuture settableFuture = c.f234a;
        if (settableFuture == null || settableFuture.isDone()) {
            c.f234a = new SettableFuture();
        }
        c.f234a.n(eVar);
        ((com.google.android.apps.gsa.shared.logger.b.h) this.i.a()).a(j.a(eVar == null ? w.ASSIST_DATA_MANAGER_SET_NULL_ASSIST_DATA : eVar.equals(e.a) ? w.ASSIST_DATA_MANAGER_SET_EMPTY_ASSIST_DATA : w.ASSIST_DATA_MANAGER_SET_ASSIST_DATA, fVar));
    }

    public final boolean h(f fVar) {
        return c(fVar).f234a != null;
    }

    public final boolean i(f fVar) {
        if (fVar != f.CONTEXTUAL) {
            return false;
        }
        Integer num = this.e;
        return num == null || !this.d.get(num.intValue());
    }
}
