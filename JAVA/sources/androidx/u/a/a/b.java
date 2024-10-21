package androidx.u.a.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* loaded from: classes-dex2jar.jar:androidx/u/a/a/b.class */
final class b extends m.h.b.n implements m.h.a.a {
    private final int c;
    public static final b b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public static final b f144a = new b(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        super(0);
        this.c = i;
    }

    public final /* synthetic */ Object a() {
        Method method;
        Method method2 = null;
        if (this.c == 0) {
            try {
                Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                declaredMethod.setAccessible(true);
                method2 = declaredMethod;
            } catch (Throwable th) {
            }
            return method2;
        }
        try {
            m.e eVar = e.f146a;
            Method b2 = c.b();
            method = null;
            if (b2 != null) {
                Class<?> returnType = b2.getReturnType();
                method = null;
                if (returnType != null) {
                    Class<?> cls = Integer.TYPE;
                    method = returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                }
            }
        } catch (Throwable th2) {
            method = null;
        }
        return method;
    }
}
