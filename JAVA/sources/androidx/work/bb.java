package androidx.work;

import android.content.Context;
import android.util.Log;

/* loaded from: classes-dex2jar.jar:androidx/work/bb.class */
public abstract class bb {
    public abstract ae a(Context context, String str, WorkerParameters workerParameters);

    public final ae b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        ae a2 = a(context, str, workerParameters);
        ae aeVar = a2;
        if (a2 == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(ae.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    aeVar = (ae) newInstance;
                } catch (Throwable th) {
                    String concat = "Could not instantiate ".concat(str);
                    af.a();
                    Log.e(bc.a, concat, th);
                    throw th;
                }
            } catch (Throwable th2) {
                String concat2 = "Invalid class: ".concat(str);
                af.a();
                Log.e(bc.a, concat2, th2);
                throw th2;
            }
        }
        if (!aeVar.h) {
            return aeVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
