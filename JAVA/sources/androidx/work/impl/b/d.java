package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/d.class */
public final class d {

    /* renamed from: a */
    public final String f193a;
    public final Long b;

    public d(String str, Long l) {
        this.f193a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a.a.p.b.a.f.h(this.f193a, dVar.f193a) && h.a.a.p.b.a.f.h(this.b, dVar.b);
    }

    public final int hashCode() {
        return (this.f193a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.f193a + ", value=" + this.b + ')';
    }
}
