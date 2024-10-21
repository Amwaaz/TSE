package com.google.android.apps.gsa.nga.engine.recognition.m;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.engine.g.a.y;
import com.google.android.apps.gsa.shared.k.eu;
import com.google.common.b.fu;
import com.google.common.b.nn;
import com.google.common.f.a.d;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/recognition/m/a.class */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final d f658a = d.j();
    private final k.a.a b;
    private final k.a.a c;

    public a(k.a.a aVar, k.a.a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    public final Locale a() {
        fu fuVar;
        String languageTag = ((y) this.c.a()).c().d.toLanguageTag();
        try {
            fuVar = com.google.android.apps.gsa.shared.k.b.f1407a.a(((com.google.android.apps.gsa.shared.util.q.a) this.b.a()).h(eu.ju));
        } catch (IllegalArgumentException | NullPointerException e) {
            aus.f(f658a.e(), "Parse locale to download language pack failed for config flag", (char) 3930, e);
            fuVar = nn.a;
        }
        return Locale.forLanguageTag((String) fuVar.getOrDefault(languageTag, languageTag));
    }
}
