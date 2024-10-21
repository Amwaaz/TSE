package androidx.work;

import android.util.Log;

/* loaded from: classes-dex2jar.jar:androidx/work/af.class */
public final class af {

    /* renamed from: a */
    public static final Object f158a = new Object();
    public static volatile af b;
    public final int c;

    public af() {
        throw null;
    }

    public af(int i) {
        this.c = i;
    }

    public static af a() {
        af afVar;
        synchronized (f158a) {
            if (b == null) {
                b = new af(3);
            }
            afVar = b;
        }
        return afVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(String str, String str2) {
        if (this.c <= 3) {
            Log.d(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.c <= 3) {
            Log.d(str, str2, th);
        }
    }
}
