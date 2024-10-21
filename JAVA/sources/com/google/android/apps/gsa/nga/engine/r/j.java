package com.google.android.apps.gsa.nga.engine.r;

import com.google.common.b.fl;
import com.google.common.b.oo;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/r/j.class */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f643a = new j(null, null, null, 0, 0);
    public final com.google.android.apps.gsa.nga.engine.understanding.h.a.d b;
    public final fl c;
    public final Locale d;
    public final int e;
    public final int f;

    public j() {
        throw null;
    }

    public j(com.google.android.apps.gsa.nga.engine.understanding.h.a.d dVar, fl flVar, Locale locale, int i, int i2) {
        this.b = dVar;
        this.c = flVar;
        this.d = locale;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        com.google.android.apps.gsa.nga.engine.understanding.h.a.d dVar = this.b;
        if (dVar == null) {
            if (jVar.b != null) {
                return false;
            }
        } else if (!dVar.equals(jVar.b)) {
            return false;
        }
        fl flVar = this.c;
        if (flVar == null) {
            if (jVar.c != null) {
                return false;
            }
        } else if (!oo.R(flVar, jVar.c)) {
            return false;
        }
        Locale locale = this.d;
        if (locale == null) {
            if (jVar.d != null) {
                return false;
            }
        } else if (!locale.equals(jVar.d)) {
            return false;
        }
        return this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        com.google.android.apps.gsa.nga.engine.understanding.h.a.d dVar = this.b;
        int i = 0;
        int hashCode = dVar == null ? 0 : dVar.hashCode();
        fl flVar = this.c;
        int hashCode2 = flVar == null ? 0 : flVar.hashCode();
        Locale locale = this.d;
        if (locale != null) {
            i = locale.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        Locale locale = this.d;
        fl flVar = this.c;
        return "SearchableEmailsImpl{keywordsExtractor=" + String.valueOf(this.b) + ", emailThreads=" + String.valueOf(flVar) + ", locale=" + String.valueOf(locale) + ", storedKeywordsCount=" + this.e + ", originalKeywordsCount=" + this.f + "}";
    }
}
