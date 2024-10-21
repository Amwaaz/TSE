package com.google.android.apps.gsa.speech.hotword.b;

import com.google.android.apps.gsa.shared.speech.hotword.b.c;
import com.google.android.apps.gsa.shared.speech.hotword.e;
import com.google.android.libraries.search.ah.l;
import com.google.common.base.at;
import com.google.common.f.h;
import com.google.common.f.j;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/speech/hotword/b/b.class */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1594a = j.i("com.google.android.apps.gsa.speech.hotword.b.b");
    public final at b;

    public b(at atVar) {
        this.b = atVar;
    }

    public static c a(l lVar) {
        int ordinal = lVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? c.UNKNOWN : c.OK_HEY_GOOGLE : c.OK_GOOGLE;
    }

    public final void b() {
        if (this.b.h()) {
            ((e) this.b.c()).d();
            return;
        }
        h e = f1594a.e();
        e.ak(9964);
        e.p("ModelConfigFetcher absent!");
    }
}
