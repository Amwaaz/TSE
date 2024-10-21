package com.google.android.apps.gsa.nga.engine.education.a;

import com.google.common.b.ha;
import com.google.common.b.nr;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/w.class */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f560a;
    public final String b;
    public final v c;
    public final v d;
    public final Locale e;
    public final ha f;
    public final Optional g;
    public final ha h;
    public final s i;
    private final Optional j;
    private final String k;

    public w() {
        throw null;
    }

    public w(Optional optional, String str, v vVar, v vVar2, Locale locale, ha haVar, Optional optional2, ha haVar2, Optional optional3, String str2, s sVar) {
        this.f560a = optional;
        this.b = str;
        this.c = vVar;
        this.d = vVar2;
        this.e = locale;
        this.f = haVar;
        this.g = optional2;
        this.h = haVar2;
        this.j = optional3;
        this.k = str2;
        this.i = sVar;
    }

    public static q a() {
        q qVar = new q(null);
        qVar.e(nr.a);
        qVar.c = new a(2132093166);
        qVar.i = s.a().a();
        return qVar;
    }

    public final Optional b(Locale locale) {
        return this.j.map(new k(locale, 3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f560a.equals(wVar.f560a) || !this.b.equals(wVar.b) || !this.c.equals(wVar.c) || !this.d.equals(wVar.d) || !this.e.equals(wVar.e) || !this.f.equals(wVar.f) || !this.g.equals(wVar.g) || !this.h.equals(wVar.h) || !this.j.equals(wVar.j)) {
            return false;
        }
        String str = this.k;
        if (str == null) {
            if (wVar.k != null) {
                return false;
            }
        } else if (!str.equals(wVar.k)) {
            return false;
        }
        return this.i.equals(wVar.i);
    }

    public final int hashCode() {
        int hashCode = this.f560a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        int hashCode6 = this.f.hashCode();
        int hashCode7 = this.g.hashCode();
        int hashCode8 = this.h.hashCode();
        int hashCode9 = this.j.hashCode();
        String str = this.k;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        s sVar = this.i;
        Optional optional = this.j;
        ha haVar = this.h;
        Optional optional2 = this.g;
        ha haVar2 = this.f;
        Locale locale = this.e;
        v vVar = this.d;
        v vVar2 = this.c;
        return "Suggestion{priorityContext=" + String.valueOf(this.f560a) + ", id=" + this.b + ", hint=" + String.valueOf(vVar2) + ", query=" + String.valueOf(vVar) + ", locale=" + String.valueOf(locale) + ", displayedIn=" + String.valueOf(haVar2) + ", requiredPackage=" + String.valueOf(optional2) + ", showsInPackages=" + String.valueOf(haVar) + ", suggestionLogInfo=" + String.valueOf(optional) + ", iconUrl=" + this.k + ", disclosureInfo=" + String.valueOf(sVar) + "}";
    }
}
