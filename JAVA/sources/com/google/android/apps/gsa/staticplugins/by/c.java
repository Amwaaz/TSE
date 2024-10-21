package com.google.android.apps.gsa.staticplugins.by;

import android.content.Context;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.search.assistant.surfaces.voice.b.b.d;
import com.google.apps.tiktok.tracing.au;
import com.google.apps.tiktok.tracing.dj;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.f.j;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.cq;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/by/c.class */
public final class c implements com.google.android.apps.gsa.search.core.h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1640a = j.i("com.google.android.apps.gsa.staticplugins.by.c");
    public final Context b;
    private final cq c;
    private final dj d;
    private final com.google.android.apps.gsa.search.core.google.gaia.b.a.c e;

    /* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/by/c$a.class */
    public interface a {
        d aE();
    }

    public c(Context context, com.google.android.apps.gsa.search.core.google.gaia.b.a.c cVar, cq cqVar, dj djVar) {
        this.b = context;
        this.e = cVar;
        this.c = cqVar;
        this.d = djVar;
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final void a(p pVar, i iVar) {
        au e = this.d.e("TngMaFlagsUpdateListener.onFlagsUpdated");
        try {
            cn b = this.e.b();
            com.google.android.apps.gsa.staticplugins.by.a aVar = new com.google.android.apps.gsa.staticplugins.by.a(this, pVar);
            cn h = com.google.common.util.concurrent.i.h(b, ex.e(aVar), this.c);
            b bVar = new b();
            dl.y(h, ex.h(bVar), this.c);
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.gsa.search.core.h.c
    public final /* synthetic */ void iW(p pVar) {
    }
}
