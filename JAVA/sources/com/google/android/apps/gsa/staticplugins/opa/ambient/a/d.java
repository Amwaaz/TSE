package com.google.android.apps.gsa.staticplugins.opa.ambient.a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.ac.w;
import com.google.android.apps.gsa.search.core.h.i;
import com.google.android.apps.gsa.search.core.h.p;
import com.google.android.apps.gsa.shared.k.bc;
import com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.l.g;
import com.google.apps.tiktok.tracing.ex;
import com.google.common.b.qj;
import com.google.common.f.a.e;
import com.google.common.f.ab;
import com.google.common.f.j;
import com.google.common.util.concurrent.ay;
import com.google.common.util.concurrent.cn;
import com.google.common.util.concurrent.dl;

/* loaded from: classes-dex2jar.jar:com/google/android/apps/gsa/staticplugins/opa/ambient/a/d.class */
public class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1736a = j.i("com.google.android.apps.gsa.staticplugins.opa.ambient.a.d");
    private final Context b;
    private final b c;
    private final g d;
    private final p e;

    public d(Context context, b bVar, g gVar, p pVar) {
        this.b = context;
        this.c = bVar;
        this.d = gVar;
        this.e = pVar;
    }

    public final void a() {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
        intent.setPackage(this.b.getPackageName());
        this.b.sendBroadcast(intent);
        ab abVar = e.a;
    }

    @Override // com.google.android.apps.gsa.search.core.ac.w
    public final void d(i iVar) {
        if (!this.e.w(bc.ae)) {
            ab abVar = e.a;
            return;
        }
        ab abVar2 = e.a;
        qj j = this.c.a().j();
        while (j.hasNext()) {
            if (iVar.a(((Integer) j.next()).intValue())) {
                cn a2 = this.d.a();
                c cVar = new c(this);
                dl.y(a2, ex.h(cVar), ay.a);
                return;
            }
        }
    }
}
