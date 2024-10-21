package com.google.android.apps.gsa.shared.v;

import com.google.android.apps.gsa.shared.util.debug.a.a;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import java.util.Arrays;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/v/n.class */
public final class n implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f1578a = new n(2, false, false, -2, -2);
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public n(int i, boolean z, boolean z2, int i2, int i3) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
    }

    public final boolean a() {
        int i = this.b;
        return i == 1 || i == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == nVar.b && this.c == nVar.c && this.e == nVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.e)});
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.a, com.google.android.apps.gsa.shared.util.debug.a.g
    public final void hq(f fVar) {
        if (equals(f1578a)) {
            fVar.q("ConnectivityInfo[UNKNOWN]");
            return;
        }
        fVar.q("ConnectivityInfo");
        fVar.b("connectivityStatus").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.b), false));
        fVar.b("metered").a(new com.google.android.apps.gsa.shared.util.b.d(Boolean.valueOf(this.c), false));
        fVar.b("type").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.e), false));
        fVar.b("subtype").a(new com.google.android.apps.gsa.shared.util.b.d(Integer.valueOf(this.f), false));
    }

    public final String toString() {
        return "ConnectivityInfo(connectivityStatus=" + this.b + " metered=" + this.c + " type=" + this.e + " subtype=" + this.f + ")";
    }
}
