package com.google.android.apps.gsa.search.core.ac;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.util.debug.b.d;
import k.a.a;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/search/core/ac/af.class */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1050a;

    public af(SharedPreferences.Editor editor) {
        this.f1050a = editor;
    }

    public af(a aVar) {
        aVar.getClass();
        this.f1050a = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k.a.a] */
    public final ae a() {
        Context context = (Context) this.f1050a.a();
        context.getClass();
        return new ae(context);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void b() {
        com.google.android.apps.gsa.shared.o.a.a aVar = d.f1553a;
        this.f1050a.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void c(String str, boolean z) {
        this.f1050a.putBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void d(String str, long j) {
        this.f1050a.putLong(str, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void e(String str, String str2) {
        this.f1050a.putString(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void f(String str) {
        this.f1050a.remove(str);
    }
}
