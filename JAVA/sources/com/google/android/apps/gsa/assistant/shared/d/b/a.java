package com.google.android.apps.gsa.assistant.shared.d.b;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.shared.d.k;
import com.google.android.libraries.storage.a.a.e;
import com.google.android.libraries.storage.protostore.ab;
import com.google.android.libraries.storage.protostore.ac;
import com.google.android.libraries.storage.protostore.af;
import com.google.android.libraries.storage.protostore.aq;
import com.google.android.libraries.storage.protostore.cg;
import e.c.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/d/b/a.class */
public final class a implements d {
    public static cg b(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("chalkboard");
        dVar.c = "chalkboard";
        dVar.c("ChalkboardPrefetchData.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(k.f265a);
        a3.b = aq.f5565a;
        return afVar.a(a3.a());
    }

    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
