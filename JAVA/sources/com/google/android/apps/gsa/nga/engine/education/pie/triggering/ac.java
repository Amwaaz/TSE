package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.common.b.gl;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/education/pie/triggering/ac.class */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public Optional f592a;
    public gl b;

    public ac() {
        throw null;
    }

    public ac(ad adVar) {
        this.f592a = Optional.empty();
        this.f592a = adVar.f593a;
        this.b = adVar.b;
    }

    public ac(byte[] bArr) {
        this.f592a = Optional.empty();
    }

    public final ad a() {
        gl glVar = this.b;
        if (glVar != null) {
            return new ad(this.f592a, glVar);
        }
        throw new IllegalStateException("Missing required properties: trackedConditions");
    }
}
