package com.google.android.apps.gsa.nga.engine.ui.e.r.a;

import a.a;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.engine.ui.e.h.x;
import com.google.android.apps.gsa.nga.engine.ui.e.h.y;
import com.google.android.apps.gsa.nga.shared.ae.a.a.ay;
import com.google.android.apps.gsa.nga.shared.ae.a.a.b;
import com.google.android.apps.gsa.nga.shared.ae.a.a.co;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/nga/engine/ui/e/r/a/p.class */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.f.j f797a = com.google.common.f.j.i("com.google.android.apps.gsa.nga.engine.ui.e.r.a.p");
    public final com.google.android.apps.gsa.shared.logger.b.h b;
    public boolean c;
    private final com.google.android.libraries.gsa.h.h d;
    private final l e;
    private final y f;

    public p(com.google.android.apps.gsa.shared.logger.b.h hVar, y yVar, l lVar, com.google.android.libraries.gsa.h.h hVar2) {
        this.f = yVar;
        this.d = hVar2;
        this.e = lVar;
        this.b = hVar;
    }

    public final void a(b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "ambient_visual_search_gleams");
        bundle.putParcelable("bitmap", bVar.b);
        bundle.putParcelableArrayList("bounding_boxes", new ArrayList<>((Collection) bVar.c));
        bundle.putBoolean("should_show_gleam_tap_preview", bVar.d);
        c(bundle);
    }

    public final void b(ay ayVar) {
        if (Build.VERSION.SDK_INT <= 30) {
            return;
        }
        com.google.common.f.h d = f797a.d();
        d.ak(4864);
        d.s("setNavBarVisible: %s", ayVar);
        com.google.android.libraries.gsa.h.h hVar = this.d;
        l lVar = this.e;
        this.d.f(hVar.l(lVar.b.k(lVar.c.a(), "[NGA] SystemUiApiProvider.getSystemUiApi", new n(lVar, 1)), "[NGA] SystemUiHintTransportImpl.setGestureNavBarVisible", new n(ayVar, 0)), "[NGA] SystemUiHintTransportImpl.setGestureNavBarVisible systemUiApi", Throwable.class, new o());
    }

    public final void c(Bundle bundle) {
        if (!this.c) {
            com.google.common.f.h f = f797a.f();
            f.ak(4873);
            f.s("setUiHints failed. NGA inactive. key: %s", bundle.getString("action"));
            return;
        }
        x xVar = this.f.f763a;
        com.google.android.apps.gsa.nga.api.k kVar = xVar.f;
        if (kVar == null) {
            String string = bundle.getString("action", "");
            com.google.common.f.h e = x.f762a.e();
            e.ak(4751);
            e.s("Sending %s bundle on null callback", string);
            return;
        }
        try {
            kVar.a(bundle);
        } catch (RemoteException e2) {
            a.dB(x.f762a.e(), "Could not send bundle", (char) 4752, e2);
            xVar.a();
        }
    }

    public final void d(co coVar) {
        com.google.common.f.h d = f797a.d();
        d.ak(4884);
        d.p("setTtsStatusChange");
        Bundle bundle = new Bundle();
        bundle.putString("action", "tts_status_change");
        bundle.putString("tts_status", coVar.a.d);
        c(bundle);
    }
}
