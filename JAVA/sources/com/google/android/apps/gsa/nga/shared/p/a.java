package com.google.android.apps.gsa.nga.shared.p;

import android.content.Context;
import android.content.res.Configuration;
import com.google.common.a.m;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/p/a.class */
final class a extends m {

    /* renamed from: a */
    final Context f972a;

    public a(Context context) {
        this.f972a = context;
    }

    public final /* synthetic */ Object a(Object obj) {
        Context context = this.f972a;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale((Locale) obj);
        return context.createConfigurationContext(configuration);
    }
}
