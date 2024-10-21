package androidx.d;

import androidx.d.a.a;
import h.a.a.p.b.a.f;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import m.a.an;

/* loaded from: classes-dex2jar.jar:androidx/d/bk.class */
public class bk {

    /* renamed from: a, reason: collision with root package name */
    private int[] f49a;
    private Object[] b;
    public int d;

    public bk() {
        this(0);
    }

    public bk(int i) {
        this.f49a = i == 0 ? a.f48a : new int[i];
        this.b = i == 0 ? a.c : new Object[i + i];
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a.a(this.f49a, i2, i);
        if (a2 >= 0 && !f.h(obj, this.b[a2 + a2])) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.f49a[i3] == i) {
                if (f.h(obj, this.b[i3 + i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f49a[i4] == i; i4--) {
                if (f.h(obj, this.b[i4 + i4])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return a2;
    }

    private final int b() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a2 = a.a(this.f49a, i, 0);
        if (a2 >= 0 && this.b[a2 + a2] != null) {
            int i2 = a2 + 1;
            while (i2 < i && this.f49a[i2] == 0) {
                if (this.b[i2 + i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.f49a[i3] == 0; i3--) {
                if (this.b[i3 + i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return a2;
    }

    public final int c(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (f.h(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.d > 0) {
            this.f49a = a.f48a;
            this.b = a.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? b() : a(obj, obj.hashCode());
    }

    public final Object e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.a.dA(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof bk) {
                int i = this.d;
                bk bkVar = (bk) obj;
                if (i != bkVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = bkVar.get(e);
                    if (h == null) {
                        if (obj2 != null || !bkVar.containsKey(e)) {
                            return false;
                        }
                    } else if (!f.h(h, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(e2);
                if (h2 == null) {
                    if (obj3 != null || !map.containsKey(e2)) {
                        return false;
                    }
                } else if (!f.h(h2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException e3) {
            return false;
        }
    }

    public Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            throw new IllegalArgumentException(a.a.dA(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.f49a;
            int length = iArr.length;
            int i5 = 8;
            if (length <= 8 || i2 >= length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    an.cb(iArr, iArr, i, i6, i2);
                    Object[] objArr2 = this.b;
                    an.cd(objArr2, objArr2, i3, i6 + i6, i2 + i2);
                }
                Object[] objArr3 = this.b;
                int i7 = i4 + i4;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                copyOf.getClass();
                this.f49a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
                copyOf2.getClass();
                this.b = copyOf2;
                if (i2 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    an.cb(iArr, this.f49a, 0, 0, i);
                    an.cd(objArr, this.b, 0, 0, i3);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    an.cb(iArr, this.f49a, i, i8, i2);
                    an.cd(objArr, this.b, i3, i8 + i8, i2 + i2);
                }
            }
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
            this.d = i4;
        }
        return obj;
    }

    public Object g(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.a.dA(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i + i + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[d + d + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.b[d + d + 1] : obj2;
    }

    public final Object h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IllegalArgumentException(a.a.dA(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i + i + 1];
    }

    public int hashCode() {
        int[] iArr = this.f49a;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final void i(int i) {
        int i2 = this.d;
        int[] iArr = this.f49a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            copyOf.getClass();
            this.f49a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i + i);
            copyOf2.getClass();
            this.b = copyOf2;
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public void j(bk bkVar) {
        int i = bkVar.d;
        i(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(bkVar.e(i2), bkVar.h(i2));
            }
        } else if (i > 0) {
            an.cb(bkVar.f49a, this.f49a, 0, 0, i);
            an.cd(bkVar.b, this.b, 0, 0, i + i);
            this.d = i;
        }
    }

    public Object put(Object obj, Object obj2) {
        int i = this.d;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int a2 = obj != null ? a(obj, hashCode) : b();
        if (a2 >= 0) {
            int i2 = a2 + a2 + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = a2 ^ (-1);
        int[] iArr = this.f49a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            copyOf.getClass();
            this.f49a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 + i4);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f49a;
            int i5 = i3 + 1;
            an.cb(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            int i6 = this.d;
            an.cd(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.d;
        if (i == i7) {
            int[] iArr3 = this.f49a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return f(d);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !f.h(obj2, h(d))) {
            return false;
        }
        f(d);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return g(d, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !f.h(obj2, h(d))) {
            return false;
        }
        g(d, obj3);
        return true;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
