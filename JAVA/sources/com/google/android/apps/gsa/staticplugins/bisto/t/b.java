package com.google.android.apps.gsa.staticplugins.bisto.t;

import com.google.android.apps.gsa.search.core.ac.af;
import com.google.android.apps.gsa.shared.util.q.a;
import com.google.common.f.h;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;
import java.util.concurrent.ExecutorService;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/bisto/t/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1630a = j.i("com.google.android.apps.gsa.staticplugins.bisto.t.b");
    public final com.google.android.apps.gsa.search.shared.service.e.e b;
    public final af c;
    private final ExecutorService d;
    private final a e;

    public b(com.google.android.apps.gsa.search.shared.service.e.e eVar, af afVar, ExecutorService executorService, a aVar) {
        h d = f1630a.d();
        d.aj(com.google.common.f.a.e.a, "BistoSettingsListener");
        h hVar = d;
        hVar.ak(12930);
        hVar.p("listener created");
        this.b = eVar;
        this.c = afVar;
        this.d = executorService;
        this.e = aVar;
    }

    public final cn a(String str, String str2) {
        return dl.q(new a(this, str, str2), this.d);
    }

    public final void b(String str, String str2) {
        h d = f1630a.d();
        d.aj(com.google.common.f.a.e.a, "BistoSettingsListener");
        h hVar = d;
        hVar.ak(12932);
        String concat = "assistant_settings_preferred_voice:".concat(str);
        hVar.H("onVoiceSettingsChanged: key is %s, voice is %s", concat, str2);
        if (str2 == null || str2.equals(this.e.g(concat, ""))) {
            return;
        }
        dl.y(a(concat, str2), new d(1), this.d);
    }
}
