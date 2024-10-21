package com.google.android.apps.gsa.nga.engine.recognition.m.a;

import com.google.android.apps.gsa.shared.k.eu;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.b.ha;
import com.google.common.b.nr;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a/f.class */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f663a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.recognition.m.a.f");
    public final a b;
    public ha c = nr.a;

    public f(a aVar) {
        this.b = aVar;
    }

    public final Stream a(String str) {
        return DesugarArrays.stream(str.split(" ")).filter(new c((int) this.b.d(eu.G))).map(new b(3));
    }
}
