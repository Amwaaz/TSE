package com.google.android.apps.gsa.nga.engine.g;

import com.google.common.b.fl;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/b.class */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Optional f617a;
    public com.google.android.apps.gsa.nga.engine.at.e.b b;
    private boolean c;
    private boolean d;
    private Locale e;
    private fl f;
    private byte g;

    public b() {
        throw null;
    }

    public b(byte[] bArr) {
        this.f617a = Optional.empty();
    }

    public final c a() {
        Locale locale;
        com.google.android.apps.gsa.nga.engine.at.e.b bVar;
        fl flVar;
        if (this.g == 3 && (locale = this.e) != null && (bVar = this.b) != null && (flVar = this.f) != null) {
            return new c(this.c, false, this.f617a, locale, bVar, flVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" ngaEnabled");
        }
        if ((this.g & 2) == 0) {
            sb.append(" ngaOnDeviceEnabled");
        }
        if (this.e == null) {
            sb.append(" primaryAssistantLocale");
        }
        if (this.b == null) {
            sb.append(" tngFlags");
        }
        if (this.f == null) {
            sb.append(" assistantLocales");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(fl flVar) {
        if (flVar == null) {
            throw new NullPointerException("Null assistantLocales");
        }
        this.f = flVar;
    }

    public final void c(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 1);
    }

    public final void d(boolean z) {
        this.d = false;
        this.g = (byte) (this.g | 2);
    }

    public final void e(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Null primaryAssistantLocale");
        }
        this.e = locale;
    }
}
