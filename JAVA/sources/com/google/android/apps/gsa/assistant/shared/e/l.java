package com.google.android.apps.gsa.assistant.shared.e;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.c.ae;
import com.google.android.libraries.gsa.h.h;
import com.google.common.base.bu;
import com.google.common.base.ca;
import com.google.common.base.cl;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import j$.util.Optional;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/assistant/shared/e/l.class */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f270a = j.i("com.google.android.apps.gsa.assistant.shared.e.l");
    final e.a b;
    public final Context c;
    final e.a d;
    public Class e;
    public Object f;
    public String g;
    public final e.a j;
    public final h k;
    final h l;
    final NotificationManager m;
    public com.google.android.voiceinteraction.f o;
    private final ca p;
    public boolean h = false;
    public boolean i = false;
    private int q = 1;
    public BroadcastReceiver n = null;

    public l(e.a aVar, final Context context, e.a aVar2, e.a aVar3, h hVar, h hVar2, NotificationManager notificationManager) {
        this.b = aVar;
        this.c = context;
        this.d = aVar2;
        this.j = aVar3;
        this.k = hVar;
        this.l = hVar2;
        this.m = notificationManager;
        this.p = cl.d(new ca(context) { // from class: com.google.android.apps.gsa.assistant.shared.e.d

            /* renamed from: a, reason: collision with root package name */
            public final Context f267a;

            {
                this.f267a = context;
            }

            public final Object a() {
                return Optional.ofNullable((KeyguardManager) this.f267a.getSystemService("keyguard"));
            }
        });
    }

    private final void g(String str) {
        new ae(a(), this.k, "sendCallback").a(new h(this, str, 1)).a(new b(0));
    }

    public final cn a() {
        return this.l.h("ReloadPrefs", new com.google.android.libraries.gsa.h.g(this) { // from class: com.google.android.apps.gsa.assistant.shared.e.a

            /* renamed from: a, reason: collision with root package name */
            public final l f266a;

            {
                this.f266a = this;
            }

            @Override // com.google.android.libraries.gsa.h.g
            public final void run() {
                l lVar = this.f266a;
                ((com.google.android.apps.gsa.shared.util.q.a) lVar.b.a()).a();
                ((com.google.android.apps.gsa.shared.util.q.a) lVar.b.a()).j("GsaPrefs.AgsaOpaGrowth__enable_nudge_ui", false);
            }
        });
    }

    public final void b() {
        String a2 = ((com.google.android.apps.gsa.search.core.j.h) this.d.a()).a();
        if (a2 != null) {
            g(a2);
        }
    }

    public final boolean c(String str, String str2) {
        String g = ((com.google.android.apps.gsa.shared.util.q.a) this.b.a()).g(str2, "");
        return a.a.ch(bu.c(new com.google.common.base.l(',')).j(g), Integer.toString(com.google.android.apps.gsa.shared.util.h.a.a(str)));
    }

    public final boolean d() {
        return ((Boolean) ((Optional) this.p.a()).map(new c()).orElse(false)).booleanValue();
    }

    public final boolean e(String str) {
        String str2;
        return this.h && (str2 = this.g) != null && str2.equals(str);
    }

    final void f(int i) {
        String str = this.g;
        if (this.o == null || this.q == i) {
            return;
        }
        this.q = i;
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                b();
                return;
            } else {
                if (d()) {
                    g("com.google.android.phone.lockscreen");
                    return;
                }
                return;
            }
        }
        if ("com.google.android.phone.lockscreen".equals(str) && e("com.google.android.phone.lockscreen")) {
            com.google.android.voiceinteraction.f fVar = this.o;
            fVar.getClass();
            fVar.a(str);
            this.h = false;
            this.g = null;
        }
    }
}
