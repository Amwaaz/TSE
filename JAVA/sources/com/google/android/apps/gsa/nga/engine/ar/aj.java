package com.google.android.apps.gsa.nga.engine.ar;

import com.google.android.apps.gsa.nga.shared.q.d.bu;
import com.google.android.apps.gsa.nga.shared.q.d.l;
import com.google.android.apps.gsa.shared.logger.b.w;
import j$.util.Objects;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ar/aj.class */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public final ah f473a;
    public final Optional b;
    public final bu c;
    public final Optional d;
    public final Optional e;
    public final l f;
    public final com.google.android.apps.gsa.nga.engine.ak.y.b g;

    public aj() {
        throw null;
    }

    public aj(ah ahVar, Optional optional, bu buVar, Optional optional2, Optional optional3, l lVar, com.google.android.apps.gsa.nga.engine.ak.y.b bVar) {
        this.f473a = ahVar;
        this.b = optional;
        this.c = buVar;
        this.d = optional2;
        this.e = optional3;
        this.f = lVar;
        this.g = bVar;
    }

    public static ai a(w wVar, l lVar) {
        ai b = b();
        b.d(ah.IDLE);
        b.b = Optional.of(wVar);
        b.b(lVar);
        return b;
    }

    public static ai b() {
        ai aiVar = new ai((byte[]) null);
        aiVar.c(bu.f984a);
        aiVar.c = Optional.empty();
        aiVar.f472a = Optional.empty();
        aiVar.b = Optional.empty();
        com.google.android.apps.gsa.nga.engine.ak.y.b bVar = com.google.android.apps.gsa.nga.engine.ak.y.b.f449a;
        if (bVar == null) {
            throw new NullPointerException("Null tags");
        }
        aiVar.d = bVar;
        return aiVar;
    }

    public final com.google.android.apps.gsa.nga.shared.ad.a.b c() {
        return (com.google.android.apps.gsa.nga.shared.ad.a.b) Optional.ofNullable((com.google.android.apps.gsa.nga.shared.ad.a.b) this.g.b.b(i.a)).orElse(com.google.android.apps.gsa.nga.shared.ad.a.b.a);
    }

    public final Optional d() {
        bu buVar = this.c;
        return (buVar.b & 2) != 0 ? Optional.of(buVar.d) : Optional.empty();
    }

    public final Optional e() {
        Optional empty;
        bu buVar = this.c;
        if ((buVar.b & 1) != 0) {
            com.google.android.apps.gsa.assistant.shared.k.c a2 = com.google.android.apps.gsa.assistant.shared.k.c.a(buVar.c);
            com.google.android.apps.gsa.assistant.shared.k.c cVar = a2;
            if (a2 == null) {
                cVar = com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN;
            }
            empty = Optional.of(cVar);
        } else {
            empty = Optional.empty();
        }
        return empty;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.f473a.equals(ajVar.f473a) && this.b.equals(ajVar.b) && this.c.equals(ajVar.c) && this.d.equals(ajVar.d) && this.e.equals(ajVar.e) && this.f.equals(ajVar.f) && this.g.equals(ajVar.g);
    }

    public final boolean f() {
        if (i()) {
            return Objects.equals((com.google.android.apps.gsa.assistant.shared.k.c) e().orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN), com.google.android.apps.gsa.assistant.shared.k.c.FOLLOW_ON);
        }
        return false;
    }

    public final boolean g() {
        return this.f473a.equals(ah.EXECUTING);
    }

    public final boolean h() {
        return this.f473a.equals(ah.FULL_LISTENING);
    }

    public final int hashCode() {
        return ((((((((((((this.f473a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.b.hashCode();
    }

    public final boolean i() {
        return this.f473a.equals(ah.HALF_LISTENING);
    }

    public final boolean j() {
        return ((Boolean) e().map(new p(2)).orElse(false)).booleanValue();
    }

    public final boolean k() {
        return this.f473a.equals(ah.IDLE);
    }

    public final boolean l() {
        if (i()) {
            return Objects.equals((com.google.android.apps.gsa.assistant.shared.k.c) e().orElse(com.google.android.apps.gsa.assistant.shared.k.c.UNKNOWN), com.google.android.apps.gsa.assistant.shared.k.c.NGA_RAISE_AND_TALK);
        }
        return false;
    }

    public final boolean m() {
        return ((Boolean) this.g.b.c(ak.b, false)).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) this.g.b.c(ak.a, false)).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) this.g.b.c(ak.d, false)).booleanValue();
    }

    public final boolean p() {
        return n() || q();
    }

    public final boolean q() {
        return ((Boolean) this.g.b.c(ak.c, false)).booleanValue();
    }

    public final String toString() {
        com.google.android.apps.gsa.nga.engine.ak.y.b bVar = this.g;
        l lVar = this.f;
        Optional optional = this.e;
        Optional optional2 = this.d;
        bu buVar = this.c;
        Optional optional3 = this.b;
        return "StateDescription{state=" + String.valueOf(this.f473a) + ", utteranceIdentifier=" + String.valueOf(optional3) + ", opaInvocation=" + String.valueOf(buVar) + ", flowEvent=" + String.valueOf(optional2) + ", speechSessionParams=" + String.valueOf(optional) + ", attentionTriggerType=" + String.valueOf(lVar) + ", tags=" + String.valueOf(bVar) + "}";
    }
}
