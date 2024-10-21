package com.google.android.apps.gsa.languagepack.b;

import com.google.android.libraries.mdi.download.m;
import com.google.android.libraries.mdi.download.n;
import com.google.protobuf.ba;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/languagepack/b/d.class */
public final class d {
    public static n a() {
        ba createBuilder = n.f3286a.createBuilder();
        m mVar = m.DOWNLOAD_ON_ANY_NETWORK;
        createBuilder.copyOnWrite();
        n nVar = (n) createBuilder.instance;
        nVar.d = mVar.d;
        nVar.b |= 2;
        createBuilder.copyOnWrite();
        n nVar2 = (n) createBuilder.instance;
        nVar2.c = 1;
        nVar2.b = 1 | nVar2.b;
        return (n) createBuilder.build();
    }
}
