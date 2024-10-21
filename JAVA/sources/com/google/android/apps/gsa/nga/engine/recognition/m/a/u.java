package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.nga.engine.m.f.a.g;
import com.google.android.apps.gsa.nga.shared.u.aa;
import com.google.android.libraries.assistant.soda.data.a;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.ci;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.i;
import com.google.protobuf.ba;
import com.google.speech.i.dn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/u.class */
public final class u implements a {

    /* renamed from: a, reason: collision with root package name */
    private final g f666a;

    public u(g gVar) {
        this.f666a = gVar;
    }

    @Override // com.google.android.libraries.assistant.soda.data.a
    public final cn a(dn dnVar) {
        ba createBuilder = aa.a.createBuilder();
        createBuilder.copyOnWrite();
        aa aaVar = createBuilder.instance;
        dnVar.getClass();
        aaVar.c = dnVar;
        aaVar.b = 27;
        return i.g(this.f666a.c(createBuilder.build(), Optional.empty()), new t(), ay.a);
    }

    @Override // com.google.android.libraries.assistant.soda.data.a
    public final /* synthetic */ cn b() {
        return ci.a;
    }

    @Override // com.google.android.libraries.assistant.soda.data.a
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // com.google.android.libraries.assistant.soda.data.a
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // com.google.android.libraries.assistant.soda.data.a
    public final /* synthetic */ cn e() {
        return ci.a;
    }
}
