package androidx.room.c;

import androidx.u.a.a.n;

/* loaded from: classes-dex2jar.jar:androidx/room/c/g.class */
public final class g implements androidx.u.a.i {

    /* renamed from: a, reason: collision with root package name */
    final h f115a;

    public g(h hVar) {
        this.f115a = hVar;
    }

    @Override // androidx.u.a.i
    public final String g() {
        return this.f115a.g;
    }

    @Override // androidx.u.a.i
    public final void h(androidx.u.a.h hVar) {
        int length = this.f115a.f116a.length;
        for (int i = 1; i < length; i++) {
            h hVar2 = this.f115a;
            int i2 = hVar2.f116a[i];
            if (i2 == 1) {
                ((n) hVar).f153a.bindLong(i, hVar2.b[i]);
            } else if (i2 == 2) {
                ((n) hVar).f153a.bindDouble(i, hVar2.c[i]);
            } else if (i2 == 3) {
                String str = hVar2.d[i];
                str.getClass();
                hVar.e(i, str);
            } else if (i2 == 4) {
                byte[] bArr = hVar2.e[i];
                bArr.getClass();
                hVar.a(i, bArr);
            } else if (i2 == 5) {
                ((n) hVar).f153a.bindNull(i);
            }
        }
    }
}
