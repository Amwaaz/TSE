package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/r.class */
public final class r {

    /* renamed from: a */
    public final String f197a;
    public final int b;

    public r(String str, int i) {
        str.getClass();
        this.f197a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.a.a.p.b.a.f.h(this.f197a, rVar.f197a) && this.b == rVar.b;
    }

    public final int hashCode() {
        return (this.f197a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f197a + ", generation=" + this.b + ')';
    }
}
