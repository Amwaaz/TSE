package com.google.android.apps.gsa.staticplugins.nga.a.a;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.g.z.w.h;
import com.google.g.z.w.i;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/a/a/bd.class */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public final NgaState f1662a;
    public final Optional b;

    public bd() {
        throw null;
    }

    public bd(NgaState ngaState, Optional optional) {
        if (ngaState == null) {
            throw new NullPointerException("Null state");
        }
        this.f1662a = ngaState;
        this.b = optional;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bd a() {
        NgaState ngaState = NgaState.ENABLED;
        com.google.protobuf.ba createBuilder = com.google.g.z.w.j.a.createBuilder();
        h hVar = h.a;
        createBuilder.copyOnWrite();
        com.google.g.z.w.j jVar = createBuilder.instance;
        hVar.getClass();
        jVar.c = hVar;
        jVar.b = 1;
        return new bd(ngaState, Optional.of(createBuilder.build()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bd b(int i) {
        NgaState ngaState = NgaState.DISABLED;
        com.google.protobuf.ba createBuilder = com.google.g.z.w.j.a.createBuilder();
        com.google.protobuf.ba createBuilder2 = com.google.g.z.w.g.a.createBuilder();
        createBuilder2.copyOnWrite();
        com.google.g.z.w.g gVar = createBuilder2.instance;
        gVar.c = i - 1;
        gVar.b |= 1;
        com.google.g.z.w.g build = createBuilder2.build();
        createBuilder.copyOnWrite();
        com.google.g.z.w.j jVar = createBuilder.instance;
        build.getClass();
        jVar.c = build;
        jVar.b = 2;
        return new bd(ngaState, Optional.of(createBuilder.build()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bd c(int i) {
        NgaState ngaState = NgaState.ENABLED_IN_PAUSED_MODE;
        com.google.protobuf.ba createBuilder = com.google.g.z.w.j.a.createBuilder();
        com.google.protobuf.ba createBuilder2 = i.a.createBuilder();
        createBuilder2.copyOnWrite();
        i iVar = createBuilder2.instance;
        iVar.c = i - 1;
        iVar.b |= 1;
        i build = createBuilder2.build();
        createBuilder.copyOnWrite();
        com.google.g.z.w.j jVar = createBuilder.instance;
        build.getClass();
        jVar.c = build;
        jVar.b = 3;
        return new bd(ngaState, Optional.of(createBuilder.build()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.f1662a.equals(bdVar.f1662a) && this.b.equals(bdVar.b);
    }

    public final int hashCode() {
        return ((this.f1662a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "NgaStateDetails{state=" + this.f1662a.toString() + ", ngaStateInfo=" + optional.toString() + "}";
    }
}
