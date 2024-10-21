package com.google.android.apps.gsa.nga.engine.ui.e.b;

import com.google.android.apps.gsa.shared.ab.g;
import com.google.android.apps.gsa.shared.ab.i;
import com.google.android.apps.gsa.shared.ab.k;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/b/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f691a = new a(false, false, false, i.f1365a, g.f1364a);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final i e;
    public final g f;

    public a() {
        throw null;
    }

    public a(boolean z, boolean z2, boolean z3, i iVar, g gVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        if (iVar == null) {
            throw new NullPointerException("Null opaVisualState");
        }
        this.e = iVar;
        if (gVar == null) {
            throw new NullPointerException("Null opaResponseVisualState");
        }
        this.f = gVar;
    }

    public final a a() {
        return new a(this.b, false, true, this.e, this.f);
    }

    public final a b(boolean z) {
        return (this.d && z) ? a() : new a(this.b, z, false, this.e, this.f);
    }

    public final a c(g gVar) {
        return new a(this.b, this.c, this.d, this.e, gVar);
    }

    public final boolean d() {
        if (!f(k.c)) {
            return false;
        }
        int cU = a.a.cU(this.f.d);
        int i = cU;
        if (cU == 0) {
            i = 1;
        }
        return i == 4 || i == 3 || i == 5;
    }

    public final boolean e() {
        return this.b || this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e) && this.f.equals(aVar.f);
    }

    public final boolean f(k kVar) {
        if (!e()) {
            return false;
        }
        k a2 = k.a(this.e.c);
        k kVar2 = a2;
        if (a2 == null) {
            kVar2 = k.a;
        }
        return kVar2.equals(kVar);
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = true != this.b ? 1237 : 1231;
        int i3 = true != this.c ? 1237 : 1231;
        if (true == this.d) {
            i = 1231;
        }
        return ((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        g gVar = this.f;
        return "CardVisibility{isOpaVisible=" + this.b + ", isNgaVisible=" + this.c + ", closeSystemDialogRequested=" + this.d + ", opaVisualState=" + this.e.toString() + ", opaResponseVisualState=" + gVar.toString() + "}";
    }
}
