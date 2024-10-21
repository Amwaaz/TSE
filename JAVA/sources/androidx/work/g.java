package androidx.work;

import androidx.work.impl.utils.f;
import java.util.Set;
import m.a.aa;

/* loaded from: classes-dex2jar.jar:androidx/work/g.class */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f168a = new g(0, 15);
    public final f b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public /* synthetic */ g(int i, int i2) {
        i = 1 == (i2 & 1) ? 1 : i;
        if (i == 0) {
            throw null;
        }
        aa aaVar = aa.a;
        this.b = new f(null);
        this.j = i;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = aaVar;
    }

    public g(g gVar) {
        gVar.getClass();
        this.c = gVar.c;
        this.d = gVar.d;
        this.b = gVar.b;
        this.j = gVar.j;
        this.e = gVar.e;
        this.f = gVar.f;
        this.i = gVar.i;
        this.g = gVar.g;
        this.h = gVar.h;
    }

    public g(f fVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        fVar.getClass();
        if (i == 0) {
            throw null;
        }
        set.getClass();
        this.b = fVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }

    public final boolean a() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h.a.a.p.b.a.f.h(getClass(), obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.c != gVar.c || this.d != gVar.d || this.e != gVar.e || this.f != gVar.f || this.g != gVar.g || this.h != gVar.h) {
            return false;
        }
        if (h.a.a.p.b.a.f.h(this.b.b, gVar.b.b) && this.j == gVar.j) {
            return h.a.a.p.b.a.f.h(this.i, gVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        long j = this.h;
        Set set = this.i;
        long j2 = this.g;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int i3 = (int) (j ^ (j >>> 32));
        int hashCode = set.hashCode();
        Object obj = this.b.b;
        return (((((((((((((((i * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i2) * 31) + i3) * 31) + hashCode) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) bf.d(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}
