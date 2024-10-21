package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/k.class */
public final class k {

    /* renamed from: a */
    public final String f195a;
    public final int b;
    public final int c;

    public k(String str, int i, int i2) {
        str.getClass();
        this.f195a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.a.a.p.b.a.f.h(this.f195a, kVar.f195a) && this.b == kVar.b && this.c == kVar.c;
    }

    public final int hashCode() {
        return (((this.f195a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f195a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
