package com.google.android.apps.gsa.search.core.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.ab;
import com.google.android.apps.gsa.sidekick.a.c.c;
import com.google.common.f.j;
import e.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/service/ak.class */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1152a = j.i("com.google.android.apps.gsa.search.core.service.ak");
    public final Context b;
    public final a c;
    public final ab d;
    public final SharedPreferences e;
    public final com.google.android.apps.gsa.shared.util.keepalive.d f;
    public final c g;
    public final com.google.android.apps.gsa.speech.k.a h;

    public ak(com.google.android.apps.gsa.shared.util.keepalive.d dVar, Context context, a aVar, SharedPreferences sharedPreferences, ab abVar, com.google.android.apps.gsa.speech.k.a aVar2, c cVar) {
        this.f = dVar;
        this.b = context;
        this.g = cVar;
        this.c = aVar;
        this.e = sharedPreferences;
        this.d = abVar;
        this.h = aVar2;
    }

    public final PendingIntent a(Intent intent) {
        return PendingIntent.getActivity(this.b, 0, intent, 335544320);
    }
}
