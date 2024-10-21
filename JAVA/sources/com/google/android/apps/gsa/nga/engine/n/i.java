package com.google.android.apps.gsa.nga.engine.n;

import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/n/i.class */
public final class i implements m {

    /* renamed from: a */
    public final Optional f631a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    private final Optional f;
    private final long g;

    public i() {
        throw null;
    }

    public i(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, long j) {
        this.f631a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = j;
    }

    @Override // com.google.android.apps.gsa.nga.engine.n.m
    public final long a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f631a.equals(iVar.f631a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && this.e.equals(iVar.e) && this.f.equals(iVar.f) && this.g == iVar.g;
    }

    public final int hashCode() {
        int hashCode = this.f631a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        int hashCode6 = this.f.hashCode();
        long j = this.g;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "AssistData{assistContent=" + String.valueOf(this.f631a) + ", assistStructure=" + String.valueOf(optional5) + ", assistStructureSupplier=" + String.valueOf(optional4) + ", assistData=" + String.valueOf(optional3) + ", directActionsSession=" + String.valueOf(optional2) + ", augmentedDirectActionsSession=" + String.valueOf(optional) + ", timestamp=" + this.g + "}";
    }
}
