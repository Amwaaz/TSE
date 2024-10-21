package com.google.android.apps.gsa.shared.util.c;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.common.b.fg;
import com.google.common.base.cl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/c/f.class */
public final class f {
    public static Class a(Class cls) {
        Class cls2 = cls;
        if (cl.L(cls.getSimpleName())) {
            Class superclass = cls.getSuperclass();
            if (superclass != null && !Object.class.equals(superclass)) {
                return superclass;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            if (length == 0) {
                return Object.class;
            }
            cls2 = cls;
            if (length == 1) {
                cls2 = interfaces[0];
            }
        }
        return cls2;
    }

    public static String b(Class cls, String str, String str2) {
        String str3 = str;
        if (str == null) {
            while (true) {
                Class<?> enclosingClass = cls.getEnclosingClass();
                if (enclosingClass == null) {
                    break;
                }
                cls = enclosingClass;
            }
            String simpleName = cls.getSimpleName();
            int indexOf = simpleName.indexOf("$");
            str3 = simpleName;
            if (indexOf != -1) {
                str3 = simpleName.substring(0, indexOf);
            }
        }
        return aus.j(str2, str3, "[", "]");
    }

    public static void c(fg fgVar, Class cls) {
        if (cl.L(cls.getSimpleName()) || cls.isLocalClass()) {
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                c(fgVar, enclosingConstructor.getDeclaringClass());
                fgVar.h(enclosingConstructor);
                return;
            }
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                c(fgVar, enclosingMethod.getDeclaringClass());
                fgVar.h(enclosingMethod);
                return;
            }
            Class<?> enclosingClass = cls.getEnclosingClass();
            if (enclosingClass != null) {
                c(fgVar, enclosingClass);
                fgVar.h(enclosingClass);
            }
        }
    }

    public static void d(int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(String.format("Task priority flag %d does not contain exactly one of task priorities %d, %d", Integer.valueOf(i), 2, 1));
        }
    }

    public static void e(int i) {
        int i2 = i & (-29);
        if (i2 != 0) {
            throw new IllegalArgumentException(String.format("Task resources permissions flag %d contains invalid value %d outside of allowed set of flags %d, %d, %d, %d", Integer.valueOf(i), Integer.valueOf(i2), 8, 4, 16, 0));
        }
    }
}
