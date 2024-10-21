package androidx.work.impl.b;

/* loaded from: classes-dex2jar.jar:androidx/work/impl/b/aa.class */
public final class aa {

    /* renamed from: a */
    public final String f189a;
    public final androidx.work.as b;

    public aa(String str, androidx.work.as asVar) {
        str.getClass();
        asVar.getClass();
        this.f189a = str;
        this.b = asVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.a.a.p.b.a.f.h(this.f189a, aaVar.f189a) && this.b == aaVar.b;
    }

    public final int hashCode() {
        return (this.f189a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.f189a + ", state=" + this.b + ')';
    }
}
