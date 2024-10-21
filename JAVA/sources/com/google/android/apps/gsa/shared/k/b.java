package com.google.android.apps.gsa.shared.k;

import com.google.android.apps.gsa.shared.util.s;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.b.ni;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/k/b.class */
public final class b {

    /* renamed from: a */
    public static final s f1407a = new s(";", ",");

    public static fl a(String str, a aVar) {
        if (str.isEmpty()) {
            int i = fl.e;
            return ni.a;
        }
        String[] split = str.split(",");
        fg h = fl.h(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                try {
                    Object a2 = aVar.a(Integer.parseInt(str2));
                    if (a2 != null) {
                        h.h(a2);
                    }
                } catch (Throwable th) {
                }
            }
        }
        return h.g();
    }

    public static fl b(String str) {
        if (str.isEmpty()) {
            int i = fl.e;
            return ni.a;
        }
        String[] split = str.split(",");
        fg h = fl.h(split.length);
        for (String str2 : split) {
            h.h(Integer.valueOf(Integer.parseInt(str2)));
        }
        return h.g();
    }

    public static fl c(String str) {
        if (str.isEmpty()) {
            int i = fl.e;
            return ni.a;
        }
        String[] split = str.split(",");
        fg h = fl.h(split.length);
        for (String str2 : split) {
            h.h(Long.valueOf(Long.parseLong(str2)));
        }
        return h.g();
    }

    public static fl d(String str) {
        if (!str.isEmpty()) {
            return fl.o(str.split(","));
        }
        int i = fl.e;
        return ni.a;
    }
}
