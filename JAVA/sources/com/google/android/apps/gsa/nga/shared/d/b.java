package com.google.android.apps.gsa.nga.shared.d;

import android.os.Build;
import com.google.android.apps.gsa.nga.api.a.ah;
import com.google.android.apps.gsa.nga.api.a.ar;
import com.google.android.apps.gsa.nga.api.a.aw;
import com.google.android.apps.gsa.nga.api.a.ay;
import com.google.android.apps.gsa.nga.shared.d.d.d;
import com.google.android.apps.gsa.nga.shared.q.a.x;
import com.google.android.apps.gsa.nga.shared.q.c.bs;
import com.google.android.apps.gsa.nga.shared.q.c.bt;
import com.google.android.apps.gsa.nga.shared.q.c.fg;
import com.google.android.apps.gsa.nga.shared.q.c.fj;
import com.google.android.apps.gsa.nga.shared.q.c.g;
import com.google.android.apps.gsa.nga.shared.q.c.u;
import com.google.android.apps.gsa.search.core.ac.t;
import com.google.common.f.a.e;
import com.google.common.f.ab;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/d/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.libraries.g.a f855a;
    public final x b;
    private final t c;

    public b(x xVar, t tVar, com.google.android.libraries.g.a aVar) {
        this.b = xVar;
        this.c = tVar;
        this.f855a = aVar;
    }

    public final bs a() {
        bs d = bt.d();
        d.b = "BISTO";
        d.c();
        d.c = "N/A";
        d.e = "DSP";
        boolean isDeviceLocked = this.c.b.isDeviceLocked();
        ab abVar = e.a;
        String valueOf = String.valueOf(isDeviceLocked);
        if (valueOf == null) {
            throw new NullPointerException("Null screenLocked");
        }
        d.f = valueOf;
        d.g = d.c(Build.MODEL);
        return d;
    }

    public final void b() {
        fg d = com.google.android.apps.gsa.nga.shared.q.c.e.d();
        d.b = "PARSING_FAILED";
        this.b.b(d.g());
    }

    public final void c(ah ahVar) {
        String str;
        int i = ahVar.b;
        int ar = a.a.ar(i);
        if (ar == 0) {
            throw null;
        }
        int i2 = ar - 1;
        if (i2 != 0) {
            int i3 = 1;
            if (i2 != 1) {
                str = "UNKNOWN";
            } else {
                if (i == 2) {
                    int aq = a.a.aq(((Integer) ahVar.c).intValue());
                    if (aq != 0) {
                        i3 = aq;
                    }
                } else {
                    i3 = 2;
                }
                str = ar.d(i3);
            }
        } else {
            str = "ACCEPTED";
        }
        this.b.b(new fj(str));
    }

    public final void d(ay ayVar) {
        String str;
        int i = ayVar.b;
        int ar = a.a.ar(i);
        if (ar == 0) {
            throw null;
        }
        int i2 = ar - 1;
        if (i2 == 0) {
            str = "SUCCESS";
        } else if (i2 != 1) {
            str = "UNKNOWN";
        } else {
            int dn = a.a.dn((i == 2 ? (aw) ayVar.c : aw.a).b);
            if (dn == 0) {
                throw null;
            }
            str = ar.a(dn);
        }
        this.b.b(new g(str));
    }

    public final void e(int i) {
        this.b.b(new u(ar.i(i)));
    }
}
