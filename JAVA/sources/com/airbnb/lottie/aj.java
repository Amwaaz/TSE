package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.f.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes-dex2jar.jar:com/airbnb/lottie/aj.class */
public final class aj {

    /* renamed from: a */
    public static Executor f228a = Executors.newCachedThreadPool();
    private final Set c = new LinkedHashSet(1);
    private final Set d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());
    public volatile ag b = null;

    public aj(Callable callable, boolean z) {
        if (!z) {
            f228a.execute(new ai(this, callable));
            return;
        }
        try {
            c((ag) callable.call());
        } catch (Throwable th) {
            c(new ag(th));
        }
    }

    public final void a(Throwable th) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.d);
            if (arrayList.isEmpty()) {
                d.a("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ac) arrayList.get(i)).a(th);
            }
        }
    }

    public final void b(Object obj) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ac) arrayList.get(i)).a(obj);
            }
        }
    }

    public final void c(ag agVar) {
        if (this.b != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.b = agVar;
        this.e.post(new ah(this));
    }

    public final void d(ac acVar) {
        Throwable th;
        synchronized (this) {
            ag agVar = this.b;
            if (agVar != null && (th = agVar.b) != null) {
                acVar.a(th);
            }
            this.d.add(acVar);
        }
    }

    public final void e(ac acVar) {
        Object obj;
        synchronized (this) {
            ag agVar = this.b;
            if (agVar != null && (obj = agVar.a) != null) {
                acVar.a(obj);
            }
            this.c.add(acVar);
        }
    }

    public final void f(ac acVar) {
        synchronized (this) {
            this.d.remove(acVar);
        }
    }

    public final void g(ac acVar) {
        synchronized (this) {
            this.c.remove(acVar);
        }
    }
}
