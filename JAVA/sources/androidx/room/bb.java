package androidx.room;

import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes-dex2jar.jar:androidx/room/bb.class */
public final class bb implements androidx.u.a.i, androidx.u.a.h {

    /* renamed from: a, reason: collision with root package name */
    public static final TreeMap f94a = new TreeMap();
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;
    private final int i;

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    public bb(int i) {
        this.i = i;
        int i2 = i + 1;
        this.g = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.e = new String[i2];
        this.f = new byte[i2];
    }

    @Override // androidx.u.a.h
    public final void a(int i, byte[] bArr) {
        this.g[i] = 5;
        this.f[i] = bArr;
    }

    @Override // androidx.u.a.h
    public final void b(int i, double d) {
        this.g[i] = 3;
        this.d[i] = d;
    }

    @Override // androidx.u.a.h
    public final void c(int i, long j) {
        this.g[i] = 2;
        this.c[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.u.a.h
    public final void d(int i) {
        this.g[i] = 1;
    }

    @Override // androidx.u.a.h
    public final void e(int i, String str) {
        str.getClass();
        this.g[i] = 4;
        this.e[i] = str;
    }

    public final az f() {
        return new az(g(), new an(this, 3));
    }

    @Override // androidx.u.a.i
    public final String g() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.u.a.i
    public final void h(androidx.u.a.h hVar) {
        int i = this.h;
        if (i <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.g[i2];
            if (i3 == 1) {
                ((androidx.u.a.a.n) hVar).f153a.bindNull(i2);
            } else if (i3 == 2) {
                ((androidx.u.a.a.n) hVar).f153a.bindLong(i2, this.c[i2]);
            } else if (i3 == 3) {
                ((androidx.u.a.a.n) hVar).f153a.bindDouble(i2, this.d[i2]);
            } else if (i3 == 4) {
                String str = this.e[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hVar.e(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hVar.a(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void i() {
        TreeMap treeMap = f94a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.i), this);
            if (treeMap.size() > 15) {
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                for (int size = treeMap.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }
}
