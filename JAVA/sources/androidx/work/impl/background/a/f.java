package androidx.work.impl.background.a;

import androidx.work.aq;
import androidx.work.impl.at;
import androidx.work.impl.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/background/a/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final at f203a;
    private final aq b;
    private final long c;
    private final Object d;
    private final Map e;

    public f(aq aqVar, at atVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.b = aqVar;
        this.f203a = atVar;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(v vVar) {
        Runnable runnable;
        vVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(vVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(v vVar) {
        vVar.getClass();
        Runnable eVar = new e(this, vVar);
        synchronized (this.d) {
        }
        this.b.b(this.c, eVar);
    }
}
