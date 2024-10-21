package androidx.d;

import androidx.d.a.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import m.a.an;
import m.a.t;
import m.h.b.a.b;
import m.h.b.a.f;

/* loaded from: classes-dex2jar.jar:androidx/d/i.class */
public final class i implements Collection, Set, b, f {

    /* renamed from: a, reason: collision with root package name */
    public int[] f52a;
    public Object[] b;
    public int c;

    public i() {
        throw null;
    }

    public i(int i) {
        this.f52a = a.f48a;
        this.b = a.c;
        if (i > 0) {
            k.c(this, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(i iVar) {
        this(0);
        if (iVar != null) {
            int i = iVar.c;
            b(this.c + i);
            if (this.c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(iVar.b[i2]);
                }
            } else if (i > 0) {
                an.ce(iVar.f52a, this.f52a, 0, i, 6);
                an.cl(iVar.b, this.b, 0, i, 6);
                if (this.c != 0) {
                    throw new ConcurrentModificationException();
                }
                this.c = i;
            }
        }
    }

    public i(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    public final int a(Object obj) {
        return obj == null ? k.b(this, null, 0) : k.b(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int hashCode;
        int b;
        int i = this.c;
        boolean z = false;
        if (obj == null) {
            b = k.b(this, null, 0);
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            b = k.b(this, obj, hashCode);
        }
        if (b < 0) {
            int i2 = b ^ (-1);
            int[] iArr = this.f52a;
            int length = iArr.length;
            if (i >= length) {
                int i3 = 8;
                if (i >= 8) {
                    i3 = (i >> 1) + i;
                } else if (i < 4) {
                    i3 = 4;
                }
                Object[] objArr = this.b;
                k.c(this, i3);
                if (i != this.c) {
                    throw new ConcurrentModificationException();
                }
                int[] iArr2 = this.f52a;
                if (iArr2.length != 0) {
                    an.ce(iArr, iArr2, 0, length, 6);
                    an.cl(objArr, this.b, 0, objArr.length, 6);
                }
            }
            if (i2 < i) {
                int[] iArr3 = this.f52a;
                int i4 = i2 + 1;
                an.cb(iArr3, iArr3, i4, i2, i);
                Object[] objArr2 = this.b;
                an.cd(objArr2, objArr2, i4, i2, i);
            }
            int i5 = this.c;
            if (i == i5) {
                int[] iArr4 = this.f52a;
                if (i2 < iArr4.length) {
                    iArr4[i2] = hashCode;
                    this.b[i2] = obj;
                    this.c = i5 + 1;
                    z = true;
                }
            }
            throw new ConcurrentModificationException();
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        b(this.c + collection.size());
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | add(it.next());
        }
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.f52a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            k.c(this, i);
            int i3 = this.c;
            if (i3 > 0) {
                an.ce(iArr, this.f52a, 0, i3, 6);
                an.cl(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f52a;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                an.cb(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.b;
                an.cd(objArr2, objArr2, i, i5, i2);
            }
            this.b[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            k.c(this, i4);
            if (i > 0) {
                an.ce(iArr, this.f52a, 0, i, 6);
                an.cl(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                an.cb(iArr, this.f52a, i, i6, i2);
                an.cd(objArr, this.b, i, i6, i2);
            }
        }
        if (i2 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.f52a = a.f48a;
            this.b = a.c;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean z;
        collection.getClass();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!contains(it.next())) {
                z = false;
                break;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            z = true;
        } else {
            if ((obj instanceof Set) && this.c == ((Set) obj).size()) {
                try {
                    int i = this.c;
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= i) {
                            break;
                        }
                        if (!((Set) obj).contains(this.b[i2])) {
                            break;
                        }
                        i2++;
                    }
                } catch (ClassCastException | NullPointerException e) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f52a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        c(a2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | remove(it.next());
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!t.Z(collection, this.b[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return an.bA(this.b, 0, this.c);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int i = this.c;
        int length = objArr.length;
        if (length < i) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else {
            objArr2 = objArr;
            if (length > i) {
                objArr[i] = null;
                objArr2 = objArr;
            }
        }
        an.cd(this.b, objArr2, 0, 0, this.c);
        objArr2.getClass();
        return objArr2;
    }

    public final String toString() {
        String sb;
        if (isEmpty()) {
            sb = "{}";
        } else {
            StringBuilder sb2 = new StringBuilder(this.c * 14);
            sb2.append('{');
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                Object obj = this.b[i2];
                if (obj != this) {
                    sb2.append(obj);
                } else {
                    sb2.append("(this Set)");
                }
            }
            sb2.append('}');
            sb = sb2.toString();
        }
        return sb;
    }
}
