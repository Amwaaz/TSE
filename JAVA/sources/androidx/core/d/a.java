package androidx.core.d;

import android.os.Build;
import androidx.l.a.a.b$;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:androidx/core/d/a.class */
public final class a {

    /* renamed from: a */
    public static final int f45a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b$.ExternalSyntheticApiModelOutline0.m(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            b$.ExternalSyntheticApiModelOutline0.m(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            b$.ExternalSyntheticApiModelOutline0.m(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            b$.ExternalSyntheticApiModelOutline0.m(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (h.a.a.p.b.a.f.h("REL", str2)) {
            return false;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @m.a
    public static final boolean b() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 31) {
            if (Build.VERSION.SDK_INT >= 30) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!a("S", str)) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @m.a
    public static final boolean c() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 33) {
            if (Build.VERSION.SDK_INT >= 32) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!a("Tiramisu", str)) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @m.a
    public static final boolean d() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 34) {
            if (Build.VERSION.SDK_INT >= 33) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!a("UpsideDownCake", str)) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final boolean e() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 35) {
            if (Build.VERSION.SDK_INT >= 34) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!a("VanillaIceCream", str)) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
