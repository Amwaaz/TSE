package com.google.android.apps.gsa.shared.util.debug;

import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.debug.a.b;
import com.google.android.apps.gsa.shared.util.debug.a.f;
import com.google.common.b.oo;
import com.google.common.f.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/debug/j.class */
public class j implements b {
    private static final com.google.common.f.j c = com.google.common.f.j.i("com.google.android.apps.gsa.shared.util.debug.j");

    /* renamed from: a, reason: collision with root package name */
    public final Object f1556a = new Object();
    public List b;
    private List d;
    private i e;

    public final void a(String str) {
        synchronized (this.f1556a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.e;
            i iVar2 = new i(str, elapsedRealtime, iVar);
            if (iVar == null) {
                if (this.d == null) {
                    this.d = oo.M(1);
                }
                this.d.add(iVar2);
            } else {
                if (iVar.c == null) {
                    iVar.c = new ArrayList(1);
                }
                iVar.c.add(iVar2);
            }
            this.e = iVar2;
        }
    }

    public final void b(f fVar, long j) {
        synchronized (this.f1556a) {
            fVar.r(new com.google.android.apps.gsa.shared.util.b.d("[Trace]", false));
            List list = this.d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a(fVar, j);
                }
            }
            List list2 = this.b;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((j) it2.next()).b(fVar.d((Object) null), j);
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f1556a) {
            i iVar = this.e;
            if (iVar == null) {
                h e = c.e();
                e.ak(9365);
                e.p("All sections have already ended!");
            } else {
                iVar.b = SystemClock.elapsedRealtime();
                this.e = this.e.f1555a;
            }
        }
    }

    @Override // com.google.android.apps.gsa.shared.util.debug.a.b
    public final void hq(f fVar) {
        b(fVar, SystemClock.elapsedRealtime());
    }
}
