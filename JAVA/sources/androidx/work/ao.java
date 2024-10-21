package androidx.work;

import android.util.Log;
import androidx.work.impl.b.ac;
import java.util.concurrent.TimeUnit;

/* loaded from: classes-dex2jar.jar:androidx/work/ao.class */
public final class ao extends ax {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        ac acVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            af.a();
            Log.w(ac.f190a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        acVar.c(millis < 900000 ? 900000L : millis, millis < 900000 ? 900000L : millis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.c(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }

    @Override // androidx.work.ax
    public final /* bridge */ /* synthetic */ ay a() {
        if (this.f163a && this.c.k.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        ac acVar = this.c;
        if (acVar.r) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new ay(this.b, acVar, this.d);
    }
}
