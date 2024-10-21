package com.google.android.apps.gsa.shared.speech.hotword.a;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.search.ah.n;
import com.google.android.libraries.storage.a.a.e;
import com.google.android.libraries.storage.protostore.ab;
import com.google.android.libraries.storage.protostore.ac;
import com.google.android.libraries.storage.protostore.af;
import com.google.android.libraries.storage.protostore.aq;
import com.google.android.libraries.storage.protostore.cg;
import e.c.d;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/a/a.class */
public final class a implements d {
    public static cg b(Context context, af afVar) {
        com.google.android.libraries.storage.a.a.d dVar = new com.google.android.libraries.storage.a.a.d(context);
        e.b("hotwordmodelconfig");
        dVar.c = "hotwordmodelconfig";
        dVar.c("HotwordModelConfig.pb");
        Uri a2 = dVar.a();
        ab a3 = ac.a();
        a3.e(a2);
        a3.d(n.f3941a);
        a3.b = aq.f5565a;
        return afVar.a(a3.a());
    }

    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
