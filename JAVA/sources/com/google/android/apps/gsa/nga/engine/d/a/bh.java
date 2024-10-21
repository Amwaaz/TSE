package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.common.b.fl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/bh.class */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private bi f537a;
    private fl b;

    public final bj a() {
        fl flVar;
        bi biVar = this.f537a;
        if (biVar != null && (flVar = this.b) != null) {
            return new bj(biVar, flVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f537a == null) {
            sb.append(" communicationsState");
        }
        if (this.b == null) {
            sb.append(" disambiguationList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(bi biVar) {
        if (biVar == null) {
            throw new NullPointerException("Null communicationsState");
        }
        this.f537a = biVar;
    }

    public final void c(fl flVar) {
        if (flVar == null) {
            throw new NullPointerException("Null disambiguationList");
        }
        this.b = flVar;
    }
}
