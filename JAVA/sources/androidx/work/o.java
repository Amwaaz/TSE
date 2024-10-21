package androidx.work;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes-dex2jar.jar:androidx/work/o.class */
public final class o extends bb {

    /* renamed from: a, reason: collision with root package name */
    public final List f226a = new CopyOnWriteArrayList();

    @Override // androidx.work.bb
    public final ae a(Context context, String str, WorkerParameters workerParameters) {
        ae aeVar;
        Iterator it = this.f226a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aeVar = null;
                break;
            }
            try {
                ae a2 = ((bb) it.next()).a(context, str, workerParameters);
                if (a2 != null) {
                    aeVar = a2;
                    break;
                }
            } catch (Throwable th) {
                af.a();
                Log.e(p.a, "Unable to instantiate a ListenableWorker (" + str + ')', th);
                throw th;
            }
        }
        return aeVar;
    }
}
