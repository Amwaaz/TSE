package com.google.android.apps.gsa.shared.speech.hotword;

import android.content.Context;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.an;
import com.google.android.apps.gsa.shared.util.c.a.g;
import com.google.android.libraries.assistant.soda.d.a.aa;
import com.google.common.base.at;
import com.google.common.f.ab;
import e.c.d;
import j$.time.Duration;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/speech/hotword/h.class */
public final class h implements d {
    public static at b(Optional optional) {
        return at.j((e) optional.orElse((Object) null));
    }

    public static Optional c(Context context, Optional optional, Optional optional2, p pVar, com.google.android.libraries.search.b.b bVar, e.a aVar, Optional optional3, Optional optional4, Optional optional5, j jVar, aa aaVar) {
        Optional of;
        if (optional.isEmpty()) {
            com.google.common.f.h e = g.a.e();
            e.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcherM");
            com.google.common.f.h hVar = e;
            hVar.ak(9168);
            hVar.p("Executor factory could not be instatntiated");
            of = Optional.empty();
        } else if (optional2.isEmpty()) {
            com.google.common.f.h e2 = g.a.e();
            e2.aj(com.google.common.f.a.e.a, "HotwordModelConfigFetcherM");
            com.google.common.f.h hVar2 = e2;
            hVar2.ak(9167);
            hVar2.p("File storage could not be instatntiated");
            of = Optional.empty();
        } else {
            Object obj = optional2.get();
            g gVar = (g) optional.get();
            com.google.android.libraries.mdi.download.h.c.b bVar2 = new com.google.android.libraries.mdi.download.h.c.b((com.google.android.libraries.storage.a.j) obj, gVar.a("embedded assets", gVar.c));
            com.google.android.libraries.mdi.download.h.f fVar = new com.google.android.libraries.mdi.download.h.f();
            fVar.f3274a = context;
            g gVar2 = (g) optional.get();
            fVar.b = gVar2.a("embedded asset", gVar2.b);
            fVar.j = "apa_hotword_model_config";
            fVar.k = "default";
            fVar.i = bVar2;
            optional3.isPresent();
            optional4.isPresent();
            optional5.isPresent();
            ab abVar = com.google.common.f.a.e.a;
            f fVar2 = new f(optional5);
            fVar.d = at.k(optional3.get());
            fVar.e = at.k(optional4.get());
            fVar.f = at.k(fVar2);
            Object obj2 = optional.get();
            optional2.get();
            com.google.android.libraries.mdi.download.h.h a2 = fVar.a();
            Duration ofMinutes = Duration.ofMinutes(pVar.i(an.d));
            boolean w = pVar.w(an.b);
            of = Optional.of(new e((g) obj2, bVar, a2, aVar, ofMinutes, Boolean.valueOf(w), jVar, Duration.ofMillis(pVar.i(an.c)), aaVar));
        }
        return of;
    }

    public final /* synthetic */ Object a() {
        throw null;
    }
}
