package com.google.android.apps.gsa.nga.engine.recognition.c;

import com.google.android.apps.gsa.nga.engine.b.g.v;
import com.google.android.apps.gsa.nga.engine.recognition.u;
import com.google.android.apps.gsa.nga.shared.ad.a.d;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/c/n.class */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final d f647a;
    public final com.google.android.apps.gsa.nga.engine.ar.b.d b;
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    public n(d dVar, com.google.android.apps.gsa.nga.engine.ar.b.d dVar2) {
        this.f647a = dVar;
        this.b = dVar2;
    }

    public final Optional a(v vVar) {
        Optional map;
        synchronized (this) {
            map = this.c.filter(new l(this, vVar)).map(new m(0));
        }
        return map;
    }

    public final void b() {
        synchronized (this) {
            this.c = Optional.empty();
            this.d = Optional.empty();
        }
    }

    public final void c(u uVar) {
        synchronized (this) {
            if (!uVar.d()) {
                this.c = Optional.of(uVar);
            } else {
                this.c = Optional.empty();
                this.d = Optional.of(uVar.j.a);
            }
        }
    }

    public final boolean d(u uVar) {
        boolean equals;
        synchronized (this) {
            equals = Optional.of(uVar.j.a).equals(this.d);
        }
        return equals;
    }

    public final boolean e(v vVar) {
        boolean isPresent;
        synchronized (this) {
            isPresent = this.c.filter(new k(vVar)).isPresent();
        }
        return isPresent;
    }
}
