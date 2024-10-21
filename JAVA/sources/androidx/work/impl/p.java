package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.bf;
import androidx.work.bg;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.b.b;
import com.google.common.util.concurrent.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.bq;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/p.class */
public final class p implements androidx.work.impl.foreground.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f209a = androidx.work.af.b("Processor");
    public final Context c;
    public final WorkDatabase d;
    private final androidx.work.c k;
    private final b l;
    public final Map f = new HashMap();
    public final Map e = new HashMap();
    public final Set h = new HashSet();
    public final List i = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object j = new Object();
    public final Map g = new HashMap();

    public p(Context context, androidx.work.c cVar, b bVar, WorkDatabase workDatabase) {
        this.c = context;
        this.k = cVar;
        this.l = bVar;
        this.d = workDatabase;
    }

    public static boolean e(String str, bp bpVar, int i) {
        if (bpVar == null) {
            androidx.work.af.a().c(f209a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
            return false;
        }
        bpVar.j.m(new az(i));
        androidx.work.af.a().c(f209a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
        return true;
    }

    private final void h(androidx.work.impl.b.r rVar) {
        this.l.d.execute(new n(this, rVar));
    }

    public final bp a(String str) {
        bp bpVar = (bp) this.e.remove(str);
        boolean z = bpVar != null;
        if (!z) {
            bpVar = (bp) this.f.remove(str);
        }
        this.g.remove(str);
        if (z) {
            synchronized (this.j) {
                if (this.e.isEmpty()) {
                    Intent intent = new Intent(this.c, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.c.startService(intent);
                    } catch (Throwable th) {
                        androidx.work.af.a();
                        Log.e(f209a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return bpVar;
    }

    public final bp b(String str) {
        bp bpVar = (bp) this.e.get(str);
        return bpVar == null ? (bp) this.f.get(str) : bpVar;
    }

    public final void c(c cVar) {
        synchronized (this.j) {
            this.i.add(cVar);
        }
    }

    public final void d(c cVar) {
        synchronized (this.j) {
            this.i.remove(cVar);
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.j) {
            z = b(str) != null;
        }
        return z;
    }

    public final boolean g(v vVar, bg bgVar) {
        androidx.work.impl.b.r rVar = vVar.a;
        String str = rVar.f197a;
        ArrayList arrayList = new ArrayList();
        androidx.work.impl.b.ac acVar = (androidx.work.impl.b.ac) this.d.R(new o(this, arrayList, str));
        if (acVar == null) {
            androidx.work.af.a();
            String str2 = f209a;
            Objects.toString(rVar);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(rVar.toString()));
            h(rVar);
            return false;
        }
        synchronized (this.j) {
            if (f(str)) {
                Set set = (Set) this.g.get(str);
                if (((v) set.iterator().next()).a.b == rVar.b) {
                    set.add(vVar);
                    androidx.work.af.a().c(f209a, a.a.dI(rVar, "Work ", " is already enqueued for processing"));
                } else {
                    h(rVar);
                }
                return false;
            }
            if (acVar.t != rVar.b) {
                h(rVar);
                return false;
            }
            bf bfVar = new bf(this.c, this.k, this.l, this, this.d, acVar, arrayList);
            if (bgVar != null) {
                bfVar.g = bgVar;
            }
            bp bpVar = new bp(bfVar);
            cn f = bf.f(bpVar.i.b.plus(new bq((bo) null)), new bl(bpVar, (m.c.g) null, 0));
            ((androidx.e.a.f) f).b.b(new as(this, f, bpVar, 1), this.l.d);
            this.f.put(str, bpVar);
            HashSet hashSet = new HashSet();
            hashSet.add(vVar);
            this.g.put(str, hashSet);
            androidx.work.af a2 = androidx.work.af.a();
            a2.c(f209a, getClass().getSimpleName() + ": processing " + rVar);
            return true;
        }
    }
}
