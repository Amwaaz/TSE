package com.google.android.apps.gsa.shared.util.b;

import android.os.Looper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/b/f.class */
public final class f {

    /* renamed from: a */
    private static SimpleDateFormat f1505a;

    public static Object a(CharSequence charSequence) {
        return e.c(charSequence).a(false);
    }

    public static Object b(Object obj) {
        return e.c(obj).a(false);
    }

    public static Object c(CharSequence charSequence) {
        return new b(charSequence).a(false);
    }

    public static void d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("checkNotMainThread failed");
        }
    }

    public static void e(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static String f(Date date) {
        String format;
        synchronized (f.class) {
            try {
                if (f1505a == null) {
                    f1505a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
                }
                format = f1505a.format(date);
            } catch (Throwable th) {
                throw th;
            }
        }
        return format;
    }
}
