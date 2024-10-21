package com.google.android.apps.gsa.nga.engine.d.a;

import com.google.common.b.fl;
import com.google.common.b.ni;
import com.google.common.b.oo;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/d/a/bj.class */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    public final bi f539a;
    public final fl b;

    public bj() {
        throw null;
    }

    public bj(bi biVar, fl flVar) {
        this.f539a = biVar;
        this.b = flVar;
    }

    public static bh a() {
        bh bhVar = new bh();
        bhVar.b(bi.UNKNOWN);
        int i = fl.e;
        bhVar.c(ni.a);
        return bhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.f539a.equals(bjVar.f539a) && oo.R(this.b, bjVar.b);
    }

    public final int hashCode() {
        return ((this.f539a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        fl flVar = this.b;
        return "DisambiguationState{communicationsState=" + String.valueOf(this.f539a) + ", disambiguationList=" + String.valueOf(flVar) + "}";
    }
}
