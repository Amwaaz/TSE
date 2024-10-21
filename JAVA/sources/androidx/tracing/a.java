package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.core.d.i$;
import androidx.webkit.k$;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes-dex2jar.jar:androidx/tracing/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f141a;
    public static Method b;
    public static Method c;
    private static Method d;
    private static Method e;

    public static final void a(String str) {
        str.getClass();
        Trace.beginSection(e(str));
    }

    public static final void b(String str, int i) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            k$.ExternalSyntheticApiModelOutline0.m(e(str), i);
            return;
        }
        String e2 = e(str);
        try {
            if (e == null) {
                e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = e;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(f141a), e2, Integer.valueOf(i));
        } catch (Exception e3) {
            d("traceCounter", e3);
        }
    }

    public static final boolean c() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = i$.ExternalSyntheticApiModelOutline0.m();
        } else {
            try {
                if (d == null) {
                    f141a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                Method method = d;
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object invoke = method.invoke(null, Long.valueOf(f141a));
                invoke.getClass();
                z = ((Boolean) invoke).booleanValue();
            } catch (Exception e2) {
                d("isTagEnabled", e2);
                z = false;
            }
        }
        return z;
    }

    public static final void d(String str, Exception exc) {
        if (!(exc instanceof InvocationTargetException)) {
            Log.v("Trace", a.a.dC(str, "Unable to call ", " via reflection"), exc);
            return;
        }
        Throwable cause = exc.getCause();
        if (!(cause instanceof RuntimeException)) {
            throw new RuntimeException(cause);
        }
        throw cause;
    }

    public static final String e(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String substring = str.substring(0, 127);
        substring.getClass();
        return substring;
    }
}
