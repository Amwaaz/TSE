package com.google.android.apps.gsa.nga.engine.g;

import com.google.common.b.fl;
import com.google.common.b.oo;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/g/c.class */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f619a;
    public final boolean b;
    public final Optional c;
    public final Locale d;
    public final com.google.android.apps.gsa.nga.engine.at.e.b e;
    public final fl f;

    public c() {
        throw null;
    }

    public c(boolean z, boolean z2, Optional optional, Locale locale, com.google.android.apps.gsa.nga.engine.at.e.b bVar, fl flVar) {
        this.f619a = z;
        this.b = false;
        this.c = optional;
        this.d = locale;
        this.e = bVar;
        this.f = flVar;
    }

    public static b a() {
        b bVar = new b(null);
        bVar.b = new com.google.android.apps.gsa.nga.engine.at.e.c();
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f619a != cVar.f619a) {
            return false;
        }
        boolean z = cVar.b;
        return this.c.equals(cVar.c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && oo.R(this.f, cVar.f);
    }

    public final int hashCode() {
        return (((((((((((true != this.f619a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        fl flVar = this.f;
        com.google.android.apps.gsa.nga.engine.at.e.b bVar = this.e;
        Locale locale = this.d;
        return "NgaConfiguration{ngaEnabled=" + this.f619a + ", ngaOnDeviceEnabled=false, primaryAccount=" + String.valueOf(this.c) + ", primaryAssistantLocale=" + String.valueOf(locale) + ", tngFlags=" + String.valueOf(bVar) + ", assistantLocales=" + String.valueOf(flVar) + "}";
    }
}
