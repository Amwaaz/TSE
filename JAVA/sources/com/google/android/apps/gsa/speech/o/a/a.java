package com.google.android.apps.gsa.speech.o.a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assist.a.k;
import com.google.android.libraries.assistant.speakerid.l;
import com.google.common.f.a.e;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/o/a/a.class */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final j f1610a = j.i("com.google.android.apps.gsa.speech.o.a.a");
    private final Context b;
    private final k c;

    public a(Context context, k kVar) {
        this.b = context;
        this.c = kVar;
    }

    @Override // com.google.android.libraries.assistant.speakerid.l
    public final void a() {
        if (!this.c.a()) {
            h d = f1610a.d();
            d.aj(e.a, "BistoTdsidUpdateLstnr");
            h hVar = d;
            hVar.ak(10185);
            hVar.p("Google is not the active assistant.");
            return;
        }
        h d2 = f1610a.d();
        d2.aj(e.a, "BistoTdsidUpdateLstnr");
        h hVar2 = d2;
        hVar2.ak(10186);
        hVar2.p("Sending Speaker ID model update intent.");
        Intent intent = new Intent("com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        this.b.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
    }
}
