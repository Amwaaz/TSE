package com.google.android.apps.gsa.nga.shared.f.a;

import androidx.core.d.e$;
import java.util.function.Supplier;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/f/a/n.class */
public final class n {

    /* renamed from: a */
    public final Supplier f865a;
    public final Supplier b;
    public final Supplier c;
    public final Supplier d;

    public n() {
        throw null;
    }

    public n(Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4) {
        this.f865a = supplier;
        this.b = supplier2;
        this.c = supplier3;
        this.d = supplier4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return e$.ExternalSyntheticApiModelOutline0.m(this.f865a, nVar.f865a) && e$.ExternalSyntheticApiModelOutline0.m(this.b, nVar.b) && e$.ExternalSyntheticApiModelOutline0.m(this.c, nVar.c) && e$.ExternalSyntheticApiModelOutline0.m(this.d, nVar.d);
    }

    public final int hashCode() {
        return ((((((e$.ExternalSyntheticApiModelOutline0.m(this.f865a) ^ 1000003) * 1000003) ^ e$.ExternalSyntheticApiModelOutline0.m(this.b)) * 1000003) ^ e$.ExternalSyntheticApiModelOutline0.m(this.c)) * 1000003) ^ e$.ExternalSyntheticApiModelOutline0.m(this.d);
    }

    public final String toString() {
        Supplier supplier = this.d;
        Supplier supplier2 = this.c;
        Supplier supplier3 = this.b;
        return "InitialPreferenceValues{startupPreferences=" + this.f865a.toString() + ", udcBits=" + supplier3.toString() + ", educationPreferences=" + supplier2.toString() + ", gboardPreferences=" + supplier.toString() + "}";
    }
}
