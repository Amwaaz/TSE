package androidx.work.impl.utils;

import androidx.work.af;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/utils/f.class */
public final class f {

    /* renamed from: a */
    public static final String f219a = af.b("NetworkRequestCompat");
    public final Object b;

    public f() {
        this.b = null;
    }

    public f(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.a.a.p.b.a.f.h(this.b, ((f) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }
}
