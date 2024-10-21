package com.google.android.apps.gsa.assistant.shared;

import com.google.android.apps.gsa.shared.util.p;
import com.google.android.libraries.assistant.d.c.c.q;
import com.google.common.b.fg;
import com.google.common.b.fl;
import com.google.common.base.at;
import java.util.List;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/v.class */
public interface v {

    /* renamed from: a */
    @Deprecated
    public static final fl f283a;
    public static final fl b;

    static {
        fg fgVar = new fg(4);
        fgVar.i(p.f);
        fgVar.h("com.google.android.apps.chromecast.app");
        fgVar.i(p.c);
        fgVar.h("com.google.android.apps.messaging");
        fgVar.i(p.e);
        fgVar.i(p.g);
        fgVar.i(p.h);
        fgVar.h("com.google.android.music");
        f283a = fgVar.g();
        fg fgVar2 = new fg(4);
        fgVar2.i(p.f);
        fgVar2.i(p.c);
        fgVar2.h("com.google.android.libraries.assistant.appintegration.sample");
        b = fgVar2.g();
    }

    at a(q qVar);

    List b(String str);

    List c(String str);

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    boolean h(String str, byte[] bArr);

    boolean i(q qVar);

    boolean j();

    boolean k();
}
