package com.google.android.apps.gsa.nga.engine.education.a;

import com.google.common.b.ha;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/a/q.class */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Optional f556a;
    public String b;
    public v c;
    public v d;
    public Optional e;
    public ha f;
    public Optional g;
    public String h;
    public s i;
    private Locale j;
    private ha k;

    public q() {
        throw null;
    }

    public q(byte[] bArr) {
        this.f556a = Optional.empty();
        this.e = Optional.empty();
        this.g = Optional.empty();
    }

    public final w a() {
        v vVar;
        v vVar2;
        Locale locale;
        ha haVar;
        ha haVar2;
        s sVar;
        String str = this.b;
        if (str != null && (vVar = this.c) != null && (vVar2 = this.d) != null && (locale = this.j) != null && (haVar = this.k) != null && (haVar2 = this.f) != null && (sVar = this.i) != null) {
            return new w(this.f556a, str, vVar, vVar2, locale, haVar, this.e, haVar2, this.g, this.h, sVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" hint");
        }
        if (this.d == null) {
            sb.append(" query");
        }
        if (this.j == null) {
            sb.append(" locale");
        }
        if (this.k == null) {
            sb.append(" displayedIn");
        }
        if (this.f == null) {
            sb.append(" showsInPackages");
        }
        if (this.i == null) {
            sb.append(" disclosureInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ha haVar) {
        if (haVar == null) {
            throw new NullPointerException("Null displayedIn");
        }
        this.k = haVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str;
    }

    public final void d(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Null locale");
        }
        this.j = locale;
    }

    public final void e(ha haVar) {
        if (haVar == null) {
            throw new NullPointerException("Null showsInPackages");
        }
        this.f = haVar;
    }
}
