package androidx.d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m.h.b.a.a;

/* loaded from: classes-dex2jar.jar:androidx/d/q.class */
public abstract class q implements Iterator, a {

    /* renamed from: a */
    private int f53a;
    private int b;
    private boolean c;

    public q(int i) {
        this.f53a = i;
    }

    protected abstract Object a(int i);

    protected abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.f53a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a2 = a(this.b);
        this.b++;
        this.c = true;
        return a2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.f53a--;
        this.c = false;
    }
}
