package androidx.b.a.b;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes-dex2jar.jar:androidx/b/a/b/e.class */
public final class e extends g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final h f42a;
    private d b;
    private boolean c = true;

    public e(h hVar) {
        this.f42a = hVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        d dVar;
        if (this.c) {
            this.c = false;
            dVar = this.f42a.b;
        } else {
            d dVar2 = this.b;
            dVar = dVar2 != null ? dVar2.c : null;
        }
        this.b = dVar;
        return this.b;
    }

    @Override // androidx.b.a.b.g
    public final void eq(d dVar) {
        d dVar2 = this.b;
        if (dVar == dVar2) {
            d dVar3 = dVar2.d;
            this.b = dVar3;
            this.c = dVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.f42a.b != null;
        }
        d dVar = this.b;
        return (dVar == null || dVar.c == null) ? false : true;
    }
}
