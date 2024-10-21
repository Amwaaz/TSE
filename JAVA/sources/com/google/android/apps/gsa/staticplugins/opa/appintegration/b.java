package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import com.google.android.apps.gsa.assistant.shared.a;
import com.google.common.f.h;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/appintegration/b.class */
final class b implements a {
    public final void a() {
        h f = f.f1760a.f();
        f.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
        h hVar = f;
        hVar.ak(16426);
        hVar.p("connectionCallback is not set when try to notify onServiceConnected.");
    }

    public final void b() {
        h f = f.f1760a.f();
        f.aj(com.google.common.f.a.e.a, "AppIntegCallbackCntlr");
        h hVar = f;
        hVar.ak(16427);
        hVar.p("connectionCallback is not set when try to notify onServiceDisconnected.");
    }
}
