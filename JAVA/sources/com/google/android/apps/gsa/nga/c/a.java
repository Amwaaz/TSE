package com.google.android.apps.gsa.nga.c;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.j.b.n;
import com.google.apps.tiktok.i.x;
import com.google.common.base.at;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/c/a.class */
public final class a {

    /* renamed from: com.google.android.apps.gsa.nga.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/c/a$a.class */
    public interface InterfaceC0001a {
        at nA();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.common.base.ca, java.lang.Object] */
    public static Object a(Context context) {
        at nA = ((InterfaceC0001a) x.c(context, InterfaceC0001a.class)).nA();
        if (nA.h()) {
            return ((Optional) ((n) nA.c()).f963a.a()).orElse((Object) null);
        }
        return null;
    }
}
