package com.google.android.apps.gsa.nga.engine.ui.f.a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.a.b;
import com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.d;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/f/a/a.class */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f802a = j.i("com.google.android.apps.gsa.nga.engine.ui.f.a.a");
    private final b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public final void a(d dVar) {
        h d = f802a.d();
        d.ak(4896);
        d.s("requestAssistUiClient %s", dVar);
        com.google.android.apps.gsa.nga.shared.a.a aVar = new com.google.android.apps.gsa.nga.shared.a.a();
        Intent intent = aVar.a;
        Bundle bundle = new Bundle();
        bundle.putString("key_type", dVar.a.name());
        intent.putExtra("nga_assist_ui_client", bundle);
        this.b.a(aVar.a());
    }
}
