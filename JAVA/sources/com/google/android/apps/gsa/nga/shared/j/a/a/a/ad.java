package com.google.android.apps.gsa.nga.shared.j.a.a.a;

import com.google.apps.tiktok.account.AccountId;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/j/a/a/a/ad.class */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final AccountId f891a;
    public final String b;
    public final ay c;
    public final boolean d;
    private final Object e;

    public ad(AccountId accountId, String str, ay ayVar, boolean z, Object obj) {
        accountId.getClass();
        str.getClass();
        ayVar.getClass();
        obj.getClass();
        this.f891a = accountId;
        this.b = str;
        this.c = ayVar;
        this.d = z;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return h.a.a.p.b.a.f.h(this.f891a, adVar.f891a) && h.a.a.p.b.a.f.h(this.b, adVar.b) && h.a.a.p.b.a.f.h(this.c, adVar.c) && this.d == adVar.d && h.a.a.p.b.a.f.h(this.e, adVar.e);
    }

    public final int hashCode() {
        int hashCode = this.f891a.hashCode();
        int hashCode2 = this.b.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + this.c.hashCode()) * 31) + a.a.bN(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "LegacyExternalHotwordConsumerConfiguration(accountId=" + this.f891a + ", locale=" + this.b + ", voiceMatchConfig=" + this.c + ", inEnrollmentStatus=" + this.d + ", hotwordEnrollmentStateChanged=" + this.e + ")";
    }
}
