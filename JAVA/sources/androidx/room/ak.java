package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m.m.b;

/* loaded from: classes-dex2jar.jar:androidx/room/ak.class */
public final class ak {
    public androidx.u.a.f b;
    public boolean c;
    public boolean e;
    private final b g;
    private final Context h;
    private final String i;
    private Executor k;
    private Executor l;
    private Intent m;
    private TimeUnit o;
    private m.c.n t;
    private final List j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final List f88a = new ArrayList();
    public final int f = 1;
    private long n = -1;
    private final al p = new al();
    private final Set q = new LinkedHashSet();
    private final Set r = new LinkedHashSet();
    private final List s = new ArrayList();
    public boolean d = true;

    public ak(Context context, Class cls, String str) {
        int i = m.h.b.ab.a;
        this.g = new m.h.b.f(cls);
        this.h = context;
        this.i = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0444 A[LOOP:6: B:107:0x03ea->B:121:0x0444, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.room.ao a() {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ak.a():androidx.room.ao");
    }

    public final void b() {
        this.m = this.i != null ? new Intent(this.h, (Class<?>) MultiInstanceInvalidationService.class) : null;
    }

    public final void c(androidx.room.e.a... aVarArr) {
        int length;
        aVarArr.getClass();
        int i = 0;
        while (true) {
            length = aVarArr.length;
            if (i >= length) {
                break;
            }
            androidx.room.e.a aVar = aVarArr[i];
            this.r.add(Integer.valueOf(aVar.f118a));
            this.r.add(Integer.valueOf(aVar.b));
            i++;
        }
        al alVar = this.p;
        androidx.room.e.a[] aVarArr2 = (androidx.room.e.a[]) Arrays.copyOf(aVarArr, length);
        aVarArr2.getClass();
        for (androidx.room.e.a aVar2 : aVarArr2) {
            alVar.a(aVar2);
        }
    }

    @m.a
    public final void d() {
        this.d = false;
        this.e = true;
    }

    @m.a
    public final void e(int... iArr) {
        for (int i : iArr) {
            this.q.add(Integer.valueOf(i));
        }
    }

    public final void f() {
        this.d = true;
        this.e = true;
    }

    public final void g(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.n = 60L;
        this.o = timeUnit;
    }

    public final void h(m.c.n nVar) {
        nVar.getClass();
        if (this.k != null || this.l != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (nVar.get(m.c.i.k) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.t = nVar;
    }

    public final void i(Executor executor) {
        executor.getClass();
        if (this.t != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        this.k = executor;
    }

    public final void j(Executor executor) {
        if (this.t != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        this.l = executor;
    }

    public final void k(bi biVar) {
        this.j.add(biVar);
    }
}
