package com.google.android.apps.gsa.staticplugins.nga.u;

import com.google.ads.interactivemedia.v3.internal.aus;
import com.google.android.apps.gsa.nga.shared.q.c.dx;
import com.google.android.apps.gsa.nga.shared.q.c.dy;
import com.google.android.libraries.mdi.e;
import com.google.common.f.a.d;
import com.google.common.f.am;
import com.google.g.ac.a.a;
import java.io.IOException;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/nga/u/f.class */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final d f1720a = d.j();
    private final com.google.android.apps.gsa.nga.shared.q.a.x b;

    public f(com.google.android.apps.gsa.nga.shared.q.a.x xVar) {
        this.b = xVar;
    }

    static /* synthetic */ boolean c(Object obj) {
        d dVar = e.a;
        e eVar = ((a) obj).c;
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = e.f3293a;
        }
        com.google.android.libraries.mdi.d a2 = com.google.android.libraries.mdi.d.a(eVar2.g);
        com.google.android.libraries.mdi.d dVar2 = a2;
        if (a2 == null) {
            dVar2 = com.google.android.libraries.mdi.d.UNSPECIFIED;
        }
        return dVar2.equals(com.google.android.libraries.mdi.d.DOWNLOADED);
    }

    public final void a(int i, String str) {
        com.google.common.f.a.a e = f1720a.e();
        e.al(am.a);
        e.ak(15283);
        e.s("%s", str);
        dx d = dy.d();
        d.b(i);
        d.b = "";
        this.b.b(d.a());
    }

    public final void b(int i, Throwable th, String str) {
        String str2;
        aus.i(f1720a.e(), "%s", str, (char) 15284, th);
        dx d = dy.d();
        d.b(i);
        Class<?> cls = th.getClass();
        if (th instanceof IOException) {
            str2 = "java.io.IOException";
        } else if (th instanceof NullPointerException) {
            str2 = "java.lang.NullPointerException";
        } else if (th instanceof IllegalArgumentException) {
            str2 = "java.lang.IllegalArgumentException";
        } else if (th instanceof IllegalStateException) {
            str2 = "java.lang.IllegalStateException";
        } else {
            String name = cls.getName();
            str2 = name.startsWith("java.") ? "java.*" : name.startsWith("com.google.android.libraries.mdi.") ? "com.google.android.libraries.mdi.*" : name.startsWith("com.google.android.apps.gsa.") ? "com.google.android.apps.gsa.*" : name.startsWith("com.google.") ? "com.google.*" : name.startsWith("android.") ? "android.*" : "java.lang.Exception";
        }
        com.google.android.apps.gsa.nga.shared.q.a.x xVar = this.b;
        d.b = str2;
        xVar.b(d.a());
    }
}
