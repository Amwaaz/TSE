package com.google.android.apps.gsa.search.core.service.e;

import com.google.common.b.ha;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/e/d.class */
final class d {

    /* renamed from: a */
    public final String f1189a;
    public final String b;
    public final h c;
    public final ha d;

    public d() {
        throw null;
    }

    public d(String str, String str2, h hVar, ha haVar) {
        this.f1189a = str;
        this.b = str2;
        if (hVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = hVar;
        if (haVar == null) {
            throw new NullPointerException("Null targetUserScenarios");
        }
        this.d = haVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1189a.equals(dVar.f1189a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return ((((((this.f1189a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ha haVar = this.d;
        return "WorkProxyData{workerId=" + this.f1189a + ", workProxyName=" + this.b + ", type=" + this.c.toString() + ", targetUserScenarios=" + haVar.toString() + "}";
    }
}
