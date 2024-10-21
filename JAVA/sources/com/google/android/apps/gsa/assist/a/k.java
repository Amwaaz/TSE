package com.google.android.apps.gsa.assist.a;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.service.voice.VoiceInteractionService;
import com.google.android.apps.gsa.shared.k.cf;
import com.google.common.base.cl;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assist/a/k.class */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f236a;
    public final ComponentName b;
    private final a c;

    public k(Context context, ComponentName componentName, a aVar) {
        this.f236a = context;
        this.b = componentName;
        this.c = aVar;
    }

    public static boolean b(Context context, ComponentName componentName, com.google.android.apps.gsa.shared.util.q.a aVar) {
        boolean z;
        if (!aVar.i(cf.f1424a)) {
            return VoiceInteractionService.isActiveService(context, componentName);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "assistant");
        if (string == null) {
            z = VoiceInteractionService.isActiveService(context, componentName);
        } else {
            ComponentName unflattenFromString = ComponentName.unflattenFromString(string);
            if (unflattenFromString != null) {
                return cl.V("com.google.android.googlequicksearchbox", unflattenFromString.getPackageName());
            }
            z = false;
        }
        return z;
    }

    public final boolean a() {
        return b(this.f236a, this.b, (com.google.android.apps.gsa.shared.util.q.a) this.c.a());
    }
}
