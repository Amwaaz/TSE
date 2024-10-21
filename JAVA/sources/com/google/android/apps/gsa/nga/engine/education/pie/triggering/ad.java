package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.common.b.dh;
import com.google.common.b.gl;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/ad.class */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f593a;
    public final gl b;

    public ad() {
        throw null;
    }

    public ad(Optional optional, gl glVar) {
        this.f593a = optional;
        this.b = glVar;
    }

    public static ac a() {
        ac acVar = new ac((byte[]) null);
        acVar.b = gl.t(dh.a);
        return acVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f593a.equals(adVar.f593a) && this.b.equals(adVar.b);
    }

    public final int hashCode() {
        return ((this.f593a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        gl glVar = this.b;
        return "TimedEventTrackingStatus{appEnteredTimestamp=" + String.valueOf(this.f593a) + ", trackedConditions=" + String.valueOf(glVar) + "}";
    }
}
