package com.google.android.apps.gsa.nga.shared.p;

import android.content.Context;
import com.google.common.a.j;
import com.google.common.a.o;
import com.google.common.base.cl;
import java.util.Locale;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/shared/p/b.class */
public final class b {

    /* renamed from: a */
    private final o f973a;

    public b(Context context) {
        j jVar = new j();
        jVar.g(5L);
        int i = jVar.e;
        cl.w(i == -1, "initial capacity was already set to %s", i);
        jVar.e = 1;
        this.f973a = jVar.b(new a(context));
    }

    public final Context a(Locale locale) {
        return (Context) this.f973a.a(locale);
    }

    public final c b(Locale locale, int i, Object... objArr) {
        return new c(a(locale).getString(i, objArr), locale);
    }

    public final String[] c(Locale locale, int i) {
        return a(locale).getResources().getStringArray(i);
    }
}
