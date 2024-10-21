package androidx.b.a.b;

import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/b/a/b/d.class */
public final class d implements Map.Entry {

    /* renamed from: a */
    public final Object f41a;
    public final Object b;
    d c;
    public d d;

    public d(Object obj, Object obj2) {
        this.f41a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f41a.equals(dVar.f41a) && this.b.equals(dVar.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f41a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.f41a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f41a + "=" + this.b;
    }
}
