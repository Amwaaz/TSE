package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/lifecycle/aj.class */
public final class aj {

    /* renamed from: a */
    public static final aj f66a = new aj();
    private static final Map c = new HashMap();
    public static final Map b = new HashMap();

    private aj() {
    }

    public static final p b(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            newInstance.getClass();
            return (p) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static final boolean c(Class cls) {
        return cls != null && ad.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0264 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Class r7) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.aj.a(java.lang.Class):int");
    }
}
