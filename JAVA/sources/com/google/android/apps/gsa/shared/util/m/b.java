package com.google.android.apps.gsa.shared.util.m;

import android.content.Context;
import com.google.common.f.j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/shared/util/m/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1565a = j.i("com.google.android.apps.gsa.shared.util.m.b");
    public final Object b = new Object();
    public final Set c = Collections.newSetFromMap(new WeakHashMap());
    public final boolean d;

    public b(Context context, boolean z) {
        this.d = z;
        context.registerComponentCallbacks(new a(this));
    }

    public final void a(c cVar) {
        synchronized (this.b) {
            this.c.add(cVar);
        }
    }
}
