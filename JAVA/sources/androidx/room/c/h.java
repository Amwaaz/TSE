package androidx.room.c;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/room/c/h.class */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f116a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    public h(androidx.u.a.b bVar, String str) {
        super(bVar, str);
        this.f116a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0];
    }

    private final Cursor r() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        androidx.u.a.a(21, "no row");
        throw new m.d();
    }

    private final void s(int i, int i2) {
        int[] iArr = this.f116a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            copyOf.getClass();
            this.f116a = copyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] copyOf2 = Arrays.copyOf(jArr, i3);
                copyOf2.getClass();
                this.b = copyOf2;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] copyOf3 = Arrays.copyOf(dArr, i3);
                copyOf3.getClass();
                this.c = copyOf3;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i3);
                copyOf4.getClass();
                this.d = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i3);
            copyOf5.getClass();
            this.e = (byte[][]) copyOf5;
        }
    }

    private final void t() {
        if (this.i == null) {
            this.i = this.f.c(new g(this));
        }
    }

    private static final void u(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            androidx.u.a.a(25, "column index out of range");
            throw new m.d();
        }
    }

    @Override // androidx.u.b
    public final double a(int i) {
        q();
        Cursor r = r();
        u(r, i);
        return r.getDouble(i);
    }

    @Override // androidx.u.b
    public final int b() {
        q();
        t();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // androidx.u.b
    public final long c(int i) {
        q();
        Cursor r = r();
        u(r, i);
        return r.getLong(i);
    }

    @Override // androidx.u.b
    public final String d(int i) {
        q();
        t();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        u(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // androidx.u.b
    public final String e(int i) {
        q();
        Cursor r = r();
        u(r, i);
        String string = r.getString(i);
        string.getClass();
        return string;
    }

    @Override // androidx.u.b
    public final void f(int i, byte[] bArr) {
        q();
        s(4, i);
        this.f116a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // androidx.u.b
    public final void g(int i, double d) {
        q();
        s(2, i);
        this.f116a[i] = 2;
        this.c[i] = d;
    }

    @Override // androidx.u.b
    public final void h(int i, long j) {
        q();
        s(1, i);
        this.f116a[i] = 1;
        this.b[i] = j;
    }

    @Override // androidx.u.b
    public final void i(int i) {
        q();
        s(5, i);
        this.f116a[i] = 5;
    }

    @Override // androidx.u.b
    public final void j(int i, String str) {
        str.getClass();
        q();
        s(3, i);
        this.f116a[i] = 3;
        this.d[i] = str;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], byte[][]] */
    @Override // androidx.u.b
    public final void k() {
        if (!this.h) {
            q();
            this.f116a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0];
            l();
        }
        this.h = true;
    }

    @Override // androidx.u.b
    public final void l() {
        q();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // androidx.u.b
    public final boolean m(int i) {
        q();
        Cursor r = r();
        u(r, i);
        return r.isNull(i);
    }

    @Override // androidx.u.b
    public final boolean n() {
        q();
        t();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.u.b
    public final byte[] o(int i) {
        q();
        Cursor r = r();
        u(r, i);
        byte[] blob = r.getBlob(i);
        blob.getClass();
        return blob;
    }
}
