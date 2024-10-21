package androidx.work;

import android.util.Log;
import androidx.work.impl.b.ac;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import m.a.t;
import m.l.h;
import m.p.s;

/* loaded from: classes-dex2jar.jar:androidx/work/ax.class */
public abstract class ax {

    /* renamed from: a, reason: collision with root package name */
    public boolean f163a;
    public UUID b;
    public ac c;
    public final Set d;
    private final Class e;

    public ax(Class cls) {
        this.e = cls;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new ac(uuid, name);
        String name2 = cls.getName();
        name2.getClass();
        this.d = m.a.an.ak(new String[]{name2});
    }

    public abstract ay a();

    public final ay b() {
        ay a2 = a();
        g gVar = this.c.k;
        boolean z = gVar.a() || gVar.e || gVar.c || gVar.d;
        ac acVar = this.c;
        if (acVar.r) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (acVar.h > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (acVar.x == null) {
            List T = s.T(acVar.d, new String[]{"."}, 0, 6);
            String str = T.size() == 1 ? (String) T.get(0) : (String) t.p(T);
            String str2 = str;
            if (str.length() > 127) {
                str2 = s.ad(str, 127);
            }
            acVar.x = str2;
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        ac acVar2 = this.c;
        acVar2.getClass();
        this.c = new ac(uuid, acVar2.c, acVar2.d, acVar2.e, new l(acVar2.f), new l(acVar2.g), acVar2.h, acVar2.i, acVar2.j, new g(acVar2.k), acVar2.l, acVar2.m, acVar2.n, acVar2.o, acVar2.p, acVar2.q, acVar2.r, acVar2.y, acVar2.s, acVar2.u, acVar2.v, acVar2.w, acVar2.x, 524288);
        return a2;
    }

    public final void c(a aVar, long j, TimeUnit timeUnit) {
        aVar.getClass();
        timeUnit.getClass();
        this.f163a = true;
        ac acVar = this.c;
        acVar.m = aVar;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            af.a();
            Log.w(ac.f190a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            af.a();
            Log.w(ac.f190a, "Backoff delay duration less than minimum value");
        }
        acVar.n = h.f(millis, 10000L, 18000000L);
    }

    public final void d(String str) {
        str.getClass();
        this.d.add(str);
    }

    public final void e(g gVar) {
        gVar.getClass();
        this.c.k = gVar;
    }

    public final void f(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.h) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void g(l lVar) {
        lVar.getClass();
        this.c.f = lVar;
    }
}
