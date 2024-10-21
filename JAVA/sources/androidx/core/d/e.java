package androidx.core.d;

import android.os.LocaleList;
import androidx.core.d.e$;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:androidx/core/d/e.class */
public final class e {

    /* renamed from: a */
    public static final e f46a = b(new LocaleList(new Locale[0]));
    public final f b;

    private e(f fVar) {
        this.b = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f46a;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return b(new LocaleList(localeArr));
    }

    public static e b(LocaleList localeList) {
        return new e(new f(localeList));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.b.equals(((e) obj).b);
    }

    public final int hashCode() {
        return e$.ExternalSyntheticApiModelOutline0.m$1(this.b.f47a);
    }

    public final String toString() {
        return e$.ExternalSyntheticApiModelOutline0.m$1(this.b.f47a);
    }
}
